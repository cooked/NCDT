package org.eclipse.ncdt.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.ncdt.services.GCodeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGCodeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_GCODE", "RULE_MCODE", "RULE_COORD", "RULE_SCODE", "RULE_FCODE", "RULE_ECODE", "RULE_INT", "RULE_NUM", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
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


        public InternalGCodeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGCodeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGCodeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGCode.g"; }



     	private GCodeGrammarAccess grammarAccess;

        public InternalGCodeParser(TokenStream input, GCodeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected GCodeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalGCode.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGCode.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalGCode.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGCode.g:71:1: ruleModel returns [EObject current=null] : ( (lv_Blocks_0_0= ruleBlock ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_Blocks_0_0 = null;



        	enterRule();

        try {
            // InternalGCode.g:77:2: ( ( (lv_Blocks_0_0= ruleBlock ) )+ )
            // InternalGCode.g:78:2: ( (lv_Blocks_0_0= ruleBlock ) )+
            {
            // InternalGCode.g:78:2: ( (lv_Blocks_0_0= ruleBlock ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_GCODE && LA1_0<=RULE_MCODE)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGCode.g:79:3: (lv_Blocks_0_0= ruleBlock )
            	    {
            	    // InternalGCode.g:79:3: (lv_Blocks_0_0= ruleBlock )
            	    // InternalGCode.g:80:4: lv_Blocks_0_0= ruleBlock
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getBlocksBlockParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_Blocks_0_0=ruleBlock();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"Blocks",
            	    					lv_Blocks_0_0,
            	    					"org.eclipse.ncdt.GCode.Block");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


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


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleBlock"
    // InternalGCode.g:100:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalGCode.g:100:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalGCode.g:101:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalGCode.g:107:1: ruleBlock returns [EObject current=null] : (this_GBlock_0= ruleGBlock | this_MBlock_1= ruleMBlock ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject this_GBlock_0 = null;

        EObject this_MBlock_1 = null;



        	enterRule();

        try {
            // InternalGCode.g:113:2: ( (this_GBlock_0= ruleGBlock | this_MBlock_1= ruleMBlock ) )
            // InternalGCode.g:114:2: (this_GBlock_0= ruleGBlock | this_MBlock_1= ruleMBlock )
            {
            // InternalGCode.g:114:2: (this_GBlock_0= ruleGBlock | this_MBlock_1= ruleMBlock )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_GCODE) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_MCODE) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGCode.g:115:3: this_GBlock_0= ruleGBlock
                    {

                    			newCompositeNode(grammarAccess.getBlockAccess().getGBlockParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GBlock_0=ruleGBlock();

                    state._fsp--;


                    			current = this_GBlock_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGCode.g:124:3: this_MBlock_1= ruleMBlock
                    {

                    			newCompositeNode(grammarAccess.getBlockAccess().getMBlockParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MBlock_1=ruleMBlock();

                    state._fsp--;


                    			current = this_MBlock_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleGBlock"
    // InternalGCode.g:136:1: entryRuleGBlock returns [EObject current=null] : iv_ruleGBlock= ruleGBlock EOF ;
    public final EObject entryRuleGBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGBlock = null;


        try {
            // InternalGCode.g:136:47: (iv_ruleGBlock= ruleGBlock EOF )
            // InternalGCode.g:137:2: iv_ruleGBlock= ruleGBlock EOF
            {
             newCompositeNode(grammarAccess.getGBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGBlock=ruleGBlock();

            state._fsp--;

             current =iv_ruleGBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGBlock"


    // $ANTLR start "ruleGBlock"
    // InternalGCode.g:143:1: ruleGBlock returns [EObject current=null] : ( ( (lv_name_0_0= RULE_GCODE ) ) ( (lv_arguments_1_0= ruleArgument ) )* ) ;
    public final EObject ruleGBlock() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        AntlrDatatypeRuleToken lv_arguments_1_0 = null;



        	enterRule();

        try {
            // InternalGCode.g:149:2: ( ( ( (lv_name_0_0= RULE_GCODE ) ) ( (lv_arguments_1_0= ruleArgument ) )* ) )
            // InternalGCode.g:150:2: ( ( (lv_name_0_0= RULE_GCODE ) ) ( (lv_arguments_1_0= ruleArgument ) )* )
            {
            // InternalGCode.g:150:2: ( ( (lv_name_0_0= RULE_GCODE ) ) ( (lv_arguments_1_0= ruleArgument ) )* )
            // InternalGCode.g:151:3: ( (lv_name_0_0= RULE_GCODE ) ) ( (lv_arguments_1_0= ruleArgument ) )*
            {
            // InternalGCode.g:151:3: ( (lv_name_0_0= RULE_GCODE ) )
            // InternalGCode.g:152:4: (lv_name_0_0= RULE_GCODE )
            {
            // InternalGCode.g:152:4: (lv_name_0_0= RULE_GCODE )
            // InternalGCode.g:153:5: lv_name_0_0= RULE_GCODE
            {
            lv_name_0_0=(Token)match(input,RULE_GCODE,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getGBlockAccess().getNameGCODETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.ncdt.GCode.GCODE");
            				

            }


            }

            // InternalGCode.g:169:3: ( (lv_arguments_1_0= ruleArgument ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_COORD && LA3_0<=RULE_ECODE)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGCode.g:170:4: (lv_arguments_1_0= ruleArgument )
            	    {
            	    // InternalGCode.g:170:4: (lv_arguments_1_0= ruleArgument )
            	    // InternalGCode.g:171:5: lv_arguments_1_0= ruleArgument
            	    {

            	    					newCompositeNode(grammarAccess.getGBlockAccess().getArgumentsArgumentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_arguments_1_0=ruleArgument();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"arguments",
            	    						lv_arguments_1_0,
            	    						"org.eclipse.ncdt.GCode.Argument");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGBlock"


    // $ANTLR start "entryRuleMBlock"
    // InternalGCode.g:192:1: entryRuleMBlock returns [EObject current=null] : iv_ruleMBlock= ruleMBlock EOF ;
    public final EObject entryRuleMBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMBlock = null;


        try {
            // InternalGCode.g:192:47: (iv_ruleMBlock= ruleMBlock EOF )
            // InternalGCode.g:193:2: iv_ruleMBlock= ruleMBlock EOF
            {
             newCompositeNode(grammarAccess.getMBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMBlock=ruleMBlock();

            state._fsp--;

             current =iv_ruleMBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMBlock"


    // $ANTLR start "ruleMBlock"
    // InternalGCode.g:199:1: ruleMBlock returns [EObject current=null] : ( ( (lv_name_0_0= RULE_MCODE ) ) ( (lv_arguments_1_0= ruleArgument ) )* ) ;
    public final EObject ruleMBlock() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        AntlrDatatypeRuleToken lv_arguments_1_0 = null;



        	enterRule();

        try {
            // InternalGCode.g:205:2: ( ( ( (lv_name_0_0= RULE_MCODE ) ) ( (lv_arguments_1_0= ruleArgument ) )* ) )
            // InternalGCode.g:206:2: ( ( (lv_name_0_0= RULE_MCODE ) ) ( (lv_arguments_1_0= ruleArgument ) )* )
            {
            // InternalGCode.g:206:2: ( ( (lv_name_0_0= RULE_MCODE ) ) ( (lv_arguments_1_0= ruleArgument ) )* )
            // InternalGCode.g:207:3: ( (lv_name_0_0= RULE_MCODE ) ) ( (lv_arguments_1_0= ruleArgument ) )*
            {
            // InternalGCode.g:207:3: ( (lv_name_0_0= RULE_MCODE ) )
            // InternalGCode.g:208:4: (lv_name_0_0= RULE_MCODE )
            {
            // InternalGCode.g:208:4: (lv_name_0_0= RULE_MCODE )
            // InternalGCode.g:209:5: lv_name_0_0= RULE_MCODE
            {
            lv_name_0_0=(Token)match(input,RULE_MCODE,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMBlockAccess().getNameMCODETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.ncdt.GCode.MCODE");
            				

            }


            }

            // InternalGCode.g:225:3: ( (lv_arguments_1_0= ruleArgument ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_COORD && LA4_0<=RULE_ECODE)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGCode.g:226:4: (lv_arguments_1_0= ruleArgument )
            	    {
            	    // InternalGCode.g:226:4: (lv_arguments_1_0= ruleArgument )
            	    // InternalGCode.g:227:5: lv_arguments_1_0= ruleArgument
            	    {

            	    					newCompositeNode(grammarAccess.getMBlockAccess().getArgumentsArgumentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_arguments_1_0=ruleArgument();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"arguments",
            	    						lv_arguments_1_0,
            	    						"org.eclipse.ncdt.GCode.Argument");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMBlock"


    // $ANTLR start "entryRuleArgument"
    // InternalGCode.g:248:1: entryRuleArgument returns [String current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final String entryRuleArgument() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArgument = null;


        try {
            // InternalGCode.g:248:48: (iv_ruleArgument= ruleArgument EOF )
            // InternalGCode.g:249:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalGCode.g:255:1: ruleArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_COORD_0= RULE_COORD | this_SCODE_1= RULE_SCODE | this_FCODE_2= RULE_FCODE | this_ECODE_3= RULE_ECODE ) ;
    public final AntlrDatatypeRuleToken ruleArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COORD_0=null;
        Token this_SCODE_1=null;
        Token this_FCODE_2=null;
        Token this_ECODE_3=null;


        	enterRule();

        try {
            // InternalGCode.g:261:2: ( (this_COORD_0= RULE_COORD | this_SCODE_1= RULE_SCODE | this_FCODE_2= RULE_FCODE | this_ECODE_3= RULE_ECODE ) )
            // InternalGCode.g:262:2: (this_COORD_0= RULE_COORD | this_SCODE_1= RULE_SCODE | this_FCODE_2= RULE_FCODE | this_ECODE_3= RULE_ECODE )
            {
            // InternalGCode.g:262:2: (this_COORD_0= RULE_COORD | this_SCODE_1= RULE_SCODE | this_FCODE_2= RULE_FCODE | this_ECODE_3= RULE_ECODE )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_COORD:
                {
                alt5=1;
                }
                break;
            case RULE_SCODE:
                {
                alt5=2;
                }
                break;
            case RULE_FCODE:
                {
                alt5=3;
                }
                break;
            case RULE_ECODE:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGCode.g:263:3: this_COORD_0= RULE_COORD
                    {
                    this_COORD_0=(Token)match(input,RULE_COORD,FOLLOW_2); 

                    			current.merge(this_COORD_0);
                    		

                    			newLeafNode(this_COORD_0, grammarAccess.getArgumentAccess().getCOORDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGCode.g:271:3: this_SCODE_1= RULE_SCODE
                    {
                    this_SCODE_1=(Token)match(input,RULE_SCODE,FOLLOW_2); 

                    			current.merge(this_SCODE_1);
                    		

                    			newLeafNode(this_SCODE_1, grammarAccess.getArgumentAccess().getSCODETerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGCode.g:279:3: this_FCODE_2= RULE_FCODE
                    {
                    this_FCODE_2=(Token)match(input,RULE_FCODE,FOLLOW_2); 

                    			current.merge(this_FCODE_2);
                    		

                    			newLeafNode(this_FCODE_2, grammarAccess.getArgumentAccess().getFCODETerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalGCode.g:287:3: this_ECODE_3= RULE_ECODE
                    {
                    this_ECODE_3=(Token)match(input,RULE_ECODE,FOLLOW_2); 

                    			current.merge(this_ECODE_3);
                    		

                    			newLeafNode(this_ECODE_3, grammarAccess.getArgumentAccess().getECODETerminalRuleCall_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgument"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000003C2L});

}