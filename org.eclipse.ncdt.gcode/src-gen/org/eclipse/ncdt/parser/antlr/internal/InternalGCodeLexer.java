package org.eclipse.ncdt.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGCodeLexer extends Lexer {
    public static final int RULE_ECODE=9;
    public static final int RULE_WS=13;
    public static final int RULE_MCODE=5;
    public static final int RULE_SCODE=7;
    public static final int RULE_COORD=6;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_FCODE=8;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_INT=10;
    public static final int RULE_NUM=11;
    public static final int RULE_GCODE=4;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalGCodeLexer() {;} 
    public InternalGCodeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGCodeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGCode.g"; }

    // $ANTLR start "RULE_NUM"
    public final void mRULE_NUM() throws RecognitionException {
        try {
            // InternalGCode.g:297:19: ( ( '-' )? RULE_INT ( '.' RULE_INT )? )
            // InternalGCode.g:297:21: ( '-' )? RULE_INT ( '.' RULE_INT )?
            {
            // InternalGCode.g:297:21: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGCode.g:297:21: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            // InternalGCode.g:297:35: ( '.' RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='.') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGCode.g:297:36: '.' RULE_INT
                    {
                    match('.'); 
                    mRULE_INT(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUM"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalGCode.g:299:19: ( ( '0' .. '9' )+ )
            // InternalGCode.g:299:21: ( '0' .. '9' )+
            {
            // InternalGCode.g:299:21: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGCode.g:299:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_GCODE"
    public final void mRULE_GCODE() throws RecognitionException {
        try {
            int _type = RULE_GCODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGCode.g:301:12: ( 'G' RULE_INT )
            // InternalGCode.g:301:14: 'G' RULE_INT
            {
            match('G'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GCODE"

    // $ANTLR start "RULE_MCODE"
    public final void mRULE_MCODE() throws RecognitionException {
        try {
            int _type = RULE_MCODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGCode.g:303:12: ( 'M' RULE_INT )
            // InternalGCode.g:303:14: 'M' RULE_INT
            {
            match('M'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MCODE"

    // $ANTLR start "RULE_SCODE"
    public final void mRULE_SCODE() throws RecognitionException {
        try {
            int _type = RULE_SCODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGCode.g:305:12: ( 'S' RULE_NUM )
            // InternalGCode.g:305:14: 'S' RULE_NUM
            {
            match('S'); 
            mRULE_NUM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCODE"

    // $ANTLR start "RULE_FCODE"
    public final void mRULE_FCODE() throws RecognitionException {
        try {
            int _type = RULE_FCODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGCode.g:307:12: ( 'F' RULE_NUM )
            // InternalGCode.g:307:14: 'F' RULE_NUM
            {
            match('F'); 
            mRULE_NUM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FCODE"

    // $ANTLR start "RULE_ECODE"
    public final void mRULE_ECODE() throws RecognitionException {
        try {
            int _type = RULE_ECODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGCode.g:309:12: ( 'E' RULE_NUM )
            // InternalGCode.g:309:14: 'E' RULE_NUM
            {
            match('E'); 
            mRULE_NUM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ECODE"

    // $ANTLR start "RULE_COORD"
    public final void mRULE_COORD() throws RecognitionException {
        try {
            int _type = RULE_COORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGCode.g:311:12: ( ( 'X' RULE_NUM | 'Y' RULE_NUM | 'Z' RULE_NUM ) )
            // InternalGCode.g:311:14: ( 'X' RULE_NUM | 'Y' RULE_NUM | 'Z' RULE_NUM )
            {
            // InternalGCode.g:311:14: ( 'X' RULE_NUM | 'Y' RULE_NUM | 'Z' RULE_NUM )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 'X':
                {
                alt4=1;
                }
                break;
            case 'Y':
                {
                alt4=2;
                }
                break;
            case 'Z':
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGCode.g:311:15: 'X' RULE_NUM
                    {
                    match('X'); 
                    mRULE_NUM(); 

                    }
                    break;
                case 2 :
                    // InternalGCode.g:311:28: 'Y' RULE_NUM
                    {
                    match('Y'); 
                    mRULE_NUM(); 

                    }
                    break;
                case 3 :
                    // InternalGCode.g:311:41: 'Z' RULE_NUM
                    {
                    match('Z'); 
                    mRULE_NUM(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COORD"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGCode.g:313:17: ( ';' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGCode.g:313:19: ';' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match(';'); 
            // InternalGCode.g:313:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGCode.g:313:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalGCode.g:313:39: ( ( '\\r' )? '\\n' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGCode.g:313:40: ( '\\r' )? '\\n'
                    {
                    // InternalGCode.g:313:40: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalGCode.g:313:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGCode.g:315:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGCode.g:315:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGCode.g:315:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGCode.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGCode.g:317:16: ( . )
            // InternalGCode.g:317:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalGCode.g:1:8: ( RULE_GCODE | RULE_MCODE | RULE_SCODE | RULE_FCODE | RULE_ECODE | RULE_COORD | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt9=9;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // InternalGCode.g:1:10: RULE_GCODE
                {
                mRULE_GCODE(); 

                }
                break;
            case 2 :
                // InternalGCode.g:1:21: RULE_MCODE
                {
                mRULE_MCODE(); 

                }
                break;
            case 3 :
                // InternalGCode.g:1:32: RULE_SCODE
                {
                mRULE_SCODE(); 

                }
                break;
            case 4 :
                // InternalGCode.g:1:43: RULE_FCODE
                {
                mRULE_FCODE(); 

                }
                break;
            case 5 :
                // InternalGCode.g:1:54: RULE_ECODE
                {
                mRULE_ECODE(); 

                }
                break;
            case 6 :
                // InternalGCode.g:1:65: RULE_COORD
                {
                mRULE_COORD(); 

                }
                break;
            case 7 :
                // InternalGCode.g:1:76: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 8 :
                // InternalGCode.g:1:92: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 9 :
                // InternalGCode.g:1:100: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\10\13\13\uffff";
    static final String DFA9_eofS =
        "\24\uffff";
    static final String DFA9_minS =
        "\1\0\2\60\6\55\13\uffff";
    static final String DFA9_maxS =
        "\1\uffff\10\71\13\uffff";
    static final String DFA9_acceptS =
        "\11\uffff\1\7\1\10\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA9_specialS =
        "\1\0\23\uffff}>";
    static final String[] DFA9_transitionS = {
            "\11\13\2\12\2\13\1\12\22\13\1\12\32\13\1\11\11\13\1\5\1\4\1\1\5\13\1\2\5\13\1\3\4\13\1\6\1\7\1\10\uffa5\13",
            "\12\14",
            "\12\15",
            "\1\16\2\uffff\12\16",
            "\1\17\2\uffff\12\17",
            "\1\20\2\uffff\12\20",
            "\1\21\2\uffff\12\21",
            "\1\21\2\uffff\12\21",
            "\1\21\2\uffff\12\21",
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
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_GCODE | RULE_MCODE | RULE_SCODE | RULE_FCODE | RULE_ECODE | RULE_COORD | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_0 = input.LA(1);

                        s = -1;
                        if ( (LA9_0=='G') ) {s = 1;}

                        else if ( (LA9_0=='M') ) {s = 2;}

                        else if ( (LA9_0=='S') ) {s = 3;}

                        else if ( (LA9_0=='F') ) {s = 4;}

                        else if ( (LA9_0=='E') ) {s = 5;}

                        else if ( (LA9_0=='X') ) {s = 6;}

                        else if ( (LA9_0=='Y') ) {s = 7;}

                        else if ( (LA9_0=='Z') ) {s = 8;}

                        else if ( (LA9_0==';') ) {s = 9;}

                        else if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {s = 10;}

                        else if ( ((LA9_0>='\u0000' && LA9_0<='\b')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\u001F')||(LA9_0>='!' && LA9_0<=':')||(LA9_0>='<' && LA9_0<='D')||(LA9_0>='H' && LA9_0<='L')||(LA9_0>='N' && LA9_0<='R')||(LA9_0>='T' && LA9_0<='W')||(LA9_0>='[' && LA9_0<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}