// $ANTLR 3.4 /home/adria/CL/Asl/src/parser/Asl.g 2015-05-29 18:18:44

package parser;
import interp.AslTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


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
@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "BOOLEAN", "COMMENT", "DIV", "DO", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PVALUE", "READ", "RETURN", "STRING", "THEN", "TRUE", "WHILE", "WRITE", "WS", "'&'", "'('", "')'", "','", "';'"
    };

    public static final int EOF=-1;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int BOOLEAN=7;
    public static final int COMMENT=8;
    public static final int DIV=9;
    public static final int DO=10;
    public static final int ELSE=11;
    public static final int ENDFUNC=12;
    public static final int ENDIF=13;
    public static final int ENDWHILE=14;
    public static final int EQUAL=15;
    public static final int ESC_SEQ=16;
    public static final int FALSE=17;
    public static final int FUNC=18;
    public static final int FUNCALL=19;
    public static final int GE=20;
    public static final int GT=21;
    public static final int ID=22;
    public static final int IF=23;
    public static final int INT=24;
    public static final int LE=25;
    public static final int LIST_FUNCTIONS=26;
    public static final int LIST_INSTR=27;
    public static final int LT=28;
    public static final int MINUS=29;
    public static final int MOD=30;
    public static final int MUL=31;
    public static final int NOT=32;
    public static final int NOT_EQUAL=33;
    public static final int OR=34;
    public static final int PARAMS=35;
    public static final int PLUS=36;
    public static final int PREF=37;
    public static final int PVALUE=38;
    public static final int READ=39;
    public static final int RETURN=40;
    public static final int STRING=41;
    public static final int THEN=42;
    public static final int TRUE=43;
    public static final int WHILE=44;
    public static final int WRITE=45;
    public static final int WS=46;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AslParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AslParser.tokenNames; }
    public String getGrammarFileName() { return "/home/adria/CL/Asl/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/adria/CL/Asl/src/parser/Asl.g:60:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
    public final AslParser.prog_return prog() throws RecognitionException {
        AslParser.prog_return retval = new AslParser.prog_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EOF2=null;
        AslParser.func_return func1 =null;


        AslTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_func=new RewriteRuleSubtreeStream(adaptor,"rule func");
        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:60:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/adria/CL/Asl/src/parser/Asl.g:60:8: ( func )+ EOF
            {
            // /home/adria/CL/Asl/src/parser/Asl.g:60:8: ( func )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/adria/CL/Asl/src/parser/Asl.g:60:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog163);
            	    func1=func();

            	    state._fsp--;

            	    stream_func.add(func1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog166);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: func
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 60:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/adria/CL/Asl/src/parser/Asl.g:60:21: ^( LIST_FUNCTIONS ( func )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_FUNCTIONS, "LIST_FUNCTIONS")
                , root_1);

                if ( !(stream_func.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_func.hasNext() ) {
                    adaptor.addChild(root_1, stream_func.nextTree());

                }
                stream_func.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class func_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // /home/adria/CL/Asl/src/parser/Asl.g:64:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FUNC3=null;
        Token ID4=null;
        Token ENDFUNC7=null;
        AslParser.params_return params5 =null;

        AslParser.block_instructions_return block_instructions6 =null;


        AslTree FUNC3_tree=null;
        AslTree ID4_tree=null;
        AslTree ENDFUNC7_tree=null;

        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:64:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home/adria/CL/Asl/src/parser/Asl.g:64:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func205); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func208); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func210);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func212);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func214); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func"


    public static class params_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home/adria/CL/Asl/src/parser/Asl.g:68:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:68:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/adria/CL/Asl/src/parser/Asl.g:68:10: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,48,FOLLOW_48_in_params233);  
            stream_48.add(char_literal8);


            // /home/adria/CL/Asl/src/parser/Asl.g:68:14: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==47) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:68:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params235);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,49,FOLLOW_49_in_params238);  
            stream_49.add(char_literal10);


            // AST REWRITE
            // elements: paramlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 68:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home/adria/CL/Asl/src/parser/Asl.g:68:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/adria/CL/Asl/src/parser/Asl.g:68:41: ( paramlist )?
                if ( stream_paramlist.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramlist.nextTree());

                }
                stream_paramlist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class paramlist_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramlist"
    // /home/adria/CL/Asl/src/parser/Asl.g:72:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:72:10: ( param ( ',' ! param )* )
            // /home/adria/CL/Asl/src/parser/Asl.g:72:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist264);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /home/adria/CL/Asl/src/parser/Asl.g:72:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==50) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/adria/CL/Asl/src/parser/Asl.g:72:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,50,FOLLOW_50_in_paramlist267); 

            	    pushFollow(FOLLOW_param_in_paramlist270);
            	    param13=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param13.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "paramlist"


    public static class param_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // /home/adria/CL/Asl/src/parser/Asl.g:77:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;

        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:77:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==47) ) {
                alt4=1;
            }
            else if ( (LA4_0==ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:77:13: '&' id= ID
                    {
                    char_literal14=(Token)match(input,47,FOLLOW_47_in_param295);  
                    stream_47.add(char_literal14);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param299);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 77:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/adria/CL/Asl/src/parser/Asl.g:77:26: ^( PREF[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PREF, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:78:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param322);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 78:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/adria/CL/Asl/src/parser/Asl.g:78:22: ^( PVALUE[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PVALUE, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param"


    public static class block_instructions_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions"
    // /home/adria/CL/Asl/src/parser/Asl.g:82:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal16=null;
        AslParser.instruction_return instruction15 =null;

        AslParser.instruction_return instruction17 =null;


        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:83:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/adria/CL/Asl/src/parser/Asl.g:83:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions356);
            instruction15=instruction();

            state._fsp--;

            stream_instruction.add(instruction15.getTree());

            // /home/adria/CL/Asl/src/parser/Asl.g:83:24: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==51) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/adria/CL/Asl/src/parser/Asl.g:83:25: ';' instruction
            	    {
            	    char_literal16=(Token)match(input,51,FOLLOW_51_in_block_instructions359);  
            	    stream_51.add(char_literal16);


            	    pushFollow(FOLLOW_instruction_in_block_instructions361);
            	    instruction17=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction17.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            // elements: instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 84:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/adria/CL/Asl/src/parser/Asl.g:84:16: ^( LIST_INSTR ( instruction )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                , root_1);

                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_instructions"


    public static class instruction_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /home/adria/CL/Asl/src/parser/Asl.g:88:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign18 =null;

        AslParser.ite_stmt_return ite_stmt19 =null;

        AslParser.while_stmt_return while_stmt20 =null;

        AslParser.funcall_return funcall21 =null;

        AslParser.return_stmt_return return_stmt22 =null;

        AslParser.read_return read23 =null;

        AslParser.write_return write24 =null;



        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:89:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |)
            int alt6=8;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EQUAL) ) {
                    alt6=1;
                }
                else if ( (LA6_1==48) ) {
                    alt6=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt6=2;
                }
                break;
            case WHILE:
                {
                alt6=3;
                }
                break;
            case RETURN:
                {
                alt6=5;
                }
                break;
            case READ:
                {
                alt6=6;
                }
                break;
            case WRITE:
                {
                alt6=7;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 51:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:89:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction410);
                    assign18=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign18.getTree());

                    }
                    break;
                case 2 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:90:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction432);
                    ite_stmt19=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt19.getTree());

                    }
                    break;
                case 3 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:91:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction452);
                    while_stmt20=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt20.getTree());

                    }
                    break;
                case 4 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:92:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction472);
                    funcall21=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall21.getTree());

                    }
                    break;
                case 5 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:93:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction493);
                    return_stmt22=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt22.getTree());

                    }
                    break;
                case 6 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:94:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction510);
                    read23=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read23.getTree());

                    }
                    break;
                case 7 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:95:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction535);
                    write24=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write24.getTree());

                    }
                    break;
                case 8 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:97:9: 
                    {
                    root_0 = (AslTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class assign_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /home/adria/CL/Asl/src/parser/Asl.g:100:1: assign : ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID25=null;
        AslParser.expr_return expr26 =null;


        AslTree eq_tree=null;
        AslTree ID25_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:100:8: ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            // /home/adria/CL/Asl/src/parser/Asl.g:100:10: ID eq= EQUAL expr
            {
            ID25=(Token)match(input,ID,FOLLOW_ID_in_assign593);  
            stream_ID.add(ID25);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign597);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign599);
            expr26=expr();

            state._fsp--;

            stream_expr.add(expr26.getTree());

            // AST REWRITE
            // elements: expr, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 100:27: -> ^( ASSIGN[$eq,\":=\"] ID expr )
            {
                // /home/adria/CL/Asl/src/parser/Asl.g:100:30: ^( ASSIGN[$eq,\":=\"] ID expr )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ASSIGN, eq, ":=")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home/adria/CL/Asl/src/parser/Asl.g:104:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF27=null;
        Token THEN29=null;
        Token ELSE31=null;
        Token ENDIF33=null;
        AslParser.expr_return expr28 =null;

        AslParser.block_instructions_return block_instructions30 =null;

        AslParser.block_instructions_return block_instructions32 =null;


        AslTree IF27_tree=null;
        AslTree THEN29_tree=null;
        AslTree ELSE31_tree=null;
        AslTree ENDIF33_tree=null;

        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:104:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/adria/CL/Asl/src/parser/Asl.g:104:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF27=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt628); 
            IF27_tree = 
            (AslTree)adaptor.create(IF27)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF27_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt631);
            expr28=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr28.getTree());

            THEN29=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt633); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt636);
            block_instructions30=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions30.getTree());

            // /home/adria/CL/Asl/src/parser/Asl.g:104:46: ( ELSE ! block_instructions )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ELSE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:104:47: ELSE ! block_instructions
                    {
                    ELSE31=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt639); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt642);
                    block_instructions32=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions32.getTree());

                    }
                    break;

            }


            ENDIF33=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt646); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ite_stmt"


    public static class while_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // /home/adria/CL/Asl/src/parser/Asl.g:108:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE34=null;
        Token DO36=null;
        Token ENDWHILE38=null;
        AslParser.expr_return expr35 =null;

        AslParser.block_instructions_return block_instructions37 =null;


        AslTree WHILE34_tree=null;
        AslTree DO36_tree=null;
        AslTree ENDWHILE38_tree=null;

        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:108:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/adria/CL/Asl/src/parser/Asl.g:108:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE34=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt669); 
            WHILE34_tree = 
            (AslTree)adaptor.create(WHILE34)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE34_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt672);
            expr35=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr35.getTree());

            DO36=(Token)match(input,DO,FOLLOW_DO_in_while_stmt674); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt677);
            block_instructions37=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions37.getTree());

            ENDWHILE38=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt679); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_stmt"


    public static class return_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /home/adria/CL/Asl/src/parser/Asl.g:112:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN39=null;
        AslParser.expr_return expr40 =null;


        AslTree RETURN39_tree=null;

        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:112:13: ( RETURN ^ ( expr )? )
            // /home/adria/CL/Asl/src/parser/Asl.g:112:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN39=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt702); 
            RETURN39_tree = 
            (AslTree)adaptor.create(RETURN39)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN39_tree, root_0);


            // /home/adria/CL/Asl/src/parser/Asl.g:112:23: ( expr )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==FALSE||LA8_0==ID||LA8_0==INT||LA8_0==MINUS||LA8_0==NOT||LA8_0==PLUS||LA8_0==TRUE||LA8_0==48) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:112:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt705);
                    expr40=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr40.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class read_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // /home/adria/CL/Asl/src/parser/Asl.g:116:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ41=null;
        Token ID42=null;

        AslTree READ41_tree=null;
        AslTree ID42_tree=null;

        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:116:6: ( READ ^ ID )
            // /home/adria/CL/Asl/src/parser/Asl.g:116:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ41=(Token)match(input,READ,FOLLOW_READ_in_read724); 
            READ41_tree = 
            (AslTree)adaptor.create(READ41)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ41_tree, root_0);


            ID42=(Token)match(input,ID,FOLLOW_ID_in_read727); 
            ID42_tree = 
            (AslTree)adaptor.create(ID42)
            ;
            adaptor.addChild(root_0, ID42_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "read"


    public static class write_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "write"
    // /home/adria/CL/Asl/src/parser/Asl.g:120:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE43=null;
        Token STRING45=null;
        AslParser.expr_return expr44 =null;


        AslTree WRITE43_tree=null;
        AslTree STRING45_tree=null;

        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:120:7: ( WRITE ^ ( expr | STRING ) )
            // /home/adria/CL/Asl/src/parser/Asl.g:120:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE43=(Token)match(input,WRITE,FOLLOW_WRITE_in_write747); 
            WRITE43_tree = 
            (AslTree)adaptor.create(WRITE43)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE43_tree, root_0);


            // /home/adria/CL/Asl/src/parser/Asl.g:120:18: ( expr | STRING )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==TRUE||LA9_0==48) ) {
                alt9=1;
            }
            else if ( (LA9_0==STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:120:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write751);
                    expr44=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr44.getTree());

                    }
                    break;
                case 2 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:120:26: STRING
                    {
                    STRING45=(Token)match(input,STRING,FOLLOW_STRING_in_write755); 
                    STRING45_tree = 
                    (AslTree)adaptor.create(STRING45)
                    ;
                    adaptor.addChild(root_0, STRING45_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "write"


    public static class expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/adria/CL/Asl/src/parser/Asl.g:124:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR47=null;
        AslParser.boolterm_return boolterm46 =null;

        AslParser.boolterm_return boolterm48 =null;


        AslTree OR47_tree=null;

        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:124:9: ( boolterm ( OR ^ boolterm )* )
            // /home/adria/CL/Asl/src/parser/Asl.g:124:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr780);
            boolterm46=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm46.getTree());

            // /home/adria/CL/Asl/src/parser/Asl.g:124:22: ( OR ^ boolterm )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==OR) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/adria/CL/Asl/src/parser/Asl.g:124:23: OR ^ boolterm
            	    {
            	    OR47=(Token)match(input,OR,FOLLOW_OR_in_expr783); 
            	    OR47_tree = 
            	    (AslTree)adaptor.create(OR47)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR47_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr786);
            	    boolterm48=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm48.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/adria/CL/Asl/src/parser/Asl.g:127:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND50=null;
        AslParser.boolfact_return boolfact49 =null;

        AslParser.boolfact_return boolfact51 =null;


        AslTree AND50_tree=null;

        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:127:9: ( boolfact ( AND ^ boolfact )* )
            // /home/adria/CL/Asl/src/parser/Asl.g:127:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm806);
            boolfact49=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact49.getTree());

            // /home/adria/CL/Asl/src/parser/Asl.g:127:22: ( AND ^ boolfact )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AND) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/adria/CL/Asl/src/parser/Asl.g:127:23: AND ^ boolfact
            	    {
            	    AND50=(Token)match(input,AND,FOLLOW_AND_in_boolterm809); 
            	    AND50_tree = 
            	    (AslTree)adaptor.create(AND50)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND50_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm812);
            	    boolfact51=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact51.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home/adria/CL/Asl/src/parser/Asl.g:130:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL53=null;
        Token NOT_EQUAL54=null;
        Token LT55=null;
        Token LE56=null;
        Token GT57=null;
        Token GE58=null;
        AslParser.num_expr_return num_expr52 =null;

        AslParser.num_expr_return num_expr59 =null;


        AslTree EQUAL53_tree=null;
        AslTree NOT_EQUAL54_tree=null;
        AslTree LT55_tree=null;
        AslTree LE56_tree=null;
        AslTree GT57_tree=null;
        AslTree GE58_tree=null;

        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:130:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/adria/CL/Asl/src/parser/Asl.g:130:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact832);
            num_expr52=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr52.getTree());

            // /home/adria/CL/Asl/src/parser/Asl.g:130:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EQUAL||(LA13_0 >= GE && LA13_0 <= GT)||LA13_0==LE||LA13_0==LT||LA13_0==NOT_EQUAL) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:130:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/adria/CL/Asl/src/parser/Asl.g:130:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt12=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt12=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt12=2;
                        }
                        break;
                    case LT:
                        {
                        alt12=3;
                        }
                        break;
                    case LE:
                        {
                        alt12=4;
                        }
                        break;
                    case GT:
                        {
                        alt12=5;
                        }
                        break;
                    case GE:
                        {
                        alt12=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;

                    }

                    switch (alt12) {
                        case 1 :
                            // /home/adria/CL/Asl/src/parser/Asl.g:130:24: EQUAL ^
                            {
                            EQUAL53=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact836); 
                            EQUAL53_tree = 
                            (AslTree)adaptor.create(EQUAL53)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL53_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/adria/CL/Asl/src/parser/Asl.g:130:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL54=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact841); 
                            NOT_EQUAL54_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL54)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL54_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/adria/CL/Asl/src/parser/Asl.g:130:46: LT ^
                            {
                            LT55=(Token)match(input,LT,FOLLOW_LT_in_boolfact846); 
                            LT55_tree = 
                            (AslTree)adaptor.create(LT55)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT55_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/adria/CL/Asl/src/parser/Asl.g:130:52: LE ^
                            {
                            LE56=(Token)match(input,LE,FOLLOW_LE_in_boolfact851); 
                            LE56_tree = 
                            (AslTree)adaptor.create(LE56)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE56_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/adria/CL/Asl/src/parser/Asl.g:130:58: GT ^
                            {
                            GT57=(Token)match(input,GT,FOLLOW_GT_in_boolfact856); 
                            GT57_tree = 
                            (AslTree)adaptor.create(GT57)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT57_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/adria/CL/Asl/src/parser/Asl.g:130:64: GE ^
                            {
                            GE58=(Token)match(input,GE,FOLLOW_GE_in_boolfact861); 
                            GE58_tree = 
                            (AslTree)adaptor.create(GE58)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE58_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact865);
                    num_expr59=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr59.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolfact"


    public static class num_expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr"
    // /home/adria/CL/Asl/src/parser/Asl.g:133:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS61=null;
        Token MINUS62=null;
        AslParser.term_return term60 =null;

        AslParser.term_return term63 =null;


        AslTree PLUS61_tree=null;
        AslTree MINUS62_tree=null;

        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:133:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/adria/CL/Asl/src/parser/Asl.g:133:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr885);
            term60=term();

            state._fsp--;

            adaptor.addChild(root_0, term60.getTree());

            // /home/adria/CL/Asl/src/parser/Asl.g:133:18: ( ( PLUS ^| MINUS ^) term )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==MINUS||LA15_0==PLUS) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/adria/CL/Asl/src/parser/Asl.g:133:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/adria/CL/Asl/src/parser/Asl.g:133:20: ( PLUS ^| MINUS ^)
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==PLUS) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==MINUS) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // /home/adria/CL/Asl/src/parser/Asl.g:133:21: PLUS ^
            	            {
            	            PLUS61=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr890); 
            	            PLUS61_tree = 
            	            (AslTree)adaptor.create(PLUS61)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS61_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/adria/CL/Asl/src/parser/Asl.g:133:29: MINUS ^
            	            {
            	            MINUS62=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr895); 
            	            MINUS62_tree = 
            	            (AslTree)adaptor.create(MINUS62)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS62_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr899);
            	    term63=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term63.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/adria/CL/Asl/src/parser/Asl.g:136:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL65=null;
        Token DIV66=null;
        Token MOD67=null;
        AslParser.factor_return factor64 =null;

        AslParser.factor_return factor68 =null;


        AslTree MUL65_tree=null;
        AslTree DIV66_tree=null;
        AslTree MOD67_tree=null;

        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:136:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/adria/CL/Asl/src/parser/Asl.g:136:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term923);
            factor64=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor64.getTree());

            // /home/adria/CL/Asl/src/parser/Asl.g:136:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==DIV||(LA17_0 >= MOD && LA17_0 <= MUL)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/adria/CL/Asl/src/parser/Asl.g:136:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/adria/CL/Asl/src/parser/Asl.g:136:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt16=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // /home/adria/CL/Asl/src/parser/Asl.g:136:23: MUL ^
            	            {
            	            MUL65=(Token)match(input,MUL,FOLLOW_MUL_in_term928); 
            	            MUL65_tree = 
            	            (AslTree)adaptor.create(MUL65)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL65_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/adria/CL/Asl/src/parser/Asl.g:136:30: DIV ^
            	            {
            	            DIV66=(Token)match(input,DIV,FOLLOW_DIV_in_term933); 
            	            DIV66_tree = 
            	            (AslTree)adaptor.create(DIV66)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV66_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/adria/CL/Asl/src/parser/Asl.g:136:37: MOD ^
            	            {
            	            MOD67=(Token)match(input,MOD,FOLLOW_MOD_in_term938); 
            	            MOD67_tree = 
            	            (AslTree)adaptor.create(MOD67)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD67_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term942);
            	    factor68=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor68.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/adria/CL/Asl/src/parser/Asl.g:139:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT69=null;
        Token PLUS70=null;
        Token MINUS71=null;
        AslParser.atom_return atom72 =null;


        AslTree NOT69_tree=null;
        AslTree PLUS70_tree=null;
        AslTree MINUS71_tree=null;

        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:139:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/adria/CL/Asl/src/parser/Asl.g:139:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/adria/CL/Asl/src/parser/Asl.g:139:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt18=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt18=1;
                    }
                    break;
                case PLUS:
                    {
                    alt18=2;
                    }
                    break;
                case MINUS:
                    {
                    alt18=3;
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:139:14: NOT ^
                    {
                    NOT69=(Token)match(input,NOT,FOLLOW_NOT_in_factor965); 
                    NOT69_tree = 
                    (AslTree)adaptor.create(NOT69)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT69_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:139:21: PLUS ^
                    {
                    PLUS70=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor970); 
                    PLUS70_tree = 
                    (AslTree)adaptor.create(PLUS70)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS70_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:139:29: MINUS ^
                    {
                    MINUS71=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor975); 
                    MINUS71_tree = 
                    (AslTree)adaptor.create(MINUS71)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS71_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor980);
            atom72=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom72.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/adria/CL/Asl/src/parser/Asl.g:145:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID73=null;
        Token INT74=null;
        Token char_literal76=null;
        Token char_literal78=null;
        AslParser.funcall_return funcall75 =null;

        AslParser.expr_return expr77 =null;


        AslTree b_tree=null;
        AslTree ID73_tree=null;
        AslTree INT74_tree=null;
        AslTree char_literal76_tree=null;
        AslTree char_literal78_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:145:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt20=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==48) ) {
                    alt20=4;
                }
                else if ( (LA20_1==AND||(LA20_1 >= DIV && LA20_1 <= EQUAL)||(LA20_1 >= GE && LA20_1 <= GT)||LA20_1==LE||(LA20_1 >= LT && LA20_1 <= MUL)||(LA20_1 >= NOT_EQUAL && LA20_1 <= OR)||LA20_1==PLUS||LA20_1==THEN||(LA20_1 >= 49 && LA20_1 <= 51)) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt20=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt20=3;
                }
                break;
            case 48:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:145:13: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID73=(Token)match(input,ID,FOLLOW_ID_in_atom1005); 
                    ID73_tree = 
                    (AslTree)adaptor.create(ID73)
                    ;
                    adaptor.addChild(root_0, ID73_tree);


                    }
                    break;
                case 2 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:146:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT74=(Token)match(input,INT,FOLLOW_INT_in_atom1020); 
                    INT74_tree = 
                    (AslTree)adaptor.create(INT74)
                    ;
                    adaptor.addChild(root_0, INT74_tree);


                    }
                    break;
                case 3 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:147:13: (b= TRUE |b= FALSE )
                    {
                    // /home/adria/CL/Asl/src/parser/Asl.g:147:13: (b= TRUE |b= FALSE )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==TRUE) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==FALSE) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;

                    }
                    switch (alt19) {
                        case 1 :
                            // /home/adria/CL/Asl/src/parser/Asl.g:147:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1037);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/adria/CL/Asl/src/parser/Asl.g:147:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1043);  
                            stream_FALSE.add(b);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 147:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/adria/CL/Asl/src/parser/Asl.g:147:36: ^( BOOLEAN[$b,$b.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(BOOLEAN, b, (b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:148:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1066);
                    funcall75=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall75.getTree());

                    }
                    break;
                case 5 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:149:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal76=(Token)match(input,48,FOLLOW_48_in_atom1080); 

                    pushFollow(FOLLOW_expr_in_atom1083);
                    expr77=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr77.getTree());

                    char_literal78=(Token)match(input,49,FOLLOW_49_in_atom1085); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class funcall_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home/adria/CL/Asl/src/parser/Asl.g:153:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID79=null;
        Token char_literal80=null;
        Token char_literal82=null;
        AslParser.expr_list_return expr_list81 =null;


        AslTree ID79_tree=null;
        AslTree char_literal80_tree=null;
        AslTree char_literal82_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:153:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/adria/CL/Asl/src/parser/Asl.g:153:13: ID '(' ( expr_list )? ')'
            {
            ID79=(Token)match(input,ID,FOLLOW_ID_in_funcall1106);  
            stream_ID.add(ID79);


            char_literal80=(Token)match(input,48,FOLLOW_48_in_funcall1108);  
            stream_48.add(char_literal80);


            // /home/adria/CL/Asl/src/parser/Asl.g:153:20: ( expr_list )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==FALSE||LA21_0==ID||LA21_0==INT||LA21_0==MINUS||LA21_0==NOT||LA21_0==PLUS||LA21_0==TRUE||LA21_0==48) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:153:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1110);
                    expr_list81=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list81.getTree());

                    }
                    break;

            }


            char_literal82=(Token)match(input,49,FOLLOW_49_in_funcall1113);  
            stream_49.add(char_literal82);


            // AST REWRITE
            // elements: expr_list, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 153:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/adria/CL/Asl/src/parser/Asl.g:153:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/adria/CL/Asl/src/parser/Asl.g:153:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/adria/CL/Asl/src/parser/Asl.g:153:61: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class expr_list_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // /home/adria/CL/Asl/src/parser/Asl.g:157:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal84=null;
        AslParser.expr_return expr83 =null;

        AslParser.expr_return expr85 =null;


        AslTree char_literal84_tree=null;

        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:157:10: ( expr ( ',' ! expr )* )
            // /home/adria/CL/Asl/src/parser/Asl.g:157:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1146);
            expr83=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr83.getTree());

            // /home/adria/CL/Asl/src/parser/Asl.g:157:18: ( ',' ! expr )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==50) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/adria/CL/Asl/src/parser/Asl.g:157:19: ',' ! expr
            	    {
            	    char_literal84=(Token)match(input,50,FOLLOW_50_in_expr_list1149); 

            	    pushFollow(FOLLOW_expr_in_expr_list1152);
            	    expr85=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr85.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog163 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EOF_in_prog166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func205 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_func208 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_params_in_func210 = new BitSet(new long[]{0x0008318000C00000L});
    public static final BitSet FOLLOW_block_instructions_in_func212 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_params233 = new BitSet(new long[]{0x0002800000400000L});
    public static final BitSet FOLLOW_paramlist_in_params235 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_params238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist264 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_paramlist267 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_param_in_paramlist270 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_47_in_param295 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_param299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions356 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_block_instructions359 = new BitSet(new long[]{0x0008318000C00000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions361 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign593 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_assign597 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_expr_in_assign599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt628 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt631 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt633 = new BitSet(new long[]{0x0008318000C00000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt636 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt639 = new BitSet(new long[]{0x0008318000C00000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt642 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt669 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_expr_in_while_stmt672 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DO_in_while_stmt674 = new BitSet(new long[]{0x0008318000C00000L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt677 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt702 = new BitSet(new long[]{0x0001081121420002L});
    public static final BitSet FOLLOW_expr_in_return_stmt705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read724 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_read727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write747 = new BitSet(new long[]{0x00010A1121420000L});
    public static final BitSet FOLLOW_expr_in_write751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr780 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_OR_in_expr783 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_boolterm_in_expr786 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm806 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm809 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm812 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact832 = new BitSet(new long[]{0x0000000212308002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact836 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact841 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_LT_in_boolfact846 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_LE_in_boolfact851 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_GT_in_boolfact856 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_GE_in_boolfact861 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr885 = new BitSet(new long[]{0x0000001020000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr890 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr895 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_term_in_num_expr899 = new BitSet(new long[]{0x0000001020000002L});
    public static final BitSet FOLLOW_factor_in_term923 = new BitSet(new long[]{0x00000000C0000202L});
    public static final BitSet FOLLOW_MUL_in_term928 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_DIV_in_term933 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_MOD_in_term938 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_factor_in_term942 = new BitSet(new long[]{0x00000000C0000202L});
    public static final BitSet FOLLOW_NOT_in_factor965 = new BitSet(new long[]{0x0001080001420000L});
    public static final BitSet FOLLOW_PLUS_in_factor970 = new BitSet(new long[]{0x0001080001420000L});
    public static final BitSet FOLLOW_MINUS_in_factor975 = new BitSet(new long[]{0x0001080001420000L});
    public static final BitSet FOLLOW_atom_in_factor980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_atom1080 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_expr_in_atom1083 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_atom1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1106 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_funcall1108 = new BitSet(new long[]{0x0003081121420000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1110 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_funcall1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1146 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_expr_list1149 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_expr_in_expr_list1152 = new BitSet(new long[]{0x0004000000000002L});

}