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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'Contract'", "'{'", "'beginDate'", "'='", "'dueDate'", "'parties'", "'application'", "'process'", "'}'", "'variables'", "'Right'", "'Prohibition'", "'Obligation'", "'rolePlayer'", "'operation'", "'condition'", "'onBreach'", "'onSuccess'", "'when'", "'('", "'expression'", "')'", "'check'", "'AND'", "'OR'", "'NOT'", "'Timeout'", "'OperationLimit'", "'by'", "'BusinessDay'", "'to'", "'TimeInterval'", "'SessionInterval'", "'from'", "'MessageContent'", "'<='", "'>='", "'>'", "'<'", "'!='", "'=='", "'BusinessAction'", "'EventLog'", "'&&'", "'||'", "'!'", "'is'", "'as'", "'+'", "'-'", "'*'", "'/'", "','", "'.'", "'.*'", "'push'", "'poll'", "'write'", "'read'", "'request'", "'response'", "'Sunday'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Second'", "'Minute'", "'Hour'", "'Day'", "'Week'", "'Month'", "'Year'"
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
    // InternalSmartCE.g:178:1: ruleContract returns [EObject current=null] : (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= ruleExpression ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= ruleExpression ) ) otherlv_9= 'parties' otherlv_10= '{' otherlv_11= 'application' otherlv_12= '=' ( (lv_application_13_0= ruleApplication ) ) otherlv_14= 'process' otherlv_15= '=' ( (lv_process_16_0= ruleProcess ) ) otherlv_17= '}' (otherlv_18= 'variables' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) )* otherlv_21= '}' )? ( (lv_clauses_22_0= ruleClause ) ) otherlv_23= '}' ) ;
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
        Token otherlv_23=null;
        EObject lv_beginDate_5_0 = null;

        EObject lv_dueDate_8_0 = null;

        EObject lv_application_13_0 = null;

        EObject lv_process_16_0 = null;

        EObject lv_variables_20_0 = null;

        EObject lv_clauses_22_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:184:2: ( (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= ruleExpression ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= ruleExpression ) ) otherlv_9= 'parties' otherlv_10= '{' otherlv_11= 'application' otherlv_12= '=' ( (lv_application_13_0= ruleApplication ) ) otherlv_14= 'process' otherlv_15= '=' ( (lv_process_16_0= ruleProcess ) ) otherlv_17= '}' (otherlv_18= 'variables' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) )* otherlv_21= '}' )? ( (lv_clauses_22_0= ruleClause ) ) otherlv_23= '}' ) )
            // InternalSmartCE.g:185:2: (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= ruleExpression ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= ruleExpression ) ) otherlv_9= 'parties' otherlv_10= '{' otherlv_11= 'application' otherlv_12= '=' ( (lv_application_13_0= ruleApplication ) ) otherlv_14= 'process' otherlv_15= '=' ( (lv_process_16_0= ruleProcess ) ) otherlv_17= '}' (otherlv_18= 'variables' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) )* otherlv_21= '}' )? ( (lv_clauses_22_0= ruleClause ) ) otherlv_23= '}' )
            {
            // InternalSmartCE.g:185:2: (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= ruleExpression ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= ruleExpression ) ) otherlv_9= 'parties' otherlv_10= '{' otherlv_11= 'application' otherlv_12= '=' ( (lv_application_13_0= ruleApplication ) ) otherlv_14= 'process' otherlv_15= '=' ( (lv_process_16_0= ruleProcess ) ) otherlv_17= '}' (otherlv_18= 'variables' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) )* otherlv_21= '}' )? ( (lv_clauses_22_0= ruleClause ) ) otherlv_23= '}' )
            // InternalSmartCE.g:186:3: otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= ruleExpression ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= ruleExpression ) ) otherlv_9= 'parties' otherlv_10= '{' otherlv_11= 'application' otherlv_12= '=' ( (lv_application_13_0= ruleApplication ) ) otherlv_14= 'process' otherlv_15= '=' ( (lv_process_16_0= ruleProcess ) ) otherlv_17= '}' (otherlv_18= 'variables' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) )* otherlv_21= '}' )? ( (lv_clauses_22_0= ruleClause ) ) otherlv_23= '}'
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
            		
            // InternalSmartCE.g:332:3: (otherlv_18= 'variables' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) )* otherlv_21= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmartCE.g:333:4: otherlv_18= 'variables' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) )* otherlv_21= '}'
                    {
                    otherlv_18=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_18, grammarAccess.getContractAccess().getVariablesKeyword_18_0());
                    			
                    otherlv_19=(Token)match(input,13,FOLLOW_17); 

                    				newLeafNode(otherlv_19, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_18_1());
                    			
                    // InternalSmartCE.g:341:4: ( (lv_variables_20_0= ruleVariable ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSmartCE.g:342:5: (lv_variables_20_0= ruleVariable )
                    	    {
                    	    // InternalSmartCE.g:342:5: (lv_variables_20_0= ruleVariable )
                    	    // InternalSmartCE.g:343:6: lv_variables_20_0= ruleVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getContractAccess().getVariablesVariableParserRuleCall_18_2_0());
                    	    					
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

                    otherlv_21=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_21, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_18_3());
                    			

                    }
                    break;

            }

            // InternalSmartCE.g:365:3: ( (lv_clauses_22_0= ruleClause ) )
            // InternalSmartCE.g:366:4: (lv_clauses_22_0= ruleClause )
            {
            // InternalSmartCE.g:366:4: (lv_clauses_22_0= ruleClause )
            // InternalSmartCE.g:367:5: lv_clauses_22_0= ruleClause
            {

            					newCompositeNode(grammarAccess.getContractAccess().getClausesClauseParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_15);
            lv_clauses_22_0=ruleClause();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					add(
            						current,
            						"clauses",
            						lv_clauses_22_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Clause");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_20());
            		

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
    // InternalSmartCE.g:392:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSmartCE.g:392:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalSmartCE.g:393:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalSmartCE.g:399:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:405:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalSmartCE.g:406:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalSmartCE.g:406:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalSmartCE.g:407:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalSmartCE.g:407:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSmartCE.g:408:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSmartCE.g:408:4: (lv_name_0_0= RULE_ID )
            // InternalSmartCE.g:409:5: lv_name_0_0= RULE_ID
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
            		
            // InternalSmartCE.g:429:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalSmartCE.g:430:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalSmartCE.g:430:4: (lv_expression_2_0= ruleExpression )
            // InternalSmartCE.g:431:5: lv_expression_2_0= ruleExpression
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


    // $ANTLR start "entryRuleClause"
    // InternalSmartCE.g:452:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalSmartCE.g:452:47: (iv_ruleClause= ruleClause EOF )
            // InternalSmartCE.g:453:2: iv_ruleClause= ruleClause EOF
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
    // InternalSmartCE.g:459:1: ruleClause returns [EObject current=null] : ( (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'rolePlayer' otherlv_6= '=' (otherlv_7= 'process' | otherlv_8= 'application' ) otherlv_9= 'operation' otherlv_10= '=' ( (lv_operation_11_0= ruleOperation ) ) otherlv_12= 'condition' otherlv_13= '{' ( (lv_condition_14_0= ruleCondition ) ) otherlv_15= '}' otherlv_16= 'onBreach' ( (lv_onBreach_17_0= ruleOnBreach ) ) (otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) )? otherlv_20= '}' ) ;
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
            // InternalSmartCE.g:465:2: ( ( (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'rolePlayer' otherlv_6= '=' (otherlv_7= 'process' | otherlv_8= 'application' ) otherlv_9= 'operation' otherlv_10= '=' ( (lv_operation_11_0= ruleOperation ) ) otherlv_12= 'condition' otherlv_13= '{' ( (lv_condition_14_0= ruleCondition ) ) otherlv_15= '}' otherlv_16= 'onBreach' ( (lv_onBreach_17_0= ruleOnBreach ) ) (otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) )? otherlv_20= '}' ) )
            // InternalSmartCE.g:466:2: ( (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'rolePlayer' otherlv_6= '=' (otherlv_7= 'process' | otherlv_8= 'application' ) otherlv_9= 'operation' otherlv_10= '=' ( (lv_operation_11_0= ruleOperation ) ) otherlv_12= 'condition' otherlv_13= '{' ( (lv_condition_14_0= ruleCondition ) ) otherlv_15= '}' otherlv_16= 'onBreach' ( (lv_onBreach_17_0= ruleOnBreach ) ) (otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) )? otherlv_20= '}' )
            {
            // InternalSmartCE.g:466:2: ( (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'rolePlayer' otherlv_6= '=' (otherlv_7= 'process' | otherlv_8= 'application' ) otherlv_9= 'operation' otherlv_10= '=' ( (lv_operation_11_0= ruleOperation ) ) otherlv_12= 'condition' otherlv_13= '{' ( (lv_condition_14_0= ruleCondition ) ) otherlv_15= '}' otherlv_16= 'onBreach' ( (lv_onBreach_17_0= ruleOnBreach ) ) (otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) )? otherlv_20= '}' )
            // InternalSmartCE.g:467:3: (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'rolePlayer' otherlv_6= '=' (otherlv_7= 'process' | otherlv_8= 'application' ) otherlv_9= 'operation' otherlv_10= '=' ( (lv_operation_11_0= ruleOperation ) ) otherlv_12= 'condition' otherlv_13= '{' ( (lv_condition_14_0= ruleCondition ) ) otherlv_15= '}' otherlv_16= 'onBreach' ( (lv_onBreach_17_0= ruleOnBreach ) ) (otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) )? otherlv_20= '}'
            {
            // InternalSmartCE.g:467:3: (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSmartCE.g:468:4: otherlv_0= 'Right'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getClauseAccess().getRightKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:473:4: otherlv_1= 'Prohibition'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getClauseAccess().getProhibitionKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:478:4: otherlv_2= 'Obligation'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getClauseAccess().getObligationKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalSmartCE.g:483:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSmartCE.g:484:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSmartCE.g:484:4: (lv_name_3_0= RULE_ID )
            // InternalSmartCE.g:485:5: lv_name_3_0= RULE_ID
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

            otherlv_4=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getClauseAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_5=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getClauseAccess().getRolePlayerKeyword_3());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getClauseAccess().getEqualsSignKeyword_4());
            		
            // InternalSmartCE.g:513:3: (otherlv_7= 'process' | otherlv_8= 'application' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmartCE.g:514:4: otherlv_7= 'process'
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getClauseAccess().getProcessKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:519:4: otherlv_8= 'application'
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getClauseAccess().getApplicationKeyword_5_1());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getClauseAccess().getOperationKeyword_6());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_10, grammarAccess.getClauseAccess().getEqualsSignKeyword_7());
            		
            // InternalSmartCE.g:532:3: ( (lv_operation_11_0= ruleOperation ) )
            // InternalSmartCE.g:533:4: (lv_operation_11_0= ruleOperation )
            {
            // InternalSmartCE.g:533:4: (lv_operation_11_0= ruleOperation )
            // InternalSmartCE.g:534:5: lv_operation_11_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getOperationOperationEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_12=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_12, grammarAccess.getClauseAccess().getConditionKeyword_9());
            		
            otherlv_13=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_13, grammarAccess.getClauseAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalSmartCE.g:559:3: ( (lv_condition_14_0= ruleCondition ) )
            // InternalSmartCE.g:560:4: (lv_condition_14_0= ruleCondition )
            {
            // InternalSmartCE.g:560:4: (lv_condition_14_0= ruleCondition )
            // InternalSmartCE.g:561:5: lv_condition_14_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getConditionConditionParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_15=(Token)match(input,20,FOLLOW_24); 

            			newLeafNode(otherlv_15, grammarAccess.getClauseAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_16=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_16, grammarAccess.getClauseAccess().getOnBreachKeyword_13());
            		
            // InternalSmartCE.g:586:3: ( (lv_onBreach_17_0= ruleOnBreach ) )
            // InternalSmartCE.g:587:4: (lv_onBreach_17_0= ruleOnBreach )
            {
            // InternalSmartCE.g:587:4: (lv_onBreach_17_0= ruleOnBreach )
            // InternalSmartCE.g:588:5: lv_onBreach_17_0= ruleOnBreach
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getOnBreachOnBreachParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalSmartCE.g:605:3: (otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmartCE.g:606:4: otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) )
                    {
                    otherlv_18=(Token)match(input,29,FOLLOW_25); 

                    				newLeafNode(otherlv_18, grammarAccess.getClauseAccess().getOnSuccessKeyword_15_0());
                    			
                    // InternalSmartCE.g:610:4: ( (lv_onSuccess_19_0= ruleOnSuccess ) )
                    // InternalSmartCE.g:611:5: (lv_onSuccess_19_0= ruleOnSuccess )
                    {
                    // InternalSmartCE.g:611:5: (lv_onSuccess_19_0= ruleOnSuccess )
                    // InternalSmartCE.g:612:6: lv_onSuccess_19_0= ruleOnSuccess
                    {

                    						newCompositeNode(grammarAccess.getClauseAccess().getOnSuccessOnSuccessParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_15);
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

            otherlv_20=(Token)match(input,20,FOLLOW_2); 

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
    // InternalSmartCE.g:638:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalSmartCE.g:638:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalSmartCE.g:639:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalSmartCE.g:645:1: ruleCondition returns [EObject current=null] : (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition | this_ConditionalExpression_2= ruleConditionalExpression ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_BusinessRule_0 = null;

        EObject this_CompositeCondition_1 = null;

        EObject this_ConditionalExpression_2 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:651:2: ( (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition | this_ConditionalExpression_2= ruleConditionalExpression ) )
            // InternalSmartCE.g:652:2: (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition | this_ConditionalExpression_2= ruleConditionalExpression )
            {
            // InternalSmartCE.g:652:2: (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition | this_ConditionalExpression_2= ruleConditionalExpression )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalSmartCE.g:653:3: this_BusinessRule_0= ruleBusinessRule
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
                    // InternalSmartCE.g:662:3: this_CompositeCondition_1= ruleCompositeCondition
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
                    // InternalSmartCE.g:671:3: this_ConditionalExpression_2= ruleConditionalExpression
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
    // InternalSmartCE.g:683:1: entryRuleBusinessRule returns [EObject current=null] : iv_ruleBusinessRule= ruleBusinessRule EOF ;
    public final EObject entryRuleBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessRule = null;


        try {
            // InternalSmartCE.g:683:53: (iv_ruleBusinessRule= ruleBusinessRule EOF )
            // InternalSmartCE.g:684:2: iv_ruleBusinessRule= ruleBusinessRule EOF
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
    // InternalSmartCE.g:690:1: ruleBusinessRule returns [EObject current=null] : (this_Timeout_0= ruleTimeout | this_OperationLimit_1= ruleOperationLimit | this_BusinessDay_2= ruleBusinessDay | this_TimeInterval_3= ruleTimeInterval | this_MessageContent_4= ruleMessageContent | this_SessionInterval_5= ruleSessionInterval ) ;
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
            // InternalSmartCE.g:696:2: ( (this_Timeout_0= ruleTimeout | this_OperationLimit_1= ruleOperationLimit | this_BusinessDay_2= ruleBusinessDay | this_TimeInterval_3= ruleTimeInterval | this_MessageContent_4= ruleMessageContent | this_SessionInterval_5= ruleSessionInterval ) )
            // InternalSmartCE.g:697:2: (this_Timeout_0= ruleTimeout | this_OperationLimit_1= ruleOperationLimit | this_BusinessDay_2= ruleBusinessDay | this_TimeInterval_3= ruleTimeInterval | this_MessageContent_4= ruleMessageContent | this_SessionInterval_5= ruleSessionInterval )
            {
            // InternalSmartCE.g:697:2: (this_Timeout_0= ruleTimeout | this_OperationLimit_1= ruleOperationLimit | this_BusinessDay_2= ruleBusinessDay | this_TimeInterval_3= ruleTimeInterval | this_MessageContent_4= ruleMessageContent | this_SessionInterval_5= ruleSessionInterval )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt9=1;
                }
                break;
            case 39:
                {
                alt9=2;
                }
                break;
            case 41:
                {
                alt9=3;
                }
                break;
            case 43:
                {
                alt9=4;
                }
                break;
            case 46:
                {
                alt9=5;
                }
                break;
            case 44:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSmartCE.g:698:3: this_Timeout_0= ruleTimeout
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
                    // InternalSmartCE.g:707:3: this_OperationLimit_1= ruleOperationLimit
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
                    // InternalSmartCE.g:716:3: this_BusinessDay_2= ruleBusinessDay
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
                    // InternalSmartCE.g:725:3: this_TimeInterval_3= ruleTimeInterval
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
                    // InternalSmartCE.g:734:3: this_MessageContent_4= ruleMessageContent
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
                    // InternalSmartCE.g:743:3: this_SessionInterval_5= ruleSessionInterval
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
    // InternalSmartCE.g:755:1: entryRuleCompositeCondition returns [EObject current=null] : iv_ruleCompositeCondition= ruleCompositeCondition EOF ;
    public final EObject entryRuleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCondition = null;


        try {
            // InternalSmartCE.g:755:59: (iv_ruleCompositeCondition= ruleCompositeCondition EOF )
            // InternalSmartCE.g:756:2: iv_ruleCompositeCondition= ruleCompositeCondition EOF
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
    // InternalSmartCE.g:762:1: ruleCompositeCondition returns [EObject current=null] : ( ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* )* ) ;
    public final EObject ruleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_conditions_0_0 = null;

        EObject lv_logicalOperators_1_0 = null;

        EObject lv_conditions_2_0 = null;

        EObject lv_logicalOperators_3_0 = null;

        EObject lv_conditions_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:768:2: ( ( ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* )* ) )
            // InternalSmartCE.g:769:2: ( ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* )* )
            {
            // InternalSmartCE.g:769:2: ( ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* )* )
            // InternalSmartCE.g:770:3: ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* )*
            {
            // InternalSmartCE.g:770:3: ( (lv_conditions_0_0= ruleBusinessRule ) )
            // InternalSmartCE.g:771:4: (lv_conditions_0_0= ruleBusinessRule )
            {
            // InternalSmartCE.g:771:4: (lv_conditions_0_0= ruleBusinessRule )
            // InternalSmartCE.g:772:5: lv_conditions_0_0= ruleBusinessRule
            {

            					newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalSmartCE.g:789:3: ( (lv_logicalOperators_1_0= ruleLogicalOperator ) )
            // InternalSmartCE.g:790:4: (lv_logicalOperators_1_0= ruleLogicalOperator )
            {
            // InternalSmartCE.g:790:4: (lv_logicalOperators_1_0= ruleLogicalOperator )
            // InternalSmartCE.g:791:5: lv_logicalOperators_1_0= ruleLogicalOperator
            {

            					newCompositeNode(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsLogicalOperatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalSmartCE.g:808:3: ( ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=38 && LA11_0<=39)||LA11_0==41||(LA11_0>=43 && LA11_0<=44)||LA11_0==46) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSmartCE.g:809:4: ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )*
            	    {
            	    // InternalSmartCE.g:809:4: ( (lv_conditions_2_0= ruleBusinessRule ) )
            	    // InternalSmartCE.g:810:5: (lv_conditions_2_0= ruleBusinessRule )
            	    {
            	    // InternalSmartCE.g:810:5: (lv_conditions_2_0= ruleBusinessRule )
            	    // InternalSmartCE.g:811:6: lv_conditions_2_0= ruleBusinessRule
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_29);
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

            	    // InternalSmartCE.g:828:4: ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( ((LA10_0>=35 && LA10_0<=37)) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalSmartCE.g:829:5: ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) )
            	    	    {
            	    	    // InternalSmartCE.g:829:5: ( (lv_logicalOperators_3_0= ruleLogicalOperator ) )
            	    	    // InternalSmartCE.g:830:6: (lv_logicalOperators_3_0= ruleLogicalOperator )
            	    	    {
            	    	    // InternalSmartCE.g:830:6: (lv_logicalOperators_3_0= ruleLogicalOperator )
            	    	    // InternalSmartCE.g:831:7: lv_logicalOperators_3_0= ruleLogicalOperator
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsLogicalOperatorParserRuleCall_2_1_0_0());
            	    	    						
            	    	    pushFollow(FOLLOW_23);
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

            	    	    // InternalSmartCE.g:848:5: ( (lv_conditions_4_0= ruleBusinessRule ) )
            	    	    // InternalSmartCE.g:849:6: (lv_conditions_4_0= ruleBusinessRule )
            	    	    {
            	    	    // InternalSmartCE.g:849:6: (lv_conditions_4_0= ruleBusinessRule )
            	    	    // InternalSmartCE.g:850:7: lv_conditions_4_0= ruleBusinessRule
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_2_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_29);
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
            	    	    break loop10;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalSmartCE.g:873:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // InternalSmartCE.g:873:62: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // InternalSmartCE.g:874:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
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
    // InternalSmartCE.g:880:1: ruleConditionalExpression returns [EObject current=null] : ( ( (lv_conditions_0_0= ruleCompositeCondition ) ) otherlv_1= 'when' otherlv_2= '(' otherlv_3= 'expression' otherlv_4= ')' otherlv_5= 'check' otherlv_6= '{' ( (lv_conditions_7_0= ruleCondition ) ) otherlv_8= '}' ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_conditions_0_0 = null;

        EObject lv_conditions_7_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:886:2: ( ( ( (lv_conditions_0_0= ruleCompositeCondition ) ) otherlv_1= 'when' otherlv_2= '(' otherlv_3= 'expression' otherlv_4= ')' otherlv_5= 'check' otherlv_6= '{' ( (lv_conditions_7_0= ruleCondition ) ) otherlv_8= '}' ) )
            // InternalSmartCE.g:887:2: ( ( (lv_conditions_0_0= ruleCompositeCondition ) ) otherlv_1= 'when' otherlv_2= '(' otherlv_3= 'expression' otherlv_4= ')' otherlv_5= 'check' otherlv_6= '{' ( (lv_conditions_7_0= ruleCondition ) ) otherlv_8= '}' )
            {
            // InternalSmartCE.g:887:2: ( ( (lv_conditions_0_0= ruleCompositeCondition ) ) otherlv_1= 'when' otherlv_2= '(' otherlv_3= 'expression' otherlv_4= ')' otherlv_5= 'check' otherlv_6= '{' ( (lv_conditions_7_0= ruleCondition ) ) otherlv_8= '}' )
            // InternalSmartCE.g:888:3: ( (lv_conditions_0_0= ruleCompositeCondition ) ) otherlv_1= 'when' otherlv_2= '(' otherlv_3= 'expression' otherlv_4= ')' otherlv_5= 'check' otherlv_6= '{' ( (lv_conditions_7_0= ruleCondition ) ) otherlv_8= '}'
            {
            // InternalSmartCE.g:888:3: ( (lv_conditions_0_0= ruleCompositeCondition ) )
            // InternalSmartCE.g:889:4: (lv_conditions_0_0= ruleCompositeCondition )
            {
            // InternalSmartCE.g:889:4: (lv_conditions_0_0= ruleCompositeCondition )
            // InternalSmartCE.g:890:5: lv_conditions_0_0= ruleCompositeCondition
            {

            					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getConditionsCompositeConditionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_1=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalExpressionAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionalExpressionAccess().getExpressionKeyword_3());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getConditionalExpressionAccess().getCheckKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionalExpressionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalSmartCE.g:931:3: ( (lv_conditions_7_0= ruleCondition ) )
            // InternalSmartCE.g:932:4: (lv_conditions_7_0= ruleCondition )
            {
            // InternalSmartCE.g:932:4: (lv_conditions_7_0= ruleCondition )
            // InternalSmartCE.g:933:5: lv_conditions_7_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getConditionsConditionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

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
    // InternalSmartCE.g:958:1: entryRuleLogicalOperator returns [EObject current=null] : iv_ruleLogicalOperator= ruleLogicalOperator EOF ;
    public final EObject entryRuleLogicalOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOperator = null;


        try {
            // InternalSmartCE.g:958:56: (iv_ruleLogicalOperator= ruleLogicalOperator EOF )
            // InternalSmartCE.g:959:2: iv_ruleLogicalOperator= ruleLogicalOperator EOF
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
    // InternalSmartCE.g:965:1: ruleLogicalOperator returns [EObject current=null] : ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) ) ) ;
    public final EObject ruleLogicalOperator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;


        	enterRule();

        try {
            // InternalSmartCE.g:971:2: ( ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) ) ) )
            // InternalSmartCE.g:972:2: ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) ) )
            {
            // InternalSmartCE.g:972:2: ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) ) )
            // InternalSmartCE.g:973:3: ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) )
            {
            // InternalSmartCE.g:973:3: ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) )
            // InternalSmartCE.g:974:4: (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' )
            {
            // InternalSmartCE.g:974:4: (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt12=1;
                }
                break;
            case 36:
                {
                alt12=2;
                }
                break;
            case 37:
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
                    // InternalSmartCE.g:975:5: lv_name_0_1= 'AND'
                    {
                    lv_name_0_1=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getLogicalOperatorAccess().getNameANDKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:986:5: lv_name_0_2= 'OR'
                    {
                    lv_name_0_2=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getLogicalOperatorAccess().getNameORKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:997:5: lv_name_0_3= 'NOT'
                    {
                    lv_name_0_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalSmartCE.g:1013:1: entryRuleTimeout returns [EObject current=null] : iv_ruleTimeout= ruleTimeout EOF ;
    public final EObject entryRuleTimeout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeout = null;


        try {
            // InternalSmartCE.g:1013:48: (iv_ruleTimeout= ruleTimeout EOF )
            // InternalSmartCE.g:1014:2: iv_ruleTimeout= ruleTimeout EOF
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
    // InternalSmartCE.g:1020:1: ruleTimeout returns [EObject current=null] : (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleTimeout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1026:2: ( (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalSmartCE.g:1027:2: (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalSmartCE.g:1027:2: (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalSmartCE.g:1028:3: otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeoutAccess().getTimeoutKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeoutAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:1036:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalSmartCE.g:1037:4: (lv_value_2_0= RULE_INT )
            {
            // InternalSmartCE.g:1037:4: (lv_value_2_0= RULE_INT )
            // InternalSmartCE.g:1038:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_32); 

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

            otherlv_3=(Token)match(input,33,FOLLOW_2); 

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
    // InternalSmartCE.g:1062:1: entryRuleOperationLimit returns [EObject current=null] : iv_ruleOperationLimit= ruleOperationLimit EOF ;
    public final EObject entryRuleOperationLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationLimit = null;


        try {
            // InternalSmartCE.g:1062:55: (iv_ruleOperationLimit= ruleOperationLimit EOF )
            // InternalSmartCE.g:1063:2: iv_ruleOperationLimit= ruleOperationLimit EOF
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
    // InternalSmartCE.g:1069:1: ruleOperationLimit returns [EObject current=null] : (otherlv_0= 'OperationLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' ) ;
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
            // InternalSmartCE.g:1075:2: ( (otherlv_0= 'OperationLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' ) )
            // InternalSmartCE.g:1076:2: (otherlv_0= 'OperationLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' )
            {
            // InternalSmartCE.g:1076:2: (otherlv_0= 'OperationLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' )
            // InternalSmartCE.g:1077:3: otherlv_0= 'OperationLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationLimitAccess().getOperationLimitKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationLimitAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:1085:3: ( (lv_operationsNumber_2_0= RULE_INT ) )
            // InternalSmartCE.g:1086:4: (lv_operationsNumber_2_0= RULE_INT )
            {
            // InternalSmartCE.g:1086:4: (lv_operationsNumber_2_0= RULE_INT )
            // InternalSmartCE.g:1087:5: lv_operationsNumber_2_0= RULE_INT
            {
            lv_operationsNumber_2_0=(Token)match(input,RULE_INT,FOLLOW_35); 

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

            otherlv_3=(Token)match(input,40,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationLimitAccess().getByKeyword_3());
            		
            // InternalSmartCE.g:1107:3: ( (lv_timeUnit_4_0= ruleTimeUnit ) )
            // InternalSmartCE.g:1108:4: (lv_timeUnit_4_0= ruleTimeUnit )
            {
            // InternalSmartCE.g:1108:4: (lv_timeUnit_4_0= ruleTimeUnit )
            // InternalSmartCE.g:1109:5: lv_timeUnit_4_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getOperationLimitAccess().getTimeUnitTimeUnitEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_32);
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

            otherlv_5=(Token)match(input,33,FOLLOW_2); 

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
    // InternalSmartCE.g:1134:1: entryRuleBusinessDay returns [EObject current=null] : iv_ruleBusinessDay= ruleBusinessDay EOF ;
    public final EObject entryRuleBusinessDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessDay = null;


        try {
            // InternalSmartCE.g:1134:52: (iv_ruleBusinessDay= ruleBusinessDay EOF )
            // InternalSmartCE.g:1135:2: iv_ruleBusinessDay= ruleBusinessDay EOF
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
    // InternalSmartCE.g:1141:1: ruleBusinessDay returns [EObject current=null] : (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' ) ;
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
            // InternalSmartCE.g:1147:2: ( (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' ) )
            // InternalSmartCE.g:1148:2: (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' )
            {
            // InternalSmartCE.g:1148:2: (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' )
            // InternalSmartCE.g:1149:3: otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessDayAccess().getBusinessDayKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getBusinessDayAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:1157:3: ( (lv_start_2_0= ruleWeekDay ) )
            // InternalSmartCE.g:1158:4: (lv_start_2_0= ruleWeekDay )
            {
            // InternalSmartCE.g:1158:4: (lv_start_2_0= ruleWeekDay )
            // InternalSmartCE.g:1159:5: lv_start_2_0= ruleWeekDay
            {

            					newCompositeNode(grammarAccess.getBusinessDayAccess().getStartWeekDayEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_38);
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

            otherlv_3=(Token)match(input,42,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getBusinessDayAccess().getToKeyword_3());
            		
            // InternalSmartCE.g:1180:3: ( (lv_end_4_0= ruleWeekDay ) )
            // InternalSmartCE.g:1181:4: (lv_end_4_0= ruleWeekDay )
            {
            // InternalSmartCE.g:1181:4: (lv_end_4_0= ruleWeekDay )
            // InternalSmartCE.g:1182:5: lv_end_4_0= ruleWeekDay
            {

            					newCompositeNode(grammarAccess.getBusinessDayAccess().getEndWeekDayEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_32);
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

            otherlv_5=(Token)match(input,33,FOLLOW_2); 

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
    // InternalSmartCE.g:1207:1: entryRuleTimeInterval returns [EObject current=null] : iv_ruleTimeInterval= ruleTimeInterval EOF ;
    public final EObject entryRuleTimeInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeInterval = null;


        try {
            // InternalSmartCE.g:1207:53: (iv_ruleTimeInterval= ruleTimeInterval EOF )
            // InternalSmartCE.g:1208:2: iv_ruleTimeInterval= ruleTimeInterval EOF
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
    // InternalSmartCE.g:1214:1: ruleTimeInterval returns [EObject current=null] : (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
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
            // InternalSmartCE.g:1220:2: ( (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalSmartCE.g:1221:2: (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalSmartCE.g:1221:2: (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalSmartCE.g:1222:3: otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeIntervalAccess().getTimeIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeIntervalAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:1230:3: ( (lv_start_2_0= RULE_STRING ) )
            // InternalSmartCE.g:1231:4: (lv_start_2_0= RULE_STRING )
            {
            // InternalSmartCE.g:1231:4: (lv_start_2_0= RULE_STRING )
            // InternalSmartCE.g:1232:5: lv_start_2_0= RULE_STRING
            {
            lv_start_2_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

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

            otherlv_3=(Token)match(input,42,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeIntervalAccess().getToKeyword_3());
            		
            // InternalSmartCE.g:1252:3: ( (lv_end_4_0= RULE_STRING ) )
            // InternalSmartCE.g:1253:4: (lv_end_4_0= RULE_STRING )
            {
            // InternalSmartCE.g:1253:4: (lv_end_4_0= RULE_STRING )
            // InternalSmartCE.g:1254:5: lv_end_4_0= RULE_STRING
            {
            lv_end_4_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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

            otherlv_5=(Token)match(input,33,FOLLOW_2); 

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
    // InternalSmartCE.g:1278:1: entryRuleSessionInterval returns [EObject current=null] : iv_ruleSessionInterval= ruleSessionInterval EOF ;
    public final EObject entryRuleSessionInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSessionInterval = null;


        try {
            // InternalSmartCE.g:1278:56: (iv_ruleSessionInterval= ruleSessionInterval EOF )
            // InternalSmartCE.g:1279:2: iv_ruleSessionInterval= ruleSessionInterval EOF
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
    // InternalSmartCE.g:1285:1: ruleSessionInterval returns [EObject current=null] : ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'from' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'to' ( (lv_end_7_0= RULE_STRING ) ) otherlv_8= ')' ) | (otherlv_9= 'SessionInterval' otherlv_10= '(' ( (lv_frequency_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) otherlv_13= ')' ) ) ;
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
            // InternalSmartCE.g:1291:2: ( ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'from' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'to' ( (lv_end_7_0= RULE_STRING ) ) otherlv_8= ')' ) | (otherlv_9= 'SessionInterval' otherlv_10= '(' ( (lv_frequency_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) otherlv_13= ')' ) ) )
            // InternalSmartCE.g:1292:2: ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'from' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'to' ( (lv_end_7_0= RULE_STRING ) ) otherlv_8= ')' ) | (otherlv_9= 'SessionInterval' otherlv_10= '(' ( (lv_frequency_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) otherlv_13= ')' ) )
            {
            // InternalSmartCE.g:1292:2: ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'from' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'to' ( (lv_end_7_0= RULE_STRING ) ) otherlv_8= ')' ) | (otherlv_9= 'SessionInterval' otherlv_10= '(' ( (lv_frequency_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) otherlv_13= ')' ) )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalSmartCE.g:1293:3: (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'from' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'to' ( (lv_end_7_0= RULE_STRING ) ) otherlv_8= ')' )
                    {
                    // InternalSmartCE.g:1293:3: (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'from' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'to' ( (lv_end_7_0= RULE_STRING ) ) otherlv_8= ')' )
                    // InternalSmartCE.g:1294:4: otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'from' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'to' ( (lv_end_7_0= RULE_STRING ) ) otherlv_8= ')'
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_25); 

                    				newLeafNode(otherlv_0, grammarAccess.getSessionIntervalAccess().getSessionIntervalKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,31,FOLLOW_34); 

                    				newLeafNode(otherlv_1, grammarAccess.getSessionIntervalAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalSmartCE.g:1302:4: ( (lv_frequency_2_0= RULE_INT ) )
                    // InternalSmartCE.g:1303:5: (lv_frequency_2_0= RULE_INT )
                    {
                    // InternalSmartCE.g:1303:5: (lv_frequency_2_0= RULE_INT )
                    // InternalSmartCE.g:1304:6: lv_frequency_2_0= RULE_INT
                    {
                    lv_frequency_2_0=(Token)match(input,RULE_INT,FOLLOW_36); 

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

                    // InternalSmartCE.g:1320:4: ( (lv_timeUnit_3_0= ruleTimeUnit ) )
                    // InternalSmartCE.g:1321:5: (lv_timeUnit_3_0= ruleTimeUnit )
                    {
                    // InternalSmartCE.g:1321:5: (lv_timeUnit_3_0= ruleTimeUnit )
                    // InternalSmartCE.g:1322:6: lv_timeUnit_3_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getSessionIntervalAccess().getTimeUnitTimeUnitEnumRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_39);
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

                    otherlv_4=(Token)match(input,45,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getSessionIntervalAccess().getFromKeyword_0_4());
                    			
                    // InternalSmartCE.g:1343:4: ( (lv_start_5_0= RULE_STRING ) )
                    // InternalSmartCE.g:1344:5: (lv_start_5_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:1344:5: (lv_start_5_0= RULE_STRING )
                    // InternalSmartCE.g:1345:6: lv_start_5_0= RULE_STRING
                    {
                    lv_start_5_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

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

                    otherlv_6=(Token)match(input,42,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getSessionIntervalAccess().getToKeyword_0_6());
                    			
                    // InternalSmartCE.g:1365:4: ( (lv_end_7_0= RULE_STRING ) )
                    // InternalSmartCE.g:1366:5: (lv_end_7_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:1366:5: (lv_end_7_0= RULE_STRING )
                    // InternalSmartCE.g:1367:6: lv_end_7_0= RULE_STRING
                    {
                    lv_end_7_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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

                    otherlv_8=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getSessionIntervalAccess().getRightParenthesisKeyword_0_8());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:1389:3: (otherlv_9= 'SessionInterval' otherlv_10= '(' ( (lv_frequency_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) otherlv_13= ')' )
                    {
                    // InternalSmartCE.g:1389:3: (otherlv_9= 'SessionInterval' otherlv_10= '(' ( (lv_frequency_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) otherlv_13= ')' )
                    // InternalSmartCE.g:1390:4: otherlv_9= 'SessionInterval' otherlv_10= '(' ( (lv_frequency_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) otherlv_13= ')'
                    {
                    otherlv_9=(Token)match(input,44,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getSessionIntervalAccess().getSessionIntervalKeyword_1_0());
                    			
                    otherlv_10=(Token)match(input,31,FOLLOW_34); 

                    				newLeafNode(otherlv_10, grammarAccess.getSessionIntervalAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalSmartCE.g:1398:4: ( (lv_frequency_11_0= RULE_INT ) )
                    // InternalSmartCE.g:1399:5: (lv_frequency_11_0= RULE_INT )
                    {
                    // InternalSmartCE.g:1399:5: (lv_frequency_11_0= RULE_INT )
                    // InternalSmartCE.g:1400:6: lv_frequency_11_0= RULE_INT
                    {
                    lv_frequency_11_0=(Token)match(input,RULE_INT,FOLLOW_36); 

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

                    // InternalSmartCE.g:1416:4: ( (lv_timeUnit_12_0= ruleTimeUnit ) )
                    // InternalSmartCE.g:1417:5: (lv_timeUnit_12_0= ruleTimeUnit )
                    {
                    // InternalSmartCE.g:1417:5: (lv_timeUnit_12_0= ruleTimeUnit )
                    // InternalSmartCE.g:1418:6: lv_timeUnit_12_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getSessionIntervalAccess().getTimeUnitTimeUnitEnumRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_32);
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

                    otherlv_13=(Token)match(input,33,FOLLOW_2); 

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
    // InternalSmartCE.g:1444:1: entryRuleMessageContent returns [EObject current=null] : iv_ruleMessageContent= ruleMessageContent EOF ;
    public final EObject entryRuleMessageContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageContent = null;


        try {
            // InternalSmartCE.g:1444:55: (iv_ruleMessageContent= ruleMessageContent EOF )
            // InternalSmartCE.g:1445:2: iv_ruleMessageContent= ruleMessageContent EOF
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
    // InternalSmartCE.g:1451:1: ruleMessageContent returns [EObject current=null] : ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' ) | (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' ) ) ;
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
            // InternalSmartCE.g:1457:2: ( ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' ) | (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' ) ) )
            // InternalSmartCE.g:1458:2: ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' ) | (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' ) )
            {
            // InternalSmartCE.g:1458:2: ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' ) | (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' ) )
            int alt16=4;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalSmartCE.g:1459:3: (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' )
                    {
                    // InternalSmartCE.g:1459:3: (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' )
                    // InternalSmartCE.g:1460:4: otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_25); 

                    				newLeafNode(otherlv_0, grammarAccess.getMessageContentAccess().getMessageContentKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalSmartCE.g:1468:4: ( (lv_content_2_0= RULE_STRING ) )
                    // InternalSmartCE.g:1469:5: (lv_content_2_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:1469:5: (lv_content_2_0= RULE_STRING )
                    // InternalSmartCE.g:1470:6: lv_content_2_0= RULE_STRING
                    {
                    lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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

                    otherlv_3=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getMessageContentAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:1492:3: (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' )
                    {
                    // InternalSmartCE.g:1492:3: (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' )
                    // InternalSmartCE.g:1493:4: otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getMessageContentAccess().getMessageContentKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalSmartCE.g:1501:4: ( (lv_content_6_0= RULE_STRING ) )
                    // InternalSmartCE.g:1502:5: (lv_content_6_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:1502:5: (lv_content_6_0= RULE_STRING )
                    // InternalSmartCE.g:1503:6: lv_content_6_0= RULE_STRING
                    {
                    lv_content_6_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

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

                    otherlv_7=(Token)match(input,40,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getMessageContentAccess().getByKeyword_1_3());
                    			
                    // InternalSmartCE.g:1523:4: ( (lv_timeUnit_8_0= ruleTimeUnit ) )
                    // InternalSmartCE.g:1524:5: (lv_timeUnit_8_0= ruleTimeUnit )
                    {
                    // InternalSmartCE.g:1524:5: (lv_timeUnit_8_0= ruleTimeUnit )
                    // InternalSmartCE.g:1525:6: lv_timeUnit_8_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getTimeUnitTimeUnitEnumRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_32);
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

                    otherlv_9=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getMessageContentAccess().getRightParenthesisKeyword_1_5());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:1548:3: (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' )
                    {
                    // InternalSmartCE.g:1548:3: (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' )
                    // InternalSmartCE.g:1549:4: otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')'
                    {
                    otherlv_10=(Token)match(input,46,FOLLOW_25); 

                    				newLeafNode(otherlv_10, grammarAccess.getMessageContentAccess().getMessageContentKeyword_2_0());
                    			
                    otherlv_11=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_11, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalSmartCE.g:1557:4: ( (lv_content_12_0= RULE_STRING ) )
                    // InternalSmartCE.g:1558:5: (lv_content_12_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:1558:5: (lv_content_12_0= RULE_STRING )
                    // InternalSmartCE.g:1559:6: lv_content_12_0= RULE_STRING
                    {
                    lv_content_12_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

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

                    // InternalSmartCE.g:1575:4: ( (lv_binaryOperator_13_0= ruleBinaryOperator ) )
                    // InternalSmartCE.g:1576:5: (lv_binaryOperator_13_0= ruleBinaryOperator )
                    {
                    // InternalSmartCE.g:1576:5: (lv_binaryOperator_13_0= ruleBinaryOperator )
                    // InternalSmartCE.g:1577:6: lv_binaryOperator_13_0= ruleBinaryOperator
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getBinaryOperatorBinaryOperatorParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalSmartCE.g:1594:4: ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) )
                    int alt14=3;
                    switch ( input.LA(1) ) {
                    case RULE_STRING:
                        {
                        alt14=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt14=2;
                        }
                        break;
                    case RULE_INT:
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
                            // InternalSmartCE.g:1595:5: ( (lv_stringValue_14_0= ruleStringValue ) )
                            {
                            // InternalSmartCE.g:1595:5: ( (lv_stringValue_14_0= ruleStringValue ) )
                            // InternalSmartCE.g:1596:6: (lv_stringValue_14_0= ruleStringValue )
                            {
                            // InternalSmartCE.g:1596:6: (lv_stringValue_14_0= ruleStringValue )
                            // InternalSmartCE.g:1597:7: lv_stringValue_14_0= ruleStringValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getStringValueStringValueParserRuleCall_2_4_0_0());
                            						
                            pushFollow(FOLLOW_32);
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
                            // InternalSmartCE.g:1615:5: ( (lv_variableValue_15_0= ruleVariableValue ) )
                            {
                            // InternalSmartCE.g:1615:5: ( (lv_variableValue_15_0= ruleVariableValue ) )
                            // InternalSmartCE.g:1616:6: (lv_variableValue_15_0= ruleVariableValue )
                            {
                            // InternalSmartCE.g:1616:6: (lv_variableValue_15_0= ruleVariableValue )
                            // InternalSmartCE.g:1617:7: lv_variableValue_15_0= ruleVariableValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getVariableValueVariableValueParserRuleCall_2_4_1_0());
                            						
                            pushFollow(FOLLOW_32);
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
                            // InternalSmartCE.g:1635:5: ( (lv_numericValue_16_0= ruleNumericValue ) )
                            {
                            // InternalSmartCE.g:1635:5: ( (lv_numericValue_16_0= ruleNumericValue ) )
                            // InternalSmartCE.g:1636:6: (lv_numericValue_16_0= ruleNumericValue )
                            {
                            // InternalSmartCE.g:1636:6: (lv_numericValue_16_0= ruleNumericValue )
                            // InternalSmartCE.g:1637:7: lv_numericValue_16_0= ruleNumericValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getNumericValueNumericValueParserRuleCall_2_4_2_0());
                            						
                            pushFollow(FOLLOW_32);
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

                    otherlv_17=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getMessageContentAccess().getRightParenthesisKeyword_2_5());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:1661:3: (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' )
                    {
                    // InternalSmartCE.g:1661:3: (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' )
                    // InternalSmartCE.g:1662:4: otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')'
                    {
                    otherlv_18=(Token)match(input,46,FOLLOW_25); 

                    				newLeafNode(otherlv_18, grammarAccess.getMessageContentAccess().getMessageContentKeyword_3_0());
                    			
                    otherlv_19=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_19, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalSmartCE.g:1670:4: ( (lv_content_20_0= RULE_STRING ) )
                    // InternalSmartCE.g:1671:5: (lv_content_20_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:1671:5: (lv_content_20_0= RULE_STRING )
                    // InternalSmartCE.g:1672:6: lv_content_20_0= RULE_STRING
                    {
                    lv_content_20_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

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

                    // InternalSmartCE.g:1688:4: ( (lv_binaryOperator_21_0= ruleBinaryOperator ) )
                    // InternalSmartCE.g:1689:5: (lv_binaryOperator_21_0= ruleBinaryOperator )
                    {
                    // InternalSmartCE.g:1689:5: (lv_binaryOperator_21_0= ruleBinaryOperator )
                    // InternalSmartCE.g:1690:6: lv_binaryOperator_21_0= ruleBinaryOperator
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getBinaryOperatorBinaryOperatorParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalSmartCE.g:1707:4: ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) )
                    int alt15=3;
                    switch ( input.LA(1) ) {
                    case RULE_STRING:
                        {
                        alt15=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt15=2;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt15=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }

                    switch (alt15) {
                        case 1 :
                            // InternalSmartCE.g:1708:5: ( (lv_stringValue_22_0= ruleStringValue ) )
                            {
                            // InternalSmartCE.g:1708:5: ( (lv_stringValue_22_0= ruleStringValue ) )
                            // InternalSmartCE.g:1709:6: (lv_stringValue_22_0= ruleStringValue )
                            {
                            // InternalSmartCE.g:1709:6: (lv_stringValue_22_0= ruleStringValue )
                            // InternalSmartCE.g:1710:7: lv_stringValue_22_0= ruleStringValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getStringValueStringValueParserRuleCall_3_4_0_0());
                            						
                            pushFollow(FOLLOW_35);
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
                            // InternalSmartCE.g:1728:5: ( (lv_variableValue_23_0= ruleVariableValue ) )
                            {
                            // InternalSmartCE.g:1728:5: ( (lv_variableValue_23_0= ruleVariableValue ) )
                            // InternalSmartCE.g:1729:6: (lv_variableValue_23_0= ruleVariableValue )
                            {
                            // InternalSmartCE.g:1729:6: (lv_variableValue_23_0= ruleVariableValue )
                            // InternalSmartCE.g:1730:7: lv_variableValue_23_0= ruleVariableValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getVariableValueVariableValueParserRuleCall_3_4_1_0());
                            						
                            pushFollow(FOLLOW_35);
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
                            // InternalSmartCE.g:1748:5: ( (lv_numericValue_24_0= ruleNumericValue ) )
                            {
                            // InternalSmartCE.g:1748:5: ( (lv_numericValue_24_0= ruleNumericValue ) )
                            // InternalSmartCE.g:1749:6: (lv_numericValue_24_0= ruleNumericValue )
                            {
                            // InternalSmartCE.g:1749:6: (lv_numericValue_24_0= ruleNumericValue )
                            // InternalSmartCE.g:1750:7: lv_numericValue_24_0= ruleNumericValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getNumericValueNumericValueParserRuleCall_3_4_2_0());
                            						
                            pushFollow(FOLLOW_35);
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

                    otherlv_25=(Token)match(input,40,FOLLOW_36); 

                    				newLeafNode(otherlv_25, grammarAccess.getMessageContentAccess().getByKeyword_3_5());
                    			
                    // InternalSmartCE.g:1772:4: ( (lv_timeUnit_26_0= ruleTimeUnit ) )
                    // InternalSmartCE.g:1773:5: (lv_timeUnit_26_0= ruleTimeUnit )
                    {
                    // InternalSmartCE.g:1773:5: (lv_timeUnit_26_0= ruleTimeUnit )
                    // InternalSmartCE.g:1774:6: lv_timeUnit_26_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getTimeUnitTimeUnitEnumRuleCall_3_6_0());
                    					
                    pushFollow(FOLLOW_32);
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

                    otherlv_27=(Token)match(input,33,FOLLOW_2); 

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
    // InternalSmartCE.g:1800:1: entryRuleBinaryOperator returns [EObject current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final EObject entryRuleBinaryOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperator = null;


        try {
            // InternalSmartCE.g:1800:55: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // InternalSmartCE.g:1801:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
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
    // InternalSmartCE.g:1807:1: ruleBinaryOperator returns [EObject current=null] : ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) ) ;
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
            // InternalSmartCE.g:1813:2: ( ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) ) )
            // InternalSmartCE.g:1814:2: ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) )
            {
            // InternalSmartCE.g:1814:2: ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt17=1;
                }
                break;
            case 48:
                {
                alt17=2;
                }
                break;
            case 49:
                {
                alt17=3;
                }
                break;
            case 50:
                {
                alt17=4;
                }
                break;
            case 51:
                {
                alt17=5;
                }
                break;
            case 52:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalSmartCE.g:1815:3: ( (lv_symbol_0_0= '<=' ) )
                    {
                    // InternalSmartCE.g:1815:3: ( (lv_symbol_0_0= '<=' ) )
                    // InternalSmartCE.g:1816:4: (lv_symbol_0_0= '<=' )
                    {
                    // InternalSmartCE.g:1816:4: (lv_symbol_0_0= '<=' )
                    // InternalSmartCE.g:1817:5: lv_symbol_0_0= '<='
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
                    // InternalSmartCE.g:1830:3: ( (lv_symbol_1_0= '>=' ) )
                    {
                    // InternalSmartCE.g:1830:3: ( (lv_symbol_1_0= '>=' ) )
                    // InternalSmartCE.g:1831:4: (lv_symbol_1_0= '>=' )
                    {
                    // InternalSmartCE.g:1831:4: (lv_symbol_1_0= '>=' )
                    // InternalSmartCE.g:1832:5: lv_symbol_1_0= '>='
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
                    // InternalSmartCE.g:1845:3: ( (lv_symbol_2_0= '>' ) )
                    {
                    // InternalSmartCE.g:1845:3: ( (lv_symbol_2_0= '>' ) )
                    // InternalSmartCE.g:1846:4: (lv_symbol_2_0= '>' )
                    {
                    // InternalSmartCE.g:1846:4: (lv_symbol_2_0= '>' )
                    // InternalSmartCE.g:1847:5: lv_symbol_2_0= '>'
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
                    // InternalSmartCE.g:1860:3: ( (lv_symbol_3_0= '<' ) )
                    {
                    // InternalSmartCE.g:1860:3: ( (lv_symbol_3_0= '<' ) )
                    // InternalSmartCE.g:1861:4: (lv_symbol_3_0= '<' )
                    {
                    // InternalSmartCE.g:1861:4: (lv_symbol_3_0= '<' )
                    // InternalSmartCE.g:1862:5: lv_symbol_3_0= '<'
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
                    // InternalSmartCE.g:1875:3: ( (lv_symbol_4_0= '!=' ) )
                    {
                    // InternalSmartCE.g:1875:3: ( (lv_symbol_4_0= '!=' ) )
                    // InternalSmartCE.g:1876:4: (lv_symbol_4_0= '!=' )
                    {
                    // InternalSmartCE.g:1876:4: (lv_symbol_4_0= '!=' )
                    // InternalSmartCE.g:1877:5: lv_symbol_4_0= '!='
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
                    // InternalSmartCE.g:1890:3: ( (lv_symbol_5_0= '==' ) )
                    {
                    // InternalSmartCE.g:1890:3: ( (lv_symbol_5_0= '==' ) )
                    // InternalSmartCE.g:1891:4: (lv_symbol_5_0= '==' )
                    {
                    // InternalSmartCE.g:1891:4: (lv_symbol_5_0= '==' )
                    // InternalSmartCE.g:1892:5: lv_symbol_5_0= '=='
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
    // InternalSmartCE.g:1908:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalSmartCE.g:1908:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalSmartCE.g:1909:2: iv_ruleApplication= ruleApplication EOF
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
    // InternalSmartCE.g:1915:1: ruleApplication returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1921:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalSmartCE.g:1922:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalSmartCE.g:1922:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalSmartCE.g:1923:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalSmartCE.g:1923:3: (lv_name_0_0= RULE_STRING )
            // InternalSmartCE.g:1924:4: lv_name_0_0= RULE_STRING
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
    // InternalSmartCE.g:1943:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalSmartCE.g:1943:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalSmartCE.g:1944:2: iv_ruleProcess= ruleProcess EOF
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
    // InternalSmartCE.g:1950:1: ruleProcess returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1956:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalSmartCE.g:1957:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalSmartCE.g:1957:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalSmartCE.g:1958:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalSmartCE.g:1958:3: (lv_name_0_0= RULE_STRING )
            // InternalSmartCE.g:1959:4: lv_name_0_0= RULE_STRING
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
    // InternalSmartCE.g:1978:1: entryRuleOnSuccess returns [EObject current=null] : iv_ruleOnSuccess= ruleOnSuccess EOF ;
    public final EObject entryRuleOnSuccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnSuccess = null;


        try {
            // InternalSmartCE.g:1978:50: (iv_ruleOnSuccess= ruleOnSuccess EOF )
            // InternalSmartCE.g:1979:2: iv_ruleOnSuccess= ruleOnSuccess EOF
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
    // InternalSmartCE.g:1985:1: ruleOnSuccess returns [EObject current=null] : (otherlv_0= '(' ( (lv_action_1_0= ruleAction ) ) otherlv_2= '(' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= ')' ) ;
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
            // InternalSmartCE.g:1991:2: ( (otherlv_0= '(' ( (lv_action_1_0= ruleAction ) ) otherlv_2= '(' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= ')' ) )
            // InternalSmartCE.g:1992:2: (otherlv_0= '(' ( (lv_action_1_0= ruleAction ) ) otherlv_2= '(' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= ')' )
            {
            // InternalSmartCE.g:1992:2: (otherlv_0= '(' ( (lv_action_1_0= ruleAction ) ) otherlv_2= '(' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= ')' )
            // InternalSmartCE.g:1993:3: otherlv_0= '(' ( (lv_action_1_0= ruleAction ) ) otherlv_2= '(' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getOnSuccessAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSmartCE.g:1997:3: ( (lv_action_1_0= ruleAction ) )
            // InternalSmartCE.g:1998:4: (lv_action_1_0= ruleAction )
            {
            // InternalSmartCE.g:1998:4: (lv_action_1_0= ruleAction )
            // InternalSmartCE.g:1999:5: lv_action_1_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getOnSuccessAccess().getActionActionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_2=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getOnSuccessAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSmartCE.g:2020:3: ( (lv_message_3_0= ruleExpression ) )
            // InternalSmartCE.g:2021:4: (lv_message_3_0= ruleExpression )
            {
            // InternalSmartCE.g:2021:4: (lv_message_3_0= ruleExpression )
            // InternalSmartCE.g:2022:5: lv_message_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOnSuccessAccess().getMessageExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
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

            otherlv_4=(Token)match(input,33,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getOnSuccessAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,33,FOLLOW_2); 

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
    // InternalSmartCE.g:2051:1: entryRuleOnBreach returns [EObject current=null] : iv_ruleOnBreach= ruleOnBreach EOF ;
    public final EObject entryRuleOnBreach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnBreach = null;


        try {
            // InternalSmartCE.g:2051:49: (iv_ruleOnBreach= ruleOnBreach EOF )
            // InternalSmartCE.g:2052:2: iv_ruleOnBreach= ruleOnBreach EOF
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
    // InternalSmartCE.g:2058:1: ruleOnBreach returns [EObject current=null] : (otherlv_0= '(' ( (lv_action_1_0= ruleAction ) ) otherlv_2= '(' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= ')' ) ;
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
            // InternalSmartCE.g:2064:2: ( (otherlv_0= '(' ( (lv_action_1_0= ruleAction ) ) otherlv_2= '(' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= ')' ) )
            // InternalSmartCE.g:2065:2: (otherlv_0= '(' ( (lv_action_1_0= ruleAction ) ) otherlv_2= '(' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= ')' )
            {
            // InternalSmartCE.g:2065:2: (otherlv_0= '(' ( (lv_action_1_0= ruleAction ) ) otherlv_2= '(' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= ')' )
            // InternalSmartCE.g:2066:3: otherlv_0= '(' ( (lv_action_1_0= ruleAction ) ) otherlv_2= '(' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getOnBreachAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSmartCE.g:2070:3: ( (lv_action_1_0= ruleAction ) )
            // InternalSmartCE.g:2071:4: (lv_action_1_0= ruleAction )
            {
            // InternalSmartCE.g:2071:4: (lv_action_1_0= ruleAction )
            // InternalSmartCE.g:2072:5: lv_action_1_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getOnBreachAccess().getActionActionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_2=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getOnBreachAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSmartCE.g:2093:3: ( (lv_message_3_0= ruleExpression ) )
            // InternalSmartCE.g:2094:4: (lv_message_3_0= ruleExpression )
            {
            // InternalSmartCE.g:2094:4: (lv_message_3_0= ruleExpression )
            // InternalSmartCE.g:2095:5: lv_message_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOnBreachAccess().getMessageExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
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

            otherlv_4=(Token)match(input,33,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getOnBreachAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,33,FOLLOW_2); 

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
    // InternalSmartCE.g:2124:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalSmartCE.g:2124:47: (iv_ruleAction= ruleAction EOF )
            // InternalSmartCE.g:2125:2: iv_ruleAction= ruleAction EOF
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
    // InternalSmartCE.g:2131:1: ruleAction returns [EObject current=null] : (this_BusinessAction_0= ruleBusinessAction | this_EventLog_1= ruleEventLog ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_BusinessAction_0 = null;

        EObject this_EventLog_1 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2137:2: ( (this_BusinessAction_0= ruleBusinessAction | this_EventLog_1= ruleEventLog ) )
            // InternalSmartCE.g:2138:2: (this_BusinessAction_0= ruleBusinessAction | this_EventLog_1= ruleEventLog )
            {
            // InternalSmartCE.g:2138:2: (this_BusinessAction_0= ruleBusinessAction | this_EventLog_1= ruleEventLog )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==53) ) {
                alt18=1;
            }
            else if ( (LA18_0==54) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSmartCE.g:2139:3: this_BusinessAction_0= ruleBusinessAction
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
                    // InternalSmartCE.g:2148:3: this_EventLog_1= ruleEventLog
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
    // InternalSmartCE.g:2160:1: entryRuleBusinessAction returns [EObject current=null] : iv_ruleBusinessAction= ruleBusinessAction EOF ;
    public final EObject entryRuleBusinessAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessAction = null;


        try {
            // InternalSmartCE.g:2160:55: (iv_ruleBusinessAction= ruleBusinessAction EOF )
            // InternalSmartCE.g:2161:2: iv_ruleBusinessAction= ruleBusinessAction EOF
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
    // InternalSmartCE.g:2167:1: ruleBusinessAction returns [EObject current=null] : (otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBusinessAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2173:2: ( (otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSmartCE.g:2174:2: (otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSmartCE.g:2174:2: (otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSmartCE.g:2175:3: otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessActionAccess().getBusinessActionKeyword_0());
            		
            // InternalSmartCE.g:2179:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCE.g:2180:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCE.g:2180:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCE.g:2181:5: lv_name_1_0= RULE_ID
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
    // InternalSmartCE.g:2201:1: entryRuleEventLog returns [EObject current=null] : iv_ruleEventLog= ruleEventLog EOF ;
    public final EObject entryRuleEventLog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventLog = null;


        try {
            // InternalSmartCE.g:2201:49: (iv_ruleEventLog= ruleEventLog EOF )
            // InternalSmartCE.g:2202:2: iv_ruleEventLog= ruleEventLog EOF
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
    // InternalSmartCE.g:2208:1: ruleEventLog returns [EObject current=null] : (otherlv_0= 'EventLog' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEventLog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2214:2: ( (otherlv_0= 'EventLog' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSmartCE.g:2215:2: (otherlv_0= 'EventLog' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSmartCE.g:2215:2: (otherlv_0= 'EventLog' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSmartCE.g:2216:3: otherlv_0= 'EventLog' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEventLogAccess().getEventLogKeyword_0());
            		
            // InternalSmartCE.g:2220:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCE.g:2221:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCE.g:2221:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCE.g:2222:5: lv_name_1_0= RULE_ID
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
    // InternalSmartCE.g:2242:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSmartCE.g:2242:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSmartCE.g:2243:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalSmartCE.g:2249:1: ruleExpression returns [EObject current=null] : (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        Token lv_symbol_3_0=null;
        EObject this_Negation_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2255:2: ( (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* ) )
            // InternalSmartCE.g:2256:2: (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* )
            {
            // InternalSmartCE.g:2256:2: (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* )
            // InternalSmartCE.g:2257:3: this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getNegationParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_Negation_0=ruleNegation();

            state._fsp--;


            			current = this_Negation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:2265:3: ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=55 && LA20_0<=56)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSmartCE.g:2266:4: () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) )
            	    {
            	    // InternalSmartCE.g:2266:4: ()
            	    // InternalSmartCE.g:2267:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:2273:4: ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==55) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==56) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalSmartCE.g:2274:5: ( (lv_symbol_2_0= '&&' ) )
            	            {
            	            // InternalSmartCE.g:2274:5: ( (lv_symbol_2_0= '&&' ) )
            	            // InternalSmartCE.g:2275:6: (lv_symbol_2_0= '&&' )
            	            {
            	            // InternalSmartCE.g:2275:6: (lv_symbol_2_0= '&&' )
            	            // InternalSmartCE.g:2276:7: lv_symbol_2_0= '&&'
            	            {
            	            lv_symbol_2_0=(Token)match(input,55,FOLLOW_9); 

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
            	            // InternalSmartCE.g:2289:5: ( (lv_symbol_3_0= '||' ) )
            	            {
            	            // InternalSmartCE.g:2289:5: ( (lv_symbol_3_0= '||' ) )
            	            // InternalSmartCE.g:2290:6: (lv_symbol_3_0= '||' )
            	            {
            	            // InternalSmartCE.g:2290:6: (lv_symbol_3_0= '||' )
            	            // InternalSmartCE.g:2291:7: lv_symbol_3_0= '||'
            	            {
            	            lv_symbol_3_0=(Token)match(input,56,FOLLOW_9); 

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

            	    // InternalSmartCE.g:2304:4: ( (lv_right_4_0= ruleNegation ) )
            	    // InternalSmartCE.g:2305:5: (lv_right_4_0= ruleNegation )
            	    {
            	    // InternalSmartCE.g:2305:5: (lv_right_4_0= ruleNegation )
            	    // InternalSmartCE.g:2306:6: lv_right_4_0= ruleNegation
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightNegationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_43);
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleNegation"
    // InternalSmartCE.g:2328:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalSmartCE.g:2328:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalSmartCE.g:2329:2: iv_ruleNegation= ruleNegation EOF
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
    // InternalSmartCE.g:2335:1: ruleNegation returns [EObject current=null] : (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        EObject this_Comparison_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2341:2: ( (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) ) )
            // InternalSmartCE.g:2342:2: (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) )
            {
            // InternalSmartCE.g:2342:2: (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)||LA21_0==31||LA21_0==61) ) {
                alt21=1;
            }
            else if ( (LA21_0==57) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSmartCE.g:2343:3: this_Comparison_0= ruleComparison
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
                    // InternalSmartCE.g:2352:3: ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) )
                    {
                    // InternalSmartCE.g:2352:3: ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) )
                    // InternalSmartCE.g:2353:4: () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) )
                    {
                    // InternalSmartCE.g:2353:4: ()
                    // InternalSmartCE.g:2354:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegationAccess().getUnaryOperatorAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSmartCE.g:2360:4: ( (lv_symbol_2_0= '!' ) )
                    // InternalSmartCE.g:2361:5: (lv_symbol_2_0= '!' )
                    {
                    // InternalSmartCE.g:2361:5: (lv_symbol_2_0= '!' )
                    // InternalSmartCE.g:2362:6: lv_symbol_2_0= '!'
                    {
                    lv_symbol_2_0=(Token)match(input,57,FOLLOW_44); 

                    						newLeafNode(lv_symbol_2_0, grammarAccess.getNegationAccess().getSymbolExclamationMarkKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNegationRule());
                    						}
                    						setWithLastConsumed(current, "symbol", lv_symbol_2_0, "!");
                    					

                    }


                    }

                    // InternalSmartCE.g:2374:4: ( (lv_expression_3_0= ruleComparison ) )
                    // InternalSmartCE.g:2375:5: (lv_expression_3_0= ruleComparison )
                    {
                    // InternalSmartCE.g:2375:5: (lv_expression_3_0= ruleComparison )
                    // InternalSmartCE.g:2376:6: lv_expression_3_0= ruleComparison
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
    // InternalSmartCE.g:2398:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalSmartCE.g:2398:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalSmartCE.g:2399:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalSmartCE.g:2405:1: ruleComparison returns [EObject current=null] : (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* ) ;
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
            // InternalSmartCE.g:2411:2: ( (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* ) )
            // InternalSmartCE.g:2412:2: (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* )
            {
            // InternalSmartCE.g:2412:2: (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* )
            // InternalSmartCE.g:2413:3: this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_Plus_0=rulePlus();

            state._fsp--;


            			current = this_Plus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:2421:3: ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=47 && LA23_0<=52)||(LA23_0>=58 && LA23_0<=59)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSmartCE.g:2422:4: () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) )
            	    {
            	    // InternalSmartCE.g:2422:4: ()
            	    // InternalSmartCE.g:2423:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:2429:4: ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) )
            	    int alt22=8;
            	    switch ( input.LA(1) ) {
            	    case 47:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt22=4;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt22=5;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt22=6;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt22=7;
            	        }
            	        break;
            	    case 59:
            	        {
            	        alt22=8;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // InternalSmartCE.g:2430:5: ( (lv_symbol_2_0= '<=' ) )
            	            {
            	            // InternalSmartCE.g:2430:5: ( (lv_symbol_2_0= '<=' ) )
            	            // InternalSmartCE.g:2431:6: (lv_symbol_2_0= '<=' )
            	            {
            	            // InternalSmartCE.g:2431:6: (lv_symbol_2_0= '<=' )
            	            // InternalSmartCE.g:2432:7: lv_symbol_2_0= '<='
            	            {
            	            lv_symbol_2_0=(Token)match(input,47,FOLLOW_44); 

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
            	            // InternalSmartCE.g:2445:5: ( (lv_symbol_3_0= '>=' ) )
            	            {
            	            // InternalSmartCE.g:2445:5: ( (lv_symbol_3_0= '>=' ) )
            	            // InternalSmartCE.g:2446:6: (lv_symbol_3_0= '>=' )
            	            {
            	            // InternalSmartCE.g:2446:6: (lv_symbol_3_0= '>=' )
            	            // InternalSmartCE.g:2447:7: lv_symbol_3_0= '>='
            	            {
            	            lv_symbol_3_0=(Token)match(input,48,FOLLOW_44); 

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
            	            // InternalSmartCE.g:2460:5: ( (lv_symbol_4_0= '>' ) )
            	            {
            	            // InternalSmartCE.g:2460:5: ( (lv_symbol_4_0= '>' ) )
            	            // InternalSmartCE.g:2461:6: (lv_symbol_4_0= '>' )
            	            {
            	            // InternalSmartCE.g:2461:6: (lv_symbol_4_0= '>' )
            	            // InternalSmartCE.g:2462:7: lv_symbol_4_0= '>'
            	            {
            	            lv_symbol_4_0=(Token)match(input,49,FOLLOW_44); 

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
            	            // InternalSmartCE.g:2475:5: ( (lv_symbol_5_0= '<' ) )
            	            {
            	            // InternalSmartCE.g:2475:5: ( (lv_symbol_5_0= '<' ) )
            	            // InternalSmartCE.g:2476:6: (lv_symbol_5_0= '<' )
            	            {
            	            // InternalSmartCE.g:2476:6: (lv_symbol_5_0= '<' )
            	            // InternalSmartCE.g:2477:7: lv_symbol_5_0= '<'
            	            {
            	            lv_symbol_5_0=(Token)match(input,50,FOLLOW_44); 

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
            	            // InternalSmartCE.g:2490:5: ( (lv_symbol_6_0= '!=' ) )
            	            {
            	            // InternalSmartCE.g:2490:5: ( (lv_symbol_6_0= '!=' ) )
            	            // InternalSmartCE.g:2491:6: (lv_symbol_6_0= '!=' )
            	            {
            	            // InternalSmartCE.g:2491:6: (lv_symbol_6_0= '!=' )
            	            // InternalSmartCE.g:2492:7: lv_symbol_6_0= '!='
            	            {
            	            lv_symbol_6_0=(Token)match(input,51,FOLLOW_44); 

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
            	            // InternalSmartCE.g:2505:5: ( (lv_symbol_7_0= '==' ) )
            	            {
            	            // InternalSmartCE.g:2505:5: ( (lv_symbol_7_0= '==' ) )
            	            // InternalSmartCE.g:2506:6: (lv_symbol_7_0= '==' )
            	            {
            	            // InternalSmartCE.g:2506:6: (lv_symbol_7_0= '==' )
            	            // InternalSmartCE.g:2507:7: lv_symbol_7_0= '=='
            	            {
            	            lv_symbol_7_0=(Token)match(input,52,FOLLOW_44); 

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
            	            // InternalSmartCE.g:2520:5: ( (lv_symbol_8_0= 'is' ) )
            	            {
            	            // InternalSmartCE.g:2520:5: ( (lv_symbol_8_0= 'is' ) )
            	            // InternalSmartCE.g:2521:6: (lv_symbol_8_0= 'is' )
            	            {
            	            // InternalSmartCE.g:2521:6: (lv_symbol_8_0= 'is' )
            	            // InternalSmartCE.g:2522:7: lv_symbol_8_0= 'is'
            	            {
            	            lv_symbol_8_0=(Token)match(input,58,FOLLOW_44); 

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
            	            // InternalSmartCE.g:2535:5: ( (lv_symbol_9_0= 'as' ) )
            	            {
            	            // InternalSmartCE.g:2535:5: ( (lv_symbol_9_0= 'as' ) )
            	            // InternalSmartCE.g:2536:6: (lv_symbol_9_0= 'as' )
            	            {
            	            // InternalSmartCE.g:2536:6: (lv_symbol_9_0= 'as' )
            	            // InternalSmartCE.g:2537:7: lv_symbol_9_0= 'as'
            	            {
            	            lv_symbol_9_0=(Token)match(input,59,FOLLOW_44); 

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

            	    // InternalSmartCE.g:2550:4: ( (lv_right_10_0= rulePlus ) )
            	    // InternalSmartCE.g:2551:5: (lv_right_10_0= rulePlus )
            	    {
            	    // InternalSmartCE.g:2551:5: (lv_right_10_0= rulePlus )
            	    // InternalSmartCE.g:2552:6: lv_right_10_0= rulePlus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_45);
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
            	    break loop23;
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
    // InternalSmartCE.g:2574:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalSmartCE.g:2574:45: (iv_rulePlus= rulePlus EOF )
            // InternalSmartCE.g:2575:2: iv_rulePlus= rulePlus EOF
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
    // InternalSmartCE.g:2581:1: rulePlus returns [EObject current=null] : (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2587:2: ( (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* ) )
            // InternalSmartCE.g:2588:2: (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* )
            {
            // InternalSmartCE.g:2588:2: (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* )
            // InternalSmartCE.g:2589:3: this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:2597:3: ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=60 && LA25_0<=61)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSmartCE.g:2598:4: () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) )
            	    {
            	    // InternalSmartCE.g:2598:4: ()
            	    // InternalSmartCE.g:2599:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPlusAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:2605:4: (otherlv_2= '+' | otherlv_3= '-' )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==60) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==61) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalSmartCE.g:2606:5: otherlv_2= '+'
            	            {
            	            otherlv_2=(Token)match(input,60,FOLLOW_44); 

            	            					newLeafNode(otherlv_2, grammarAccess.getPlusAccess().getPlusSignKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSmartCE.g:2611:5: otherlv_3= '-'
            	            {
            	            otherlv_3=(Token)match(input,61,FOLLOW_44); 

            	            					newLeafNode(otherlv_3, grammarAccess.getPlusAccess().getHyphenMinusKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSmartCE.g:2616:4: ( (lv_right_4_0= ruleFactor ) )
            	    // InternalSmartCE.g:2617:5: (lv_right_4_0= ruleFactor )
            	    {
            	    // InternalSmartCE.g:2617:5: (lv_right_4_0= ruleFactor )
            	    // InternalSmartCE.g:2618:6: lv_right_4_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getPlusAccess().getRightFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_46);
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
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleFactor"
    // InternalSmartCE.g:2640:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalSmartCE.g:2640:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalSmartCE.g:2641:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalSmartCE.g:2647:1: ruleFactor returns [EObject current=null] : (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Negative_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2653:2: ( (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* ) )
            // InternalSmartCE.g:2654:2: (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* )
            {
            // InternalSmartCE.g:2654:2: (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* )
            // InternalSmartCE.g:2655:3: this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getNegativeParserRuleCall_0());
            		
            pushFollow(FOLLOW_47);
            this_Negative_0=ruleNegative();

            state._fsp--;


            			current = this_Negative_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:2663:3: ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=62 && LA27_0<=63)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSmartCE.g:2664:4: () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) )
            	    {
            	    // InternalSmartCE.g:2664:4: ()
            	    // InternalSmartCE.g:2665:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFactorAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:2671:4: (otherlv_2= '*' | otherlv_3= '/' )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==62) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==63) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalSmartCE.g:2672:5: otherlv_2= '*'
            	            {
            	            otherlv_2=(Token)match(input,62,FOLLOW_44); 

            	            					newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSmartCE.g:2677:5: otherlv_3= '/'
            	            {
            	            otherlv_3=(Token)match(input,63,FOLLOW_44); 

            	            					newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSmartCE.g:2682:4: ( (lv_right_4_0= ruleNegative ) )
            	    // InternalSmartCE.g:2683:5: (lv_right_4_0= ruleNegative )
            	    {
            	    // InternalSmartCE.g:2683:5: (lv_right_4_0= ruleNegative )
            	    // InternalSmartCE.g:2684:6: lv_right_4_0= ruleNegative
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightNegativeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_47);
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleNegative"
    // InternalSmartCE.g:2706:1: entryRuleNegative returns [EObject current=null] : iv_ruleNegative= ruleNegative EOF ;
    public final EObject entryRuleNegative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegative = null;


        try {
            // InternalSmartCE.g:2706:49: (iv_ruleNegative= ruleNegative EOF )
            // InternalSmartCE.g:2707:2: iv_ruleNegative= ruleNegative EOF
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
    // InternalSmartCE.g:2713:1: ruleNegative returns [EObject current=null] : (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) ) ;
    public final EObject ruleNegative() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2719:2: ( (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) ) )
            // InternalSmartCE.g:2720:2: (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) )
            {
            // InternalSmartCE.g:2720:2: (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||LA28_0==31) ) {
                alt28=1;
            }
            else if ( (LA28_0==61) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalSmartCE.g:2721:3: this_Primary_0= rulePrimary
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
                    // InternalSmartCE.g:2730:3: ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) )
                    {
                    // InternalSmartCE.g:2730:3: ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) )
                    // InternalSmartCE.g:2731:4: () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) )
                    {
                    // InternalSmartCE.g:2731:4: ()
                    // InternalSmartCE.g:2732:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegativeAccess().getUnaryOperatorAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,61,FOLLOW_48); 

                    				newLeafNode(otherlv_2, grammarAccess.getNegativeAccess().getHyphenMinusKeyword_1_1());
                    			
                    // InternalSmartCE.g:2742:4: ( (lv_expression_3_0= rulePrimary ) )
                    // InternalSmartCE.g:2743:5: (lv_expression_3_0= rulePrimary )
                    {
                    // InternalSmartCE.g:2743:5: (lv_expression_3_0= rulePrimary )
                    // InternalSmartCE.g:2744:6: lv_expression_3_0= rulePrimary
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
    // InternalSmartCE.g:2766:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSmartCE.g:2766:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSmartCE.g:2767:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalSmartCE.g:2773:1: rulePrimary returns [EObject current=null] : (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_LiteralValue_0 = null;

        EObject this_Expression_2 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2779:2: ( (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) )
            // InternalSmartCE.g:2780:2: (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            {
            // InternalSmartCE.g:2780:2: (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_STRING)) ) {
                alt29=1;
            }
            else if ( (LA29_0==31) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalSmartCE.g:2781:3: this_LiteralValue_0= ruleLiteralValue
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
                    // InternalSmartCE.g:2790:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalSmartCE.g:2790:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalSmartCE.g:2791:4: otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_32);
                    this_Expression_2=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,33,FOLLOW_2); 

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
    // InternalSmartCE.g:2812:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // InternalSmartCE.g:2812:53: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // InternalSmartCE.g:2813:2: iv_ruleLiteralValue= ruleLiteralValue EOF
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
    // InternalSmartCE.g:2819:1: ruleLiteralValue returns [EObject current=null] : (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject this_NumericValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_VariableValue_2 = null;

        EObject this_FunctionCall_3 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2825:2: ( (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall ) )
            // InternalSmartCE.g:2826:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )
            {
            // InternalSmartCE.g:2826:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )
            int alt30=4;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalSmartCE.g:2827:3: this_NumericValue_0= ruleNumericValue
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
                    // InternalSmartCE.g:2836:3: this_StringValue_1= ruleStringValue
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
                    // InternalSmartCE.g:2845:3: this_VariableValue_2= ruleVariableValue
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
                    // InternalSmartCE.g:2854:3: this_FunctionCall_3= ruleFunctionCall
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
    // InternalSmartCE.g:2866:1: entryRuleNumericValue returns [EObject current=null] : iv_ruleNumericValue= ruleNumericValue EOF ;
    public final EObject entryRuleNumericValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericValue = null;


        try {
            // InternalSmartCE.g:2866:53: (iv_ruleNumericValue= ruleNumericValue EOF )
            // InternalSmartCE.g:2867:2: iv_ruleNumericValue= ruleNumericValue EOF
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
    // InternalSmartCE.g:2873:1: ruleNumericValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumericValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2879:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalSmartCE.g:2880:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalSmartCE.g:2880:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalSmartCE.g:2881:3: (lv_value_0_0= RULE_INT )
            {
            // InternalSmartCE.g:2881:3: (lv_value_0_0= RULE_INT )
            // InternalSmartCE.g:2882:4: lv_value_0_0= RULE_INT
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
    // InternalSmartCE.g:2901:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalSmartCE.g:2901:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalSmartCE.g:2902:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalSmartCE.g:2908:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2914:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSmartCE.g:2915:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSmartCE.g:2915:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSmartCE.g:2916:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalSmartCE.g:2916:3: (lv_value_0_0= RULE_STRING )
            // InternalSmartCE.g:2917:4: lv_value_0_0= RULE_STRING
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
    // InternalSmartCE.g:2936:1: entryRuleVariableValue returns [EObject current=null] : iv_ruleVariableValue= ruleVariableValue EOF ;
    public final EObject entryRuleVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableValue = null;


        try {
            // InternalSmartCE.g:2936:54: (iv_ruleVariableValue= ruleVariableValue EOF )
            // InternalSmartCE.g:2937:2: iv_ruleVariableValue= ruleVariableValue EOF
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
    // InternalSmartCE.g:2943:1: ruleVariableValue returns [EObject current=null] : ( (lv_value_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleVariableValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2949:2: ( ( (lv_value_0_0= ruleQualifiedName ) ) )
            // InternalSmartCE.g:2950:2: ( (lv_value_0_0= ruleQualifiedName ) )
            {
            // InternalSmartCE.g:2950:2: ( (lv_value_0_0= ruleQualifiedName ) )
            // InternalSmartCE.g:2951:3: (lv_value_0_0= ruleQualifiedName )
            {
            // InternalSmartCE.g:2951:3: (lv_value_0_0= ruleQualifiedName )
            // InternalSmartCE.g:2952:4: lv_value_0_0= ruleQualifiedName
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
    // InternalSmartCE.g:2972:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalSmartCE.g:2972:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalSmartCE.g:2973:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalSmartCE.g:2979:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' ) ;
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
            // InternalSmartCE.g:2985:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' ) )
            // InternalSmartCE.g:2986:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            {
            // InternalSmartCE.g:2986:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            // InternalSmartCE.g:2987:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')'
            {
            // InternalSmartCE.g:2987:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalSmartCE.g:2988:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalSmartCE.g:2988:4: (lv_name_0_0= ruleQualifiedName )
            // InternalSmartCE.g:2989:5: lv_name_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getNameQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_1=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:3010:3: ( (lv_params_2_0= ruleExpression ) )
            // InternalSmartCE.g:3011:4: (lv_params_2_0= ruleExpression )
            {
            // InternalSmartCE.g:3011:4: (lv_params_2_0= ruleExpression )
            // InternalSmartCE.g:3012:5: lv_params_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getParamsExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_49);
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

            // InternalSmartCE.g:3029:3: (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==64) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSmartCE.g:3030:4: otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,64,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSmartCE.g:3034:4: ( (lv_params_4_0= ruleExpression ) )
            	    // InternalSmartCE.g:3035:5: (lv_params_4_0= ruleExpression )
            	    {
            	    // InternalSmartCE.g:3035:5: (lv_params_4_0= ruleExpression )
            	    // InternalSmartCE.g:3036:6: lv_params_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionCallAccess().getParamsExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_49);
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
            	    break loop31;
                }
            } while (true);

            otherlv_5=(Token)match(input,33,FOLLOW_2); 

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
    // InternalSmartCE.g:3062:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSmartCE.g:3062:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSmartCE.g:3063:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalSmartCE.g:3069:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3075:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSmartCE.g:3076:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSmartCE.g:3076:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSmartCE.g:3077:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_50); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSmartCE.g:3084:3: (kw= '.' this_ID_2= RULE_ID )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==65) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSmartCE.g:3085:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,65,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_50); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalSmartCE.g:3102:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalSmartCE.g:3102:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalSmartCE.g:3103:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalSmartCE.g:3109:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:3115:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.*' ) )
            // InternalSmartCE.g:3116:2: (this_QualifiedName_0= ruleQualifiedName kw= '.*' )
            {
            // InternalSmartCE.g:3116:2: (this_QualifiedName_0= ruleQualifiedName kw= '.*' )
            // InternalSmartCE.g:3117:3: this_QualifiedName_0= ruleQualifiedName kw= '.*'
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_51);
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
    // InternalSmartCE.g:3136:1: entryRuleYEAR returns [String current=null] : iv_ruleYEAR= ruleYEAR EOF ;
    public final String entryRuleYEAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleYEAR = null;


        try {
            // InternalSmartCE.g:3136:44: (iv_ruleYEAR= ruleYEAR EOF )
            // InternalSmartCE.g:3137:2: iv_ruleYEAR= ruleYEAR EOF
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
    // InternalSmartCE.g:3143:1: ruleYEAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleYEAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3149:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3150:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:3160:1: entryRuleMONTH returns [String current=null] : iv_ruleMONTH= ruleMONTH EOF ;
    public final String entryRuleMONTH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMONTH = null;


        try {
            // InternalSmartCE.g:3160:45: (iv_ruleMONTH= ruleMONTH EOF )
            // InternalSmartCE.g:3161:2: iv_ruleMONTH= ruleMONTH EOF
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
    // InternalSmartCE.g:3167:1: ruleMONTH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleMONTH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3173:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3174:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:3184:1: entryRuleDAY returns [String current=null] : iv_ruleDAY= ruleDAY EOF ;
    public final String entryRuleDAY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDAY = null;


        try {
            // InternalSmartCE.g:3184:43: (iv_ruleDAY= ruleDAY EOF )
            // InternalSmartCE.g:3185:2: iv_ruleDAY= ruleDAY EOF
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
    // InternalSmartCE.g:3191:1: ruleDAY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleDAY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3197:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3198:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:3208:1: entryRuleHOUR returns [String current=null] : iv_ruleHOUR= ruleHOUR EOF ;
    public final String entryRuleHOUR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHOUR = null;


        try {
            // InternalSmartCE.g:3208:44: (iv_ruleHOUR= ruleHOUR EOF )
            // InternalSmartCE.g:3209:2: iv_ruleHOUR= ruleHOUR EOF
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
    // InternalSmartCE.g:3215:1: ruleHOUR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleHOUR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3221:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3222:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:3232:1: entryRuleMIN returns [String current=null] : iv_ruleMIN= ruleMIN EOF ;
    public final String entryRuleMIN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMIN = null;


        try {
            // InternalSmartCE.g:3232:43: (iv_ruleMIN= ruleMIN EOF )
            // InternalSmartCE.g:3233:2: iv_ruleMIN= ruleMIN EOF
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
    // InternalSmartCE.g:3239:1: ruleMIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleMIN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3245:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3246:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:3256:1: entryRuleSEC returns [String current=null] : iv_ruleSEC= ruleSEC EOF ;
    public final String entryRuleSEC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSEC = null;


        try {
            // InternalSmartCE.g:3256:43: (iv_ruleSEC= ruleSEC EOF )
            // InternalSmartCE.g:3257:2: iv_ruleSEC= ruleSEC EOF
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
    // InternalSmartCE.g:3263:1: ruleSEC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleSEC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3269:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3270:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:3280:1: ruleOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) ) ;
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
            // InternalSmartCE.g:3286:2: ( ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) ) )
            // InternalSmartCE.g:3287:2: ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) )
            {
            // InternalSmartCE.g:3287:2: ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) )
            int alt33=6;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt33=1;
                }
                break;
            case 68:
                {
                alt33=2;
                }
                break;
            case 69:
                {
                alt33=3;
                }
                break;
            case 70:
                {
                alt33=4;
                }
                break;
            case 71:
                {
                alt33=5;
                }
                break;
            case 72:
                {
                alt33=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalSmartCE.g:3288:3: (enumLiteral_0= 'push' )
                    {
                    // InternalSmartCE.g:3288:3: (enumLiteral_0= 'push' )
                    // InternalSmartCE.g:3289:4: enumLiteral_0= 'push'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getPUSHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationAccess().getPUSHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:3296:3: (enumLiteral_1= 'poll' )
                    {
                    // InternalSmartCE.g:3296:3: (enumLiteral_1= 'poll' )
                    // InternalSmartCE.g:3297:4: enumLiteral_1= 'poll'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getPOLLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationAccess().getPOLLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:3304:3: (enumLiteral_2= 'write' )
                    {
                    // InternalSmartCE.g:3304:3: (enumLiteral_2= 'write' )
                    // InternalSmartCE.g:3305:4: enumLiteral_2= 'write'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getWRITEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperationAccess().getWRITEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:3312:3: (enumLiteral_3= 'read' )
                    {
                    // InternalSmartCE.g:3312:3: (enumLiteral_3= 'read' )
                    // InternalSmartCE.g:3313:4: enumLiteral_3= 'read'
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getREADEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperationAccess().getREADEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCE.g:3320:3: (enumLiteral_4= 'request' )
                    {
                    // InternalSmartCE.g:3320:3: (enumLiteral_4= 'request' )
                    // InternalSmartCE.g:3321:4: enumLiteral_4= 'request'
                    {
                    enumLiteral_4=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getREQUESTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperationAccess().getREQUESTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCE.g:3328:3: (enumLiteral_5= 'response' )
                    {
                    // InternalSmartCE.g:3328:3: (enumLiteral_5= 'response' )
                    // InternalSmartCE.g:3329:4: enumLiteral_5= 'response'
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
    // InternalSmartCE.g:3339:1: ruleWeekDay returns [Enumerator current=null] : ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) ) ;
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
            // InternalSmartCE.g:3345:2: ( ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) ) )
            // InternalSmartCE.g:3346:2: ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) )
            {
            // InternalSmartCE.g:3346:2: ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) )
            int alt34=7;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt34=1;
                }
                break;
            case 74:
                {
                alt34=2;
                }
                break;
            case 75:
                {
                alt34=3;
                }
                break;
            case 76:
                {
                alt34=4;
                }
                break;
            case 77:
                {
                alt34=5;
                }
                break;
            case 78:
                {
                alt34=6;
                }
                break;
            case 79:
                {
                alt34=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalSmartCE.g:3347:3: (enumLiteral_0= 'Sunday' )
                    {
                    // InternalSmartCE.g:3347:3: (enumLiteral_0= 'Sunday' )
                    // InternalSmartCE.g:3348:4: enumLiteral_0= 'Sunday'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getSUNDAYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWeekDayAccess().getSUNDAYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:3355:3: (enumLiteral_1= 'Monday' )
                    {
                    // InternalSmartCE.g:3355:3: (enumLiteral_1= 'Monday' )
                    // InternalSmartCE.g:3356:4: enumLiteral_1= 'Monday'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getMONDAYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWeekDayAccess().getMONDAYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:3363:3: (enumLiteral_2= 'Tuesday' )
                    {
                    // InternalSmartCE.g:3363:3: (enumLiteral_2= 'Tuesday' )
                    // InternalSmartCE.g:3364:4: enumLiteral_2= 'Tuesday'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTUESDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWeekDayAccess().getTUESDAYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:3371:3: (enumLiteral_3= 'Wednesday' )
                    {
                    // InternalSmartCE.g:3371:3: (enumLiteral_3= 'Wednesday' )
                    // InternalSmartCE.g:3372:4: enumLiteral_3= 'Wednesday'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getWEDNESDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWeekDayAccess().getWEDNESDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCE.g:3379:3: (enumLiteral_4= 'Thursday' )
                    {
                    // InternalSmartCE.g:3379:3: (enumLiteral_4= 'Thursday' )
                    // InternalSmartCE.g:3380:4: enumLiteral_4= 'Thursday'
                    {
                    enumLiteral_4=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTHURSDAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWeekDayAccess().getTHURSDAYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCE.g:3387:3: (enumLiteral_5= 'Friday' )
                    {
                    // InternalSmartCE.g:3387:3: (enumLiteral_5= 'Friday' )
                    // InternalSmartCE.g:3388:4: enumLiteral_5= 'Friday'
                    {
                    enumLiteral_5=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getFRIDAYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWeekDayAccess().getFRIDAYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSmartCE.g:3395:3: (enumLiteral_6= 'Saturday' )
                    {
                    // InternalSmartCE.g:3395:3: (enumLiteral_6= 'Saturday' )
                    // InternalSmartCE.g:3396:4: enumLiteral_6= 'Saturday'
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
    // InternalSmartCE.g:3406:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) ) ;
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
            // InternalSmartCE.g:3412:2: ( ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) ) )
            // InternalSmartCE.g:3413:2: ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) )
            {
            // InternalSmartCE.g:3413:2: ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) )
            int alt35=7;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt35=1;
                }
                break;
            case 81:
                {
                alt35=2;
                }
                break;
            case 82:
                {
                alt35=3;
                }
                break;
            case 83:
                {
                alt35=4;
                }
                break;
            case 84:
                {
                alt35=5;
                }
                break;
            case 85:
                {
                alt35=6;
                }
                break;
            case 86:
                {
                alt35=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalSmartCE.g:3414:3: (enumLiteral_0= 'Second' )
                    {
                    // InternalSmartCE.g:3414:3: (enumLiteral_0= 'Second' )
                    // InternalSmartCE.g:3415:4: enumLiteral_0= 'Second'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getSECONDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSECONDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:3422:3: (enumLiteral_1= 'Minute' )
                    {
                    // InternalSmartCE.g:3422:3: (enumLiteral_1= 'Minute' )
                    // InternalSmartCE.g:3423:4: enumLiteral_1= 'Minute'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:3430:3: (enumLiteral_2= 'Hour' )
                    {
                    // InternalSmartCE.g:3430:3: (enumLiteral_2= 'Hour' )
                    // InternalSmartCE.g:3431:4: enumLiteral_2= 'Hour'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:3438:3: (enumLiteral_3= 'Day' )
                    {
                    // InternalSmartCE.g:3438:3: (enumLiteral_3= 'Day' )
                    // InternalSmartCE.g:3439:4: enumLiteral_3= 'Day'
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCE.g:3446:3: (enumLiteral_4= 'Week' )
                    {
                    // InternalSmartCE.g:3446:3: (enumLiteral_4= 'Week' )
                    // InternalSmartCE.g:3447:4: enumLiteral_4= 'Week'
                    {
                    enumLiteral_4=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCE.g:3454:3: (enumLiteral_5= 'Month' )
                    {
                    // InternalSmartCE.g:3454:3: (enumLiteral_5= 'Month' )
                    // InternalSmartCE.g:3455:4: enumLiteral_5= 'Month'
                    {
                    enumLiteral_5=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMONTHEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTimeUnitAccess().getMONTHEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSmartCE.g:3462:3: (enumLiteral_6= 'Year' )
                    {
                    // InternalSmartCE.g:3462:3: (enumLiteral_6= 'Year' )
                    // InternalSmartCE.g:3463:4: enumLiteral_6= 'Year'
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


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String dfa_1s = "\u0118\uffff";
    static final String dfa_2s = "\31\uffff\1\57\3\uffff\1\57\16\uffff\3\122\32\uffff\1\57\11\uffff\3\57\1\uffff\1\57\1\uffff\1\57\34\uffff\1\57\1\uffff\1\122\11\uffff\1\122\10\uffff\1\57\34\uffff\1\122\7\uffff\3\122\1\uffff\1\122\1\uffff\1\122\34\uffff\1\122\1\uffff\1\122\12\uffff\1\122\7\uffff\1\122\31\uffff\1\122\1\uffff\4\122\1\uffff\1\122\13\uffff\1\122\1\uffff\1\122";
    static final String dfa_3s = "\1\46\6\37\2\5\1\111\2\6\1\5\1\41\1\50\10\52\1\41\1\120\1\24\1\120\1\111\1\6\1\24\6\4\1\120\7\41\3\24\1\uffff\31\41\1\24\1\6\6\37\2\uffff\3\24\1\120\1\24\1\4\1\24\1\52\2\5\1\111\2\6\1\5\10\41\1\6\1\41\1\50\10\52\1\41\1\120\1\24\1\41\1\24\1\120\1\111\1\6\6\4\1\24\1\120\7\41\1\24\3\46\31\41\1\24\1\6\6\37\3\24\1\120\1\24\1\4\1\24\1\52\2\5\1\111\2\6\1\5\10\41\1\6\1\41\1\50\10\52\1\41\1\120\1\24\1\41\1\24\1\120\1\111\1\6\1\120\6\4\1\24\7\41\1\24\31\41\1\24\1\6\4\24\1\120\1\24\1\4\1\52\10\41\1\6\1\24\1\41\1\24";
    static final String dfa_4s = "\1\56\6\37\2\5\1\117\2\6\1\5\1\41\1\50\10\52\1\64\1\126\1\45\1\126\1\117\1\6\1\45\6\6\1\126\7\55\3\56\1\uffff\17\41\1\50\1\101\1\50\7\41\1\45\1\6\6\37\2\uffff\3\45\1\126\1\45\1\4\1\45\1\52\2\5\1\117\2\6\1\5\7\41\1\101\1\6\1\41\1\50\10\52\1\64\1\126\1\45\1\41\1\56\1\126\1\117\7\6\1\56\1\126\7\55\1\45\3\56\17\41\1\50\1\101\1\50\7\41\1\56\1\6\6\37\3\56\1\126\1\56\1\4\1\56\1\52\2\5\1\117\2\6\1\5\7\41\1\101\1\6\1\41\1\50\10\52\1\64\1\126\1\56\1\41\1\56\1\126\1\117\1\6\1\126\6\6\1\56\7\55\1\56\26\41\1\50\1\101\1\50\1\56\1\6\4\56\1\126\1\56\1\4\1\52\7\41\1\101\1\6\1\56\1\41\1\56";
    static final String dfa_5s = "\57\uffff\1\1\41\uffff\1\3\1\2\u00c5\uffff";
    static final String dfa_6s = "\u0118\uffff}>";
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
            "\1\35\6\uffff\1\44\6\uffff\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53",
            "\1\57\16\uffff\1\54\1\55\1\56",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66",
            "\1\67\1\70\1\71\1\72\1\73\1\74\1\75",
            "\1\76",
            "\1\57\16\uffff\1\54\1\55\1\56",
            "\1\100\1\101\1\77",
            "\1\100\1\101\1\77",
            "\1\100\1\101\1\77",
            "\1\100\1\101\1\77",
            "\1\100\1\101\1\77",
            "\1\100\1\101\1\77",
            "\1\102\1\103\1\104\1\105\1\106\1\107\1\110",
            "\1\111\13\uffff\1\112",
            "\1\111\13\uffff\1\112",
            "\1\111\13\uffff\1\112",
            "\1\111\13\uffff\1\112",
            "\1\111\13\uffff\1\112",
            "\1\111\13\uffff\1\112",
            "\1\111\13\uffff\1\112",
            "\1\122\11\uffff\1\121\7\uffff\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\122\11\uffff\1\121\7\uffff\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\122\11\uffff\1\121\7\uffff\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
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
            "\1\127\6\uffff\1\126\30\uffff\1\130",
            "\1\127\6\uffff\1\126",
            "\1\131",
            "\1\131",
            "\1\131",
            "\1\131",
            "\1\131",
            "\1\131",
            "\1\131",
            "\1\57\16\uffff\1\54\1\55\1\56",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "",
            "\1\57\16\uffff\1\54\1\55\1\56",
            "\1\57\16\uffff\1\54\1\55\1\56",
            "\1\57\16\uffff\1\54\1\55\1\56",
            "\1\141\1\142\1\143\1\144\1\145\1\146\1\147",
            "\1\57\16\uffff\1\54\1\55\1\56",
            "\1\150",
            "\1\57\16\uffff\1\54\1\55\1\56",
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
            "\1\127\6\uffff\1\126\30\uffff\1\130",
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
            "\1\u0082\6\uffff\1\u0083\6\uffff\1\174\1\175\1\176\1\177\1\u0080\1\u0081",
            "\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a",
            "\1\57\16\uffff\1\54\1\55\1\56",
            "\1\u008b",
            "\1\122\11\uffff\1\121\4\uffff\1\u008c\1\u008d\1\u008e\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095",
            "\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c",
            "\1\u009d",
            "\1\u009f\1\u00a0\1\u009e",
            "\1\u009f\1\u00a0\1\u009e",
            "\1\u009f\1\u00a0\1\u009e",
            "\1\u009f\1\u00a0\1\u009e",
            "\1\u009f\1\u00a0\1\u009e",
            "\1\u009f\1\u00a0\1\u009e",
            "\1\122\11\uffff\1\121\4\uffff\1\u008c\1\u008d\1\u008e\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7",
            "\1\u00a8\13\uffff\1\u00a9",
            "\1\u00a8\13\uffff\1\u00a9",
            "\1\u00a8\13\uffff\1\u00a9",
            "\1\u00a8\13\uffff\1\u00a9",
            "\1\u00a8\13\uffff\1\u00a9",
            "\1\u00a8\13\uffff\1\u00a9",
            "\1\u00a8\13\uffff\1\u00a9",
            "\1\57\16\uffff\1\54\1\55\1\56",
            "\1\u00aa\1\u00ab\1\uffff\1\u00ac\1\uffff\1\u00ad\1\u00af\1\uffff\1\u00ae",
            "\1\u00aa\1\u00ab\1\uffff\1\u00ac\1\uffff\1\u00ad\1\u00af\1\uffff\1\u00ae",
            "\1\u00aa\1\u00ab\1\uffff\1\u00ac\1\uffff\1\u00ad\1\u00af\1\uffff\1\u00ae",
            "\1\u00b0",
            "\1\u00b0",
            "\1\u00b0",
            "\1\u00b0",
            "\1\u00b0",
            "\1\u00b0",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b1",
            "\1\u00b1",
            "\1\u00b1",
            "\1\u00b1",
            "\1\u00b1",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b4\6\uffff\1\u00b3",
            "\1\u00b4\6\uffff\1\u00b3\30\uffff\1\u00b5",
            "\1\u00b4\6\uffff\1\u00b3",
            "\1\u00b6",
            "\1\u00b6",
            "\1\u00b6",
            "\1\u00b6",
            "\1\u00b6",
            "\1\u00b6",
            "\1\u00b6",
            "\1\122\11\uffff\1\121\4\uffff\1\u008c\1\u008d\1\u008e\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\122\11\uffff\1\121\4\uffff\1\u008c\1\u008d\1\u008e\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\122\11\uffff\1\121\4\uffff\1\u008c\1\u008d\1\u008e\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\122\11\uffff\1\121\4\uffff\1\u008c\1\u008d\1\u008e\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3\1\u00c4",
            "\1\122\11\uffff\1\121\4\uffff\1\u008c\1\u008d\1\u008e\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\u00c5",
            "\1\122\11\uffff\1\121\4\uffff\1\u008c\1\u008d\1\u008e\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d3",
            "\1\u00d3",
            "\1\u00d3",
            "\1\u00d3",
            "\1\u00d3",
            "\1\u00d3",
            "\1\u00b4\6\uffff\1\u00b3\30\uffff\1\u00b5",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d7",
            "\1\u00d7",
            "\1\u00d7",
            "\1\u00d7",
            "\1\u00d7",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00e0\6\uffff\1\u00d9\6\uffff\1\u00da\1\u00db\1\u00dc\1\u00dd\1\u00de\1\u00df",
            "\1\u00e1\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\u00e6\1\u00e7",
            "\1\122\11\uffff\1\121\4\uffff\1\u008c\1\u008d\1\u008e\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\u00e8",
            "\1\122\11\uffff\1\121\4\uffff\1\u008c\1\u008d\1\u008e\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\u00e9\1\u00ea\1\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef",
            "\1\u00f0\1\u00f1\1\u00f2\1\u00f3\1\u00f4\1\u00f5\1\u00f6",
            "\1\u00f7",
            "\1\u00f8\1\u00f9\1\u00fa\1\u00fb\1\u00fc\1\u00fd\1\u00fe",
            "\1\u0100\1\u0101\1\u00ff",
            "\1\u0100\1\u0101\1\u00ff",
            "\1\u0100\1\u0101\1\u00ff",
            "\1\u0100\1\u0101\1\u00ff",
            "\1\u0100\1\u0101\1\u00ff",
            "\1\u0100\1\u0101\1\u00ff",
            "\1\122\11\uffff\1\121\4\uffff\1\u008c\1\u008d\1\u008e\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\u0102\13\uffff\1\u0103",
            "\1\u0102\13\uffff\1\u0103",
            "\1\u0102\13\uffff\1\u0103",
            "\1\u0102\13\uffff\1\u0103",
            "\1\u0102\13\uffff\1\u0103",
            "\1\u0102\13\uffff\1\u0103",
            "\1\u0102\13\uffff\1\u0103",
            "\1\122\11\uffff\1\121\4\uffff\1\u008c\1\u008d\1\u008e\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\u0104",
            "\1\u0104",
            "\1\u0104",
            "\1\u0104",
            "\1\u0104",
            "\1\u0104",
            "\1\u0104",
            "\1\u0105",
            "\1\u0105",
            "\1\u0105",
            "\1\u0105",
            "\1\u0105",
            "\1\u0105",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0107",
            "\1\u0107",
            "\1\u0107",
            "\1\u0107",
            "\1\u0107",
            "\1\u0107",
            "\1\u0109\6\uffff\1\u0108",
            "\1\u0109\6\uffff\1\u0108\30\uffff\1\u010a",
            "\1\u0109\6\uffff\1\u0108",
            "\1\122\11\uffff\1\121\4\uffff\1\u008c\1\u008d\1\u008e\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\u010b",
            "\1\122\11\uffff\1\121\4\uffff\1\u008c\1\u008d\1\u008e\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\122\11\uffff\1\121\4\uffff\1\u008c\1\u008d\1\u008e\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\122\11\uffff\1\121\4\uffff\1\u008c\1\u008d\1\u008e\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\122\11\uffff\1\121\4\uffff\1\u008c\1\u008d\1\u008e\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112",
            "\1\122\11\uffff\1\121\4\uffff\1\u008c\1\u008d\1\u008e\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0115",
            "\1\u0115",
            "\1\u0115",
            "\1\u0115",
            "\1\u0115",
            "\1\u0115",
            "\1\u0109\6\uffff\1\u0108\30\uffff\1\u010a",
            "\1\u0116",
            "\1\122\11\uffff\1\121\4\uffff\1\u008c\1\u008d\1\u008e\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117",
            "\1\u0117",
            "\1\122\11\uffff\1\121\4\uffff\1\u008c\1\u008d\1\u008e\1\113\1\114\1\uffff\1\115\1\uffff\1\116\1\120\1\uffff\1\117"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "652:2: (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition | this_ConditionalExpression_2= ruleConditionalExpression )";
        }
    }
    static final String dfa_8s = "\15\uffff";
    static final String dfa_9s = "\1\54\1\37\1\5\1\120\7\41\2\uffff";
    static final String dfa_10s = "\1\54\1\37\1\5\1\126\7\55\2\uffff";
    static final String dfa_11s = "\13\uffff\1\2\1\1";
    static final String dfa_12s = "\15\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\13\13\uffff\1\14",
            "\1\13\13\uffff\1\14",
            "\1\13\13\uffff\1\14",
            "\1\13\13\uffff\1\14",
            "\1\13\13\uffff\1\14",
            "\1\13\13\uffff\1\14",
            "\1\13\13\uffff\1\14",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1292:2: ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'from' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'to' ( (lv_end_7_0= RULE_STRING ) ) otherlv_8= ')' ) | (otherlv_9= 'SessionInterval' otherlv_10= '(' ( (lv_frequency_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) otherlv_13= ')' ) )";
        }
    }
    static final String dfa_14s = "\23\uffff";
    static final String dfa_15s = "\1\56\1\37\1\6\1\41\1\uffff\6\4\1\uffff\3\41\2\uffff\1\4\1\41";
    static final String dfa_16s = "\1\56\1\37\1\6\1\64\1\uffff\6\6\1\uffff\1\50\1\101\1\50\2\uffff\1\4\1\101";
    static final String dfa_17s = "\4\uffff\1\1\6\uffff\1\2\3\uffff\1\3\1\4\2\uffff";
    static final String dfa_18s = "\23\uffff}>";
    static final String[] dfa_19s = {
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
            "\1\17\6\uffff\1\20",
            "\1\17\6\uffff\1\20\30\uffff\1\21",
            "\1\17\6\uffff\1\20",
            "",
            "",
            "\1\22",
            "\1\17\6\uffff\1\20\30\uffff\1\21"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1458:2: ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' ) | (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' ) )";
        }
    }
    static final String dfa_20s = "\10\uffff";
    static final String dfa_21s = "\3\uffff\1\6\3\uffff\1\6";
    static final String dfa_22s = "\1\4\2\uffff\2\4\2\uffff\1\4";
    static final String dfa_23s = "\1\6\2\uffff\1\101\1\4\2\uffff\1\101";
    static final String dfa_24s = "\1\uffff\1\1\1\2\2\uffff\1\4\1\3\1\uffff";
    static final String dfa_25s = "\10\uffff}>";
    static final String[] dfa_26s = {
            "\1\3\1\1\1\2",
            "",
            "",
            "\1\6\13\uffff\2\6\2\uffff\1\6\12\uffff\1\5\1\uffff\1\6\15\uffff\6\6\2\uffff\2\6\1\uffff\7\6\1\4",
            "\1\7",
            "",
            "",
            "\1\6\13\uffff\2\6\2\uffff\1\6\12\uffff\1\5\1\uffff\1\6\15\uffff\6\6\2\uffff\2\6\1\uffff\7\6\1\4"
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2826:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )";
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x2200000080000070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001F8L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00005AC000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00005AC000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00005AF800000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x00000000007F0000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FE00L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x001F800000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x2000000080000070L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0C1F800000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000080000070L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});

}