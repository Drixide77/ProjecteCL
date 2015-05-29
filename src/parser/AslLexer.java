// $ANTLR 3.4 /home/adria/CL/Asl/src/parser/Asl.g 2015-05-29 18:18:44

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AslLexer() {} 
    public AslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/adria/CL/Asl/src/parser/Asl.g"; }

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:6:7: ( '&' )
            // /home/adria/CL/Asl/src/parser/Asl.g:6:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:7:7: ( '(' )
            // /home/adria/CL/Asl/src/parser/Asl.g:7:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:8:7: ( ')' )
            // /home/adria/CL/Asl/src/parser/Asl.g:8:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:9:7: ( ',' )
            // /home/adria/CL/Asl/src/parser/Asl.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:10:7: ( ';' )
            // /home/adria/CL/Asl/src/parser/Asl.g:10:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:161:7: ( '=' )
            // /home/adria/CL/Asl/src/parser/Asl.g:161:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:162:10: ( '!=' )
            // /home/adria/CL/Asl/src/parser/Asl.g:162:12: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:163:8: ( '<' )
            // /home/adria/CL/Asl/src/parser/Asl.g:163:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:164:8: ( '<=' )
            // /home/adria/CL/Asl/src/parser/Asl.g:164:10: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:165:8: ( '>' )
            // /home/adria/CL/Asl/src/parser/Asl.g:165:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:166:8: ( '>=' )
            // /home/adria/CL/Asl/src/parser/Asl.g:166:10: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:167:6: ( '+' )
            // /home/adria/CL/Asl/src/parser/Asl.g:167:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:168:7: ( '-' )
            // /home/adria/CL/Asl/src/parser/Asl.g:168:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:169:9: ( '*' )
            // /home/adria/CL/Asl/src/parser/Asl.g:169:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:170:9: ( '/' )
            // /home/adria/CL/Asl/src/parser/Asl.g:170:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:171:9: ( '%' )
            // /home/adria/CL/Asl/src/parser/Asl.g:171:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:172:9: ( 'not' )
            // /home/adria/CL/Asl/src/parser/Asl.g:172:11: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:173:9: ( 'and' )
            // /home/adria/CL/Asl/src/parser/Asl.g:173:11: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:174:8: ( 'or' )
            // /home/adria/CL/Asl/src/parser/Asl.g:174:10: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:175:6: ( 'if' )
            // /home/adria/CL/Asl/src/parser/Asl.g:175:8: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:176:6: ( 'then' )
            // /home/adria/CL/Asl/src/parser/Asl.g:176:8: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:177:6: ( 'else' )
            // /home/adria/CL/Asl/src/parser/Asl.g:177:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:178:7: ( 'endif' )
            // /home/adria/CL/Asl/src/parser/Asl.g:178:9: 'endif'
            {
            match("endif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:179:7: ( 'while' )
            // /home/adria/CL/Asl/src/parser/Asl.g:179:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:180:8: ( 'do' )
            // /home/adria/CL/Asl/src/parser/Asl.g:180:10: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "ENDWHILE"
    public final void mENDWHILE() throws RecognitionException {
        try {
            int _type = ENDWHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:181:9: ( 'endwhile' )
            // /home/adria/CL/Asl/src/parser/Asl.g:181:11: 'endwhile'
            {
            match("endwhile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDWHILE"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:182:6: ( 'func' )
            // /home/adria/CL/Asl/src/parser/Asl.g:182:8: 'func'
            {
            match("func"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "ENDFUNC"
    public final void mENDFUNC() throws RecognitionException {
        try {
            int _type = ENDFUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:183:9: ( 'endfunc' )
            // /home/adria/CL/Asl/src/parser/Asl.g:183:11: 'endfunc'
            {
            match("endfunc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDFUNC"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:184:8: ( 'return' )
            // /home/adria/CL/Asl/src/parser/Asl.g:184:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:185:6: ( 'read' )
            // /home/adria/CL/Asl/src/parser/Asl.g:185:8: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:186:7: ( 'write' )
            // /home/adria/CL/Asl/src/parser/Asl.g:186:9: 'write'
            {
            match("write"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:187:9: ( 'true' )
            // /home/adria/CL/Asl/src/parser/Asl.g:187:11: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:188:9: ( 'false' )
            // /home/adria/CL/Asl/src/parser/Asl.g:188:11: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:189:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/adria/CL/Asl/src/parser/Asl.g:189:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/adria/CL/Asl/src/parser/Asl.g:189:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/adria/CL/Asl/src/parser/Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:190:6: ( ( '0' .. '9' )+ )
            // /home/adria/CL/Asl/src/parser/Asl.g:190:8: ( '0' .. '9' )+
            {
            // /home/adria/CL/Asl/src/parser/Asl.g:190:8: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/adria/CL/Asl/src/parser/Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:193:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='/') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='/') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='*') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:193:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/adria/CL/Asl/src/parser/Asl.g:193:16: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/adria/CL/Asl/src/parser/Asl.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    // /home/adria/CL/Asl/src/parser/Asl.g:193:30: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/adria/CL/Asl/src/parser/Asl.g:193:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /home/adria/CL/Asl/src/parser/Asl.g:194:8: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/adria/CL/Asl/src/parser/Asl.g:194:13: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/adria/CL/Asl/src/parser/Asl.g:194:41: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:198:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/adria/CL/Asl/src/parser/Asl.g:198:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/adria/CL/Asl/src/parser/Asl.g:198:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/adria/CL/Asl/src/parser/Asl.g:198:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/adria/CL/Asl/src/parser/Asl.g:198:28: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/adria/CL/Asl/src/parser/Asl.g:204:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/adria/CL/Asl/src/parser/Asl.g:204:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/adria/CL/Asl/src/parser/Asl.g:207:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/adria/CL/Asl/src/parser/Asl.g:207:8: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/adria/CL/Asl/src/parser/Asl.g:1:8: ( T__47 | T__48 | T__49 | T__50 | T__51 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | ID | INT | COMMENT | STRING | WS )
        int alt8=38;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:10: T__47
                {
                mT__47(); 


                }
                break;
            case 2 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:16: T__48
                {
                mT__48(); 


                }
                break;
            case 3 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:22: T__49
                {
                mT__49(); 


                }
                break;
            case 4 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:28: T__50
                {
                mT__50(); 


                }
                break;
            case 5 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:34: T__51
                {
                mT__51(); 


                }
                break;
            case 6 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:40: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 7 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:46: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 8 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:56: LT
                {
                mLT(); 


                }
                break;
            case 9 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:59: LE
                {
                mLE(); 


                }
                break;
            case 10 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:62: GT
                {
                mGT(); 


                }
                break;
            case 11 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:65: GE
                {
                mGE(); 


                }
                break;
            case 12 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:68: PLUS
                {
                mPLUS(); 


                }
                break;
            case 13 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:73: MINUS
                {
                mMINUS(); 


                }
                break;
            case 14 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:79: MUL
                {
                mMUL(); 


                }
                break;
            case 15 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:83: DIV
                {
                mDIV(); 


                }
                break;
            case 16 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:87: MOD
                {
                mMOD(); 


                }
                break;
            case 17 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:91: NOT
                {
                mNOT(); 


                }
                break;
            case 18 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:95: AND
                {
                mAND(); 


                }
                break;
            case 19 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:99: OR
                {
                mOR(); 


                }
                break;
            case 20 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:102: IF
                {
                mIF(); 


                }
                break;
            case 21 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:105: THEN
                {
                mTHEN(); 


                }
                break;
            case 22 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:110: ELSE
                {
                mELSE(); 


                }
                break;
            case 23 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:115: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 24 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:121: WHILE
                {
                mWHILE(); 


                }
                break;
            case 25 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:127: DO
                {
                mDO(); 


                }
                break;
            case 26 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:130: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 27 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:139: FUNC
                {
                mFUNC(); 


                }
                break;
            case 28 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:144: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 29 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:152: RETURN
                {
                mRETURN(); 


                }
                break;
            case 30 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:159: READ
                {
                mREAD(); 


                }
                break;
            case 31 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:164: WRITE
                {
                mWRITE(); 


                }
                break;
            case 32 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:170: TRUE
                {
                mTRUE(); 


                }
                break;
            case 33 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:175: FALSE
                {
                mFALSE(); 


                }
                break;
            case 34 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:181: ID
                {
                mID(); 


                }
                break;
            case 35 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:184: INT
                {
                mINT(); 


                }
                break;
            case 36 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:188: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 37 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:196: STRING
                {
                mSTRING(); 


                }
                break;
            case 38 :
                // /home/adria/CL/Asl/src/parser/Asl.g:1:203: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\10\uffff\1\36\1\40\3\uffff\1\42\1\uffff\12\31\12\uffff\2\31\1\63"+
        "\1\64\6\31\1\73\3\31\1\100\1\101\2\uffff\6\31\1\uffff\4\31\2\uffff"+
        "\1\116\1\117\1\120\5\31\1\126\2\31\1\131\3\uffff\1\132\2\31\1\135"+
        "\1\136\1\uffff\1\137\1\31\2\uffff\2\31\3\uffff\1\143\1\31\1\145"+
        "\1\uffff\1\146\2\uffff";
    static final String DFA8_eofS =
        "\147\uffff";
    static final String DFA8_minS =
        "\1\11\7\uffff\2\75\3\uffff\1\52\1\uffff\1\157\1\156\1\162\1\146"+
        "\1\150\1\154\1\150\1\157\1\141\1\145\12\uffff\1\164\1\144\2\60\1"+
        "\145\1\165\1\163\1\144\2\151\1\60\1\156\1\154\1\141\2\60\2\uffff"+
        "\1\156\2\145\1\146\1\154\1\164\1\uffff\1\143\1\163\1\165\1\144\2"+
        "\uffff\3\60\1\146\1\150\1\165\2\145\1\60\1\145\1\162\1\60\3\uffff"+
        "\1\60\1\151\1\156\2\60\1\uffff\1\60\1\156\2\uffff\1\154\1\143\3"+
        "\uffff\1\60\1\145\1\60\1\uffff\1\60\2\uffff";
    static final String DFA8_maxS =
        "\1\172\7\uffff\2\75\3\uffff\1\57\1\uffff\1\157\1\156\1\162\1\146"+
        "\1\162\1\156\1\162\1\157\1\165\1\145\12\uffff\1\164\1\144\2\172"+
        "\1\145\1\165\1\163\1\144\2\151\1\172\1\156\1\154\1\164\2\172\2\uffff"+
        "\1\156\2\145\1\167\1\154\1\164\1\uffff\1\143\1\163\1\165\1\144\2"+
        "\uffff\3\172\1\146\1\150\1\165\2\145\1\172\1\145\1\162\1\172\3\uffff"+
        "\1\172\1\151\1\156\2\172\1\uffff\1\172\1\156\2\uffff\1\154\1\143"+
        "\3\uffff\1\172\1\145\1\172\1\uffff\1\172\2\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\14\1\15\1\16\1\uffff"+
        "\1\20\12\uffff\1\42\1\43\1\45\1\46\1\11\1\10\1\13\1\12\1\44\1\17"+
        "\20\uffff\1\23\1\24\6\uffff\1\31\4\uffff\1\21\1\22\14\uffff\1\25"+
        "\1\40\1\26\5\uffff\1\33\2\uffff\1\36\1\27\2\uffff\1\30\1\37\1\41"+
        "\3\uffff\1\35\1\uffff\1\34\1\32";
    static final String DFA8_specialS =
        "\147\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\34\2\uffff\1\34\22\uffff\1\34\1\7\1\33\2\uffff\1\16\1\1\1"+
            "\uffff\1\2\1\3\1\14\1\12\1\4\1\13\1\uffff\1\15\12\32\1\uffff"+
            "\1\5\1\10\1\6\1\11\2\uffff\32\31\4\uffff\1\31\1\uffff\1\20\2"+
            "\31\1\26\1\24\1\27\2\31\1\22\4\31\1\17\1\21\2\31\1\30\1\31\1"+
            "\23\2\31\1\25\3\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\35",
            "\1\37",
            "",
            "",
            "",
            "\1\41\4\uffff\1\41",
            "",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47\11\uffff\1\50",
            "\1\51\1\uffff\1\52",
            "\1\53\11\uffff\1\54",
            "\1\55",
            "\1\57\23\uffff\1\56",
            "\1\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\61",
            "\1\62",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\74",
            "\1\75",
            "\1\77\22\uffff\1\76",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\107\2\uffff\1\105\15\uffff\1\106",
            "\1\110",
            "\1\111",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\127",
            "\1\130",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\133",
            "\1\134",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\140",
            "",
            "",
            "\1\141",
            "\1\142",
            "",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\144",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__47 | T__48 | T__49 | T__50 | T__51 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | ID | INT | COMMENT | STRING | WS );";
        }
    }
 

}