/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package interp;

import parser.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
import java.lang.InterruptedException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/** Class that implements the interpreter of the language. */

public class Interp {

    /** Memory of the virtual machine. */
    private Stack Stack;

    /**
     * Map between function names (keys) and ASTs (values).
     * Each entry of the map stores the root of the AST
     * correponding to the function.
     */
    private HashMap<String,AslTree> FuncName2Tree;

    /** Standard input of the interpreter (System.in). */
    private Scanner stdin;

    /**
     * Stores the line number of the current statement.
     * The line number is used to report runtime errors.
     */
    private int linenumber = -1;

    /** File to write the trace of function calls. */
    private PrintWriter trace = null;

    /** Nested levels of function calls. */
    private int function_nesting = -1;
    
    
    //Execution variables
    private boolean nodisplay = false;
    
    private boolean txttrace = false;
    
    //Simulation variables
    private boolean positioned = false;

    private float rX = -1.0f;

		private float rY = -1.0f;
		
		private float rRot = 0.0f;

		private boolean rTrail = false;
		
		private ArrayList<Obstacle> obsList = new ArrayList<Obstacle>();
		
		//Constants
		private static final float ENV_SIZE = 50.0f;
		
		private static final float R_SIZE = 1.0f;
		
		private static final float C_MARGIN = 0.01f;
		
		private static final float SPEED = 0.00001f;
		
		private static final float SENSOR_R = 1.1f;
		
		//Graphic Display
		private JFrame frame;
		
		private Display display;

    
    /**
     * Constructor of the interpreter. It prepares the main
     * data structures for the execution of the main program.
     */
    public Interp(AslTree T, String tracefile) {
        assert T != null;
        MapFunctions(T);  // Creates the table to map function names into AST nodes
        PreProcessAST(T); // Some internal pre-processing ot the AST
        Stack = new Stack(); // Creates the memory of the virtual machine
        // Initializes the standard input of the program
        stdin = new Scanner (new BufferedReader(new InputStreamReader(System.in)));
        if (tracefile != null) {
            try {
                trace = new PrintWriter(new FileWriter(tracefile));
            } catch (IOException e) {
                System.err.println(e);
                System.exit(1);
            }
        }
        function_nesting = -1;
    }

    /** Runs the program by calling the main function without parameters. */
    public void Run(boolean nd, boolean tt) {
    		nodisplay = nd;
    		txttrace = tt;
    		
    		if (!nodisplay) {
    			frame = new JFrame("Simulation");
					display = new Display();
					frame.add(display);
					frame.setSize(520, 550);
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		}

        executeFunction ("main", null); 
    }

    /** Returns the contents of the stack trace */
    public String getStackTrace() {
        return Stack.getStackTrace(lineNumber());
    }

    /** Returns a summarized contents of the stack trace */
    public String getStackTrace(int nitems) {
        return Stack.getStackTrace(lineNumber(), nitems);
    }
    
    /**
     * Gathers information from the AST and creates the map from
     * function names to the corresponding AST nodes.
     */
    private void MapFunctions(AslTree T) {
        assert T != null && T.getType() == RobotLexer.LIST_FUNCTIONS;
        FuncName2Tree = new HashMap<String,AslTree> ();
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) {
            AslTree f = T.getChild(i);
            assert f.getType() == RobotLexer.FUNC;
            String fname = f.getChild(0).getText();
            if (FuncName2Tree.containsKey(fname)) {
                throw new RuntimeException("Multiple definitions of function " + fname);
            }
            FuncName2Tree.put(fname, f);
        } 
    }

    /**
     * Performs some pre-processing on the AST. Basically, it
     * calculates the value of the literals and stores a simpler
     * representation. See AslTree.java for details.
     */
    private void PreProcessAST(AslTree T) {
        if (T == null) return;
        switch(T.getType()) {
            case RobotLexer.INT: T.setIntValue(); break;
            case RobotLexer.FLOAT: T.setFloatValue(); break;
            case RobotLexer.STRING: T.setStringValue(); break;
            case RobotLexer.BOOLEAN: T.setBooleanValue(); break;
            default: break;
        }
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) PreProcessAST(T.getChild(i));
    }

    /**
     * Gets the current line number. In case of a runtime error,
     * it returns the line number of the statement causing the
     * error.
     */
    public int lineNumber() { return linenumber; }

    /** Defines the current line number associated to an AST node. */
    private void setLineNumber(AslTree t) { linenumber = t.getLine();}

    /** Defines the current line number with a specific value */
    private void setLineNumber(int l) { linenumber = l;}
    
    //Checks if an AslTree node is of type int
    private void checkFloat(Data t) {
    	if (t.isFloat());
    	else throw new RuntimeException("incorrect argument type");
    }
    
    //Checks if a position is in the simulation bounds
    private boolean checkValidPos() {
    	boolean valid = true;
    	if ((rX - R_SIZE - C_MARGIN) < 0.0f) valid = false;
    	if ((rX + R_SIZE + C_MARGIN) > ENV_SIZE) valid = false;
    	if ((rY - R_SIZE - C_MARGIN) < 0.0f) valid = false;
    	if ((rY + R_SIZE + C_MARGIN) > ENV_SIZE) valid = false;
    	return valid;
    }
    
    //Checks for intersection between the robot and the given obstacle
    private boolean intersects(Obstacle obs)
		{
				float cdx = (float)Math.abs((double)rX - (double)obs.X);
				float cdy = (float)Math.abs((double)rY - (double)obs.Y);

				if (cdx > (obs.sizeX/2.0f + R_SIZE)) { return false; }
				if (cdy > (obs.sizeY/2.0f + R_SIZE)) { return false; }

				if (cdx <= (obs.sizeX/2.0f)) { return true; } 
				if (cdy <= (obs.sizeY/2.0f)) { return true; }

				float cdsq = (float)Math.pow((cdx - obs.sizeX/2.0f),2.0) +
				                     (float)Math.pow((cdy - obs.sizeY/2.0f),2.0);

				return (cdsq <= (float)Math.pow(R_SIZE,2.0));
		}
    
    //Checks for intersection between the robot and all the obstacles
    private boolean checkColision() {
    	for (Obstacle curr : obsList) {
				if (intersects(curr)) return true;
			}
			return false;
    }
    
    //Moves the robot for the given distance or until it collides with
    //an obstacle or the simulation bounds
    private void moveRobot(float dist) {
   		float oX, oY;
   		oX = rX; oY = rY;
   		if (dist < 0.0f) {
   			while (dist < 0.0f && !checkColision() && checkValidPos()) {
   				oX = rX;
		 			oY = rY;
	 				rX -= SPEED * Math.cos(Math.toRadians((double)rRot));
					rY -= SPEED * Math.sin(Math.toRadians((double)rRot));
					dist += SPEED;
	 			}
   		} else {
   			while (dist > 0.0f && !checkColision() && checkValidPos()) {
   				oX = rX;
		 			oY = rY;
	 				rX += SPEED * Math.cos(Math.toRadians((double)rRot));
					rY += SPEED * Math.sin(Math.toRadians((double)rRot));
					dist -= SPEED;
	 			}
   		}
   		
   		rX = oX;
   		rY = oY;
    }
    
    /**
     * Executes a function.
     * @param funcname The name of the function.
     * @param args The AST node representing the list of arguments of the caller.
     * @return The data returned by the function.
     */
    private Data executeFunction (String funcname, AslTree args) {
        //----------------------------------------------------------
        if (funcname.equals("rSet")) 
        {
		      	if (args.getChildCount() != 3) throw new RuntimeException("incorrect number of arguments");
		      	AslTree n;
		      	Data value;
		      	n = args.getChild(0);
		      	value = evaluateExpression(n);
		      	checkFloat(value);
		      	float newX = value.getFloatValue();
		      	
		      	n = args.getChild(1);
		      	value = evaluateExpression(n);
		      	checkFloat(value);
		      	float newY = value.getFloatValue();
		      	
		      	n = args.getChild(2);
		      	value = evaluateExpression(n);
		      	checkFloat(value);
		      	float newRot = value.getFloatValue();
		      	
		      	rX = newX; rY = newY; rRot = newRot;
		      	rRot = rRot % 360.0f;
		      	
		      	if (!checkValidPos()) throw new RuntimeException("Position out of bounds");
		      	
		      	positioned = true;
		      	
		      	if (txttrace) {
		      	
    					if (!positioned) {
				    		System.out.println("Robot positioned:");
				    		
				    	}
				    	else System.out.println("Robot repositioned:");
				    	System.out.println("X: "+rX+", Y: "+rY+", Rotation(Deg): "+rRot);
				    	
    				}
    				if(!nodisplay) {
    					display.updatePos(rX,rY,rRot);
    					display.setPositioned(true);
    				}
		      	
		      	Data result = new Data();
		      	return result;
        }
        //----------------------------------------------------------
        else if (funcname.equals("rMove")) 
        {
        		if (!positioned) throw new RuntimeException("robot is not positioned yet");
        		if (args.getChildCount() != 1) throw new RuntimeException("incorrect number of arguments");
		      	AslTree n;
		      	Data value;
		      	
		      	n = args.getChild(0);
		      	value = evaluateExpression(n);
		      	checkFloat(value);
		      	float dist = value.getFloatValue();
		      			      	
		      	moveRobot(dist);
		      	
		      	if (txttrace) {
				    	System.out.println("Robot moved:");
				    	System.out.println("X: "+rX+", Y: "+rY);
				    }
				    if (!nodisplay) {
				    	display.updatePos(rX,rY,rRot);
				    }
		      	
		      	Data result = new Data();
		      	return result;
        }
        //----------------------------------------------------------
        else if (funcname.equals("rTurn")) 
        {
        		if (!positioned) throw new RuntimeException("robot is not positioned yet");
        		if (args.getChildCount() != 1) throw new RuntimeException("incorrect number of arguments");
		      	AslTree n;
		      	Data value;
		      	
		      	n = args.getChild(0);
		      	value = evaluateExpression(n);
		      	checkFloat(value);
		      	float rot = value.getFloatValue();
		      	
		      	rRot += rot;
		      	rRot = rRot % 360.0f;
		      	
		      	if (txttrace) {
		      	System.out.println("Robot rotated:");
		      	System.out.println("Rotation(Deg): "+rRot);
		      	}
		      	if(!nodisplay) {
    					display.updatePos(rX,rY,rRot);
    				}
		      	
		      	Data result = new Data();
		      	return result;
        }
        //----------------------------------------------------------
        else if (funcname.equals("oSet")) 
        {
        		if (args.getChildCount() != 4) throw new RuntimeException("incorrect number of arguments");
		      	AslTree n;
		      	Data value;
		      	
		      	n = args.getChild(0);
		      	value = evaluateExpression(n);
		      	checkFloat(value);
		      	float x = value.getFloatValue();
		      	
		      	n = args.getChild(1);
		      	value = evaluateExpression(n);
		      	checkFloat(value);
		      	float y = value.getFloatValue();
		      	
		      	n = args.getChild(2);
		      	value = evaluateExpression(n);
		      	checkFloat(value);
		      	float sx = value.getFloatValue();
		      	
		      	n = args.getChild(3);
		      	value = evaluateExpression(n);
		      	checkFloat(value);
		      	float sy = value.getFloatValue();
		      	
		      	Obstacle obs = new Obstacle();
		      	obs.X = x;
		      	obs.Y = y;
		      	obs.sizeX = sx;
		      	obs.sizeY = sy;
		      	
		      	if (intersects(obs)) throw new RuntimeException("obstacle overlaps with robot");
		      	
		      	boolean valid = true;
		      	if ((x - sx/2.0) < 0.0f) valid = false;
    				if ((x + sx/2.0) > ENV_SIZE) valid = false;
    				if ((y - sy/2.0) < 0.0f) valid = false;
    				if ((y + sy/2.0) > ENV_SIZE) valid = false;
    				if (!valid) throw new RuntimeException("obstacle out of bounds");
    						      	
		      	obsList.add(obs);
		      	
		      	if (txttrace) {
		      		System.out.println("Obstacle set:");
		      		System.out.println("X: "+x+", Y: "+y+", H. size: "+sx+", V. size: "+sy);
		      	}
		      	if (!nodisplay) {
		      		display.addObs(obs);
		      	}
		      	Data result = new Data();
		      	return result;
        }
        //----------------------------------------------------------
        else if (funcname.equals("rTrail")) 
        {
        		if (args.getChildCount() != 1) throw new RuntimeException("incorrect number of arguments");
		      	AslTree n;
		      	Data value;

		      	n = args.getChild(0);
		      	value = evaluateExpression(n);
		      	checkBoolean(value);
		      	boolean activate = value.getBooleanValue();
		      	
		      	rTrail = activate;
		      	
		      	if (txttrace) {
		      		if (activate) System.out.println("Trailing enabled.");
		      		else System.out.println("Trailing disabled.");
		      	}
		      	if (!nodisplay) {
		      		display.setTrail(activate);
		      	}
		      	
		      	Data result = new Data();
		      	return result;
        }
        //----------------------------------------------------------
        else if (funcname.equals("rFeel"))
        {
        		if (!positioned) throw new RuntimeException("robot is not positioned yet");
        		if (args.getChildCount() != 1) throw new RuntimeException("incorrect number of arguments");
		      	AslTree n;
		      	Data value;
		      	
		      	n = args.getChild(0);
		      	value = evaluateExpression(n);
		      	checkInteger(value);
		      	int sensor = value.getIntegerValue();
		      	
		      	if (sensor < 0 || sensor > 7) throw new RuntimeException("incorrect sensor number");
		      	
		      	float orX, orY, orRot;
		      	orX = rX; orY = rY; orRot = rRot;
		      	
		      	switch (sensor) {
		      		case 0: rRot = rRot; break;
		      		case 1: rRot = rRot + 45.0f; break;
		      		case 2: rRot = rRot + 90.0f; break;
		      		case 3: rRot = rRot + 135.0f; break;
		      		case 4: rRot = rRot + 180.0f; break;
		      		case 5: rRot = rRot + 225.0f; break;
		      		case 6: rRot = rRot + 270.0f; break;
		      		case 7: rRot = rRot + 315.0f; break;
		      	}
		      		
		      	rX += SENSOR_R * Math.cos(Math.toRadians((double)rRot));
						rY += SENSOR_R * Math.sin(Math.toRadians((double)rRot));
		      	
		      	boolean sense;
		      	if (!checkColision() && checkValidPos()) sense = false;
		      	else sense = true;
		      	
		      	rX = orX; rY = orY; rRot = orRot;
		      	
		      	Data result = new Data(sense);
		      	return result;
        }
        //----------------------------------------------------------
        else if (funcname.equals("rXPosition")) {
        		if (!positioned) throw new RuntimeException("robot is not positioned yet");
        		if (args.getChildCount() != 0) throw new RuntimeException("incorrect number of arguments");
        		
        		Data result = new Data(rX);
		      	return result;
        }
        //----------------------------------------------------------
        else if (funcname.equals("rYPosition")) {
        		if (!positioned) throw new RuntimeException("robot is not positioned yet");
        		if (args.getChildCount() != 0) throw new RuntimeException("incorrect number of arguments");
        		
        		Data result = new Data(rY);
		      	return result;
        }
        //----------------------------------------------------------
        else if (funcname.equals("rRotation")) {
        		if (!positioned) throw new RuntimeException("robot is not positioned yet");
        		if (args.getChildCount() != 0) throw new RuntimeException("incorrect number of arguments");
        		
        		Data result = new Data(rRot);
		      	return result;
        }
        //----------------------------------------------------------
        
        
        // Get the AST of the function
        AslTree f = FuncName2Tree.get(funcname);
        
        if (f == null) throw new RuntimeException(" function " + funcname + " not declared");

        // Gather the list of arguments of the caller. This function
        // performs all the checks required for the compatibility of
        // parameters.
        ArrayList<Data> Arg_values = listArguments(f, args);

        // Dumps trace information (function call and arguments)
        if (trace != null) traceFunctionCall(f, Arg_values);
        
        // List of parameters of the callee
        AslTree p = f.getChild(1);
        int nparam = p.getChildCount(); // Number of parameters

        // Create the activation record in memory
        Stack.pushActivationRecord(funcname, lineNumber());

        // Track line number
        setLineNumber(f);
         
        // Copy the parameters to the current activation record
        for (int i = 0; i < nparam; ++i) {
            String param_name = p.getChild(i).getText();
            Stack.defineVariable(param_name, Arg_values.get(i));
        }

        // Execute the instructions
        Data result = executeListInstructions (f.getChild(2));

        // If the result is null, then the function returns void
        if (result == null) result = new Data();
        
        // Dumps trace information
        if (trace != null) traceReturn(f, result, Arg_values);
        
        // Destroy the activation record
        Stack.popActivationRecord();

        return result;
    }

    /**
     * Executes a block of instructions. The block is terminated
     * as soon as an instruction returns a non-null result.
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the block of instructions.
     * @return The data returned by the instructions (null if no return
     * statement has been executed).
     */
    private Data executeListInstructions (AslTree t) {
        assert t != null;
        Data result = null;
        int ninstr = t.getChildCount();
        for (int i = 0; i < ninstr; ++i) {
            result = executeInstruction (t.getChild(i));
            if (result != null) return result;
        }
        return null;
    }
    
    /**
     * Executes an instruction. 
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the instruction.
     * @return The data returned by the instruction. The data will be
     * non-null only if a return statement is executed or a block
     * of instructions executing a return.
     */
    private Data executeInstruction (AslTree t) {
        assert t != null;
        
        setLineNumber(t);
        Data value; // The returned value

        // A big switch for all type of instructions
        switch (t.getType()) {

            // Assignment
            case RobotLexer.ASSIGN:
                value = evaluateExpression(t.getChild(1));
                Stack.defineVariable (t.getChild(0).getText(), value);
                return null;

            // If-then-else
            case RobotLexer.IF:
                value = evaluateExpression(t.getChild(0));
                checkBoolean(value);
                if (value.getBooleanValue()) return executeListInstructions(t.getChild(1));
                // Is there else statement ?
                if (t.getChildCount() == 3) return executeListInstructions(t.getChild(2));
                return null;

            // While
            case RobotLexer.WHILE:
                while (true) {
                    value = evaluateExpression(t.getChild(0));
                    checkBoolean(value);
                    if (!value.getBooleanValue()) return null;
                    Data r = executeListInstructions(t.getChild(1));
                    if (r != null) return r;
                }

            // Return
            case RobotLexer.RETURN:
                if (t.getChildCount() != 0) {
                    return evaluateExpression(t.getChild(0));
                }
                return new Data(); // No expression: returns void data

            // Read statement: reads a variable and raises an exception
            // in case of a format error.
            case RobotLexer.READ:
                String token = null;
                Data val = new Data(0);
                try {
                    token = stdin.next();
                    val.setValue(Integer.parseInt(token)); 
                } catch (NumberFormatException ex) {
                		try {
                			val.setValue(Float.parseFloat(token));
                		} catch (NumberFormatException ex2) {
                			val.setValue(token);
                		}
                }
                Stack.defineVariable (t.getChild(0).getText(), val);
                return null;

            // Write statement: it can write an expression or a string.
            case RobotLexer.WRITE:
                AslTree v = t.getChild(0);
                // Special case for strings
                if (v.getType() == RobotLexer.STRING) {
                    System.out.format(v.getStringValue());
                    return null;
                }

                // Write an expression
                System.out.print(evaluateExpression(v).toString());
                return null;

            // Function call
            case RobotLexer.FUNCALL:
                executeFunction(t.getChild(0).getText(), t.getChild(1));
                return null;

            default: assert false; // Should never happen
        }

        // All possible instructions should have been treated.
        assert false;
        return null;
    }

    /**
     * Evaluates the expression represented in the AST t.
     * @param t The AST of the expression
     * @return The value of the expression.
     */
     
    private Data evaluateExpression(AslTree t) {
        assert t != null;

        int previous_line = lineNumber();
        setLineNumber(t);
        int type = t.getType();

        Data value = null;
        // Atoms
        switch (type) {
            // A variable
            case RobotLexer.ID:
                value = new Data(Stack.getVariable(t.getText()));
                break;
            // An integer literal
            case RobotLexer.INT:
                value = new Data(t.getIntValue());
                break;
            // A Boolean literal
            case RobotLexer.BOOLEAN:
                value = new Data(t.getBooleanValue());
                break;
            // A String literal
            case RobotLexer.STRING:
                value = new Data(t.getStringValue());
                break;
            // A Float literal
            case RobotLexer.FLOAT:
                value = new Data(t.getFloatValue());
                break;
            // A function call. Checks that the function returns a result.
            case RobotLexer.FUNCALL:
                value = executeFunction(t.getChild(0).getText(), t.getChild(1));
                assert value != null;
                if (value.isVoid()) {
                    throw new RuntimeException ("function expected to return a value");
                }
                break;
            default: break;
        }

        // Retrieve the original line and return
        if (value != null) {
            setLineNumber(previous_line);
            return value;
        }
        
        // Unary operators
        value = evaluateExpression(t.getChild(0));
        if (t.getChildCount() == 1) {
            switch (type) {
                case RobotLexer.PLUS:
                    checkNumeric(value);
                    break;
                case RobotLexer.MINUS:
                    checkNumeric(value);
                    if (value.isFloat()) value.setValue(-value.getFloatValue());
                    else value.setValue(-value.getIntegerValue());
                    break;
                case RobotLexer.NOT:
                    checkBoolean(value);
                    value.setValue(!value.getBooleanValue());
                    break;
                default: assert false; // Should never happen
            }
            setLineNumber(previous_line);
            return value;
        }

        // Two operands
        Data value2;
        switch (type) {
            // Relational operators
            case RobotLexer.EQUAL:
            case RobotLexer.NOT_EQUAL:
            case RobotLexer.LT:
            case RobotLexer.LE:
            case RobotLexer.GT:
            case RobotLexer.GE:
                value2 = evaluateExpression(t.getChild(1));
                if (value.getType() != value2.getType()) {
                  throw new RuntimeException ("Incompatible types in relational expression");
                }
                value = value.evaluateRelational(type, value2);
                break;

            // Arithmetic operators
            case RobotLexer.PLUS:
                value2 = evaluateExpression(t.getChild(1));
                if (value2.isInteger() || value2.isInteger()) { checkNumeric(value); checkNumeric(value2); }
                value.evaluateArithmetic(type, value2);
                break;
            case RobotLexer.MINUS:
            case RobotLexer.MUL:
            case RobotLexer.DIV:
            		value2 = evaluateExpression(t.getChild(1));
                checkNumeric(value); checkNumeric(value2);
                value.evaluateArithmetic(type, value2);
                break;
            case RobotLexer.MOD:
                value2 = evaluateExpression(t.getChild(1));
                checkInteger(value); checkInteger(value2);
                value.evaluateArithmetic(type, value2);
                break;

            // Boolean operators
            case RobotLexer.AND:
            case RobotLexer.OR:
                // The first operand is evaluated, but the second
                // is deferred (lazy, short-circuit evaluation).
                checkBoolean(value);
                value = evaluateBoolean(type, value, t.getChild(1));
                break;

            default: assert false; // Should never happen
        }
        
        setLineNumber(previous_line);
        return value;
    }
    
    /**
     * Evaluation of Boolean expressions. This function implements
     * a short-circuit evaluation. The second operand is still a tree
     * and is only evaluated if the value of the expression cannot be
     * determined by the first operand.
     * @param type Type of operator (token).
     * @param v First operand.
     * @param t AST node of the second operand.
     * @return An Boolean data with the value of the expression.
     */
    private Data evaluateBoolean (int type, Data v, AslTree t) {
        // Boolean evaluation with short-circuit

        switch (type) {
            case RobotLexer.AND:
                // Short circuit if v is false
                if (!v.getBooleanValue()) return v;
                break;
        
            case RobotLexer.OR:
                // Short circuit if v is true
                if (v.getBooleanValue()) return v;
                break;
                
            default: assert false;
        }

        // Return the value of the second expression
        v = evaluateExpression(t);
        checkBoolean(v);
        return v;
    }

    /** Checks that the data is Boolean and raises an exception if it is not. */
    private void checkBoolean (Data b) {
        if (!b.isBoolean()) {
            throw new RuntimeException ("Expecting Boolean expression");
        }
    }
    
    /** Checks that the data is integer and raises an exception if it is not. */
    private void checkInteger (Data b) {
        if (!b.isInteger()) {
            throw new RuntimeException ("Expecting integer number");
        }
    }
    
    private void checkNumeric (Data b) {
        if (!b.isInteger()) {
        		if (!b.isFloat()) {
        			throw new RuntimeException ("Expecting numerical expression");
        		} 
        }
    }

    /**
     * Gathers the list of arguments of a function call. It also checks
     * that the arguments are compatible with the parameters. In particular,
     * it checks that the number of parameters is the same and that no
     * expressions are passed as parametres by reference.
     * @param AstF The AST of the callee.
     * @param args The AST of the list of arguments passed by the caller.
     * @return The list of evaluated arguments.
     */
     
    private ArrayList<Data> listArguments (AslTree AstF, AslTree args) {
        if (args != null) setLineNumber(args);
        AslTree pars = AstF.getChild(1);   // Parameters of the function
        
        // Create the list of parameters
        ArrayList<Data> Params = new ArrayList<Data> ();
        int n = pars.getChildCount();

        // Check that the number of parameters is the same
        int nargs = (args == null) ? 0 : args.getChildCount();
        if (n != nargs) {
            throw new RuntimeException ("Incorrect number of parameters calling function " +
                                        AstF.getChild(0).getText());
        }

        // Checks the compatibility of the parameters passed by
        // reference and calculates the values and references of
        // the parameters.
        for (int i = 0; i < n; ++i) {
            AslTree p = pars.getChild(i); // Parameters of the callee
            AslTree a = args.getChild(i); // Arguments passed by the caller
            setLineNumber(a);
            if (p.getType() == RobotLexer.PVALUE) {
                // Pass by value: evaluate the expression
                Params.add(i,evaluateExpression(a));
            } else {
                // Pass by reference: check that it is a variable
                if (a.getType() != RobotLexer.ID) {
                    throw new RuntimeException("Wrong argument for pass by reference");
                }
                // Find the variable and pass the reference
                Data v = Stack.getVariable(a.getText());
                Params.add(i,v);
            }
        }
        return Params;
    }

    /**
     * Writes trace information of a function call in the trace file.
     * The information is the name of the function, the value of the
     * parameters and the line number where the function call is produced.
     * @param f AST of the function
     * @param arg_values Values of the parameters passed to the function
     */
    private void traceFunctionCall(AslTree f, ArrayList<Data> arg_values) {
        function_nesting++;
        AslTree params = f.getChild(1);
        int nargs = params.getChildCount();
        
        for (int i=0; i < function_nesting; ++i) trace.print("|   ");

        // Print function name and parameters
        trace.print(f.getChild(0) + "(");
        for (int i = 0; i < nargs; ++i) {
            if (i > 0) trace.print(", ");
            AslTree p = params.getChild(i);
            if (p.getType() == RobotLexer.PREF) trace.print("&");
            trace.print(p.getText() + "=" + arg_values.get(i));
        }
        trace.print(") ");
        
        if (function_nesting == 0) trace.println("<entry point>");
        else trace.println("<line " + lineNumber() + ">");
    }

    /**
     * Writes the trace information about the return of a function.
     * The information is the value of the returned value and of the
     * variables passed by reference. It also reports the line number
     * of the return.
     * @param f AST of the function
     * @param result The value of the result
     * @param arg_values The value of the parameters passed to the function
     */
    private void traceReturn(AslTree f, Data result, ArrayList<Data> arg_values) {
        for (int i=0; i < function_nesting; ++i) trace.print("|   ");
        function_nesting--;
        trace.print("return");
        if (!result.isVoid()) trace.print(" " + result);
        
        // Print the value of arguments passed by reference
        AslTree params = f.getChild(1);
        int nargs = params.getChildCount();
        for (int i = 0; i < nargs; ++i) {
            AslTree p = params.getChild(i);
            if (p.getType() == RobotLexer.PVALUE) continue;
            trace.print(", &" + p.getText() + "=" + arg_values.get(i));
        }
        
        trace.println(" <line " + lineNumber() + ">");
        if (function_nesting < 0) trace.close();
    }
}
