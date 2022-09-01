package br.edu.unijui.gca.smartce.parser.antlr.internal;

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
import br.edu.unijui.gca.smartce.services.SmartCEGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmartCEParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'Contract'", "'{'", "'beginDate'", "'='", "'dueDate'", "'parties'", "'application'", "'process'", "'}'", "'variables'", "'when'", "'('", "')'", "'check'", "'AND'", "'OR'", "'NOT'", "'Timeout'", "'OperationLimit'", "'by'", "'BusinessDay'", "'to'", "'TimeInterval'", "'SessionInterval'", "'from'", "'MessageContent'", "'<='", "'>='", "'>'", "'<'", "'!='", "'=='", "','", "'BusinessAction'", "'EventLog'", "'&&'", "'||'", "'!'", "'is'", "'as'", "'+'", "'-'", "'*'", "'/'", "'.'", "'.*'", "'push'", "'poll'", "'write'", "'read'", "'request'", "'response'", "'Sunday'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Second'", "'Minute'", "'Hour'", "'Day'", "'Week'", "'Month'", "'Year'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSmartCEParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmartCEParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmartCEParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmartCE.g"; }



     	private SmartCEGrammarAccess grammarAccess;

        public InternalSmartCEParser(TokenStream input, SmartCEGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SmartCEGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSmartCE.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSmartCE.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalSmartCE.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalSmartCE.g:72:1: ruleModel returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_contracts_2_0= ruleContract ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_contracts_2_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:78:2: ( ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_contracts_2_0= ruleContract ) )* ) )
            // InternalSmartCE.g:79:2: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_contracts_2_0= ruleContract ) )* )
            {
            // InternalSmartCE.g:79:2: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_contracts_2_0= ruleContract ) )* )
            // InternalSmartCE.g:80:3: () ( (lv_imports_1_0= ruleImport ) )* ( (lv_contracts_2_0= ruleContract ) )*
            {
            // InternalSmartCE.g:80:3: ()
            // InternalSmartCE.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            // InternalSmartCE.g:87:3: ( (lv_imports_1_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSmartCE.g:88:4: (lv_imports_1_0= ruleImport )
            	    {
            	    // InternalSmartCE.g:88:4: (lv_imports_1_0= ruleImport )
            	    // InternalSmartCE.g:89:5: lv_imports_1_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_1_0,
            	    						"br.edu.unijui.gca.smartce.SmartCE.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSmartCE.g:106:3: ( (lv_contracts_2_0= ruleContract ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSmartCE.g:107:4: (lv_contracts_2_0= ruleContract )
            	    {
            	    // InternalSmartCE.g:107:4: (lv_contracts_2_0= ruleContract )
            	    // InternalSmartCE.g:108:5: lv_contracts_2_0= ruleContract
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getContractsContractParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_contracts_2_0=ruleContract();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contracts",
            	    						lv_contracts_2_0,
            	    						"br.edu.unijui.gca.smartce.SmartCE.Contract");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // InternalSmartCE.g:129:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalSmartCE.g:129:47: (iv_ruleImport= ruleImport EOF )
            // InternalSmartCE.g:130:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalSmartCE.g:136:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:142:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalSmartCE.g:143:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalSmartCE.g:143:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalSmartCE.g:144:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalSmartCE.g:148:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalSmartCE.g:149:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalSmartCE.g:149:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalSmartCE.g:150:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"br.edu.unijui.gca.smartce.SmartCE.QualifiedNameWithWildcard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleContract"
    // InternalSmartCE.g:171:1: entryRuleContract returns [EObject current=null] : iv_ruleContract= ruleContract EOF ;
    public final EObject entryRuleContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContract = null;


        try {
            // InternalSmartCE.g:171:49: (iv_ruleContract= ruleContract EOF )
            // InternalSmartCE.g:172:2: iv_ruleContract= ruleContract EOF
            {
             newCompositeNode(grammarAccess.getContractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContract=ruleContract();

            state._fsp--;

             current =iv_ruleContract; 
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
    // $ANTLR end "entryRuleContract"


    // $ANTLR start "ruleContract"
    // InternalSmartCE.g:178:1: ruleContract returns [EObject current=null] : (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= ruleExpression ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= ruleExpression ) ) otherlv_9= 'parties' otherlv_10= '{' otherlv_11= 'application' otherlv_12= '=' ( (lv_application_13_0= ruleApplication ) ) otherlv_14= 'process' otherlv_15= '=' ( (lv_process_16_0= ruleProcess ) ) otherlv_17= '}' otherlv_18= 'variables' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) )* otherlv_21= '}' otherlv_22= '}' ) ;
    public final EObject ruleContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_beginDate_5_0 = null;

        EObject lv_dueDate_8_0 = null;

        EObject lv_application_13_0 = null;

        EObject lv_process_16_0 = null;

        EObject lv_variables_20_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:184:2: ( (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= ruleExpression ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= ruleExpression ) ) otherlv_9= 'parties' otherlv_10= '{' otherlv_11= 'application' otherlv_12= '=' ( (lv_application_13_0= ruleApplication ) ) otherlv_14= 'process' otherlv_15= '=' ( (lv_process_16_0= ruleProcess ) ) otherlv_17= '}' otherlv_18= 'variables' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) )* otherlv_21= '}' otherlv_22= '}' ) )
            // InternalSmartCE.g:185:2: (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= ruleExpression ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= ruleExpression ) ) otherlv_9= 'parties' otherlv_10= '{' otherlv_11= 'application' otherlv_12= '=' ( (lv_application_13_0= ruleApplication ) ) otherlv_14= 'process' otherlv_15= '=' ( (lv_process_16_0= ruleProcess ) ) otherlv_17= '}' otherlv_18= 'variables' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) )* otherlv_21= '}' otherlv_22= '}' )
            {
            // InternalSmartCE.g:185:2: (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= ruleExpression ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= ruleExpression ) ) otherlv_9= 'parties' otherlv_10= '{' otherlv_11= 'application' otherlv_12= '=' ( (lv_application_13_0= ruleApplication ) ) otherlv_14= 'process' otherlv_15= '=' ( (lv_process_16_0= ruleProcess ) ) otherlv_17= '}' otherlv_18= 'variables' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) )* otherlv_21= '}' otherlv_22= '}' )
            // InternalSmartCE.g:186:3: otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= ruleExpression ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= ruleExpression ) ) otherlv_9= 'parties' otherlv_10= '{' otherlv_11= 'application' otherlv_12= '=' ( (lv_application_13_0= ruleApplication ) ) otherlv_14= 'process' otherlv_15= '=' ( (lv_process_16_0= ruleProcess ) ) otherlv_17= '}' otherlv_18= 'variables' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) )* otherlv_21= '}' otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getContractAccess().getContractKeyword_0());
            		
            // InternalSmartCE.g:190:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCE.g:191:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCE.g:191:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCE.g:192:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContractAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContractRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getContractAccess().getBeginDateKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getContractAccess().getEqualsSignKeyword_4());
            		
            // InternalSmartCE.g:220:3: ( (lv_beginDate_5_0= ruleExpression ) )
            // InternalSmartCE.g:221:4: (lv_beginDate_5_0= ruleExpression )
            {
            // InternalSmartCE.g:221:4: (lv_beginDate_5_0= ruleExpression )
            // InternalSmartCE.g:222:5: lv_beginDate_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getContractAccess().getBeginDateExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_beginDate_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"beginDate",
            						lv_beginDate_5_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getContractAccess().getDueDateKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getContractAccess().getEqualsSignKeyword_7());
            		
            // InternalSmartCE.g:247:3: ( (lv_dueDate_8_0= ruleExpression ) )
            // InternalSmartCE.g:248:4: (lv_dueDate_8_0= ruleExpression )
            {
            // InternalSmartCE.g:248:4: (lv_dueDate_8_0= ruleExpression )
            // InternalSmartCE.g:249:5: lv_dueDate_8_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getContractAccess().getDueDateExpressionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_dueDate_8_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"dueDate",
            						lv_dueDate_8_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getContractAccess().getPartiesKeyword_9());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getContractAccess().getApplicationKeyword_11());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getContractAccess().getEqualsSignKeyword_12());
            		
            // InternalSmartCE.g:282:3: ( (lv_application_13_0= ruleApplication ) )
            // InternalSmartCE.g:283:4: (lv_application_13_0= ruleApplication )
            {
            // InternalSmartCE.g:283:4: (lv_application_13_0= ruleApplication )
            // InternalSmartCE.g:284:5: lv_application_13_0= ruleApplication
            {

            					newCompositeNode(grammarAccess.getContractAccess().getApplicationApplicationParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_14);
            lv_application_13_0=ruleApplication();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"application",
            						lv_application_13_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Application");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_14, grammarAccess.getContractAccess().getProcessKeyword_14());
            		
            otherlv_15=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_15, grammarAccess.getContractAccess().getEqualsSignKeyword_15());
            		
            // InternalSmartCE.g:309:3: ( (lv_process_16_0= ruleProcess ) )
            // InternalSmartCE.g:310:4: (lv_process_16_0= ruleProcess )
            {
            // InternalSmartCE.g:310:4: (lv_process_16_0= ruleProcess )
            // InternalSmartCE.g:311:5: lv_process_16_0= ruleProcess
            {

            					newCompositeNode(grammarAccess.getContractAccess().getProcessProcessParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_15);
            lv_process_16_0=ruleProcess();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"process",
            						lv_process_16_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Process");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_17, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_17());
            		
            otherlv_18=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_18, grammarAccess.getContractAccess().getVariablesKeyword_18());
            		
            otherlv_19=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_19, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_19());
            		
            // InternalSmartCE.g:340:3: ( (lv_variables_20_0= ruleVariable ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmartCE.g:341:4: (lv_variables_20_0= ruleVariable )
            	    {
            	    // InternalSmartCE.g:341:4: (lv_variables_20_0= ruleVariable )
            	    // InternalSmartCE.g:342:5: lv_variables_20_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getContractAccess().getVariablesVariableParserRuleCall_20_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_variables_20_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContractRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_20_0,
            	    						"br.edu.unijui.gca.smartce.SmartCE.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_21=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_21, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_21());
            		
            otherlv_22=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_22());
            		

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
    // $ANTLR end "ruleContract"


    // $ANTLR start "entryRuleVariable"
    // InternalSmartCE.g:371:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSmartCE.g:371:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalSmartCE.g:372:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalSmartCE.g:378:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:384:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalSmartCE.g:385:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalSmartCE.g:385:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalSmartCE.g:386:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalSmartCE.g:386:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSmartCE.g:387:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSmartCE.g:387:4: (lv_name_0_0= RULE_ID )
            // InternalSmartCE.g:388:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
            		
            // InternalSmartCE.g:408:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalSmartCE.g:409:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalSmartCE.g:409:4: (lv_expression_2_0= ruleExpression )
            // InternalSmartCE.g:410:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Expression");
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleCondition"
    // InternalSmartCE.g:431:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalSmartCE.g:431:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalSmartCE.g:432:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalSmartCE.g:438:1: ruleCondition returns [EObject current=null] : (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_BusinessRule_0 = null;

        EObject this_CompositeCondition_1 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:444:2: ( (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition ) )
            // InternalSmartCE.g:445:2: (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition )
            {
            // InternalSmartCE.g:445:2: (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSmartCE.g:446:3: this_BusinessRule_0= ruleBusinessRule
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getBusinessRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BusinessRule_0=ruleBusinessRule();

                    state._fsp--;


                    			current = this_BusinessRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:455:3: this_CompositeCondition_1= ruleCompositeCondition
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getCompositeConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeCondition_1=ruleCompositeCondition();

                    state._fsp--;


                    			current = this_CompositeCondition_1;
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleBusinessRule"
    // InternalSmartCE.g:467:1: entryRuleBusinessRule returns [EObject current=null] : iv_ruleBusinessRule= ruleBusinessRule EOF ;
    public final EObject entryRuleBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessRule = null;


        try {
            // InternalSmartCE.g:467:53: (iv_ruleBusinessRule= ruleBusinessRule EOF )
            // InternalSmartCE.g:468:2: iv_ruleBusinessRule= ruleBusinessRule EOF
            {
             newCompositeNode(grammarAccess.getBusinessRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBusinessRule=ruleBusinessRule();

            state._fsp--;

             current =iv_ruleBusinessRule; 
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
    // $ANTLR end "entryRuleBusinessRule"


    // $ANTLR start "ruleBusinessRule"
    // InternalSmartCE.g:474:1: ruleBusinessRule returns [EObject current=null] : (this_Timeout_0= ruleTimeout | this_OperationLimit_1= ruleOperationLimit | this_BusinessDay_2= ruleBusinessDay | this_TimeInterval_3= ruleTimeInterval | this_MessageContent_4= ruleMessageContent | this_SessionInterval_5= ruleSessionInterval ) ;
    public final EObject ruleBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject this_Timeout_0 = null;

        EObject this_OperationLimit_1 = null;

        EObject this_BusinessDay_2 = null;

        EObject this_TimeInterval_3 = null;

        EObject this_MessageContent_4 = null;

        EObject this_SessionInterval_5 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:480:2: ( (this_Timeout_0= ruleTimeout | this_OperationLimit_1= ruleOperationLimit | this_BusinessDay_2= ruleBusinessDay | this_TimeInterval_3= ruleTimeInterval | this_MessageContent_4= ruleMessageContent | this_SessionInterval_5= ruleSessionInterval ) )
            // InternalSmartCE.g:481:2: (this_Timeout_0= ruleTimeout | this_OperationLimit_1= ruleOperationLimit | this_BusinessDay_2= ruleBusinessDay | this_TimeInterval_3= ruleTimeInterval | this_MessageContent_4= ruleMessageContent | this_SessionInterval_5= ruleSessionInterval )
            {
            // InternalSmartCE.g:481:2: (this_Timeout_0= ruleTimeout | this_OperationLimit_1= ruleOperationLimit | this_BusinessDay_2= ruleBusinessDay | this_TimeInterval_3= ruleTimeInterval | this_MessageContent_4= ruleMessageContent | this_SessionInterval_5= ruleSessionInterval )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt5=1;
                }
                break;
            case 30:
                {
                alt5=2;
                }
                break;
            case 32:
                {
                alt5=3;
                }
                break;
            case 34:
                {
                alt5=4;
                }
                break;
            case 37:
                {
                alt5=5;
                }
                break;
            case 35:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSmartCE.g:482:3: this_Timeout_0= ruleTimeout
                    {

                    			newCompositeNode(grammarAccess.getBusinessRuleAccess().getTimeoutParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Timeout_0=ruleTimeout();

                    state._fsp--;


                    			current = this_Timeout_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:491:3: this_OperationLimit_1= ruleOperationLimit
                    {

                    			newCompositeNode(grammarAccess.getBusinessRuleAccess().getOperationLimitParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationLimit_1=ruleOperationLimit();

                    state._fsp--;


                    			current = this_OperationLimit_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:500:3: this_BusinessDay_2= ruleBusinessDay
                    {

                    			newCompositeNode(grammarAccess.getBusinessRuleAccess().getBusinessDayParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BusinessDay_2=ruleBusinessDay();

                    state._fsp--;


                    			current = this_BusinessDay_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:509:3: this_TimeInterval_3= ruleTimeInterval
                    {

                    			newCompositeNode(grammarAccess.getBusinessRuleAccess().getTimeIntervalParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeInterval_3=ruleTimeInterval();

                    state._fsp--;


                    			current = this_TimeInterval_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSmartCE.g:518:3: this_MessageContent_4= ruleMessageContent
                    {

                    			newCompositeNode(grammarAccess.getBusinessRuleAccess().getMessageContentParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MessageContent_4=ruleMessageContent();

                    state._fsp--;


                    			current = this_MessageContent_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSmartCE.g:527:3: this_SessionInterval_5= ruleSessionInterval
                    {

                    			newCompositeNode(grammarAccess.getBusinessRuleAccess().getSessionIntervalParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SessionInterval_5=ruleSessionInterval();

                    state._fsp--;


                    			current = this_SessionInterval_5;
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
    // $ANTLR end "ruleBusinessRule"


    // $ANTLR start "entryRuleCompositeCondition"
    // InternalSmartCE.g:539:1: entryRuleCompositeCondition returns [EObject current=null] : iv_ruleCompositeCondition= ruleCompositeCondition EOF ;
    public final EObject entryRuleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCondition = null;


        try {
            // InternalSmartCE.g:539:59: (iv_ruleCompositeCondition= ruleCompositeCondition EOF )
            // InternalSmartCE.g:540:2: iv_ruleCompositeCondition= ruleCompositeCondition EOF
            {
             newCompositeNode(grammarAccess.getCompositeConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeCondition=ruleCompositeCondition();

            state._fsp--;

             current =iv_ruleCompositeCondition; 
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
    // $ANTLR end "entryRuleCompositeCondition"


    // $ANTLR start "ruleCompositeCondition"
    // InternalSmartCE.g:546:1: ruleCompositeCondition returns [EObject current=null] : ( ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* ( ( (lv_logicalOperators_5_0= ruleLogicalOperator ) ) otherlv_6= 'when' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' otherlv_10= 'check' otherlv_11= '{' ( ( (lv_conditions_12_0= ruleBusinessRule ) ) | ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* ) ) otherlv_18= '}' )* ) ;
    public final EObject ruleCompositeCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_18=null;
        EObject lv_conditions_0_0 = null;

        EObject lv_logicalOperators_1_0 = null;

        EObject lv_conditions_2_0 = null;

        EObject lv_logicalOperators_3_0 = null;

        EObject lv_conditions_4_0 = null;

        EObject lv_logicalOperators_5_0 = null;

        EObject lv_expression_8_0 = null;

        EObject lv_conditions_12_0 = null;

        EObject lv_conditions_13_0 = null;

        EObject lv_logicalOperators_14_0 = null;

        EObject lv_conditions_15_0 = null;

        EObject lv_logicalOperators_16_0 = null;

        EObject lv_conditions_17_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:552:2: ( ( ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* ( ( (lv_logicalOperators_5_0= ruleLogicalOperator ) ) otherlv_6= 'when' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' otherlv_10= 'check' otherlv_11= '{' ( ( (lv_conditions_12_0= ruleBusinessRule ) ) | ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* ) ) otherlv_18= '}' )* ) )
            // InternalSmartCE.g:553:2: ( ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* ( ( (lv_logicalOperators_5_0= ruleLogicalOperator ) ) otherlv_6= 'when' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' otherlv_10= 'check' otherlv_11= '{' ( ( (lv_conditions_12_0= ruleBusinessRule ) ) | ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* ) ) otherlv_18= '}' )* )
            {
            // InternalSmartCE.g:553:2: ( ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* ( ( (lv_logicalOperators_5_0= ruleLogicalOperator ) ) otherlv_6= 'when' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' otherlv_10= 'check' otherlv_11= '{' ( ( (lv_conditions_12_0= ruleBusinessRule ) ) | ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* ) ) otherlv_18= '}' )* )
            // InternalSmartCE.g:554:3: ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* ( ( (lv_logicalOperators_5_0= ruleLogicalOperator ) ) otherlv_6= 'when' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' otherlv_10= 'check' otherlv_11= '{' ( ( (lv_conditions_12_0= ruleBusinessRule ) ) | ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* ) ) otherlv_18= '}' )*
            {
            // InternalSmartCE.g:554:3: ( (lv_conditions_0_0= ruleBusinessRule ) )
            // InternalSmartCE.g:555:4: (lv_conditions_0_0= ruleBusinessRule )
            {
            // InternalSmartCE.g:555:4: (lv_conditions_0_0= ruleBusinessRule )
            // InternalSmartCE.g:556:5: lv_conditions_0_0= ruleBusinessRule
            {

            					newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_conditions_0_0=ruleBusinessRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_0_0,
            						"br.edu.unijui.gca.smartce.SmartCE.BusinessRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartCE.g:573:3: ( (lv_logicalOperators_1_0= ruleLogicalOperator ) )
            // InternalSmartCE.g:574:4: (lv_logicalOperators_1_0= ruleLogicalOperator )
            {
            // InternalSmartCE.g:574:4: (lv_logicalOperators_1_0= ruleLogicalOperator )
            // InternalSmartCE.g:575:5: lv_logicalOperators_1_0= ruleLogicalOperator
            {

            					newCompositeNode(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsLogicalOperatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_logicalOperators_1_0=ruleLogicalOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            					}
            					add(
            						current,
            						"logicalOperators",
            						lv_logicalOperators_1_0,
            						"br.edu.unijui.gca.smartce.SmartCE.LogicalOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartCE.g:592:3: ( (lv_conditions_2_0= ruleBusinessRule ) )
            // InternalSmartCE.g:593:4: (lv_conditions_2_0= ruleBusinessRule )
            {
            // InternalSmartCE.g:593:4: (lv_conditions_2_0= ruleBusinessRule )
            // InternalSmartCE.g:594:5: lv_conditions_2_0= ruleBusinessRule
            {

            					newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_conditions_2_0=ruleBusinessRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_2_0,
            						"br.edu.unijui.gca.smartce.SmartCE.BusinessRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartCE.g:611:3: ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )*
            loop6:
            do {
                int alt6=2;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    int LA6_1 = input.LA(2);

                    if ( ((LA6_1>=29 && LA6_1<=30)||LA6_1==32||(LA6_1>=34 && LA6_1<=35)||LA6_1==37) ) {
                        alt6=1;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA6_2 = input.LA(2);

                    if ( ((LA6_2>=29 && LA6_2<=30)||LA6_2==32||(LA6_2>=34 && LA6_2<=35)||LA6_2==37) ) {
                        alt6=1;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA6_3 = input.LA(2);

                    if ( ((LA6_3>=29 && LA6_3<=30)||LA6_3==32||(LA6_3>=34 && LA6_3<=35)||LA6_3==37) ) {
                        alt6=1;
                    }


                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalSmartCE.g:612:4: ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) )
            	    {
            	    // InternalSmartCE.g:612:4: ( (lv_logicalOperators_3_0= ruleLogicalOperator ) )
            	    // InternalSmartCE.g:613:5: (lv_logicalOperators_3_0= ruleLogicalOperator )
            	    {
            	    // InternalSmartCE.g:613:5: (lv_logicalOperators_3_0= ruleLogicalOperator )
            	    // InternalSmartCE.g:614:6: lv_logicalOperators_3_0= ruleLogicalOperator
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsLogicalOperatorParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_logicalOperators_3_0=ruleLogicalOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"logicalOperators",
            	    							lv_logicalOperators_3_0,
            	    							"br.edu.unijui.gca.smartce.SmartCE.LogicalOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalSmartCE.g:631:4: ( (lv_conditions_4_0= ruleBusinessRule ) )
            	    // InternalSmartCE.g:632:5: (lv_conditions_4_0= ruleBusinessRule )
            	    {
            	    // InternalSmartCE.g:632:5: (lv_conditions_4_0= ruleBusinessRule )
            	    // InternalSmartCE.g:633:6: lv_conditions_4_0= ruleBusinessRule
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_conditions_4_0=ruleBusinessRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conditions",
            	    							lv_conditions_4_0,
            	    							"br.edu.unijui.gca.smartce.SmartCE.BusinessRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalSmartCE.g:651:3: ( ( (lv_logicalOperators_5_0= ruleLogicalOperator ) ) otherlv_6= 'when' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' otherlv_10= 'check' otherlv_11= '{' ( ( (lv_conditions_12_0= ruleBusinessRule ) ) | ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* ) ) otherlv_18= '}' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=26 && LA9_0<=28)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSmartCE.g:652:4: ( (lv_logicalOperators_5_0= ruleLogicalOperator ) ) otherlv_6= 'when' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' otherlv_10= 'check' otherlv_11= '{' ( ( (lv_conditions_12_0= ruleBusinessRule ) ) | ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* ) ) otherlv_18= '}'
            	    {
            	    // InternalSmartCE.g:652:4: ( (lv_logicalOperators_5_0= ruleLogicalOperator ) )
            	    // InternalSmartCE.g:653:5: (lv_logicalOperators_5_0= ruleLogicalOperator )
            	    {
            	    // InternalSmartCE.g:653:5: (lv_logicalOperators_5_0= ruleLogicalOperator )
            	    // InternalSmartCE.g:654:6: lv_logicalOperators_5_0= ruleLogicalOperator
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsLogicalOperatorParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_logicalOperators_5_0=ruleLogicalOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"logicalOperators",
            	    							lv_logicalOperators_5_0,
            	    							"br.edu.unijui.gca.smartce.SmartCE.LogicalOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_6=(Token)match(input,22,FOLLOW_22); 

            	    				newLeafNode(otherlv_6, grammarAccess.getCompositeConditionAccess().getWhenKeyword_4_1());
            	    			
            	    otherlv_7=(Token)match(input,23,FOLLOW_9); 

            	    				newLeafNode(otherlv_7, grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_4_2());
            	    			
            	    // InternalSmartCE.g:679:4: ( (lv_expression_8_0= ruleExpression ) )
            	    // InternalSmartCE.g:680:5: (lv_expression_8_0= ruleExpression )
            	    {
            	    // InternalSmartCE.g:680:5: (lv_expression_8_0= ruleExpression )
            	    // InternalSmartCE.g:681:6: lv_expression_8_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConditionAccess().getExpressionExpressionParserRuleCall_4_3_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_expression_8_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expression",
            	    							lv_expression_8_0,
            	    							"br.edu.unijui.gca.smartce.SmartCE.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_9=(Token)match(input,24,FOLLOW_24); 

            	    				newLeafNode(otherlv_9, grammarAccess.getCompositeConditionAccess().getRightParenthesisKeyword_4_4());
            	    			
            	    otherlv_10=(Token)match(input,25,FOLLOW_6); 

            	    				newLeafNode(otherlv_10, grammarAccess.getCompositeConditionAccess().getCheckKeyword_4_5());
            	    			
            	    otherlv_11=(Token)match(input,13,FOLLOW_19); 

            	    				newLeafNode(otherlv_11, grammarAccess.getCompositeConditionAccess().getLeftCurlyBracketKeyword_4_6());
            	    			
            	    // InternalSmartCE.g:710:4: ( ( (lv_conditions_12_0= ruleBusinessRule ) ) | ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* ) )
            	    int alt8=2;
            	    alt8 = dfa8.predict(input);
            	    switch (alt8) {
            	        case 1 :
            	            // InternalSmartCE.g:711:5: ( (lv_conditions_12_0= ruleBusinessRule ) )
            	            {
            	            // InternalSmartCE.g:711:5: ( (lv_conditions_12_0= ruleBusinessRule ) )
            	            // InternalSmartCE.g:712:6: (lv_conditions_12_0= ruleBusinessRule )
            	            {
            	            // InternalSmartCE.g:712:6: (lv_conditions_12_0= ruleBusinessRule )
            	            // InternalSmartCE.g:713:7: lv_conditions_12_0= ruleBusinessRule
            	            {

            	            							newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_4_7_0_0());
            	            						
            	            pushFollow(FOLLOW_15);
            	            lv_conditions_12_0=ruleBusinessRule();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            	            							}
            	            							add(
            	            								current,
            	            								"conditions",
            	            								lv_conditions_12_0,
            	            								"br.edu.unijui.gca.smartce.SmartCE.BusinessRule");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalSmartCE.g:731:5: ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* )
            	            {
            	            // InternalSmartCE.g:731:5: ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* )
            	            // InternalSmartCE.g:732:6: ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )*
            	            {
            	            // InternalSmartCE.g:732:6: ( (lv_conditions_13_0= ruleBusinessRule ) )
            	            // InternalSmartCE.g:733:7: (lv_conditions_13_0= ruleBusinessRule )
            	            {
            	            // InternalSmartCE.g:733:7: (lv_conditions_13_0= ruleBusinessRule )
            	            // InternalSmartCE.g:734:8: lv_conditions_13_0= ruleBusinessRule
            	            {

            	            								newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_4_7_1_0_0());
            	            							
            	            pushFollow(FOLLOW_18);
            	            lv_conditions_13_0=ruleBusinessRule();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            	            								}
            	            								add(
            	            									current,
            	            									"conditions",
            	            									lv_conditions_13_0,
            	            									"br.edu.unijui.gca.smartce.SmartCE.BusinessRule");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }

            	            // InternalSmartCE.g:751:6: ( (lv_logicalOperators_14_0= ruleLogicalOperator ) )
            	            // InternalSmartCE.g:752:7: (lv_logicalOperators_14_0= ruleLogicalOperator )
            	            {
            	            // InternalSmartCE.g:752:7: (lv_logicalOperators_14_0= ruleLogicalOperator )
            	            // InternalSmartCE.g:753:8: lv_logicalOperators_14_0= ruleLogicalOperator
            	            {

            	            								newCompositeNode(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsLogicalOperatorParserRuleCall_4_7_1_1_0());
            	            							
            	            pushFollow(FOLLOW_19);
            	            lv_logicalOperators_14_0=ruleLogicalOperator();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            	            								}
            	            								add(
            	            									current,
            	            									"logicalOperators",
            	            									lv_logicalOperators_14_0,
            	            									"br.edu.unijui.gca.smartce.SmartCE.LogicalOperator");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }

            	            // InternalSmartCE.g:770:6: ( (lv_conditions_15_0= ruleBusinessRule ) )
            	            // InternalSmartCE.g:771:7: (lv_conditions_15_0= ruleBusinessRule )
            	            {
            	            // InternalSmartCE.g:771:7: (lv_conditions_15_0= ruleBusinessRule )
            	            // InternalSmartCE.g:772:8: lv_conditions_15_0= ruleBusinessRule
            	            {

            	            								newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_4_7_1_2_0());
            	            							
            	            pushFollow(FOLLOW_25);
            	            lv_conditions_15_0=ruleBusinessRule();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            	            								}
            	            								add(
            	            									current,
            	            									"conditions",
            	            									lv_conditions_15_0,
            	            									"br.edu.unijui.gca.smartce.SmartCE.BusinessRule");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }

            	            // InternalSmartCE.g:789:6: ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )*
            	            loop7:
            	            do {
            	                int alt7=2;
            	                int LA7_0 = input.LA(1);

            	                if ( ((LA7_0>=26 && LA7_0<=28)) ) {
            	                    alt7=1;
            	                }


            	                switch (alt7) {
            	            	case 1 :
            	            	    // InternalSmartCE.g:790:7: ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) )
            	            	    {
            	            	    // InternalSmartCE.g:790:7: ( (lv_logicalOperators_16_0= ruleLogicalOperator ) )
            	            	    // InternalSmartCE.g:791:8: (lv_logicalOperators_16_0= ruleLogicalOperator )
            	            	    {
            	            	    // InternalSmartCE.g:791:8: (lv_logicalOperators_16_0= ruleLogicalOperator )
            	            	    // InternalSmartCE.g:792:9: lv_logicalOperators_16_0= ruleLogicalOperator
            	            	    {

            	            	    									newCompositeNode(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsLogicalOperatorParserRuleCall_4_7_1_3_0_0());
            	            	    								
            	            	    pushFollow(FOLLOW_19);
            	            	    lv_logicalOperators_16_0=ruleLogicalOperator();

            	            	    state._fsp--;


            	            	    									if (current==null) {
            	            	    										current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            	            	    									}
            	            	    									add(
            	            	    										current,
            	            	    										"logicalOperators",
            	            	    										lv_logicalOperators_16_0,
            	            	    										"br.edu.unijui.gca.smartce.SmartCE.LogicalOperator");
            	            	    									afterParserOrEnumRuleCall();
            	            	    								

            	            	    }


            	            	    }

            	            	    // InternalSmartCE.g:809:7: ( (lv_conditions_17_0= ruleBusinessRule ) )
            	            	    // InternalSmartCE.g:810:8: (lv_conditions_17_0= ruleBusinessRule )
            	            	    {
            	            	    // InternalSmartCE.g:810:8: (lv_conditions_17_0= ruleBusinessRule )
            	            	    // InternalSmartCE.g:811:9: lv_conditions_17_0= ruleBusinessRule
            	            	    {

            	            	    									newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_4_7_1_3_1_0());
            	            	    								
            	            	    pushFollow(FOLLOW_25);
            	            	    lv_conditions_17_0=ruleBusinessRule();

            	            	    state._fsp--;


            	            	    									if (current==null) {
            	            	    										current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            	            	    									}
            	            	    									add(
            	            	    										current,
            	            	    										"conditions",
            	            	    										lv_conditions_17_0,
            	            	    										"br.edu.unijui.gca.smartce.SmartCE.BusinessRule");
            	            	    									afterParserOrEnumRuleCall();
            	            	    								

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop7;
            	                }
            	            } while (true);


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_18=(Token)match(input,20,FOLLOW_20); 

            	    				newLeafNode(otherlv_18, grammarAccess.getCompositeConditionAccess().getRightCurlyBracketKeyword_4_8());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleCompositeCondition"


    // $ANTLR start "entryRuleLogicalOperator"
    // InternalSmartCE.g:840:1: entryRuleLogicalOperator returns [EObject current=null] : iv_ruleLogicalOperator= ruleLogicalOperator EOF ;
    public final EObject entryRuleLogicalOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOperator = null;


        try {
            // InternalSmartCE.g:840:56: (iv_ruleLogicalOperator= ruleLogicalOperator EOF )
            // InternalSmartCE.g:841:2: iv_ruleLogicalOperator= ruleLogicalOperator EOF
            {
             newCompositeNode(grammarAccess.getLogicalOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalOperator=ruleLogicalOperator();

            state._fsp--;

             current =iv_ruleLogicalOperator; 
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
    // $ANTLR end "entryRuleLogicalOperator"


    // $ANTLR start "ruleLogicalOperator"
    // InternalSmartCE.g:847:1: ruleLogicalOperator returns [EObject current=null] : ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) ) ) ;
    public final EObject ruleLogicalOperator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;


        	enterRule();

        try {
            // InternalSmartCE.g:853:2: ( ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) ) ) )
            // InternalSmartCE.g:854:2: ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) ) )
            {
            // InternalSmartCE.g:854:2: ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) ) )
            // InternalSmartCE.g:855:3: ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) )
            {
            // InternalSmartCE.g:855:3: ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) )
            // InternalSmartCE.g:856:4: (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' )
            {
            // InternalSmartCE.g:856:4: (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt10=1;
                }
                break;
            case 27:
                {
                alt10=2;
                }
                break;
            case 28:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSmartCE.g:857:5: lv_name_0_1= 'AND'
                    {
                    lv_name_0_1=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getLogicalOperatorAccess().getNameANDKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:868:5: lv_name_0_2= 'OR'
                    {
                    lv_name_0_2=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getLogicalOperatorAccess().getNameORKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:879:5: lv_name_0_3= 'NOT'
                    {
                    lv_name_0_3=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getLogicalOperatorAccess().getNameNOTKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_3, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleLogicalOperator"


    // $ANTLR start "entryRuleTimeout"
    // InternalSmartCE.g:895:1: entryRuleTimeout returns [EObject current=null] : iv_ruleTimeout= ruleTimeout EOF ;
    public final EObject entryRuleTimeout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeout = null;


        try {
            // InternalSmartCE.g:895:48: (iv_ruleTimeout= ruleTimeout EOF )
            // InternalSmartCE.g:896:2: iv_ruleTimeout= ruleTimeout EOF
            {
             newCompositeNode(grammarAccess.getTimeoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeout=ruleTimeout();

            state._fsp--;

             current =iv_ruleTimeout; 
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
    // $ANTLR end "entryRuleTimeout"


    // $ANTLR start "ruleTimeout"
    // InternalSmartCE.g:902:1: ruleTimeout returns [EObject current=null] : (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleTimeout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSmartCE.g:908:2: ( (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalSmartCE.g:909:2: (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalSmartCE.g:909:2: (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalSmartCE.g:910:3: otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeoutAccess().getTimeoutKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeoutAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:918:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalSmartCE.g:919:4: (lv_value_2_0= RULE_INT )
            {
            // InternalSmartCE.g:919:4: (lv_value_2_0= RULE_INT )
            // InternalSmartCE.g:920:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            					newLeafNode(lv_value_2_0, grammarAccess.getTimeoutAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeoutRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeoutAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleTimeout"


    // $ANTLR start "entryRuleOperationLimit"
    // InternalSmartCE.g:944:1: entryRuleOperationLimit returns [EObject current=null] : iv_ruleOperationLimit= ruleOperationLimit EOF ;
    public final EObject entryRuleOperationLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationLimit = null;


        try {
            // InternalSmartCE.g:944:55: (iv_ruleOperationLimit= ruleOperationLimit EOF )
            // InternalSmartCE.g:945:2: iv_ruleOperationLimit= ruleOperationLimit EOF
            {
             newCompositeNode(grammarAccess.getOperationLimitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationLimit=ruleOperationLimit();

            state._fsp--;

             current =iv_ruleOperationLimit; 
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
    // $ANTLR end "entryRuleOperationLimit"


    // $ANTLR start "ruleOperationLimit"
    // InternalSmartCE.g:951:1: ruleOperationLimit returns [EObject current=null] : (otherlv_0= 'OperationLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' ) ;
    public final EObject ruleOperationLimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_operationsNumber_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_timeUnit_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:957:2: ( (otherlv_0= 'OperationLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' ) )
            // InternalSmartCE.g:958:2: (otherlv_0= 'OperationLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' )
            {
            // InternalSmartCE.g:958:2: (otherlv_0= 'OperationLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' )
            // InternalSmartCE.g:959:3: otherlv_0= 'OperationLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationLimitAccess().getOperationLimitKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationLimitAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:967:3: ( (lv_operationsNumber_2_0= RULE_INT ) )
            // InternalSmartCE.g:968:4: (lv_operationsNumber_2_0= RULE_INT )
            {
            // InternalSmartCE.g:968:4: (lv_operationsNumber_2_0= RULE_INT )
            // InternalSmartCE.g:969:5: lv_operationsNumber_2_0= RULE_INT
            {
            lv_operationsNumber_2_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            					newLeafNode(lv_operationsNumber_2_0, grammarAccess.getOperationLimitAccess().getOperationsNumberINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationLimitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operationsNumber",
            						lv_operationsNumber_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationLimitAccess().getByKeyword_3());
            		
            // InternalSmartCE.g:989:3: ( (lv_timeUnit_4_0= ruleTimeUnit ) )
            // InternalSmartCE.g:990:4: (lv_timeUnit_4_0= ruleTimeUnit )
            {
            // InternalSmartCE.g:990:4: (lv_timeUnit_4_0= ruleTimeUnit )
            // InternalSmartCE.g:991:5: lv_timeUnit_4_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getOperationLimitAccess().getTimeUnitTimeUnitEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_timeUnit_4_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationLimitRule());
            					}
            					set(
            						current,
            						"timeUnit",
            						lv_timeUnit_4_0,
            						"br.edu.unijui.gca.smartce.SmartCE.TimeUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getOperationLimitAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleOperationLimit"


    // $ANTLR start "entryRuleBusinessDay"
    // InternalSmartCE.g:1016:1: entryRuleBusinessDay returns [EObject current=null] : iv_ruleBusinessDay= ruleBusinessDay EOF ;
    public final EObject entryRuleBusinessDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessDay = null;


        try {
            // InternalSmartCE.g:1016:52: (iv_ruleBusinessDay= ruleBusinessDay EOF )
            // InternalSmartCE.g:1017:2: iv_ruleBusinessDay= ruleBusinessDay EOF
            {
             newCompositeNode(grammarAccess.getBusinessDayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBusinessDay=ruleBusinessDay();

            state._fsp--;

             current =iv_ruleBusinessDay; 
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
    // $ANTLR end "entryRuleBusinessDay"


    // $ANTLR start "ruleBusinessDay"
    // InternalSmartCE.g:1023:1: ruleBusinessDay returns [EObject current=null] : (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' ) ;
    public final EObject ruleBusinessDay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_start_2_0 = null;

        Enumerator lv_end_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:1029:2: ( (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' ) )
            // InternalSmartCE.g:1030:2: (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' )
            {
            // InternalSmartCE.g:1030:2: (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' )
            // InternalSmartCE.g:1031:3: otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessDayAccess().getBusinessDayKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getBusinessDayAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:1039:3: ( (lv_start_2_0= ruleWeekDay ) )
            // InternalSmartCE.g:1040:4: (lv_start_2_0= ruleWeekDay )
            {
            // InternalSmartCE.g:1040:4: (lv_start_2_0= ruleWeekDay )
            // InternalSmartCE.g:1041:5: lv_start_2_0= ruleWeekDay
            {

            					newCompositeNode(grammarAccess.getBusinessDayAccess().getStartWeekDayEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_start_2_0=ruleWeekDay();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBusinessDayRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_2_0,
            						"br.edu.unijui.gca.smartce.SmartCE.WeekDay");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getBusinessDayAccess().getToKeyword_3());
            		
            // InternalSmartCE.g:1062:3: ( (lv_end_4_0= ruleWeekDay ) )
            // InternalSmartCE.g:1063:4: (lv_end_4_0= ruleWeekDay )
            {
            // InternalSmartCE.g:1063:4: (lv_end_4_0= ruleWeekDay )
            // InternalSmartCE.g:1064:5: lv_end_4_0= ruleWeekDay
            {

            					newCompositeNode(grammarAccess.getBusinessDayAccess().getEndWeekDayEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_end_4_0=ruleWeekDay();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBusinessDayRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_4_0,
            						"br.edu.unijui.gca.smartce.SmartCE.WeekDay");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBusinessDayAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleBusinessDay"


    // $ANTLR start "entryRuleTimeInterval"
    // InternalSmartCE.g:1089:1: entryRuleTimeInterval returns [EObject current=null] : iv_ruleTimeInterval= ruleTimeInterval EOF ;
    public final EObject entryRuleTimeInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeInterval = null;


        try {
            // InternalSmartCE.g:1089:53: (iv_ruleTimeInterval= ruleTimeInterval EOF )
            // InternalSmartCE.g:1090:2: iv_ruleTimeInterval= ruleTimeInterval EOF
            {
             newCompositeNode(grammarAccess.getTimeIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeInterval=ruleTimeInterval();

            state._fsp--;

             current =iv_ruleTimeInterval; 
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
    // $ANTLR end "entryRuleTimeInterval"


    // $ANTLR start "ruleTimeInterval"
    // InternalSmartCE.g:1096:1: ruleTimeInterval returns [EObject current=null] : (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
    public final EObject ruleTimeInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_start_2_0=null;
        Token otherlv_3=null;
        Token lv_end_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1102:2: ( (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalSmartCE.g:1103:2: (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalSmartCE.g:1103:2: (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalSmartCE.g:1104:3: otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeIntervalAccess().getTimeIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeIntervalAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:1112:3: ( (lv_start_2_0= RULE_STRING ) )
            // InternalSmartCE.g:1113:4: (lv_start_2_0= RULE_STRING )
            {
            // InternalSmartCE.g:1113:4: (lv_start_2_0= RULE_STRING )
            // InternalSmartCE.g:1114:5: lv_start_2_0= RULE_STRING
            {
            lv_start_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_start_2_0, grammarAccess.getTimeIntervalAccess().getStartSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeIntervalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeIntervalAccess().getToKeyword_3());
            		
            // InternalSmartCE.g:1134:3: ( (lv_end_4_0= RULE_STRING ) )
            // InternalSmartCE.g:1135:4: (lv_end_4_0= RULE_STRING )
            {
            // InternalSmartCE.g:1135:4: (lv_end_4_0= RULE_STRING )
            // InternalSmartCE.g:1136:5: lv_end_4_0= RULE_STRING
            {
            lv_end_4_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_end_4_0, grammarAccess.getTimeIntervalAccess().getEndSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeIntervalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTimeIntervalAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleTimeInterval"


    // $ANTLR start "entryRuleSessionInterval"
    // InternalSmartCE.g:1160:1: entryRuleSessionInterval returns [EObject current=null] : iv_ruleSessionInterval= ruleSessionInterval EOF ;
    public final EObject entryRuleSessionInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSessionInterval = null;


        try {
            // InternalSmartCE.g:1160:56: (iv_ruleSessionInterval= ruleSessionInterval EOF )
            // InternalSmartCE.g:1161:2: iv_ruleSessionInterval= ruleSessionInterval EOF
            {
             newCompositeNode(grammarAccess.getSessionIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSessionInterval=ruleSessionInterval();

            state._fsp--;

             current =iv_ruleSessionInterval; 
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
    // $ANTLR end "entryRuleSessionInterval"


    // $ANTLR start "ruleSessionInterval"
    // InternalSmartCE.g:1167:1: ruleSessionInterval returns [EObject current=null] : ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'from' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'to' ( (lv_end_7_0= RULE_STRING ) ) otherlv_8= ')' ) | (otherlv_9= 'SessionInterval' otherlv_10= '(' ( (lv_frequency_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) otherlv_13= ')' ) ) ;
    public final EObject ruleSessionInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_frequency_2_0=null;
        Token otherlv_4=null;
        Token lv_start_5_0=null;
        Token otherlv_6=null;
        Token lv_end_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_frequency_11_0=null;
        Token otherlv_13=null;
        Enumerator lv_timeUnit_3_0 = null;

        Enumerator lv_timeUnit_12_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:1173:2: ( ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'from' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'to' ( (lv_end_7_0= RULE_STRING ) ) otherlv_8= ')' ) | (otherlv_9= 'SessionInterval' otherlv_10= '(' ( (lv_frequency_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) otherlv_13= ')' ) ) )
            // InternalSmartCE.g:1174:2: ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'from' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'to' ( (lv_end_7_0= RULE_STRING ) ) otherlv_8= ')' ) | (otherlv_9= 'SessionInterval' otherlv_10= '(' ( (lv_frequency_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) otherlv_13= ')' ) )
            {
            // InternalSmartCE.g:1174:2: ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'from' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'to' ( (lv_end_7_0= RULE_STRING ) ) otherlv_8= ')' ) | (otherlv_9= 'SessionInterval' otherlv_10= '(' ( (lv_frequency_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) otherlv_13= ')' ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalSmartCE.g:1175:3: (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'from' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'to' ( (lv_end_7_0= RULE_STRING ) ) otherlv_8= ')' )
                    {
                    // InternalSmartCE.g:1175:3: (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'from' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'to' ( (lv_end_7_0= RULE_STRING ) ) otherlv_8= ')' )
                    // InternalSmartCE.g:1176:4: otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'from' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'to' ( (lv_end_7_0= RULE_STRING ) ) otherlv_8= ')'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_22); 

                    				newLeafNode(otherlv_0, grammarAccess.getSessionIntervalAccess().getSessionIntervalKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,23,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getSessionIntervalAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalSmartCE.g:1184:4: ( (lv_frequency_2_0= RULE_INT ) )
                    // InternalSmartCE.g:1185:5: (lv_frequency_2_0= RULE_INT )
                    {
                    // InternalSmartCE.g:1185:5: (lv_frequency_2_0= RULE_INT )
                    // InternalSmartCE.g:1186:6: lv_frequency_2_0= RULE_INT
                    {
                    lv_frequency_2_0=(Token)match(input,RULE_INT,FOLLOW_28); 

                    						newLeafNode(lv_frequency_2_0, grammarAccess.getSessionIntervalAccess().getFrequencyINTTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSessionIntervalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"frequency",
                    							lv_frequency_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalSmartCE.g:1202:4: ( (lv_timeUnit_3_0= ruleTimeUnit ) )
                    // InternalSmartCE.g:1203:5: (lv_timeUnit_3_0= ruleTimeUnit )
                    {
                    // InternalSmartCE.g:1203:5: (lv_timeUnit_3_0= ruleTimeUnit )
                    // InternalSmartCE.g:1204:6: lv_timeUnit_3_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getSessionIntervalAccess().getTimeUnitTimeUnitEnumRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_timeUnit_3_0=ruleTimeUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSessionIntervalRule());
                    						}
                    						set(
                    							current,
                    							"timeUnit",
                    							lv_timeUnit_3_0,
                    							"br.edu.unijui.gca.smartce.SmartCE.TimeUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,36,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getSessionIntervalAccess().getFromKeyword_0_4());
                    			
                    // InternalSmartCE.g:1225:4: ( (lv_start_5_0= RULE_STRING ) )
                    // InternalSmartCE.g:1226:5: (lv_start_5_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:1226:5: (lv_start_5_0= RULE_STRING )
                    // InternalSmartCE.g:1227:6: lv_start_5_0= RULE_STRING
                    {
                    lv_start_5_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    						newLeafNode(lv_start_5_0, grammarAccess.getSessionIntervalAccess().getStartSTRINGTerminalRuleCall_0_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSessionIntervalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"start",
                    							lv_start_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,33,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getSessionIntervalAccess().getToKeyword_0_6());
                    			
                    // InternalSmartCE.g:1247:4: ( (lv_end_7_0= RULE_STRING ) )
                    // InternalSmartCE.g:1248:5: (lv_end_7_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:1248:5: (lv_end_7_0= RULE_STRING )
                    // InternalSmartCE.g:1249:6: lv_end_7_0= RULE_STRING
                    {
                    lv_end_7_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    						newLeafNode(lv_end_7_0, grammarAccess.getSessionIntervalAccess().getEndSTRINGTerminalRuleCall_0_7_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSessionIntervalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"end",
                    							lv_end_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getSessionIntervalAccess().getRightParenthesisKeyword_0_8());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:1271:3: (otherlv_9= 'SessionInterval' otherlv_10= '(' ( (lv_frequency_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) otherlv_13= ')' )
                    {
                    // InternalSmartCE.g:1271:3: (otherlv_9= 'SessionInterval' otherlv_10= '(' ( (lv_frequency_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) otherlv_13= ')' )
                    // InternalSmartCE.g:1272:4: otherlv_9= 'SessionInterval' otherlv_10= '(' ( (lv_frequency_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) otherlv_13= ')'
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_22); 

                    				newLeafNode(otherlv_9, grammarAccess.getSessionIntervalAccess().getSessionIntervalKeyword_1_0());
                    			
                    otherlv_10=(Token)match(input,23,FOLLOW_26); 

                    				newLeafNode(otherlv_10, grammarAccess.getSessionIntervalAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalSmartCE.g:1280:4: ( (lv_frequency_11_0= RULE_INT ) )
                    // InternalSmartCE.g:1281:5: (lv_frequency_11_0= RULE_INT )
                    {
                    // InternalSmartCE.g:1281:5: (lv_frequency_11_0= RULE_INT )
                    // InternalSmartCE.g:1282:6: lv_frequency_11_0= RULE_INT
                    {
                    lv_frequency_11_0=(Token)match(input,RULE_INT,FOLLOW_28); 

                    						newLeafNode(lv_frequency_11_0, grammarAccess.getSessionIntervalAccess().getFrequencyINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSessionIntervalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"frequency",
                    							lv_frequency_11_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalSmartCE.g:1298:4: ( (lv_timeUnit_12_0= ruleTimeUnit ) )
                    // InternalSmartCE.g:1299:5: (lv_timeUnit_12_0= ruleTimeUnit )
                    {
                    // InternalSmartCE.g:1299:5: (lv_timeUnit_12_0= ruleTimeUnit )
                    // InternalSmartCE.g:1300:6: lv_timeUnit_12_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getSessionIntervalAccess().getTimeUnitTimeUnitEnumRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_timeUnit_12_0=ruleTimeUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSessionIntervalRule());
                    						}
                    						set(
                    							current,
                    							"timeUnit",
                    							lv_timeUnit_12_0,
                    							"br.edu.unijui.gca.smartce.SmartCE.TimeUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getSessionIntervalAccess().getRightParenthesisKeyword_1_4());
                    			

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
    // $ANTLR end "ruleSessionInterval"


    // $ANTLR start "entryRuleMessageContent"
    // InternalSmartCE.g:1326:1: entryRuleMessageContent returns [EObject current=null] : iv_ruleMessageContent= ruleMessageContent EOF ;
    public final EObject entryRuleMessageContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageContent = null;


        try {
            // InternalSmartCE.g:1326:55: (iv_ruleMessageContent= ruleMessageContent EOF )
            // InternalSmartCE.g:1327:2: iv_ruleMessageContent= ruleMessageContent EOF
            {
             newCompositeNode(grammarAccess.getMessageContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageContent=ruleMessageContent();

            state._fsp--;

             current =iv_ruleMessageContent; 
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
    // $ANTLR end "entryRuleMessageContent"


    // $ANTLR start "ruleMessageContent"
    // InternalSmartCE.g:1333:1: ruleMessageContent returns [EObject current=null] : ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' ) | (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' ) ) ;
    public final EObject ruleMessageContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_content_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_content_12_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_content_20_0=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Enumerator lv_timeUnit_8_0 = null;

        EObject lv_binaryOperator_13_0 = null;

        EObject lv_stringValue_14_0 = null;

        EObject lv_variableValue_15_0 = null;

        EObject lv_numericValue_16_0 = null;

        EObject lv_binaryOperator_21_0 = null;

        EObject lv_stringValue_22_0 = null;

        EObject lv_variableValue_23_0 = null;

        EObject lv_numericValue_24_0 = null;

        Enumerator lv_timeUnit_26_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:1339:2: ( ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' ) | (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' ) ) )
            // InternalSmartCE.g:1340:2: ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' ) | (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' ) )
            {
            // InternalSmartCE.g:1340:2: ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' ) | (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' ) )
            int alt14=4;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalSmartCE.g:1341:3: (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' )
                    {
                    // InternalSmartCE.g:1341:3: (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' )
                    // InternalSmartCE.g:1342:4: otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_22); 

                    				newLeafNode(otherlv_0, grammarAccess.getMessageContentAccess().getMessageContentKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalSmartCE.g:1350:4: ( (lv_content_2_0= RULE_STRING ) )
                    // InternalSmartCE.g:1351:5: (lv_content_2_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:1351:5: (lv_content_2_0= RULE_STRING )
                    // InternalSmartCE.g:1352:6: lv_content_2_0= RULE_STRING
                    {
                    lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    						newLeafNode(lv_content_2_0, grammarAccess.getMessageContentAccess().getContentSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageContentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getMessageContentAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:1374:3: (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' )
                    {
                    // InternalSmartCE.g:1374:3: (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' )
                    // InternalSmartCE.g:1375:4: otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getMessageContentAccess().getMessageContentKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalSmartCE.g:1383:4: ( (lv_content_6_0= RULE_STRING ) )
                    // InternalSmartCE.g:1384:5: (lv_content_6_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:1384:5: (lv_content_6_0= RULE_STRING )
                    // InternalSmartCE.g:1385:6: lv_content_6_0= RULE_STRING
                    {
                    lv_content_6_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

                    						newLeafNode(lv_content_6_0, grammarAccess.getMessageContentAccess().getContentSTRINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageContentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,31,FOLLOW_28); 

                    				newLeafNode(otherlv_7, grammarAccess.getMessageContentAccess().getByKeyword_1_3());
                    			
                    // InternalSmartCE.g:1405:4: ( (lv_timeUnit_8_0= ruleTimeUnit ) )
                    // InternalSmartCE.g:1406:5: (lv_timeUnit_8_0= ruleTimeUnit )
                    {
                    // InternalSmartCE.g:1406:5: (lv_timeUnit_8_0= ruleTimeUnit )
                    // InternalSmartCE.g:1407:6: lv_timeUnit_8_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getTimeUnitTimeUnitEnumRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_timeUnit_8_0=ruleTimeUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageContentRule());
                    						}
                    						set(
                    							current,
                    							"timeUnit",
                    							lv_timeUnit_8_0,
                    							"br.edu.unijui.gca.smartce.SmartCE.TimeUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getMessageContentAccess().getRightParenthesisKeyword_1_5());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:1430:3: (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' )
                    {
                    // InternalSmartCE.g:1430:3: (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' )
                    // InternalSmartCE.g:1431:4: otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')'
                    {
                    otherlv_10=(Token)match(input,37,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getMessageContentAccess().getMessageContentKeyword_2_0());
                    			
                    otherlv_11=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_11, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalSmartCE.g:1439:4: ( (lv_content_12_0= RULE_STRING ) )
                    // InternalSmartCE.g:1440:5: (lv_content_12_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:1440:5: (lv_content_12_0= RULE_STRING )
                    // InternalSmartCE.g:1441:6: lv_content_12_0= RULE_STRING
                    {
                    lv_content_12_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_content_12_0, grammarAccess.getMessageContentAccess().getContentSTRINGTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageContentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalSmartCE.g:1457:4: ( (lv_binaryOperator_13_0= ruleBinaryOperator ) )
                    // InternalSmartCE.g:1458:5: (lv_binaryOperator_13_0= ruleBinaryOperator )
                    {
                    // InternalSmartCE.g:1458:5: (lv_binaryOperator_13_0= ruleBinaryOperator )
                    // InternalSmartCE.g:1459:6: lv_binaryOperator_13_0= ruleBinaryOperator
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getBinaryOperatorBinaryOperatorParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_binaryOperator_13_0=ruleBinaryOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageContentRule());
                    						}
                    						set(
                    							current,
                    							"binaryOperator",
                    							lv_binaryOperator_13_0,
                    							"br.edu.unijui.gca.smartce.SmartCE.BinaryOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmartCE.g:1476:4: ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) )
                    int alt12=3;
                    switch ( input.LA(1) ) {
                    case RULE_STRING:
                        {
                        alt12=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt12=2;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt12=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }

                    switch (alt12) {
                        case 1 :
                            // InternalSmartCE.g:1477:5: ( (lv_stringValue_14_0= ruleStringValue ) )
                            {
                            // InternalSmartCE.g:1477:5: ( (lv_stringValue_14_0= ruleStringValue ) )
                            // InternalSmartCE.g:1478:6: (lv_stringValue_14_0= ruleStringValue )
                            {
                            // InternalSmartCE.g:1478:6: (lv_stringValue_14_0= ruleStringValue )
                            // InternalSmartCE.g:1479:7: lv_stringValue_14_0= ruleStringValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getStringValueStringValueParserRuleCall_2_4_0_0());
                            						
                            pushFollow(FOLLOW_23);
                            lv_stringValue_14_0=ruleStringValue();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMessageContentRule());
                            							}
                            							set(
                            								current,
                            								"stringValue",
                            								lv_stringValue_14_0,
                            								"br.edu.unijui.gca.smartce.SmartCE.StringValue");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSmartCE.g:1497:5: ( (lv_variableValue_15_0= ruleVariableValue ) )
                            {
                            // InternalSmartCE.g:1497:5: ( (lv_variableValue_15_0= ruleVariableValue ) )
                            // InternalSmartCE.g:1498:6: (lv_variableValue_15_0= ruleVariableValue )
                            {
                            // InternalSmartCE.g:1498:6: (lv_variableValue_15_0= ruleVariableValue )
                            // InternalSmartCE.g:1499:7: lv_variableValue_15_0= ruleVariableValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getVariableValueVariableValueParserRuleCall_2_4_1_0());
                            						
                            pushFollow(FOLLOW_23);
                            lv_variableValue_15_0=ruleVariableValue();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMessageContentRule());
                            							}
                            							set(
                            								current,
                            								"variableValue",
                            								lv_variableValue_15_0,
                            								"br.edu.unijui.gca.smartce.SmartCE.VariableValue");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalSmartCE.g:1517:5: ( (lv_numericValue_16_0= ruleNumericValue ) )
                            {
                            // InternalSmartCE.g:1517:5: ( (lv_numericValue_16_0= ruleNumericValue ) )
                            // InternalSmartCE.g:1518:6: (lv_numericValue_16_0= ruleNumericValue )
                            {
                            // InternalSmartCE.g:1518:6: (lv_numericValue_16_0= ruleNumericValue )
                            // InternalSmartCE.g:1519:7: lv_numericValue_16_0= ruleNumericValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getNumericValueNumericValueParserRuleCall_2_4_2_0());
                            						
                            pushFollow(FOLLOW_23);
                            lv_numericValue_16_0=ruleNumericValue();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMessageContentRule());
                            							}
                            							set(
                            								current,
                            								"numericValue",
                            								lv_numericValue_16_0,
                            								"br.edu.unijui.gca.smartce.SmartCE.NumericValue");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getMessageContentAccess().getRightParenthesisKeyword_2_5());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:1543:3: (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' )
                    {
                    // InternalSmartCE.g:1543:3: (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' )
                    // InternalSmartCE.g:1544:4: otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')'
                    {
                    otherlv_18=(Token)match(input,37,FOLLOW_22); 

                    				newLeafNode(otherlv_18, grammarAccess.getMessageContentAccess().getMessageContentKeyword_3_0());
                    			
                    otherlv_19=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_19, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalSmartCE.g:1552:4: ( (lv_content_20_0= RULE_STRING ) )
                    // InternalSmartCE.g:1553:5: (lv_content_20_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:1553:5: (lv_content_20_0= RULE_STRING )
                    // InternalSmartCE.g:1554:6: lv_content_20_0= RULE_STRING
                    {
                    lv_content_20_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_content_20_0, grammarAccess.getMessageContentAccess().getContentSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageContentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_20_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalSmartCE.g:1570:4: ( (lv_binaryOperator_21_0= ruleBinaryOperator ) )
                    // InternalSmartCE.g:1571:5: (lv_binaryOperator_21_0= ruleBinaryOperator )
                    {
                    // InternalSmartCE.g:1571:5: (lv_binaryOperator_21_0= ruleBinaryOperator )
                    // InternalSmartCE.g:1572:6: lv_binaryOperator_21_0= ruleBinaryOperator
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getBinaryOperatorBinaryOperatorParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_binaryOperator_21_0=ruleBinaryOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageContentRule());
                    						}
                    						set(
                    							current,
                    							"binaryOperator",
                    							lv_binaryOperator_21_0,
                    							"br.edu.unijui.gca.smartce.SmartCE.BinaryOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmartCE.g:1589:4: ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) )
                    int alt13=3;
                    switch ( input.LA(1) ) {
                    case RULE_STRING:
                        {
                        alt13=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt13=2;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt13=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }

                    switch (alt13) {
                        case 1 :
                            // InternalSmartCE.g:1590:5: ( (lv_stringValue_22_0= ruleStringValue ) )
                            {
                            // InternalSmartCE.g:1590:5: ( (lv_stringValue_22_0= ruleStringValue ) )
                            // InternalSmartCE.g:1591:6: (lv_stringValue_22_0= ruleStringValue )
                            {
                            // InternalSmartCE.g:1591:6: (lv_stringValue_22_0= ruleStringValue )
                            // InternalSmartCE.g:1592:7: lv_stringValue_22_0= ruleStringValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getStringValueStringValueParserRuleCall_3_4_0_0());
                            						
                            pushFollow(FOLLOW_27);
                            lv_stringValue_22_0=ruleStringValue();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMessageContentRule());
                            							}
                            							set(
                            								current,
                            								"stringValue",
                            								lv_stringValue_22_0,
                            								"br.edu.unijui.gca.smartce.SmartCE.StringValue");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSmartCE.g:1610:5: ( (lv_variableValue_23_0= ruleVariableValue ) )
                            {
                            // InternalSmartCE.g:1610:5: ( (lv_variableValue_23_0= ruleVariableValue ) )
                            // InternalSmartCE.g:1611:6: (lv_variableValue_23_0= ruleVariableValue )
                            {
                            // InternalSmartCE.g:1611:6: (lv_variableValue_23_0= ruleVariableValue )
                            // InternalSmartCE.g:1612:7: lv_variableValue_23_0= ruleVariableValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getVariableValueVariableValueParserRuleCall_3_4_1_0());
                            						
                            pushFollow(FOLLOW_27);
                            lv_variableValue_23_0=ruleVariableValue();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMessageContentRule());
                            							}
                            							set(
                            								current,
                            								"variableValue",
                            								lv_variableValue_23_0,
                            								"br.edu.unijui.gca.smartce.SmartCE.VariableValue");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalSmartCE.g:1630:5: ( (lv_numericValue_24_0= ruleNumericValue ) )
                            {
                            // InternalSmartCE.g:1630:5: ( (lv_numericValue_24_0= ruleNumericValue ) )
                            // InternalSmartCE.g:1631:6: (lv_numericValue_24_0= ruleNumericValue )
                            {
                            // InternalSmartCE.g:1631:6: (lv_numericValue_24_0= ruleNumericValue )
                            // InternalSmartCE.g:1632:7: lv_numericValue_24_0= ruleNumericValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getNumericValueNumericValueParserRuleCall_3_4_2_0());
                            						
                            pushFollow(FOLLOW_27);
                            lv_numericValue_24_0=ruleNumericValue();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMessageContentRule());
                            							}
                            							set(
                            								current,
                            								"numericValue",
                            								lv_numericValue_24_0,
                            								"br.edu.unijui.gca.smartce.SmartCE.NumericValue");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_25=(Token)match(input,31,FOLLOW_28); 

                    				newLeafNode(otherlv_25, grammarAccess.getMessageContentAccess().getByKeyword_3_5());
                    			
                    // InternalSmartCE.g:1654:4: ( (lv_timeUnit_26_0= ruleTimeUnit ) )
                    // InternalSmartCE.g:1655:5: (lv_timeUnit_26_0= ruleTimeUnit )
                    {
                    // InternalSmartCE.g:1655:5: (lv_timeUnit_26_0= ruleTimeUnit )
                    // InternalSmartCE.g:1656:6: lv_timeUnit_26_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getTimeUnitTimeUnitEnumRuleCall_3_6_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_timeUnit_26_0=ruleTimeUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageContentRule());
                    						}
                    						set(
                    							current,
                    							"timeUnit",
                    							lv_timeUnit_26_0,
                    							"br.edu.unijui.gca.smartce.SmartCE.TimeUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_27=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_27, grammarAccess.getMessageContentAccess().getRightParenthesisKeyword_3_7());
                    			

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
    // $ANTLR end "ruleMessageContent"


    // $ANTLR start "entryRuleBinaryOperator"
    // InternalSmartCE.g:1682:1: entryRuleBinaryOperator returns [EObject current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final EObject entryRuleBinaryOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperator = null;


        try {
            // InternalSmartCE.g:1682:55: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // InternalSmartCE.g:1683:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
            {
             newCompositeNode(grammarAccess.getBinaryOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryOperator=ruleBinaryOperator();

            state._fsp--;

             current =iv_ruleBinaryOperator; 
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
    // $ANTLR end "entryRuleBinaryOperator"


    // $ANTLR start "ruleBinaryOperator"
    // InternalSmartCE.g:1689:1: ruleBinaryOperator returns [EObject current=null] : ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) ) ;
    public final EObject ruleBinaryOperator() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token lv_symbol_1_0=null;
        Token lv_symbol_2_0=null;
        Token lv_symbol_3_0=null;
        Token lv_symbol_4_0=null;
        Token lv_symbol_5_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1695:2: ( ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) ) )
            // InternalSmartCE.g:1696:2: ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) )
            {
            // InternalSmartCE.g:1696:2: ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt15=1;
                }
                break;
            case 39:
                {
                alt15=2;
                }
                break;
            case 40:
                {
                alt15=3;
                }
                break;
            case 41:
                {
                alt15=4;
                }
                break;
            case 42:
                {
                alt15=5;
                }
                break;
            case 43:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSmartCE.g:1697:3: ( (lv_symbol_0_0= '<=' ) )
                    {
                    // InternalSmartCE.g:1697:3: ( (lv_symbol_0_0= '<=' ) )
                    // InternalSmartCE.g:1698:4: (lv_symbol_0_0= '<=' )
                    {
                    // InternalSmartCE.g:1698:4: (lv_symbol_0_0= '<=' )
                    // InternalSmartCE.g:1699:5: lv_symbol_0_0= '<='
                    {
                    lv_symbol_0_0=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_0, grammarAccess.getBinaryOperatorAccess().getSymbolLessThanSignEqualsSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBinaryOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_0, "<=");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:1712:3: ( (lv_symbol_1_0= '>=' ) )
                    {
                    // InternalSmartCE.g:1712:3: ( (lv_symbol_1_0= '>=' ) )
                    // InternalSmartCE.g:1713:4: (lv_symbol_1_0= '>=' )
                    {
                    // InternalSmartCE.g:1713:4: (lv_symbol_1_0= '>=' )
                    // InternalSmartCE.g:1714:5: lv_symbol_1_0= '>='
                    {
                    lv_symbol_1_0=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(lv_symbol_1_0, grammarAccess.getBinaryOperatorAccess().getSymbolGreaterThanSignEqualsSignKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBinaryOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_1_0, ">=");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:1727:3: ( (lv_symbol_2_0= '>' ) )
                    {
                    // InternalSmartCE.g:1727:3: ( (lv_symbol_2_0= '>' ) )
                    // InternalSmartCE.g:1728:4: (lv_symbol_2_0= '>' )
                    {
                    // InternalSmartCE.g:1728:4: (lv_symbol_2_0= '>' )
                    // InternalSmartCE.g:1729:5: lv_symbol_2_0= '>'
                    {
                    lv_symbol_2_0=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_symbol_2_0, grammarAccess.getBinaryOperatorAccess().getSymbolGreaterThanSignKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBinaryOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_2_0, ">");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:1742:3: ( (lv_symbol_3_0= '<' ) )
                    {
                    // InternalSmartCE.g:1742:3: ( (lv_symbol_3_0= '<' ) )
                    // InternalSmartCE.g:1743:4: (lv_symbol_3_0= '<' )
                    {
                    // InternalSmartCE.g:1743:4: (lv_symbol_3_0= '<' )
                    // InternalSmartCE.g:1744:5: lv_symbol_3_0= '<'
                    {
                    lv_symbol_3_0=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_symbol_3_0, grammarAccess.getBinaryOperatorAccess().getSymbolLessThanSignKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBinaryOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_3_0, "<");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCE.g:1757:3: ( (lv_symbol_4_0= '!=' ) )
                    {
                    // InternalSmartCE.g:1757:3: ( (lv_symbol_4_0= '!=' ) )
                    // InternalSmartCE.g:1758:4: (lv_symbol_4_0= '!=' )
                    {
                    // InternalSmartCE.g:1758:4: (lv_symbol_4_0= '!=' )
                    // InternalSmartCE.g:1759:5: lv_symbol_4_0= '!='
                    {
                    lv_symbol_4_0=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(lv_symbol_4_0, grammarAccess.getBinaryOperatorAccess().getSymbolExclamationMarkEqualsSignKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBinaryOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_4_0, "!=");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCE.g:1772:3: ( (lv_symbol_5_0= '==' ) )
                    {
                    // InternalSmartCE.g:1772:3: ( (lv_symbol_5_0= '==' ) )
                    // InternalSmartCE.g:1773:4: (lv_symbol_5_0= '==' )
                    {
                    // InternalSmartCE.g:1773:4: (lv_symbol_5_0= '==' )
                    // InternalSmartCE.g:1774:5: lv_symbol_5_0= '=='
                    {
                    lv_symbol_5_0=(Token)match(input,43,FOLLOW_2); 

                    					newLeafNode(lv_symbol_5_0, grammarAccess.getBinaryOperatorAccess().getSymbolEqualsSignEqualsSignKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBinaryOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_5_0, "==");
                    				

                    }


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
    // $ANTLR end "ruleBinaryOperator"


    // $ANTLR start "entryRuleApplication"
    // InternalSmartCE.g:1790:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalSmartCE.g:1790:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalSmartCE.g:1791:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalSmartCE.g:1797:1: ruleApplication returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1803:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalSmartCE.g:1804:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalSmartCE.g:1804:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalSmartCE.g:1805:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalSmartCE.g:1805:3: (lv_name_0_0= RULE_STRING )
            // InternalSmartCE.g:1806:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getApplicationAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getApplicationRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleProcess"
    // InternalSmartCE.g:1825:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalSmartCE.g:1825:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalSmartCE.g:1826:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalSmartCE.g:1832:1: ruleProcess returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1838:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalSmartCE.g:1839:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalSmartCE.g:1839:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalSmartCE.g:1840:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalSmartCE.g:1840:3: (lv_name_0_0= RULE_STRING )
            // InternalSmartCE.g:1841:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getProcessAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getProcessRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleOnSuccess"
    // InternalSmartCE.g:1860:1: entryRuleOnSuccess returns [EObject current=null] : iv_ruleOnSuccess= ruleOnSuccess EOF ;
    public final EObject entryRuleOnSuccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnSuccess = null;


        try {
            // InternalSmartCE.g:1860:50: (iv_ruleOnSuccess= ruleOnSuccess EOF )
            // InternalSmartCE.g:1861:2: iv_ruleOnSuccess= ruleOnSuccess EOF
            {
             newCompositeNode(grammarAccess.getOnSuccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnSuccess=ruleOnSuccess();

            state._fsp--;

             current =iv_ruleOnSuccess; 
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
    // $ANTLR end "entryRuleOnSuccess"


    // $ANTLR start "ruleOnSuccess"
    // InternalSmartCE.g:1867:1: ruleOnSuccess returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleOnSuccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:1873:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalSmartCE.g:1874:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalSmartCE.g:1874:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalSmartCE.g:1875:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOnSuccessAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSmartCE.g:1879:3: ( (otherlv_1= RULE_ID ) )
            // InternalSmartCE.g:1880:4: (otherlv_1= RULE_ID )
            {
            // InternalSmartCE.g:1880:4: (otherlv_1= RULE_ID )
            // InternalSmartCE.g:1881:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnSuccessRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_1, grammarAccess.getOnSuccessAccess().getActionActionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getOnSuccessAccess().getCommaKeyword_2());
            		
            // InternalSmartCE.g:1896:3: ( (lv_message_3_0= ruleExpression ) )
            // InternalSmartCE.g:1897:4: (lv_message_3_0= ruleExpression )
            {
            // InternalSmartCE.g:1897:4: (lv_message_3_0= ruleExpression )
            // InternalSmartCE.g:1898:5: lv_message_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOnSuccessAccess().getMessageExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_message_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOnSuccessRule());
            					}
            					set(
            						current,
            						"message",
            						lv_message_3_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOnSuccessAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleOnSuccess"


    // $ANTLR start "entryRuleOnBreach"
    // InternalSmartCE.g:1923:1: entryRuleOnBreach returns [EObject current=null] : iv_ruleOnBreach= ruleOnBreach EOF ;
    public final EObject entryRuleOnBreach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnBreach = null;


        try {
            // InternalSmartCE.g:1923:49: (iv_ruleOnBreach= ruleOnBreach EOF )
            // InternalSmartCE.g:1924:2: iv_ruleOnBreach= ruleOnBreach EOF
            {
             newCompositeNode(grammarAccess.getOnBreachRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnBreach=ruleOnBreach();

            state._fsp--;

             current =iv_ruleOnBreach; 
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
    // $ANTLR end "entryRuleOnBreach"


    // $ANTLR start "ruleOnBreach"
    // InternalSmartCE.g:1930:1: ruleOnBreach returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleOnBreach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:1936:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalSmartCE.g:1937:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalSmartCE.g:1937:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalSmartCE.g:1938:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOnBreachAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSmartCE.g:1942:3: ( (otherlv_1= RULE_ID ) )
            // InternalSmartCE.g:1943:4: (otherlv_1= RULE_ID )
            {
            // InternalSmartCE.g:1943:4: (otherlv_1= RULE_ID )
            // InternalSmartCE.g:1944:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnBreachRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_1, grammarAccess.getOnBreachAccess().getActionActionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getOnBreachAccess().getCommaKeyword_2());
            		
            // InternalSmartCE.g:1959:3: ( (lv_message_3_0= ruleExpression ) )
            // InternalSmartCE.g:1960:4: (lv_message_3_0= ruleExpression )
            {
            // InternalSmartCE.g:1960:4: (lv_message_3_0= ruleExpression )
            // InternalSmartCE.g:1961:5: lv_message_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOnBreachAccess().getMessageExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_message_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOnBreachRule());
            					}
            					set(
            						current,
            						"message",
            						lv_message_3_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOnBreachAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleOnBreach"


    // $ANTLR start "entryRuleBusinessAction"
    // InternalSmartCE.g:1986:1: entryRuleBusinessAction returns [EObject current=null] : iv_ruleBusinessAction= ruleBusinessAction EOF ;
    public final EObject entryRuleBusinessAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessAction = null;


        try {
            // InternalSmartCE.g:1986:55: (iv_ruleBusinessAction= ruleBusinessAction EOF )
            // InternalSmartCE.g:1987:2: iv_ruleBusinessAction= ruleBusinessAction EOF
            {
             newCompositeNode(grammarAccess.getBusinessActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBusinessAction=ruleBusinessAction();

            state._fsp--;

             current =iv_ruleBusinessAction; 
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
    // $ANTLR end "entryRuleBusinessAction"


    // $ANTLR start "ruleBusinessAction"
    // InternalSmartCE.g:1993:1: ruleBusinessAction returns [EObject current=null] : (otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBusinessAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1999:2: ( (otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSmartCE.g:2000:2: (otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSmartCE.g:2000:2: (otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSmartCE.g:2001:3: otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessActionAccess().getBusinessActionKeyword_0());
            		
            // InternalSmartCE.g:2005:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCE.g:2006:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCE.g:2006:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCE.g:2007:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBusinessActionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusinessActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleBusinessAction"


    // $ANTLR start "entryRuleEventLog"
    // InternalSmartCE.g:2027:1: entryRuleEventLog returns [EObject current=null] : iv_ruleEventLog= ruleEventLog EOF ;
    public final EObject entryRuleEventLog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventLog = null;


        try {
            // InternalSmartCE.g:2027:49: (iv_ruleEventLog= ruleEventLog EOF )
            // InternalSmartCE.g:2028:2: iv_ruleEventLog= ruleEventLog EOF
            {
             newCompositeNode(grammarAccess.getEventLogRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventLog=ruleEventLog();

            state._fsp--;

             current =iv_ruleEventLog; 
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
    // $ANTLR end "entryRuleEventLog"


    // $ANTLR start "ruleEventLog"
    // InternalSmartCE.g:2034:1: ruleEventLog returns [EObject current=null] : (otherlv_0= 'EventLog' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEventLog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2040:2: ( (otherlv_0= 'EventLog' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSmartCE.g:2041:2: (otherlv_0= 'EventLog' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSmartCE.g:2041:2: (otherlv_0= 'EventLog' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSmartCE.g:2042:3: otherlv_0= 'EventLog' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEventLogAccess().getEventLogKeyword_0());
            		
            // InternalSmartCE.g:2046:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCE.g:2047:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCE.g:2047:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCE.g:2048:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEventLogAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventLogRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleEventLog"


    // $ANTLR start "entryRuleExpression"
    // InternalSmartCE.g:2068:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSmartCE.g:2068:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSmartCE.g:2069:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSmartCE.g:2075:1: ruleExpression returns [EObject current=null] : (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        Token lv_symbol_3_0=null;
        EObject this_Negation_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2081:2: ( (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* ) )
            // InternalSmartCE.g:2082:2: (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* )
            {
            // InternalSmartCE.g:2082:2: (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* )
            // InternalSmartCE.g:2083:3: this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getNegationParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_Negation_0=ruleNegation();

            state._fsp--;


            			current = this_Negation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:2091:3: ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=47 && LA17_0<=48)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSmartCE.g:2092:4: () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) )
            	    {
            	    // InternalSmartCE.g:2092:4: ()
            	    // InternalSmartCE.g:2093:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:2099:4: ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==47) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==48) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalSmartCE.g:2100:5: ( (lv_symbol_2_0= '&&' ) )
            	            {
            	            // InternalSmartCE.g:2100:5: ( (lv_symbol_2_0= '&&' ) )
            	            // InternalSmartCE.g:2101:6: (lv_symbol_2_0= '&&' )
            	            {
            	            // InternalSmartCE.g:2101:6: (lv_symbol_2_0= '&&' )
            	            // InternalSmartCE.g:2102:7: lv_symbol_2_0= '&&'
            	            {
            	            lv_symbol_2_0=(Token)match(input,47,FOLLOW_9); 

            	            							newLeafNode(lv_symbol_2_0, grammarAccess.getExpressionAccess().getSymbolAmpersandAmpersandKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_2_0, "&&");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalSmartCE.g:2115:5: ( (lv_symbol_3_0= '||' ) )
            	            {
            	            // InternalSmartCE.g:2115:5: ( (lv_symbol_3_0= '||' ) )
            	            // InternalSmartCE.g:2116:6: (lv_symbol_3_0= '||' )
            	            {
            	            // InternalSmartCE.g:2116:6: (lv_symbol_3_0= '||' )
            	            // InternalSmartCE.g:2117:7: lv_symbol_3_0= '||'
            	            {
            	            lv_symbol_3_0=(Token)match(input,48,FOLLOW_9); 

            	            							newLeafNode(lv_symbol_3_0, grammarAccess.getExpressionAccess().getSymbolVerticalLineVerticalLineKeyword_1_1_1_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_3_0, "||");
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalSmartCE.g:2130:4: ( (lv_right_4_0= ruleNegation ) )
            	    // InternalSmartCE.g:2131:5: (lv_right_4_0= ruleNegation )
            	    {
            	    // InternalSmartCE.g:2131:5: (lv_right_4_0= ruleNegation )
            	    // InternalSmartCE.g:2132:6: lv_right_4_0= ruleNegation
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightNegationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_right_4_0=ruleNegation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"br.edu.unijui.gca.smartce.SmartCE.Negation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleNegation"
    // InternalSmartCE.g:2154:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalSmartCE.g:2154:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalSmartCE.g:2155:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalSmartCE.g:2161:1: ruleNegation returns [EObject current=null] : (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        EObject this_Comparison_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2167:2: ( (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) ) )
            // InternalSmartCE.g:2168:2: (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) )
            {
            // InternalSmartCE.g:2168:2: (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)||LA18_0==23||LA18_0==53) ) {
                alt18=1;
            }
            else if ( (LA18_0==49) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSmartCE.g:2169:3: this_Comparison_0= ruleComparison
                    {

                    			newCompositeNode(grammarAccess.getNegationAccess().getComparisonParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comparison_0=ruleComparison();

                    state._fsp--;


                    			current = this_Comparison_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:2178:3: ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) )
                    {
                    // InternalSmartCE.g:2178:3: ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) )
                    // InternalSmartCE.g:2179:4: () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) )
                    {
                    // InternalSmartCE.g:2179:4: ()
                    // InternalSmartCE.g:2180:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegationAccess().getUnaryOperatorAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSmartCE.g:2186:4: ( (lv_symbol_2_0= '!' ) )
                    // InternalSmartCE.g:2187:5: (lv_symbol_2_0= '!' )
                    {
                    // InternalSmartCE.g:2187:5: (lv_symbol_2_0= '!' )
                    // InternalSmartCE.g:2188:6: lv_symbol_2_0= '!'
                    {
                    lv_symbol_2_0=(Token)match(input,49,FOLLOW_36); 

                    						newLeafNode(lv_symbol_2_0, grammarAccess.getNegationAccess().getSymbolExclamationMarkKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNegationRule());
                    						}
                    						setWithLastConsumed(current, "symbol", lv_symbol_2_0, "!");
                    					

                    }


                    }

                    // InternalSmartCE.g:2200:4: ( (lv_expression_3_0= ruleComparison ) )
                    // InternalSmartCE.g:2201:5: (lv_expression_3_0= ruleComparison )
                    {
                    // InternalSmartCE.g:2201:5: (lv_expression_3_0= ruleComparison )
                    // InternalSmartCE.g:2202:6: lv_expression_3_0= ruleComparison
                    {

                    						newCompositeNode(grammarAccess.getNegationAccess().getExpressionComparisonParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_3_0=ruleComparison();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNegationRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_3_0,
                    							"br.edu.unijui.gca.smartce.SmartCE.Comparison");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleComparison"
    // InternalSmartCE.g:2224:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalSmartCE.g:2224:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalSmartCE.g:2225:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalSmartCE.g:2231:1: ruleComparison returns [EObject current=null] : (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        Token lv_symbol_3_0=null;
        Token lv_symbol_4_0=null;
        Token lv_symbol_5_0=null;
        Token lv_symbol_6_0=null;
        Token lv_symbol_7_0=null;
        Token lv_symbol_8_0=null;
        Token lv_symbol_9_0=null;
        EObject this_Plus_0 = null;

        EObject lv_right_10_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2237:2: ( (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* ) )
            // InternalSmartCE.g:2238:2: (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* )
            {
            // InternalSmartCE.g:2238:2: (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* )
            // InternalSmartCE.g:2239:3: this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_Plus_0=rulePlus();

            state._fsp--;


            			current = this_Plus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:2247:3: ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=38 && LA20_0<=43)||(LA20_0>=50 && LA20_0<=51)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSmartCE.g:2248:4: () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) )
            	    {
            	    // InternalSmartCE.g:2248:4: ()
            	    // InternalSmartCE.g:2249:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:2255:4: ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) )
            	    int alt19=8;
            	    switch ( input.LA(1) ) {
            	    case 38:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt19=4;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt19=5;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt19=6;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt19=7;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt19=8;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // InternalSmartCE.g:2256:5: ( (lv_symbol_2_0= '<=' ) )
            	            {
            	            // InternalSmartCE.g:2256:5: ( (lv_symbol_2_0= '<=' ) )
            	            // InternalSmartCE.g:2257:6: (lv_symbol_2_0= '<=' )
            	            {
            	            // InternalSmartCE.g:2257:6: (lv_symbol_2_0= '<=' )
            	            // InternalSmartCE.g:2258:7: lv_symbol_2_0= '<='
            	            {
            	            lv_symbol_2_0=(Token)match(input,38,FOLLOW_36); 

            	            							newLeafNode(lv_symbol_2_0, grammarAccess.getComparisonAccess().getSymbolLessThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_2_0, "<=");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalSmartCE.g:2271:5: ( (lv_symbol_3_0= '>=' ) )
            	            {
            	            // InternalSmartCE.g:2271:5: ( (lv_symbol_3_0= '>=' ) )
            	            // InternalSmartCE.g:2272:6: (lv_symbol_3_0= '>=' )
            	            {
            	            // InternalSmartCE.g:2272:6: (lv_symbol_3_0= '>=' )
            	            // InternalSmartCE.g:2273:7: lv_symbol_3_0= '>='
            	            {
            	            lv_symbol_3_0=(Token)match(input,39,FOLLOW_36); 

            	            							newLeafNode(lv_symbol_3_0, grammarAccess.getComparisonAccess().getSymbolGreaterThanSignEqualsSignKeyword_1_1_1_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_3_0, ">=");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalSmartCE.g:2286:5: ( (lv_symbol_4_0= '>' ) )
            	            {
            	            // InternalSmartCE.g:2286:5: ( (lv_symbol_4_0= '>' ) )
            	            // InternalSmartCE.g:2287:6: (lv_symbol_4_0= '>' )
            	            {
            	            // InternalSmartCE.g:2287:6: (lv_symbol_4_0= '>' )
            	            // InternalSmartCE.g:2288:7: lv_symbol_4_0= '>'
            	            {
            	            lv_symbol_4_0=(Token)match(input,40,FOLLOW_36); 

            	            							newLeafNode(lv_symbol_4_0, grammarAccess.getComparisonAccess().getSymbolGreaterThanSignKeyword_1_1_2_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_4_0, ">");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalSmartCE.g:2301:5: ( (lv_symbol_5_0= '<' ) )
            	            {
            	            // InternalSmartCE.g:2301:5: ( (lv_symbol_5_0= '<' ) )
            	            // InternalSmartCE.g:2302:6: (lv_symbol_5_0= '<' )
            	            {
            	            // InternalSmartCE.g:2302:6: (lv_symbol_5_0= '<' )
            	            // InternalSmartCE.g:2303:7: lv_symbol_5_0= '<'
            	            {
            	            lv_symbol_5_0=(Token)match(input,41,FOLLOW_36); 

            	            							newLeafNode(lv_symbol_5_0, grammarAccess.getComparisonAccess().getSymbolLessThanSignKeyword_1_1_3_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_5_0, "<");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalSmartCE.g:2316:5: ( (lv_symbol_6_0= '!=' ) )
            	            {
            	            // InternalSmartCE.g:2316:5: ( (lv_symbol_6_0= '!=' ) )
            	            // InternalSmartCE.g:2317:6: (lv_symbol_6_0= '!=' )
            	            {
            	            // InternalSmartCE.g:2317:6: (lv_symbol_6_0= '!=' )
            	            // InternalSmartCE.g:2318:7: lv_symbol_6_0= '!='
            	            {
            	            lv_symbol_6_0=(Token)match(input,42,FOLLOW_36); 

            	            							newLeafNode(lv_symbol_6_0, grammarAccess.getComparisonAccess().getSymbolExclamationMarkEqualsSignKeyword_1_1_4_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_6_0, "!=");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 6 :
            	            // InternalSmartCE.g:2331:5: ( (lv_symbol_7_0= '==' ) )
            	            {
            	            // InternalSmartCE.g:2331:5: ( (lv_symbol_7_0= '==' ) )
            	            // InternalSmartCE.g:2332:6: (lv_symbol_7_0= '==' )
            	            {
            	            // InternalSmartCE.g:2332:6: (lv_symbol_7_0= '==' )
            	            // InternalSmartCE.g:2333:7: lv_symbol_7_0= '=='
            	            {
            	            lv_symbol_7_0=(Token)match(input,43,FOLLOW_36); 

            	            							newLeafNode(lv_symbol_7_0, grammarAccess.getComparisonAccess().getSymbolEqualsSignEqualsSignKeyword_1_1_5_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_7_0, "==");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 7 :
            	            // InternalSmartCE.g:2346:5: ( (lv_symbol_8_0= 'is' ) )
            	            {
            	            // InternalSmartCE.g:2346:5: ( (lv_symbol_8_0= 'is' ) )
            	            // InternalSmartCE.g:2347:6: (lv_symbol_8_0= 'is' )
            	            {
            	            // InternalSmartCE.g:2347:6: (lv_symbol_8_0= 'is' )
            	            // InternalSmartCE.g:2348:7: lv_symbol_8_0= 'is'
            	            {
            	            lv_symbol_8_0=(Token)match(input,50,FOLLOW_36); 

            	            							newLeafNode(lv_symbol_8_0, grammarAccess.getComparisonAccess().getSymbolIsKeyword_1_1_6_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_8_0, "is");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 8 :
            	            // InternalSmartCE.g:2361:5: ( (lv_symbol_9_0= 'as' ) )
            	            {
            	            // InternalSmartCE.g:2361:5: ( (lv_symbol_9_0= 'as' ) )
            	            // InternalSmartCE.g:2362:6: (lv_symbol_9_0= 'as' )
            	            {
            	            // InternalSmartCE.g:2362:6: (lv_symbol_9_0= 'as' )
            	            // InternalSmartCE.g:2363:7: lv_symbol_9_0= 'as'
            	            {
            	            lv_symbol_9_0=(Token)match(input,51,FOLLOW_36); 

            	            							newLeafNode(lv_symbol_9_0, grammarAccess.getComparisonAccess().getSymbolAsKeyword_1_1_7_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_9_0, "as");
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalSmartCE.g:2376:4: ( (lv_right_10_0= rulePlus ) )
            	    // InternalSmartCE.g:2377:5: (lv_right_10_0= rulePlus )
            	    {
            	    // InternalSmartCE.g:2377:5: (lv_right_10_0= rulePlus )
            	    // InternalSmartCE.g:2378:6: lv_right_10_0= rulePlus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_right_10_0=rulePlus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_10_0,
            	    							"br.edu.unijui.gca.smartce.SmartCE.Plus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlus"
    // InternalSmartCE.g:2400:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalSmartCE.g:2400:45: (iv_rulePlus= rulePlus EOF )
            // InternalSmartCE.g:2401:2: iv_rulePlus= rulePlus EOF
            {
             newCompositeNode(grammarAccess.getPlusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlus=rulePlus();

            state._fsp--;

             current =iv_rulePlus; 
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
    // $ANTLR end "entryRulePlus"


    // $ANTLR start "rulePlus"
    // InternalSmartCE.g:2407:1: rulePlus returns [EObject current=null] : (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2413:2: ( (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* ) )
            // InternalSmartCE.g:2414:2: (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* )
            {
            // InternalSmartCE.g:2414:2: (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* )
            // InternalSmartCE.g:2415:3: this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:2423:3: ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=52 && LA22_0<=53)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSmartCE.g:2424:4: () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) )
            	    {
            	    // InternalSmartCE.g:2424:4: ()
            	    // InternalSmartCE.g:2425:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPlusAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:2431:4: (otherlv_2= '+' | otherlv_3= '-' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==52) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==53) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalSmartCE.g:2432:5: otherlv_2= '+'
            	            {
            	            otherlv_2=(Token)match(input,52,FOLLOW_36); 

            	            					newLeafNode(otherlv_2, grammarAccess.getPlusAccess().getPlusSignKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSmartCE.g:2437:5: otherlv_3= '-'
            	            {
            	            otherlv_3=(Token)match(input,53,FOLLOW_36); 

            	            					newLeafNode(otherlv_3, grammarAccess.getPlusAccess().getHyphenMinusKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSmartCE.g:2442:4: ( (lv_right_4_0= ruleFactor ) )
            	    // InternalSmartCE.g:2443:5: (lv_right_4_0= ruleFactor )
            	    {
            	    // InternalSmartCE.g:2443:5: (lv_right_4_0= ruleFactor )
            	    // InternalSmartCE.g:2444:6: lv_right_4_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getPlusAccess().getRightFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_right_4_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"br.edu.unijui.gca.smartce.SmartCE.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleFactor"
    // InternalSmartCE.g:2466:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalSmartCE.g:2466:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalSmartCE.g:2467:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalSmartCE.g:2473:1: ruleFactor returns [EObject current=null] : (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Negative_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2479:2: ( (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* ) )
            // InternalSmartCE.g:2480:2: (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* )
            {
            // InternalSmartCE.g:2480:2: (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* )
            // InternalSmartCE.g:2481:3: this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getNegativeParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            this_Negative_0=ruleNegative();

            state._fsp--;


            			current = this_Negative_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:2489:3: ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=54 && LA24_0<=55)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSmartCE.g:2490:4: () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) )
            	    {
            	    // InternalSmartCE.g:2490:4: ()
            	    // InternalSmartCE.g:2491:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFactorAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:2497:4: (otherlv_2= '*' | otherlv_3= '/' )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==54) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==55) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalSmartCE.g:2498:5: otherlv_2= '*'
            	            {
            	            otherlv_2=(Token)match(input,54,FOLLOW_36); 

            	            					newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSmartCE.g:2503:5: otherlv_3= '/'
            	            {
            	            otherlv_3=(Token)match(input,55,FOLLOW_36); 

            	            					newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSmartCE.g:2508:4: ( (lv_right_4_0= ruleNegative ) )
            	    // InternalSmartCE.g:2509:5: (lv_right_4_0= ruleNegative )
            	    {
            	    // InternalSmartCE.g:2509:5: (lv_right_4_0= ruleNegative )
            	    // InternalSmartCE.g:2510:6: lv_right_4_0= ruleNegative
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightNegativeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_right_4_0=ruleNegative();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"br.edu.unijui.gca.smartce.SmartCE.Negative");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleNegative"
    // InternalSmartCE.g:2532:1: entryRuleNegative returns [EObject current=null] : iv_ruleNegative= ruleNegative EOF ;
    public final EObject entryRuleNegative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegative = null;


        try {
            // InternalSmartCE.g:2532:49: (iv_ruleNegative= ruleNegative EOF )
            // InternalSmartCE.g:2533:2: iv_ruleNegative= ruleNegative EOF
            {
             newCompositeNode(grammarAccess.getNegativeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegative=ruleNegative();

            state._fsp--;

             current =iv_ruleNegative; 
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
    // $ANTLR end "entryRuleNegative"


    // $ANTLR start "ruleNegative"
    // InternalSmartCE.g:2539:1: ruleNegative returns [EObject current=null] : (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) ) ;
    public final EObject ruleNegative() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2545:2: ( (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) ) )
            // InternalSmartCE.g:2546:2: (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) )
            {
            // InternalSmartCE.g:2546:2: (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)||LA25_0==23) ) {
                alt25=1;
            }
            else if ( (LA25_0==53) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalSmartCE.g:2547:3: this_Primary_0= rulePrimary
                    {

                    			newCompositeNode(grammarAccess.getNegativeAccess().getPrimaryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Primary_0=rulePrimary();

                    state._fsp--;


                    			current = this_Primary_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:2556:3: ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) )
                    {
                    // InternalSmartCE.g:2556:3: ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) )
                    // InternalSmartCE.g:2557:4: () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) )
                    {
                    // InternalSmartCE.g:2557:4: ()
                    // InternalSmartCE.g:2558:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegativeAccess().getUnaryOperatorAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,53,FOLLOW_40); 

                    				newLeafNode(otherlv_2, grammarAccess.getNegativeAccess().getHyphenMinusKeyword_1_1());
                    			
                    // InternalSmartCE.g:2568:4: ( (lv_expression_3_0= rulePrimary ) )
                    // InternalSmartCE.g:2569:5: (lv_expression_3_0= rulePrimary )
                    {
                    // InternalSmartCE.g:2569:5: (lv_expression_3_0= rulePrimary )
                    // InternalSmartCE.g:2570:6: lv_expression_3_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getNegativeAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_3_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNegativeRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_3_0,
                    							"br.edu.unijui.gca.smartce.SmartCE.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleNegative"


    // $ANTLR start "entryRulePrimary"
    // InternalSmartCE.g:2592:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSmartCE.g:2592:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSmartCE.g:2593:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalSmartCE.g:2599:1: rulePrimary returns [EObject current=null] : (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_LiteralValue_0 = null;

        EObject this_Expression_2 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2605:2: ( (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) )
            // InternalSmartCE.g:2606:2: (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            {
            // InternalSmartCE.g:2606:2: (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)) ) {
                alt26=1;
            }
            else if ( (LA26_0==23) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalSmartCE.g:2607:3: this_LiteralValue_0= ruleLiteralValue
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLiteralValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralValue_0=ruleLiteralValue();

                    state._fsp--;


                    			current = this_LiteralValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:2616:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalSmartCE.g:2616:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalSmartCE.g:2617:4: otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_23);
                    this_Expression_2=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleLiteralValue"
    // InternalSmartCE.g:2638:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // InternalSmartCE.g:2638:53: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // InternalSmartCE.g:2639:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
             newCompositeNode(grammarAccess.getLiteralValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;

             current =iv_ruleLiteralValue; 
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
    // $ANTLR end "entryRuleLiteralValue"


    // $ANTLR start "ruleLiteralValue"
    // InternalSmartCE.g:2645:1: ruleLiteralValue returns [EObject current=null] : (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject this_NumericValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_VariableValue_2 = null;

        EObject this_FunctionCall_3 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2651:2: ( (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall ) )
            // InternalSmartCE.g:2652:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )
            {
            // InternalSmartCE.g:2652:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )
            int alt27=4;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalSmartCE.g:2653:3: this_NumericValue_0= ruleNumericValue
                    {

                    			newCompositeNode(grammarAccess.getLiteralValueAccess().getNumericValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericValue_0=ruleNumericValue();

                    state._fsp--;


                    			current = this_NumericValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:2662:3: this_StringValue_1= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getLiteralValueAccess().getStringValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_1=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:2671:3: this_VariableValue_2= ruleVariableValue
                    {

                    			newCompositeNode(grammarAccess.getLiteralValueAccess().getVariableValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableValue_2=ruleVariableValue();

                    state._fsp--;


                    			current = this_VariableValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:2680:3: this_FunctionCall_3= ruleFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getLiteralValueAccess().getFunctionCallParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_3=ruleFunctionCall();

                    state._fsp--;


                    			current = this_FunctionCall_3;
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
    // $ANTLR end "ruleLiteralValue"


    // $ANTLR start "entryRuleNumericValue"
    // InternalSmartCE.g:2692:1: entryRuleNumericValue returns [EObject current=null] : iv_ruleNumericValue= ruleNumericValue EOF ;
    public final EObject entryRuleNumericValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericValue = null;


        try {
            // InternalSmartCE.g:2692:53: (iv_ruleNumericValue= ruleNumericValue EOF )
            // InternalSmartCE.g:2693:2: iv_ruleNumericValue= ruleNumericValue EOF
            {
             newCompositeNode(grammarAccess.getNumericValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericValue=ruleNumericValue();

            state._fsp--;

             current =iv_ruleNumericValue; 
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
    // $ANTLR end "entryRuleNumericValue"


    // $ANTLR start "ruleNumericValue"
    // InternalSmartCE.g:2699:1: ruleNumericValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumericValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2705:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalSmartCE.g:2706:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalSmartCE.g:2706:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalSmartCE.g:2707:3: (lv_value_0_0= RULE_INT )
            {
            // InternalSmartCE.g:2707:3: (lv_value_0_0= RULE_INT )
            // InternalSmartCE.g:2708:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumericValueAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumericValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleNumericValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalSmartCE.g:2727:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalSmartCE.g:2727:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalSmartCE.g:2728:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalSmartCE.g:2734:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2740:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSmartCE.g:2741:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSmartCE.g:2741:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSmartCE.g:2742:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalSmartCE.g:2742:3: (lv_value_0_0= RULE_STRING )
            // InternalSmartCE.g:2743:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleVariableValue"
    // InternalSmartCE.g:2762:1: entryRuleVariableValue returns [EObject current=null] : iv_ruleVariableValue= ruleVariableValue EOF ;
    public final EObject entryRuleVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableValue = null;


        try {
            // InternalSmartCE.g:2762:54: (iv_ruleVariableValue= ruleVariableValue EOF )
            // InternalSmartCE.g:2763:2: iv_ruleVariableValue= ruleVariableValue EOF
            {
             newCompositeNode(grammarAccess.getVariableValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableValue=ruleVariableValue();

            state._fsp--;

             current =iv_ruleVariableValue; 
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
    // $ANTLR end "entryRuleVariableValue"


    // $ANTLR start "ruleVariableValue"
    // InternalSmartCE.g:2769:1: ruleVariableValue returns [EObject current=null] : ( (lv_value_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleVariableValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2775:2: ( ( (lv_value_0_0= ruleQualifiedName ) ) )
            // InternalSmartCE.g:2776:2: ( (lv_value_0_0= ruleQualifiedName ) )
            {
            // InternalSmartCE.g:2776:2: ( (lv_value_0_0= ruleQualifiedName ) )
            // InternalSmartCE.g:2777:3: (lv_value_0_0= ruleQualifiedName )
            {
            // InternalSmartCE.g:2777:3: (lv_value_0_0= ruleQualifiedName )
            // InternalSmartCE.g:2778:4: lv_value_0_0= ruleQualifiedName
            {

            				newCompositeNode(grammarAccess.getVariableValueAccess().getValueQualifiedNameParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleQualifiedName();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getVariableValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"br.edu.unijui.gca.smartce.SmartCE.QualifiedName");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleVariableValue"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalSmartCE.g:2798:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalSmartCE.g:2798:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalSmartCE.g:2799:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalSmartCE.g:2805:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2811:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' ) )
            // InternalSmartCE.g:2812:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            {
            // InternalSmartCE.g:2812:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            // InternalSmartCE.g:2813:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')'
            {
            // InternalSmartCE.g:2813:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalSmartCE.g:2814:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalSmartCE.g:2814:4: (lv_name_0_0= ruleQualifiedName )
            // InternalSmartCE.g:2815:5: lv_name_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getNameQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"br.edu.unijui.gca.smartce.SmartCE.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:2836:3: ( (lv_params_2_0= ruleExpression ) )
            // InternalSmartCE.g:2837:4: (lv_params_2_0= ruleExpression )
            {
            // InternalSmartCE.g:2837:4: (lv_params_2_0= ruleExpression )
            // InternalSmartCE.g:2838:5: lv_params_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getParamsExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_params_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            					}
            					add(
            						current,
            						"params",
            						lv_params_2_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartCE.g:2855:3: (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==44) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSmartCE.g:2856:4: otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,44,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSmartCE.g:2860:4: ( (lv_params_4_0= ruleExpression ) )
            	    // InternalSmartCE.g:2861:5: (lv_params_4_0= ruleExpression )
            	    {
            	    // InternalSmartCE.g:2861:5: (lv_params_4_0= ruleExpression )
            	    // InternalSmartCE.g:2862:6: lv_params_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionCallAccess().getParamsExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_params_4_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            	    						}
            	    						add(
            	    							current,
            	    							"params",
            	    							lv_params_4_0,
            	    							"br.edu.unijui.gca.smartce.SmartCE.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSmartCE.g:2888:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSmartCE.g:2888:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSmartCE.g:2889:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSmartCE.g:2895:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2901:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSmartCE.g:2902:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSmartCE.g:2902:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSmartCE.g:2903:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSmartCE.g:2910:3: (kw= '.' this_ID_2= RULE_ID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==56) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSmartCE.g:2911:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,56,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_42); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalSmartCE.g:2928:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalSmartCE.g:2928:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalSmartCE.g:2929:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalSmartCE.g:2935:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2941:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.*' ) )
            // InternalSmartCE.g:2942:2: (this_QualifiedName_0= ruleQualifiedName kw= '.*' )
            {
            // InternalSmartCE.g:2942:2: (this_QualifiedName_0= ruleQualifiedName kw= '.*' )
            // InternalSmartCE.g:2943:3: this_QualifiedName_0= ruleQualifiedName kw= '.*'
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,57,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
            		

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleYEAR"
    // InternalSmartCE.g:2962:1: entryRuleYEAR returns [String current=null] : iv_ruleYEAR= ruleYEAR EOF ;
    public final String entryRuleYEAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleYEAR = null;


        try {
            // InternalSmartCE.g:2962:44: (iv_ruleYEAR= ruleYEAR EOF )
            // InternalSmartCE.g:2963:2: iv_ruleYEAR= ruleYEAR EOF
            {
             newCompositeNode(grammarAccess.getYEARRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleYEAR=ruleYEAR();

            state._fsp--;

             current =iv_ruleYEAR.getText(); 
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
    // $ANTLR end "entryRuleYEAR"


    // $ANTLR start "ruleYEAR"
    // InternalSmartCE.g:2969:1: ruleYEAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleYEAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2975:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:2976:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getYEARAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleYEAR"


    // $ANTLR start "entryRuleMONTH"
    // InternalSmartCE.g:2986:1: entryRuleMONTH returns [String current=null] : iv_ruleMONTH= ruleMONTH EOF ;
    public final String entryRuleMONTH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMONTH = null;


        try {
            // InternalSmartCE.g:2986:45: (iv_ruleMONTH= ruleMONTH EOF )
            // InternalSmartCE.g:2987:2: iv_ruleMONTH= ruleMONTH EOF
            {
             newCompositeNode(grammarAccess.getMONTHRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMONTH=ruleMONTH();

            state._fsp--;

             current =iv_ruleMONTH.getText(); 
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
    // $ANTLR end "entryRuleMONTH"


    // $ANTLR start "ruleMONTH"
    // InternalSmartCE.g:2993:1: ruleMONTH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleMONTH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2999:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3000:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getMONTHAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleMONTH"


    // $ANTLR start "entryRuleDAY"
    // InternalSmartCE.g:3010:1: entryRuleDAY returns [String current=null] : iv_ruleDAY= ruleDAY EOF ;
    public final String entryRuleDAY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDAY = null;


        try {
            // InternalSmartCE.g:3010:43: (iv_ruleDAY= ruleDAY EOF )
            // InternalSmartCE.g:3011:2: iv_ruleDAY= ruleDAY EOF
            {
             newCompositeNode(grammarAccess.getDAYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDAY=ruleDAY();

            state._fsp--;

             current =iv_ruleDAY.getText(); 
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
    // $ANTLR end "entryRuleDAY"


    // $ANTLR start "ruleDAY"
    // InternalSmartCE.g:3017:1: ruleDAY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleDAY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3023:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3024:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getDAYAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleDAY"


    // $ANTLR start "entryRuleHOUR"
    // InternalSmartCE.g:3034:1: entryRuleHOUR returns [String current=null] : iv_ruleHOUR= ruleHOUR EOF ;
    public final String entryRuleHOUR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHOUR = null;


        try {
            // InternalSmartCE.g:3034:44: (iv_ruleHOUR= ruleHOUR EOF )
            // InternalSmartCE.g:3035:2: iv_ruleHOUR= ruleHOUR EOF
            {
             newCompositeNode(grammarAccess.getHOURRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHOUR=ruleHOUR();

            state._fsp--;

             current =iv_ruleHOUR.getText(); 
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
    // $ANTLR end "entryRuleHOUR"


    // $ANTLR start "ruleHOUR"
    // InternalSmartCE.g:3041:1: ruleHOUR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleHOUR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3047:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3048:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getHOURAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleHOUR"


    // $ANTLR start "entryRuleMIN"
    // InternalSmartCE.g:3058:1: entryRuleMIN returns [String current=null] : iv_ruleMIN= ruleMIN EOF ;
    public final String entryRuleMIN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMIN = null;


        try {
            // InternalSmartCE.g:3058:43: (iv_ruleMIN= ruleMIN EOF )
            // InternalSmartCE.g:3059:2: iv_ruleMIN= ruleMIN EOF
            {
             newCompositeNode(grammarAccess.getMINRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMIN=ruleMIN();

            state._fsp--;

             current =iv_ruleMIN.getText(); 
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
    // $ANTLR end "entryRuleMIN"


    // $ANTLR start "ruleMIN"
    // InternalSmartCE.g:3065:1: ruleMIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleMIN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3071:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3072:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getMINAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleMIN"


    // $ANTLR start "entryRuleSEC"
    // InternalSmartCE.g:3082:1: entryRuleSEC returns [String current=null] : iv_ruleSEC= ruleSEC EOF ;
    public final String entryRuleSEC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSEC = null;


        try {
            // InternalSmartCE.g:3082:43: (iv_ruleSEC= ruleSEC EOF )
            // InternalSmartCE.g:3083:2: iv_ruleSEC= ruleSEC EOF
            {
             newCompositeNode(grammarAccess.getSECRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSEC=ruleSEC();

            state._fsp--;

             current =iv_ruleSEC.getText(); 
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
    // $ANTLR end "entryRuleSEC"


    // $ANTLR start "ruleSEC"
    // InternalSmartCE.g:3089:1: ruleSEC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleSEC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3095:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3096:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getSECAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleSEC"


    // $ANTLR start "ruleOperation"
    // InternalSmartCE.g:3106:1: ruleOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) ) ;
    public final Enumerator ruleOperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3112:2: ( ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) ) )
            // InternalSmartCE.g:3113:2: ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) )
            {
            // InternalSmartCE.g:3113:2: ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) )
            int alt30=6;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt30=1;
                }
                break;
            case 59:
                {
                alt30=2;
                }
                break;
            case 60:
                {
                alt30=3;
                }
                break;
            case 61:
                {
                alt30=4;
                }
                break;
            case 62:
                {
                alt30=5;
                }
                break;
            case 63:
                {
                alt30=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalSmartCE.g:3114:3: (enumLiteral_0= 'push' )
                    {
                    // InternalSmartCE.g:3114:3: (enumLiteral_0= 'push' )
                    // InternalSmartCE.g:3115:4: enumLiteral_0= 'push'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getPUSHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationAccess().getPUSHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:3122:3: (enumLiteral_1= 'poll' )
                    {
                    // InternalSmartCE.g:3122:3: (enumLiteral_1= 'poll' )
                    // InternalSmartCE.g:3123:4: enumLiteral_1= 'poll'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getPOLLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationAccess().getPOLLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:3130:3: (enumLiteral_2= 'write' )
                    {
                    // InternalSmartCE.g:3130:3: (enumLiteral_2= 'write' )
                    // InternalSmartCE.g:3131:4: enumLiteral_2= 'write'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getWRITEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperationAccess().getWRITEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:3138:3: (enumLiteral_3= 'read' )
                    {
                    // InternalSmartCE.g:3138:3: (enumLiteral_3= 'read' )
                    // InternalSmartCE.g:3139:4: enumLiteral_3= 'read'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getREADEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperationAccess().getREADEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCE.g:3146:3: (enumLiteral_4= 'request' )
                    {
                    // InternalSmartCE.g:3146:3: (enumLiteral_4= 'request' )
                    // InternalSmartCE.g:3147:4: enumLiteral_4= 'request'
                    {
                    enumLiteral_4=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getREQUESTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperationAccess().getREQUESTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCE.g:3154:3: (enumLiteral_5= 'response' )
                    {
                    // InternalSmartCE.g:3154:3: (enumLiteral_5= 'response' )
                    // InternalSmartCE.g:3155:4: enumLiteral_5= 'response'
                    {
                    enumLiteral_5=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getRESPONSEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOperationAccess().getRESPONSEEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "ruleWeekDay"
    // InternalSmartCE.g:3165:1: ruleWeekDay returns [Enumerator current=null] : ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) ) ;
    public final Enumerator ruleWeekDay() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3171:2: ( ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) ) )
            // InternalSmartCE.g:3172:2: ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) )
            {
            // InternalSmartCE.g:3172:2: ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) )
            int alt31=7;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt31=1;
                }
                break;
            case 65:
                {
                alt31=2;
                }
                break;
            case 66:
                {
                alt31=3;
                }
                break;
            case 67:
                {
                alt31=4;
                }
                break;
            case 68:
                {
                alt31=5;
                }
                break;
            case 69:
                {
                alt31=6;
                }
                break;
            case 70:
                {
                alt31=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalSmartCE.g:3173:3: (enumLiteral_0= 'Sunday' )
                    {
                    // InternalSmartCE.g:3173:3: (enumLiteral_0= 'Sunday' )
                    // InternalSmartCE.g:3174:4: enumLiteral_0= 'Sunday'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getSUNDAYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWeekDayAccess().getSUNDAYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:3181:3: (enumLiteral_1= 'Monday' )
                    {
                    // InternalSmartCE.g:3181:3: (enumLiteral_1= 'Monday' )
                    // InternalSmartCE.g:3182:4: enumLiteral_1= 'Monday'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getMONDAYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWeekDayAccess().getMONDAYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:3189:3: (enumLiteral_2= 'Tuesday' )
                    {
                    // InternalSmartCE.g:3189:3: (enumLiteral_2= 'Tuesday' )
                    // InternalSmartCE.g:3190:4: enumLiteral_2= 'Tuesday'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTUESDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWeekDayAccess().getTUESDAYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:3197:3: (enumLiteral_3= 'Wednesday' )
                    {
                    // InternalSmartCE.g:3197:3: (enumLiteral_3= 'Wednesday' )
                    // InternalSmartCE.g:3198:4: enumLiteral_3= 'Wednesday'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getWEDNESDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWeekDayAccess().getWEDNESDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCE.g:3205:3: (enumLiteral_4= 'Thursday' )
                    {
                    // InternalSmartCE.g:3205:3: (enumLiteral_4= 'Thursday' )
                    // InternalSmartCE.g:3206:4: enumLiteral_4= 'Thursday'
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTHURSDAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWeekDayAccess().getTHURSDAYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCE.g:3213:3: (enumLiteral_5= 'Friday' )
                    {
                    // InternalSmartCE.g:3213:3: (enumLiteral_5= 'Friday' )
                    // InternalSmartCE.g:3214:4: enumLiteral_5= 'Friday'
                    {
                    enumLiteral_5=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getFRIDAYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWeekDayAccess().getFRIDAYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSmartCE.g:3221:3: (enumLiteral_6= 'Saturday' )
                    {
                    // InternalSmartCE.g:3221:3: (enumLiteral_6= 'Saturday' )
                    // InternalSmartCE.g:3222:4: enumLiteral_6= 'Saturday'
                    {
                    enumLiteral_6=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getSATURDAYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getWeekDayAccess().getSATURDAYEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleWeekDay"


    // $ANTLR start "ruleTimeUnit"
    // InternalSmartCE.g:3232:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3238:2: ( ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) ) )
            // InternalSmartCE.g:3239:2: ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) )
            {
            // InternalSmartCE.g:3239:2: ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) )
            int alt32=7;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt32=1;
                }
                break;
            case 72:
                {
                alt32=2;
                }
                break;
            case 73:
                {
                alt32=3;
                }
                break;
            case 74:
                {
                alt32=4;
                }
                break;
            case 75:
                {
                alt32=5;
                }
                break;
            case 76:
                {
                alt32=6;
                }
                break;
            case 77:
                {
                alt32=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalSmartCE.g:3240:3: (enumLiteral_0= 'Second' )
                    {
                    // InternalSmartCE.g:3240:3: (enumLiteral_0= 'Second' )
                    // InternalSmartCE.g:3241:4: enumLiteral_0= 'Second'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getSECONDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSECONDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:3248:3: (enumLiteral_1= 'Minute' )
                    {
                    // InternalSmartCE.g:3248:3: (enumLiteral_1= 'Minute' )
                    // InternalSmartCE.g:3249:4: enumLiteral_1= 'Minute'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:3256:3: (enumLiteral_2= 'Hour' )
                    {
                    // InternalSmartCE.g:3256:3: (enumLiteral_2= 'Hour' )
                    // InternalSmartCE.g:3257:4: enumLiteral_2= 'Hour'
                    {
                    enumLiteral_2=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:3264:3: (enumLiteral_3= 'Day' )
                    {
                    // InternalSmartCE.g:3264:3: (enumLiteral_3= 'Day' )
                    // InternalSmartCE.g:3265:4: enumLiteral_3= 'Day'
                    {
                    enumLiteral_3=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCE.g:3272:3: (enumLiteral_4= 'Week' )
                    {
                    // InternalSmartCE.g:3272:3: (enumLiteral_4= 'Week' )
                    // InternalSmartCE.g:3273:4: enumLiteral_4= 'Week'
                    {
                    enumLiteral_4=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCE.g:3280:3: (enumLiteral_5= 'Month' )
                    {
                    // InternalSmartCE.g:3280:3: (enumLiteral_5= 'Month' )
                    // InternalSmartCE.g:3281:4: enumLiteral_5= 'Month'
                    {
                    enumLiteral_5=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMONTHEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTimeUnitAccess().getMONTHEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSmartCE.g:3288:3: (enumLiteral_6= 'Year' )
                    {
                    // InternalSmartCE.g:3288:3: (enumLiteral_6= 'Year' )
                    // InternalSmartCE.g:3289:4: enumLiteral_6= 'Year'
                    {
                    enumLiteral_6=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getYEAREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTimeUnitAccess().getYEAREnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleTimeUnit"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String dfa_1s = "\135\uffff";
    static final String dfa_2s = "\31\uffff\1\55\12\uffff\1\55\43\uffff\6\55\14\uffff\1\55\1\uffff\1\55";
    static final String dfa_3s = "\1\35\6\27\2\5\1\100\2\6\1\5\1\30\1\37\10\41\1\30\1\107\1\32\1\107\1\100\1\6\1\107\6\4\1\32\7\30\2\uffff\31\30\1\6\6\32\1\107\1\4\1\41\10\30\1\6\1\32\1\30\1\32";
    static final String dfa_4s = "\1\45\6\27\2\5\1\106\2\6\1\5\1\30\1\37\10\41\1\53\1\115\1\34\1\115\1\106\1\6\1\115\6\6\1\34\7\44\2\uffff\26\30\1\37\1\70\1\37\1\6\6\34\1\115\1\4\1\41\7\30\1\70\1\6\1\34\1\30\1\34";
    static final String dfa_5s = "\54\uffff\1\2\1\1\57\uffff";
    static final String dfa_6s = "\135\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\uffff\1\3\1\uffff\1\4\1\6\1\uffff\1\5",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\34",
            "\1\44\6\uffff\1\35\6\uffff\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53",
            "\3\54",
            "\1\56\1\57\1\60\1\61\1\62\1\63\1\64",
            "\1\65\1\66\1\67\1\70\1\71\1\72\1\73",
            "\1\74",
            "\1\75\1\76\1\77\1\100\1\101\1\102\1\103",
            "\1\105\1\106\1\104",
            "\1\105\1\106\1\104",
            "\1\105\1\106\1\104",
            "\1\105\1\106\1\104",
            "\1\105\1\106\1\104",
            "\1\105\1\106\1\104",
            "\3\54",
            "\1\110\13\uffff\1\107",
            "\1\110\13\uffff\1\107",
            "\1\110\13\uffff\1\107",
            "\1\110\13\uffff\1\107",
            "\1\110\13\uffff\1\107",
            "\1\110\13\uffff\1\107",
            "\1\110\13\uffff\1\107",
            "",
            "",
            "\1\111",
            "\1\111",
            "\1\111",
            "\1\111",
            "\1\111",
            "\1\111",
            "\1\111",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\115\6\uffff\1\116",
            "\1\115\6\uffff\1\116\30\uffff\1\117",
            "\1\115\6\uffff\1\116",
            "\1\120",
            "\3\54",
            "\3\54",
            "\3\54",
            "\3\54",
            "\3\54",
            "\3\54",
            "\1\121\1\122\1\123\1\124\1\125\1\126\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\132",
            "\1\132",
            "\1\132",
            "\1\132",
            "\1\132",
            "\1\132",
            "\1\115\6\uffff\1\116\30\uffff\1\117",
            "\1\133",
            "\3\54",
            "\1\134",
            "\3\54"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "445:2: (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition )";
        }
    }
    static final String dfa_8s = "\1\35\6\27\2\5\1\100\2\6\1\5\1\30\1\37\10\41\1\30\1\107\1\24\1\107\1\100\1\6\1\107\1\24\6\4\7\30\2\uffff\31\30\1\24\1\6\4\24\1\107\1\24\1\4\1\41\10\30\1\6\1\24\1\30\1\24";
    static final String dfa_9s = "\1\45\6\27\2\5\1\106\2\6\1\5\1\30\1\37\10\41\1\53\1\115\1\34\1\115\1\106\1\6\1\115\1\34\6\6\7\44\2\uffff\26\30\1\37\1\70\1\37\1\34\1\6\4\34\1\115\1\34\1\4\1\41\7\30\1\70\1\6\1\34\1\30\1\34";
    static final String[] dfa_10s = {
            "\1\1\1\2\1\uffff\1\3\1\uffff\1\4\1\6\1\uffff\1\5",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\34",
            "\1\36\6\uffff\1\35\6\uffff\1\37\1\40\1\41\1\42\1\43\1\44",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53",
            "\1\55\5\uffff\3\54",
            "\1\56\1\57\1\60\1\61\1\62\1\63\1\64",
            "\1\65\1\66\1\67\1\70\1\71\1\72\1\73",
            "\1\74",
            "\1\75\1\76\1\77\1\100\1\101\1\102\1\103",
            "\1\55\5\uffff\3\54",
            "\1\105\1\106\1\104",
            "\1\105\1\106\1\104",
            "\1\105\1\106\1\104",
            "\1\105\1\106\1\104",
            "\1\105\1\106\1\104",
            "\1\105\1\106\1\104",
            "\1\107\13\uffff\1\110",
            "\1\107\13\uffff\1\110",
            "\1\107\13\uffff\1\110",
            "\1\107\13\uffff\1\110",
            "\1\107\13\uffff\1\110",
            "\1\107\13\uffff\1\110",
            "\1\107\13\uffff\1\110",
            "",
            "",
            "\1\111",
            "\1\111",
            "\1\111",
            "\1\111",
            "\1\111",
            "\1\111",
            "\1\111",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\116\6\uffff\1\115",
            "\1\116\6\uffff\1\115\30\uffff\1\117",
            "\1\116\6\uffff\1\115",
            "\1\55\5\uffff\3\54",
            "\1\120",
            "\1\55\5\uffff\3\54",
            "\1\55\5\uffff\3\54",
            "\1\55\5\uffff\3\54",
            "\1\55\5\uffff\3\54",
            "\1\121\1\122\1\123\1\124\1\125\1\126\1\127",
            "\1\55\5\uffff\3\54",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\132",
            "\1\132",
            "\1\132",
            "\1\132",
            "\1\132",
            "\1\132",
            "\1\116\6\uffff\1\115\30\uffff\1\117",
            "\1\133",
            "\1\55\5\uffff\3\54",
            "\1\134",
            "\1\55\5\uffff\3\54"
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "710:4: ( ( (lv_conditions_12_0= ruleBusinessRule ) ) | ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* ) )";
        }
    }
    static final String dfa_11s = "\15\uffff";
    static final String dfa_12s = "\1\43\1\27\1\5\1\107\7\30\2\uffff";
    static final String dfa_13s = "\1\43\1\27\1\5\1\115\7\44\2\uffff";
    static final String dfa_14s = "\13\uffff\1\1\1\2";
    static final String dfa_15s = "\15\uffff}>";
    static final String[] dfa_16s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\14\13\uffff\1\13",
            "\1\14\13\uffff\1\13",
            "\1\14\13\uffff\1\13",
            "\1\14\13\uffff\1\13",
            "\1\14\13\uffff\1\13",
            "\1\14\13\uffff\1\13",
            "\1\14\13\uffff\1\13",
            "",
            ""
    };

    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final char[] dfa_12 = DFA.unpackEncodedStringToUnsignedChars(dfa_12s);
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[][] dfa_16 = unpackEncodedStringArray(dfa_16s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_11;
            this.eof = dfa_11;
            this.min = dfa_12;
            this.max = dfa_13;
            this.accept = dfa_14;
            this.special = dfa_15;
            this.transition = dfa_16;
        }
        public String getDescription() {
            return "1174:2: ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'from' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'to' ( (lv_end_7_0= RULE_STRING ) ) otherlv_8= ')' ) | (otherlv_9= 'SessionInterval' otherlv_10= '(' ( (lv_frequency_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) otherlv_13= ')' ) )";
        }
    }
    static final String dfa_17s = "\23\uffff";
    static final String dfa_18s = "\1\45\1\27\1\6\1\30\1\uffff\6\4\1\uffff\3\30\2\uffff\1\4\1\30";
    static final String dfa_19s = "\1\45\1\27\1\6\1\53\1\uffff\6\6\1\uffff\1\37\1\70\1\37\2\uffff\1\4\1\70";
    static final String dfa_20s = "\4\uffff\1\1\6\uffff\1\2\3\uffff\1\4\1\3\2\uffff";
    static final String dfa_21s = "\23\uffff}>";
    static final String[] dfa_22s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\6\uffff\1\13\6\uffff\1\5\1\6\1\7\1\10\1\11\1\12",
            "",
            "\1\15\1\16\1\14",
            "\1\15\1\16\1\14",
            "\1\15\1\16\1\14",
            "\1\15\1\16\1\14",
            "\1\15\1\16\1\14",
            "\1\15\1\16\1\14",
            "",
            "\1\20\6\uffff\1\17",
            "\1\20\6\uffff\1\17\30\uffff\1\21",
            "\1\20\6\uffff\1\17",
            "",
            "",
            "\1\22",
            "\1\20\6\uffff\1\17\30\uffff\1\21"
    };

    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_17;
            this.eof = dfa_17;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_21;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "1340:2: ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' ) | (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' ) )";
        }
    }
    static final String dfa_23s = "\10\uffff";
    static final String dfa_24s = "\3\uffff\1\6\3\uffff\1\6";
    static final String dfa_25s = "\1\4\2\uffff\2\4\2\uffff\1\4";
    static final String dfa_26s = "\1\6\2\uffff\1\70\1\4\2\uffff\1\70";
    static final String dfa_27s = "\1\uffff\1\1\1\2\2\uffff\1\4\1\3\1\uffff";
    static final String dfa_28s = "\10\uffff}>";
    static final String[] dfa_29s = {
            "\1\3\1\1\1\2",
            "",
            "",
            "\1\6\13\uffff\2\6\2\uffff\1\6\2\uffff\1\5\1\6\15\uffff\7\6\2\uffff\2\6\1\uffff\6\6\1\4",
            "\1\7",
            "",
            "",
            "\1\6\13\uffff\2\6\2\uffff\1\6\2\uffff\1\5\1\6\15\uffff\7\6\2\uffff\2\6\1\uffff\6\6\1\4"
    };

    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[][] dfa_29 = unpackEncodedStringArray(dfa_29s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_23;
            this.eof = dfa_24;
            this.min = dfa_25;
            this.max = dfa_26;
            this.accept = dfa_27;
            this.special = dfa_28;
            this.transition = dfa_29;
        }
        public String getDescription() {
            return "2652:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0022000000800070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002D60000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000001C100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003F80L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000FC000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0020000000800070L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000C0FC000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000800070L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100001000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200000000000000L});

}