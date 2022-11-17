package de.dc.workbench.fx.ui.rules.spell.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.dc.workbench.fx.ui.rules.spell.services.RulesDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRulesDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'URI'", "'AS'", "'RULE'", "'->'", "'input'", "'RULESET'", "'WHEN'", "'AND'", "'THEN'", "'END'", "'OUTPUT'", "'('", "'value'", "':'", "'model'", "','", "'mapper'", "')'", "'{'", "'}'", "'='", "'EQUALS_IGNORE_CASE'", "'CONTAINS'", "'COTNAINS_IGNORE_CASE'", "'GREATER_THAN'", "'GREATER_THAN_EQUALS'", "'SMALL_THAN'", "'SMALL_THAN_EQUALS'", "'START_WITH'", "'START_IGNORE_CASE_WITH'", "'END_WITH'", "'END_IGNORE_CASE_WITH'", "'OR'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRulesDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRulesDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRulesDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRulesDsl.g"; }



     	private RulesDslGrammarAccess grammarAccess;

        public InternalRulesDslParser(TokenStream input, RulesDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RulesManager";
       	}

       	@Override
       	protected RulesDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRulesManager"
    // InternalRulesDsl.g:65:1: entryRuleRulesManager returns [EObject current=null] : iv_ruleRulesManager= ruleRulesManager EOF ;
    public final EObject entryRuleRulesManager() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRulesManager = null;


        try {
            // InternalRulesDsl.g:65:53: (iv_ruleRulesManager= ruleRulesManager EOF )
            // InternalRulesDsl.g:66:2: iv_ruleRulesManager= ruleRulesManager EOF
            {
             newCompositeNode(grammarAccess.getRulesManagerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRulesManager=ruleRulesManager();

            state._fsp--;

             current =iv_ruleRulesManager; 
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
    // $ANTLR end "entryRuleRulesManager"


    // $ANTLR start "ruleRulesManager"
    // InternalRulesDsl.g:72:1: ruleRulesManager returns [EObject current=null] : ( () ( ( (lv_imports_1_0= ruleUri ) ) ( (lv_imports_2_0= ruleUri ) )* )? ( ( (lv_rules_3_0= ruleRule ) ) ( (lv_rules_4_0= ruleRule ) )* )? ( ( (lv_outputs_5_0= ruleOutput ) ) ( (lv_outputs_6_0= ruleOutput ) )* )? ( ( (lv_ruleSet_7_0= ruleRuleSet ) ) ( (lv_ruleSet_8_0= ruleRuleSet ) )* )? ) ;
    public final EObject ruleRulesManager() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_rules_3_0 = null;

        EObject lv_rules_4_0 = null;

        EObject lv_outputs_5_0 = null;

        EObject lv_outputs_6_0 = null;

        EObject lv_ruleSet_7_0 = null;

        EObject lv_ruleSet_8_0 = null;



        	enterRule();

        try {
            // InternalRulesDsl.g:78:2: ( ( () ( ( (lv_imports_1_0= ruleUri ) ) ( (lv_imports_2_0= ruleUri ) )* )? ( ( (lv_rules_3_0= ruleRule ) ) ( (lv_rules_4_0= ruleRule ) )* )? ( ( (lv_outputs_5_0= ruleOutput ) ) ( (lv_outputs_6_0= ruleOutput ) )* )? ( ( (lv_ruleSet_7_0= ruleRuleSet ) ) ( (lv_ruleSet_8_0= ruleRuleSet ) )* )? ) )
            // InternalRulesDsl.g:79:2: ( () ( ( (lv_imports_1_0= ruleUri ) ) ( (lv_imports_2_0= ruleUri ) )* )? ( ( (lv_rules_3_0= ruleRule ) ) ( (lv_rules_4_0= ruleRule ) )* )? ( ( (lv_outputs_5_0= ruleOutput ) ) ( (lv_outputs_6_0= ruleOutput ) )* )? ( ( (lv_ruleSet_7_0= ruleRuleSet ) ) ( (lv_ruleSet_8_0= ruleRuleSet ) )* )? )
            {
            // InternalRulesDsl.g:79:2: ( () ( ( (lv_imports_1_0= ruleUri ) ) ( (lv_imports_2_0= ruleUri ) )* )? ( ( (lv_rules_3_0= ruleRule ) ) ( (lv_rules_4_0= ruleRule ) )* )? ( ( (lv_outputs_5_0= ruleOutput ) ) ( (lv_outputs_6_0= ruleOutput ) )* )? ( ( (lv_ruleSet_7_0= ruleRuleSet ) ) ( (lv_ruleSet_8_0= ruleRuleSet ) )* )? )
            // InternalRulesDsl.g:80:3: () ( ( (lv_imports_1_0= ruleUri ) ) ( (lv_imports_2_0= ruleUri ) )* )? ( ( (lv_rules_3_0= ruleRule ) ) ( (lv_rules_4_0= ruleRule ) )* )? ( ( (lv_outputs_5_0= ruleOutput ) ) ( (lv_outputs_6_0= ruleOutput ) )* )? ( ( (lv_ruleSet_7_0= ruleRuleSet ) ) ( (lv_ruleSet_8_0= ruleRuleSet ) )* )?
            {
            // InternalRulesDsl.g:80:3: ()
            // InternalRulesDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRulesManagerAccess().getRulesManagerAction_0(),
            					current);
            			

            }

            // InternalRulesDsl.g:87:3: ( ( (lv_imports_1_0= ruleUri ) ) ( (lv_imports_2_0= ruleUri ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRulesDsl.g:88:4: ( (lv_imports_1_0= ruleUri ) ) ( (lv_imports_2_0= ruleUri ) )*
                    {
                    // InternalRulesDsl.g:88:4: ( (lv_imports_1_0= ruleUri ) )
                    // InternalRulesDsl.g:89:5: (lv_imports_1_0= ruleUri )
                    {
                    // InternalRulesDsl.g:89:5: (lv_imports_1_0= ruleUri )
                    // InternalRulesDsl.g:90:6: lv_imports_1_0= ruleUri
                    {

                    						newCompositeNode(grammarAccess.getRulesManagerAccess().getImportsUriParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_imports_1_0=ruleUri();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRulesManagerRule());
                    						}
                    						add(
                    							current,
                    							"imports",
                    							lv_imports_1_0,
                    							"de.dc.workbench.fx.ui.rules.spell.RulesDsl.Uri");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRulesDsl.g:107:4: ( (lv_imports_2_0= ruleUri ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRulesDsl.g:108:5: (lv_imports_2_0= ruleUri )
                    	    {
                    	    // InternalRulesDsl.g:108:5: (lv_imports_2_0= ruleUri )
                    	    // InternalRulesDsl.g:109:6: lv_imports_2_0= ruleUri
                    	    {

                    	    						newCompositeNode(grammarAccess.getRulesManagerAccess().getImportsUriParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_imports_2_0=ruleUri();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRulesManagerRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"imports",
                    	    							lv_imports_2_0,
                    	    							"de.dc.workbench.fx.ui.rules.spell.RulesDsl.Uri");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRulesDsl.g:127:3: ( ( (lv_rules_3_0= ruleRule ) ) ( (lv_rules_4_0= ruleRule ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRulesDsl.g:128:4: ( (lv_rules_3_0= ruleRule ) ) ( (lv_rules_4_0= ruleRule ) )*
                    {
                    // InternalRulesDsl.g:128:4: ( (lv_rules_3_0= ruleRule ) )
                    // InternalRulesDsl.g:129:5: (lv_rules_3_0= ruleRule )
                    {
                    // InternalRulesDsl.g:129:5: (lv_rules_3_0= ruleRule )
                    // InternalRulesDsl.g:130:6: lv_rules_3_0= ruleRule
                    {

                    						newCompositeNode(grammarAccess.getRulesManagerAccess().getRulesRuleParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_rules_3_0=ruleRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRulesManagerRule());
                    						}
                    						add(
                    							current,
                    							"rules",
                    							lv_rules_3_0,
                    							"de.dc.workbench.fx.ui.rules.spell.RulesDsl.Rule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRulesDsl.g:147:4: ( (lv_rules_4_0= ruleRule ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRulesDsl.g:148:5: (lv_rules_4_0= ruleRule )
                    	    {
                    	    // InternalRulesDsl.g:148:5: (lv_rules_4_0= ruleRule )
                    	    // InternalRulesDsl.g:149:6: lv_rules_4_0= ruleRule
                    	    {

                    	    						newCompositeNode(grammarAccess.getRulesManagerAccess().getRulesRuleParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_rules_4_0=ruleRule();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRulesManagerRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"rules",
                    	    							lv_rules_4_0,
                    	    							"de.dc.workbench.fx.ui.rules.spell.RulesDsl.Rule");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRulesDsl.g:167:3: ( ( (lv_outputs_5_0= ruleOutput ) ) ( (lv_outputs_6_0= ruleOutput ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRulesDsl.g:168:4: ( (lv_outputs_5_0= ruleOutput ) ) ( (lv_outputs_6_0= ruleOutput ) )*
                    {
                    // InternalRulesDsl.g:168:4: ( (lv_outputs_5_0= ruleOutput ) )
                    // InternalRulesDsl.g:169:5: (lv_outputs_5_0= ruleOutput )
                    {
                    // InternalRulesDsl.g:169:5: (lv_outputs_5_0= ruleOutput )
                    // InternalRulesDsl.g:170:6: lv_outputs_5_0= ruleOutput
                    {

                    						newCompositeNode(grammarAccess.getRulesManagerAccess().getOutputsOutputParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_outputs_5_0=ruleOutput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRulesManagerRule());
                    						}
                    						add(
                    							current,
                    							"outputs",
                    							lv_outputs_5_0,
                    							"de.dc.workbench.fx.ui.rules.spell.RulesDsl.Output");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRulesDsl.g:187:4: ( (lv_outputs_6_0= ruleOutput ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==21) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRulesDsl.g:188:5: (lv_outputs_6_0= ruleOutput )
                    	    {
                    	    // InternalRulesDsl.g:188:5: (lv_outputs_6_0= ruleOutput )
                    	    // InternalRulesDsl.g:189:6: lv_outputs_6_0= ruleOutput
                    	    {

                    	    						newCompositeNode(grammarAccess.getRulesManagerAccess().getOutputsOutputParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_outputs_6_0=ruleOutput();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRulesManagerRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"outputs",
                    	    							lv_outputs_6_0,
                    	    							"de.dc.workbench.fx.ui.rules.spell.RulesDsl.Output");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRulesDsl.g:207:3: ( ( (lv_ruleSet_7_0= ruleRuleSet ) ) ( (lv_ruleSet_8_0= ruleRuleSet ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRulesDsl.g:208:4: ( (lv_ruleSet_7_0= ruleRuleSet ) ) ( (lv_ruleSet_8_0= ruleRuleSet ) )*
                    {
                    // InternalRulesDsl.g:208:4: ( (lv_ruleSet_7_0= ruleRuleSet ) )
                    // InternalRulesDsl.g:209:5: (lv_ruleSet_7_0= ruleRuleSet )
                    {
                    // InternalRulesDsl.g:209:5: (lv_ruleSet_7_0= ruleRuleSet )
                    // InternalRulesDsl.g:210:6: lv_ruleSet_7_0= ruleRuleSet
                    {

                    						newCompositeNode(grammarAccess.getRulesManagerAccess().getRuleSetRuleSetParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_ruleSet_7_0=ruleRuleSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRulesManagerRule());
                    						}
                    						add(
                    							current,
                    							"ruleSet",
                    							lv_ruleSet_7_0,
                    							"de.dc.workbench.fx.ui.rules.spell.RulesDsl.RuleSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRulesDsl.g:227:4: ( (lv_ruleSet_8_0= ruleRuleSet ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRulesDsl.g:228:5: (lv_ruleSet_8_0= ruleRuleSet )
                    	    {
                    	    // InternalRulesDsl.g:228:5: (lv_ruleSet_8_0= ruleRuleSet )
                    	    // InternalRulesDsl.g:229:6: lv_ruleSet_8_0= ruleRuleSet
                    	    {

                    	    						newCompositeNode(grammarAccess.getRulesManagerAccess().getRuleSetRuleSetParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_ruleSet_8_0=ruleRuleSet();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRulesManagerRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"ruleSet",
                    	    							lv_ruleSet_8_0,
                    	    							"de.dc.workbench.fx.ui.rules.spell.RulesDsl.RuleSet");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }


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
    // $ANTLR end "ruleRulesManager"


    // $ANTLR start "entryRuleUri"
    // InternalRulesDsl.g:251:1: entryRuleUri returns [EObject current=null] : iv_ruleUri= ruleUri EOF ;
    public final EObject entryRuleUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUri = null;


        try {
            // InternalRulesDsl.g:251:44: (iv_ruleUri= ruleUri EOF )
            // InternalRulesDsl.g:252:2: iv_ruleUri= ruleUri EOF
            {
             newCompositeNode(grammarAccess.getUriRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUri=ruleUri();

            state._fsp--;

             current =iv_ruleUri; 
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
    // $ANTLR end "entryRuleUri"


    // $ANTLR start "ruleUri"
    // InternalRulesDsl.g:258:1: ruleUri returns [EObject current=null] : ( () otherlv_1= 'URI' ( (lv_uri_2_0= ruleEString ) ) otherlv_3= 'AS' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleUri() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_uri_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalRulesDsl.g:264:2: ( ( () otherlv_1= 'URI' ( (lv_uri_2_0= ruleEString ) ) otherlv_3= 'AS' ( (lv_name_4_0= ruleEString ) ) ) )
            // InternalRulesDsl.g:265:2: ( () otherlv_1= 'URI' ( (lv_uri_2_0= ruleEString ) ) otherlv_3= 'AS' ( (lv_name_4_0= ruleEString ) ) )
            {
            // InternalRulesDsl.g:265:2: ( () otherlv_1= 'URI' ( (lv_uri_2_0= ruleEString ) ) otherlv_3= 'AS' ( (lv_name_4_0= ruleEString ) ) )
            // InternalRulesDsl.g:266:3: () otherlv_1= 'URI' ( (lv_uri_2_0= ruleEString ) ) otherlv_3= 'AS' ( (lv_name_4_0= ruleEString ) )
            {
            // InternalRulesDsl.g:266:3: ()
            // InternalRulesDsl.g:267:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUriAccess().getUriAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getUriAccess().getURIKeyword_1());
            		
            // InternalRulesDsl.g:277:3: ( (lv_uri_2_0= ruleEString ) )
            // InternalRulesDsl.g:278:4: (lv_uri_2_0= ruleEString )
            {
            // InternalRulesDsl.g:278:4: (lv_uri_2_0= ruleEString )
            // InternalRulesDsl.g:279:5: lv_uri_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUriAccess().getUriEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_uri_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUriRule());
            					}
            					set(
            						current,
            						"uri",
            						lv_uri_2_0,
            						"de.dc.workbench.fx.ui.rules.spell.RulesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getUriAccess().getASKeyword_3());
            		
            // InternalRulesDsl.g:300:3: ( (lv_name_4_0= ruleEString ) )
            // InternalRulesDsl.g:301:4: (lv_name_4_0= ruleEString )
            {
            // InternalRulesDsl.g:301:4: (lv_name_4_0= ruleEString )
            // InternalRulesDsl.g:302:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUriAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUriRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"de.dc.workbench.fx.ui.rules.spell.RulesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleUri"


    // $ANTLR start "entryRuleRule"
    // InternalRulesDsl.g:323:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalRulesDsl.g:323:45: (iv_ruleRule= ruleRule EOF )
            // InternalRulesDsl.g:324:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalRulesDsl.g:330:1: ruleRule returns [EObject current=null] : ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' otherlv_4= 'input' ( (lv_condition_5_0= ruleCondition ) ) ( (lv_pattern_6_0= ruleEString ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_condition_5_0 = null;

        AntlrDatatypeRuleToken lv_pattern_6_0 = null;



        	enterRule();

        try {
            // InternalRulesDsl.g:336:2: ( ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' otherlv_4= 'input' ( (lv_condition_5_0= ruleCondition ) ) ( (lv_pattern_6_0= ruleEString ) ) ) )
            // InternalRulesDsl.g:337:2: ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' otherlv_4= 'input' ( (lv_condition_5_0= ruleCondition ) ) ( (lv_pattern_6_0= ruleEString ) ) )
            {
            // InternalRulesDsl.g:337:2: ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' otherlv_4= 'input' ( (lv_condition_5_0= ruleCondition ) ) ( (lv_pattern_6_0= ruleEString ) ) )
            // InternalRulesDsl.g:338:3: () otherlv_1= 'RULE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' otherlv_4= 'input' ( (lv_condition_5_0= ruleCondition ) ) ( (lv_pattern_6_0= ruleEString ) )
            {
            // InternalRulesDsl.g:338:3: ()
            // InternalRulesDsl.g:339:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRuleAccess().getRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getRULEKeyword_1());
            		
            // InternalRulesDsl.g:349:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRulesDsl.g:350:4: (lv_name_2_0= ruleEString )
            {
            // InternalRulesDsl.g:350:4: (lv_name_2_0= ruleEString )
            // InternalRulesDsl.g:351:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.dc.workbench.fx.ui.rules.spell.RulesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getInputKeyword_4());
            		
            // InternalRulesDsl.g:376:3: ( (lv_condition_5_0= ruleCondition ) )
            // InternalRulesDsl.g:377:4: (lv_condition_5_0= ruleCondition )
            {
            // InternalRulesDsl.g:377:4: (lv_condition_5_0= ruleCondition )
            // InternalRulesDsl.g:378:5: lv_condition_5_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_condition_5_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_5_0,
            						"de.dc.workbench.fx.ui.rules.spell.RulesDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRulesDsl.g:395:3: ( (lv_pattern_6_0= ruleEString ) )
            // InternalRulesDsl.g:396:4: (lv_pattern_6_0= ruleEString )
            {
            // InternalRulesDsl.g:396:4: (lv_pattern_6_0= ruleEString )
            // InternalRulesDsl.g:397:5: lv_pattern_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getPatternEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_pattern_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_6_0,
            						"de.dc.workbench.fx.ui.rules.spell.RulesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRuleSet"
    // InternalRulesDsl.g:418:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // InternalRulesDsl.g:418:48: (iv_ruleRuleSet= ruleRuleSet EOF )
            // InternalRulesDsl.g:419:2: iv_ruleRuleSet= ruleRuleSet EOF
            {
             newCompositeNode(grammarAccess.getRuleSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleSet=ruleRuleSet();

            state._fsp--;

             current =iv_ruleRuleSet; 
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
    // $ANTLR end "entryRuleRuleSet"


    // $ANTLR start "ruleRuleSet"
    // InternalRulesDsl.g:425:1: ruleRuleSet returns [EObject current=null] : ( () otherlv_1= 'RULESET' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'WHEN' ( ( ruleEString ) ) (otherlv_5= 'AND' ( ( ruleEString ) ) )* )? (otherlv_7= 'THEN' ( ( ruleEString ) ) )? otherlv_9= 'END' ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRulesDsl.g:431:2: ( ( () otherlv_1= 'RULESET' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'WHEN' ( ( ruleEString ) ) (otherlv_5= 'AND' ( ( ruleEString ) ) )* )? (otherlv_7= 'THEN' ( ( ruleEString ) ) )? otherlv_9= 'END' ) )
            // InternalRulesDsl.g:432:2: ( () otherlv_1= 'RULESET' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'WHEN' ( ( ruleEString ) ) (otherlv_5= 'AND' ( ( ruleEString ) ) )* )? (otherlv_7= 'THEN' ( ( ruleEString ) ) )? otherlv_9= 'END' )
            {
            // InternalRulesDsl.g:432:2: ( () otherlv_1= 'RULESET' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'WHEN' ( ( ruleEString ) ) (otherlv_5= 'AND' ( ( ruleEString ) ) )* )? (otherlv_7= 'THEN' ( ( ruleEString ) ) )? otherlv_9= 'END' )
            // InternalRulesDsl.g:433:3: () otherlv_1= 'RULESET' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'WHEN' ( ( ruleEString ) ) (otherlv_5= 'AND' ( ( ruleEString ) ) )* )? (otherlv_7= 'THEN' ( ( ruleEString ) ) )? otherlv_9= 'END'
            {
            // InternalRulesDsl.g:433:3: ()
            // InternalRulesDsl.g:434:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRuleSetAccess().getRuleSetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleSetAccess().getRULESETKeyword_1());
            		
            // InternalRulesDsl.g:444:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRulesDsl.g:445:4: (lv_name_2_0= ruleEString )
            {
            // InternalRulesDsl.g:445:4: (lv_name_2_0= ruleEString )
            // InternalRulesDsl.g:446:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRuleSetAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleSetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.dc.workbench.fx.ui.rules.spell.RulesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRulesDsl.g:463:3: (otherlv_3= 'WHEN' ( ( ruleEString ) ) (otherlv_5= 'AND' ( ( ruleEString ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRulesDsl.g:464:4: otherlv_3= 'WHEN' ( ( ruleEString ) ) (otherlv_5= 'AND' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getRuleSetAccess().getWHENKeyword_3_0());
                    			
                    // InternalRulesDsl.g:468:4: ( ( ruleEString ) )
                    // InternalRulesDsl.g:469:5: ( ruleEString )
                    {
                    // InternalRulesDsl.g:469:5: ( ruleEString )
                    // InternalRulesDsl.g:470:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleSetRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRuleSetAccess().getRulesRuleCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRulesDsl.g:484:4: (otherlv_5= 'AND' ( ( ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==18) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRulesDsl.g:485:5: otherlv_5= 'AND' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getRuleSetAccess().getANDKeyword_3_2_0());
                    	    				
                    	    // InternalRulesDsl.g:489:5: ( ( ruleEString ) )
                    	    // InternalRulesDsl.g:490:6: ( ruleEString )
                    	    {
                    	    // InternalRulesDsl.g:490:6: ( ruleEString )
                    	    // InternalRulesDsl.g:491:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRuleSetRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRuleSetAccess().getRulesRuleCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRulesDsl.g:507:3: (otherlv_7= 'THEN' ( ( ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRulesDsl.g:508:4: otherlv_7= 'THEN' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getRuleSetAccess().getTHENKeyword_4_0());
                    			
                    // InternalRulesDsl.g:512:4: ( ( ruleEString ) )
                    // InternalRulesDsl.g:513:5: ( ruleEString )
                    {
                    // InternalRulesDsl.g:513:5: ( ruleEString )
                    // InternalRulesDsl.g:514:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleSetRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRuleSetAccess().getOutputOutputCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRuleSetAccess().getENDKeyword_5());
            		

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
    // $ANTLR end "ruleRuleSet"


    // $ANTLR start "entryRuleEString"
    // InternalRulesDsl.g:537:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRulesDsl.g:537:47: (iv_ruleEString= ruleEString EOF )
            // InternalRulesDsl.g:538:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRulesDsl.g:544:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRulesDsl.g:550:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRulesDsl.g:551:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRulesDsl.g:551:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRulesDsl.g:552:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRulesDsl.g:560:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleOutput"
    // InternalRulesDsl.g:571:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalRulesDsl.g:571:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalRulesDsl.g:572:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalRulesDsl.g:578:1: ruleOutput returns [EObject current=null] : ( () otherlv_1= 'OUTPUT' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' (otherlv_4= 'value' otherlv_5= ':' ( (lv_value_6_0= ruleEString ) ) )? (otherlv_7= 'model' otherlv_8= ':' ( ( ruleEString ) ) otherlv_10= ',' )? (otherlv_11= 'mapper' otherlv_12= ':' ( ( ruleEString ) ) )? otherlv_14= ')' (otherlv_15= '{' ( ( (lv_fields_16_0= ruleOutputField ) ) ( (lv_fields_17_0= ruleOutputField ) )* )? otherlv_18= '}' )? ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        EObject lv_fields_16_0 = null;

        EObject lv_fields_17_0 = null;



        	enterRule();

        try {
            // InternalRulesDsl.g:584:2: ( ( () otherlv_1= 'OUTPUT' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' (otherlv_4= 'value' otherlv_5= ':' ( (lv_value_6_0= ruleEString ) ) )? (otherlv_7= 'model' otherlv_8= ':' ( ( ruleEString ) ) otherlv_10= ',' )? (otherlv_11= 'mapper' otherlv_12= ':' ( ( ruleEString ) ) )? otherlv_14= ')' (otherlv_15= '{' ( ( (lv_fields_16_0= ruleOutputField ) ) ( (lv_fields_17_0= ruleOutputField ) )* )? otherlv_18= '}' )? ) )
            // InternalRulesDsl.g:585:2: ( () otherlv_1= 'OUTPUT' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' (otherlv_4= 'value' otherlv_5= ':' ( (lv_value_6_0= ruleEString ) ) )? (otherlv_7= 'model' otherlv_8= ':' ( ( ruleEString ) ) otherlv_10= ',' )? (otherlv_11= 'mapper' otherlv_12= ':' ( ( ruleEString ) ) )? otherlv_14= ')' (otherlv_15= '{' ( ( (lv_fields_16_0= ruleOutputField ) ) ( (lv_fields_17_0= ruleOutputField ) )* )? otherlv_18= '}' )? )
            {
            // InternalRulesDsl.g:585:2: ( () otherlv_1= 'OUTPUT' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' (otherlv_4= 'value' otherlv_5= ':' ( (lv_value_6_0= ruleEString ) ) )? (otherlv_7= 'model' otherlv_8= ':' ( ( ruleEString ) ) otherlv_10= ',' )? (otherlv_11= 'mapper' otherlv_12= ':' ( ( ruleEString ) ) )? otherlv_14= ')' (otherlv_15= '{' ( ( (lv_fields_16_0= ruleOutputField ) ) ( (lv_fields_17_0= ruleOutputField ) )* )? otherlv_18= '}' )? )
            // InternalRulesDsl.g:586:3: () otherlv_1= 'OUTPUT' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' (otherlv_4= 'value' otherlv_5= ':' ( (lv_value_6_0= ruleEString ) ) )? (otherlv_7= 'model' otherlv_8= ':' ( ( ruleEString ) ) otherlv_10= ',' )? (otherlv_11= 'mapper' otherlv_12= ':' ( ( ruleEString ) ) )? otherlv_14= ')' (otherlv_15= '{' ( ( (lv_fields_16_0= ruleOutputField ) ) ( (lv_fields_17_0= ruleOutputField ) )* )? otherlv_18= '}' )?
            {
            // InternalRulesDsl.g:586:3: ()
            // InternalRulesDsl.g:587:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputAccess().getOutputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getOUTPUTKeyword_1());
            		
            // InternalRulesDsl.g:597:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRulesDsl.g:598:4: (lv_name_2_0= ruleEString )
            {
            // InternalRulesDsl.g:598:4: (lv_name_2_0= ruleEString )
            // InternalRulesDsl.g:599:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOutputAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.dc.workbench.fx.ui.rules.spell.RulesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRulesDsl.g:620:3: (otherlv_4= 'value' otherlv_5= ':' ( (lv_value_6_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRulesDsl.g:621:4: otherlv_4= 'value' otherlv_5= ':' ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getOutputAccess().getValueKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getOutputAccess().getColonKeyword_4_1());
                    			
                    // InternalRulesDsl.g:629:4: ( (lv_value_6_0= ruleEString ) )
                    // InternalRulesDsl.g:630:5: (lv_value_6_0= ruleEString )
                    {
                    // InternalRulesDsl.g:630:5: (lv_value_6_0= ruleEString )
                    // InternalRulesDsl.g:631:6: lv_value_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOutputAccess().getValueEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_value_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"de.dc.workbench.fx.ui.rules.spell.RulesDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRulesDsl.g:649:3: (otherlv_7= 'model' otherlv_8= ':' ( ( ruleEString ) ) otherlv_10= ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRulesDsl.g:650:4: otherlv_7= 'model' otherlv_8= ':' ( ( ruleEString ) ) otherlv_10= ','
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getOutputAccess().getModelKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getOutputAccess().getColonKeyword_5_1());
                    			
                    // InternalRulesDsl.g:658:4: ( ( ruleEString ) )
                    // InternalRulesDsl.g:659:5: ( ruleEString )
                    {
                    // InternalRulesDsl.g:659:5: ( ruleEString )
                    // InternalRulesDsl.g:660:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOutputAccess().getModelUriCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_10, grammarAccess.getOutputAccess().getCommaKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalRulesDsl.g:679:3: (otherlv_11= 'mapper' otherlv_12= ':' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRulesDsl.g:680:4: otherlv_11= 'mapper' otherlv_12= ':' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,27,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getOutputAccess().getMapperKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getOutputAccess().getColonKeyword_6_1());
                    			
                    // InternalRulesDsl.g:688:4: ( ( ruleEString ) )
                    // InternalRulesDsl.g:689:5: ( ruleEString )
                    {
                    // InternalRulesDsl.g:689:5: ( ruleEString )
                    // InternalRulesDsl.g:690:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOutputAccess().getMapperUriCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_14, grammarAccess.getOutputAccess().getRightParenthesisKeyword_7());
            		
            // InternalRulesDsl.g:709:3: (otherlv_15= '{' ( ( (lv_fields_16_0= ruleOutputField ) ) ( (lv_fields_17_0= ruleOutputField ) )* )? otherlv_18= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRulesDsl.g:710:4: otherlv_15= '{' ( ( (lv_fields_16_0= ruleOutputField ) ) ( (lv_fields_17_0= ruleOutputField ) )* )? otherlv_18= '}'
                    {
                    otherlv_15=(Token)match(input,29,FOLLOW_23); 

                    				newLeafNode(otherlv_15, grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_8_0());
                    			
                    // InternalRulesDsl.g:714:4: ( ( (lv_fields_16_0= ruleOutputField ) ) ( (lv_fields_17_0= ruleOutputField ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalRulesDsl.g:715:5: ( (lv_fields_16_0= ruleOutputField ) ) ( (lv_fields_17_0= ruleOutputField ) )*
                            {
                            // InternalRulesDsl.g:715:5: ( (lv_fields_16_0= ruleOutputField ) )
                            // InternalRulesDsl.g:716:6: (lv_fields_16_0= ruleOutputField )
                            {
                            // InternalRulesDsl.g:716:6: (lv_fields_16_0= ruleOutputField )
                            // InternalRulesDsl.g:717:7: lv_fields_16_0= ruleOutputField
                            {

                            							newCompositeNode(grammarAccess.getOutputAccess().getFieldsOutputFieldParserRuleCall_8_1_0_0());
                            						
                            pushFollow(FOLLOW_23);
                            lv_fields_16_0=ruleOutputField();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getOutputRule());
                            							}
                            							add(
                            								current,
                            								"fields",
                            								lv_fields_16_0,
                            								"de.dc.workbench.fx.ui.rules.spell.RulesDsl.OutputField");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalRulesDsl.g:734:5: ( (lv_fields_17_0= ruleOutputField ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // InternalRulesDsl.g:735:6: (lv_fields_17_0= ruleOutputField )
                            	    {
                            	    // InternalRulesDsl.g:735:6: (lv_fields_17_0= ruleOutputField )
                            	    // InternalRulesDsl.g:736:7: lv_fields_17_0= ruleOutputField
                            	    {

                            	    							newCompositeNode(grammarAccess.getOutputAccess().getFieldsOutputFieldParserRuleCall_8_1_1_0());
                            	    						
                            	    pushFollow(FOLLOW_23);
                            	    lv_fields_17_0=ruleOutputField();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getOutputRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"fields",
                            	    								lv_fields_17_0,
                            	    								"de.dc.workbench.fx.ui.rules.spell.RulesDsl.OutputField");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_18=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_8_2());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleOutputField"
    // InternalRulesDsl.g:763:1: entryRuleOutputField returns [EObject current=null] : iv_ruleOutputField= ruleOutputField EOF ;
    public final EObject entryRuleOutputField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputField = null;


        try {
            // InternalRulesDsl.g:763:52: (iv_ruleOutputField= ruleOutputField EOF )
            // InternalRulesDsl.g:764:2: iv_ruleOutputField= ruleOutputField EOF
            {
             newCompositeNode(grammarAccess.getOutputFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputField=ruleOutputField();

            state._fsp--;

             current =iv_ruleOutputField; 
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
    // $ANTLR end "entryRuleOutputField"


    // $ANTLR start "ruleOutputField"
    // InternalRulesDsl.g:770:1: ruleOutputField returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleOutputField() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRulesDsl.g:776:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalRulesDsl.g:777:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalRulesDsl.g:777:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            // InternalRulesDsl.g:778:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalRulesDsl.g:778:3: ()
            // InternalRulesDsl.g:779:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputFieldAccess().getOutputFieldAction_0(),
            					current);
            			

            }

            // InternalRulesDsl.g:785:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRulesDsl.g:786:4: (lv_name_1_0= ruleEString )
            {
            // InternalRulesDsl.g:786:4: (lv_name_1_0= ruleEString )
            // InternalRulesDsl.g:787:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOutputFieldAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputFieldRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.dc.workbench.fx.ui.rules.spell.RulesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputFieldAccess().getEqualsSignKeyword_2());
            		
            // InternalRulesDsl.g:808:3: ( (lv_value_3_0= ruleEString ) )
            // InternalRulesDsl.g:809:4: (lv_value_3_0= ruleEString )
            {
            // InternalRulesDsl.g:809:4: (lv_value_3_0= ruleEString )
            // InternalRulesDsl.g:810:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOutputFieldAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.dc.workbench.fx.ui.rules.spell.RulesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleOutputField"


    // $ANTLR start "ruleCondition"
    // InternalRulesDsl.g:831:1: ruleCondition returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= 'EQUALS_IGNORE_CASE' ) | (enumLiteral_2= 'CONTAINS' ) | (enumLiteral_3= 'COTNAINS_IGNORE_CASE' ) | (enumLiteral_4= 'GREATER_THAN' ) | (enumLiteral_5= 'GREATER_THAN_EQUALS' ) | (enumLiteral_6= 'SMALL_THAN' ) | (enumLiteral_7= 'SMALL_THAN_EQUALS' ) | (enumLiteral_8= 'START_WITH' ) | (enumLiteral_9= 'START_IGNORE_CASE_WITH' ) | (enumLiteral_10= 'END_WITH' ) | (enumLiteral_11= 'END_IGNORE_CASE_WITH' ) | (enumLiteral_12= 'OR' ) | (enumLiteral_13= 'AND' ) ) ;
    public final Enumerator ruleCondition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;


        	enterRule();

        try {
            // InternalRulesDsl.g:837:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= 'EQUALS_IGNORE_CASE' ) | (enumLiteral_2= 'CONTAINS' ) | (enumLiteral_3= 'COTNAINS_IGNORE_CASE' ) | (enumLiteral_4= 'GREATER_THAN' ) | (enumLiteral_5= 'GREATER_THAN_EQUALS' ) | (enumLiteral_6= 'SMALL_THAN' ) | (enumLiteral_7= 'SMALL_THAN_EQUALS' ) | (enumLiteral_8= 'START_WITH' ) | (enumLiteral_9= 'START_IGNORE_CASE_WITH' ) | (enumLiteral_10= 'END_WITH' ) | (enumLiteral_11= 'END_IGNORE_CASE_WITH' ) | (enumLiteral_12= 'OR' ) | (enumLiteral_13= 'AND' ) ) )
            // InternalRulesDsl.g:838:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= 'EQUALS_IGNORE_CASE' ) | (enumLiteral_2= 'CONTAINS' ) | (enumLiteral_3= 'COTNAINS_IGNORE_CASE' ) | (enumLiteral_4= 'GREATER_THAN' ) | (enumLiteral_5= 'GREATER_THAN_EQUALS' ) | (enumLiteral_6= 'SMALL_THAN' ) | (enumLiteral_7= 'SMALL_THAN_EQUALS' ) | (enumLiteral_8= 'START_WITH' ) | (enumLiteral_9= 'START_IGNORE_CASE_WITH' ) | (enumLiteral_10= 'END_WITH' ) | (enumLiteral_11= 'END_IGNORE_CASE_WITH' ) | (enumLiteral_12= 'OR' ) | (enumLiteral_13= 'AND' ) )
            {
            // InternalRulesDsl.g:838:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= 'EQUALS_IGNORE_CASE' ) | (enumLiteral_2= 'CONTAINS' ) | (enumLiteral_3= 'COTNAINS_IGNORE_CASE' ) | (enumLiteral_4= 'GREATER_THAN' ) | (enumLiteral_5= 'GREATER_THAN_EQUALS' ) | (enumLiteral_6= 'SMALL_THAN' ) | (enumLiteral_7= 'SMALL_THAN_EQUALS' ) | (enumLiteral_8= 'START_WITH' ) | (enumLiteral_9= 'START_IGNORE_CASE_WITH' ) | (enumLiteral_10= 'END_WITH' ) | (enumLiteral_11= 'END_IGNORE_CASE_WITH' ) | (enumLiteral_12= 'OR' ) | (enumLiteral_13= 'AND' ) )
            int alt19=14;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt19=1;
                }
                break;
            case 32:
                {
                alt19=2;
                }
                break;
            case 33:
                {
                alt19=3;
                }
                break;
            case 34:
                {
                alt19=4;
                }
                break;
            case 35:
                {
                alt19=5;
                }
                break;
            case 36:
                {
                alt19=6;
                }
                break;
            case 37:
                {
                alt19=7;
                }
                break;
            case 38:
                {
                alt19=8;
                }
                break;
            case 39:
                {
                alt19=9;
                }
                break;
            case 40:
                {
                alt19=10;
                }
                break;
            case 41:
                {
                alt19=11;
                }
                break;
            case 42:
                {
                alt19=12;
                }
                break;
            case 43:
                {
                alt19=13;
                }
                break;
            case 18:
                {
                alt19=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalRulesDsl.g:839:3: (enumLiteral_0= '=' )
                    {
                    // InternalRulesDsl.g:839:3: (enumLiteral_0= '=' )
                    // InternalRulesDsl.g:840:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getConditionAccess().getEQUALSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesDsl.g:847:3: (enumLiteral_1= 'EQUALS_IGNORE_CASE' )
                    {
                    // InternalRulesDsl.g:847:3: (enumLiteral_1= 'EQUALS_IGNORE_CASE' )
                    // InternalRulesDsl.g:848:4: enumLiteral_1= 'EQUALS_IGNORE_CASE'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getEQUALS_IGNORE_CASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getConditionAccess().getEQUALS_IGNORE_CASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRulesDsl.g:855:3: (enumLiteral_2= 'CONTAINS' )
                    {
                    // InternalRulesDsl.g:855:3: (enumLiteral_2= 'CONTAINS' )
                    // InternalRulesDsl.g:856:4: enumLiteral_2= 'CONTAINS'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getCONTAINSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getConditionAccess().getCONTAINSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRulesDsl.g:863:3: (enumLiteral_3= 'COTNAINS_IGNORE_CASE' )
                    {
                    // InternalRulesDsl.g:863:3: (enumLiteral_3= 'COTNAINS_IGNORE_CASE' )
                    // InternalRulesDsl.g:864:4: enumLiteral_3= 'COTNAINS_IGNORE_CASE'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getCOTNAINS_IGNORE_CASEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getConditionAccess().getCOTNAINS_IGNORE_CASEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRulesDsl.g:871:3: (enumLiteral_4= 'GREATER_THAN' )
                    {
                    // InternalRulesDsl.g:871:3: (enumLiteral_4= 'GREATER_THAN' )
                    // InternalRulesDsl.g:872:4: enumLiteral_4= 'GREATER_THAN'
                    {
                    enumLiteral_4=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getGREATER_THANEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getConditionAccess().getGREATER_THANEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRulesDsl.g:879:3: (enumLiteral_5= 'GREATER_THAN_EQUALS' )
                    {
                    // InternalRulesDsl.g:879:3: (enumLiteral_5= 'GREATER_THAN_EQUALS' )
                    // InternalRulesDsl.g:880:4: enumLiteral_5= 'GREATER_THAN_EQUALS'
                    {
                    enumLiteral_5=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getGREATER_THAN_EQUALSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getConditionAccess().getGREATER_THAN_EQUALSEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRulesDsl.g:887:3: (enumLiteral_6= 'SMALL_THAN' )
                    {
                    // InternalRulesDsl.g:887:3: (enumLiteral_6= 'SMALL_THAN' )
                    // InternalRulesDsl.g:888:4: enumLiteral_6= 'SMALL_THAN'
                    {
                    enumLiteral_6=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getSMALL_THANEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getConditionAccess().getSMALL_THANEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRulesDsl.g:895:3: (enumLiteral_7= 'SMALL_THAN_EQUALS' )
                    {
                    // InternalRulesDsl.g:895:3: (enumLiteral_7= 'SMALL_THAN_EQUALS' )
                    // InternalRulesDsl.g:896:4: enumLiteral_7= 'SMALL_THAN_EQUALS'
                    {
                    enumLiteral_7=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getSMALL_THAN_EQUALSEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getConditionAccess().getSMALL_THAN_EQUALSEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRulesDsl.g:903:3: (enumLiteral_8= 'START_WITH' )
                    {
                    // InternalRulesDsl.g:903:3: (enumLiteral_8= 'START_WITH' )
                    // InternalRulesDsl.g:904:4: enumLiteral_8= 'START_WITH'
                    {
                    enumLiteral_8=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getSTART_WITHEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getConditionAccess().getSTART_WITHEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalRulesDsl.g:911:3: (enumLiteral_9= 'START_IGNORE_CASE_WITH' )
                    {
                    // InternalRulesDsl.g:911:3: (enumLiteral_9= 'START_IGNORE_CASE_WITH' )
                    // InternalRulesDsl.g:912:4: enumLiteral_9= 'START_IGNORE_CASE_WITH'
                    {
                    enumLiteral_9=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getSTART_IGNORE_CASE_WITHEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getConditionAccess().getSTART_IGNORE_CASE_WITHEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalRulesDsl.g:919:3: (enumLiteral_10= 'END_WITH' )
                    {
                    // InternalRulesDsl.g:919:3: (enumLiteral_10= 'END_WITH' )
                    // InternalRulesDsl.g:920:4: enumLiteral_10= 'END_WITH'
                    {
                    enumLiteral_10=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getEND_WITHEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getConditionAccess().getEND_WITHEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalRulesDsl.g:927:3: (enumLiteral_11= 'END_IGNORE_CASE_WITH' )
                    {
                    // InternalRulesDsl.g:927:3: (enumLiteral_11= 'END_IGNORE_CASE_WITH' )
                    // InternalRulesDsl.g:928:4: enumLiteral_11= 'END_IGNORE_CASE_WITH'
                    {
                    enumLiteral_11=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getEND_IGNORE_CASE_WITHEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getConditionAccess().getEND_IGNORE_CASE_WITHEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalRulesDsl.g:935:3: (enumLiteral_12= 'OR' )
                    {
                    // InternalRulesDsl.g:935:3: (enumLiteral_12= 'OR' )
                    // InternalRulesDsl.g:936:4: enumLiteral_12= 'OR'
                    {
                    enumLiteral_12=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getOREnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getConditionAccess().getOREnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalRulesDsl.g:943:3: (enumLiteral_13= 'AND' )
                    {
                    // InternalRulesDsl.g:943:3: (enumLiteral_13= 'AND' )
                    // InternalRulesDsl.g:944:4: enumLiteral_13= 'AND'
                    {
                    enumLiteral_13=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getANDEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getConditionAccess().getANDEnumLiteralDeclaration_13());
                    			

                    }


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
    // $ANTLR end "ruleCondition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000212802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000212002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000210002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000FFF80040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001A800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001A000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});

}