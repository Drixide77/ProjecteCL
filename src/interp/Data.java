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

/**
 * Class to represent data in the interpreter.
 * Each data item has a type and a value. The type can be integer
 * or Boolean. Each operation asserts that the operands have the
 * appropriate types.
 * All the arithmetic and Boolean operations are calculated in-place,
 * i.e., the result is stored in the same data.
 * The type VOID is used to represent void values on function returns.
 */

import parser.*;
import java.util.ArrayList;

public class Data {
    /** Types of data */
    public enum Type {VOID, BOOLEAN, INTEGER, STRING, FLOAT;}

    /** Type of data*/
    private Type type;

    /** Value of the data */
    private int value;

    private String svalue;
    
    private float fvalue;

    /** Constructor for integers */
    Data(int v) { type = Type.INTEGER; value = v; }

    /** Constructor for Booleans */
    Data(boolean b) { type = Type.BOOLEAN; value = b ? 1 : 0; }

    Data(String s) { type = Type.STRING; svalue = s; }
    
    Data(float f) { type = Type.FLOAT; fvalue = f; }

    /** Constructor for void data */
    Data() {type = Type.VOID; }

    /** Copy constructor */
    Data(Data d) { type = d.type; value = d.value; svalue = d.svalue; fvalue = d.fvalue; }

    /** Returns the type of data */
    public Type getType() { return type; }

    /** Indicates whether the data is Boolean */
    public boolean isBoolean() { return type == Type.BOOLEAN; }

    /** Indicates whether the data is integer */
    public boolean isInteger() { return type == Type.INTEGER; }

    public boolean isString() { return type == Type.STRING; }
    
    public boolean isFloat() { return type == Type.FLOAT; }

    /** Indicates whether the data is void */
    public boolean isVoid() { return type == Type.VOID; }

    /**
     * Gets the value of an integer data. The method asserts that
     * the data is an integer.
     */
    public int getIntegerValue() {
        assert type == Type.INTEGER;
        return value;
    }

    /**
     * Gets the value of a Boolean data. The method asserts that
     * the data is a Boolean.
     */
    public boolean getBooleanValue() {
        assert type == Type.BOOLEAN;
        return value == 1;
    }

    public String getStringValue() {
        assert type == Type.STRING;
        return svalue;
    }
    
    public float getFloatValue() {
        assert type == Type.FLOAT;
        return fvalue;
    }


    /** Defines a Boolean value for the data */
    public void setValue(boolean b) { type = Type.BOOLEAN; value = b ? 1 : 0; }

    /** Defines an integer value for the data */
    public void setValue(int v) { type = Type.INTEGER; value = v; }

    public void setValue(String s) { type = Type.STRING; svalue = s; }
    
    public void setValue(float f) { type = Type.FLOAT; fvalue = f; }

    /** Copies the value from another data */
    public void setData(Data d) { type = d.type; value = d.value; svalue = d.svalue; fvalue = d.fvalue; }
    
    /** Returns a string representing the data in textual form. */
    public String toString() {
        if (type == Type.BOOLEAN) return value == 1 ? "true" : "false";
        else if (type == Type.STRING) return svalue;
        else if (type == Type.FLOAT) return Float.toString(fvalue);
        return Integer.toString(value);
    }
    
    /**
     * Checks for zero (for division). It raises an exception in case
     * the value is zero.
     */
    private void checkDivZero(Data d) {
        if (d.type == Type.INTEGER) {
        	if (d.value == 0) throw new RuntimeException ("Division by zero");
        } else {
        	if (d.fvalue == 0.0) throw new RuntimeException ("Division by zero");
        }
    }

    /**
     * Evaluation of arithmetic expressions. The evaluation is done
     * "in place", returning the result on the same data.
     * @param op Type of operator (token).
     * @param d Second operand.
     */
     
    public void evaluateArithmetic (int op, Data d) {
          assert type == d.type;
          if (type == Type.FLOAT) {
          	switch (op) {
          		case RobotLexer.PLUS: fvalue += d.fvalue; break;
		        	case RobotLexer.MINUS: fvalue -= d.fvalue; break;
		        	case RobotLexer.MUL: fvalue *= d.fvalue; break;
		        	case RobotLexer.DIV: checkDivZero(d); fvalue /= d.fvalue; break;
		        	default: assert false;
		        }
          } else if (type == Type.INTEGER) {
		        switch (op) {
		            case RobotLexer.PLUS: value += d.value; break;
		            case RobotLexer.MINUS: value -= d.value; break;
		            case RobotLexer.MUL: value *= d.value; break;
		            case RobotLexer.DIV: checkDivZero(d); value /= d.value; break;
		            case RobotLexer.MOD: checkDivZero(d); value %= d.value; break;
		            default: assert false;
		        }
          } else assert false;

    }

    /**
     * Evaluation of expressions with relational operators.
     * @param op Type of operator (token).
     * @param d Second operand.
     * @return A Boolean data with the value of the expression.
     */
    public Data evaluateRelational (int op, Data d) {
        assert type != Type.VOID && type == d.type;
        if (type == Type.STRING) {
        	switch (op) {
		          case RobotLexer.EQUAL: return new Data(svalue.equals(d.svalue));
		          case RobotLexer.NOT_EQUAL: return new Data(!svalue.equals(d.svalue));
		          default: assert false; 
		      }
        } else if (type == Type.FLOAT) {
        	switch (op) {
		          case RobotLexer.EQUAL: return new Data(fvalue == d.fvalue);
		          case RobotLexer.NOT_EQUAL: return new Data(fvalue != d.fvalue);
		          case RobotLexer.LT: return new Data(fvalue < d.fvalue);
		          case RobotLexer.LE: return new Data(fvalue <= d.fvalue);
		          case RobotLexer.GT: return new Data(fvalue > d.fvalue);
		          case RobotLexer.GE: return new Data(fvalue >= d.fvalue);
		          default: assert false; 
		      }
        } else {
		      switch (op) {
		          case RobotLexer.EQUAL: return new Data(value == d.value);
		          case RobotLexer.NOT_EQUAL: return new Data(value != d.value);
		          case RobotLexer.LT: return new Data(value < d.value);
		          case RobotLexer.LE: return new Data(value <= d.value);
		          case RobotLexer.GT: return new Data(value > d.value);
		          case RobotLexer.GE: return new Data(value >= d.value);
		          default: assert false; 
		      }
		    }
        return null;
    }
}
