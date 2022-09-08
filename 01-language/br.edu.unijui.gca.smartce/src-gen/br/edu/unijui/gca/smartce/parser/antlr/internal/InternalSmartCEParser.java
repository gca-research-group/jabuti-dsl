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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'Contract'", "'{'", "'dates'", "'beginDate'", "'='", "'dueDate'", "'}'", "'parties'", "'application'", "'process'", "'variables'", "'clauses'", "'Right'", "'Prohibition'", "'Obligation'", "'rolePlayer'", "'operation'", "'condition'", "'onBreach'", "'onSuccess'", "'when'", "'('", "')'", "'do'", "'AND'", "'OR'", "'NOT'", "'Timeout'", "'OperationLimit'", "'by'", "'BusinessDay'", "'to'", "'TimeInterval'", "'SessionInterval'", "'MessageContent'", "'<='", "'>='", "'>'", "'<'", "'!='", "'=='", "'BusinessAction'", "'EventLog'", "'&&'", "'||'", "'!'", "'is'", "'as'", "'+'", "'-'", "'*'", "'/'", "','", "'.'", "'.*'", "'push'", "'poll'", "'write'", "'read'", "'request'", "'response'", "'Sunday'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Second'", "'Minute'", "'Hour'", "'Day'", "'Week'", "'Month'", "'Year'"
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
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
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
    // InternalSmartCE.g:178:1: ruleContract returns [EObject current=null] : (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'dates' otherlv_4= '{' otherlv_5= 'beginDate' otherlv_6= '=' ( (lv_beginDate_7_0= ruleExpression ) ) otherlv_8= 'dueDate' otherlv_9= '=' ( (lv_dueDate_10_0= ruleExpression ) ) otherlv_11= '}' otherlv_12= 'parties' otherlv_13= '{' otherlv_14= 'application' otherlv_15= '=' ( (lv_application_16_0= ruleApplication ) ) otherlv_17= 'process' otherlv_18= '=' ( (lv_process_19_0= ruleProcess ) ) otherlv_20= '}' (otherlv_21= 'variables' otherlv_22= '{' ( (lv_variables_23_0= ruleVariable ) )* otherlv_24= '}' )? otherlv_25= 'clauses' otherlv_26= '{' ( (lv_clauses_27_0= ruleClause ) )* otherlv_28= '}' otherlv_29= '}' ) ;
    public final EObject ruleContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        EObject lv_beginDate_7_0 = null;

        EObject lv_dueDate_10_0 = null;

        EObject lv_application_16_0 = null;

        EObject lv_process_19_0 = null;

        EObject lv_variables_23_0 = null;

        EObject lv_clauses_27_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:184:2: ( (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'dates' otherlv_4= '{' otherlv_5= 'beginDate' otherlv_6= '=' ( (lv_beginDate_7_0= ruleExpression ) ) otherlv_8= 'dueDate' otherlv_9= '=' ( (lv_dueDate_10_0= ruleExpression ) ) otherlv_11= '}' otherlv_12= 'parties' otherlv_13= '{' otherlv_14= 'application' otherlv_15= '=' ( (lv_application_16_0= ruleApplication ) ) otherlv_17= 'process' otherlv_18= '=' ( (lv_process_19_0= ruleProcess ) ) otherlv_20= '}' (otherlv_21= 'variables' otherlv_22= '{' ( (lv_variables_23_0= ruleVariable ) )* otherlv_24= '}' )? otherlv_25= 'clauses' otherlv_26= '{' ( (lv_clauses_27_0= ruleClause ) )* otherlv_28= '}' otherlv_29= '}' ) )
            // InternalSmartCE.g:185:2: (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'dates' otherlv_4= '{' otherlv_5= 'beginDate' otherlv_6= '=' ( (lv_beginDate_7_0= ruleExpression ) ) otherlv_8= 'dueDate' otherlv_9= '=' ( (lv_dueDate_10_0= ruleExpression ) ) otherlv_11= '}' otherlv_12= 'parties' otherlv_13= '{' otherlv_14= 'application' otherlv_15= '=' ( (lv_application_16_0= ruleApplication ) ) otherlv_17= 'process' otherlv_18= '=' ( (lv_process_19_0= ruleProcess ) ) otherlv_20= '}' (otherlv_21= 'variables' otherlv_22= '{' ( (lv_variables_23_0= ruleVariable ) )* otherlv_24= '}' )? otherlv_25= 'clauses' otherlv_26= '{' ( (lv_clauses_27_0= ruleClause ) )* otherlv_28= '}' otherlv_29= '}' )
            {
            // InternalSmartCE.g:185:2: (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'dates' otherlv_4= '{' otherlv_5= 'beginDate' otherlv_6= '=' ( (lv_beginDate_7_0= ruleExpression ) ) otherlv_8= 'dueDate' otherlv_9= '=' ( (lv_dueDate_10_0= ruleExpression ) ) otherlv_11= '}' otherlv_12= 'parties' otherlv_13= '{' otherlv_14= 'application' otherlv_15= '=' ( (lv_application_16_0= ruleApplication ) ) otherlv_17= 'process' otherlv_18= '=' ( (lv_process_19_0= ruleProcess ) ) otherlv_20= '}' (otherlv_21= 'variables' otherlv_22= '{' ( (lv_variables_23_0= ruleVariable ) )* otherlv_24= '}' )? otherlv_25= 'clauses' otherlv_26= '{' ( (lv_clauses_27_0= ruleClause ) )* otherlv_28= '}' otherlv_29= '}' )
            // InternalSmartCE.g:186:3: otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'dates' otherlv_4= '{' otherlv_5= 'beginDate' otherlv_6= '=' ( (lv_beginDate_7_0= ruleExpression ) ) otherlv_8= 'dueDate' otherlv_9= '=' ( (lv_dueDate_10_0= ruleExpression ) ) otherlv_11= '}' otherlv_12= 'parties' otherlv_13= '{' otherlv_14= 'application' otherlv_15= '=' ( (lv_application_16_0= ruleApplication ) ) otherlv_17= 'process' otherlv_18= '=' ( (lv_process_19_0= ruleProcess ) ) otherlv_20= '}' (otherlv_21= 'variables' otherlv_22= '{' ( (lv_variables_23_0= ruleVariable ) )* otherlv_24= '}' )? otherlv_25= 'clauses' otherlv_26= '{' ( (lv_clauses_27_0= ruleClause ) )* otherlv_28= '}' otherlv_29= '}'
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
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getContractAccess().getDatesKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getContractAccess().getBeginDateKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getContractAccess().getEqualsSignKeyword_6());
            		
            // InternalSmartCE.g:228:3: ( (lv_beginDate_7_0= ruleExpression ) )
            // InternalSmartCE.g:229:4: (lv_beginDate_7_0= ruleExpression )
            {
            // InternalSmartCE.g:229:4: (lv_beginDate_7_0= ruleExpression )
            // InternalSmartCE.g:230:5: lv_beginDate_7_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getContractAccess().getBeginDateExpressionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_beginDate_7_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"beginDate",
            						lv_beginDate_7_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getContractAccess().getDueDateKeyword_8());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getContractAccess().getEqualsSignKeyword_9());
            		
            // InternalSmartCE.g:255:3: ( (lv_dueDate_10_0= ruleExpression ) )
            // InternalSmartCE.g:256:4: (lv_dueDate_10_0= ruleExpression )
            {
            // InternalSmartCE.g:256:4: (lv_dueDate_10_0= ruleExpression )
            // InternalSmartCE.g:257:5: lv_dueDate_10_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getContractAccess().getDueDateExpressionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_12);
            lv_dueDate_10_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"dueDate",
            						lv_dueDate_10_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_12=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_12, grammarAccess.getContractAccess().getPartiesKeyword_12());
            		
            otherlv_13=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_13, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_13());
            		
            otherlv_14=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_14, grammarAccess.getContractAccess().getApplicationKeyword_14());
            		
            otherlv_15=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_15, grammarAccess.getContractAccess().getEqualsSignKeyword_15());
            		
            // InternalSmartCE.g:294:3: ( (lv_application_16_0= ruleApplication ) )
            // InternalSmartCE.g:295:4: (lv_application_16_0= ruleApplication )
            {
            // InternalSmartCE.g:295:4: (lv_application_16_0= ruleApplication )
            // InternalSmartCE.g:296:5: lv_application_16_0= ruleApplication
            {

            					newCompositeNode(grammarAccess.getContractAccess().getApplicationApplicationParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_16);
            lv_application_16_0=ruleApplication();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"application",
            						lv_application_16_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Application");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_17, grammarAccess.getContractAccess().getProcessKeyword_17());
            		
            otherlv_18=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_18, grammarAccess.getContractAccess().getEqualsSignKeyword_18());
            		
            // InternalSmartCE.g:321:3: ( (lv_process_19_0= ruleProcess ) )
            // InternalSmartCE.g:322:4: (lv_process_19_0= ruleProcess )
            {
            // InternalSmartCE.g:322:4: (lv_process_19_0= ruleProcess )
            // InternalSmartCE.g:323:5: lv_process_19_0= ruleProcess
            {

            					newCompositeNode(grammarAccess.getContractAccess().getProcessProcessParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_12);
            lv_process_19_0=ruleProcess();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"process",
            						lv_process_19_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Process");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_20=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_20, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_20());
            		
            // InternalSmartCE.g:344:3: (otherlv_21= 'variables' otherlv_22= '{' ( (lv_variables_23_0= ruleVariable ) )* otherlv_24= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmartCE.g:345:4: otherlv_21= 'variables' otherlv_22= '{' ( (lv_variables_23_0= ruleVariable ) )* otherlv_24= '}'
                    {
                    otherlv_21=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_21, grammarAccess.getContractAccess().getVariablesKeyword_21_0());
                    			
                    otherlv_22=(Token)match(input,13,FOLLOW_18); 

                    				newLeafNode(otherlv_22, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_21_1());
                    			
                    // InternalSmartCE.g:353:4: ( (lv_variables_23_0= ruleVariable ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSmartCE.g:354:5: (lv_variables_23_0= ruleVariable )
                    	    {
                    	    // InternalSmartCE.g:354:5: (lv_variables_23_0= ruleVariable )
                    	    // InternalSmartCE.g:355:6: lv_variables_23_0= ruleVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getContractAccess().getVariablesVariableParserRuleCall_21_2_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_variables_23_0=ruleVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getContractRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_23_0,
                    	    							"br.edu.unijui.gca.smartce.SmartCE.Variable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,18,FOLLOW_19); 

                    				newLeafNode(otherlv_24, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_21_3());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_25, grammarAccess.getContractAccess().getClausesKeyword_22());
            		
            otherlv_26=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_26, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_23());
            		
            // InternalSmartCE.g:385:3: ( (lv_clauses_27_0= ruleClause ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=24 && LA5_0<=26)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmartCE.g:386:4: (lv_clauses_27_0= ruleClause )
            	    {
            	    // InternalSmartCE.g:386:4: (lv_clauses_27_0= ruleClause )
            	    // InternalSmartCE.g:387:5: lv_clauses_27_0= ruleClause
            	    {

            	    					newCompositeNode(grammarAccess.getContractAccess().getClausesClauseParserRuleCall_24_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_clauses_27_0=ruleClause();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContractRule());
            	    					}
            	    					add(
            	    						current,
            	    						"clauses",
            	    						lv_clauses_27_0,
            	    						"br.edu.unijui.gca.smartce.SmartCE.Clause");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_28=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_28, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_25());
            		
            otherlv_29=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_26());
            		

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
    // InternalSmartCE.g:416:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSmartCE.g:416:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalSmartCE.g:417:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalSmartCE.g:423:1: ruleVariable returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_businessRule_5_0= ruleBusinessRule ) ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_expression_2_0 = null;

        EObject lv_businessRule_5_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:429:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_businessRule_5_0= ruleBusinessRule ) ) ) ) )
            // InternalSmartCE.g:430:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_businessRule_5_0= ruleBusinessRule ) ) ) )
            {
            // InternalSmartCE.g:430:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_businessRule_5_0= ruleBusinessRule ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==16) ) {
                    int LA6_2 = input.LA(3);

                    if ( ((LA6_2>=RULE_ID && LA6_2<=RULE_STRING)||LA6_2==33||LA6_2==57||LA6_2==61) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_2>=39 && LA6_2<=40)||LA6_2==42||(LA6_2>=44 && LA6_2<=46)) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
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
                    // InternalSmartCE.g:431:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
                    {
                    // InternalSmartCE.g:431:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
                    // InternalSmartCE.g:432:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
                    {
                    // InternalSmartCE.g:432:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalSmartCE.g:433:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalSmartCE.g:433:5: (lv_name_0_0= RULE_ID )
                    // InternalSmartCE.g:434:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0_0());
                    					

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

                    otherlv_1=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalSmartCE.g:454:4: ( (lv_expression_2_0= ruleExpression ) )
                    // InternalSmartCE.g:455:5: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalSmartCE.g:455:5: (lv_expression_2_0= ruleExpression )
                    // InternalSmartCE.g:456:6: lv_expression_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_0_2_0());
                    					
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
                    break;
                case 2 :
                    // InternalSmartCE.g:475:3: ( ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_businessRule_5_0= ruleBusinessRule ) ) )
                    {
                    // InternalSmartCE.g:475:3: ( ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_businessRule_5_0= ruleBusinessRule ) ) )
                    // InternalSmartCE.g:476:4: ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_businessRule_5_0= ruleBusinessRule ) )
                    {
                    // InternalSmartCE.g:476:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalSmartCE.g:477:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalSmartCE.g:477:5: (lv_name_3_0= RULE_ID )
                    // InternalSmartCE.g:478:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalSmartCE.g:498:4: ( (lv_businessRule_5_0= ruleBusinessRule ) )
                    // InternalSmartCE.g:499:5: (lv_businessRule_5_0= ruleBusinessRule )
                    {
                    // InternalSmartCE.g:499:5: (lv_businessRule_5_0= ruleBusinessRule )
                    // InternalSmartCE.g:500:6: lv_businessRule_5_0= ruleBusinessRule
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getBusinessRuleBusinessRuleParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_businessRule_5_0=ruleBusinessRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						add(
                    							current,
                    							"businessRule",
                    							lv_businessRule_5_0,
                    							"br.edu.unijui.gca.smartce.SmartCE.BusinessRule");
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleClause"
    // InternalSmartCE.g:522:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalSmartCE.g:522:47: (iv_ruleClause= ruleClause EOF )
            // InternalSmartCE.g:523:2: iv_ruleClause= ruleClause EOF
            {
             newCompositeNode(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClause=ruleClause();

            state._fsp--;

             current =iv_ruleClause; 
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
    // $ANTLR end "entryRuleClause"


    // $ANTLR start "ruleClause"
    // InternalSmartCE.g:529:1: ruleClause returns [EObject current=null] : ( (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'rolePlayer' otherlv_6= '=' (otherlv_7= 'process' | otherlv_8= 'application' ) otherlv_9= 'operation' otherlv_10= '=' ( (lv_operation_11_0= ruleOperation ) ) otherlv_12= 'condition' otherlv_13= '{' ( (lv_condition_14_0= ruleCondition ) ) otherlv_15= '}' otherlv_16= 'onBreach' ( (lv_onBreach_17_0= ruleOnBreach ) ) (otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Enumerator lv_operation_11_0 = null;

        EObject lv_condition_14_0 = null;

        EObject lv_onBreach_17_0 = null;

        EObject lv_onSuccess_19_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:535:2: ( ( (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'rolePlayer' otherlv_6= '=' (otherlv_7= 'process' | otherlv_8= 'application' ) otherlv_9= 'operation' otherlv_10= '=' ( (lv_operation_11_0= ruleOperation ) ) otherlv_12= 'condition' otherlv_13= '{' ( (lv_condition_14_0= ruleCondition ) ) otherlv_15= '}' otherlv_16= 'onBreach' ( (lv_onBreach_17_0= ruleOnBreach ) ) (otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) )? otherlv_20= '}' ) )
            // InternalSmartCE.g:536:2: ( (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'rolePlayer' otherlv_6= '=' (otherlv_7= 'process' | otherlv_8= 'application' ) otherlv_9= 'operation' otherlv_10= '=' ( (lv_operation_11_0= ruleOperation ) ) otherlv_12= 'condition' otherlv_13= '{' ( (lv_condition_14_0= ruleCondition ) ) otherlv_15= '}' otherlv_16= 'onBreach' ( (lv_onBreach_17_0= ruleOnBreach ) ) (otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) )? otherlv_20= '}' )
            {
            // InternalSmartCE.g:536:2: ( (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'rolePlayer' otherlv_6= '=' (otherlv_7= 'process' | otherlv_8= 'application' ) otherlv_9= 'operation' otherlv_10= '=' ( (lv_operation_11_0= ruleOperation ) ) otherlv_12= 'condition' otherlv_13= '{' ( (lv_condition_14_0= ruleCondition ) ) otherlv_15= '}' otherlv_16= 'onBreach' ( (lv_onBreach_17_0= ruleOnBreach ) ) (otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) )? otherlv_20= '}' )
            // InternalSmartCE.g:537:3: (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'rolePlayer' otherlv_6= '=' (otherlv_7= 'process' | otherlv_8= 'application' ) otherlv_9= 'operation' otherlv_10= '=' ( (lv_operation_11_0= ruleOperation ) ) otherlv_12= 'condition' otherlv_13= '{' ( (lv_condition_14_0= ruleCondition ) ) otherlv_15= '}' otherlv_16= 'onBreach' ( (lv_onBreach_17_0= ruleOnBreach ) ) (otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) )? otherlv_20= '}'
            {
            // InternalSmartCE.g:537:3: (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSmartCE.g:538:4: otherlv_0= 'Right'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getClauseAccess().getRightKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:543:4: otherlv_1= 'Prohibition'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getClauseAccess().getProhibitionKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:548:4: otherlv_2= 'Obligation'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getClauseAccess().getObligationKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalSmartCE.g:553:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSmartCE.g:554:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSmartCE.g:554:4: (lv_name_3_0= RULE_ID )
            // InternalSmartCE.g:555:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_3_0, grammarAccess.getClauseAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClauseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getClauseAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getClauseAccess().getRolePlayerKeyword_3());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getClauseAccess().getEqualsSignKeyword_4());
            		
            // InternalSmartCE.g:583:3: (otherlv_7= 'process' | otherlv_8= 'application' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmartCE.g:584:4: otherlv_7= 'process'
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getClauseAccess().getProcessKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:589:4: otherlv_8= 'application'
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_24); 

                    				newLeafNode(otherlv_8, grammarAccess.getClauseAccess().getApplicationKeyword_5_1());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getClauseAccess().getOperationKeyword_6());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_25); 

            			newLeafNode(otherlv_10, grammarAccess.getClauseAccess().getEqualsSignKeyword_7());
            		
            // InternalSmartCE.g:602:3: ( (lv_operation_11_0= ruleOperation ) )
            // InternalSmartCE.g:603:4: (lv_operation_11_0= ruleOperation )
            {
            // InternalSmartCE.g:603:4: (lv_operation_11_0= ruleOperation )
            // InternalSmartCE.g:604:5: lv_operation_11_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getOperationOperationEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_26);
            lv_operation_11_0=ruleOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_11_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Operation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_12, grammarAccess.getClauseAccess().getConditionKeyword_9());
            		
            otherlv_13=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_13, grammarAccess.getClauseAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalSmartCE.g:629:3: ( (lv_condition_14_0= ruleCondition ) )
            // InternalSmartCE.g:630:4: (lv_condition_14_0= ruleCondition )
            {
            // InternalSmartCE.g:630:4: (lv_condition_14_0= ruleCondition )
            // InternalSmartCE.g:631:5: lv_condition_14_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getConditionConditionParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_12);
            lv_condition_14_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_14_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,18,FOLLOW_27); 

            			newLeafNode(otherlv_15, grammarAccess.getClauseAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_16=(Token)match(input,30,FOLLOW_28); 

            			newLeafNode(otherlv_16, grammarAccess.getClauseAccess().getOnBreachKeyword_13());
            		
            // InternalSmartCE.g:656:3: ( (lv_onBreach_17_0= ruleOnBreach ) )
            // InternalSmartCE.g:657:4: (lv_onBreach_17_0= ruleOnBreach )
            {
            // InternalSmartCE.g:657:4: (lv_onBreach_17_0= ruleOnBreach )
            // InternalSmartCE.g:658:5: lv_onBreach_17_0= ruleOnBreach
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getOnBreachOnBreachParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_29);
            lv_onBreach_17_0=ruleOnBreach();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseRule());
            					}
            					set(
            						current,
            						"onBreach",
            						lv_onBreach_17_0,
            						"br.edu.unijui.gca.smartce.SmartCE.OnBreach");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartCE.g:675:3: (otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmartCE.g:676:4: otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) )
                    {
                    otherlv_18=(Token)match(input,31,FOLLOW_28); 

                    				newLeafNode(otherlv_18, grammarAccess.getClauseAccess().getOnSuccessKeyword_15_0());
                    			
                    // InternalSmartCE.g:680:4: ( (lv_onSuccess_19_0= ruleOnSuccess ) )
                    // InternalSmartCE.g:681:5: (lv_onSuccess_19_0= ruleOnSuccess )
                    {
                    // InternalSmartCE.g:681:5: (lv_onSuccess_19_0= ruleOnSuccess )
                    // InternalSmartCE.g:682:6: lv_onSuccess_19_0= ruleOnSuccess
                    {

                    						newCompositeNode(grammarAccess.getClauseAccess().getOnSuccessOnSuccessParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_onSuccess_19_0=ruleOnSuccess();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClauseRule());
                    						}
                    						set(
                    							current,
                    							"onSuccess",
                    							lv_onSuccess_19_0,
                    							"br.edu.unijui.gca.smartce.SmartCE.OnSuccess");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getClauseAccess().getRightCurlyBracketKeyword_16());
            		

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
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleCondition"
    // InternalSmartCE.g:708:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalSmartCE.g:708:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalSmartCE.g:709:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalSmartCE.g:715:1: ruleCondition returns [EObject current=null] : (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition | this_ConditionalExpression_2= ruleConditionalExpression ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_BusinessRule_0 = null;

        EObject this_CompositeCondition_1 = null;

        EObject this_ConditionalExpression_2 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:721:2: ( (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition | this_ConditionalExpression_2= ruleConditionalExpression ) )
            // InternalSmartCE.g:722:2: (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition | this_ConditionalExpression_2= ruleConditionalExpression )
            {
            // InternalSmartCE.g:722:2: (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition | this_ConditionalExpression_2= ruleConditionalExpression )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalSmartCE.g:723:3: this_BusinessRule_0= ruleBusinessRule
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
                    // InternalSmartCE.g:732:3: this_CompositeCondition_1= ruleCompositeCondition
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getCompositeConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeCondition_1=ruleCompositeCondition();

                    state._fsp--;


                    			current = this_CompositeCondition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:741:3: this_ConditionalExpression_2= ruleConditionalExpression
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getConditionalExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionalExpression_2=ruleConditionalExpression();

                    state._fsp--;


                    			current = this_ConditionalExpression_2;
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
    // InternalSmartCE.g:753:1: entryRuleBusinessRule returns [EObject current=null] : iv_ruleBusinessRule= ruleBusinessRule EOF ;
    public final EObject entryRuleBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessRule = null;


        try {
            // InternalSmartCE.g:753:53: (iv_ruleBusinessRule= ruleBusinessRule EOF )
            // InternalSmartCE.g:754:2: iv_ruleBusinessRule= ruleBusinessRule EOF
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
    // InternalSmartCE.g:760:1: ruleBusinessRule returns [EObject current=null] : (this_Timeout_0= ruleTimeout | this_OperationLimit_1= ruleOperationLimit | this_BusinessDay_2= ruleBusinessDay | this_TimeInterval_3= ruleTimeInterval | this_MessageContent_4= ruleMessageContent | this_SessionInterval_5= ruleSessionInterval ) ;
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
            // InternalSmartCE.g:766:2: ( (this_Timeout_0= ruleTimeout | this_OperationLimit_1= ruleOperationLimit | this_BusinessDay_2= ruleBusinessDay | this_TimeInterval_3= ruleTimeInterval | this_MessageContent_4= ruleMessageContent | this_SessionInterval_5= ruleSessionInterval ) )
            // InternalSmartCE.g:767:2: (this_Timeout_0= ruleTimeout | this_OperationLimit_1= ruleOperationLimit | this_BusinessDay_2= ruleBusinessDay | this_TimeInterval_3= ruleTimeInterval | this_MessageContent_4= ruleMessageContent | this_SessionInterval_5= ruleSessionInterval )
            {
            // InternalSmartCE.g:767:2: (this_Timeout_0= ruleTimeout | this_OperationLimit_1= ruleOperationLimit | this_BusinessDay_2= ruleBusinessDay | this_TimeInterval_3= ruleTimeInterval | this_MessageContent_4= ruleMessageContent | this_SessionInterval_5= ruleSessionInterval )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt11=1;
                }
                break;
            case 40:
                {
                alt11=2;
                }
                break;
            case 42:
                {
                alt11=3;
                }
                break;
            case 44:
                {
                alt11=4;
                }
                break;
            case 46:
                {
                alt11=5;
                }
                break;
            case 45:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSmartCE.g:768:3: this_Timeout_0= ruleTimeout
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
                    // InternalSmartCE.g:777:3: this_OperationLimit_1= ruleOperationLimit
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
                    // InternalSmartCE.g:786:3: this_BusinessDay_2= ruleBusinessDay
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
                    // InternalSmartCE.g:795:3: this_TimeInterval_3= ruleTimeInterval
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
                    // InternalSmartCE.g:804:3: this_MessageContent_4= ruleMessageContent
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
                    // InternalSmartCE.g:813:3: this_SessionInterval_5= ruleSessionInterval
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
    // InternalSmartCE.g:825:1: entryRuleCompositeCondition returns [EObject current=null] : iv_ruleCompositeCondition= ruleCompositeCondition EOF ;
    public final EObject entryRuleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCondition = null;


        try {
            // InternalSmartCE.g:825:59: (iv_ruleCompositeCondition= ruleCompositeCondition EOF )
            // InternalSmartCE.g:826:2: iv_ruleCompositeCondition= ruleCompositeCondition EOF
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
    // InternalSmartCE.g:832:1: ruleCompositeCondition returns [EObject current=null] : ( ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* )* ) ;
    public final EObject ruleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_conditions_0_0 = null;

        EObject lv_logicalOperators_1_0 = null;

        EObject lv_conditions_2_0 = null;

        EObject lv_logicalOperators_3_0 = null;

        EObject lv_conditions_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:838:2: ( ( ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* )* ) )
            // InternalSmartCE.g:839:2: ( ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* )* )
            {
            // InternalSmartCE.g:839:2: ( ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* )* )
            // InternalSmartCE.g:840:3: ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* )*
            {
            // InternalSmartCE.g:840:3: ( (lv_conditions_0_0= ruleBusinessRule ) )
            // InternalSmartCE.g:841:4: (lv_conditions_0_0= ruleBusinessRule )
            {
            // InternalSmartCE.g:841:4: (lv_conditions_0_0= ruleBusinessRule )
            // InternalSmartCE.g:842:5: lv_conditions_0_0= ruleBusinessRule
            {

            					newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalSmartCE.g:859:3: ( (lv_logicalOperators_1_0= ruleLogicalOperator ) )
            // InternalSmartCE.g:860:4: (lv_logicalOperators_1_0= ruleLogicalOperator )
            {
            // InternalSmartCE.g:860:4: (lv_logicalOperators_1_0= ruleLogicalOperator )
            // InternalSmartCE.g:861:5: lv_logicalOperators_1_0= ruleLogicalOperator
            {

            					newCompositeNode(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsLogicalOperatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalSmartCE.g:878:3: ( ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=39 && LA13_0<=40)||LA13_0==42||(LA13_0>=44 && LA13_0<=46)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSmartCE.g:879:4: ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )*
            	    {
            	    // InternalSmartCE.g:879:4: ( (lv_conditions_2_0= ruleBusinessRule ) )
            	    // InternalSmartCE.g:880:5: (lv_conditions_2_0= ruleBusinessRule )
            	    {
            	    // InternalSmartCE.g:880:5: (lv_conditions_2_0= ruleBusinessRule )
            	    // InternalSmartCE.g:881:6: lv_conditions_2_0= ruleBusinessRule
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_32);
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

            	    // InternalSmartCE.g:898:4: ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( ((LA12_0>=36 && LA12_0<=38)) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalSmartCE.g:899:5: ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) )
            	    	    {
            	    	    // InternalSmartCE.g:899:5: ( (lv_logicalOperators_3_0= ruleLogicalOperator ) )
            	    	    // InternalSmartCE.g:900:6: (lv_logicalOperators_3_0= ruleLogicalOperator )
            	    	    {
            	    	    // InternalSmartCE.g:900:6: (lv_logicalOperators_3_0= ruleLogicalOperator )
            	    	    // InternalSmartCE.g:901:7: lv_logicalOperators_3_0= ruleLogicalOperator
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsLogicalOperatorParserRuleCall_2_1_0_0());
            	    	    						
            	    	    pushFollow(FOLLOW_21);
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

            	    	    // InternalSmartCE.g:918:5: ( (lv_conditions_4_0= ruleBusinessRule ) )
            	    	    // InternalSmartCE.g:919:6: (lv_conditions_4_0= ruleBusinessRule )
            	    	    {
            	    	    // InternalSmartCE.g:919:6: (lv_conditions_4_0= ruleBusinessRule )
            	    	    // InternalSmartCE.g:920:7: lv_conditions_4_0= ruleBusinessRule
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_2_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_32);
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
            	    	    break loop12;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop13;
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


    // $ANTLR start "entryRuleConditionalExpression"
    // InternalSmartCE.g:943:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // InternalSmartCE.g:943:62: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // InternalSmartCE.g:944:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
             newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;

             current =iv_ruleConditionalExpression; 
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
    // $ANTLR end "entryRuleConditionalExpression"


    // $ANTLR start "ruleConditionalExpression"
    // InternalSmartCE.g:950:1: ruleConditionalExpression returns [EObject current=null] : ( ( (lv_conditions_0_0= ruleCompositeCondition ) ) otherlv_1= 'when' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= 'do' otherlv_6= '{' ( (lv_conditions_7_0= ruleCondition ) ) otherlv_8= '}' ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_conditions_0_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_conditions_7_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:956:2: ( ( ( (lv_conditions_0_0= ruleCompositeCondition ) ) otherlv_1= 'when' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= 'do' otherlv_6= '{' ( (lv_conditions_7_0= ruleCondition ) ) otherlv_8= '}' ) )
            // InternalSmartCE.g:957:2: ( ( (lv_conditions_0_0= ruleCompositeCondition ) ) otherlv_1= 'when' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= 'do' otherlv_6= '{' ( (lv_conditions_7_0= ruleCondition ) ) otherlv_8= '}' )
            {
            // InternalSmartCE.g:957:2: ( ( (lv_conditions_0_0= ruleCompositeCondition ) ) otherlv_1= 'when' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= 'do' otherlv_6= '{' ( (lv_conditions_7_0= ruleCondition ) ) otherlv_8= '}' )
            // InternalSmartCE.g:958:3: ( (lv_conditions_0_0= ruleCompositeCondition ) ) otherlv_1= 'when' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= 'do' otherlv_6= '{' ( (lv_conditions_7_0= ruleCondition ) ) otherlv_8= '}'
            {
            // InternalSmartCE.g:958:3: ( (lv_conditions_0_0= ruleCompositeCondition ) )
            // InternalSmartCE.g:959:4: (lv_conditions_0_0= ruleCompositeCondition )
            {
            // InternalSmartCE.g:959:4: (lv_conditions_0_0= ruleCompositeCondition )
            // InternalSmartCE.g:960:5: lv_conditions_0_0= ruleCompositeCondition
            {

            					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getConditionsCompositeConditionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
            lv_conditions_0_0=ruleCompositeCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_0_0,
            						"br.edu.unijui.gca.smartce.SmartCE.CompositeCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalExpressionAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSmartCE.g:985:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalSmartCE.g:986:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalSmartCE.g:986:4: (lv_expression_3_0= ruleExpression )
            // InternalSmartCE.g:987:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_35); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getConditionalExpressionAccess().getDoKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionalExpressionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalSmartCE.g:1016:3: ( (lv_conditions_7_0= ruleCondition ) )
            // InternalSmartCE.g:1017:4: (lv_conditions_7_0= ruleCondition )
            {
            // InternalSmartCE.g:1017:4: (lv_conditions_7_0= ruleCondition )
            // InternalSmartCE.g:1018:5: lv_conditions_7_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getConditionsConditionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
            lv_conditions_7_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_7_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getConditionalExpressionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleConditionalExpression"


    // $ANTLR start "entryRuleLogicalOperator"
    // InternalSmartCE.g:1043:1: entryRuleLogicalOperator returns [EObject current=null] : iv_ruleLogicalOperator= ruleLogicalOperator EOF ;
    public final EObject entryRuleLogicalOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOperator = null;


        try {
            // InternalSmartCE.g:1043:56: (iv_ruleLogicalOperator= ruleLogicalOperator EOF )
            // InternalSmartCE.g:1044:2: iv_ruleLogicalOperator= ruleLogicalOperator EOF
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
    // InternalSmartCE.g:1050:1: ruleLogicalOperator returns [EObject current=null] : ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) ) ) ;
    public final EObject ruleLogicalOperator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1056:2: ( ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) ) ) )
            // InternalSmartCE.g:1057:2: ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) ) )
            {
            // InternalSmartCE.g:1057:2: ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) ) )
            // InternalSmartCE.g:1058:3: ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) )
            {
            // InternalSmartCE.g:1058:3: ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) )
            // InternalSmartCE.g:1059:4: (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' )
            {
            // InternalSmartCE.g:1059:4: (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt14=1;
                }
                break;
            case 37:
                {
                alt14=2;
                }
                break;
            case 38:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSmartCE.g:1060:5: lv_name_0_1= 'AND'
                    {
                    lv_name_0_1=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getLogicalOperatorAccess().getNameANDKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:1071:5: lv_name_0_2= 'OR'
                    {
                    lv_name_0_2=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getLogicalOperatorAccess().getNameORKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:1082:5: lv_name_0_3= 'NOT'
                    {
                    lv_name_0_3=(Token)match(input,38,FOLLOW_2); 

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
    // InternalSmartCE.g:1098:1: entryRuleTimeout returns [EObject current=null] : iv_ruleTimeout= ruleTimeout EOF ;
    public final EObject entryRuleTimeout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeout = null;


        try {
            // InternalSmartCE.g:1098:48: (iv_ruleTimeout= ruleTimeout EOF )
            // InternalSmartCE.g:1099:2: iv_ruleTimeout= ruleTimeout EOF
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
    // InternalSmartCE.g:1105:1: ruleTimeout returns [EObject current=null] : (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleTimeout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1111:2: ( (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalSmartCE.g:1112:2: (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalSmartCE.g:1112:2: (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalSmartCE.g:1113:3: otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeoutAccess().getTimeoutKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeoutAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:1121:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalSmartCE.g:1122:4: (lv_value_2_0= RULE_INT )
            {
            // InternalSmartCE.g:1122:4: (lv_value_2_0= RULE_INT )
            // InternalSmartCE.g:1123:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_34); 

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

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalSmartCE.g:1147:1: entryRuleOperationLimit returns [EObject current=null] : iv_ruleOperationLimit= ruleOperationLimit EOF ;
    public final EObject entryRuleOperationLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationLimit = null;


        try {
            // InternalSmartCE.g:1147:55: (iv_ruleOperationLimit= ruleOperationLimit EOF )
            // InternalSmartCE.g:1148:2: iv_ruleOperationLimit= ruleOperationLimit EOF
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
    // InternalSmartCE.g:1154:1: ruleOperationLimit returns [EObject current=null] : (otherlv_0= 'OperationLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' ) ;
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
            // InternalSmartCE.g:1160:2: ( (otherlv_0= 'OperationLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' ) )
            // InternalSmartCE.g:1161:2: (otherlv_0= 'OperationLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' )
            {
            // InternalSmartCE.g:1161:2: (otherlv_0= 'OperationLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' )
            // InternalSmartCE.g:1162:3: otherlv_0= 'OperationLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationLimitAccess().getOperationLimitKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationLimitAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:1170:3: ( (lv_operationsNumber_2_0= RULE_INT ) )
            // InternalSmartCE.g:1171:4: (lv_operationsNumber_2_0= RULE_INT )
            {
            // InternalSmartCE.g:1171:4: (lv_operationsNumber_2_0= RULE_INT )
            // InternalSmartCE.g:1172:5: lv_operationsNumber_2_0= RULE_INT
            {
            lv_operationsNumber_2_0=(Token)match(input,RULE_INT,FOLLOW_37); 

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

            otherlv_3=(Token)match(input,41,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationLimitAccess().getByKeyword_3());
            		
            // InternalSmartCE.g:1192:3: ( (lv_timeUnit_4_0= ruleTimeUnit ) )
            // InternalSmartCE.g:1193:4: (lv_timeUnit_4_0= ruleTimeUnit )
            {
            // InternalSmartCE.g:1193:4: (lv_timeUnit_4_0= ruleTimeUnit )
            // InternalSmartCE.g:1194:5: lv_timeUnit_4_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getOperationLimitAccess().getTimeUnitTimeUnitEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_34);
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

            otherlv_5=(Token)match(input,34,FOLLOW_2); 

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
    // InternalSmartCE.g:1219:1: entryRuleBusinessDay returns [EObject current=null] : iv_ruleBusinessDay= ruleBusinessDay EOF ;
    public final EObject entryRuleBusinessDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessDay = null;


        try {
            // InternalSmartCE.g:1219:52: (iv_ruleBusinessDay= ruleBusinessDay EOF )
            // InternalSmartCE.g:1220:2: iv_ruleBusinessDay= ruleBusinessDay EOF
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
    // InternalSmartCE.g:1226:1: ruleBusinessDay returns [EObject current=null] : (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' ) ;
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
            // InternalSmartCE.g:1232:2: ( (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' ) )
            // InternalSmartCE.g:1233:2: (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' )
            {
            // InternalSmartCE.g:1233:2: (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' )
            // InternalSmartCE.g:1234:3: otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessDayAccess().getBusinessDayKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getBusinessDayAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:1242:3: ( (lv_start_2_0= ruleWeekDay ) )
            // InternalSmartCE.g:1243:4: (lv_start_2_0= ruleWeekDay )
            {
            // InternalSmartCE.g:1243:4: (lv_start_2_0= ruleWeekDay )
            // InternalSmartCE.g:1244:5: lv_start_2_0= ruleWeekDay
            {

            					newCompositeNode(grammarAccess.getBusinessDayAccess().getStartWeekDayEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_40);
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

            otherlv_3=(Token)match(input,43,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getBusinessDayAccess().getToKeyword_3());
            		
            // InternalSmartCE.g:1265:3: ( (lv_end_4_0= ruleWeekDay ) )
            // InternalSmartCE.g:1266:4: (lv_end_4_0= ruleWeekDay )
            {
            // InternalSmartCE.g:1266:4: (lv_end_4_0= ruleWeekDay )
            // InternalSmartCE.g:1267:5: lv_end_4_0= ruleWeekDay
            {

            					newCompositeNode(grammarAccess.getBusinessDayAccess().getEndWeekDayEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_34);
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

            otherlv_5=(Token)match(input,34,FOLLOW_2); 

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
    // InternalSmartCE.g:1292:1: entryRuleTimeInterval returns [EObject current=null] : iv_ruleTimeInterval= ruleTimeInterval EOF ;
    public final EObject entryRuleTimeInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeInterval = null;


        try {
            // InternalSmartCE.g:1292:53: (iv_ruleTimeInterval= ruleTimeInterval EOF )
            // InternalSmartCE.g:1293:2: iv_ruleTimeInterval= ruleTimeInterval EOF
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
    // InternalSmartCE.g:1299:1: ruleTimeInterval returns [EObject current=null] : (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
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
            // InternalSmartCE.g:1305:2: ( (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalSmartCE.g:1306:2: (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalSmartCE.g:1306:2: (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalSmartCE.g:1307:3: otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeIntervalAccess().getTimeIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeIntervalAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:1315:3: ( (lv_start_2_0= RULE_STRING ) )
            // InternalSmartCE.g:1316:4: (lv_start_2_0= RULE_STRING )
            {
            // InternalSmartCE.g:1316:4: (lv_start_2_0= RULE_STRING )
            // InternalSmartCE.g:1317:5: lv_start_2_0= RULE_STRING
            {
            lv_start_2_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

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

            otherlv_3=(Token)match(input,43,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeIntervalAccess().getToKeyword_3());
            		
            // InternalSmartCE.g:1337:3: ( (lv_end_4_0= RULE_STRING ) )
            // InternalSmartCE.g:1338:4: (lv_end_4_0= RULE_STRING )
            {
            // InternalSmartCE.g:1338:4: (lv_end_4_0= RULE_STRING )
            // InternalSmartCE.g:1339:5: lv_end_4_0= RULE_STRING
            {
            lv_end_4_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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

            otherlv_5=(Token)match(input,34,FOLLOW_2); 

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
    // InternalSmartCE.g:1363:1: entryRuleSessionInterval returns [EObject current=null] : iv_ruleSessionInterval= ruleSessionInterval EOF ;
    public final EObject entryRuleSessionInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSessionInterval = null;


        try {
            // InternalSmartCE.g:1363:56: (iv_ruleSessionInterval= ruleSessionInterval EOF )
            // InternalSmartCE.g:1364:2: iv_ruleSessionInterval= ruleSessionInterval EOF
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
    // InternalSmartCE.g:1370:1: ruleSessionInterval returns [EObject current=null] : ( ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'by' ( (lv_messagecontent_5_0= ruleMessageContent ) ) ) otherlv_6= ')' ) | (otherlv_7= 'SessionInterval' otherlv_8= '(' ( (lv_frequency_9_0= RULE_INT ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) otherlv_11= ')' ) ) ;
    public final EObject ruleSessionInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_frequency_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_frequency_9_0=null;
        Token otherlv_11=null;
        Enumerator lv_timeUnit_3_0 = null;

        EObject lv_messagecontent_5_0 = null;

        Enumerator lv_timeUnit_10_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:1376:2: ( ( ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'by' ( (lv_messagecontent_5_0= ruleMessageContent ) ) ) otherlv_6= ')' ) | (otherlv_7= 'SessionInterval' otherlv_8= '(' ( (lv_frequency_9_0= RULE_INT ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) otherlv_11= ')' ) ) )
            // InternalSmartCE.g:1377:2: ( ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'by' ( (lv_messagecontent_5_0= ruleMessageContent ) ) ) otherlv_6= ')' ) | (otherlv_7= 'SessionInterval' otherlv_8= '(' ( (lv_frequency_9_0= RULE_INT ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) otherlv_11= ')' ) )
            {
            // InternalSmartCE.g:1377:2: ( ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'by' ( (lv_messagecontent_5_0= ruleMessageContent ) ) ) otherlv_6= ')' ) | (otherlv_7= 'SessionInterval' otherlv_8= '(' ( (lv_frequency_9_0= RULE_INT ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) otherlv_11= ')' ) )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalSmartCE.g:1378:3: ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'by' ( (lv_messagecontent_5_0= ruleMessageContent ) ) ) otherlv_6= ')' )
                    {
                    // InternalSmartCE.g:1378:3: ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'by' ( (lv_messagecontent_5_0= ruleMessageContent ) ) ) otherlv_6= ')' )
                    // InternalSmartCE.g:1379:4: (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'by' ( (lv_messagecontent_5_0= ruleMessageContent ) ) ) otherlv_6= ')'
                    {
                    // InternalSmartCE.g:1379:4: (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'by' ( (lv_messagecontent_5_0= ruleMessageContent ) ) )
                    // InternalSmartCE.g:1380:5: otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'by' ( (lv_messagecontent_5_0= ruleMessageContent ) )
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_28); 

                    					newLeafNode(otherlv_0, grammarAccess.getSessionIntervalAccess().getSessionIntervalKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,33,FOLLOW_36); 

                    					newLeafNode(otherlv_1, grammarAccess.getSessionIntervalAccess().getLeftParenthesisKeyword_0_0_1());
                    				
                    // InternalSmartCE.g:1388:5: ( (lv_frequency_2_0= RULE_INT ) )
                    // InternalSmartCE.g:1389:6: (lv_frequency_2_0= RULE_INT )
                    {
                    // InternalSmartCE.g:1389:6: (lv_frequency_2_0= RULE_INT )
                    // InternalSmartCE.g:1390:7: lv_frequency_2_0= RULE_INT
                    {
                    lv_frequency_2_0=(Token)match(input,RULE_INT,FOLLOW_38); 

                    							newLeafNode(lv_frequency_2_0, grammarAccess.getSessionIntervalAccess().getFrequencyINTTerminalRuleCall_0_0_2_0());
                    						

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

                    // InternalSmartCE.g:1406:5: ( (lv_timeUnit_3_0= ruleTimeUnit ) )
                    // InternalSmartCE.g:1407:6: (lv_timeUnit_3_0= ruleTimeUnit )
                    {
                    // InternalSmartCE.g:1407:6: (lv_timeUnit_3_0= ruleTimeUnit )
                    // InternalSmartCE.g:1408:7: lv_timeUnit_3_0= ruleTimeUnit
                    {

                    							newCompositeNode(grammarAccess.getSessionIntervalAccess().getTimeUnitTimeUnitEnumRuleCall_0_0_3_0());
                    						
                    pushFollow(FOLLOW_37);
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

                    otherlv_4=(Token)match(input,41,FOLLOW_41); 

                    					newLeafNode(otherlv_4, grammarAccess.getSessionIntervalAccess().getByKeyword_0_0_4());
                    				
                    // InternalSmartCE.g:1429:5: ( (lv_messagecontent_5_0= ruleMessageContent ) )
                    // InternalSmartCE.g:1430:6: (lv_messagecontent_5_0= ruleMessageContent )
                    {
                    // InternalSmartCE.g:1430:6: (lv_messagecontent_5_0= ruleMessageContent )
                    // InternalSmartCE.g:1431:7: lv_messagecontent_5_0= ruleMessageContent
                    {

                    							newCompositeNode(grammarAccess.getSessionIntervalAccess().getMessagecontentMessageContentParserRuleCall_0_0_5_0());
                    						
                    pushFollow(FOLLOW_34);
                    lv_messagecontent_5_0=ruleMessageContent();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSessionIntervalRule());
                    							}
                    							set(
                    								current,
                    								"messagecontent",
                    								lv_messagecontent_5_0,
                    								"br.edu.unijui.gca.smartce.SmartCE.MessageContent");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getSessionIntervalAccess().getRightParenthesisKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:1455:3: (otherlv_7= 'SessionInterval' otherlv_8= '(' ( (lv_frequency_9_0= RULE_INT ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) otherlv_11= ')' )
                    {
                    // InternalSmartCE.g:1455:3: (otherlv_7= 'SessionInterval' otherlv_8= '(' ( (lv_frequency_9_0= RULE_INT ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) otherlv_11= ')' )
                    // InternalSmartCE.g:1456:4: otherlv_7= 'SessionInterval' otherlv_8= '(' ( (lv_frequency_9_0= RULE_INT ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,45,FOLLOW_28); 

                    				newLeafNode(otherlv_7, grammarAccess.getSessionIntervalAccess().getSessionIntervalKeyword_1_0());
                    			
                    otherlv_8=(Token)match(input,33,FOLLOW_36); 

                    				newLeafNode(otherlv_8, grammarAccess.getSessionIntervalAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalSmartCE.g:1464:4: ( (lv_frequency_9_0= RULE_INT ) )
                    // InternalSmartCE.g:1465:5: (lv_frequency_9_0= RULE_INT )
                    {
                    // InternalSmartCE.g:1465:5: (lv_frequency_9_0= RULE_INT )
                    // InternalSmartCE.g:1466:6: lv_frequency_9_0= RULE_INT
                    {
                    lv_frequency_9_0=(Token)match(input,RULE_INT,FOLLOW_38); 

                    						newLeafNode(lv_frequency_9_0, grammarAccess.getSessionIntervalAccess().getFrequencyINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSessionIntervalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"frequency",
                    							lv_frequency_9_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalSmartCE.g:1482:4: ( (lv_timeUnit_10_0= ruleTimeUnit ) )
                    // InternalSmartCE.g:1483:5: (lv_timeUnit_10_0= ruleTimeUnit )
                    {
                    // InternalSmartCE.g:1483:5: (lv_timeUnit_10_0= ruleTimeUnit )
                    // InternalSmartCE.g:1484:6: lv_timeUnit_10_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getSessionIntervalAccess().getTimeUnitTimeUnitEnumRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_timeUnit_10_0=ruleTimeUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSessionIntervalRule());
                    						}
                    						set(
                    							current,
                    							"timeUnit",
                    							lv_timeUnit_10_0,
                    							"br.edu.unijui.gca.smartce.SmartCE.TimeUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getSessionIntervalAccess().getRightParenthesisKeyword_1_4());
                    			

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
    // InternalSmartCE.g:1510:1: entryRuleMessageContent returns [EObject current=null] : iv_ruleMessageContent= ruleMessageContent EOF ;
    public final EObject entryRuleMessageContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageContent = null;


        try {
            // InternalSmartCE.g:1510:55: (iv_ruleMessageContent= ruleMessageContent EOF )
            // InternalSmartCE.g:1511:2: iv_ruleMessageContent= ruleMessageContent EOF
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
    // InternalSmartCE.g:1517:1: ruleMessageContent returns [EObject current=null] : ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' ) | (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' ) ) ;
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
            // InternalSmartCE.g:1523:2: ( ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' ) | (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' ) ) )
            // InternalSmartCE.g:1524:2: ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' ) | (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' ) )
            {
            // InternalSmartCE.g:1524:2: ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' ) | (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' ) )
            int alt18=4;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalSmartCE.g:1525:3: (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' )
                    {
                    // InternalSmartCE.g:1525:3: (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' )
                    // InternalSmartCE.g:1526:4: otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_28); 

                    				newLeafNode(otherlv_0, grammarAccess.getMessageContentAccess().getMessageContentKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,33,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalSmartCE.g:1534:4: ( (lv_content_2_0= RULE_STRING ) )
                    // InternalSmartCE.g:1535:5: (lv_content_2_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:1535:5: (lv_content_2_0= RULE_STRING )
                    // InternalSmartCE.g:1536:6: lv_content_2_0= RULE_STRING
                    {
                    lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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

                    otherlv_3=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getMessageContentAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:1558:3: (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' )
                    {
                    // InternalSmartCE.g:1558:3: (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' )
                    // InternalSmartCE.g:1559:4: otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getMessageContentAccess().getMessageContentKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,33,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalSmartCE.g:1567:4: ( (lv_content_6_0= RULE_STRING ) )
                    // InternalSmartCE.g:1568:5: (lv_content_6_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:1568:5: (lv_content_6_0= RULE_STRING )
                    // InternalSmartCE.g:1569:6: lv_content_6_0= RULE_STRING
                    {
                    lv_content_6_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

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

                    otherlv_7=(Token)match(input,41,FOLLOW_38); 

                    				newLeafNode(otherlv_7, grammarAccess.getMessageContentAccess().getByKeyword_1_3());
                    			
                    // InternalSmartCE.g:1589:4: ( (lv_timeUnit_8_0= ruleTimeUnit ) )
                    // InternalSmartCE.g:1590:5: (lv_timeUnit_8_0= ruleTimeUnit )
                    {
                    // InternalSmartCE.g:1590:5: (lv_timeUnit_8_0= ruleTimeUnit )
                    // InternalSmartCE.g:1591:6: lv_timeUnit_8_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getTimeUnitTimeUnitEnumRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_34);
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

                    otherlv_9=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getMessageContentAccess().getRightParenthesisKeyword_1_5());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:1614:3: (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' )
                    {
                    // InternalSmartCE.g:1614:3: (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' )
                    // InternalSmartCE.g:1615:4: otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')'
                    {
                    otherlv_10=(Token)match(input,46,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getMessageContentAccess().getMessageContentKeyword_2_0());
                    			
                    otherlv_11=(Token)match(input,33,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalSmartCE.g:1623:4: ( (lv_content_12_0= RULE_STRING ) )
                    // InternalSmartCE.g:1624:5: (lv_content_12_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:1624:5: (lv_content_12_0= RULE_STRING )
                    // InternalSmartCE.g:1625:6: lv_content_12_0= RULE_STRING
                    {
                    lv_content_12_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

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

                    // InternalSmartCE.g:1641:4: ( (lv_binaryOperator_13_0= ruleBinaryOperator ) )
                    // InternalSmartCE.g:1642:5: (lv_binaryOperator_13_0= ruleBinaryOperator )
                    {
                    // InternalSmartCE.g:1642:5: (lv_binaryOperator_13_0= ruleBinaryOperator )
                    // InternalSmartCE.g:1643:6: lv_binaryOperator_13_0= ruleBinaryOperator
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getBinaryOperatorBinaryOperatorParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_43);
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

                    // InternalSmartCE.g:1660:4: ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) )
                    int alt16=3;
                    switch ( input.LA(1) ) {
                    case RULE_STRING:
                        {
                        alt16=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt16=2;
                        }
                        break;
                    case RULE_INT:
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
                            // InternalSmartCE.g:1661:5: ( (lv_stringValue_14_0= ruleStringValue ) )
                            {
                            // InternalSmartCE.g:1661:5: ( (lv_stringValue_14_0= ruleStringValue ) )
                            // InternalSmartCE.g:1662:6: (lv_stringValue_14_0= ruleStringValue )
                            {
                            // InternalSmartCE.g:1662:6: (lv_stringValue_14_0= ruleStringValue )
                            // InternalSmartCE.g:1663:7: lv_stringValue_14_0= ruleStringValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getStringValueStringValueParserRuleCall_2_4_0_0());
                            						
                            pushFollow(FOLLOW_34);
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
                            // InternalSmartCE.g:1681:5: ( (lv_variableValue_15_0= ruleVariableValue ) )
                            {
                            // InternalSmartCE.g:1681:5: ( (lv_variableValue_15_0= ruleVariableValue ) )
                            // InternalSmartCE.g:1682:6: (lv_variableValue_15_0= ruleVariableValue )
                            {
                            // InternalSmartCE.g:1682:6: (lv_variableValue_15_0= ruleVariableValue )
                            // InternalSmartCE.g:1683:7: lv_variableValue_15_0= ruleVariableValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getVariableValueVariableValueParserRuleCall_2_4_1_0());
                            						
                            pushFollow(FOLLOW_34);
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
                            // InternalSmartCE.g:1701:5: ( (lv_numericValue_16_0= ruleNumericValue ) )
                            {
                            // InternalSmartCE.g:1701:5: ( (lv_numericValue_16_0= ruleNumericValue ) )
                            // InternalSmartCE.g:1702:6: (lv_numericValue_16_0= ruleNumericValue )
                            {
                            // InternalSmartCE.g:1702:6: (lv_numericValue_16_0= ruleNumericValue )
                            // InternalSmartCE.g:1703:7: lv_numericValue_16_0= ruleNumericValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getNumericValueNumericValueParserRuleCall_2_4_2_0());
                            						
                            pushFollow(FOLLOW_34);
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

                    otherlv_17=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getMessageContentAccess().getRightParenthesisKeyword_2_5());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:1727:3: (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' )
                    {
                    // InternalSmartCE.g:1727:3: (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' )
                    // InternalSmartCE.g:1728:4: otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')'
                    {
                    otherlv_18=(Token)match(input,46,FOLLOW_28); 

                    				newLeafNode(otherlv_18, grammarAccess.getMessageContentAccess().getMessageContentKeyword_3_0());
                    			
                    otherlv_19=(Token)match(input,33,FOLLOW_15); 

                    				newLeafNode(otherlv_19, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalSmartCE.g:1736:4: ( (lv_content_20_0= RULE_STRING ) )
                    // InternalSmartCE.g:1737:5: (lv_content_20_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:1737:5: (lv_content_20_0= RULE_STRING )
                    // InternalSmartCE.g:1738:6: lv_content_20_0= RULE_STRING
                    {
                    lv_content_20_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

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

                    // InternalSmartCE.g:1754:4: ( (lv_binaryOperator_21_0= ruleBinaryOperator ) )
                    // InternalSmartCE.g:1755:5: (lv_binaryOperator_21_0= ruleBinaryOperator )
                    {
                    // InternalSmartCE.g:1755:5: (lv_binaryOperator_21_0= ruleBinaryOperator )
                    // InternalSmartCE.g:1756:6: lv_binaryOperator_21_0= ruleBinaryOperator
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getBinaryOperatorBinaryOperatorParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_43);
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

                    // InternalSmartCE.g:1773:4: ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) )
                    int alt17=3;
                    switch ( input.LA(1) ) {
                    case RULE_STRING:
                        {
                        alt17=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt17=2;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt17=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }

                    switch (alt17) {
                        case 1 :
                            // InternalSmartCE.g:1774:5: ( (lv_stringValue_22_0= ruleStringValue ) )
                            {
                            // InternalSmartCE.g:1774:5: ( (lv_stringValue_22_0= ruleStringValue ) )
                            // InternalSmartCE.g:1775:6: (lv_stringValue_22_0= ruleStringValue )
                            {
                            // InternalSmartCE.g:1775:6: (lv_stringValue_22_0= ruleStringValue )
                            // InternalSmartCE.g:1776:7: lv_stringValue_22_0= ruleStringValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getStringValueStringValueParserRuleCall_3_4_0_0());
                            						
                            pushFollow(FOLLOW_37);
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
                            // InternalSmartCE.g:1794:5: ( (lv_variableValue_23_0= ruleVariableValue ) )
                            {
                            // InternalSmartCE.g:1794:5: ( (lv_variableValue_23_0= ruleVariableValue ) )
                            // InternalSmartCE.g:1795:6: (lv_variableValue_23_0= ruleVariableValue )
                            {
                            // InternalSmartCE.g:1795:6: (lv_variableValue_23_0= ruleVariableValue )
                            // InternalSmartCE.g:1796:7: lv_variableValue_23_0= ruleVariableValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getVariableValueVariableValueParserRuleCall_3_4_1_0());
                            						
                            pushFollow(FOLLOW_37);
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
                            // InternalSmartCE.g:1814:5: ( (lv_numericValue_24_0= ruleNumericValue ) )
                            {
                            // InternalSmartCE.g:1814:5: ( (lv_numericValue_24_0= ruleNumericValue ) )
                            // InternalSmartCE.g:1815:6: (lv_numericValue_24_0= ruleNumericValue )
                            {
                            // InternalSmartCE.g:1815:6: (lv_numericValue_24_0= ruleNumericValue )
                            // InternalSmartCE.g:1816:7: lv_numericValue_24_0= ruleNumericValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getNumericValueNumericValueParserRuleCall_3_4_2_0());
                            						
                            pushFollow(FOLLOW_37);
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

                    otherlv_25=(Token)match(input,41,FOLLOW_38); 

                    				newLeafNode(otherlv_25, grammarAccess.getMessageContentAccess().getByKeyword_3_5());
                    			
                    // InternalSmartCE.g:1838:4: ( (lv_timeUnit_26_0= ruleTimeUnit ) )
                    // InternalSmartCE.g:1839:5: (lv_timeUnit_26_0= ruleTimeUnit )
                    {
                    // InternalSmartCE.g:1839:5: (lv_timeUnit_26_0= ruleTimeUnit )
                    // InternalSmartCE.g:1840:6: lv_timeUnit_26_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getTimeUnitTimeUnitEnumRuleCall_3_6_0());
                    					
                    pushFollow(FOLLOW_34);
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

                    otherlv_27=(Token)match(input,34,FOLLOW_2); 

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
    // InternalSmartCE.g:1866:1: entryRuleBinaryOperator returns [EObject current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final EObject entryRuleBinaryOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperator = null;


        try {
            // InternalSmartCE.g:1866:55: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // InternalSmartCE.g:1867:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
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
    // InternalSmartCE.g:1873:1: ruleBinaryOperator returns [EObject current=null] : ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) ) ;
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
            // InternalSmartCE.g:1879:2: ( ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) ) )
            // InternalSmartCE.g:1880:2: ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) )
            {
            // InternalSmartCE.g:1880:2: ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt19=1;
                }
                break;
            case 48:
                {
                alt19=2;
                }
                break;
            case 49:
                {
                alt19=3;
                }
                break;
            case 50:
                {
                alt19=4;
                }
                break;
            case 51:
                {
                alt19=5;
                }
                break;
            case 52:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalSmartCE.g:1881:3: ( (lv_symbol_0_0= '<=' ) )
                    {
                    // InternalSmartCE.g:1881:3: ( (lv_symbol_0_0= '<=' ) )
                    // InternalSmartCE.g:1882:4: (lv_symbol_0_0= '<=' )
                    {
                    // InternalSmartCE.g:1882:4: (lv_symbol_0_0= '<=' )
                    // InternalSmartCE.g:1883:5: lv_symbol_0_0= '<='
                    {
                    lv_symbol_0_0=(Token)match(input,47,FOLLOW_2); 

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
                    // InternalSmartCE.g:1896:3: ( (lv_symbol_1_0= '>=' ) )
                    {
                    // InternalSmartCE.g:1896:3: ( (lv_symbol_1_0= '>=' ) )
                    // InternalSmartCE.g:1897:4: (lv_symbol_1_0= '>=' )
                    {
                    // InternalSmartCE.g:1897:4: (lv_symbol_1_0= '>=' )
                    // InternalSmartCE.g:1898:5: lv_symbol_1_0= '>='
                    {
                    lv_symbol_1_0=(Token)match(input,48,FOLLOW_2); 

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
                    // InternalSmartCE.g:1911:3: ( (lv_symbol_2_0= '>' ) )
                    {
                    // InternalSmartCE.g:1911:3: ( (lv_symbol_2_0= '>' ) )
                    // InternalSmartCE.g:1912:4: (lv_symbol_2_0= '>' )
                    {
                    // InternalSmartCE.g:1912:4: (lv_symbol_2_0= '>' )
                    // InternalSmartCE.g:1913:5: lv_symbol_2_0= '>'
                    {
                    lv_symbol_2_0=(Token)match(input,49,FOLLOW_2); 

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
                    // InternalSmartCE.g:1926:3: ( (lv_symbol_3_0= '<' ) )
                    {
                    // InternalSmartCE.g:1926:3: ( (lv_symbol_3_0= '<' ) )
                    // InternalSmartCE.g:1927:4: (lv_symbol_3_0= '<' )
                    {
                    // InternalSmartCE.g:1927:4: (lv_symbol_3_0= '<' )
                    // InternalSmartCE.g:1928:5: lv_symbol_3_0= '<'
                    {
                    lv_symbol_3_0=(Token)match(input,50,FOLLOW_2); 

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
                    // InternalSmartCE.g:1941:3: ( (lv_symbol_4_0= '!=' ) )
                    {
                    // InternalSmartCE.g:1941:3: ( (lv_symbol_4_0= '!=' ) )
                    // InternalSmartCE.g:1942:4: (lv_symbol_4_0= '!=' )
                    {
                    // InternalSmartCE.g:1942:4: (lv_symbol_4_0= '!=' )
                    // InternalSmartCE.g:1943:5: lv_symbol_4_0= '!='
                    {
                    lv_symbol_4_0=(Token)match(input,51,FOLLOW_2); 

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
                    // InternalSmartCE.g:1956:3: ( (lv_symbol_5_0= '==' ) )
                    {
                    // InternalSmartCE.g:1956:3: ( (lv_symbol_5_0= '==' ) )
                    // InternalSmartCE.g:1957:4: (lv_symbol_5_0= '==' )
                    {
                    // InternalSmartCE.g:1957:4: (lv_symbol_5_0= '==' )
                    // InternalSmartCE.g:1958:5: lv_symbol_5_0= '=='
                    {
                    lv_symbol_5_0=(Token)match(input,52,FOLLOW_2); 

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
    // InternalSmartCE.g:1974:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalSmartCE.g:1974:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalSmartCE.g:1975:2: iv_ruleApplication= ruleApplication EOF
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
    // InternalSmartCE.g:1981:1: ruleApplication returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1987:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalSmartCE.g:1988:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalSmartCE.g:1988:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalSmartCE.g:1989:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalSmartCE.g:1989:3: (lv_name_0_0= RULE_STRING )
            // InternalSmartCE.g:1990:4: lv_name_0_0= RULE_STRING
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
    // InternalSmartCE.g:2009:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalSmartCE.g:2009:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalSmartCE.g:2010:2: iv_ruleProcess= ruleProcess EOF
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
    // InternalSmartCE.g:2016:1: ruleProcess returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2022:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalSmartCE.g:2023:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalSmartCE.g:2023:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalSmartCE.g:2024:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalSmartCE.g:2024:3: (lv_name_0_0= RULE_STRING )
            // InternalSmartCE.g:2025:4: lv_name_0_0= RULE_STRING
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
    // InternalSmartCE.g:2044:1: entryRuleOnSuccess returns [EObject current=null] : iv_ruleOnSuccess= ruleOnSuccess EOF ;
    public final EObject entryRuleOnSuccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnSuccess = null;


        try {
            // InternalSmartCE.g:2044:50: (iv_ruleOnSuccess= ruleOnSuccess EOF )
            // InternalSmartCE.g:2045:2: iv_ruleOnSuccess= ruleOnSuccess EOF
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
    // InternalSmartCE.g:2051:1: ruleOnSuccess returns [EObject current=null] : (otherlv_0= '(' ( (lv_action_1_0= ruleAction ) ) otherlv_2= '(' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= ')' ) ;
    public final EObject ruleOnSuccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_action_1_0 = null;

        EObject lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2057:2: ( (otherlv_0= '(' ( (lv_action_1_0= ruleAction ) ) otherlv_2= '(' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= ')' ) )
            // InternalSmartCE.g:2058:2: (otherlv_0= '(' ( (lv_action_1_0= ruleAction ) ) otherlv_2= '(' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= ')' )
            {
            // InternalSmartCE.g:2058:2: (otherlv_0= '(' ( (lv_action_1_0= ruleAction ) ) otherlv_2= '(' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= ')' )
            // InternalSmartCE.g:2059:3: otherlv_0= '(' ( (lv_action_1_0= ruleAction ) ) otherlv_2= '(' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getOnSuccessAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSmartCE.g:2063:3: ( (lv_action_1_0= ruleAction ) )
            // InternalSmartCE.g:2064:4: (lv_action_1_0= ruleAction )
            {
            // InternalSmartCE.g:2064:4: (lv_action_1_0= ruleAction )
            // InternalSmartCE.g:2065:5: lv_action_1_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getOnSuccessAccess().getActionActionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_action_1_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOnSuccessRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_1_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getOnSuccessAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSmartCE.g:2086:3: ( (lv_message_3_0= ruleExpression ) )
            // InternalSmartCE.g:2087:4: (lv_message_3_0= ruleExpression )
            {
            // InternalSmartCE.g:2087:4: (lv_message_3_0= ruleExpression )
            // InternalSmartCE.g:2088:5: lv_message_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOnSuccessAccess().getMessageExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
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

            otherlv_4=(Token)match(input,34,FOLLOW_34); 

            			newLeafNode(otherlv_4, grammarAccess.getOnSuccessAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getOnSuccessAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalSmartCE.g:2117:1: entryRuleOnBreach returns [EObject current=null] : iv_ruleOnBreach= ruleOnBreach EOF ;
    public final EObject entryRuleOnBreach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnBreach = null;


        try {
            // InternalSmartCE.g:2117:49: (iv_ruleOnBreach= ruleOnBreach EOF )
            // InternalSmartCE.g:2118:2: iv_ruleOnBreach= ruleOnBreach EOF
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
    // InternalSmartCE.g:2124:1: ruleOnBreach returns [EObject current=null] : (otherlv_0= '(' ( (lv_action_1_0= ruleAction ) ) otherlv_2= '(' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= ')' ) ;
    public final EObject ruleOnBreach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_action_1_0 = null;

        EObject lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2130:2: ( (otherlv_0= '(' ( (lv_action_1_0= ruleAction ) ) otherlv_2= '(' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= ')' ) )
            // InternalSmartCE.g:2131:2: (otherlv_0= '(' ( (lv_action_1_0= ruleAction ) ) otherlv_2= '(' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= ')' )
            {
            // InternalSmartCE.g:2131:2: (otherlv_0= '(' ( (lv_action_1_0= ruleAction ) ) otherlv_2= '(' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= ')' )
            // InternalSmartCE.g:2132:3: otherlv_0= '(' ( (lv_action_1_0= ruleAction ) ) otherlv_2= '(' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getOnBreachAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSmartCE.g:2136:3: ( (lv_action_1_0= ruleAction ) )
            // InternalSmartCE.g:2137:4: (lv_action_1_0= ruleAction )
            {
            // InternalSmartCE.g:2137:4: (lv_action_1_0= ruleAction )
            // InternalSmartCE.g:2138:5: lv_action_1_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getOnBreachAccess().getActionActionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_action_1_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOnBreachRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_1_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getOnBreachAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSmartCE.g:2159:3: ( (lv_message_3_0= ruleExpression ) )
            // InternalSmartCE.g:2160:4: (lv_message_3_0= ruleExpression )
            {
            // InternalSmartCE.g:2160:4: (lv_message_3_0= ruleExpression )
            // InternalSmartCE.g:2161:5: lv_message_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOnBreachAccess().getMessageExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
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

            otherlv_4=(Token)match(input,34,FOLLOW_34); 

            			newLeafNode(otherlv_4, grammarAccess.getOnBreachAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getOnBreachAccess().getRightParenthesisKeyword_5());
            		

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


    // $ANTLR start "entryRuleAction"
    // InternalSmartCE.g:2190:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalSmartCE.g:2190:47: (iv_ruleAction= ruleAction EOF )
            // InternalSmartCE.g:2191:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalSmartCE.g:2197:1: ruleAction returns [EObject current=null] : (this_BusinessAction_0= ruleBusinessAction | this_EventLog_1= ruleEventLog ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_BusinessAction_0 = null;

        EObject this_EventLog_1 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2203:2: ( (this_BusinessAction_0= ruleBusinessAction | this_EventLog_1= ruleEventLog ) )
            // InternalSmartCE.g:2204:2: (this_BusinessAction_0= ruleBusinessAction | this_EventLog_1= ruleEventLog )
            {
            // InternalSmartCE.g:2204:2: (this_BusinessAction_0= ruleBusinessAction | this_EventLog_1= ruleEventLog )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==53) ) {
                alt20=1;
            }
            else if ( (LA20_0==54) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSmartCE.g:2205:3: this_BusinessAction_0= ruleBusinessAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getBusinessActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BusinessAction_0=ruleBusinessAction();

                    state._fsp--;


                    			current = this_BusinessAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:2214:3: this_EventLog_1= ruleEventLog
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getEventLogParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EventLog_1=ruleEventLog();

                    state._fsp--;


                    			current = this_EventLog_1;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleBusinessAction"
    // InternalSmartCE.g:2226:1: entryRuleBusinessAction returns [EObject current=null] : iv_ruleBusinessAction= ruleBusinessAction EOF ;
    public final EObject entryRuleBusinessAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessAction = null;


        try {
            // InternalSmartCE.g:2226:55: (iv_ruleBusinessAction= ruleBusinessAction EOF )
            // InternalSmartCE.g:2227:2: iv_ruleBusinessAction= ruleBusinessAction EOF
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
    // InternalSmartCE.g:2233:1: ruleBusinessAction returns [EObject current=null] : ( (lv_name_0_0= 'BusinessAction' ) ) ;
    public final EObject ruleBusinessAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2239:2: ( ( (lv_name_0_0= 'BusinessAction' ) ) )
            // InternalSmartCE.g:2240:2: ( (lv_name_0_0= 'BusinessAction' ) )
            {
            // InternalSmartCE.g:2240:2: ( (lv_name_0_0= 'BusinessAction' ) )
            // InternalSmartCE.g:2241:3: (lv_name_0_0= 'BusinessAction' )
            {
            // InternalSmartCE.g:2241:3: (lv_name_0_0= 'BusinessAction' )
            // InternalSmartCE.g:2242:4: lv_name_0_0= 'BusinessAction'
            {
            lv_name_0_0=(Token)match(input,53,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getBusinessActionAccess().getNameBusinessActionKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBusinessActionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "BusinessAction");
            			

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
    // InternalSmartCE.g:2257:1: entryRuleEventLog returns [EObject current=null] : iv_ruleEventLog= ruleEventLog EOF ;
    public final EObject entryRuleEventLog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventLog = null;


        try {
            // InternalSmartCE.g:2257:49: (iv_ruleEventLog= ruleEventLog EOF )
            // InternalSmartCE.g:2258:2: iv_ruleEventLog= ruleEventLog EOF
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
    // InternalSmartCE.g:2264:1: ruleEventLog returns [EObject current=null] : ( (lv_name_0_0= 'EventLog' ) ) ;
    public final EObject ruleEventLog() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2270:2: ( ( (lv_name_0_0= 'EventLog' ) ) )
            // InternalSmartCE.g:2271:2: ( (lv_name_0_0= 'EventLog' ) )
            {
            // InternalSmartCE.g:2271:2: ( (lv_name_0_0= 'EventLog' ) )
            // InternalSmartCE.g:2272:3: (lv_name_0_0= 'EventLog' )
            {
            // InternalSmartCE.g:2272:3: (lv_name_0_0= 'EventLog' )
            // InternalSmartCE.g:2273:4: lv_name_0_0= 'EventLog'
            {
            lv_name_0_0=(Token)match(input,54,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEventLogAccess().getNameEventLogKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEventLogRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "EventLog");
            			

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
    // InternalSmartCE.g:2288:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSmartCE.g:2288:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSmartCE.g:2289:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalSmartCE.g:2295:1: ruleExpression returns [EObject current=null] : (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        Token lv_symbol_3_0=null;
        Token lv_symbol_4_0=null;
        Token lv_symbol_5_0=null;
        EObject this_Negation_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2301:2: ( (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) ) )* ) )
            // InternalSmartCE.g:2302:2: (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) ) )* )
            {
            // InternalSmartCE.g:2302:2: (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) ) )* )
            // InternalSmartCE.g:2303:3: this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getNegationParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_Negation_0=ruleNegation();

            state._fsp--;


            			current = this_Negation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:2311:3: ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=36 && LA22_0<=37)||(LA22_0>=55 && LA22_0<=56)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSmartCE.g:2312:4: () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) )
            	    {
            	    // InternalSmartCE.g:2312:4: ()
            	    // InternalSmartCE.g:2313:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:2319:4: ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) )
            	    int alt21=4;
            	    switch ( input.LA(1) ) {
            	    case 36:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt21=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // InternalSmartCE.g:2320:5: ( (lv_symbol_2_0= 'AND' ) )
            	            {
            	            // InternalSmartCE.g:2320:5: ( (lv_symbol_2_0= 'AND' ) )
            	            // InternalSmartCE.g:2321:6: (lv_symbol_2_0= 'AND' )
            	            {
            	            // InternalSmartCE.g:2321:6: (lv_symbol_2_0= 'AND' )
            	            // InternalSmartCE.g:2322:7: lv_symbol_2_0= 'AND'
            	            {
            	            lv_symbol_2_0=(Token)match(input,36,FOLLOW_10); 

            	            							newLeafNode(lv_symbol_2_0, grammarAccess.getExpressionAccess().getSymbolANDKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_2_0, "AND");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalSmartCE.g:2335:5: ( (lv_symbol_3_0= '&&' ) )
            	            {
            	            // InternalSmartCE.g:2335:5: ( (lv_symbol_3_0= '&&' ) )
            	            // InternalSmartCE.g:2336:6: (lv_symbol_3_0= '&&' )
            	            {
            	            // InternalSmartCE.g:2336:6: (lv_symbol_3_0= '&&' )
            	            // InternalSmartCE.g:2337:7: lv_symbol_3_0= '&&'
            	            {
            	            lv_symbol_3_0=(Token)match(input,55,FOLLOW_10); 

            	            							newLeafNode(lv_symbol_3_0, grammarAccess.getExpressionAccess().getSymbolAmpersandAmpersandKeyword_1_1_1_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_3_0, "&&");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalSmartCE.g:2350:5: ( (lv_symbol_4_0= '||' ) )
            	            {
            	            // InternalSmartCE.g:2350:5: ( (lv_symbol_4_0= '||' ) )
            	            // InternalSmartCE.g:2351:6: (lv_symbol_4_0= '||' )
            	            {
            	            // InternalSmartCE.g:2351:6: (lv_symbol_4_0= '||' )
            	            // InternalSmartCE.g:2352:7: lv_symbol_4_0= '||'
            	            {
            	            lv_symbol_4_0=(Token)match(input,56,FOLLOW_10); 

            	            							newLeafNode(lv_symbol_4_0, grammarAccess.getExpressionAccess().getSymbolVerticalLineVerticalLineKeyword_1_1_2_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_4_0, "||");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalSmartCE.g:2365:5: ( (lv_symbol_5_0= 'OR' ) )
            	            {
            	            // InternalSmartCE.g:2365:5: ( (lv_symbol_5_0= 'OR' ) )
            	            // InternalSmartCE.g:2366:6: (lv_symbol_5_0= 'OR' )
            	            {
            	            // InternalSmartCE.g:2366:6: (lv_symbol_5_0= 'OR' )
            	            // InternalSmartCE.g:2367:7: lv_symbol_5_0= 'OR'
            	            {
            	            lv_symbol_5_0=(Token)match(input,37,FOLLOW_10); 

            	            							newLeafNode(lv_symbol_5_0, grammarAccess.getExpressionAccess().getSymbolORKeyword_1_1_3_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_5_0, "OR");
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalSmartCE.g:2380:4: ( (lv_right_6_0= ruleNegation ) )
            	    // InternalSmartCE.g:2381:5: (lv_right_6_0= ruleNegation )
            	    {
            	    // InternalSmartCE.g:2381:5: (lv_right_6_0= ruleNegation )
            	    // InternalSmartCE.g:2382:6: lv_right_6_0= ruleNegation
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightNegationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_45);
            	    lv_right_6_0=ruleNegation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_6_0,
            	    							"br.edu.unijui.gca.smartce.SmartCE.Negation");
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleNegation"
    // InternalSmartCE.g:2404:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalSmartCE.g:2404:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalSmartCE.g:2405:2: iv_ruleNegation= ruleNegation EOF
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
    // InternalSmartCE.g:2411:1: ruleNegation returns [EObject current=null] : (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        EObject this_Comparison_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2417:2: ( (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) ) )
            // InternalSmartCE.g:2418:2: (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) )
            {
            // InternalSmartCE.g:2418:2: (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_STRING)||LA23_0==33||LA23_0==61) ) {
                alt23=1;
            }
            else if ( (LA23_0==57) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalSmartCE.g:2419:3: this_Comparison_0= ruleComparison
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
                    // InternalSmartCE.g:2428:3: ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) )
                    {
                    // InternalSmartCE.g:2428:3: ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) )
                    // InternalSmartCE.g:2429:4: () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) )
                    {
                    // InternalSmartCE.g:2429:4: ()
                    // InternalSmartCE.g:2430:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegationAccess().getUnaryOperatorAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSmartCE.g:2436:4: ( (lv_symbol_2_0= '!' ) )
                    // InternalSmartCE.g:2437:5: (lv_symbol_2_0= '!' )
                    {
                    // InternalSmartCE.g:2437:5: (lv_symbol_2_0= '!' )
                    // InternalSmartCE.g:2438:6: lv_symbol_2_0= '!'
                    {
                    lv_symbol_2_0=(Token)match(input,57,FOLLOW_46); 

                    						newLeafNode(lv_symbol_2_0, grammarAccess.getNegationAccess().getSymbolExclamationMarkKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNegationRule());
                    						}
                    						setWithLastConsumed(current, "symbol", lv_symbol_2_0, "!");
                    					

                    }


                    }

                    // InternalSmartCE.g:2450:4: ( (lv_expression_3_0= ruleComparison ) )
                    // InternalSmartCE.g:2451:5: (lv_expression_3_0= ruleComparison )
                    {
                    // InternalSmartCE.g:2451:5: (lv_expression_3_0= ruleComparison )
                    // InternalSmartCE.g:2452:6: lv_expression_3_0= ruleComparison
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
    // InternalSmartCE.g:2474:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalSmartCE.g:2474:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalSmartCE.g:2475:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalSmartCE.g:2481:1: ruleComparison returns [EObject current=null] : (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* ) ;
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
            // InternalSmartCE.g:2487:2: ( (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* ) )
            // InternalSmartCE.g:2488:2: (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* )
            {
            // InternalSmartCE.g:2488:2: (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* )
            // InternalSmartCE.g:2489:3: this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusParserRuleCall_0());
            		
            pushFollow(FOLLOW_47);
            this_Plus_0=rulePlus();

            state._fsp--;


            			current = this_Plus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:2497:3: ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=47 && LA25_0<=52)||(LA25_0>=58 && LA25_0<=59)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSmartCE.g:2498:4: () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) )
            	    {
            	    // InternalSmartCE.g:2498:4: ()
            	    // InternalSmartCE.g:2499:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:2505:4: ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) )
            	    int alt24=8;
            	    switch ( input.LA(1) ) {
            	    case 47:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt24=4;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt24=5;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt24=6;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt24=7;
            	        }
            	        break;
            	    case 59:
            	        {
            	        alt24=8;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // InternalSmartCE.g:2506:5: ( (lv_symbol_2_0= '<=' ) )
            	            {
            	            // InternalSmartCE.g:2506:5: ( (lv_symbol_2_0= '<=' ) )
            	            // InternalSmartCE.g:2507:6: (lv_symbol_2_0= '<=' )
            	            {
            	            // InternalSmartCE.g:2507:6: (lv_symbol_2_0= '<=' )
            	            // InternalSmartCE.g:2508:7: lv_symbol_2_0= '<='
            	            {
            	            lv_symbol_2_0=(Token)match(input,47,FOLLOW_46); 

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
            	            // InternalSmartCE.g:2521:5: ( (lv_symbol_3_0= '>=' ) )
            	            {
            	            // InternalSmartCE.g:2521:5: ( (lv_symbol_3_0= '>=' ) )
            	            // InternalSmartCE.g:2522:6: (lv_symbol_3_0= '>=' )
            	            {
            	            // InternalSmartCE.g:2522:6: (lv_symbol_3_0= '>=' )
            	            // InternalSmartCE.g:2523:7: lv_symbol_3_0= '>='
            	            {
            	            lv_symbol_3_0=(Token)match(input,48,FOLLOW_46); 

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
            	            // InternalSmartCE.g:2536:5: ( (lv_symbol_4_0= '>' ) )
            	            {
            	            // InternalSmartCE.g:2536:5: ( (lv_symbol_4_0= '>' ) )
            	            // InternalSmartCE.g:2537:6: (lv_symbol_4_0= '>' )
            	            {
            	            // InternalSmartCE.g:2537:6: (lv_symbol_4_0= '>' )
            	            // InternalSmartCE.g:2538:7: lv_symbol_4_0= '>'
            	            {
            	            lv_symbol_4_0=(Token)match(input,49,FOLLOW_46); 

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
            	            // InternalSmartCE.g:2551:5: ( (lv_symbol_5_0= '<' ) )
            	            {
            	            // InternalSmartCE.g:2551:5: ( (lv_symbol_5_0= '<' ) )
            	            // InternalSmartCE.g:2552:6: (lv_symbol_5_0= '<' )
            	            {
            	            // InternalSmartCE.g:2552:6: (lv_symbol_5_0= '<' )
            	            // InternalSmartCE.g:2553:7: lv_symbol_5_0= '<'
            	            {
            	            lv_symbol_5_0=(Token)match(input,50,FOLLOW_46); 

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
            	            // InternalSmartCE.g:2566:5: ( (lv_symbol_6_0= '!=' ) )
            	            {
            	            // InternalSmartCE.g:2566:5: ( (lv_symbol_6_0= '!=' ) )
            	            // InternalSmartCE.g:2567:6: (lv_symbol_6_0= '!=' )
            	            {
            	            // InternalSmartCE.g:2567:6: (lv_symbol_6_0= '!=' )
            	            // InternalSmartCE.g:2568:7: lv_symbol_6_0= '!='
            	            {
            	            lv_symbol_6_0=(Token)match(input,51,FOLLOW_46); 

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
            	            // InternalSmartCE.g:2581:5: ( (lv_symbol_7_0= '==' ) )
            	            {
            	            // InternalSmartCE.g:2581:5: ( (lv_symbol_7_0= '==' ) )
            	            // InternalSmartCE.g:2582:6: (lv_symbol_7_0= '==' )
            	            {
            	            // InternalSmartCE.g:2582:6: (lv_symbol_7_0= '==' )
            	            // InternalSmartCE.g:2583:7: lv_symbol_7_0= '=='
            	            {
            	            lv_symbol_7_0=(Token)match(input,52,FOLLOW_46); 

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
            	            // InternalSmartCE.g:2596:5: ( (lv_symbol_8_0= 'is' ) )
            	            {
            	            // InternalSmartCE.g:2596:5: ( (lv_symbol_8_0= 'is' ) )
            	            // InternalSmartCE.g:2597:6: (lv_symbol_8_0= 'is' )
            	            {
            	            // InternalSmartCE.g:2597:6: (lv_symbol_8_0= 'is' )
            	            // InternalSmartCE.g:2598:7: lv_symbol_8_0= 'is'
            	            {
            	            lv_symbol_8_0=(Token)match(input,58,FOLLOW_46); 

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
            	            // InternalSmartCE.g:2611:5: ( (lv_symbol_9_0= 'as' ) )
            	            {
            	            // InternalSmartCE.g:2611:5: ( (lv_symbol_9_0= 'as' ) )
            	            // InternalSmartCE.g:2612:6: (lv_symbol_9_0= 'as' )
            	            {
            	            // InternalSmartCE.g:2612:6: (lv_symbol_9_0= 'as' )
            	            // InternalSmartCE.g:2613:7: lv_symbol_9_0= 'as'
            	            {
            	            lv_symbol_9_0=(Token)match(input,59,FOLLOW_46); 

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

            	    // InternalSmartCE.g:2626:4: ( (lv_right_10_0= rulePlus ) )
            	    // InternalSmartCE.g:2627:5: (lv_right_10_0= rulePlus )
            	    {
            	    // InternalSmartCE.g:2627:5: (lv_right_10_0= rulePlus )
            	    // InternalSmartCE.g:2628:6: lv_right_10_0= rulePlus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_47);
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
            	    break loop25;
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
    // InternalSmartCE.g:2650:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalSmartCE.g:2650:45: (iv_rulePlus= rulePlus EOF )
            // InternalSmartCE.g:2651:2: iv_rulePlus= rulePlus EOF
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
    // InternalSmartCE.g:2657:1: rulePlus returns [EObject current=null] : (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2663:2: ( (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* ) )
            // InternalSmartCE.g:2664:2: (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* )
            {
            // InternalSmartCE.g:2664:2: (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* )
            // InternalSmartCE.g:2665:3: this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:2673:3: ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=60 && LA27_0<=61)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSmartCE.g:2674:4: () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) )
            	    {
            	    // InternalSmartCE.g:2674:4: ()
            	    // InternalSmartCE.g:2675:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPlusAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:2681:4: (otherlv_2= '+' | otherlv_3= '-' )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==60) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==61) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalSmartCE.g:2682:5: otherlv_2= '+'
            	            {
            	            otherlv_2=(Token)match(input,60,FOLLOW_46); 

            	            					newLeafNode(otherlv_2, grammarAccess.getPlusAccess().getPlusSignKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSmartCE.g:2687:5: otherlv_3= '-'
            	            {
            	            otherlv_3=(Token)match(input,61,FOLLOW_46); 

            	            					newLeafNode(otherlv_3, grammarAccess.getPlusAccess().getHyphenMinusKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSmartCE.g:2692:4: ( (lv_right_4_0= ruleFactor ) )
            	    // InternalSmartCE.g:2693:5: (lv_right_4_0= ruleFactor )
            	    {
            	    // InternalSmartCE.g:2693:5: (lv_right_4_0= ruleFactor )
            	    // InternalSmartCE.g:2694:6: lv_right_4_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getPlusAccess().getRightFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_48);
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
            	    break loop27;
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
    // InternalSmartCE.g:2716:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalSmartCE.g:2716:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalSmartCE.g:2717:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalSmartCE.g:2723:1: ruleFactor returns [EObject current=null] : (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Negative_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2729:2: ( (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* ) )
            // InternalSmartCE.g:2730:2: (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* )
            {
            // InternalSmartCE.g:2730:2: (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* )
            // InternalSmartCE.g:2731:3: this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getNegativeParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_Negative_0=ruleNegative();

            state._fsp--;


            			current = this_Negative_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:2739:3: ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=62 && LA29_0<=63)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSmartCE.g:2740:4: () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) )
            	    {
            	    // InternalSmartCE.g:2740:4: ()
            	    // InternalSmartCE.g:2741:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFactorAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:2747:4: (otherlv_2= '*' | otherlv_3= '/' )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==62) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==63) ) {
            	        alt28=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalSmartCE.g:2748:5: otherlv_2= '*'
            	            {
            	            otherlv_2=(Token)match(input,62,FOLLOW_46); 

            	            					newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSmartCE.g:2753:5: otherlv_3= '/'
            	            {
            	            otherlv_3=(Token)match(input,63,FOLLOW_46); 

            	            					newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSmartCE.g:2758:4: ( (lv_right_4_0= ruleNegative ) )
            	    // InternalSmartCE.g:2759:5: (lv_right_4_0= ruleNegative )
            	    {
            	    // InternalSmartCE.g:2759:5: (lv_right_4_0= ruleNegative )
            	    // InternalSmartCE.g:2760:6: lv_right_4_0= ruleNegative
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightNegativeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_49);
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleNegative"
    // InternalSmartCE.g:2782:1: entryRuleNegative returns [EObject current=null] : iv_ruleNegative= ruleNegative EOF ;
    public final EObject entryRuleNegative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegative = null;


        try {
            // InternalSmartCE.g:2782:49: (iv_ruleNegative= ruleNegative EOF )
            // InternalSmartCE.g:2783:2: iv_ruleNegative= ruleNegative EOF
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
    // InternalSmartCE.g:2789:1: ruleNegative returns [EObject current=null] : (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) ) ;
    public final EObject ruleNegative() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2795:2: ( (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) ) )
            // InternalSmartCE.g:2796:2: (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) )
            {
            // InternalSmartCE.g:2796:2: (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_STRING)||LA30_0==33) ) {
                alt30=1;
            }
            else if ( (LA30_0==61) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalSmartCE.g:2797:3: this_Primary_0= rulePrimary
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
                    // InternalSmartCE.g:2806:3: ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) )
                    {
                    // InternalSmartCE.g:2806:3: ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) )
                    // InternalSmartCE.g:2807:4: () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) )
                    {
                    // InternalSmartCE.g:2807:4: ()
                    // InternalSmartCE.g:2808:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegativeAccess().getUnaryOperatorAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,61,FOLLOW_50); 

                    				newLeafNode(otherlv_2, grammarAccess.getNegativeAccess().getHyphenMinusKeyword_1_1());
                    			
                    // InternalSmartCE.g:2818:4: ( (lv_expression_3_0= rulePrimary ) )
                    // InternalSmartCE.g:2819:5: (lv_expression_3_0= rulePrimary )
                    {
                    // InternalSmartCE.g:2819:5: (lv_expression_3_0= rulePrimary )
                    // InternalSmartCE.g:2820:6: lv_expression_3_0= rulePrimary
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
    // InternalSmartCE.g:2842:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSmartCE.g:2842:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSmartCE.g:2843:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalSmartCE.g:2849:1: rulePrimary returns [EObject current=null] : (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_LiteralValue_0 = null;

        EObject this_Expression_2 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2855:2: ( (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) )
            // InternalSmartCE.g:2856:2: (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            {
            // InternalSmartCE.g:2856:2: (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_STRING)) ) {
                alt31=1;
            }
            else if ( (LA31_0==33) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalSmartCE.g:2857:3: this_LiteralValue_0= ruleLiteralValue
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
                    // InternalSmartCE.g:2866:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalSmartCE.g:2866:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalSmartCE.g:2867:4: otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_34);
                    this_Expression_2=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalSmartCE.g:2888:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // InternalSmartCE.g:2888:53: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // InternalSmartCE.g:2889:2: iv_ruleLiteralValue= ruleLiteralValue EOF
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
    // InternalSmartCE.g:2895:1: ruleLiteralValue returns [EObject current=null] : (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject this_NumericValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_VariableValue_2 = null;

        EObject this_FunctionCall_3 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2901:2: ( (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall ) )
            // InternalSmartCE.g:2902:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )
            {
            // InternalSmartCE.g:2902:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )
            int alt32=4;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalSmartCE.g:2903:3: this_NumericValue_0= ruleNumericValue
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
                    // InternalSmartCE.g:2912:3: this_StringValue_1= ruleStringValue
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
                    // InternalSmartCE.g:2921:3: this_VariableValue_2= ruleVariableValue
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
                    // InternalSmartCE.g:2930:3: this_FunctionCall_3= ruleFunctionCall
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
    // InternalSmartCE.g:2942:1: entryRuleNumericValue returns [EObject current=null] : iv_ruleNumericValue= ruleNumericValue EOF ;
    public final EObject entryRuleNumericValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericValue = null;


        try {
            // InternalSmartCE.g:2942:53: (iv_ruleNumericValue= ruleNumericValue EOF )
            // InternalSmartCE.g:2943:2: iv_ruleNumericValue= ruleNumericValue EOF
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
    // InternalSmartCE.g:2949:1: ruleNumericValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumericValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2955:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalSmartCE.g:2956:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalSmartCE.g:2956:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalSmartCE.g:2957:3: (lv_value_0_0= RULE_INT )
            {
            // InternalSmartCE.g:2957:3: (lv_value_0_0= RULE_INT )
            // InternalSmartCE.g:2958:4: lv_value_0_0= RULE_INT
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
    // InternalSmartCE.g:2977:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalSmartCE.g:2977:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalSmartCE.g:2978:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalSmartCE.g:2984:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2990:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSmartCE.g:2991:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSmartCE.g:2991:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSmartCE.g:2992:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalSmartCE.g:2992:3: (lv_value_0_0= RULE_STRING )
            // InternalSmartCE.g:2993:4: lv_value_0_0= RULE_STRING
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
    // InternalSmartCE.g:3012:1: entryRuleVariableValue returns [EObject current=null] : iv_ruleVariableValue= ruleVariableValue EOF ;
    public final EObject entryRuleVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableValue = null;


        try {
            // InternalSmartCE.g:3012:54: (iv_ruleVariableValue= ruleVariableValue EOF )
            // InternalSmartCE.g:3013:2: iv_ruleVariableValue= ruleVariableValue EOF
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
    // InternalSmartCE.g:3019:1: ruleVariableValue returns [EObject current=null] : ( (lv_value_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleVariableValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:3025:2: ( ( (lv_value_0_0= ruleQualifiedName ) ) )
            // InternalSmartCE.g:3026:2: ( (lv_value_0_0= ruleQualifiedName ) )
            {
            // InternalSmartCE.g:3026:2: ( (lv_value_0_0= ruleQualifiedName ) )
            // InternalSmartCE.g:3027:3: (lv_value_0_0= ruleQualifiedName )
            {
            // InternalSmartCE.g:3027:3: (lv_value_0_0= ruleQualifiedName )
            // InternalSmartCE.g:3028:4: lv_value_0_0= ruleQualifiedName
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
    // InternalSmartCE.g:3048:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalSmartCE.g:3048:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalSmartCE.g:3049:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalSmartCE.g:3055:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' ) ;
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
            // InternalSmartCE.g:3061:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' ) )
            // InternalSmartCE.g:3062:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            {
            // InternalSmartCE.g:3062:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            // InternalSmartCE.g:3063:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')'
            {
            // InternalSmartCE.g:3063:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalSmartCE.g:3064:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalSmartCE.g:3064:4: (lv_name_0_0= ruleQualifiedName )
            // InternalSmartCE.g:3065:5: lv_name_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getNameQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_1=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:3086:3: ( (lv_params_2_0= ruleExpression ) )
            // InternalSmartCE.g:3087:4: (lv_params_2_0= ruleExpression )
            {
            // InternalSmartCE.g:3087:4: (lv_params_2_0= ruleExpression )
            // InternalSmartCE.g:3088:5: lv_params_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getParamsExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_51);
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

            // InternalSmartCE.g:3105:3: (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==64) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSmartCE.g:3106:4: otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,64,FOLLOW_10); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSmartCE.g:3110:4: ( (lv_params_4_0= ruleExpression ) )
            	    // InternalSmartCE.g:3111:5: (lv_params_4_0= ruleExpression )
            	    {
            	    // InternalSmartCE.g:3111:5: (lv_params_4_0= ruleExpression )
            	    // InternalSmartCE.g:3112:6: lv_params_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionCallAccess().getParamsExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_51);
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
            	    break loop33;
                }
            } while (true);

            otherlv_5=(Token)match(input,34,FOLLOW_2); 

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
    // InternalSmartCE.g:3138:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSmartCE.g:3138:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSmartCE.g:3139:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalSmartCE.g:3145:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3151:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSmartCE.g:3152:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSmartCE.g:3152:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSmartCE.g:3153:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_52); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSmartCE.g:3160:3: (kw= '.' this_ID_2= RULE_ID )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==65) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSmartCE.g:3161:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,65,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_52); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalSmartCE.g:3178:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalSmartCE.g:3178:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalSmartCE.g:3179:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalSmartCE.g:3185:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:3191:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.*' ) )
            // InternalSmartCE.g:3192:2: (this_QualifiedName_0= ruleQualifiedName kw= '.*' )
            {
            // InternalSmartCE.g:3192:2: (this_QualifiedName_0= ruleQualifiedName kw= '.*' )
            // InternalSmartCE.g:3193:3: this_QualifiedName_0= ruleQualifiedName kw= '.*'
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_53);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,66,FOLLOW_2); 

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
    // InternalSmartCE.g:3212:1: entryRuleYEAR returns [String current=null] : iv_ruleYEAR= ruleYEAR EOF ;
    public final String entryRuleYEAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleYEAR = null;


        try {
            // InternalSmartCE.g:3212:44: (iv_ruleYEAR= ruleYEAR EOF )
            // InternalSmartCE.g:3213:2: iv_ruleYEAR= ruleYEAR EOF
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
    // InternalSmartCE.g:3219:1: ruleYEAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleYEAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3225:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3226:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:3236:1: entryRuleMONTH returns [String current=null] : iv_ruleMONTH= ruleMONTH EOF ;
    public final String entryRuleMONTH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMONTH = null;


        try {
            // InternalSmartCE.g:3236:45: (iv_ruleMONTH= ruleMONTH EOF )
            // InternalSmartCE.g:3237:2: iv_ruleMONTH= ruleMONTH EOF
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
    // InternalSmartCE.g:3243:1: ruleMONTH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleMONTH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3249:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3250:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:3260:1: entryRuleDAY returns [String current=null] : iv_ruleDAY= ruleDAY EOF ;
    public final String entryRuleDAY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDAY = null;


        try {
            // InternalSmartCE.g:3260:43: (iv_ruleDAY= ruleDAY EOF )
            // InternalSmartCE.g:3261:2: iv_ruleDAY= ruleDAY EOF
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
    // InternalSmartCE.g:3267:1: ruleDAY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleDAY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3273:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3274:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:3284:1: entryRuleHOUR returns [String current=null] : iv_ruleHOUR= ruleHOUR EOF ;
    public final String entryRuleHOUR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHOUR = null;


        try {
            // InternalSmartCE.g:3284:44: (iv_ruleHOUR= ruleHOUR EOF )
            // InternalSmartCE.g:3285:2: iv_ruleHOUR= ruleHOUR EOF
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
    // InternalSmartCE.g:3291:1: ruleHOUR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleHOUR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3297:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3298:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:3308:1: entryRuleMIN returns [String current=null] : iv_ruleMIN= ruleMIN EOF ;
    public final String entryRuleMIN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMIN = null;


        try {
            // InternalSmartCE.g:3308:43: (iv_ruleMIN= ruleMIN EOF )
            // InternalSmartCE.g:3309:2: iv_ruleMIN= ruleMIN EOF
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
    // InternalSmartCE.g:3315:1: ruleMIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleMIN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3321:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3322:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:3332:1: entryRuleSEC returns [String current=null] : iv_ruleSEC= ruleSEC EOF ;
    public final String entryRuleSEC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSEC = null;


        try {
            // InternalSmartCE.g:3332:43: (iv_ruleSEC= ruleSEC EOF )
            // InternalSmartCE.g:3333:2: iv_ruleSEC= ruleSEC EOF
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
    // InternalSmartCE.g:3339:1: ruleSEC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleSEC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3345:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3346:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:3356:1: ruleOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) ) ;
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
            // InternalSmartCE.g:3362:2: ( ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) ) )
            // InternalSmartCE.g:3363:2: ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) )
            {
            // InternalSmartCE.g:3363:2: ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) )
            int alt35=6;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt35=1;
                }
                break;
            case 68:
                {
                alt35=2;
                }
                break;
            case 69:
                {
                alt35=3;
                }
                break;
            case 70:
                {
                alt35=4;
                }
                break;
            case 71:
                {
                alt35=5;
                }
                break;
            case 72:
                {
                alt35=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalSmartCE.g:3364:3: (enumLiteral_0= 'push' )
                    {
                    // InternalSmartCE.g:3364:3: (enumLiteral_0= 'push' )
                    // InternalSmartCE.g:3365:4: enumLiteral_0= 'push'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getPUSHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationAccess().getPUSHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:3372:3: (enumLiteral_1= 'poll' )
                    {
                    // InternalSmartCE.g:3372:3: (enumLiteral_1= 'poll' )
                    // InternalSmartCE.g:3373:4: enumLiteral_1= 'poll'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getPOLLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationAccess().getPOLLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:3380:3: (enumLiteral_2= 'write' )
                    {
                    // InternalSmartCE.g:3380:3: (enumLiteral_2= 'write' )
                    // InternalSmartCE.g:3381:4: enumLiteral_2= 'write'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getWRITEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperationAccess().getWRITEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:3388:3: (enumLiteral_3= 'read' )
                    {
                    // InternalSmartCE.g:3388:3: (enumLiteral_3= 'read' )
                    // InternalSmartCE.g:3389:4: enumLiteral_3= 'read'
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getREADEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperationAccess().getREADEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCE.g:3396:3: (enumLiteral_4= 'request' )
                    {
                    // InternalSmartCE.g:3396:3: (enumLiteral_4= 'request' )
                    // InternalSmartCE.g:3397:4: enumLiteral_4= 'request'
                    {
                    enumLiteral_4=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getREQUESTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperationAccess().getREQUESTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCE.g:3404:3: (enumLiteral_5= 'response' )
                    {
                    // InternalSmartCE.g:3404:3: (enumLiteral_5= 'response' )
                    // InternalSmartCE.g:3405:4: enumLiteral_5= 'response'
                    {
                    enumLiteral_5=(Token)match(input,72,FOLLOW_2); 

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
    // InternalSmartCE.g:3415:1: ruleWeekDay returns [Enumerator current=null] : ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) ) ;
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
            // InternalSmartCE.g:3421:2: ( ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) ) )
            // InternalSmartCE.g:3422:2: ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) )
            {
            // InternalSmartCE.g:3422:2: ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) )
            int alt36=7;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt36=1;
                }
                break;
            case 74:
                {
                alt36=2;
                }
                break;
            case 75:
                {
                alt36=3;
                }
                break;
            case 76:
                {
                alt36=4;
                }
                break;
            case 77:
                {
                alt36=5;
                }
                break;
            case 78:
                {
                alt36=6;
                }
                break;
            case 79:
                {
                alt36=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalSmartCE.g:3423:3: (enumLiteral_0= 'Sunday' )
                    {
                    // InternalSmartCE.g:3423:3: (enumLiteral_0= 'Sunday' )
                    // InternalSmartCE.g:3424:4: enumLiteral_0= 'Sunday'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getSUNDAYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWeekDayAccess().getSUNDAYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:3431:3: (enumLiteral_1= 'Monday' )
                    {
                    // InternalSmartCE.g:3431:3: (enumLiteral_1= 'Monday' )
                    // InternalSmartCE.g:3432:4: enumLiteral_1= 'Monday'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getMONDAYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWeekDayAccess().getMONDAYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:3439:3: (enumLiteral_2= 'Tuesday' )
                    {
                    // InternalSmartCE.g:3439:3: (enumLiteral_2= 'Tuesday' )
                    // InternalSmartCE.g:3440:4: enumLiteral_2= 'Tuesday'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTUESDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWeekDayAccess().getTUESDAYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:3447:3: (enumLiteral_3= 'Wednesday' )
                    {
                    // InternalSmartCE.g:3447:3: (enumLiteral_3= 'Wednesday' )
                    // InternalSmartCE.g:3448:4: enumLiteral_3= 'Wednesday'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getWEDNESDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWeekDayAccess().getWEDNESDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCE.g:3455:3: (enumLiteral_4= 'Thursday' )
                    {
                    // InternalSmartCE.g:3455:3: (enumLiteral_4= 'Thursday' )
                    // InternalSmartCE.g:3456:4: enumLiteral_4= 'Thursday'
                    {
                    enumLiteral_4=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTHURSDAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWeekDayAccess().getTHURSDAYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCE.g:3463:3: (enumLiteral_5= 'Friday' )
                    {
                    // InternalSmartCE.g:3463:3: (enumLiteral_5= 'Friday' )
                    // InternalSmartCE.g:3464:4: enumLiteral_5= 'Friday'
                    {
                    enumLiteral_5=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getFRIDAYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWeekDayAccess().getFRIDAYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSmartCE.g:3471:3: (enumLiteral_6= 'Saturday' )
                    {
                    // InternalSmartCE.g:3471:3: (enumLiteral_6= 'Saturday' )
                    // InternalSmartCE.g:3472:4: enumLiteral_6= 'Saturday'
                    {
                    enumLiteral_6=(Token)match(input,79,FOLLOW_2); 

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
    // InternalSmartCE.g:3482:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) ) ;
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
            // InternalSmartCE.g:3488:2: ( ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) ) )
            // InternalSmartCE.g:3489:2: ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) )
            {
            // InternalSmartCE.g:3489:2: ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) )
            int alt37=7;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt37=1;
                }
                break;
            case 81:
                {
                alt37=2;
                }
                break;
            case 82:
                {
                alt37=3;
                }
                break;
            case 83:
                {
                alt37=4;
                }
                break;
            case 84:
                {
                alt37=5;
                }
                break;
            case 85:
                {
                alt37=6;
                }
                break;
            case 86:
                {
                alt37=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalSmartCE.g:3490:3: (enumLiteral_0= 'Second' )
                    {
                    // InternalSmartCE.g:3490:3: (enumLiteral_0= 'Second' )
                    // InternalSmartCE.g:3491:4: enumLiteral_0= 'Second'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getSECONDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSECONDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:3498:3: (enumLiteral_1= 'Minute' )
                    {
                    // InternalSmartCE.g:3498:3: (enumLiteral_1= 'Minute' )
                    // InternalSmartCE.g:3499:4: enumLiteral_1= 'Minute'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:3506:3: (enumLiteral_2= 'Hour' )
                    {
                    // InternalSmartCE.g:3506:3: (enumLiteral_2= 'Hour' )
                    // InternalSmartCE.g:3507:4: enumLiteral_2= 'Hour'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:3514:3: (enumLiteral_3= 'Day' )
                    {
                    // InternalSmartCE.g:3514:3: (enumLiteral_3= 'Day' )
                    // InternalSmartCE.g:3515:4: enumLiteral_3= 'Day'
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCE.g:3522:3: (enumLiteral_4= 'Week' )
                    {
                    // InternalSmartCE.g:3522:3: (enumLiteral_4= 'Week' )
                    // InternalSmartCE.g:3523:4: enumLiteral_4= 'Week'
                    {
                    enumLiteral_4=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCE.g:3530:3: (enumLiteral_5= 'Month' )
                    {
                    // InternalSmartCE.g:3530:3: (enumLiteral_5= 'Month' )
                    // InternalSmartCE.g:3531:4: enumLiteral_5= 'Month'
                    {
                    enumLiteral_5=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMONTHEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTimeUnitAccess().getMONTHEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSmartCE.g:3538:3: (enumLiteral_6= 'Year' )
                    {
                    // InternalSmartCE.g:3538:3: (enumLiteral_6= 'Year' )
                    // InternalSmartCE.g:3539:4: enumLiteral_6= 'Year'
                    {
                    enumLiteral_6=(Token)match(input,86,FOLLOW_2); 

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


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String dfa_1s = "\u0175\uffff";
    static final String dfa_2s = "\31\uffff\1\57\3\uffff\1\57\16\uffff\3\122\32\uffff\1\57\11\uffff\3\57\1\uffff\1\57\1\uffff\1\57\34\uffff\1\57\1\uffff\1\122\3\uffff\1\122\62\uffff\1\122\1\uffff\1\57\20\uffff\3\122\1\uffff\1\122\1\uffff\1\122\50\uffff\1\122\2\uffff\1\122\3\uffff\1\122\57\uffff\1\122\1\uffff\1\122\12\uffff\3\122\1\uffff\1\122\1\uffff\1\122\26\uffff\1\122\12\uffff\1\122\27\uffff";
    static final String dfa_3s = "\1\47\6\41\2\5\1\111\2\6\1\5\1\42\1\51\10\53\1\42\1\120\1\22\1\120\1\111\1\6\1\22\6\4\1\120\7\42\3\22\1\uffff\31\42\1\22\1\56\6\41\2\uffff\3\22\1\120\1\22\1\4\1\22\1\41\2\5\1\111\2\6\1\5\10\42\1\6\1\42\1\51\10\53\1\42\1\120\1\22\1\42\1\22\1\120\1\111\1\6\1\22\6\4\1\120\10\42\6\4\1\120\3\47\31\42\1\22\1\56\1\22\12\42\6\41\3\22\1\120\1\22\1\4\1\22\1\41\1\120\1\42\1\4\1\42\2\5\1\111\2\6\1\5\10\42\1\6\11\42\1\51\10\53\1\42\1\120\1\22\2\42\1\22\1\120\1\111\1\6\1\22\6\4\1\120\10\42\6\4\1\120\31\42\1\22\1\56\1\22\12\42\3\22\1\120\1\22\1\4\1\22\1\41\1\120\1\42\1\4\11\42\1\6\10\42\1\22\3\42\6\4\1\120\1\22\12\42\1\120\1\42\1\4\12\42";
    static final String dfa_4s = "\1\56\6\41\2\5\1\117\2\6\1\5\1\42\1\51\10\53\1\64\1\126\1\46\1\126\1\117\1\6\1\46\6\6\1\126\7\51\3\56\1\uffff\17\42\1\51\1\101\1\51\7\42\1\46\1\56\6\41\2\uffff\3\46\1\126\1\46\1\4\1\46\1\41\2\5\1\117\2\6\1\5\7\42\1\101\1\6\1\42\1\51\10\53\1\64\1\126\1\46\1\64\1\56\1\126\1\117\1\6\1\56\6\6\1\126\7\51\1\42\6\6\1\126\3\56\17\42\1\51\1\101\1\51\7\42\2\56\1\46\1\51\1\101\1\51\7\42\6\41\3\56\1\126\1\56\1\4\1\56\1\41\1\126\1\42\1\4\1\42\2\5\1\117\2\6\1\5\7\42\1\101\1\6\7\42\1\101\1\42\1\51\10\53\1\64\1\126\1\56\1\64\1\42\1\56\1\126\1\117\1\6\1\56\6\6\1\126\7\51\1\42\6\6\1\126\17\42\1\51\1\101\1\51\7\42\3\56\1\51\1\101\1\51\7\42\3\56\1\126\1\56\1\4\1\56\1\41\1\126\1\42\1\4\10\42\1\101\1\6\7\42\1\101\1\56\1\64\2\42\6\6\1\126\1\56\1\51\1\101\1\51\7\42\1\126\1\42\1\4\10\42\1\101\1\42";
    static final String dfa_5s = "\57\uffff\1\1\41\uffff\1\3\1\2\u0122\uffff";
    static final String dfa_6s = "\u0175\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\uffff\1\3\1\uffff\1\4\1\6\1\5",
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
            "\1\35\6\uffff\1\44\5\uffff\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53",
            "\1\57\21\uffff\1\54\1\55\1\56",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66",
            "\1\67\1\70\1\71\1\72\1\73\1\74\1\75",
            "\1\76",
            "\1\57\21\uffff\1\54\1\55\1\56",
            "\1\100\1\101\1\77",
            "\1\100\1\101\1\77",
            "\1\100\1\101\1\77",
            "\1\100\1\101\1\77",
            "\1\100\1\101\1\77",
            "\1\100\1\101\1\77",
            "\1\102\1\103\1\104\1\105\1\106\1\107\1\110",
            "\1\111\6\uffff\1\112",
            "\1\111\6\uffff\1\112",
            "\1\111\6\uffff\1\112",
            "\1\111\6\uffff\1\112",
            "\1\111\6\uffff\1\112",
            "\1\111\6\uffff\1\112",
            "\1\111\6\uffff\1\112",
            "\1\122\15\uffff\1\121\6\uffff\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\122\15\uffff\1\121\6\uffff\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\122\15\uffff\1\121\6\uffff\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\125",
            "\1\127\6\uffff\1\126",
            "\1\127\6\uffff\1\126\27\uffff\1\130",
            "\1\127\6\uffff\1\126",
            "\1\131",
            "\1\131",
            "\1\131",
            "\1\131",
            "\1\131",
            "\1\131",
            "\1\131",
            "\1\57\21\uffff\1\54\1\55\1\56",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "",
            "\1\57\21\uffff\1\54\1\55\1\56",
            "\1\57\21\uffff\1\54\1\55\1\56",
            "\1\57\21\uffff\1\54\1\55\1\56",
            "\1\141\1\142\1\143\1\144\1\145\1\146\1\147",
            "\1\57\21\uffff\1\54\1\55\1\56",
            "\1\150",
            "\1\57\21\uffff\1\54\1\55\1\56",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154\1\155\1\156\1\157\1\160\1\161\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\166",
            "\1\166",
            "\1\166",
            "\1\166",
            "\1\166",
            "\1\166",
            "\1\127\6\uffff\1\126\27\uffff\1\130",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\172",
            "\1\172",
            "\1\172",
            "\1\172",
            "\1\172",
            "\1\172",
            "\1\173",
            "\1\174\6\uffff\1\u0083\5\uffff\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082",
            "\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a",
            "\1\57\21\uffff\1\54\1\55\1\56",
            "\1\u008b\6\uffff\1\u0092\5\uffff\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091",
            "\1\122\15\uffff\1\121\3\uffff\1\u0093\1\u0094\1\u0095\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c",
            "\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3",
            "\1\u00a4",
            "\1\122\15\uffff\1\121\3\uffff\1\u0093\1\u0094\1\u0095\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\u00a6\1\u00a7\1\u00a5",
            "\1\u00a6\1\u00a7\1\u00a5",
            "\1\u00a6\1\u00a7\1\u00a5",
            "\1\u00a6\1\u00a7\1\u00a5",
            "\1\u00a6\1\u00a7\1\u00a5",
            "\1\u00a6\1\u00a7\1\u00a5",
            "\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae",
            "\1\u00af\6\uffff\1\u00b0",
            "\1\u00af\6\uffff\1\u00b0",
            "\1\u00af\6\uffff\1\u00b0",
            "\1\u00af\6\uffff\1\u00b0",
            "\1\u00af\6\uffff\1\u00b0",
            "\1\u00af\6\uffff\1\u00b0",
            "\1\u00af\6\uffff\1\u00b0",
            "\1\u00b1",
            "\1\u00b3\1\u00b4\1\u00b2",
            "\1\u00b3\1\u00b4\1\u00b2",
            "\1\u00b3\1\u00b4\1\u00b2",
            "\1\u00b3\1\u00b4\1\u00b2",
            "\1\u00b3\1\u00b4\1\u00b2",
            "\1\u00b3\1\u00b4\1\u00b2",
            "\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb",
            "\1\u00bc\1\u00bd\1\uffff\1\u00be\1\uffff\1\u00bf\1\u00c1\1\u00c0",
            "\1\u00bc\1\u00bd\1\uffff\1\u00be\1\uffff\1\u00bf\1\u00c1\1\u00c0",
            "\1\u00bc\1\u00bd\1\uffff\1\u00be\1\uffff\1\u00bf\1\u00c1\1\u00c0",
            "\1\u00c2",
            "\1\u00c2",
            "\1\u00c2",
            "\1\u00c2",
            "\1\u00c2",
            "\1\u00c2",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c3",
            "\1\u00c3",
            "\1\u00c3",
            "\1\u00c3",
            "\1\u00c3",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c6\6\uffff\1\u00c5",
            "\1\u00c6\6\uffff\1\u00c5\27\uffff\1\u00c7",
            "\1\u00c6\6\uffff\1\u00c5",
            "\1\u00c8",
            "\1\u00c8",
            "\1\u00c8",
            "\1\u00c8",
            "\1\u00c8",
            "\1\u00c8",
            "\1\u00c8",
            "\1\122\15\uffff\1\121\3\uffff\1\u0093\1\u0094\1\u0095\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\u00c9",
            "\1\57\21\uffff\1\54\1\55\1\56",
            "\1\u00cb\6\uffff\1\u00ca",
            "\1\u00cb\6\uffff\1\u00ca\27\uffff\1\u00cc",
            "\1\u00cb\6\uffff\1\u00ca",
            "\1\u00cd",
            "\1\u00cd",
            "\1\u00cd",
            "\1\u00cd",
            "\1\u00cd",
            "\1\u00cd",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\122\15\uffff\1\121\3\uffff\1\u0093\1\u0094\1\u0095\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\122\15\uffff\1\121\3\uffff\1\u0093\1\u0094\1\u0095\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\122\15\uffff\1\121\3\uffff\1\u0093\1\u0094\1\u0095\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\u00d4\1\u00d5\1\u00d6\1\u00d7\1\u00d8\1\u00d9\1\u00da",
            "\1\122\15\uffff\1\121\3\uffff\1\u0093\1\u0094\1\u0095\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\u00db",
            "\1\122\15\uffff\1\121\3\uffff\1\u0093\1\u0094\1\u0095\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\u00dc",
            "\1\u00dd\1\u00de\1\u00df\1\u00e0\1\u00e1\1\u00e2\1\u00e3",
            "\1\u00b1",
            "\1\u00e4",
            "\1\u00b1",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1\u00eb\1\u00ec\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f1",
            "\1\u00f1",
            "\1\u00f1",
            "\1\u00f1",
            "\1\u00f1",
            "\1\u00f1",
            "\1\u00c6\6\uffff\1\u00c5\27\uffff\1\u00c7",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f3",
            "\1\u00f3",
            "\1\u00f3",
            "\1\u00f3",
            "\1\u00f3",
            "\1\u00f3",
            "\1\u00cb\6\uffff\1\u00ca\27\uffff\1\u00cc",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f6",
            "\1\u00f6",
            "\1\u00f6",
            "\1\u00f6",
            "\1\u00f6",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8\6\uffff\1\u00ff\5\uffff\1\u00f9\1\u00fa\1\u00fb\1\u00fc\1\u00fd\1\u00fe",
            "\1\u0100\1\u0101\1\u0102\1\u0103\1\u0104\1\u0105\1\u0106",
            "\1\122\15\uffff\1\121\3\uffff\1\u0093\1\u0094\1\u0095\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\u0107\6\uffff\1\u010e\5\uffff\1\u0108\1\u0109\1\u010a\1\u010b\1\u010c\1\u010d",
            "\1\u00b1",
            "\1\122\15\uffff\1\121\3\uffff\1\u0093\1\u0094\1\u0095\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\u010f\1\u0110\1\u0111\1\u0112\1\u0113\1\u0114\1\u0115",
            "\1\u0116\1\u0117\1\u0118\1\u0119\1\u011a\1\u011b\1\u011c",
            "\1\u011d",
            "\1\122\15\uffff\1\121\3\uffff\1\u0093\1\u0094\1\u0095\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\u011f\1\u0120\1\u011e",
            "\1\u011f\1\u0120\1\u011e",
            "\1\u011f\1\u0120\1\u011e",
            "\1\u011f\1\u0120\1\u011e",
            "\1\u011f\1\u0120\1\u011e",
            "\1\u011f\1\u0120\1\u011e",
            "\1\u0121\1\u0122\1\u0123\1\u0124\1\u0125\1\u0126\1\u0127",
            "\1\u0128\6\uffff\1\u0129",
            "\1\u0128\6\uffff\1\u0129",
            "\1\u0128\6\uffff\1\u0129",
            "\1\u0128\6\uffff\1\u0129",
            "\1\u0128\6\uffff\1\u0129",
            "\1\u0128\6\uffff\1\u0129",
            "\1\u0128\6\uffff\1\u0129",
            "\1\u012a",
            "\1\u012c\1\u012d\1\u012b",
            "\1\u012c\1\u012d\1\u012b",
            "\1\u012c\1\u012d\1\u012b",
            "\1\u012c\1\u012d\1\u012b",
            "\1\u012c\1\u012d\1\u012b",
            "\1\u012c\1\u012d\1\u012b",
            "\1\u012e\1\u012f\1\u0130\1\u0131\1\u0132\1\u0133\1\u0134",
            "\1\u0135",
            "\1\u0135",
            "\1\u0135",
            "\1\u0135",
            "\1\u0135",
            "\1\u0135",
            "\1\u0135",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0137",
            "\1\u0139\6\uffff\1\u0138",
            "\1\u0139\6\uffff\1\u0138\27\uffff\1\u013a",
            "\1\u0139\6\uffff\1\u0138",
            "\1\u013b",
            "\1\u013b",
            "\1\u013b",
            "\1\u013b",
            "\1\u013b",
            "\1\u013b",
            "\1\u013b",
            "\1\122\15\uffff\1\121\3\uffff\1\u0093\1\u0094\1\u0095\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\u013c",
            "\1\122\15\uffff\1\121\3\uffff\1\u0093\1\u0094\1\u0095\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\u013e\6\uffff\1\u013d",
            "\1\u013e\6\uffff\1\u013d\27\uffff\1\u013f",
            "\1\u013e\6\uffff\1\u013d",
            "\1\u0140",
            "\1\u0140",
            "\1\u0140",
            "\1\u0140",
            "\1\u0140",
            "\1\u0140",
            "\1\u0140",
            "\1\122\15\uffff\1\121\3\uffff\1\u0093\1\u0094\1\u0095\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\122\15\uffff\1\121\3\uffff\1\u0093\1\u0094\1\u0095\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\122\15\uffff\1\121\3\uffff\1\u0093\1\u0094\1\u0095\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\u0141\1\u0142\1\u0143\1\u0144\1\u0145\1\u0146\1\u0147",
            "\1\122\15\uffff\1\121\3\uffff\1\u0093\1\u0094\1\u0095\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\u0148",
            "\1\122\15\uffff\1\121\3\uffff\1\u0093\1\u0094\1\u0095\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\u0149",
            "\1\u014a\1\u014b\1\u014c\1\u014d\1\u014e\1\u014f\1\u0150",
            "\1\u012a",
            "\1\u0151",
            "\1\u012a",
            "\1\u0152",
            "\1\u0152",
            "\1\u0152",
            "\1\u0152",
            "\1\u0152",
            "\1\u0152",
            "\1\u0152",
            "\1\u0139\6\uffff\1\u0138\27\uffff\1\u013a",
            "\1\u0153",
            "\1\u0154",
            "\1\u0154",
            "\1\u0154",
            "\1\u0154",
            "\1\u0154",
            "\1\u0154",
            "\1\u0154",
            "\1\u013e\6\uffff\1\u013d\27\uffff\1\u013f",
            "\1\122\15\uffff\1\121\3\uffff\1\u0093\1\u0094\1\u0095\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\u0155\6\uffff\1\u015c\5\uffff\1\u0156\1\u0157\1\u0158\1\u0159\1\u015a\1\u015b",
            "\1\u012a",
            "\1\u015d",
            "\1\u015f\1\u0160\1\u015e",
            "\1\u015f\1\u0160\1\u015e",
            "\1\u015f\1\u0160\1\u015e",
            "\1\u015f\1\u0160\1\u015e",
            "\1\u015f\1\u0160\1\u015e",
            "\1\u015f\1\u0160\1\u015e",
            "\1\u0161\1\u0162\1\u0163\1\u0164\1\u0165\1\u0166\1\u0167",
            "\1\122\15\uffff\1\121\3\uffff\1\u0093\1\u0094\1\u0095\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\117",
            "\1\u0169\6\uffff\1\u0168",
            "\1\u0169\6\uffff\1\u0168\27\uffff\1\u016a",
            "\1\u0169\6\uffff\1\u0168",
            "\1\u016b",
            "\1\u016b",
            "\1\u016b",
            "\1\u016b",
            "\1\u016b",
            "\1\u016b",
            "\1\u016b",
            "\1\u016c\1\u016d\1\u016e\1\u016f\1\u0170\1\u0171\1\u0172",
            "\1\u015d",
            "\1\u0173",
            "\1\u015d",
            "\1\u0174",
            "\1\u0174",
            "\1\u0174",
            "\1\u0174",
            "\1\u0174",
            "\1\u0174",
            "\1\u0174",
            "\1\u0169\6\uffff\1\u0168\27\uffff\1\u016a",
            "\1\u015d"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "722:2: (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition | this_ConditionalExpression_2= ruleConditionalExpression )";
        }
    }
    static final String dfa_8s = "\15\uffff";
    static final String dfa_9s = "\1\55\1\41\1\5\1\120\7\42\2\uffff";
    static final String dfa_10s = "\1\55\1\41\1\5\1\126\7\51\2\uffff";
    static final String dfa_11s = "\13\uffff\1\2\1\1";
    static final String dfa_12s = "\15\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\13\6\uffff\1\14",
            "\1\13\6\uffff\1\14",
            "\1\13\6\uffff\1\14",
            "\1\13\6\uffff\1\14",
            "\1\13\6\uffff\1\14",
            "\1\13\6\uffff\1\14",
            "\1\13\6\uffff\1\14",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1377:2: ( ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'by' ( (lv_messagecontent_5_0= ruleMessageContent ) ) ) otherlv_6= ')' ) | (otherlv_7= 'SessionInterval' otherlv_8= '(' ( (lv_frequency_9_0= RULE_INT ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) otherlv_11= ')' ) )";
        }
    }
    static final String dfa_14s = "\23\uffff";
    static final String dfa_15s = "\1\56\1\41\1\6\1\42\6\4\2\uffff\3\42\2\uffff\1\4\1\42";
    static final String dfa_16s = "\1\56\1\41\1\6\1\64\6\6\2\uffff\1\51\1\101\1\51\2\uffff\1\4\1\101";
    static final String dfa_17s = "\12\uffff\1\2\1\1\3\uffff\1\4\1\3\2\uffff";
    static final String dfa_18s = "\23\uffff}>";
    static final String[] dfa_19s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\13\6\uffff\1\12\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\15\1\16\1\14",
            "\1\15\1\16\1\14",
            "\1\15\1\16\1\14",
            "\1\15\1\16\1\14",
            "\1\15\1\16\1\14",
            "\1\15\1\16\1\14",
            "",
            "",
            "\1\20\6\uffff\1\17",
            "\1\20\6\uffff\1\17\27\uffff\1\21",
            "\1\20\6\uffff\1\17",
            "",
            "",
            "\1\22",
            "\1\20\6\uffff\1\17\27\uffff\1\21"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1524:2: ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' ) | (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' ) )";
        }
    }
    static final String dfa_20s = "\10\uffff";
    static final String dfa_21s = "\3\uffff\1\5\3\uffff\1\5";
    static final String dfa_22s = "\1\4\2\uffff\2\4\2\uffff\1\4";
    static final String dfa_23s = "\1\6\2\uffff\1\101\1\4\2\uffff\1\101";
    static final String dfa_24s = "\1\uffff\1\1\1\2\2\uffff\1\3\1\4\1\uffff";
    static final String dfa_25s = "\10\uffff}>";
    static final String[] dfa_26s = {
            "\1\3\1\1\1\2",
            "",
            "",
            "\1\5\14\uffff\2\5\16\uffff\1\6\1\5\1\uffff\2\5\11\uffff\6\5\2\uffff\2\5\1\uffff\7\5\1\4",
            "\1\7",
            "",
            "",
            "\1\5\14\uffff\2\5\16\uffff\1\6\1\5\1\uffff\2\5\11\uffff\6\5\2\uffff\2\5\1\uffff\7\5\1\4"
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2902:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )";
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x2200000200000070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000007040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000758000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001F8L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000758000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000075F000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x00000000007F0000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FE00L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x001F800000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0180003000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2000000200000070L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0C1F800000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});

}