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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'Contract'", "'{'", "'beginDate'", "'='", "'dueDate'", "'application'", "'process'", "'}'", "'variables'", "'Right'", "'Prohibition'", "'Obligation'", "'description'", "'rolePlayer'", "'operation'", "'condition'", "'onBreach'", "'onSuccess'", "':'", "'when'", "'('", "')'", "'do'", "'AND'", "'OR'", "'NOT'", "'Timeout'", "'OperationLimit'", "'by'", "'BusinessDay'", "'to'", "'TimeInterval'", "'SessionInterval'", "'MessageContent'", "'<='", "'>='", "'>'", "'<'", "'!='", "'=='", "','", "'BusinessAction'", "'EventLog'", "'&&'", "'||'", "'!'", "'is'", "'as'", "'+'", "'-'", "'*'", "'/'", "'.'", "'.*'", "'push'", "'poll'", "'write'", "'read'", "'request'", "'response'", "'Sunday'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Second'", "'Minute'", "'Hour'", "'Day'", "'Week'", "'Month'", "'Year'"
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
    public static final int RULE_INT=6;
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
    public static final int RULE_STRING=5;
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
    // InternalSmartCE.g:178:1: ruleContract returns [EObject current=null] : (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= ruleValueAndDescription ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= ruleValueAndDescription ) ) otherlv_9= 'application' otherlv_10= '=' ( (lv_application_11_0= ruleApplication ) ) otherlv_12= 'process' otherlv_13= '=' ( (lv_process_14_0= ruleProcess ) ) ( (lv_variables_15_0= ruleVariables ) )? ( (lv_clauses_16_0= ruleClause ) )* ( (lv_actions_17_0= ruleAction ) )* otherlv_18= '}' ) ;
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
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_18=null;
        EObject lv_beginDate_5_0 = null;

        EObject lv_dueDate_8_0 = null;

        EObject lv_application_11_0 = null;

        EObject lv_process_14_0 = null;

        EObject lv_variables_15_0 = null;

        EObject lv_clauses_16_0 = null;

        EObject lv_actions_17_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:184:2: ( (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= ruleValueAndDescription ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= ruleValueAndDescription ) ) otherlv_9= 'application' otherlv_10= '=' ( (lv_application_11_0= ruleApplication ) ) otherlv_12= 'process' otherlv_13= '=' ( (lv_process_14_0= ruleProcess ) ) ( (lv_variables_15_0= ruleVariables ) )? ( (lv_clauses_16_0= ruleClause ) )* ( (lv_actions_17_0= ruleAction ) )* otherlv_18= '}' ) )
            // InternalSmartCE.g:185:2: (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= ruleValueAndDescription ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= ruleValueAndDescription ) ) otherlv_9= 'application' otherlv_10= '=' ( (lv_application_11_0= ruleApplication ) ) otherlv_12= 'process' otherlv_13= '=' ( (lv_process_14_0= ruleProcess ) ) ( (lv_variables_15_0= ruleVariables ) )? ( (lv_clauses_16_0= ruleClause ) )* ( (lv_actions_17_0= ruleAction ) )* otherlv_18= '}' )
            {
            // InternalSmartCE.g:185:2: (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= ruleValueAndDescription ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= ruleValueAndDescription ) ) otherlv_9= 'application' otherlv_10= '=' ( (lv_application_11_0= ruleApplication ) ) otherlv_12= 'process' otherlv_13= '=' ( (lv_process_14_0= ruleProcess ) ) ( (lv_variables_15_0= ruleVariables ) )? ( (lv_clauses_16_0= ruleClause ) )* ( (lv_actions_17_0= ruleAction ) )* otherlv_18= '}' )
            // InternalSmartCE.g:186:3: otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= ruleValueAndDescription ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= ruleValueAndDescription ) ) otherlv_9= 'application' otherlv_10= '=' ( (lv_application_11_0= ruleApplication ) ) otherlv_12= 'process' otherlv_13= '=' ( (lv_process_14_0= ruleProcess ) ) ( (lv_variables_15_0= ruleVariables ) )? ( (lv_clauses_16_0= ruleClause ) )* ( (lv_actions_17_0= ruleAction ) )* otherlv_18= '}'
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
            		
            // InternalSmartCE.g:220:3: ( (lv_beginDate_5_0= ruleValueAndDescription ) )
            // InternalSmartCE.g:221:4: (lv_beginDate_5_0= ruleValueAndDescription )
            {
            // InternalSmartCE.g:221:4: (lv_beginDate_5_0= ruleValueAndDescription )
            // InternalSmartCE.g:222:5: lv_beginDate_5_0= ruleValueAndDescription
            {

            					newCompositeNode(grammarAccess.getContractAccess().getBeginDateValueAndDescriptionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_beginDate_5_0=ruleValueAndDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"beginDate",
            						lv_beginDate_5_0,
            						"br.edu.unijui.gca.smartce.SmartCE.ValueAndDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getContractAccess().getDueDateKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getContractAccess().getEqualsSignKeyword_7());
            		
            // InternalSmartCE.g:247:3: ( (lv_dueDate_8_0= ruleValueAndDescription ) )
            // InternalSmartCE.g:248:4: (lv_dueDate_8_0= ruleValueAndDescription )
            {
            // InternalSmartCE.g:248:4: (lv_dueDate_8_0= ruleValueAndDescription )
            // InternalSmartCE.g:249:5: lv_dueDate_8_0= ruleValueAndDescription
            {

            					newCompositeNode(grammarAccess.getContractAccess().getDueDateValueAndDescriptionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_dueDate_8_0=ruleValueAndDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"dueDate",
            						lv_dueDate_8_0,
            						"br.edu.unijui.gca.smartce.SmartCE.ValueAndDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getContractAccess().getApplicationKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getContractAccess().getEqualsSignKeyword_10());
            		
            // InternalSmartCE.g:274:3: ( (lv_application_11_0= ruleApplication ) )
            // InternalSmartCE.g:275:4: (lv_application_11_0= ruleApplication )
            {
            // InternalSmartCE.g:275:4: (lv_application_11_0= ruleApplication )
            // InternalSmartCE.g:276:5: lv_application_11_0= ruleApplication
            {

            					newCompositeNode(grammarAccess.getContractAccess().getApplicationApplicationParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_12);
            lv_application_11_0=ruleApplication();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"application",
            						lv_application_11_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Application");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_12, grammarAccess.getContractAccess().getProcessKeyword_12());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_13, grammarAccess.getContractAccess().getEqualsSignKeyword_13());
            		
            // InternalSmartCE.g:301:3: ( (lv_process_14_0= ruleProcess ) )
            // InternalSmartCE.g:302:4: (lv_process_14_0= ruleProcess )
            {
            // InternalSmartCE.g:302:4: (lv_process_14_0= ruleProcess )
            // InternalSmartCE.g:303:5: lv_process_14_0= ruleProcess
            {

            					newCompositeNode(grammarAccess.getContractAccess().getProcessProcessParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_13);
            lv_process_14_0=ruleProcess();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"process",
            						lv_process_14_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Process");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartCE.g:320:3: ( (lv_variables_15_0= ruleVariables ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSmartCE.g:321:4: (lv_variables_15_0= ruleVariables )
                    {
                    // InternalSmartCE.g:321:4: (lv_variables_15_0= ruleVariables )
                    // InternalSmartCE.g:322:5: lv_variables_15_0= ruleVariables
                    {

                    					newCompositeNode(grammarAccess.getContractAccess().getVariablesVariablesParserRuleCall_15_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_variables_15_0=ruleVariables();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContractRule());
                    					}
                    					set(
                    						current,
                    						"variables",
                    						lv_variables_15_0,
                    						"br.edu.unijui.gca.smartce.SmartCE.Variables");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmartCE.g:339:3: ( (lv_clauses_16_0= ruleClause ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=21 && LA4_0<=23)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSmartCE.g:340:4: (lv_clauses_16_0= ruleClause )
            	    {
            	    // InternalSmartCE.g:340:4: (lv_clauses_16_0= ruleClause )
            	    // InternalSmartCE.g:341:5: lv_clauses_16_0= ruleClause
            	    {

            	    					newCompositeNode(grammarAccess.getContractAccess().getClausesClauseParserRuleCall_16_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_clauses_16_0=ruleClause();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContractRule());
            	    					}
            	    					add(
            	    						current,
            	    						"clauses",
            	    						lv_clauses_16_0,
            	    						"br.edu.unijui.gca.smartce.SmartCE.Clause");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalSmartCE.g:358:3: ( (lv_actions_17_0= ruleAction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=53 && LA5_0<=54)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmartCE.g:359:4: (lv_actions_17_0= ruleAction )
            	    {
            	    // InternalSmartCE.g:359:4: (lv_actions_17_0= ruleAction )
            	    // InternalSmartCE.g:360:5: lv_actions_17_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getContractAccess().getActionsActionParserRuleCall_17_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_actions_17_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContractRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_17_0,
            	    						"br.edu.unijui.gca.smartce.SmartCE.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_18=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_18());
            		

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


    // $ANTLR start "entryRuleVariables"
    // InternalSmartCE.g:385:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


        try {
            // InternalSmartCE.g:385:50: (iv_ruleVariables= ruleVariables EOF )
            // InternalSmartCE.g:386:2: iv_ruleVariables= ruleVariables EOF
            {
             newCompositeNode(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariables=ruleVariables();

            state._fsp--;

             current =iv_ruleVariables; 
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
    // $ANTLR end "entryRuleVariables"


    // $ANTLR start "ruleVariables"
    // InternalSmartCE.g:392:1: ruleVariables returns [EObject current=null] : ( () otherlv_1= 'variables' otherlv_2= '{' ( (lv_variable_3_0= ruleSingleVariable ) )* otherlv_4= '}' ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:398:2: ( ( () otherlv_1= 'variables' otherlv_2= '{' ( (lv_variable_3_0= ruleSingleVariable ) )* otherlv_4= '}' ) )
            // InternalSmartCE.g:399:2: ( () otherlv_1= 'variables' otherlv_2= '{' ( (lv_variable_3_0= ruleSingleVariable ) )* otherlv_4= '}' )
            {
            // InternalSmartCE.g:399:2: ( () otherlv_1= 'variables' otherlv_2= '{' ( (lv_variable_3_0= ruleSingleVariable ) )* otherlv_4= '}' )
            // InternalSmartCE.g:400:3: () otherlv_1= 'variables' otherlv_2= '{' ( (lv_variable_3_0= ruleSingleVariable ) )* otherlv_4= '}'
            {
            // InternalSmartCE.g:400:3: ()
            // InternalSmartCE.g:401:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariablesAccess().getVariablesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVariablesAccess().getVariablesKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getVariablesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmartCE.g:415:3: ( (lv_variable_3_0= ruleSingleVariable ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSmartCE.g:416:4: (lv_variable_3_0= ruleSingleVariable )
            	    {
            	    // InternalSmartCE.g:416:4: (lv_variable_3_0= ruleSingleVariable )
            	    // InternalSmartCE.g:417:5: lv_variable_3_0= ruleSingleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getVariablesAccess().getVariableSingleVariableParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_variable_3_0=ruleSingleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVariablesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variable",
            	    						lv_variable_3_0,
            	    						"br.edu.unijui.gca.smartce.SmartCE.SingleVariable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVariablesAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleVariables"


    // $ANTLR start "entryRuleSingleVariable"
    // InternalSmartCE.g:442:1: entryRuleSingleVariable returns [EObject current=null] : iv_ruleSingleVariable= ruleSingleVariable EOF ;
    public final EObject entryRuleSingleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleVariable = null;


        try {
            // InternalSmartCE.g:442:55: (iv_ruleSingleVariable= ruleSingleVariable EOF )
            // InternalSmartCE.g:443:2: iv_ruleSingleVariable= ruleSingleVariable EOF
            {
             newCompositeNode(grammarAccess.getSingleVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleVariable=ruleSingleVariable();

            state._fsp--;

             current =iv_ruleSingleVariable; 
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
    // $ANTLR end "entryRuleSingleVariable"


    // $ANTLR start "ruleSingleVariable"
    // InternalSmartCE.g:449:1: ruleSingleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_valueAndDescription_2_0= ruleValueAndDescription ) ) ) ;
    public final EObject ruleSingleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_valueAndDescription_2_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:455:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_valueAndDescription_2_0= ruleValueAndDescription ) ) ) )
            // InternalSmartCE.g:456:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_valueAndDescription_2_0= ruleValueAndDescription ) ) )
            {
            // InternalSmartCE.g:456:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_valueAndDescription_2_0= ruleValueAndDescription ) ) )
            // InternalSmartCE.g:457:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_valueAndDescription_2_0= ruleValueAndDescription ) )
            {
            // InternalSmartCE.g:457:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSmartCE.g:458:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSmartCE.g:458:4: (lv_name_0_0= RULE_ID )
            // InternalSmartCE.g:459:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSingleVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getSingleVariableAccess().getEqualsSignKeyword_1());
            		
            // InternalSmartCE.g:479:3: ( (lv_valueAndDescription_2_0= ruleValueAndDescription ) )
            // InternalSmartCE.g:480:4: (lv_valueAndDescription_2_0= ruleValueAndDescription )
            {
            // InternalSmartCE.g:480:4: (lv_valueAndDescription_2_0= ruleValueAndDescription )
            // InternalSmartCE.g:481:5: lv_valueAndDescription_2_0= ruleValueAndDescription
            {

            					newCompositeNode(grammarAccess.getSingleVariableAccess().getValueAndDescriptionValueAndDescriptionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_valueAndDescription_2_0=ruleValueAndDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleVariableRule());
            					}
            					set(
            						current,
            						"valueAndDescription",
            						lv_valueAndDescription_2_0,
            						"br.edu.unijui.gca.smartce.SmartCE.ValueAndDescription");
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
    // $ANTLR end "ruleSingleVariable"


    // $ANTLR start "entryRuleClause"
    // InternalSmartCE.g:502:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalSmartCE.g:502:47: (iv_ruleClause= ruleClause EOF )
            // InternalSmartCE.g:503:2: iv_ruleClause= ruleClause EOF
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
    // InternalSmartCE.g:509:1: ruleClause returns [EObject current=null] : ( (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'rolePlayer' otherlv_9= '=' ( (lv_rolePlayer_10_0= ruleParties ) ) otherlv_11= 'operation' otherlv_12= '=' ( (lv_operation_13_0= ruleOperation ) ) otherlv_14= 'condition' otherlv_15= '{' ( (lv_condition_16_0= ruleCondition ) ) otherlv_17= '}' otherlv_18= 'onBreach' ( (lv_onBreach_19_0= ruleOnBreach ) ) (otherlv_20= 'onSuccess' ( (lv_onSuccess_21_0= ruleOnSuccess ) ) )? otherlv_22= '}' ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Enumerator lv_rolePlayer_10_0 = null;

        Enumerator lv_operation_13_0 = null;

        EObject lv_condition_16_0 = null;

        EObject lv_onBreach_19_0 = null;

        EObject lv_onSuccess_21_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:515:2: ( ( (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'rolePlayer' otherlv_9= '=' ( (lv_rolePlayer_10_0= ruleParties ) ) otherlv_11= 'operation' otherlv_12= '=' ( (lv_operation_13_0= ruleOperation ) ) otherlv_14= 'condition' otherlv_15= '{' ( (lv_condition_16_0= ruleCondition ) ) otherlv_17= '}' otherlv_18= 'onBreach' ( (lv_onBreach_19_0= ruleOnBreach ) ) (otherlv_20= 'onSuccess' ( (lv_onSuccess_21_0= ruleOnSuccess ) ) )? otherlv_22= '}' ) )
            // InternalSmartCE.g:516:2: ( (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'rolePlayer' otherlv_9= '=' ( (lv_rolePlayer_10_0= ruleParties ) ) otherlv_11= 'operation' otherlv_12= '=' ( (lv_operation_13_0= ruleOperation ) ) otherlv_14= 'condition' otherlv_15= '{' ( (lv_condition_16_0= ruleCondition ) ) otherlv_17= '}' otherlv_18= 'onBreach' ( (lv_onBreach_19_0= ruleOnBreach ) ) (otherlv_20= 'onSuccess' ( (lv_onSuccess_21_0= ruleOnSuccess ) ) )? otherlv_22= '}' )
            {
            // InternalSmartCE.g:516:2: ( (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'rolePlayer' otherlv_9= '=' ( (lv_rolePlayer_10_0= ruleParties ) ) otherlv_11= 'operation' otherlv_12= '=' ( (lv_operation_13_0= ruleOperation ) ) otherlv_14= 'condition' otherlv_15= '{' ( (lv_condition_16_0= ruleCondition ) ) otherlv_17= '}' otherlv_18= 'onBreach' ( (lv_onBreach_19_0= ruleOnBreach ) ) (otherlv_20= 'onSuccess' ( (lv_onSuccess_21_0= ruleOnSuccess ) ) )? otherlv_22= '}' )
            // InternalSmartCE.g:517:3: (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'rolePlayer' otherlv_9= '=' ( (lv_rolePlayer_10_0= ruleParties ) ) otherlv_11= 'operation' otherlv_12= '=' ( (lv_operation_13_0= ruleOperation ) ) otherlv_14= 'condition' otherlv_15= '{' ( (lv_condition_16_0= ruleCondition ) ) otherlv_17= '}' otherlv_18= 'onBreach' ( (lv_onBreach_19_0= ruleOnBreach ) ) (otherlv_20= 'onSuccess' ( (lv_onSuccess_21_0= ruleOnSuccess ) ) )? otherlv_22= '}'
            {
            // InternalSmartCE.g:517:3: (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 23:
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
                    // InternalSmartCE.g:518:4: otherlv_0= 'Right'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getClauseAccess().getRightKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:523:4: otherlv_1= 'Prohibition'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getClauseAccess().getProhibitionKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:528:4: otherlv_2= 'Obligation'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getClauseAccess().getObligationKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalSmartCE.g:533:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSmartCE.g:534:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSmartCE.g:534:4: (lv_name_3_0= RULE_ID )
            // InternalSmartCE.g:535:5: lv_name_3_0= RULE_ID
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

            otherlv_4=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getClauseAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getClauseAccess().getDescriptionKeyword_3());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getClauseAccess().getEqualsSignKeyword_4());
            		
            // InternalSmartCE.g:563:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalSmartCE.g:564:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalSmartCE.g:564:4: (lv_description_7_0= RULE_STRING )
            // InternalSmartCE.g:565:5: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_description_7_0, grammarAccess.getClauseAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClauseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getClauseAccess().getRolePlayerKeyword_6());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_9, grammarAccess.getClauseAccess().getEqualsSignKeyword_7());
            		
            // InternalSmartCE.g:589:3: ( (lv_rolePlayer_10_0= ruleParties ) )
            // InternalSmartCE.g:590:4: (lv_rolePlayer_10_0= ruleParties )
            {
            // InternalSmartCE.g:590:4: (lv_rolePlayer_10_0= ruleParties )
            // InternalSmartCE.g:591:5: lv_rolePlayer_10_0= ruleParties
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getRolePlayerPartiesEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_20);
            lv_rolePlayer_10_0=ruleParties();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseRule());
            					}
            					set(
            						current,
            						"rolePlayer",
            						lv_rolePlayer_10_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Parties");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getClauseAccess().getOperationKeyword_9());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_12, grammarAccess.getClauseAccess().getEqualsSignKeyword_10());
            		
            // InternalSmartCE.g:616:3: ( (lv_operation_13_0= ruleOperation ) )
            // InternalSmartCE.g:617:4: (lv_operation_13_0= ruleOperation )
            {
            // InternalSmartCE.g:617:4: (lv_operation_13_0= ruleOperation )
            // InternalSmartCE.g:618:5: lv_operation_13_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getOperationOperationEnumRuleCall_11_0());
            				
            pushFollow(FOLLOW_22);
            lv_operation_13_0=ruleOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_13_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Operation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_14, grammarAccess.getClauseAccess().getConditionKeyword_12());
            		
            otherlv_15=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_15, grammarAccess.getClauseAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalSmartCE.g:643:3: ( (lv_condition_16_0= ruleCondition ) )
            // InternalSmartCE.g:644:4: (lv_condition_16_0= ruleCondition )
            {
            // InternalSmartCE.g:644:4: (lv_condition_16_0= ruleCondition )
            // InternalSmartCE.g:645:5: lv_condition_16_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getConditionConditionParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_24);
            lv_condition_16_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_16_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,19,FOLLOW_25); 

            			newLeafNode(otherlv_17, grammarAccess.getClauseAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_18=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_18, grammarAccess.getClauseAccess().getOnBreachKeyword_16());
            		
            // InternalSmartCE.g:670:3: ( (lv_onBreach_19_0= ruleOnBreach ) )
            // InternalSmartCE.g:671:4: (lv_onBreach_19_0= ruleOnBreach )
            {
            // InternalSmartCE.g:671:4: (lv_onBreach_19_0= ruleOnBreach )
            // InternalSmartCE.g:672:5: lv_onBreach_19_0= ruleOnBreach
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getOnBreachOnBreachParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_27);
            lv_onBreach_19_0=ruleOnBreach();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseRule());
            					}
            					set(
            						current,
            						"onBreach",
            						lv_onBreach_19_0,
            						"br.edu.unijui.gca.smartce.SmartCE.OnBreach");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartCE.g:689:3: (otherlv_20= 'onSuccess' ( (lv_onSuccess_21_0= ruleOnSuccess ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmartCE.g:690:4: otherlv_20= 'onSuccess' ( (lv_onSuccess_21_0= ruleOnSuccess ) )
                    {
                    otherlv_20=(Token)match(input,29,FOLLOW_26); 

                    				newLeafNode(otherlv_20, grammarAccess.getClauseAccess().getOnSuccessKeyword_18_0());
                    			
                    // InternalSmartCE.g:694:4: ( (lv_onSuccess_21_0= ruleOnSuccess ) )
                    // InternalSmartCE.g:695:5: (lv_onSuccess_21_0= ruleOnSuccess )
                    {
                    // InternalSmartCE.g:695:5: (lv_onSuccess_21_0= ruleOnSuccess )
                    // InternalSmartCE.g:696:6: lv_onSuccess_21_0= ruleOnSuccess
                    {

                    						newCompositeNode(grammarAccess.getClauseAccess().getOnSuccessOnSuccessParserRuleCall_18_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_onSuccess_21_0=ruleOnSuccess();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClauseRule());
                    						}
                    						set(
                    							current,
                    							"onSuccess",
                    							lv_onSuccess_21_0,
                    							"br.edu.unijui.gca.smartce.SmartCE.OnSuccess");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getClauseAccess().getRightCurlyBracketKeyword_19());
            		

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


    // $ANTLR start "entryRuleValueAndDescription"
    // InternalSmartCE.g:722:1: entryRuleValueAndDescription returns [EObject current=null] : iv_ruleValueAndDescription= ruleValueAndDescription EOF ;
    public final EObject entryRuleValueAndDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueAndDescription = null;


        try {
            // InternalSmartCE.g:722:60: (iv_ruleValueAndDescription= ruleValueAndDescription EOF )
            // InternalSmartCE.g:723:2: iv_ruleValueAndDescription= ruleValueAndDescription EOF
            {
             newCompositeNode(grammarAccess.getValueAndDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueAndDescription=ruleValueAndDescription();

            state._fsp--;

             current =iv_ruleValueAndDescription; 
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
    // $ANTLR end "entryRuleValueAndDescription"


    // $ANTLR start "ruleValueAndDescription"
    // InternalSmartCE.g:729:1: ruleValueAndDescription returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) (otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleValueAndDescription() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:735:2: ( ( ( (lv_value_0_0= RULE_STRING ) ) (otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) )? ) )
            // InternalSmartCE.g:736:2: ( ( (lv_value_0_0= RULE_STRING ) ) (otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) )? )
            {
            // InternalSmartCE.g:736:2: ( ( (lv_value_0_0= RULE_STRING ) ) (otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) )? )
            // InternalSmartCE.g:737:3: ( (lv_value_0_0= RULE_STRING ) ) (otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) )?
            {
            // InternalSmartCE.g:737:3: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSmartCE.g:738:4: (lv_value_0_0= RULE_STRING )
            {
            // InternalSmartCE.g:738:4: (lv_value_0_0= RULE_STRING )
            // InternalSmartCE.g:739:5: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_value_0_0, grammarAccess.getValueAndDescriptionAccess().getValueSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueAndDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSmartCE.g:755:3: (otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmartCE.g:756:4: otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getValueAndDescriptionAccess().getColonKeyword_1_0());
                    			
                    // InternalSmartCE.g:760:4: ( (lv_description_2_0= RULE_STRING ) )
                    // InternalSmartCE.g:761:5: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:761:5: (lv_description_2_0= RULE_STRING )
                    // InternalSmartCE.g:762:6: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_description_2_0, grammarAccess.getValueAndDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValueAndDescriptionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


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
    // $ANTLR end "ruleValueAndDescription"


    // $ANTLR start "entryRuleCondition"
    // InternalSmartCE.g:783:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalSmartCE.g:783:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalSmartCE.g:784:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalSmartCE.g:790:1: ruleCondition returns [EObject current=null] : (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_BusinessRule_0 = null;

        EObject this_CompositeCondition_1 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:796:2: ( (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition ) )
            // InternalSmartCE.g:797:2: (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition )
            {
            // InternalSmartCE.g:797:2: (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalSmartCE.g:798:3: this_BusinessRule_0= ruleBusinessRule
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
                    // InternalSmartCE.g:807:3: this_CompositeCondition_1= ruleCompositeCondition
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
    // InternalSmartCE.g:819:1: entryRuleBusinessRule returns [EObject current=null] : iv_ruleBusinessRule= ruleBusinessRule EOF ;
    public final EObject entryRuleBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessRule = null;


        try {
            // InternalSmartCE.g:819:53: (iv_ruleBusinessRule= ruleBusinessRule EOF )
            // InternalSmartCE.g:820:2: iv_ruleBusinessRule= ruleBusinessRule EOF
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
    // InternalSmartCE.g:826:1: ruleBusinessRule returns [EObject current=null] : (this_Timeout_0= ruleTimeout | this_OperationLimit_1= ruleOperationLimit | this_BusinessDay_2= ruleBusinessDay | this_TimeInterval_3= ruleTimeInterval | this_MessageContent_4= ruleMessageContent | this_SessionInterval_5= ruleSessionInterval ) ;
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
            // InternalSmartCE.g:832:2: ( (this_Timeout_0= ruleTimeout | this_OperationLimit_1= ruleOperationLimit | this_BusinessDay_2= ruleBusinessDay | this_TimeInterval_3= ruleTimeInterval | this_MessageContent_4= ruleMessageContent | this_SessionInterval_5= ruleSessionInterval ) )
            // InternalSmartCE.g:833:2: (this_Timeout_0= ruleTimeout | this_OperationLimit_1= ruleOperationLimit | this_BusinessDay_2= ruleBusinessDay | this_TimeInterval_3= ruleTimeInterval | this_MessageContent_4= ruleMessageContent | this_SessionInterval_5= ruleSessionInterval )
            {
            // InternalSmartCE.g:833:2: (this_Timeout_0= ruleTimeout | this_OperationLimit_1= ruleOperationLimit | this_BusinessDay_2= ruleBusinessDay | this_TimeInterval_3= ruleTimeInterval | this_MessageContent_4= ruleMessageContent | this_SessionInterval_5= ruleSessionInterval )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt11=1;
                }
                break;
            case 39:
                {
                alt11=2;
                }
                break;
            case 41:
                {
                alt11=3;
                }
                break;
            case 43:
                {
                alt11=4;
                }
                break;
            case 45:
                {
                alt11=5;
                }
                break;
            case 44:
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
                    // InternalSmartCE.g:834:3: this_Timeout_0= ruleTimeout
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
                    // InternalSmartCE.g:843:3: this_OperationLimit_1= ruleOperationLimit
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
                    // InternalSmartCE.g:852:3: this_BusinessDay_2= ruleBusinessDay
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
                    // InternalSmartCE.g:861:3: this_TimeInterval_3= ruleTimeInterval
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
                    // InternalSmartCE.g:870:3: this_MessageContent_4= ruleMessageContent
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
                    // InternalSmartCE.g:879:3: this_SessionInterval_5= ruleSessionInterval
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
    // InternalSmartCE.g:891:1: entryRuleCompositeCondition returns [EObject current=null] : iv_ruleCompositeCondition= ruleCompositeCondition EOF ;
    public final EObject entryRuleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCondition = null;


        try {
            // InternalSmartCE.g:891:59: (iv_ruleCompositeCondition= ruleCompositeCondition EOF )
            // InternalSmartCE.g:892:2: iv_ruleCompositeCondition= ruleCompositeCondition EOF
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
    // InternalSmartCE.g:898:1: ruleCompositeCondition returns [EObject current=null] : ( ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* ( ( (lv_logicalOperators_5_0= ruleLogicalOperator ) ) otherlv_6= 'when' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' otherlv_10= 'do' otherlv_11= '{' ( ( (lv_conditions_12_0= ruleBusinessRule ) ) | ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* ) ) otherlv_18= '}' )* ) ;
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
            // InternalSmartCE.g:904:2: ( ( ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* ( ( (lv_logicalOperators_5_0= ruleLogicalOperator ) ) otherlv_6= 'when' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' otherlv_10= 'do' otherlv_11= '{' ( ( (lv_conditions_12_0= ruleBusinessRule ) ) | ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* ) ) otherlv_18= '}' )* ) )
            // InternalSmartCE.g:905:2: ( ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* ( ( (lv_logicalOperators_5_0= ruleLogicalOperator ) ) otherlv_6= 'when' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' otherlv_10= 'do' otherlv_11= '{' ( ( (lv_conditions_12_0= ruleBusinessRule ) ) | ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* ) ) otherlv_18= '}' )* )
            {
            // InternalSmartCE.g:905:2: ( ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* ( ( (lv_logicalOperators_5_0= ruleLogicalOperator ) ) otherlv_6= 'when' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' otherlv_10= 'do' otherlv_11= '{' ( ( (lv_conditions_12_0= ruleBusinessRule ) ) | ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* ) ) otherlv_18= '}' )* )
            // InternalSmartCE.g:906:3: ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* ( ( (lv_logicalOperators_5_0= ruleLogicalOperator ) ) otherlv_6= 'when' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' otherlv_10= 'do' otherlv_11= '{' ( ( (lv_conditions_12_0= ruleBusinessRule ) ) | ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* ) ) otherlv_18= '}' )*
            {
            // InternalSmartCE.g:906:3: ( (lv_conditions_0_0= ruleBusinessRule ) )
            // InternalSmartCE.g:907:4: (lv_conditions_0_0= ruleBusinessRule )
            {
            // InternalSmartCE.g:907:4: (lv_conditions_0_0= ruleBusinessRule )
            // InternalSmartCE.g:908:5: lv_conditions_0_0= ruleBusinessRule
            {

            					newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalSmartCE.g:925:3: ( (lv_logicalOperators_1_0= ruleLogicalOperator ) )
            // InternalSmartCE.g:926:4: (lv_logicalOperators_1_0= ruleLogicalOperator )
            {
            // InternalSmartCE.g:926:4: (lv_logicalOperators_1_0= ruleLogicalOperator )
            // InternalSmartCE.g:927:5: lv_logicalOperators_1_0= ruleLogicalOperator
            {

            					newCompositeNode(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsLogicalOperatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalSmartCE.g:944:3: ( (lv_conditions_2_0= ruleBusinessRule ) )
            // InternalSmartCE.g:945:4: (lv_conditions_2_0= ruleBusinessRule )
            {
            // InternalSmartCE.g:945:4: (lv_conditions_2_0= ruleBusinessRule )
            // InternalSmartCE.g:946:5: lv_conditions_2_0= ruleBusinessRule
            {

            					newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalSmartCE.g:963:3: ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )*
            loop12:
            do {
                int alt12=2;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    int LA12_1 = input.LA(2);

                    if ( ((LA12_1>=38 && LA12_1<=39)||LA12_1==41||(LA12_1>=43 && LA12_1<=45)) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA12_2 = input.LA(2);

                    if ( ((LA12_2>=38 && LA12_2<=39)||LA12_2==41||(LA12_2>=43 && LA12_2<=45)) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA12_3 = input.LA(2);

                    if ( ((LA12_3>=38 && LA12_3<=39)||LA12_3==41||(LA12_3>=43 && LA12_3<=45)) ) {
                        alt12=1;
                    }


                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // InternalSmartCE.g:964:4: ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) )
            	    {
            	    // InternalSmartCE.g:964:4: ( (lv_logicalOperators_3_0= ruleLogicalOperator ) )
            	    // InternalSmartCE.g:965:5: (lv_logicalOperators_3_0= ruleLogicalOperator )
            	    {
            	    // InternalSmartCE.g:965:5: (lv_logicalOperators_3_0= ruleLogicalOperator )
            	    // InternalSmartCE.g:966:6: lv_logicalOperators_3_0= ruleLogicalOperator
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsLogicalOperatorParserRuleCall_3_0_0());
            	    					
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

            	    // InternalSmartCE.g:983:4: ( (lv_conditions_4_0= ruleBusinessRule ) )
            	    // InternalSmartCE.g:984:5: (lv_conditions_4_0= ruleBusinessRule )
            	    {
            	    // InternalSmartCE.g:984:5: (lv_conditions_4_0= ruleBusinessRule )
            	    // InternalSmartCE.g:985:6: lv_conditions_4_0= ruleBusinessRule
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
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

            // InternalSmartCE.g:1003:3: ( ( (lv_logicalOperators_5_0= ruleLogicalOperator ) ) otherlv_6= 'when' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' otherlv_10= 'do' otherlv_11= '{' ( ( (lv_conditions_12_0= ruleBusinessRule ) ) | ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* ) ) otherlv_18= '}' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=35 && LA15_0<=37)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSmartCE.g:1004:4: ( (lv_logicalOperators_5_0= ruleLogicalOperator ) ) otherlv_6= 'when' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' otherlv_10= 'do' otherlv_11= '{' ( ( (lv_conditions_12_0= ruleBusinessRule ) ) | ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* ) ) otherlv_18= '}'
            	    {
            	    // InternalSmartCE.g:1004:4: ( (lv_logicalOperators_5_0= ruleLogicalOperator ) )
            	    // InternalSmartCE.g:1005:5: (lv_logicalOperators_5_0= ruleLogicalOperator )
            	    {
            	    // InternalSmartCE.g:1005:5: (lv_logicalOperators_5_0= ruleLogicalOperator )
            	    // InternalSmartCE.g:1006:6: lv_logicalOperators_5_0= ruleLogicalOperator
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsLogicalOperatorParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_31);
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

            	    otherlv_6=(Token)match(input,31,FOLLOW_26); 

            	    				newLeafNode(otherlv_6, grammarAccess.getCompositeConditionAccess().getWhenKeyword_4_1());
            	    			
            	    otherlv_7=(Token)match(input,32,FOLLOW_32); 

            	    				newLeafNode(otherlv_7, grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_4_2());
            	    			
            	    // InternalSmartCE.g:1031:4: ( (lv_expression_8_0= ruleExpression ) )
            	    // InternalSmartCE.g:1032:5: (lv_expression_8_0= ruleExpression )
            	    {
            	    // InternalSmartCE.g:1032:5: (lv_expression_8_0= ruleExpression )
            	    // InternalSmartCE.g:1033:6: lv_expression_8_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConditionAccess().getExpressionExpressionParserRuleCall_4_3_0());
            	    					
            	    pushFollow(FOLLOW_33);
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

            	    otherlv_9=(Token)match(input,33,FOLLOW_34); 

            	    				newLeafNode(otherlv_9, grammarAccess.getCompositeConditionAccess().getRightParenthesisKeyword_4_4());
            	    			
            	    otherlv_10=(Token)match(input,34,FOLLOW_6); 

            	    				newLeafNode(otherlv_10, grammarAccess.getCompositeConditionAccess().getDoKeyword_4_5());
            	    			
            	    otherlv_11=(Token)match(input,13,FOLLOW_23); 

            	    				newLeafNode(otherlv_11, grammarAccess.getCompositeConditionAccess().getLeftCurlyBracketKeyword_4_6());
            	    			
            	    // InternalSmartCE.g:1062:4: ( ( (lv_conditions_12_0= ruleBusinessRule ) ) | ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* ) )
            	    int alt14=2;
            	    alt14 = dfa14.predict(input);
            	    switch (alt14) {
            	        case 1 :
            	            // InternalSmartCE.g:1063:5: ( (lv_conditions_12_0= ruleBusinessRule ) )
            	            {
            	            // InternalSmartCE.g:1063:5: ( (lv_conditions_12_0= ruleBusinessRule ) )
            	            // InternalSmartCE.g:1064:6: (lv_conditions_12_0= ruleBusinessRule )
            	            {
            	            // InternalSmartCE.g:1064:6: (lv_conditions_12_0= ruleBusinessRule )
            	            // InternalSmartCE.g:1065:7: lv_conditions_12_0= ruleBusinessRule
            	            {

            	            							newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_4_7_0_0());
            	            						
            	            pushFollow(FOLLOW_24);
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
            	            // InternalSmartCE.g:1083:5: ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* )
            	            {
            	            // InternalSmartCE.g:1083:5: ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* )
            	            // InternalSmartCE.g:1084:6: ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )*
            	            {
            	            // InternalSmartCE.g:1084:6: ( (lv_conditions_13_0= ruleBusinessRule ) )
            	            // InternalSmartCE.g:1085:7: (lv_conditions_13_0= ruleBusinessRule )
            	            {
            	            // InternalSmartCE.g:1085:7: (lv_conditions_13_0= ruleBusinessRule )
            	            // InternalSmartCE.g:1086:8: lv_conditions_13_0= ruleBusinessRule
            	            {

            	            								newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_4_7_1_0_0());
            	            							
            	            pushFollow(FOLLOW_29);
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

            	            // InternalSmartCE.g:1103:6: ( (lv_logicalOperators_14_0= ruleLogicalOperator ) )
            	            // InternalSmartCE.g:1104:7: (lv_logicalOperators_14_0= ruleLogicalOperator )
            	            {
            	            // InternalSmartCE.g:1104:7: (lv_logicalOperators_14_0= ruleLogicalOperator )
            	            // InternalSmartCE.g:1105:8: lv_logicalOperators_14_0= ruleLogicalOperator
            	            {

            	            								newCompositeNode(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsLogicalOperatorParserRuleCall_4_7_1_1_0());
            	            							
            	            pushFollow(FOLLOW_23);
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

            	            // InternalSmartCE.g:1122:6: ( (lv_conditions_15_0= ruleBusinessRule ) )
            	            // InternalSmartCE.g:1123:7: (lv_conditions_15_0= ruleBusinessRule )
            	            {
            	            // InternalSmartCE.g:1123:7: (lv_conditions_15_0= ruleBusinessRule )
            	            // InternalSmartCE.g:1124:8: lv_conditions_15_0= ruleBusinessRule
            	            {

            	            								newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_4_7_1_2_0());
            	            							
            	            pushFollow(FOLLOW_35);
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

            	            // InternalSmartCE.g:1141:6: ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )*
            	            loop13:
            	            do {
            	                int alt13=2;
            	                int LA13_0 = input.LA(1);

            	                if ( ((LA13_0>=35 && LA13_0<=37)) ) {
            	                    alt13=1;
            	                }


            	                switch (alt13) {
            	            	case 1 :
            	            	    // InternalSmartCE.g:1142:7: ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) )
            	            	    {
            	            	    // InternalSmartCE.g:1142:7: ( (lv_logicalOperators_16_0= ruleLogicalOperator ) )
            	            	    // InternalSmartCE.g:1143:8: (lv_logicalOperators_16_0= ruleLogicalOperator )
            	            	    {
            	            	    // InternalSmartCE.g:1143:8: (lv_logicalOperators_16_0= ruleLogicalOperator )
            	            	    // InternalSmartCE.g:1144:9: lv_logicalOperators_16_0= ruleLogicalOperator
            	            	    {

            	            	    									newCompositeNode(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsLogicalOperatorParserRuleCall_4_7_1_3_0_0());
            	            	    								
            	            	    pushFollow(FOLLOW_23);
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

            	            	    // InternalSmartCE.g:1161:7: ( (lv_conditions_17_0= ruleBusinessRule ) )
            	            	    // InternalSmartCE.g:1162:8: (lv_conditions_17_0= ruleBusinessRule )
            	            	    {
            	            	    // InternalSmartCE.g:1162:8: (lv_conditions_17_0= ruleBusinessRule )
            	            	    // InternalSmartCE.g:1163:9: lv_conditions_17_0= ruleBusinessRule
            	            	    {

            	            	    									newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_4_7_1_3_1_0());
            	            	    								
            	            	    pushFollow(FOLLOW_35);
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
            	            	    break loop13;
            	                }
            	            } while (true);


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_18=(Token)match(input,19,FOLLOW_30); 

            	    				newLeafNode(otherlv_18, grammarAccess.getCompositeConditionAccess().getRightCurlyBracketKeyword_4_8());
            	    			

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalSmartCE.g:1192:1: entryRuleLogicalOperator returns [EObject current=null] : iv_ruleLogicalOperator= ruleLogicalOperator EOF ;
    public final EObject entryRuleLogicalOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOperator = null;


        try {
            // InternalSmartCE.g:1192:56: (iv_ruleLogicalOperator= ruleLogicalOperator EOF )
            // InternalSmartCE.g:1193:2: iv_ruleLogicalOperator= ruleLogicalOperator EOF
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
    // InternalSmartCE.g:1199:1: ruleLogicalOperator returns [EObject current=null] : ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) ) ) ;
    public final EObject ruleLogicalOperator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1205:2: ( ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) ) ) )
            // InternalSmartCE.g:1206:2: ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) ) )
            {
            // InternalSmartCE.g:1206:2: ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) ) )
            // InternalSmartCE.g:1207:3: ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) )
            {
            // InternalSmartCE.g:1207:3: ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) )
            // InternalSmartCE.g:1208:4: (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' )
            {
            // InternalSmartCE.g:1208:4: (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt16=1;
                }
                break;
            case 36:
                {
                alt16=2;
                }
                break;
            case 37:
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
                    // InternalSmartCE.g:1209:5: lv_name_0_1= 'AND'
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
                    // InternalSmartCE.g:1220:5: lv_name_0_2= 'OR'
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
                    // InternalSmartCE.g:1231:5: lv_name_0_3= 'NOT'
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
    // InternalSmartCE.g:1247:1: entryRuleTimeout returns [EObject current=null] : iv_ruleTimeout= ruleTimeout EOF ;
    public final EObject entryRuleTimeout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeout = null;


        try {
            // InternalSmartCE.g:1247:48: (iv_ruleTimeout= ruleTimeout EOF )
            // InternalSmartCE.g:1248:2: iv_ruleTimeout= ruleTimeout EOF
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
    // InternalSmartCE.g:1254:1: ruleTimeout returns [EObject current=null] : (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleTimeout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1260:2: ( (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalSmartCE.g:1261:2: (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalSmartCE.g:1261:2: (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalSmartCE.g:1262:3: otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeoutAccess().getTimeoutKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeoutAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:1270:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalSmartCE.g:1271:4: (lv_value_2_0= RULE_INT )
            {
            // InternalSmartCE.g:1271:4: (lv_value_2_0= RULE_INT )
            // InternalSmartCE.g:1272:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_33); 

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
    // InternalSmartCE.g:1296:1: entryRuleOperationLimit returns [EObject current=null] : iv_ruleOperationLimit= ruleOperationLimit EOF ;
    public final EObject entryRuleOperationLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationLimit = null;


        try {
            // InternalSmartCE.g:1296:55: (iv_ruleOperationLimit= ruleOperationLimit EOF )
            // InternalSmartCE.g:1297:2: iv_ruleOperationLimit= ruleOperationLimit EOF
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
    // InternalSmartCE.g:1303:1: ruleOperationLimit returns [EObject current=null] : (otherlv_0= 'OperationLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' ) ;
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
            // InternalSmartCE.g:1309:2: ( (otherlv_0= 'OperationLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' ) )
            // InternalSmartCE.g:1310:2: (otherlv_0= 'OperationLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' )
            {
            // InternalSmartCE.g:1310:2: (otherlv_0= 'OperationLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' )
            // InternalSmartCE.g:1311:3: otherlv_0= 'OperationLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationLimitAccess().getOperationLimitKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationLimitAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:1319:3: ( (lv_operationsNumber_2_0= RULE_INT ) )
            // InternalSmartCE.g:1320:4: (lv_operationsNumber_2_0= RULE_INT )
            {
            // InternalSmartCE.g:1320:4: (lv_operationsNumber_2_0= RULE_INT )
            // InternalSmartCE.g:1321:5: lv_operationsNumber_2_0= RULE_INT
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

            otherlv_3=(Token)match(input,40,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationLimitAccess().getByKeyword_3());
            		
            // InternalSmartCE.g:1341:3: ( (lv_timeUnit_4_0= ruleTimeUnit ) )
            // InternalSmartCE.g:1342:4: (lv_timeUnit_4_0= ruleTimeUnit )
            {
            // InternalSmartCE.g:1342:4: (lv_timeUnit_4_0= ruleTimeUnit )
            // InternalSmartCE.g:1343:5: lv_timeUnit_4_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getOperationLimitAccess().getTimeUnitTimeUnitEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_33);
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
    // InternalSmartCE.g:1368:1: entryRuleBusinessDay returns [EObject current=null] : iv_ruleBusinessDay= ruleBusinessDay EOF ;
    public final EObject entryRuleBusinessDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessDay = null;


        try {
            // InternalSmartCE.g:1368:52: (iv_ruleBusinessDay= ruleBusinessDay EOF )
            // InternalSmartCE.g:1369:2: iv_ruleBusinessDay= ruleBusinessDay EOF
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
    // InternalSmartCE.g:1375:1: ruleBusinessDay returns [EObject current=null] : (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' ) ;
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
            // InternalSmartCE.g:1381:2: ( (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' ) )
            // InternalSmartCE.g:1382:2: (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' )
            {
            // InternalSmartCE.g:1382:2: (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' )
            // InternalSmartCE.g:1383:3: otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessDayAccess().getBusinessDayKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getBusinessDayAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:1391:3: ( (lv_start_2_0= ruleWeekDay ) )
            // InternalSmartCE.g:1392:4: (lv_start_2_0= ruleWeekDay )
            {
            // InternalSmartCE.g:1392:4: (lv_start_2_0= ruleWeekDay )
            // InternalSmartCE.g:1393:5: lv_start_2_0= ruleWeekDay
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

            otherlv_3=(Token)match(input,42,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getBusinessDayAccess().getToKeyword_3());
            		
            // InternalSmartCE.g:1414:3: ( (lv_end_4_0= ruleWeekDay ) )
            // InternalSmartCE.g:1415:4: (lv_end_4_0= ruleWeekDay )
            {
            // InternalSmartCE.g:1415:4: (lv_end_4_0= ruleWeekDay )
            // InternalSmartCE.g:1416:5: lv_end_4_0= ruleWeekDay
            {

            					newCompositeNode(grammarAccess.getBusinessDayAccess().getEndWeekDayEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_33);
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
    // InternalSmartCE.g:1441:1: entryRuleTimeInterval returns [EObject current=null] : iv_ruleTimeInterval= ruleTimeInterval EOF ;
    public final EObject entryRuleTimeInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeInterval = null;


        try {
            // InternalSmartCE.g:1441:53: (iv_ruleTimeInterval= ruleTimeInterval EOF )
            // InternalSmartCE.g:1442:2: iv_ruleTimeInterval= ruleTimeInterval EOF
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
    // InternalSmartCE.g:1448:1: ruleTimeInterval returns [EObject current=null] : (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
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
            // InternalSmartCE.g:1454:2: ( (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalSmartCE.g:1455:2: (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalSmartCE.g:1455:2: (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalSmartCE.g:1456:3: otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeIntervalAccess().getTimeIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeIntervalAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:1464:3: ( (lv_start_2_0= RULE_STRING ) )
            // InternalSmartCE.g:1465:4: (lv_start_2_0= RULE_STRING )
            {
            // InternalSmartCE.g:1465:4: (lv_start_2_0= RULE_STRING )
            // InternalSmartCE.g:1466:5: lv_start_2_0= RULE_STRING
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

            otherlv_3=(Token)match(input,42,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeIntervalAccess().getToKeyword_3());
            		
            // InternalSmartCE.g:1486:3: ( (lv_end_4_0= RULE_STRING ) )
            // InternalSmartCE.g:1487:4: (lv_end_4_0= RULE_STRING )
            {
            // InternalSmartCE.g:1487:4: (lv_end_4_0= RULE_STRING )
            // InternalSmartCE.g:1488:5: lv_end_4_0= RULE_STRING
            {
            lv_end_4_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

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
    // InternalSmartCE.g:1512:1: entryRuleSessionInterval returns [EObject current=null] : iv_ruleSessionInterval= ruleSessionInterval EOF ;
    public final EObject entryRuleSessionInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSessionInterval = null;


        try {
            // InternalSmartCE.g:1512:56: (iv_ruleSessionInterval= ruleSessionInterval EOF )
            // InternalSmartCE.g:1513:2: iv_ruleSessionInterval= ruleSessionInterval EOF
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
    // InternalSmartCE.g:1519:1: ruleSessionInterval returns [EObject current=null] : (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
    public final EObject ruleSessionInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_start_2_0=null;
        Token otherlv_3=null;
        Token lv_end_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1525:2: ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalSmartCE.g:1526:2: (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalSmartCE.g:1526:2: (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalSmartCE.g:1527:3: otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getSessionIntervalAccess().getSessionIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getSessionIntervalAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:1535:3: ( (lv_start_2_0= RULE_STRING ) )
            // InternalSmartCE.g:1536:4: (lv_start_2_0= RULE_STRING )
            {
            // InternalSmartCE.g:1536:4: (lv_start_2_0= RULE_STRING )
            // InternalSmartCE.g:1537:5: lv_start_2_0= RULE_STRING
            {
            lv_start_2_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            					newLeafNode(lv_start_2_0, grammarAccess.getSessionIntervalAccess().getStartSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSessionIntervalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getSessionIntervalAccess().getToKeyword_3());
            		
            // InternalSmartCE.g:1557:3: ( (lv_end_4_0= RULE_STRING ) )
            // InternalSmartCE.g:1558:4: (lv_end_4_0= RULE_STRING )
            {
            // InternalSmartCE.g:1558:4: (lv_end_4_0= RULE_STRING )
            // InternalSmartCE.g:1559:5: lv_end_4_0= RULE_STRING
            {
            lv_end_4_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					newLeafNode(lv_end_4_0, grammarAccess.getSessionIntervalAccess().getEndSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSessionIntervalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSessionIntervalAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalSmartCE.g:1583:1: entryRuleMessageContent returns [EObject current=null] : iv_ruleMessageContent= ruleMessageContent EOF ;
    public final EObject entryRuleMessageContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageContent = null;


        try {
            // InternalSmartCE.g:1583:55: (iv_ruleMessageContent= ruleMessageContent EOF )
            // InternalSmartCE.g:1584:2: iv_ruleMessageContent= ruleMessageContent EOF
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
    // InternalSmartCE.g:1590:1: ruleMessageContent returns [EObject current=null] : ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' ) | (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' ) ) ;
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
            // InternalSmartCE.g:1596:2: ( ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' ) | (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' ) ) )
            // InternalSmartCE.g:1597:2: ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' ) | (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' ) )
            {
            // InternalSmartCE.g:1597:2: ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' ) | (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' ) )
            int alt19=4;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalSmartCE.g:1598:3: (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' )
                    {
                    // InternalSmartCE.g:1598:3: (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' )
                    // InternalSmartCE.g:1599:4: otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getMessageContentAccess().getMessageContentKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalSmartCE.g:1607:4: ( (lv_content_2_0= RULE_STRING ) )
                    // InternalSmartCE.g:1608:5: (lv_content_2_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:1608:5: (lv_content_2_0= RULE_STRING )
                    // InternalSmartCE.g:1609:6: lv_content_2_0= RULE_STRING
                    {
                    lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

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
                    // InternalSmartCE.g:1631:3: (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' )
                    {
                    // InternalSmartCE.g:1631:3: (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' )
                    // InternalSmartCE.g:1632:4: otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getMessageContentAccess().getMessageContentKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalSmartCE.g:1640:4: ( (lv_content_6_0= RULE_STRING ) )
                    // InternalSmartCE.g:1641:5: (lv_content_6_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:1641:5: (lv_content_6_0= RULE_STRING )
                    // InternalSmartCE.g:1642:6: lv_content_6_0= RULE_STRING
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

                    otherlv_7=(Token)match(input,40,FOLLOW_38); 

                    				newLeafNode(otherlv_7, grammarAccess.getMessageContentAccess().getByKeyword_1_3());
                    			
                    // InternalSmartCE.g:1662:4: ( (lv_timeUnit_8_0= ruleTimeUnit ) )
                    // InternalSmartCE.g:1663:5: (lv_timeUnit_8_0= ruleTimeUnit )
                    {
                    // InternalSmartCE.g:1663:5: (lv_timeUnit_8_0= ruleTimeUnit )
                    // InternalSmartCE.g:1664:6: lv_timeUnit_8_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getTimeUnitTimeUnitEnumRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_33);
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
                    // InternalSmartCE.g:1687:3: (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' )
                    {
                    // InternalSmartCE.g:1687:3: (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' )
                    // InternalSmartCE.g:1688:4: otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')'
                    {
                    otherlv_10=(Token)match(input,45,FOLLOW_26); 

                    				newLeafNode(otherlv_10, grammarAccess.getMessageContentAccess().getMessageContentKeyword_2_0());
                    			
                    otherlv_11=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalSmartCE.g:1696:4: ( (lv_content_12_0= RULE_STRING ) )
                    // InternalSmartCE.g:1697:5: (lv_content_12_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:1697:5: (lv_content_12_0= RULE_STRING )
                    // InternalSmartCE.g:1698:6: lv_content_12_0= RULE_STRING
                    {
                    lv_content_12_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

                    // InternalSmartCE.g:1714:4: ( (lv_binaryOperator_13_0= ruleBinaryOperator ) )
                    // InternalSmartCE.g:1715:5: (lv_binaryOperator_13_0= ruleBinaryOperator )
                    {
                    // InternalSmartCE.g:1715:5: (lv_binaryOperator_13_0= ruleBinaryOperator )
                    // InternalSmartCE.g:1716:6: lv_binaryOperator_13_0= ruleBinaryOperator
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getBinaryOperatorBinaryOperatorParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_42);
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

                    // InternalSmartCE.g:1733:4: ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) )
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
                            // InternalSmartCE.g:1734:5: ( (lv_stringValue_14_0= ruleStringValue ) )
                            {
                            // InternalSmartCE.g:1734:5: ( (lv_stringValue_14_0= ruleStringValue ) )
                            // InternalSmartCE.g:1735:6: (lv_stringValue_14_0= ruleStringValue )
                            {
                            // InternalSmartCE.g:1735:6: (lv_stringValue_14_0= ruleStringValue )
                            // InternalSmartCE.g:1736:7: lv_stringValue_14_0= ruleStringValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getStringValueStringValueParserRuleCall_2_4_0_0());
                            						
                            pushFollow(FOLLOW_33);
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
                            // InternalSmartCE.g:1754:5: ( (lv_variableValue_15_0= ruleVariableValue ) )
                            {
                            // InternalSmartCE.g:1754:5: ( (lv_variableValue_15_0= ruleVariableValue ) )
                            // InternalSmartCE.g:1755:6: (lv_variableValue_15_0= ruleVariableValue )
                            {
                            // InternalSmartCE.g:1755:6: (lv_variableValue_15_0= ruleVariableValue )
                            // InternalSmartCE.g:1756:7: lv_variableValue_15_0= ruleVariableValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getVariableValueVariableValueParserRuleCall_2_4_1_0());
                            						
                            pushFollow(FOLLOW_33);
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
                            // InternalSmartCE.g:1774:5: ( (lv_numericValue_16_0= ruleNumericValue ) )
                            {
                            // InternalSmartCE.g:1774:5: ( (lv_numericValue_16_0= ruleNumericValue ) )
                            // InternalSmartCE.g:1775:6: (lv_numericValue_16_0= ruleNumericValue )
                            {
                            // InternalSmartCE.g:1775:6: (lv_numericValue_16_0= ruleNumericValue )
                            // InternalSmartCE.g:1776:7: lv_numericValue_16_0= ruleNumericValue
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getNumericValueNumericValueParserRuleCall_2_4_2_0());
                            						
                            pushFollow(FOLLOW_33);
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
                    // InternalSmartCE.g:1800:3: (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' )
                    {
                    // InternalSmartCE.g:1800:3: (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' )
                    // InternalSmartCE.g:1801:4: otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')'
                    {
                    otherlv_18=(Token)match(input,45,FOLLOW_26); 

                    				newLeafNode(otherlv_18, grammarAccess.getMessageContentAccess().getMessageContentKeyword_3_0());
                    			
                    otherlv_19=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_19, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalSmartCE.g:1809:4: ( (lv_content_20_0= RULE_STRING ) )
                    // InternalSmartCE.g:1810:5: (lv_content_20_0= RULE_STRING )
                    {
                    // InternalSmartCE.g:1810:5: (lv_content_20_0= RULE_STRING )
                    // InternalSmartCE.g:1811:6: lv_content_20_0= RULE_STRING
                    {
                    lv_content_20_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

                    // InternalSmartCE.g:1827:4: ( (lv_binaryOperator_21_0= ruleBinaryOperator ) )
                    // InternalSmartCE.g:1828:5: (lv_binaryOperator_21_0= ruleBinaryOperator )
                    {
                    // InternalSmartCE.g:1828:5: (lv_binaryOperator_21_0= ruleBinaryOperator )
                    // InternalSmartCE.g:1829:6: lv_binaryOperator_21_0= ruleBinaryOperator
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getBinaryOperatorBinaryOperatorParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_42);
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

                    // InternalSmartCE.g:1846:4: ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) )
                    int alt18=3;
                    switch ( input.LA(1) ) {
                    case RULE_STRING:
                        {
                        alt18=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt18=2;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt18=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }

                    switch (alt18) {
                        case 1 :
                            // InternalSmartCE.g:1847:5: ( (lv_stringValue_22_0= ruleStringValue ) )
                            {
                            // InternalSmartCE.g:1847:5: ( (lv_stringValue_22_0= ruleStringValue ) )
                            // InternalSmartCE.g:1848:6: (lv_stringValue_22_0= ruleStringValue )
                            {
                            // InternalSmartCE.g:1848:6: (lv_stringValue_22_0= ruleStringValue )
                            // InternalSmartCE.g:1849:7: lv_stringValue_22_0= ruleStringValue
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
                            // InternalSmartCE.g:1867:5: ( (lv_variableValue_23_0= ruleVariableValue ) )
                            {
                            // InternalSmartCE.g:1867:5: ( (lv_variableValue_23_0= ruleVariableValue ) )
                            // InternalSmartCE.g:1868:6: (lv_variableValue_23_0= ruleVariableValue )
                            {
                            // InternalSmartCE.g:1868:6: (lv_variableValue_23_0= ruleVariableValue )
                            // InternalSmartCE.g:1869:7: lv_variableValue_23_0= ruleVariableValue
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
                            // InternalSmartCE.g:1887:5: ( (lv_numericValue_24_0= ruleNumericValue ) )
                            {
                            // InternalSmartCE.g:1887:5: ( (lv_numericValue_24_0= ruleNumericValue ) )
                            // InternalSmartCE.g:1888:6: (lv_numericValue_24_0= ruleNumericValue )
                            {
                            // InternalSmartCE.g:1888:6: (lv_numericValue_24_0= ruleNumericValue )
                            // InternalSmartCE.g:1889:7: lv_numericValue_24_0= ruleNumericValue
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

                    otherlv_25=(Token)match(input,40,FOLLOW_38); 

                    				newLeafNode(otherlv_25, grammarAccess.getMessageContentAccess().getByKeyword_3_5());
                    			
                    // InternalSmartCE.g:1911:4: ( (lv_timeUnit_26_0= ruleTimeUnit ) )
                    // InternalSmartCE.g:1912:5: (lv_timeUnit_26_0= ruleTimeUnit )
                    {
                    // InternalSmartCE.g:1912:5: (lv_timeUnit_26_0= ruleTimeUnit )
                    // InternalSmartCE.g:1913:6: lv_timeUnit_26_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getTimeUnitTimeUnitEnumRuleCall_3_6_0());
                    					
                    pushFollow(FOLLOW_33);
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
    // InternalSmartCE.g:1939:1: entryRuleBinaryOperator returns [EObject current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final EObject entryRuleBinaryOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperator = null;


        try {
            // InternalSmartCE.g:1939:55: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // InternalSmartCE.g:1940:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
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
    // InternalSmartCE.g:1946:1: ruleBinaryOperator returns [EObject current=null] : ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) ) ;
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
            // InternalSmartCE.g:1952:2: ( ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) ) )
            // InternalSmartCE.g:1953:2: ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) )
            {
            // InternalSmartCE.g:1953:2: ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt20=1;
                }
                break;
            case 47:
                {
                alt20=2;
                }
                break;
            case 48:
                {
                alt20=3;
                }
                break;
            case 49:
                {
                alt20=4;
                }
                break;
            case 50:
                {
                alt20=5;
                }
                break;
            case 51:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalSmartCE.g:1954:3: ( (lv_symbol_0_0= '<=' ) )
                    {
                    // InternalSmartCE.g:1954:3: ( (lv_symbol_0_0= '<=' ) )
                    // InternalSmartCE.g:1955:4: (lv_symbol_0_0= '<=' )
                    {
                    // InternalSmartCE.g:1955:4: (lv_symbol_0_0= '<=' )
                    // InternalSmartCE.g:1956:5: lv_symbol_0_0= '<='
                    {
                    lv_symbol_0_0=(Token)match(input,46,FOLLOW_2); 

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
                    // InternalSmartCE.g:1969:3: ( (lv_symbol_1_0= '>=' ) )
                    {
                    // InternalSmartCE.g:1969:3: ( (lv_symbol_1_0= '>=' ) )
                    // InternalSmartCE.g:1970:4: (lv_symbol_1_0= '>=' )
                    {
                    // InternalSmartCE.g:1970:4: (lv_symbol_1_0= '>=' )
                    // InternalSmartCE.g:1971:5: lv_symbol_1_0= '>='
                    {
                    lv_symbol_1_0=(Token)match(input,47,FOLLOW_2); 

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
                    // InternalSmartCE.g:1984:3: ( (lv_symbol_2_0= '>' ) )
                    {
                    // InternalSmartCE.g:1984:3: ( (lv_symbol_2_0= '>' ) )
                    // InternalSmartCE.g:1985:4: (lv_symbol_2_0= '>' )
                    {
                    // InternalSmartCE.g:1985:4: (lv_symbol_2_0= '>' )
                    // InternalSmartCE.g:1986:5: lv_symbol_2_0= '>'
                    {
                    lv_symbol_2_0=(Token)match(input,48,FOLLOW_2); 

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
                    // InternalSmartCE.g:1999:3: ( (lv_symbol_3_0= '<' ) )
                    {
                    // InternalSmartCE.g:1999:3: ( (lv_symbol_3_0= '<' ) )
                    // InternalSmartCE.g:2000:4: (lv_symbol_3_0= '<' )
                    {
                    // InternalSmartCE.g:2000:4: (lv_symbol_3_0= '<' )
                    // InternalSmartCE.g:2001:5: lv_symbol_3_0= '<'
                    {
                    lv_symbol_3_0=(Token)match(input,49,FOLLOW_2); 

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
                    // InternalSmartCE.g:2014:3: ( (lv_symbol_4_0= '!=' ) )
                    {
                    // InternalSmartCE.g:2014:3: ( (lv_symbol_4_0= '!=' ) )
                    // InternalSmartCE.g:2015:4: (lv_symbol_4_0= '!=' )
                    {
                    // InternalSmartCE.g:2015:4: (lv_symbol_4_0= '!=' )
                    // InternalSmartCE.g:2016:5: lv_symbol_4_0= '!='
                    {
                    lv_symbol_4_0=(Token)match(input,50,FOLLOW_2); 

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
                    // InternalSmartCE.g:2029:3: ( (lv_symbol_5_0= '==' ) )
                    {
                    // InternalSmartCE.g:2029:3: ( (lv_symbol_5_0= '==' ) )
                    // InternalSmartCE.g:2030:4: (lv_symbol_5_0= '==' )
                    {
                    // InternalSmartCE.g:2030:4: (lv_symbol_5_0= '==' )
                    // InternalSmartCE.g:2031:5: lv_symbol_5_0= '=='
                    {
                    lv_symbol_5_0=(Token)match(input,51,FOLLOW_2); 

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
    // InternalSmartCE.g:2047:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalSmartCE.g:2047:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalSmartCE.g:2048:2: iv_ruleApplication= ruleApplication EOF
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
    // InternalSmartCE.g:2054:1: ruleApplication returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2060:2: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) ) )
            // InternalSmartCE.g:2061:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // InternalSmartCE.g:2061:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) )
            // InternalSmartCE.g:2062:3: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) )
            {
            // InternalSmartCE.g:2062:3: ( (lv_name_0_0= RULE_STRING ) )
            // InternalSmartCE.g:2063:4: (lv_name_0_0= RULE_STRING )
            {
            // InternalSmartCE.g:2063:4: (lv_name_0_0= RULE_STRING )
            // InternalSmartCE.g:2064:5: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

            					newLeafNode(lv_name_0_0, grammarAccess.getApplicationAccess().getNameSTRINGTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationAccess().getColonKeyword_1());
            		
            // InternalSmartCE.g:2084:3: ( (lv_description_2_0= RULE_STRING ) )
            // InternalSmartCE.g:2085:4: (lv_description_2_0= RULE_STRING )
            {
            // InternalSmartCE.g:2085:4: (lv_description_2_0= RULE_STRING )
            // InternalSmartCE.g:2086:5: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_description_2_0, grammarAccess.getApplicationAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplicationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleProcess"
    // InternalSmartCE.g:2106:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalSmartCE.g:2106:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalSmartCE.g:2107:2: iv_ruleProcess= ruleProcess EOF
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
    // InternalSmartCE.g:2113:1: ruleProcess returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2119:2: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) ) )
            // InternalSmartCE.g:2120:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // InternalSmartCE.g:2120:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) )
            // InternalSmartCE.g:2121:3: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) )
            {
            // InternalSmartCE.g:2121:3: ( (lv_name_0_0= RULE_STRING ) )
            // InternalSmartCE.g:2122:4: (lv_name_0_0= RULE_STRING )
            {
            // InternalSmartCE.g:2122:4: (lv_name_0_0= RULE_STRING )
            // InternalSmartCE.g:2123:5: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

            					newLeafNode(lv_name_0_0, grammarAccess.getProcessAccess().getNameSTRINGTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getColonKeyword_1());
            		
            // InternalSmartCE.g:2143:3: ( (lv_description_2_0= RULE_STRING ) )
            // InternalSmartCE.g:2144:4: (lv_description_2_0= RULE_STRING )
            {
            // InternalSmartCE.g:2144:4: (lv_description_2_0= RULE_STRING )
            // InternalSmartCE.g:2145:5: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_description_2_0, grammarAccess.getProcessAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleOnSuccess"
    // InternalSmartCE.g:2165:1: entryRuleOnSuccess returns [EObject current=null] : iv_ruleOnSuccess= ruleOnSuccess EOF ;
    public final EObject entryRuleOnSuccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnSuccess = null;


        try {
            // InternalSmartCE.g:2165:50: (iv_ruleOnSuccess= ruleOnSuccess EOF )
            // InternalSmartCE.g:2166:2: iv_ruleOnSuccess= ruleOnSuccess EOF
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
    // InternalSmartCE.g:2172:1: ruleOnSuccess returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleOnSuccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2178:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalSmartCE.g:2179:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalSmartCE.g:2179:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalSmartCE.g:2180:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOnSuccessAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSmartCE.g:2184:3: ( (otherlv_1= RULE_ID ) )
            // InternalSmartCE.g:2185:4: (otherlv_1= RULE_ID )
            {
            // InternalSmartCE.g:2185:4: (otherlv_1= RULE_ID )
            // InternalSmartCE.g:2186:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnSuccessRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_44); 

            					newLeafNode(otherlv_1, grammarAccess.getOnSuccessAccess().getActionActionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,52,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getOnSuccessAccess().getCommaKeyword_2());
            		
            // InternalSmartCE.g:2201:3: ( (lv_message_3_0= ruleExpression ) )
            // InternalSmartCE.g:2202:4: (lv_message_3_0= ruleExpression )
            {
            // InternalSmartCE.g:2202:4: (lv_message_3_0= ruleExpression )
            // InternalSmartCE.g:2203:5: lv_message_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOnSuccessAccess().getMessageExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_33);
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

            otherlv_4=(Token)match(input,33,FOLLOW_2); 

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
    // InternalSmartCE.g:2228:1: entryRuleOnBreach returns [EObject current=null] : iv_ruleOnBreach= ruleOnBreach EOF ;
    public final EObject entryRuleOnBreach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnBreach = null;


        try {
            // InternalSmartCE.g:2228:49: (iv_ruleOnBreach= ruleOnBreach EOF )
            // InternalSmartCE.g:2229:2: iv_ruleOnBreach= ruleOnBreach EOF
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
    // InternalSmartCE.g:2235:1: ruleOnBreach returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleOnBreach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2241:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalSmartCE.g:2242:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalSmartCE.g:2242:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalSmartCE.g:2243:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOnBreachAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSmartCE.g:2247:3: ( (otherlv_1= RULE_ID ) )
            // InternalSmartCE.g:2248:4: (otherlv_1= RULE_ID )
            {
            // InternalSmartCE.g:2248:4: (otherlv_1= RULE_ID )
            // InternalSmartCE.g:2249:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnBreachRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_44); 

            					newLeafNode(otherlv_1, grammarAccess.getOnBreachAccess().getActionActionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,52,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getOnBreachAccess().getCommaKeyword_2());
            		
            // InternalSmartCE.g:2264:3: ( (lv_message_3_0= ruleExpression ) )
            // InternalSmartCE.g:2265:4: (lv_message_3_0= ruleExpression )
            {
            // InternalSmartCE.g:2265:4: (lv_message_3_0= ruleExpression )
            // InternalSmartCE.g:2266:5: lv_message_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOnBreachAccess().getMessageExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_33);
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

            otherlv_4=(Token)match(input,33,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAction"
    // InternalSmartCE.g:2291:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalSmartCE.g:2291:47: (iv_ruleAction= ruleAction EOF )
            // InternalSmartCE.g:2292:2: iv_ruleAction= ruleAction EOF
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
    // InternalSmartCE.g:2298:1: ruleAction returns [EObject current=null] : (this_BusinessAction_0= ruleBusinessAction | this_EventLog_1= ruleEventLog ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_BusinessAction_0 = null;

        EObject this_EventLog_1 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2304:2: ( (this_BusinessAction_0= ruleBusinessAction | this_EventLog_1= ruleEventLog ) )
            // InternalSmartCE.g:2305:2: (this_BusinessAction_0= ruleBusinessAction | this_EventLog_1= ruleEventLog )
            {
            // InternalSmartCE.g:2305:2: (this_BusinessAction_0= ruleBusinessAction | this_EventLog_1= ruleEventLog )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==53) ) {
                alt21=1;
            }
            else if ( (LA21_0==54) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSmartCE.g:2306:3: this_BusinessAction_0= ruleBusinessAction
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
                    // InternalSmartCE.g:2315:3: this_EventLog_1= ruleEventLog
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
    // InternalSmartCE.g:2327:1: entryRuleBusinessAction returns [EObject current=null] : iv_ruleBusinessAction= ruleBusinessAction EOF ;
    public final EObject entryRuleBusinessAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessAction = null;


        try {
            // InternalSmartCE.g:2327:55: (iv_ruleBusinessAction= ruleBusinessAction EOF )
            // InternalSmartCE.g:2328:2: iv_ruleBusinessAction= ruleBusinessAction EOF
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
    // InternalSmartCE.g:2334:1: ruleBusinessAction returns [EObject current=null] : (otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleBusinessAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2340:2: ( (otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' ) )
            // InternalSmartCE.g:2341:2: (otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' )
            {
            // InternalSmartCE.g:2341:2: (otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' )
            // InternalSmartCE.g:2342:3: otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessActionAccess().getBusinessActionKeyword_0());
            		
            // InternalSmartCE.g:2346:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCE.g:2347:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCE.g:2347:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCE.g:2348:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            otherlv_2=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getBusinessActionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSmartCE.g:2368:3: ( (lv_parameters_3_0= ruleVariable ) )
            // InternalSmartCE.g:2369:4: (lv_parameters_3_0= ruleVariable )
            {
            // InternalSmartCE.g:2369:4: (lv_parameters_3_0= ruleVariable )
            // InternalSmartCE.g:2370:5: lv_parameters_3_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getBusinessActionAccess().getParametersVariableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_45);
            lv_parameters_3_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBusinessActionRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_3_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartCE.g:2387:3: (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==52) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSmartCE.g:2388:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,52,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getBusinessActionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSmartCE.g:2392:4: ( (lv_parameters_5_0= ruleVariable ) )
            	    // InternalSmartCE.g:2393:5: (lv_parameters_5_0= ruleVariable )
            	    {
            	    // InternalSmartCE.g:2393:5: (lv_parameters_5_0= ruleVariable )
            	    // InternalSmartCE.g:2394:6: lv_parameters_5_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getBusinessActionAccess().getParametersVariableParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_45);
            	    lv_parameters_5_0=ruleVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBusinessActionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_5_0,
            	    							"br.edu.unijui.gca.smartce.SmartCE.Variable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_6=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBusinessActionAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalSmartCE.g:2420:1: entryRuleEventLog returns [EObject current=null] : iv_ruleEventLog= ruleEventLog EOF ;
    public final EObject entryRuleEventLog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventLog = null;


        try {
            // InternalSmartCE.g:2420:49: (iv_ruleEventLog= ruleEventLog EOF )
            // InternalSmartCE.g:2421:2: iv_ruleEventLog= ruleEventLog EOF
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
    // InternalSmartCE.g:2427:1: ruleEventLog returns [EObject current=null] : (otherlv_0= 'EventLog' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleEventLog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2433:2: ( (otherlv_0= 'EventLog' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' ) )
            // InternalSmartCE.g:2434:2: (otherlv_0= 'EventLog' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' )
            {
            // InternalSmartCE.g:2434:2: (otherlv_0= 'EventLog' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' )
            // InternalSmartCE.g:2435:3: otherlv_0= 'EventLog' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEventLogAccess().getEventLogKeyword_0());
            		
            // InternalSmartCE.g:2439:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCE.g:2440:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCE.g:2440:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCE.g:2441:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            otherlv_2=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getEventLogAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSmartCE.g:2461:3: ( (lv_parameters_3_0= ruleVariable ) )
            // InternalSmartCE.g:2462:4: (lv_parameters_3_0= ruleVariable )
            {
            // InternalSmartCE.g:2462:4: (lv_parameters_3_0= ruleVariable )
            // InternalSmartCE.g:2463:5: lv_parameters_3_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getEventLogAccess().getParametersVariableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_45);
            lv_parameters_3_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventLogRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_3_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartCE.g:2480:3: (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==52) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSmartCE.g:2481:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,52,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEventLogAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSmartCE.g:2485:4: ( (lv_parameters_5_0= ruleVariable ) )
            	    // InternalSmartCE.g:2486:5: (lv_parameters_5_0= ruleVariable )
            	    {
            	    // InternalSmartCE.g:2486:5: (lv_parameters_5_0= ruleVariable )
            	    // InternalSmartCE.g:2487:6: lv_parameters_5_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getEventLogAccess().getParametersVariableParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_45);
            	    lv_parameters_5_0=ruleVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEventLogRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_5_0,
            	    							"br.edu.unijui.gca.smartce.SmartCE.Variable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_6=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEventLogAccess().getRightParenthesisKeyword_5());
            		

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


    // $ANTLR start "entryRuleVariable"
    // InternalSmartCE.g:2513:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSmartCE.g:2513:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalSmartCE.g:2514:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalSmartCE.g:2520:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2526:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) )
            // InternalSmartCE.g:2527:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            {
            // InternalSmartCE.g:2527:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            // InternalSmartCE.g:2528:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) )
            {
            // InternalSmartCE.g:2528:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSmartCE.g:2529:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSmartCE.g:2529:4: (lv_name_0_0= RULE_ID )
            // InternalSmartCE.g:2530:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_43); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getColonKeyword_1());
            		
            // InternalSmartCE.g:2550:3: ( (lv_type_2_0= RULE_ID ) )
            // InternalSmartCE.g:2551:4: (lv_type_2_0= RULE_ID )
            {
            // InternalSmartCE.g:2551:4: (lv_type_2_0= RULE_ID )
            // InternalSmartCE.g:2552:5: lv_type_2_0= RULE_ID
            {
            lv_type_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_type_2_0, grammarAccess.getVariableAccess().getTypeIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_2_0,
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // InternalSmartCE.g:2572:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSmartCE.g:2572:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSmartCE.g:2573:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalSmartCE.g:2579:1: ruleExpression returns [EObject current=null] : (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        Token lv_symbol_3_0=null;
        EObject this_Negation_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2585:2: ( (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* ) )
            // InternalSmartCE.g:2586:2: (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* )
            {
            // InternalSmartCE.g:2586:2: (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* )
            // InternalSmartCE.g:2587:3: this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getNegationParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_Negation_0=ruleNegation();

            state._fsp--;


            			current = this_Negation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:2595:3: ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=55 && LA25_0<=56)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSmartCE.g:2596:4: () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) )
            	    {
            	    // InternalSmartCE.g:2596:4: ()
            	    // InternalSmartCE.g:2597:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:2603:4: ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==55) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==56) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalSmartCE.g:2604:5: ( (lv_symbol_2_0= '&&' ) )
            	            {
            	            // InternalSmartCE.g:2604:5: ( (lv_symbol_2_0= '&&' ) )
            	            // InternalSmartCE.g:2605:6: (lv_symbol_2_0= '&&' )
            	            {
            	            // InternalSmartCE.g:2605:6: (lv_symbol_2_0= '&&' )
            	            // InternalSmartCE.g:2606:7: lv_symbol_2_0= '&&'
            	            {
            	            lv_symbol_2_0=(Token)match(input,55,FOLLOW_32); 

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
            	            // InternalSmartCE.g:2619:5: ( (lv_symbol_3_0= '||' ) )
            	            {
            	            // InternalSmartCE.g:2619:5: ( (lv_symbol_3_0= '||' ) )
            	            // InternalSmartCE.g:2620:6: (lv_symbol_3_0= '||' )
            	            {
            	            // InternalSmartCE.g:2620:6: (lv_symbol_3_0= '||' )
            	            // InternalSmartCE.g:2621:7: lv_symbol_3_0= '||'
            	            {
            	            lv_symbol_3_0=(Token)match(input,56,FOLLOW_32); 

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

            	    // InternalSmartCE.g:2634:4: ( (lv_right_4_0= ruleNegation ) )
            	    // InternalSmartCE.g:2635:5: (lv_right_4_0= ruleNegation )
            	    {
            	    // InternalSmartCE.g:2635:5: (lv_right_4_0= ruleNegation )
            	    // InternalSmartCE.g:2636:6: lv_right_4_0= ruleNegation
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightNegationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_46);
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleNegation"
    // InternalSmartCE.g:2658:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalSmartCE.g:2658:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalSmartCE.g:2659:2: iv_ruleNegation= ruleNegation EOF
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
    // InternalSmartCE.g:2665:1: ruleNegation returns [EObject current=null] : (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        EObject this_Comparison_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2671:2: ( (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) ) )
            // InternalSmartCE.g:2672:2: (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) )
            {
            // InternalSmartCE.g:2672:2: (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_INT)||LA26_0==32||LA26_0==61) ) {
                alt26=1;
            }
            else if ( (LA26_0==57) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalSmartCE.g:2673:3: this_Comparison_0= ruleComparison
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
                    // InternalSmartCE.g:2682:3: ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) )
                    {
                    // InternalSmartCE.g:2682:3: ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) )
                    // InternalSmartCE.g:2683:4: () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) )
                    {
                    // InternalSmartCE.g:2683:4: ()
                    // InternalSmartCE.g:2684:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegationAccess().getUnaryOperatorAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSmartCE.g:2690:4: ( (lv_symbol_2_0= '!' ) )
                    // InternalSmartCE.g:2691:5: (lv_symbol_2_0= '!' )
                    {
                    // InternalSmartCE.g:2691:5: (lv_symbol_2_0= '!' )
                    // InternalSmartCE.g:2692:6: lv_symbol_2_0= '!'
                    {
                    lv_symbol_2_0=(Token)match(input,57,FOLLOW_47); 

                    						newLeafNode(lv_symbol_2_0, grammarAccess.getNegationAccess().getSymbolExclamationMarkKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNegationRule());
                    						}
                    						setWithLastConsumed(current, "symbol", lv_symbol_2_0, "!");
                    					

                    }


                    }

                    // InternalSmartCE.g:2704:4: ( (lv_expression_3_0= ruleComparison ) )
                    // InternalSmartCE.g:2705:5: (lv_expression_3_0= ruleComparison )
                    {
                    // InternalSmartCE.g:2705:5: (lv_expression_3_0= ruleComparison )
                    // InternalSmartCE.g:2706:6: lv_expression_3_0= ruleComparison
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
    // InternalSmartCE.g:2728:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalSmartCE.g:2728:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalSmartCE.g:2729:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalSmartCE.g:2735:1: ruleComparison returns [EObject current=null] : (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* ) ;
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
            // InternalSmartCE.g:2741:2: ( (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* ) )
            // InternalSmartCE.g:2742:2: (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* )
            {
            // InternalSmartCE.g:2742:2: (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* )
            // InternalSmartCE.g:2743:3: this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_Plus_0=rulePlus();

            state._fsp--;


            			current = this_Plus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:2751:3: ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=46 && LA28_0<=51)||(LA28_0>=58 && LA28_0<=59)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSmartCE.g:2752:4: () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) )
            	    {
            	    // InternalSmartCE.g:2752:4: ()
            	    // InternalSmartCE.g:2753:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:2759:4: ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) )
            	    int alt27=8;
            	    switch ( input.LA(1) ) {
            	    case 46:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt27=3;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt27=4;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt27=5;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt27=6;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt27=7;
            	        }
            	        break;
            	    case 59:
            	        {
            	        alt27=8;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt27) {
            	        case 1 :
            	            // InternalSmartCE.g:2760:5: ( (lv_symbol_2_0= '<=' ) )
            	            {
            	            // InternalSmartCE.g:2760:5: ( (lv_symbol_2_0= '<=' ) )
            	            // InternalSmartCE.g:2761:6: (lv_symbol_2_0= '<=' )
            	            {
            	            // InternalSmartCE.g:2761:6: (lv_symbol_2_0= '<=' )
            	            // InternalSmartCE.g:2762:7: lv_symbol_2_0= '<='
            	            {
            	            lv_symbol_2_0=(Token)match(input,46,FOLLOW_47); 

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
            	            // InternalSmartCE.g:2775:5: ( (lv_symbol_3_0= '>=' ) )
            	            {
            	            // InternalSmartCE.g:2775:5: ( (lv_symbol_3_0= '>=' ) )
            	            // InternalSmartCE.g:2776:6: (lv_symbol_3_0= '>=' )
            	            {
            	            // InternalSmartCE.g:2776:6: (lv_symbol_3_0= '>=' )
            	            // InternalSmartCE.g:2777:7: lv_symbol_3_0= '>='
            	            {
            	            lv_symbol_3_0=(Token)match(input,47,FOLLOW_47); 

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
            	            // InternalSmartCE.g:2790:5: ( (lv_symbol_4_0= '>' ) )
            	            {
            	            // InternalSmartCE.g:2790:5: ( (lv_symbol_4_0= '>' ) )
            	            // InternalSmartCE.g:2791:6: (lv_symbol_4_0= '>' )
            	            {
            	            // InternalSmartCE.g:2791:6: (lv_symbol_4_0= '>' )
            	            // InternalSmartCE.g:2792:7: lv_symbol_4_0= '>'
            	            {
            	            lv_symbol_4_0=(Token)match(input,48,FOLLOW_47); 

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
            	            // InternalSmartCE.g:2805:5: ( (lv_symbol_5_0= '<' ) )
            	            {
            	            // InternalSmartCE.g:2805:5: ( (lv_symbol_5_0= '<' ) )
            	            // InternalSmartCE.g:2806:6: (lv_symbol_5_0= '<' )
            	            {
            	            // InternalSmartCE.g:2806:6: (lv_symbol_5_0= '<' )
            	            // InternalSmartCE.g:2807:7: lv_symbol_5_0= '<'
            	            {
            	            lv_symbol_5_0=(Token)match(input,49,FOLLOW_47); 

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
            	            // InternalSmartCE.g:2820:5: ( (lv_symbol_6_0= '!=' ) )
            	            {
            	            // InternalSmartCE.g:2820:5: ( (lv_symbol_6_0= '!=' ) )
            	            // InternalSmartCE.g:2821:6: (lv_symbol_6_0= '!=' )
            	            {
            	            // InternalSmartCE.g:2821:6: (lv_symbol_6_0= '!=' )
            	            // InternalSmartCE.g:2822:7: lv_symbol_6_0= '!='
            	            {
            	            lv_symbol_6_0=(Token)match(input,50,FOLLOW_47); 

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
            	            // InternalSmartCE.g:2835:5: ( (lv_symbol_7_0= '==' ) )
            	            {
            	            // InternalSmartCE.g:2835:5: ( (lv_symbol_7_0= '==' ) )
            	            // InternalSmartCE.g:2836:6: (lv_symbol_7_0= '==' )
            	            {
            	            // InternalSmartCE.g:2836:6: (lv_symbol_7_0= '==' )
            	            // InternalSmartCE.g:2837:7: lv_symbol_7_0= '=='
            	            {
            	            lv_symbol_7_0=(Token)match(input,51,FOLLOW_47); 

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
            	            // InternalSmartCE.g:2850:5: ( (lv_symbol_8_0= 'is' ) )
            	            {
            	            // InternalSmartCE.g:2850:5: ( (lv_symbol_8_0= 'is' ) )
            	            // InternalSmartCE.g:2851:6: (lv_symbol_8_0= 'is' )
            	            {
            	            // InternalSmartCE.g:2851:6: (lv_symbol_8_0= 'is' )
            	            // InternalSmartCE.g:2852:7: lv_symbol_8_0= 'is'
            	            {
            	            lv_symbol_8_0=(Token)match(input,58,FOLLOW_47); 

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
            	            // InternalSmartCE.g:2865:5: ( (lv_symbol_9_0= 'as' ) )
            	            {
            	            // InternalSmartCE.g:2865:5: ( (lv_symbol_9_0= 'as' ) )
            	            // InternalSmartCE.g:2866:6: (lv_symbol_9_0= 'as' )
            	            {
            	            // InternalSmartCE.g:2866:6: (lv_symbol_9_0= 'as' )
            	            // InternalSmartCE.g:2867:7: lv_symbol_9_0= 'as'
            	            {
            	            lv_symbol_9_0=(Token)match(input,59,FOLLOW_47); 

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

            	    // InternalSmartCE.g:2880:4: ( (lv_right_10_0= rulePlus ) )
            	    // InternalSmartCE.g:2881:5: (lv_right_10_0= rulePlus )
            	    {
            	    // InternalSmartCE.g:2881:5: (lv_right_10_0= rulePlus )
            	    // InternalSmartCE.g:2882:6: lv_right_10_0= rulePlus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_48);
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
            	    break loop28;
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
    // InternalSmartCE.g:2904:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalSmartCE.g:2904:45: (iv_rulePlus= rulePlus EOF )
            // InternalSmartCE.g:2905:2: iv_rulePlus= rulePlus EOF
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
    // InternalSmartCE.g:2911:1: rulePlus returns [EObject current=null] : (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2917:2: ( (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* ) )
            // InternalSmartCE.g:2918:2: (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* )
            {
            // InternalSmartCE.g:2918:2: (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* )
            // InternalSmartCE.g:2919:3: this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:2927:3: ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=60 && LA30_0<=61)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSmartCE.g:2928:4: () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) )
            	    {
            	    // InternalSmartCE.g:2928:4: ()
            	    // InternalSmartCE.g:2929:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPlusAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:2935:4: (otherlv_2= '+' | otherlv_3= '-' )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==60) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==61) ) {
            	        alt29=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalSmartCE.g:2936:5: otherlv_2= '+'
            	            {
            	            otherlv_2=(Token)match(input,60,FOLLOW_47); 

            	            					newLeafNode(otherlv_2, grammarAccess.getPlusAccess().getPlusSignKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSmartCE.g:2941:5: otherlv_3= '-'
            	            {
            	            otherlv_3=(Token)match(input,61,FOLLOW_47); 

            	            					newLeafNode(otherlv_3, grammarAccess.getPlusAccess().getHyphenMinusKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSmartCE.g:2946:4: ( (lv_right_4_0= ruleFactor ) )
            	    // InternalSmartCE.g:2947:5: (lv_right_4_0= ruleFactor )
            	    {
            	    // InternalSmartCE.g:2947:5: (lv_right_4_0= ruleFactor )
            	    // InternalSmartCE.g:2948:6: lv_right_4_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getPlusAccess().getRightFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_49);
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
            	    break loop30;
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
    // InternalSmartCE.g:2970:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalSmartCE.g:2970:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalSmartCE.g:2971:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalSmartCE.g:2977:1: ruleFactor returns [EObject current=null] : (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Negative_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2983:2: ( (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* ) )
            // InternalSmartCE.g:2984:2: (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* )
            {
            // InternalSmartCE.g:2984:2: (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* )
            // InternalSmartCE.g:2985:3: this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getNegativeParserRuleCall_0());
            		
            pushFollow(FOLLOW_50);
            this_Negative_0=ruleNegative();

            state._fsp--;


            			current = this_Negative_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:2993:3: ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=62 && LA32_0<=63)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSmartCE.g:2994:4: () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) )
            	    {
            	    // InternalSmartCE.g:2994:4: ()
            	    // InternalSmartCE.g:2995:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFactorAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:3001:4: (otherlv_2= '*' | otherlv_3= '/' )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==62) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==63) ) {
            	        alt31=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalSmartCE.g:3002:5: otherlv_2= '*'
            	            {
            	            otherlv_2=(Token)match(input,62,FOLLOW_47); 

            	            					newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSmartCE.g:3007:5: otherlv_3= '/'
            	            {
            	            otherlv_3=(Token)match(input,63,FOLLOW_47); 

            	            					newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSmartCE.g:3012:4: ( (lv_right_4_0= ruleNegative ) )
            	    // InternalSmartCE.g:3013:5: (lv_right_4_0= ruleNegative )
            	    {
            	    // InternalSmartCE.g:3013:5: (lv_right_4_0= ruleNegative )
            	    // InternalSmartCE.g:3014:6: lv_right_4_0= ruleNegative
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightNegativeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_50);
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleNegative"
    // InternalSmartCE.g:3036:1: entryRuleNegative returns [EObject current=null] : iv_ruleNegative= ruleNegative EOF ;
    public final EObject entryRuleNegative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegative = null;


        try {
            // InternalSmartCE.g:3036:49: (iv_ruleNegative= ruleNegative EOF )
            // InternalSmartCE.g:3037:2: iv_ruleNegative= ruleNegative EOF
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
    // InternalSmartCE.g:3043:1: ruleNegative returns [EObject current=null] : (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) ) ;
    public final EObject ruleNegative() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:3049:2: ( (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) ) )
            // InternalSmartCE.g:3050:2: (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) )
            {
            // InternalSmartCE.g:3050:2: (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_INT)||LA33_0==32) ) {
                alt33=1;
            }
            else if ( (LA33_0==61) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalSmartCE.g:3051:3: this_Primary_0= rulePrimary
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
                    // InternalSmartCE.g:3060:3: ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) )
                    {
                    // InternalSmartCE.g:3060:3: ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) )
                    // InternalSmartCE.g:3061:4: () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) )
                    {
                    // InternalSmartCE.g:3061:4: ()
                    // InternalSmartCE.g:3062:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegativeAccess().getUnaryOperatorAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,61,FOLLOW_51); 

                    				newLeafNode(otherlv_2, grammarAccess.getNegativeAccess().getHyphenMinusKeyword_1_1());
                    			
                    // InternalSmartCE.g:3072:4: ( (lv_expression_3_0= rulePrimary ) )
                    // InternalSmartCE.g:3073:5: (lv_expression_3_0= rulePrimary )
                    {
                    // InternalSmartCE.g:3073:5: (lv_expression_3_0= rulePrimary )
                    // InternalSmartCE.g:3074:6: lv_expression_3_0= rulePrimary
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
    // InternalSmartCE.g:3096:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSmartCE.g:3096:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSmartCE.g:3097:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalSmartCE.g:3103:1: rulePrimary returns [EObject current=null] : (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_LiteralValue_0 = null;

        EObject this_Expression_2 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:3109:2: ( (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) )
            // InternalSmartCE.g:3110:2: (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            {
            // InternalSmartCE.g:3110:2: (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_INT)) ) {
                alt34=1;
            }
            else if ( (LA34_0==32) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalSmartCE.g:3111:3: this_LiteralValue_0= ruleLiteralValue
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
                    // InternalSmartCE.g:3120:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalSmartCE.g:3120:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalSmartCE.g:3121:4: otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_33);
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
    // InternalSmartCE.g:3142:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // InternalSmartCE.g:3142:53: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // InternalSmartCE.g:3143:2: iv_ruleLiteralValue= ruleLiteralValue EOF
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
    // InternalSmartCE.g:3149:1: ruleLiteralValue returns [EObject current=null] : (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject this_NumericValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_VariableValue_2 = null;

        EObject this_FunctionCall_3 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:3155:2: ( (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall ) )
            // InternalSmartCE.g:3156:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )
            {
            // InternalSmartCE.g:3156:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )
            int alt35=4;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalSmartCE.g:3157:3: this_NumericValue_0= ruleNumericValue
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
                    // InternalSmartCE.g:3166:3: this_StringValue_1= ruleStringValue
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
                    // InternalSmartCE.g:3175:3: this_VariableValue_2= ruleVariableValue
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
                    // InternalSmartCE.g:3184:3: this_FunctionCall_3= ruleFunctionCall
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
    // InternalSmartCE.g:3196:1: entryRuleNumericValue returns [EObject current=null] : iv_ruleNumericValue= ruleNumericValue EOF ;
    public final EObject entryRuleNumericValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericValue = null;


        try {
            // InternalSmartCE.g:3196:53: (iv_ruleNumericValue= ruleNumericValue EOF )
            // InternalSmartCE.g:3197:2: iv_ruleNumericValue= ruleNumericValue EOF
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
    // InternalSmartCE.g:3203:1: ruleNumericValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumericValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3209:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalSmartCE.g:3210:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalSmartCE.g:3210:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalSmartCE.g:3211:3: (lv_value_0_0= RULE_INT )
            {
            // InternalSmartCE.g:3211:3: (lv_value_0_0= RULE_INT )
            // InternalSmartCE.g:3212:4: lv_value_0_0= RULE_INT
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
    // InternalSmartCE.g:3231:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalSmartCE.g:3231:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalSmartCE.g:3232:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalSmartCE.g:3238:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3244:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSmartCE.g:3245:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSmartCE.g:3245:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSmartCE.g:3246:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalSmartCE.g:3246:3: (lv_value_0_0= RULE_STRING )
            // InternalSmartCE.g:3247:4: lv_value_0_0= RULE_STRING
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
    // InternalSmartCE.g:3266:1: entryRuleVariableValue returns [EObject current=null] : iv_ruleVariableValue= ruleVariableValue EOF ;
    public final EObject entryRuleVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableValue = null;


        try {
            // InternalSmartCE.g:3266:54: (iv_ruleVariableValue= ruleVariableValue EOF )
            // InternalSmartCE.g:3267:2: iv_ruleVariableValue= ruleVariableValue EOF
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
    // InternalSmartCE.g:3273:1: ruleVariableValue returns [EObject current=null] : ( (lv_value_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleVariableValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:3279:2: ( ( (lv_value_0_0= ruleQualifiedName ) ) )
            // InternalSmartCE.g:3280:2: ( (lv_value_0_0= ruleQualifiedName ) )
            {
            // InternalSmartCE.g:3280:2: ( (lv_value_0_0= ruleQualifiedName ) )
            // InternalSmartCE.g:3281:3: (lv_value_0_0= ruleQualifiedName )
            {
            // InternalSmartCE.g:3281:3: (lv_value_0_0= ruleQualifiedName )
            // InternalSmartCE.g:3282:4: lv_value_0_0= ruleQualifiedName
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
    // InternalSmartCE.g:3302:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalSmartCE.g:3302:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalSmartCE.g:3303:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalSmartCE.g:3309:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' ) ;
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
            // InternalSmartCE.g:3315:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' ) )
            // InternalSmartCE.g:3316:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            {
            // InternalSmartCE.g:3316:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            // InternalSmartCE.g:3317:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')'
            {
            // InternalSmartCE.g:3317:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalSmartCE.g:3318:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalSmartCE.g:3318:4: (lv_name_0_0= ruleQualifiedName )
            // InternalSmartCE.g:3319:5: lv_name_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getNameQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_1=(Token)match(input,32,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:3340:3: ( (lv_params_2_0= ruleExpression ) )
            // InternalSmartCE.g:3341:4: (lv_params_2_0= ruleExpression )
            {
            // InternalSmartCE.g:3341:4: (lv_params_2_0= ruleExpression )
            // InternalSmartCE.g:3342:5: lv_params_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getParamsExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_45);
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

            // InternalSmartCE.g:3359:3: (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==52) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSmartCE.g:3360:4: otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,52,FOLLOW_32); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSmartCE.g:3364:4: ( (lv_params_4_0= ruleExpression ) )
            	    // InternalSmartCE.g:3365:5: (lv_params_4_0= ruleExpression )
            	    {
            	    // InternalSmartCE.g:3365:5: (lv_params_4_0= ruleExpression )
            	    // InternalSmartCE.g:3366:6: lv_params_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionCallAccess().getParamsExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_45);
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
            	    break loop36;
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
    // InternalSmartCE.g:3392:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSmartCE.g:3392:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSmartCE.g:3393:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalSmartCE.g:3399:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3405:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSmartCE.g:3406:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSmartCE.g:3406:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSmartCE.g:3407:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_52); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSmartCE.g:3414:3: (kw= '.' this_ID_2= RULE_ID )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==64) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSmartCE.g:3415:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,64,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_52); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalSmartCE.g:3432:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalSmartCE.g:3432:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalSmartCE.g:3433:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalSmartCE.g:3439:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:3445:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.*' ) )
            // InternalSmartCE.g:3446:2: (this_QualifiedName_0= ruleQualifiedName kw= '.*' )
            {
            // InternalSmartCE.g:3446:2: (this_QualifiedName_0= ruleQualifiedName kw= '.*' )
            // InternalSmartCE.g:3447:3: this_QualifiedName_0= ruleQualifiedName kw= '.*'
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_53);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,65,FOLLOW_2); 

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
    // InternalSmartCE.g:3466:1: entryRuleYEAR returns [String current=null] : iv_ruleYEAR= ruleYEAR EOF ;
    public final String entryRuleYEAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleYEAR = null;


        try {
            // InternalSmartCE.g:3466:44: (iv_ruleYEAR= ruleYEAR EOF )
            // InternalSmartCE.g:3467:2: iv_ruleYEAR= ruleYEAR EOF
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
    // InternalSmartCE.g:3473:1: ruleYEAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleYEAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3479:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3480:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:3490:1: entryRuleMONTH returns [String current=null] : iv_ruleMONTH= ruleMONTH EOF ;
    public final String entryRuleMONTH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMONTH = null;


        try {
            // InternalSmartCE.g:3490:45: (iv_ruleMONTH= ruleMONTH EOF )
            // InternalSmartCE.g:3491:2: iv_ruleMONTH= ruleMONTH EOF
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
    // InternalSmartCE.g:3497:1: ruleMONTH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleMONTH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3503:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3504:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:3514:1: entryRuleDAY returns [String current=null] : iv_ruleDAY= ruleDAY EOF ;
    public final String entryRuleDAY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDAY = null;


        try {
            // InternalSmartCE.g:3514:43: (iv_ruleDAY= ruleDAY EOF )
            // InternalSmartCE.g:3515:2: iv_ruleDAY= ruleDAY EOF
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
    // InternalSmartCE.g:3521:1: ruleDAY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleDAY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3527:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3528:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:3538:1: entryRuleHOUR returns [String current=null] : iv_ruleHOUR= ruleHOUR EOF ;
    public final String entryRuleHOUR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHOUR = null;


        try {
            // InternalSmartCE.g:3538:44: (iv_ruleHOUR= ruleHOUR EOF )
            // InternalSmartCE.g:3539:2: iv_ruleHOUR= ruleHOUR EOF
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
    // InternalSmartCE.g:3545:1: ruleHOUR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleHOUR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3551:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3552:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:3562:1: entryRuleMIN returns [String current=null] : iv_ruleMIN= ruleMIN EOF ;
    public final String entryRuleMIN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMIN = null;


        try {
            // InternalSmartCE.g:3562:43: (iv_ruleMIN= ruleMIN EOF )
            // InternalSmartCE.g:3563:2: iv_ruleMIN= ruleMIN EOF
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
    // InternalSmartCE.g:3569:1: ruleMIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleMIN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3575:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3576:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:3586:1: entryRuleSEC returns [String current=null] : iv_ruleSEC= ruleSEC EOF ;
    public final String entryRuleSEC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSEC = null;


        try {
            // InternalSmartCE.g:3586:43: (iv_ruleSEC= ruleSEC EOF )
            // InternalSmartCE.g:3587:2: iv_ruleSEC= ruleSEC EOF
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
    // InternalSmartCE.g:3593:1: ruleSEC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleSEC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3599:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:3600:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:3610:1: ruleOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) ) ;
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
            // InternalSmartCE.g:3616:2: ( ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) ) )
            // InternalSmartCE.g:3617:2: ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) )
            {
            // InternalSmartCE.g:3617:2: ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) )
            int alt38=6;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt38=1;
                }
                break;
            case 67:
                {
                alt38=2;
                }
                break;
            case 68:
                {
                alt38=3;
                }
                break;
            case 69:
                {
                alt38=4;
                }
                break;
            case 70:
                {
                alt38=5;
                }
                break;
            case 71:
                {
                alt38=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalSmartCE.g:3618:3: (enumLiteral_0= 'push' )
                    {
                    // InternalSmartCE.g:3618:3: (enumLiteral_0= 'push' )
                    // InternalSmartCE.g:3619:4: enumLiteral_0= 'push'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getPUSHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationAccess().getPUSHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:3626:3: (enumLiteral_1= 'poll' )
                    {
                    // InternalSmartCE.g:3626:3: (enumLiteral_1= 'poll' )
                    // InternalSmartCE.g:3627:4: enumLiteral_1= 'poll'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getPOLLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationAccess().getPOLLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:3634:3: (enumLiteral_2= 'write' )
                    {
                    // InternalSmartCE.g:3634:3: (enumLiteral_2= 'write' )
                    // InternalSmartCE.g:3635:4: enumLiteral_2= 'write'
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getWRITEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperationAccess().getWRITEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:3642:3: (enumLiteral_3= 'read' )
                    {
                    // InternalSmartCE.g:3642:3: (enumLiteral_3= 'read' )
                    // InternalSmartCE.g:3643:4: enumLiteral_3= 'read'
                    {
                    enumLiteral_3=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getREADEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperationAccess().getREADEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCE.g:3650:3: (enumLiteral_4= 'request' )
                    {
                    // InternalSmartCE.g:3650:3: (enumLiteral_4= 'request' )
                    // InternalSmartCE.g:3651:4: enumLiteral_4= 'request'
                    {
                    enumLiteral_4=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getREQUESTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperationAccess().getREQUESTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCE.g:3658:3: (enumLiteral_5= 'response' )
                    {
                    // InternalSmartCE.g:3658:3: (enumLiteral_5= 'response' )
                    // InternalSmartCE.g:3659:4: enumLiteral_5= 'response'
                    {
                    enumLiteral_5=(Token)match(input,71,FOLLOW_2); 

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
    // InternalSmartCE.g:3669:1: ruleWeekDay returns [Enumerator current=null] : ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) ) ;
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
            // InternalSmartCE.g:3675:2: ( ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) ) )
            // InternalSmartCE.g:3676:2: ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) )
            {
            // InternalSmartCE.g:3676:2: ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) )
            int alt39=7;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt39=1;
                }
                break;
            case 73:
                {
                alt39=2;
                }
                break;
            case 74:
                {
                alt39=3;
                }
                break;
            case 75:
                {
                alt39=4;
                }
                break;
            case 76:
                {
                alt39=5;
                }
                break;
            case 77:
                {
                alt39=6;
                }
                break;
            case 78:
                {
                alt39=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalSmartCE.g:3677:3: (enumLiteral_0= 'Sunday' )
                    {
                    // InternalSmartCE.g:3677:3: (enumLiteral_0= 'Sunday' )
                    // InternalSmartCE.g:3678:4: enumLiteral_0= 'Sunday'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getSUNDAYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWeekDayAccess().getSUNDAYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:3685:3: (enumLiteral_1= 'Monday' )
                    {
                    // InternalSmartCE.g:3685:3: (enumLiteral_1= 'Monday' )
                    // InternalSmartCE.g:3686:4: enumLiteral_1= 'Monday'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getMONDAYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWeekDayAccess().getMONDAYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:3693:3: (enumLiteral_2= 'Tuesday' )
                    {
                    // InternalSmartCE.g:3693:3: (enumLiteral_2= 'Tuesday' )
                    // InternalSmartCE.g:3694:4: enumLiteral_2= 'Tuesday'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTUESDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWeekDayAccess().getTUESDAYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:3701:3: (enumLiteral_3= 'Wednesday' )
                    {
                    // InternalSmartCE.g:3701:3: (enumLiteral_3= 'Wednesday' )
                    // InternalSmartCE.g:3702:4: enumLiteral_3= 'Wednesday'
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getWEDNESDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWeekDayAccess().getWEDNESDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCE.g:3709:3: (enumLiteral_4= 'Thursday' )
                    {
                    // InternalSmartCE.g:3709:3: (enumLiteral_4= 'Thursday' )
                    // InternalSmartCE.g:3710:4: enumLiteral_4= 'Thursday'
                    {
                    enumLiteral_4=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTHURSDAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWeekDayAccess().getTHURSDAYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCE.g:3717:3: (enumLiteral_5= 'Friday' )
                    {
                    // InternalSmartCE.g:3717:3: (enumLiteral_5= 'Friday' )
                    // InternalSmartCE.g:3718:4: enumLiteral_5= 'Friday'
                    {
                    enumLiteral_5=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getFRIDAYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWeekDayAccess().getFRIDAYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSmartCE.g:3725:3: (enumLiteral_6= 'Saturday' )
                    {
                    // InternalSmartCE.g:3725:3: (enumLiteral_6= 'Saturday' )
                    // InternalSmartCE.g:3726:4: enumLiteral_6= 'Saturday'
                    {
                    enumLiteral_6=(Token)match(input,78,FOLLOW_2); 

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
    // InternalSmartCE.g:3736:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) ) ;
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
            // InternalSmartCE.g:3742:2: ( ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) ) )
            // InternalSmartCE.g:3743:2: ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) )
            {
            // InternalSmartCE.g:3743:2: ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) )
            int alt40=7;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt40=1;
                }
                break;
            case 80:
                {
                alt40=2;
                }
                break;
            case 81:
                {
                alt40=3;
                }
                break;
            case 82:
                {
                alt40=4;
                }
                break;
            case 83:
                {
                alt40=5;
                }
                break;
            case 84:
                {
                alt40=6;
                }
                break;
            case 85:
                {
                alt40=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalSmartCE.g:3744:3: (enumLiteral_0= 'Second' )
                    {
                    // InternalSmartCE.g:3744:3: (enumLiteral_0= 'Second' )
                    // InternalSmartCE.g:3745:4: enumLiteral_0= 'Second'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getSECONDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSECONDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:3752:3: (enumLiteral_1= 'Minute' )
                    {
                    // InternalSmartCE.g:3752:3: (enumLiteral_1= 'Minute' )
                    // InternalSmartCE.g:3753:4: enumLiteral_1= 'Minute'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:3760:3: (enumLiteral_2= 'Hour' )
                    {
                    // InternalSmartCE.g:3760:3: (enumLiteral_2= 'Hour' )
                    // InternalSmartCE.g:3761:4: enumLiteral_2= 'Hour'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:3768:3: (enumLiteral_3= 'Day' )
                    {
                    // InternalSmartCE.g:3768:3: (enumLiteral_3= 'Day' )
                    // InternalSmartCE.g:3769:4: enumLiteral_3= 'Day'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCE.g:3776:3: (enumLiteral_4= 'Week' )
                    {
                    // InternalSmartCE.g:3776:3: (enumLiteral_4= 'Week' )
                    // InternalSmartCE.g:3777:4: enumLiteral_4= 'Week'
                    {
                    enumLiteral_4=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCE.g:3784:3: (enumLiteral_5= 'Month' )
                    {
                    // InternalSmartCE.g:3784:3: (enumLiteral_5= 'Month' )
                    // InternalSmartCE.g:3785:4: enumLiteral_5= 'Month'
                    {
                    enumLiteral_5=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMONTHEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTimeUnitAccess().getMONTHEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSmartCE.g:3792:3: (enumLiteral_6= 'Year' )
                    {
                    // InternalSmartCE.g:3792:3: (enumLiteral_6= 'Year' )
                    // InternalSmartCE.g:3793:4: enumLiteral_6= 'Year'
                    {
                    enumLiteral_6=(Token)match(input,85,FOLLOW_2); 

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


    // $ANTLR start "ruleParties"
    // InternalSmartCE.g:3803:1: ruleParties returns [Enumerator current=null] : ( (enumLiteral_0= 'application' ) | (enumLiteral_1= 'process' ) ) ;
    public final Enumerator ruleParties() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSmartCE.g:3809:2: ( ( (enumLiteral_0= 'application' ) | (enumLiteral_1= 'process' ) ) )
            // InternalSmartCE.g:3810:2: ( (enumLiteral_0= 'application' ) | (enumLiteral_1= 'process' ) )
            {
            // InternalSmartCE.g:3810:2: ( (enumLiteral_0= 'application' ) | (enumLiteral_1= 'process' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==17) ) {
                alt41=1;
            }
            else if ( (LA41_0==18) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalSmartCE.g:3811:3: (enumLiteral_0= 'application' )
                    {
                    // InternalSmartCE.g:3811:3: (enumLiteral_0= 'application' )
                    // InternalSmartCE.g:3812:4: enumLiteral_0= 'application'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getPartiesAccess().getAPPLICATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPartiesAccess().getAPPLICATIONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:3819:3: (enumLiteral_1= 'process' )
                    {
                    // InternalSmartCE.g:3819:3: (enumLiteral_1= 'process' )
                    // InternalSmartCE.g:3820:4: enumLiteral_1= 'process'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getPartiesAccess().getPROCESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPartiesAccess().getPROCESSEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleParties"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String dfa_1s = "\123\uffff";
    static final String dfa_2s = "\31\uffff\1\47\3\uffff\1\47\44\uffff\4\47\2\uffff\2\47\10\uffff\1\47";
    static final String dfa_3s = "\1\46\6\40\2\6\1\110\3\5\1\41\1\50\10\52\1\41\1\52\1\23\1\117\1\110\1\5\1\23\6\4\1\117\1\5\2\uffff\32\41\4\23\1\117\1\4\2\23\10\41\1\23";
    static final String dfa_4s = "\1\55\6\40\2\6\1\116\3\5\1\41\1\50\10\52\1\63\1\52\1\45\1\125\1\116\1\5\1\45\6\6\1\125\1\5\2\uffff\17\41\1\50\1\100\1\50\10\41\4\45\1\125\1\4\2\45\7\41\1\100\1\45";
    static final String dfa_5s = "\46\uffff\1\2\1\1\53\uffff";
    static final String dfa_6s = "\123\uffff}>";
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
            "\1\45",
            "\1\47\17\uffff\3\46",
            "\1\50\1\51\1\52\1\53\1\54\1\55\1\56",
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\65",
            "\1\66",
            "\1\47\17\uffff\3\46",
            "\1\70\1\67\1\71",
            "\1\70\1\67\1\71",
            "\1\70\1\67\1\71",
            "\1\70\1\67\1\71",
            "\1\70\1\67\1\71",
            "\1\70\1\67\1\71",
            "\1\72\1\73\1\74\1\75\1\76\1\77\1\100",
            "\1\101",
            "",
            "",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\103",
            "\1\103",
            "\1\103",
            "\1\103",
            "\1\103",
            "\1\103",
            "\1\103",
            "\1\104",
            "\1\105\6\uffff\1\106",
            "\1\105\6\uffff\1\106\27\uffff\1\107",
            "\1\105\6\uffff\1\106",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\111",
            "\1\47\17\uffff\3\46",
            "\1\47\17\uffff\3\46",
            "\1\47\17\uffff\3\46",
            "\1\47\17\uffff\3\46",
            "\1\112\1\113\1\114\1\115\1\116\1\117\1\120",
            "\1\121",
            "\1\47\17\uffff\3\46",
            "\1\47\17\uffff\3\46",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\105\6\uffff\1\106\27\uffff\1\107",
            "\1\47\17\uffff\3\46"
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
            return "797:2: (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition )";
        }
    }
    static final String dfa_8s = "\1\46\6\40\2\6\1\110\3\5\1\41\1\50\10\52\1\41\1\52\1\23\1\117\1\110\1\5\1\117\1\23\6\4\1\5\2\uffff\32\41\4\23\1\117\1\23\1\4\1\23\10\41\1\23";
    static final String dfa_9s = "\1\55\6\40\2\6\1\116\3\5\1\41\1\50\10\52\1\63\1\52\1\45\1\125\1\116\1\5\1\125\1\45\6\6\1\5\2\uffff\26\41\1\50\1\100\1\50\1\41\4\45\1\125\1\45\1\4\1\45\7\41\1\100\1\45";
    static final String dfa_10s = "\46\uffff\1\1\1\2\53\uffff";
    static final String[] dfa_11s = {
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
            "\1\36\6\uffff\1\35\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44",
            "\1\45",
            "\1\46\17\uffff\3\47",
            "\1\50\1\51\1\52\1\53\1\54\1\55\1\56",
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\65",
            "\1\66",
            "\1\67\1\70\1\71\1\72\1\73\1\74\1\75",
            "\1\46\17\uffff\3\47",
            "\1\77\1\76\1\100",
            "\1\77\1\76\1\100",
            "\1\77\1\76\1\100",
            "\1\77\1\76\1\100",
            "\1\77\1\76\1\100",
            "\1\77\1\76\1\100",
            "\1\101",
            "",
            "",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\103",
            "\1\103",
            "\1\103",
            "\1\103",
            "\1\103",
            "\1\103",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\107\6\uffff\1\106",
            "\1\107\6\uffff\1\106\27\uffff\1\110",
            "\1\107\6\uffff\1\106",
            "\1\111",
            "\1\46\17\uffff\3\47",
            "\1\46\17\uffff\3\47",
            "\1\46\17\uffff\3\47",
            "\1\46\17\uffff\3\47",
            "\1\112\1\113\1\114\1\115\1\116\1\117\1\120",
            "\1\46\17\uffff\3\47",
            "\1\121",
            "\1\46\17\uffff\3\47",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\107\6\uffff\1\106\27\uffff\1\110",
            "\1\46\17\uffff\3\47"
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_6;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "1062:4: ( ( (lv_conditions_12_0= ruleBusinessRule ) ) | ( ( (lv_conditions_13_0= ruleBusinessRule ) ) ( (lv_logicalOperators_14_0= ruleLogicalOperator ) ) ( (lv_conditions_15_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_16_0= ruleLogicalOperator ) ) ( (lv_conditions_17_0= ruleBusinessRule ) ) )* ) )";
        }
    }
    static final String dfa_12s = "\23\uffff";
    static final String dfa_13s = "\1\55\1\40\1\5\1\41\1\uffff\6\4\1\uffff\3\41\2\uffff\1\4\1\41";
    static final String dfa_14s = "\1\55\1\40\1\5\1\63\1\uffff\6\6\1\uffff\1\50\1\100\1\50\2\uffff\1\4\1\100";
    static final String dfa_15s = "\4\uffff\1\1\6\uffff\1\2\3\uffff\1\4\1\3\2\uffff";
    static final String dfa_16s = "\23\uffff}>";
    static final String[] dfa_17s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\6\uffff\1\13\5\uffff\1\5\1\6\1\7\1\10\1\11\1\12",
            "",
            "\1\15\1\14\1\16",
            "\1\15\1\14\1\16",
            "\1\15\1\14\1\16",
            "\1\15\1\14\1\16",
            "\1\15\1\14\1\16",
            "\1\15\1\14\1\16",
            "",
            "\1\20\6\uffff\1\17",
            "\1\20\6\uffff\1\17\27\uffff\1\21",
            "\1\20\6\uffff\1\17",
            "",
            "",
            "\1\22",
            "\1\20\6\uffff\1\17\27\uffff\1\21"
    };

    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_12;
            this.eof = dfa_12;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_16;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "1597:2: ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_binaryOperator_13_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_14_0= ruleStringValue ) ) | ( (lv_variableValue_15_0= ruleVariableValue ) ) | ( (lv_numericValue_16_0= ruleNumericValue ) ) ) otherlv_17= ')' ) | (otherlv_18= 'MessageContent' otherlv_19= '(' ( (lv_content_20_0= RULE_STRING ) ) ( (lv_binaryOperator_21_0= ruleBinaryOperator ) ) ( ( (lv_stringValue_22_0= ruleStringValue ) ) | ( (lv_variableValue_23_0= ruleVariableValue ) ) | ( (lv_numericValue_24_0= ruleNumericValue ) ) ) otherlv_25= 'by' ( (lv_timeUnit_26_0= ruleTimeUnit ) ) otherlv_27= ')' ) )";
        }
    }
    static final String dfa_18s = "\10\uffff";
    static final String dfa_19s = "\3\uffff\1\6\3\uffff\1\6";
    static final String dfa_20s = "\1\4\2\uffff\1\40\1\4\2\uffff\1\40";
    static final String dfa_21s = "\1\6\2\uffff\1\100\1\4\2\uffff\1\100";
    static final String dfa_22s = "\1\uffff\1\1\1\2\2\uffff\1\4\1\3\1\uffff";
    static final String dfa_23s = "\10\uffff}>";
    static final String[] dfa_24s = {
            "\1\3\1\2\1\1",
            "",
            "",
            "\1\5\1\6\14\uffff\7\6\2\uffff\2\6\1\uffff\6\6\1\4",
            "\1\7",
            "",
            "",
            "\1\5\1\6\14\uffff\7\6\2\uffff\2\6\1\uffff\6\6\1\4"
    };

    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_18;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "3156:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )";
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0060000000F80000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0060000000E80000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0060000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00003AC000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000003800000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x2200000100000070L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000003800080000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x00000000003F8000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007F00L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000FC00000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0010000200000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000000100000070L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0C0FC00000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000100000070L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});

}