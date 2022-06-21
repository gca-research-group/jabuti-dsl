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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'Contract'", "'{'", "'beginDate'", "'='", "'dueDate'", "'application'", "'process'", "'}'", "'Right'", "'Prohibition'", "'Obligation'", "'description'", "'rolePlayer'", "'operation'", "'condition'", "'onSuccess'", "'onBreach'", "'AND'", "'OR'", "'NOT'", "'Timeout'", "'('", "')'", "'OperationsLimit'", "'by'", "'BusinessDay'", "'to'", "'BusinessTime'", "'MessageContent'", "':'", "','", "'BusinessAction'", "'EventLog'", "'&&'", "'||'", "'!'", "'<='", "'>='", "'>'", "'<'", "'!='", "'=='", "'is'", "'as'", "'+'", "'-'", "'*'", "'/'", "'.'", "'.*'", "'push'", "'poll'", "'write'", "'read'", "'request'", "'response'", "'Sunday'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Second'", "'Minute'", "'Hour'", "'Day'", "'Week'", "'Month'", "'Year'"
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
    // InternalSmartCE.g:178:1: ruleContract returns [EObject current=null] : (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= RULE_STRING ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= RULE_STRING ) ) otherlv_9= 'application' otherlv_10= '=' ( (lv_application_11_0= ruleApplication ) ) otherlv_12= 'process' otherlv_13= '=' ( (lv_process_14_0= ruleProcess ) ) ( (lv_clauses_15_0= ruleClause ) )* ( (lv_actions_16_0= ruleAction ) )* otherlv_17= '}' ) ;
    public final EObject ruleContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_beginDate_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_dueDate_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_17=null;
        EObject lv_application_11_0 = null;

        EObject lv_process_14_0 = null;

        EObject lv_clauses_15_0 = null;

        EObject lv_actions_16_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:184:2: ( (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= RULE_STRING ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= RULE_STRING ) ) otherlv_9= 'application' otherlv_10= '=' ( (lv_application_11_0= ruleApplication ) ) otherlv_12= 'process' otherlv_13= '=' ( (lv_process_14_0= ruleProcess ) ) ( (lv_clauses_15_0= ruleClause ) )* ( (lv_actions_16_0= ruleAction ) )* otherlv_17= '}' ) )
            // InternalSmartCE.g:185:2: (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= RULE_STRING ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= RULE_STRING ) ) otherlv_9= 'application' otherlv_10= '=' ( (lv_application_11_0= ruleApplication ) ) otherlv_12= 'process' otherlv_13= '=' ( (lv_process_14_0= ruleProcess ) ) ( (lv_clauses_15_0= ruleClause ) )* ( (lv_actions_16_0= ruleAction ) )* otherlv_17= '}' )
            {
            // InternalSmartCE.g:185:2: (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= RULE_STRING ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= RULE_STRING ) ) otherlv_9= 'application' otherlv_10= '=' ( (lv_application_11_0= ruleApplication ) ) otherlv_12= 'process' otherlv_13= '=' ( (lv_process_14_0= ruleProcess ) ) ( (lv_clauses_15_0= ruleClause ) )* ( (lv_actions_16_0= ruleAction ) )* otherlv_17= '}' )
            // InternalSmartCE.g:186:3: otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= RULE_STRING ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= RULE_STRING ) ) otherlv_9= 'application' otherlv_10= '=' ( (lv_application_11_0= ruleApplication ) ) otherlv_12= 'process' otherlv_13= '=' ( (lv_process_14_0= ruleProcess ) ) ( (lv_clauses_15_0= ruleClause ) )* ( (lv_actions_16_0= ruleAction ) )* otherlv_17= '}'
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
            		
            // InternalSmartCE.g:220:3: ( (lv_beginDate_5_0= RULE_STRING ) )
            // InternalSmartCE.g:221:4: (lv_beginDate_5_0= RULE_STRING )
            {
            // InternalSmartCE.g:221:4: (lv_beginDate_5_0= RULE_STRING )
            // InternalSmartCE.g:222:5: lv_beginDate_5_0= RULE_STRING
            {
            lv_beginDate_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_beginDate_5_0, grammarAccess.getContractAccess().getBeginDateSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContractRule());
            					}
            					setWithLastConsumed(
            						current,
            						"beginDate",
            						lv_beginDate_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getContractAccess().getDueDateKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getContractAccess().getEqualsSignKeyword_7());
            		
            // InternalSmartCE.g:246:3: ( (lv_dueDate_8_0= RULE_STRING ) )
            // InternalSmartCE.g:247:4: (lv_dueDate_8_0= RULE_STRING )
            {
            // InternalSmartCE.g:247:4: (lv_dueDate_8_0= RULE_STRING )
            // InternalSmartCE.g:248:5: lv_dueDate_8_0= RULE_STRING
            {
            lv_dueDate_8_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_dueDate_8_0, grammarAccess.getContractAccess().getDueDateSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContractRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dueDate",
            						lv_dueDate_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getContractAccess().getApplicationKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getContractAccess().getEqualsSignKeyword_10());
            		
            // InternalSmartCE.g:272:3: ( (lv_application_11_0= ruleApplication ) )
            // InternalSmartCE.g:273:4: (lv_application_11_0= ruleApplication )
            {
            // InternalSmartCE.g:273:4: (lv_application_11_0= ruleApplication )
            // InternalSmartCE.g:274:5: lv_application_11_0= ruleApplication
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
            		
            otherlv_13=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_13, grammarAccess.getContractAccess().getEqualsSignKeyword_13());
            		
            // InternalSmartCE.g:299:3: ( (lv_process_14_0= ruleProcess ) )
            // InternalSmartCE.g:300:4: (lv_process_14_0= ruleProcess )
            {
            // InternalSmartCE.g:300:4: (lv_process_14_0= ruleProcess )
            // InternalSmartCE.g:301:5: lv_process_14_0= ruleProcess
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

            // InternalSmartCE.g:318:3: ( (lv_clauses_15_0= ruleClause ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=20 && LA3_0<=22)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmartCE.g:319:4: (lv_clauses_15_0= ruleClause )
            	    {
            	    // InternalSmartCE.g:319:4: (lv_clauses_15_0= ruleClause )
            	    // InternalSmartCE.g:320:5: lv_clauses_15_0= ruleClause
            	    {

            	    					newCompositeNode(grammarAccess.getContractAccess().getClausesClauseParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_clauses_15_0=ruleClause();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContractRule());
            	    					}
            	    					add(
            	    						current,
            	    						"clauses",
            	    						lv_clauses_15_0,
            	    						"br.edu.unijui.gca.smartce.SmartCE.Clause");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalSmartCE.g:337:3: ( (lv_actions_16_0= ruleAction ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=43 && LA4_0<=44)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSmartCE.g:338:4: (lv_actions_16_0= ruleAction )
            	    {
            	    // InternalSmartCE.g:338:4: (lv_actions_16_0= ruleAction )
            	    // InternalSmartCE.g:339:5: lv_actions_16_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getContractAccess().getActionsActionParserRuleCall_16_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_actions_16_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContractRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_16_0,
            	    						"br.edu.unijui.gca.smartce.SmartCE.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_17=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_17());
            		

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


    // $ANTLR start "entryRuleClause"
    // InternalSmartCE.g:364:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalSmartCE.g:364:47: (iv_ruleClause= ruleClause EOF )
            // InternalSmartCE.g:365:2: iv_ruleClause= ruleClause EOF
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
    // InternalSmartCE.g:371:1: ruleClause returns [EObject current=null] : ( (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'rolePlayer' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'operation' otherlv_12= '=' ( (lv_operation_13_0= ruleOperation ) ) otherlv_14= 'condition' otherlv_15= '{' ( (lv_condition_16_0= ruleCondition ) ) otherlv_17= '}' ( (otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) otherlv_20= 'onBreach' ( (lv_onBreach_21_0= ruleOnBreach ) ) ) | (otherlv_22= 'onBreach' ( (lv_onBreach_23_0= ruleOnBreach ) ) ) ) otherlv_24= '}' ) ;
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
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Enumerator lv_operation_13_0 = null;

        EObject lv_condition_16_0 = null;

        EObject lv_onSuccess_19_0 = null;

        EObject lv_onBreach_21_0 = null;

        EObject lv_onBreach_23_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:377:2: ( ( (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'rolePlayer' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'operation' otherlv_12= '=' ( (lv_operation_13_0= ruleOperation ) ) otherlv_14= 'condition' otherlv_15= '{' ( (lv_condition_16_0= ruleCondition ) ) otherlv_17= '}' ( (otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) otherlv_20= 'onBreach' ( (lv_onBreach_21_0= ruleOnBreach ) ) ) | (otherlv_22= 'onBreach' ( (lv_onBreach_23_0= ruleOnBreach ) ) ) ) otherlv_24= '}' ) )
            // InternalSmartCE.g:378:2: ( (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'rolePlayer' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'operation' otherlv_12= '=' ( (lv_operation_13_0= ruleOperation ) ) otherlv_14= 'condition' otherlv_15= '{' ( (lv_condition_16_0= ruleCondition ) ) otherlv_17= '}' ( (otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) otherlv_20= 'onBreach' ( (lv_onBreach_21_0= ruleOnBreach ) ) ) | (otherlv_22= 'onBreach' ( (lv_onBreach_23_0= ruleOnBreach ) ) ) ) otherlv_24= '}' )
            {
            // InternalSmartCE.g:378:2: ( (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'rolePlayer' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'operation' otherlv_12= '=' ( (lv_operation_13_0= ruleOperation ) ) otherlv_14= 'condition' otherlv_15= '{' ( (lv_condition_16_0= ruleCondition ) ) otherlv_17= '}' ( (otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) otherlv_20= 'onBreach' ( (lv_onBreach_21_0= ruleOnBreach ) ) ) | (otherlv_22= 'onBreach' ( (lv_onBreach_23_0= ruleOnBreach ) ) ) ) otherlv_24= '}' )
            // InternalSmartCE.g:379:3: (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'rolePlayer' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'operation' otherlv_12= '=' ( (lv_operation_13_0= ruleOperation ) ) otherlv_14= 'condition' otherlv_15= '{' ( (lv_condition_16_0= ruleCondition ) ) otherlv_17= '}' ( (otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) otherlv_20= 'onBreach' ( (lv_onBreach_21_0= ruleOnBreach ) ) ) | (otherlv_22= 'onBreach' ( (lv_onBreach_23_0= ruleOnBreach ) ) ) ) otherlv_24= '}'
            {
            // InternalSmartCE.g:379:3: (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
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
                    // InternalSmartCE.g:380:4: otherlv_0= 'Right'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getClauseAccess().getRightKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:385:4: otherlv_1= 'Prohibition'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getClauseAccess().getProhibitionKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:390:4: otherlv_2= 'Obligation'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getClauseAccess().getObligationKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalSmartCE.g:395:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSmartCE.g:396:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSmartCE.g:396:4: (lv_name_3_0= RULE_ID )
            // InternalSmartCE.g:397:5: lv_name_3_0= RULE_ID
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

            otherlv_4=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getClauseAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getClauseAccess().getDescriptionKeyword_3());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getClauseAccess().getEqualsSignKeyword_4());
            		
            // InternalSmartCE.g:425:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalSmartCE.g:426:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalSmartCE.g:426:4: (lv_description_7_0= RULE_STRING )
            // InternalSmartCE.g:427:5: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            otherlv_8=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getClauseAccess().getRolePlayerKeyword_6());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getClauseAccess().getEqualsSignKeyword_7());
            		
            // InternalSmartCE.g:451:3: ( (otherlv_10= RULE_ID ) )
            // InternalSmartCE.g:452:4: (otherlv_10= RULE_ID )
            {
            // InternalSmartCE.g:452:4: (otherlv_10= RULE_ID )
            // InternalSmartCE.g:453:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClauseRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_10, grammarAccess.getClauseAccess().getRolePlayerPartyCrossReference_8_0());
            				

            }


            }

            otherlv_11=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getClauseAccess().getOperationKeyword_9());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_12, grammarAccess.getClauseAccess().getEqualsSignKeyword_10());
            		
            // InternalSmartCE.g:472:3: ( (lv_operation_13_0= ruleOperation ) )
            // InternalSmartCE.g:473:4: (lv_operation_13_0= ruleOperation )
            {
            // InternalSmartCE.g:473:4: (lv_operation_13_0= ruleOperation )
            // InternalSmartCE.g:474:5: lv_operation_13_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getOperationOperationEnumRuleCall_11_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_14=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_14, grammarAccess.getClauseAccess().getConditionKeyword_12());
            		
            otherlv_15=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_15, grammarAccess.getClauseAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalSmartCE.g:499:3: ( (lv_condition_16_0= ruleCondition ) )
            // InternalSmartCE.g:500:4: (lv_condition_16_0= ruleCondition )
            {
            // InternalSmartCE.g:500:4: (lv_condition_16_0= ruleCondition )
            // InternalSmartCE.g:501:5: lv_condition_16_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getConditionConditionParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_17=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_17, grammarAccess.getClauseAccess().getRightCurlyBracketKeyword_15());
            		
            // InternalSmartCE.g:522:3: ( (otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) otherlv_20= 'onBreach' ( (lv_onBreach_21_0= ruleOnBreach ) ) ) | (otherlv_22= 'onBreach' ( (lv_onBreach_23_0= ruleOnBreach ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            else if ( (LA6_0==28) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmartCE.g:523:4: (otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) otherlv_20= 'onBreach' ( (lv_onBreach_21_0= ruleOnBreach ) ) )
                    {
                    // InternalSmartCE.g:523:4: (otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) otherlv_20= 'onBreach' ( (lv_onBreach_21_0= ruleOnBreach ) ) )
                    // InternalSmartCE.g:524:5: otherlv_18= 'onSuccess' ( (lv_onSuccess_19_0= ruleOnSuccess ) ) otherlv_20= 'onBreach' ( (lv_onBreach_21_0= ruleOnBreach ) )
                    {
                    otherlv_18=(Token)match(input,27,FOLLOW_23); 

                    					newLeafNode(otherlv_18, grammarAccess.getClauseAccess().getOnSuccessKeyword_16_0_0());
                    				
                    // InternalSmartCE.g:528:5: ( (lv_onSuccess_19_0= ruleOnSuccess ) )
                    // InternalSmartCE.g:529:6: (lv_onSuccess_19_0= ruleOnSuccess )
                    {
                    // InternalSmartCE.g:529:6: (lv_onSuccess_19_0= ruleOnSuccess )
                    // InternalSmartCE.g:530:7: lv_onSuccess_19_0= ruleOnSuccess
                    {

                    							newCompositeNode(grammarAccess.getClauseAccess().getOnSuccessOnSuccessParserRuleCall_16_0_1_0());
                    						
                    pushFollow(FOLLOW_24);
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

                    otherlv_20=(Token)match(input,28,FOLLOW_23); 

                    					newLeafNode(otherlv_20, grammarAccess.getClauseAccess().getOnBreachKeyword_16_0_2());
                    				
                    // InternalSmartCE.g:551:5: ( (lv_onBreach_21_0= ruleOnBreach ) )
                    // InternalSmartCE.g:552:6: (lv_onBreach_21_0= ruleOnBreach )
                    {
                    // InternalSmartCE.g:552:6: (lv_onBreach_21_0= ruleOnBreach )
                    // InternalSmartCE.g:553:7: lv_onBreach_21_0= ruleOnBreach
                    {

                    							newCompositeNode(grammarAccess.getClauseAccess().getOnBreachOnBreachParserRuleCall_16_0_3_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_onBreach_21_0=ruleOnBreach();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClauseRule());
                    							}
                    							set(
                    								current,
                    								"onBreach",
                    								lv_onBreach_21_0,
                    								"br.edu.unijui.gca.smartce.SmartCE.OnBreach");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:572:4: (otherlv_22= 'onBreach' ( (lv_onBreach_23_0= ruleOnBreach ) ) )
                    {
                    // InternalSmartCE.g:572:4: (otherlv_22= 'onBreach' ( (lv_onBreach_23_0= ruleOnBreach ) ) )
                    // InternalSmartCE.g:573:5: otherlv_22= 'onBreach' ( (lv_onBreach_23_0= ruleOnBreach ) )
                    {
                    otherlv_22=(Token)match(input,28,FOLLOW_23); 

                    					newLeafNode(otherlv_22, grammarAccess.getClauseAccess().getOnBreachKeyword_16_1_0());
                    				
                    // InternalSmartCE.g:577:5: ( (lv_onBreach_23_0= ruleOnBreach ) )
                    // InternalSmartCE.g:578:6: (lv_onBreach_23_0= ruleOnBreach )
                    {
                    // InternalSmartCE.g:578:6: (lv_onBreach_23_0= ruleOnBreach )
                    // InternalSmartCE.g:579:7: lv_onBreach_23_0= ruleOnBreach
                    {

                    							newCompositeNode(grammarAccess.getClauseAccess().getOnBreachOnBreachParserRuleCall_16_1_1_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_onBreach_23_0=ruleOnBreach();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClauseRule());
                    							}
                    							set(
                    								current,
                    								"onBreach",
                    								lv_onBreach_23_0,
                    								"br.edu.unijui.gca.smartce.SmartCE.OnBreach");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getClauseAccess().getRightCurlyBracketKeyword_17());
            		

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
    // InternalSmartCE.g:606:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalSmartCE.g:606:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalSmartCE.g:607:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalSmartCE.g:613:1: ruleCondition returns [EObject current=null] : (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_BusinessRule_0 = null;

        EObject this_CompositeCondition_1 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:619:2: ( (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition ) )
            // InternalSmartCE.g:620:2: (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition )
            {
            // InternalSmartCE.g:620:2: (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalSmartCE.g:621:3: this_BusinessRule_0= ruleBusinessRule
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
                    // InternalSmartCE.g:630:3: this_CompositeCondition_1= ruleCompositeCondition
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
    // InternalSmartCE.g:642:1: entryRuleBusinessRule returns [EObject current=null] : iv_ruleBusinessRule= ruleBusinessRule EOF ;
    public final EObject entryRuleBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessRule = null;


        try {
            // InternalSmartCE.g:642:53: (iv_ruleBusinessRule= ruleBusinessRule EOF )
            // InternalSmartCE.g:643:2: iv_ruleBusinessRule= ruleBusinessRule EOF
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
    // InternalSmartCE.g:649:1: ruleBusinessRule returns [EObject current=null] : (this_Timeout_0= ruleTimeout | this_OperationsLimit_1= ruleOperationsLimit | this_BusinessDay_2= ruleBusinessDay | this_BusinessTime_3= ruleBusinessTime | this_MessageContent_4= ruleMessageContent ) ;
    public final EObject ruleBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject this_Timeout_0 = null;

        EObject this_OperationsLimit_1 = null;

        EObject this_BusinessDay_2 = null;

        EObject this_BusinessTime_3 = null;

        EObject this_MessageContent_4 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:655:2: ( (this_Timeout_0= ruleTimeout | this_OperationsLimit_1= ruleOperationsLimit | this_BusinessDay_2= ruleBusinessDay | this_BusinessTime_3= ruleBusinessTime | this_MessageContent_4= ruleMessageContent ) )
            // InternalSmartCE.g:656:2: (this_Timeout_0= ruleTimeout | this_OperationsLimit_1= ruleOperationsLimit | this_BusinessDay_2= ruleBusinessDay | this_BusinessTime_3= ruleBusinessTime | this_MessageContent_4= ruleMessageContent )
            {
            // InternalSmartCE.g:656:2: (this_Timeout_0= ruleTimeout | this_OperationsLimit_1= ruleOperationsLimit | this_BusinessDay_2= ruleBusinessDay | this_BusinessTime_3= ruleBusinessTime | this_MessageContent_4= ruleMessageContent )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case 35:
                {
                alt8=2;
                }
                break;
            case 37:
                {
                alt8=3;
                }
                break;
            case 39:
                {
                alt8=4;
                }
                break;
            case 40:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSmartCE.g:657:3: this_Timeout_0= ruleTimeout
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
                    // InternalSmartCE.g:666:3: this_OperationsLimit_1= ruleOperationsLimit
                    {

                    			newCompositeNode(grammarAccess.getBusinessRuleAccess().getOperationsLimitParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationsLimit_1=ruleOperationsLimit();

                    state._fsp--;


                    			current = this_OperationsLimit_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:675:3: this_BusinessDay_2= ruleBusinessDay
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
                    // InternalSmartCE.g:684:3: this_BusinessTime_3= ruleBusinessTime
                    {

                    			newCompositeNode(grammarAccess.getBusinessRuleAccess().getBusinessTimeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BusinessTime_3=ruleBusinessTime();

                    state._fsp--;


                    			current = this_BusinessTime_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSmartCE.g:693:3: this_MessageContent_4= ruleMessageContent
                    {

                    			newCompositeNode(grammarAccess.getBusinessRuleAccess().getMessageContentParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MessageContent_4=ruleMessageContent();

                    state._fsp--;


                    			current = this_MessageContent_4;
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
    // InternalSmartCE.g:705:1: entryRuleCompositeCondition returns [EObject current=null] : iv_ruleCompositeCondition= ruleCompositeCondition EOF ;
    public final EObject entryRuleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCondition = null;


        try {
            // InternalSmartCE.g:705:59: (iv_ruleCompositeCondition= ruleCompositeCondition EOF )
            // InternalSmartCE.g:706:2: iv_ruleCompositeCondition= ruleCompositeCondition EOF
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
    // InternalSmartCE.g:712:1: ruleCompositeCondition returns [EObject current=null] : ( ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* ) ;
    public final EObject ruleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_conditions_0_0 = null;

        EObject lv_logicalOperators_1_0 = null;

        EObject lv_conditions_2_0 = null;

        EObject lv_logicalOperators_3_0 = null;

        EObject lv_conditions_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:718:2: ( ( ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* ) )
            // InternalSmartCE.g:719:2: ( ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* )
            {
            // InternalSmartCE.g:719:2: ( ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )* )
            // InternalSmartCE.g:720:3: ( (lv_conditions_0_0= ruleBusinessRule ) ) ( (lv_logicalOperators_1_0= ruleLogicalOperator ) ) ( (lv_conditions_2_0= ruleBusinessRule ) ) ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )*
            {
            // InternalSmartCE.g:720:3: ( (lv_conditions_0_0= ruleBusinessRule ) )
            // InternalSmartCE.g:721:4: (lv_conditions_0_0= ruleBusinessRule )
            {
            // InternalSmartCE.g:721:4: (lv_conditions_0_0= ruleBusinessRule )
            // InternalSmartCE.g:722:5: lv_conditions_0_0= ruleBusinessRule
            {

            					newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalSmartCE.g:739:3: ( (lv_logicalOperators_1_0= ruleLogicalOperator ) )
            // InternalSmartCE.g:740:4: (lv_logicalOperators_1_0= ruleLogicalOperator )
            {
            // InternalSmartCE.g:740:4: (lv_logicalOperators_1_0= ruleLogicalOperator )
            // InternalSmartCE.g:741:5: lv_logicalOperators_1_0= ruleLogicalOperator
            {

            					newCompositeNode(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsLogicalOperatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalSmartCE.g:758:3: ( (lv_conditions_2_0= ruleBusinessRule ) )
            // InternalSmartCE.g:759:4: (lv_conditions_2_0= ruleBusinessRule )
            {
            // InternalSmartCE.g:759:4: (lv_conditions_2_0= ruleBusinessRule )
            // InternalSmartCE.g:760:5: lv_conditions_2_0= ruleBusinessRule
            {

            					newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalSmartCE.g:777:3: ( ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=29 && LA9_0<=31)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSmartCE.g:778:4: ( (lv_logicalOperators_3_0= ruleLogicalOperator ) ) ( (lv_conditions_4_0= ruleBusinessRule ) )
            	    {
            	    // InternalSmartCE.g:778:4: ( (lv_logicalOperators_3_0= ruleLogicalOperator ) )
            	    // InternalSmartCE.g:779:5: (lv_logicalOperators_3_0= ruleLogicalOperator )
            	    {
            	    // InternalSmartCE.g:779:5: (lv_logicalOperators_3_0= ruleLogicalOperator )
            	    // InternalSmartCE.g:780:6: lv_logicalOperators_3_0= ruleLogicalOperator
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsLogicalOperatorParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_20);
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

            	    // InternalSmartCE.g:797:4: ( (lv_conditions_4_0= ruleBusinessRule ) )
            	    // InternalSmartCE.g:798:5: (lv_conditions_4_0= ruleBusinessRule )
            	    {
            	    // InternalSmartCE.g:798:5: (lv_conditions_4_0= ruleBusinessRule )
            	    // InternalSmartCE.g:799:6: lv_conditions_4_0= ruleBusinessRule
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
    // InternalSmartCE.g:821:1: entryRuleLogicalOperator returns [EObject current=null] : iv_ruleLogicalOperator= ruleLogicalOperator EOF ;
    public final EObject entryRuleLogicalOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOperator = null;


        try {
            // InternalSmartCE.g:821:56: (iv_ruleLogicalOperator= ruleLogicalOperator EOF )
            // InternalSmartCE.g:822:2: iv_ruleLogicalOperator= ruleLogicalOperator EOF
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
    // InternalSmartCE.g:828:1: ruleLogicalOperator returns [EObject current=null] : ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) ) ) ;
    public final EObject ruleLogicalOperator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;


        	enterRule();

        try {
            // InternalSmartCE.g:834:2: ( ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) ) ) )
            // InternalSmartCE.g:835:2: ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) ) )
            {
            // InternalSmartCE.g:835:2: ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) ) )
            // InternalSmartCE.g:836:3: ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) )
            {
            // InternalSmartCE.g:836:3: ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' ) )
            // InternalSmartCE.g:837:4: (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' )
            {
            // InternalSmartCE.g:837:4: (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'NOT' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt10=1;
                }
                break;
            case 30:
                {
                alt10=2;
                }
                break;
            case 31:
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
                    // InternalSmartCE.g:838:5: lv_name_0_1= 'AND'
                    {
                    lv_name_0_1=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getLogicalOperatorAccess().getNameANDKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:849:5: lv_name_0_2= 'OR'
                    {
                    lv_name_0_2=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getLogicalOperatorAccess().getNameORKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:860:5: lv_name_0_3= 'NOT'
                    {
                    lv_name_0_3=(Token)match(input,31,FOLLOW_2); 

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
    // InternalSmartCE.g:876:1: entryRuleTimeout returns [EObject current=null] : iv_ruleTimeout= ruleTimeout EOF ;
    public final EObject entryRuleTimeout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeout = null;


        try {
            // InternalSmartCE.g:876:48: (iv_ruleTimeout= ruleTimeout EOF )
            // InternalSmartCE.g:877:2: iv_ruleTimeout= ruleTimeout EOF
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
    // InternalSmartCE.g:883:1: ruleTimeout returns [EObject current=null] : (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleTimeout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSmartCE.g:889:2: ( (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalSmartCE.g:890:2: (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalSmartCE.g:890:2: (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalSmartCE.g:891:3: otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeoutAccess().getTimeoutKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeoutAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:899:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalSmartCE.g:900:4: (lv_value_2_0= RULE_INT )
            {
            // InternalSmartCE.g:900:4: (lv_value_2_0= RULE_INT )
            // InternalSmartCE.g:901:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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


    // $ANTLR start "entryRuleOperationsLimit"
    // InternalSmartCE.g:925:1: entryRuleOperationsLimit returns [EObject current=null] : iv_ruleOperationsLimit= ruleOperationsLimit EOF ;
    public final EObject entryRuleOperationsLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationsLimit = null;


        try {
            // InternalSmartCE.g:925:56: (iv_ruleOperationsLimit= ruleOperationsLimit EOF )
            // InternalSmartCE.g:926:2: iv_ruleOperationsLimit= ruleOperationsLimit EOF
            {
             newCompositeNode(grammarAccess.getOperationsLimitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationsLimit=ruleOperationsLimit();

            state._fsp--;

             current =iv_ruleOperationsLimit; 
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
    // $ANTLR end "entryRuleOperationsLimit"


    // $ANTLR start "ruleOperationsLimit"
    // InternalSmartCE.g:932:1: ruleOperationsLimit returns [EObject current=null] : (otherlv_0= 'OperationsLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' ) ;
    public final EObject ruleOperationsLimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_operationsNumber_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_timeUnit_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:938:2: ( (otherlv_0= 'OperationsLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' ) )
            // InternalSmartCE.g:939:2: (otherlv_0= 'OperationsLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' )
            {
            // InternalSmartCE.g:939:2: (otherlv_0= 'OperationsLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' )
            // InternalSmartCE.g:940:3: otherlv_0= 'OperationsLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationsLimitAccess().getOperationsLimitKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationsLimitAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:948:3: ( (lv_operationsNumber_2_0= RULE_INT ) )
            // InternalSmartCE.g:949:4: (lv_operationsNumber_2_0= RULE_INT )
            {
            // InternalSmartCE.g:949:4: (lv_operationsNumber_2_0= RULE_INT )
            // InternalSmartCE.g:950:5: lv_operationsNumber_2_0= RULE_INT
            {
            lv_operationsNumber_2_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_operationsNumber_2_0, grammarAccess.getOperationsLimitAccess().getOperationsNumberINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationsLimitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operationsNumber",
            						lv_operationsNumber_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationsLimitAccess().getByKeyword_3());
            		
            // InternalSmartCE.g:970:3: ( (lv_timeUnit_4_0= ruleTimeUnit ) )
            // InternalSmartCE.g:971:4: (lv_timeUnit_4_0= ruleTimeUnit )
            {
            // InternalSmartCE.g:971:4: (lv_timeUnit_4_0= ruleTimeUnit )
            // InternalSmartCE.g:972:5: lv_timeUnit_4_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getOperationsLimitAccess().getTimeUnitTimeUnitEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
            lv_timeUnit_4_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationsLimitRule());
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

            			newLeafNode(otherlv_5, grammarAccess.getOperationsLimitAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleOperationsLimit"


    // $ANTLR start "entryRuleBusinessDay"
    // InternalSmartCE.g:997:1: entryRuleBusinessDay returns [EObject current=null] : iv_ruleBusinessDay= ruleBusinessDay EOF ;
    public final EObject entryRuleBusinessDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessDay = null;


        try {
            // InternalSmartCE.g:997:52: (iv_ruleBusinessDay= ruleBusinessDay EOF )
            // InternalSmartCE.g:998:2: iv_ruleBusinessDay= ruleBusinessDay EOF
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
    // InternalSmartCE.g:1004:1: ruleBusinessDay returns [EObject current=null] : (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' ) ;
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
            // InternalSmartCE.g:1010:2: ( (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' ) )
            // InternalSmartCE.g:1011:2: (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' )
            {
            // InternalSmartCE.g:1011:2: (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' )
            // InternalSmartCE.g:1012:3: otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessDayAccess().getBusinessDayKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getBusinessDayAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:1020:3: ( (lv_start_2_0= ruleWeekDay ) )
            // InternalSmartCE.g:1021:4: (lv_start_2_0= ruleWeekDay )
            {
            // InternalSmartCE.g:1021:4: (lv_start_2_0= ruleWeekDay )
            // InternalSmartCE.g:1022:5: lv_start_2_0= ruleWeekDay
            {

            					newCompositeNode(grammarAccess.getBusinessDayAccess().getStartWeekDayEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
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

            otherlv_3=(Token)match(input,38,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getBusinessDayAccess().getToKeyword_3());
            		
            // InternalSmartCE.g:1043:3: ( (lv_end_4_0= ruleWeekDay ) )
            // InternalSmartCE.g:1044:4: (lv_end_4_0= ruleWeekDay )
            {
            // InternalSmartCE.g:1044:4: (lv_end_4_0= ruleWeekDay )
            // InternalSmartCE.g:1045:5: lv_end_4_0= ruleWeekDay
            {

            					newCompositeNode(grammarAccess.getBusinessDayAccess().getEndWeekDayEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
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


    // $ANTLR start "entryRuleBusinessTime"
    // InternalSmartCE.g:1070:1: entryRuleBusinessTime returns [EObject current=null] : iv_ruleBusinessTime= ruleBusinessTime EOF ;
    public final EObject entryRuleBusinessTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessTime = null;


        try {
            // InternalSmartCE.g:1070:53: (iv_ruleBusinessTime= ruleBusinessTime EOF )
            // InternalSmartCE.g:1071:2: iv_ruleBusinessTime= ruleBusinessTime EOF
            {
             newCompositeNode(grammarAccess.getBusinessTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBusinessTime=ruleBusinessTime();

            state._fsp--;

             current =iv_ruleBusinessTime; 
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
    // $ANTLR end "entryRuleBusinessTime"


    // $ANTLR start "ruleBusinessTime"
    // InternalSmartCE.g:1077:1: ruleBusinessTime returns [EObject current=null] : (otherlv_0= 'BusinessTime' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
    public final EObject ruleBusinessTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_start_2_0=null;
        Token otherlv_3=null;
        Token lv_end_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1083:2: ( (otherlv_0= 'BusinessTime' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalSmartCE.g:1084:2: (otherlv_0= 'BusinessTime' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalSmartCE.g:1084:2: (otherlv_0= 'BusinessTime' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalSmartCE.g:1085:3: otherlv_0= 'BusinessTime' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessTimeAccess().getBusinessTimeKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getBusinessTimeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:1093:3: ( (lv_start_2_0= RULE_STRING ) )
            // InternalSmartCE.g:1094:4: (lv_start_2_0= RULE_STRING )
            {
            // InternalSmartCE.g:1094:4: (lv_start_2_0= RULE_STRING )
            // InternalSmartCE.g:1095:5: lv_start_2_0= RULE_STRING
            {
            lv_start_2_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_start_2_0, grammarAccess.getBusinessTimeAccess().getStartSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusinessTimeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getBusinessTimeAccess().getToKeyword_3());
            		
            // InternalSmartCE.g:1115:3: ( (lv_end_4_0= RULE_STRING ) )
            // InternalSmartCE.g:1116:4: (lv_end_4_0= RULE_STRING )
            {
            // InternalSmartCE.g:1116:4: (lv_end_4_0= RULE_STRING )
            // InternalSmartCE.g:1117:5: lv_end_4_0= RULE_STRING
            {
            lv_end_4_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_end_4_0, grammarAccess.getBusinessTimeAccess().getEndSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusinessTimeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBusinessTimeAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleBusinessTime"


    // $ANTLR start "entryRuleMessageContent"
    // InternalSmartCE.g:1141:1: entryRuleMessageContent returns [EObject current=null] : iv_ruleMessageContent= ruleMessageContent EOF ;
    public final EObject entryRuleMessageContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageContent = null;


        try {
            // InternalSmartCE.g:1141:55: (iv_ruleMessageContent= ruleMessageContent EOF )
            // InternalSmartCE.g:1142:2: iv_ruleMessageContent= ruleMessageContent EOF
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
    // InternalSmartCE.g:1148:1: ruleMessageContent returns [EObject current=null] : (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleMessageContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1154:2: ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalSmartCE.g:1155:2: (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalSmartCE.g:1155:2: (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalSmartCE.g:1156:3: otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageContentAccess().getMessageContentKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:1164:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalSmartCE.g:1165:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalSmartCE.g:1165:4: (lv_content_2_0= RULE_STRING )
            // InternalSmartCE.g:1166:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_content_2_0, grammarAccess.getMessageContentAccess().getContentSTRINGTerminalRuleCall_2_0());
            				

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

            			newLeafNode(otherlv_3, grammarAccess.getMessageContentAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "entryRuleApplication"
    // InternalSmartCE.g:1190:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalSmartCE.g:1190:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalSmartCE.g:1191:2: iv_ruleApplication= ruleApplication EOF
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
    // InternalSmartCE.g:1197:1: ruleApplication returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1203:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) ) )
            // InternalSmartCE.g:1204:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // InternalSmartCE.g:1204:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) )
            // InternalSmartCE.g:1205:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) )
            {
            // InternalSmartCE.g:1205:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSmartCE.g:1206:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSmartCE.g:1206:4: (lv_name_0_0= RULE_ID )
            // InternalSmartCE.g:1207:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_name_0_0, grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplicationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationAccess().getColonKeyword_1());
            		
            // InternalSmartCE.g:1227:3: ( (lv_description_2_0= RULE_STRING ) )
            // InternalSmartCE.g:1228:4: (lv_description_2_0= RULE_STRING )
            {
            // InternalSmartCE.g:1228:4: (lv_description_2_0= RULE_STRING )
            // InternalSmartCE.g:1229:5: lv_description_2_0= RULE_STRING
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
    // InternalSmartCE.g:1249:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalSmartCE.g:1249:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalSmartCE.g:1250:2: iv_ruleProcess= ruleProcess EOF
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
    // InternalSmartCE.g:1256:1: ruleProcess returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1262:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) ) )
            // InternalSmartCE.g:1263:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // InternalSmartCE.g:1263:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) )
            // InternalSmartCE.g:1264:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) )
            {
            // InternalSmartCE.g:1264:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSmartCE.g:1265:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSmartCE.g:1265:4: (lv_name_0_0= RULE_ID )
            // InternalSmartCE.g:1266:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_name_0_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getColonKeyword_1());
            		
            // InternalSmartCE.g:1286:3: ( (lv_description_2_0= RULE_STRING ) )
            // InternalSmartCE.g:1287:4: (lv_description_2_0= RULE_STRING )
            {
            // InternalSmartCE.g:1287:4: (lv_description_2_0= RULE_STRING )
            // InternalSmartCE.g:1288:5: lv_description_2_0= RULE_STRING
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
    // InternalSmartCE.g:1308:1: entryRuleOnSuccess returns [EObject current=null] : iv_ruleOnSuccess= ruleOnSuccess EOF ;
    public final EObject entryRuleOnSuccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnSuccess = null;


        try {
            // InternalSmartCE.g:1308:50: (iv_ruleOnSuccess= ruleOnSuccess EOF )
            // InternalSmartCE.g:1309:2: iv_ruleOnSuccess= ruleOnSuccess EOF
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
    // InternalSmartCE.g:1315:1: ruleOnSuccess returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleOnSuccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:1321:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalSmartCE.g:1322:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalSmartCE.g:1322:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalSmartCE.g:1323:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOnSuccessAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSmartCE.g:1327:3: ( (otherlv_1= RULE_ID ) )
            // InternalSmartCE.g:1328:4: (otherlv_1= RULE_ID )
            {
            // InternalSmartCE.g:1328:4: (otherlv_1= RULE_ID )
            // InternalSmartCE.g:1329:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnSuccessRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_1, grammarAccess.getOnSuccessAccess().getActionActionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getOnSuccessAccess().getCommaKeyword_2());
            		
            // InternalSmartCE.g:1344:3: ( (lv_message_3_0= ruleExpression ) )
            // InternalSmartCE.g:1345:4: (lv_message_3_0= ruleExpression )
            {
            // InternalSmartCE.g:1345:4: (lv_message_3_0= ruleExpression )
            // InternalSmartCE.g:1346:5: lv_message_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOnSuccessAccess().getMessageExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_4=(Token)match(input,34,FOLLOW_2); 

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
    // InternalSmartCE.g:1371:1: entryRuleOnBreach returns [EObject current=null] : iv_ruleOnBreach= ruleOnBreach EOF ;
    public final EObject entryRuleOnBreach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnBreach = null;


        try {
            // InternalSmartCE.g:1371:49: (iv_ruleOnBreach= ruleOnBreach EOF )
            // InternalSmartCE.g:1372:2: iv_ruleOnBreach= ruleOnBreach EOF
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
    // InternalSmartCE.g:1378:1: ruleOnBreach returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleOnBreach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:1384:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalSmartCE.g:1385:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalSmartCE.g:1385:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalSmartCE.g:1386:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOnBreachAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSmartCE.g:1390:3: ( (otherlv_1= RULE_ID ) )
            // InternalSmartCE.g:1391:4: (otherlv_1= RULE_ID )
            {
            // InternalSmartCE.g:1391:4: (otherlv_1= RULE_ID )
            // InternalSmartCE.g:1392:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnBreachRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_1, grammarAccess.getOnBreachAccess().getActionActionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getOnBreachAccess().getCommaKeyword_2());
            		
            // InternalSmartCE.g:1407:3: ( (lv_message_3_0= ruleExpression ) )
            // InternalSmartCE.g:1408:4: (lv_message_3_0= ruleExpression )
            {
            // InternalSmartCE.g:1408:4: (lv_message_3_0= ruleExpression )
            // InternalSmartCE.g:1409:5: lv_message_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOnBreachAccess().getMessageExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_4=(Token)match(input,34,FOLLOW_2); 

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
    // InternalSmartCE.g:1434:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalSmartCE.g:1434:47: (iv_ruleAction= ruleAction EOF )
            // InternalSmartCE.g:1435:2: iv_ruleAction= ruleAction EOF
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
    // InternalSmartCE.g:1441:1: ruleAction returns [EObject current=null] : ( (otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' ) | (otherlv_7= 'EventLog' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parameters_10_0= ruleVariable ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleVariable ) ) )* otherlv_13= ')' ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_10_0 = null;

        EObject lv_parameters_12_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:1447:2: ( ( (otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' ) | (otherlv_7= 'EventLog' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parameters_10_0= ruleVariable ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleVariable ) ) )* otherlv_13= ')' ) ) )
            // InternalSmartCE.g:1448:2: ( (otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' ) | (otherlv_7= 'EventLog' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parameters_10_0= ruleVariable ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleVariable ) ) )* otherlv_13= ')' ) )
            {
            // InternalSmartCE.g:1448:2: ( (otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' ) | (otherlv_7= 'EventLog' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parameters_10_0= ruleVariable ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleVariable ) ) )* otherlv_13= ')' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            else if ( (LA13_0==44) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSmartCE.g:1449:3: (otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' )
                    {
                    // InternalSmartCE.g:1449:3: (otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' )
                    // InternalSmartCE.g:1450:4: otherlv_0= 'BusinessAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')'
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getActionAccess().getBusinessActionKeyword_0_0());
                    			
                    // InternalSmartCE.g:1454:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalSmartCE.g:1455:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalSmartCE.g:1455:5: (lv_name_1_0= RULE_ID )
                    // InternalSmartCE.g:1456:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalSmartCE.g:1476:4: ( (lv_parameters_3_0= ruleVariable ) )
                    // InternalSmartCE.g:1477:5: (lv_parameters_3_0= ruleVariable )
                    {
                    // InternalSmartCE.g:1477:5: (lv_parameters_3_0= ruleVariable )
                    // InternalSmartCE.g:1478:6: lv_parameters_3_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getParametersVariableParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_parameters_3_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"br.edu.unijui.gca.smartce.SmartCE.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmartCE.g:1495:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==42) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSmartCE.g:1496:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,42,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getActionAccess().getCommaKeyword_0_4_0());
                    	    				
                    	    // InternalSmartCE.g:1500:5: ( (lv_parameters_5_0= ruleVariable ) )
                    	    // InternalSmartCE.g:1501:6: (lv_parameters_5_0= ruleVariable )
                    	    {
                    	    // InternalSmartCE.g:1501:6: (lv_parameters_5_0= ruleVariable )
                    	    // InternalSmartCE.g:1502:7: lv_parameters_5_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getParametersVariableParserRuleCall_0_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_parameters_5_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActionRule());
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
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightParenthesisKeyword_0_5());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:1526:3: (otherlv_7= 'EventLog' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parameters_10_0= ruleVariable ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleVariable ) ) )* otherlv_13= ')' )
                    {
                    // InternalSmartCE.g:1526:3: (otherlv_7= 'EventLog' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parameters_10_0= ruleVariable ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleVariable ) ) )* otherlv_13= ')' )
                    // InternalSmartCE.g:1527:4: otherlv_7= 'EventLog' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parameters_10_0= ruleVariable ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleVariable ) ) )* otherlv_13= ')'
                    {
                    otherlv_7=(Token)match(input,44,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getActionAccess().getEventLogKeyword_1_0());
                    			
                    // InternalSmartCE.g:1531:4: ( (lv_name_8_0= RULE_ID ) )
                    // InternalSmartCE.g:1532:5: (lv_name_8_0= RULE_ID )
                    {
                    // InternalSmartCE.g:1532:5: (lv_name_8_0= RULE_ID )
                    // InternalSmartCE.g:1533:6: lv_name_8_0= RULE_ID
                    {
                    lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(lv_name_8_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getActionAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalSmartCE.g:1553:4: ( (lv_parameters_10_0= ruleVariable ) )
                    // InternalSmartCE.g:1554:5: (lv_parameters_10_0= ruleVariable )
                    {
                    // InternalSmartCE.g:1554:5: (lv_parameters_10_0= ruleVariable )
                    // InternalSmartCE.g:1555:6: lv_parameters_10_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getParametersVariableParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_parameters_10_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_10_0,
                    							"br.edu.unijui.gca.smartce.SmartCE.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmartCE.g:1572:4: (otherlv_11= ',' ( (lv_parameters_12_0= ruleVariable ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==42) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSmartCE.g:1573:5: otherlv_11= ',' ( (lv_parameters_12_0= ruleVariable ) )
                    	    {
                    	    otherlv_11=(Token)match(input,42,FOLLOW_5); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getActionAccess().getCommaKeyword_1_4_0());
                    	    				
                    	    // InternalSmartCE.g:1577:5: ( (lv_parameters_12_0= ruleVariable ) )
                    	    // InternalSmartCE.g:1578:6: (lv_parameters_12_0= ruleVariable )
                    	    {
                    	    // InternalSmartCE.g:1578:6: (lv_parameters_12_0= ruleVariable )
                    	    // InternalSmartCE.g:1579:7: lv_parameters_12_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getParametersVariableParserRuleCall_1_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_parameters_12_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_12_0,
                    	    								"br.edu.unijui.gca.smartce.SmartCE.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getActionAccess().getRightParenthesisKeyword_1_5());
                    			

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleVariable"
    // InternalSmartCE.g:1606:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSmartCE.g:1606:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalSmartCE.g:1607:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalSmartCE.g:1613:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1619:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) )
            // InternalSmartCE.g:1620:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            {
            // InternalSmartCE.g:1620:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            // InternalSmartCE.g:1621:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) )
            {
            // InternalSmartCE.g:1621:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSmartCE.g:1622:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSmartCE.g:1622:4: (lv_name_0_0= RULE_ID )
            // InternalSmartCE.g:1623:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_33); 

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

            otherlv_1=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getColonKeyword_1());
            		
            // InternalSmartCE.g:1643:3: ( (lv_type_2_0= RULE_ID ) )
            // InternalSmartCE.g:1644:4: (lv_type_2_0= RULE_ID )
            {
            // InternalSmartCE.g:1644:4: (lv_type_2_0= RULE_ID )
            // InternalSmartCE.g:1645:5: lv_type_2_0= RULE_ID
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
    // InternalSmartCE.g:1665:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSmartCE.g:1665:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSmartCE.g:1666:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalSmartCE.g:1672:1: ruleExpression returns [EObject current=null] : (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        Token lv_symbol_3_0=null;
        EObject this_Negation_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:1678:2: ( (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* ) )
            // InternalSmartCE.g:1679:2: (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* )
            {
            // InternalSmartCE.g:1679:2: (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* )
            // InternalSmartCE.g:1680:3: this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getNegationParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_Negation_0=ruleNegation();

            state._fsp--;


            			current = this_Negation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:1688:3: ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=45 && LA15_0<=46)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSmartCE.g:1689:4: () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) )
            	    {
            	    // InternalSmartCE.g:1689:4: ()
            	    // InternalSmartCE.g:1690:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:1696:4: ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==45) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==46) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalSmartCE.g:1697:5: ( (lv_symbol_2_0= '&&' ) )
            	            {
            	            // InternalSmartCE.g:1697:5: ( (lv_symbol_2_0= '&&' ) )
            	            // InternalSmartCE.g:1698:6: (lv_symbol_2_0= '&&' )
            	            {
            	            // InternalSmartCE.g:1698:6: (lv_symbol_2_0= '&&' )
            	            // InternalSmartCE.g:1699:7: lv_symbol_2_0= '&&'
            	            {
            	            lv_symbol_2_0=(Token)match(input,45,FOLLOW_35); 

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
            	            // InternalSmartCE.g:1712:5: ( (lv_symbol_3_0= '||' ) )
            	            {
            	            // InternalSmartCE.g:1712:5: ( (lv_symbol_3_0= '||' ) )
            	            // InternalSmartCE.g:1713:6: (lv_symbol_3_0= '||' )
            	            {
            	            // InternalSmartCE.g:1713:6: (lv_symbol_3_0= '||' )
            	            // InternalSmartCE.g:1714:7: lv_symbol_3_0= '||'
            	            {
            	            lv_symbol_3_0=(Token)match(input,46,FOLLOW_35); 

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

            	    // InternalSmartCE.g:1727:4: ( (lv_right_4_0= ruleNegation ) )
            	    // InternalSmartCE.g:1728:5: (lv_right_4_0= ruleNegation )
            	    {
            	    // InternalSmartCE.g:1728:5: (lv_right_4_0= ruleNegation )
            	    // InternalSmartCE.g:1729:6: lv_right_4_0= ruleNegation
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightNegationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleNegation"
    // InternalSmartCE.g:1751:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalSmartCE.g:1751:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalSmartCE.g:1752:2: iv_ruleNegation= ruleNegation EOF
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
    // InternalSmartCE.g:1758:1: ruleNegation returns [EObject current=null] : (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        EObject this_Comparison_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:1764:2: ( (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) ) )
            // InternalSmartCE.g:1765:2: (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) )
            {
            // InternalSmartCE.g:1765:2: (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||LA16_0==33||LA16_0==57) ) {
                alt16=1;
            }
            else if ( (LA16_0==47) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSmartCE.g:1766:3: this_Comparison_0= ruleComparison
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
                    // InternalSmartCE.g:1775:3: ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) )
                    {
                    // InternalSmartCE.g:1775:3: ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) )
                    // InternalSmartCE.g:1776:4: () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) )
                    {
                    // InternalSmartCE.g:1776:4: ()
                    // InternalSmartCE.g:1777:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegationAccess().getUnaryOperatorAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSmartCE.g:1783:4: ( (lv_symbol_2_0= '!' ) )
                    // InternalSmartCE.g:1784:5: (lv_symbol_2_0= '!' )
                    {
                    // InternalSmartCE.g:1784:5: (lv_symbol_2_0= '!' )
                    // InternalSmartCE.g:1785:6: lv_symbol_2_0= '!'
                    {
                    lv_symbol_2_0=(Token)match(input,47,FOLLOW_38); 

                    						newLeafNode(lv_symbol_2_0, grammarAccess.getNegationAccess().getSymbolExclamationMarkKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNegationRule());
                    						}
                    						setWithLastConsumed(current, "symbol", lv_symbol_2_0, "!");
                    					

                    }


                    }

                    // InternalSmartCE.g:1797:4: ( (lv_expression_3_0= ruleComparison ) )
                    // InternalSmartCE.g:1798:5: (lv_expression_3_0= ruleComparison )
                    {
                    // InternalSmartCE.g:1798:5: (lv_expression_3_0= ruleComparison )
                    // InternalSmartCE.g:1799:6: lv_expression_3_0= ruleComparison
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
    // InternalSmartCE.g:1821:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalSmartCE.g:1821:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalSmartCE.g:1822:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalSmartCE.g:1828:1: ruleComparison returns [EObject current=null] : (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* ) ;
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
            // InternalSmartCE.g:1834:2: ( (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* ) )
            // InternalSmartCE.g:1835:2: (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* )
            {
            // InternalSmartCE.g:1835:2: (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* )
            // InternalSmartCE.g:1836:3: this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            this_Plus_0=rulePlus();

            state._fsp--;


            			current = this_Plus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:1844:3: ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=48 && LA18_0<=55)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSmartCE.g:1845:4: () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) )
            	    {
            	    // InternalSmartCE.g:1845:4: ()
            	    // InternalSmartCE.g:1846:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:1852:4: ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) )
            	    int alt17=8;
            	    switch ( input.LA(1) ) {
            	    case 48:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt17=4;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt17=5;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt17=6;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt17=7;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt17=8;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // InternalSmartCE.g:1853:5: ( (lv_symbol_2_0= '<=' ) )
            	            {
            	            // InternalSmartCE.g:1853:5: ( (lv_symbol_2_0= '<=' ) )
            	            // InternalSmartCE.g:1854:6: (lv_symbol_2_0= '<=' )
            	            {
            	            // InternalSmartCE.g:1854:6: (lv_symbol_2_0= '<=' )
            	            // InternalSmartCE.g:1855:7: lv_symbol_2_0= '<='
            	            {
            	            lv_symbol_2_0=(Token)match(input,48,FOLLOW_38); 

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
            	            // InternalSmartCE.g:1868:5: ( (lv_symbol_3_0= '>=' ) )
            	            {
            	            // InternalSmartCE.g:1868:5: ( (lv_symbol_3_0= '>=' ) )
            	            // InternalSmartCE.g:1869:6: (lv_symbol_3_0= '>=' )
            	            {
            	            // InternalSmartCE.g:1869:6: (lv_symbol_3_0= '>=' )
            	            // InternalSmartCE.g:1870:7: lv_symbol_3_0= '>='
            	            {
            	            lv_symbol_3_0=(Token)match(input,49,FOLLOW_38); 

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
            	            // InternalSmartCE.g:1883:5: ( (lv_symbol_4_0= '>' ) )
            	            {
            	            // InternalSmartCE.g:1883:5: ( (lv_symbol_4_0= '>' ) )
            	            // InternalSmartCE.g:1884:6: (lv_symbol_4_0= '>' )
            	            {
            	            // InternalSmartCE.g:1884:6: (lv_symbol_4_0= '>' )
            	            // InternalSmartCE.g:1885:7: lv_symbol_4_0= '>'
            	            {
            	            lv_symbol_4_0=(Token)match(input,50,FOLLOW_38); 

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
            	            // InternalSmartCE.g:1898:5: ( (lv_symbol_5_0= '<' ) )
            	            {
            	            // InternalSmartCE.g:1898:5: ( (lv_symbol_5_0= '<' ) )
            	            // InternalSmartCE.g:1899:6: (lv_symbol_5_0= '<' )
            	            {
            	            // InternalSmartCE.g:1899:6: (lv_symbol_5_0= '<' )
            	            // InternalSmartCE.g:1900:7: lv_symbol_5_0= '<'
            	            {
            	            lv_symbol_5_0=(Token)match(input,51,FOLLOW_38); 

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
            	            // InternalSmartCE.g:1913:5: ( (lv_symbol_6_0= '!=' ) )
            	            {
            	            // InternalSmartCE.g:1913:5: ( (lv_symbol_6_0= '!=' ) )
            	            // InternalSmartCE.g:1914:6: (lv_symbol_6_0= '!=' )
            	            {
            	            // InternalSmartCE.g:1914:6: (lv_symbol_6_0= '!=' )
            	            // InternalSmartCE.g:1915:7: lv_symbol_6_0= '!='
            	            {
            	            lv_symbol_6_0=(Token)match(input,52,FOLLOW_38); 

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
            	            // InternalSmartCE.g:1928:5: ( (lv_symbol_7_0= '==' ) )
            	            {
            	            // InternalSmartCE.g:1928:5: ( (lv_symbol_7_0= '==' ) )
            	            // InternalSmartCE.g:1929:6: (lv_symbol_7_0= '==' )
            	            {
            	            // InternalSmartCE.g:1929:6: (lv_symbol_7_0= '==' )
            	            // InternalSmartCE.g:1930:7: lv_symbol_7_0= '=='
            	            {
            	            lv_symbol_7_0=(Token)match(input,53,FOLLOW_38); 

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
            	            // InternalSmartCE.g:1943:5: ( (lv_symbol_8_0= 'is' ) )
            	            {
            	            // InternalSmartCE.g:1943:5: ( (lv_symbol_8_0= 'is' ) )
            	            // InternalSmartCE.g:1944:6: (lv_symbol_8_0= 'is' )
            	            {
            	            // InternalSmartCE.g:1944:6: (lv_symbol_8_0= 'is' )
            	            // InternalSmartCE.g:1945:7: lv_symbol_8_0= 'is'
            	            {
            	            lv_symbol_8_0=(Token)match(input,54,FOLLOW_38); 

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
            	            // InternalSmartCE.g:1958:5: ( (lv_symbol_9_0= 'as' ) )
            	            {
            	            // InternalSmartCE.g:1958:5: ( (lv_symbol_9_0= 'as' ) )
            	            // InternalSmartCE.g:1959:6: (lv_symbol_9_0= 'as' )
            	            {
            	            // InternalSmartCE.g:1959:6: (lv_symbol_9_0= 'as' )
            	            // InternalSmartCE.g:1960:7: lv_symbol_9_0= 'as'
            	            {
            	            lv_symbol_9_0=(Token)match(input,55,FOLLOW_38); 

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

            	    // InternalSmartCE.g:1973:4: ( (lv_right_10_0= rulePlus ) )
            	    // InternalSmartCE.g:1974:5: (lv_right_10_0= rulePlus )
            	    {
            	    // InternalSmartCE.g:1974:5: (lv_right_10_0= rulePlus )
            	    // InternalSmartCE.g:1975:6: lv_right_10_0= rulePlus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_39);
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
            	    break loop18;
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
    // InternalSmartCE.g:1997:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalSmartCE.g:1997:45: (iv_rulePlus= rulePlus EOF )
            // InternalSmartCE.g:1998:2: iv_rulePlus= rulePlus EOF
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
    // InternalSmartCE.g:2004:1: rulePlus returns [EObject current=null] : (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2010:2: ( (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* ) )
            // InternalSmartCE.g:2011:2: (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* )
            {
            // InternalSmartCE.g:2011:2: (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* )
            // InternalSmartCE.g:2012:3: this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:2020:3: ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=56 && LA20_0<=57)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSmartCE.g:2021:4: () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) )
            	    {
            	    // InternalSmartCE.g:2021:4: ()
            	    // InternalSmartCE.g:2022:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPlusAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:2028:4: (otherlv_2= '+' | otherlv_3= '-' )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==56) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==57) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalSmartCE.g:2029:5: otherlv_2= '+'
            	            {
            	            otherlv_2=(Token)match(input,56,FOLLOW_38); 

            	            					newLeafNode(otherlv_2, grammarAccess.getPlusAccess().getPlusSignKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSmartCE.g:2034:5: otherlv_3= '-'
            	            {
            	            otherlv_3=(Token)match(input,57,FOLLOW_38); 

            	            					newLeafNode(otherlv_3, grammarAccess.getPlusAccess().getHyphenMinusKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSmartCE.g:2039:4: ( (lv_right_4_0= ruleFactor ) )
            	    // InternalSmartCE.g:2040:5: (lv_right_4_0= ruleFactor )
            	    {
            	    // InternalSmartCE.g:2040:5: (lv_right_4_0= ruleFactor )
            	    // InternalSmartCE.g:2041:6: lv_right_4_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getPlusAccess().getRightFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_40);
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
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleFactor"
    // InternalSmartCE.g:2063:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalSmartCE.g:2063:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalSmartCE.g:2064:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalSmartCE.g:2070:1: ruleFactor returns [EObject current=null] : (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Negative_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2076:2: ( (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* ) )
            // InternalSmartCE.g:2077:2: (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* )
            {
            // InternalSmartCE.g:2077:2: (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* )
            // InternalSmartCE.g:2078:3: this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getNegativeParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_Negative_0=ruleNegative();

            state._fsp--;


            			current = this_Negative_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:2086:3: ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=58 && LA22_0<=59)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSmartCE.g:2087:4: () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) )
            	    {
            	    // InternalSmartCE.g:2087:4: ()
            	    // InternalSmartCE.g:2088:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFactorAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:2094:4: (otherlv_2= '*' | otherlv_3= '/' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==58) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==59) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalSmartCE.g:2095:5: otherlv_2= '*'
            	            {
            	            otherlv_2=(Token)match(input,58,FOLLOW_38); 

            	            					newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSmartCE.g:2100:5: otherlv_3= '/'
            	            {
            	            otherlv_3=(Token)match(input,59,FOLLOW_38); 

            	            					newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSmartCE.g:2105:4: ( (lv_right_4_0= ruleNegative ) )
            	    // InternalSmartCE.g:2106:5: (lv_right_4_0= ruleNegative )
            	    {
            	    // InternalSmartCE.g:2106:5: (lv_right_4_0= ruleNegative )
            	    // InternalSmartCE.g:2107:6: lv_right_4_0= ruleNegative
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightNegativeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_41);
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleNegative"
    // InternalSmartCE.g:2129:1: entryRuleNegative returns [EObject current=null] : iv_ruleNegative= ruleNegative EOF ;
    public final EObject entryRuleNegative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegative = null;


        try {
            // InternalSmartCE.g:2129:49: (iv_ruleNegative= ruleNegative EOF )
            // InternalSmartCE.g:2130:2: iv_ruleNegative= ruleNegative EOF
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
    // InternalSmartCE.g:2136:1: ruleNegative returns [EObject current=null] : (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) ) ;
    public final EObject ruleNegative() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2142:2: ( (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) ) )
            // InternalSmartCE.g:2143:2: (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) )
            {
            // InternalSmartCE.g:2143:2: (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_INT)||LA23_0==33) ) {
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
                    // InternalSmartCE.g:2144:3: this_Primary_0= rulePrimary
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
                    // InternalSmartCE.g:2153:3: ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) )
                    {
                    // InternalSmartCE.g:2153:3: ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) )
                    // InternalSmartCE.g:2154:4: () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) )
                    {
                    // InternalSmartCE.g:2154:4: ()
                    // InternalSmartCE.g:2155:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegativeAccess().getUnaryOperatorAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,57,FOLLOW_42); 

                    				newLeafNode(otherlv_2, grammarAccess.getNegativeAccess().getHyphenMinusKeyword_1_1());
                    			
                    // InternalSmartCE.g:2165:4: ( (lv_expression_3_0= rulePrimary ) )
                    // InternalSmartCE.g:2166:5: (lv_expression_3_0= rulePrimary )
                    {
                    // InternalSmartCE.g:2166:5: (lv_expression_3_0= rulePrimary )
                    // InternalSmartCE.g:2167:6: lv_expression_3_0= rulePrimary
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
    // InternalSmartCE.g:2189:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSmartCE.g:2189:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSmartCE.g:2190:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalSmartCE.g:2196:1: rulePrimary returns [EObject current=null] : (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_LiteralValue_0 = null;

        EObject this_Expression_2 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2202:2: ( (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) )
            // InternalSmartCE.g:2203:2: (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            {
            // InternalSmartCE.g:2203:2: (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_INT)) ) {
                alt24=1;
            }
            else if ( (LA24_0==33) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalSmartCE.g:2204:3: this_LiteralValue_0= ruleLiteralValue
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
                    // InternalSmartCE.g:2213:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalSmartCE.g:2213:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalSmartCE.g:2214:4: otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_35); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_28);
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
    // InternalSmartCE.g:2235:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // InternalSmartCE.g:2235:53: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // InternalSmartCE.g:2236:2: iv_ruleLiteralValue= ruleLiteralValue EOF
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
    // InternalSmartCE.g:2242:1: ruleLiteralValue returns [EObject current=null] : (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject this_NumericValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_VariableValue_2 = null;

        EObject this_FunctionCall_3 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2248:2: ( (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall ) )
            // InternalSmartCE.g:2249:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )
            {
            // InternalSmartCE.g:2249:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )
            int alt25=4;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalSmartCE.g:2250:3: this_NumericValue_0= ruleNumericValue
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
                    // InternalSmartCE.g:2259:3: this_StringValue_1= ruleStringValue
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
                    // InternalSmartCE.g:2268:3: this_VariableValue_2= ruleVariableValue
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
                    // InternalSmartCE.g:2277:3: this_FunctionCall_3= ruleFunctionCall
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
    // InternalSmartCE.g:2289:1: entryRuleNumericValue returns [EObject current=null] : iv_ruleNumericValue= ruleNumericValue EOF ;
    public final EObject entryRuleNumericValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericValue = null;


        try {
            // InternalSmartCE.g:2289:53: (iv_ruleNumericValue= ruleNumericValue EOF )
            // InternalSmartCE.g:2290:2: iv_ruleNumericValue= ruleNumericValue EOF
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
    // InternalSmartCE.g:2296:1: ruleNumericValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumericValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2302:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalSmartCE.g:2303:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalSmartCE.g:2303:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalSmartCE.g:2304:3: (lv_value_0_0= RULE_INT )
            {
            // InternalSmartCE.g:2304:3: (lv_value_0_0= RULE_INT )
            // InternalSmartCE.g:2305:4: lv_value_0_0= RULE_INT
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
    // InternalSmartCE.g:2324:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalSmartCE.g:2324:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalSmartCE.g:2325:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalSmartCE.g:2331:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2337:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSmartCE.g:2338:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSmartCE.g:2338:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSmartCE.g:2339:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalSmartCE.g:2339:3: (lv_value_0_0= RULE_STRING )
            // InternalSmartCE.g:2340:4: lv_value_0_0= RULE_STRING
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
    // InternalSmartCE.g:2359:1: entryRuleVariableValue returns [EObject current=null] : iv_ruleVariableValue= ruleVariableValue EOF ;
    public final EObject entryRuleVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableValue = null;


        try {
            // InternalSmartCE.g:2359:54: (iv_ruleVariableValue= ruleVariableValue EOF )
            // InternalSmartCE.g:2360:2: iv_ruleVariableValue= ruleVariableValue EOF
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
    // InternalSmartCE.g:2366:1: ruleVariableValue returns [EObject current=null] : ( (lv_value_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleVariableValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2372:2: ( ( (lv_value_0_0= ruleQualifiedName ) ) )
            // InternalSmartCE.g:2373:2: ( (lv_value_0_0= ruleQualifiedName ) )
            {
            // InternalSmartCE.g:2373:2: ( (lv_value_0_0= ruleQualifiedName ) )
            // InternalSmartCE.g:2374:3: (lv_value_0_0= ruleQualifiedName )
            {
            // InternalSmartCE.g:2374:3: (lv_value_0_0= ruleQualifiedName )
            // InternalSmartCE.g:2375:4: lv_value_0_0= ruleQualifiedName
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
    // InternalSmartCE.g:2395:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalSmartCE.g:2395:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalSmartCE.g:2396:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalSmartCE.g:2402:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' ) ;
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
            // InternalSmartCE.g:2408:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' ) )
            // InternalSmartCE.g:2409:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            {
            // InternalSmartCE.g:2409:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            // InternalSmartCE.g:2410:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')'
            {
            // InternalSmartCE.g:2410:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalSmartCE.g:2411:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalSmartCE.g:2411:4: (lv_name_0_0= ruleQualifiedName )
            // InternalSmartCE.g:2412:5: lv_name_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getNameQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_1=(Token)match(input,33,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:2433:3: ( (lv_params_2_0= ruleExpression ) )
            // InternalSmartCE.g:2434:4: (lv_params_2_0= ruleExpression )
            {
            // InternalSmartCE.g:2434:4: (lv_params_2_0= ruleExpression )
            // InternalSmartCE.g:2435:5: lv_params_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getParamsExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalSmartCE.g:2452:3: (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==42) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSmartCE.g:2453:4: otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,42,FOLLOW_35); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSmartCE.g:2457:4: ( (lv_params_4_0= ruleExpression ) )
            	    // InternalSmartCE.g:2458:5: (lv_params_4_0= ruleExpression )
            	    {
            	    // InternalSmartCE.g:2458:5: (lv_params_4_0= ruleExpression )
            	    // InternalSmartCE.g:2459:6: lv_params_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionCallAccess().getParamsExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
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
            	    break loop26;
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
    // InternalSmartCE.g:2485:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSmartCE.g:2485:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSmartCE.g:2486:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalSmartCE.g:2492:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2498:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSmartCE.g:2499:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSmartCE.g:2499:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSmartCE.g:2500:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_43); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSmartCE.g:2507:3: (kw= '.' this_ID_2= RULE_ID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==60) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSmartCE.g:2508:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,60,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_43); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalSmartCE.g:2525:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalSmartCE.g:2525:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalSmartCE.g:2526:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalSmartCE.g:2532:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2538:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.*' ) )
            // InternalSmartCE.g:2539:2: (this_QualifiedName_0= ruleQualifiedName kw= '.*' )
            {
            // InternalSmartCE.g:2539:2: (this_QualifiedName_0= ruleQualifiedName kw= '.*' )
            // InternalSmartCE.g:2540:3: this_QualifiedName_0= ruleQualifiedName kw= '.*'
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,61,FOLLOW_2); 

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
    // InternalSmartCE.g:2559:1: entryRuleYEAR returns [String current=null] : iv_ruleYEAR= ruleYEAR EOF ;
    public final String entryRuleYEAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleYEAR = null;


        try {
            // InternalSmartCE.g:2559:44: (iv_ruleYEAR= ruleYEAR EOF )
            // InternalSmartCE.g:2560:2: iv_ruleYEAR= ruleYEAR EOF
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
    // InternalSmartCE.g:2566:1: ruleYEAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleYEAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2572:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:2573:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:2583:1: entryRuleMONTH returns [String current=null] : iv_ruleMONTH= ruleMONTH EOF ;
    public final String entryRuleMONTH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMONTH = null;


        try {
            // InternalSmartCE.g:2583:45: (iv_ruleMONTH= ruleMONTH EOF )
            // InternalSmartCE.g:2584:2: iv_ruleMONTH= ruleMONTH EOF
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
    // InternalSmartCE.g:2590:1: ruleMONTH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleMONTH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2596:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:2597:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:2607:1: entryRuleDAY returns [String current=null] : iv_ruleDAY= ruleDAY EOF ;
    public final String entryRuleDAY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDAY = null;


        try {
            // InternalSmartCE.g:2607:43: (iv_ruleDAY= ruleDAY EOF )
            // InternalSmartCE.g:2608:2: iv_ruleDAY= ruleDAY EOF
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
    // InternalSmartCE.g:2614:1: ruleDAY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleDAY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2620:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:2621:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:2631:1: entryRuleHOUR returns [String current=null] : iv_ruleHOUR= ruleHOUR EOF ;
    public final String entryRuleHOUR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHOUR = null;


        try {
            // InternalSmartCE.g:2631:44: (iv_ruleHOUR= ruleHOUR EOF )
            // InternalSmartCE.g:2632:2: iv_ruleHOUR= ruleHOUR EOF
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
    // InternalSmartCE.g:2638:1: ruleHOUR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleHOUR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2644:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:2645:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:2655:1: entryRuleMIN returns [String current=null] : iv_ruleMIN= ruleMIN EOF ;
    public final String entryRuleMIN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMIN = null;


        try {
            // InternalSmartCE.g:2655:43: (iv_ruleMIN= ruleMIN EOF )
            // InternalSmartCE.g:2656:2: iv_ruleMIN= ruleMIN EOF
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
    // InternalSmartCE.g:2662:1: ruleMIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleMIN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2668:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:2669:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:2679:1: entryRuleSEC returns [String current=null] : iv_ruleSEC= ruleSEC EOF ;
    public final String entryRuleSEC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSEC = null;


        try {
            // InternalSmartCE.g:2679:43: (iv_ruleSEC= ruleSEC EOF )
            // InternalSmartCE.g:2680:2: iv_ruleSEC= ruleSEC EOF
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
    // InternalSmartCE.g:2686:1: ruleSEC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleSEC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2692:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:2693:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:2703:1: ruleOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) ) ;
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
            // InternalSmartCE.g:2709:2: ( ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) ) )
            // InternalSmartCE.g:2710:2: ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) )
            {
            // InternalSmartCE.g:2710:2: ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) )
            int alt28=6;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt28=1;
                }
                break;
            case 63:
                {
                alt28=2;
                }
                break;
            case 64:
                {
                alt28=3;
                }
                break;
            case 65:
                {
                alt28=4;
                }
                break;
            case 66:
                {
                alt28=5;
                }
                break;
            case 67:
                {
                alt28=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalSmartCE.g:2711:3: (enumLiteral_0= 'push' )
                    {
                    // InternalSmartCE.g:2711:3: (enumLiteral_0= 'push' )
                    // InternalSmartCE.g:2712:4: enumLiteral_0= 'push'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getPUSHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationAccess().getPUSHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:2719:3: (enumLiteral_1= 'poll' )
                    {
                    // InternalSmartCE.g:2719:3: (enumLiteral_1= 'poll' )
                    // InternalSmartCE.g:2720:4: enumLiteral_1= 'poll'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getPOLLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationAccess().getPOLLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:2727:3: (enumLiteral_2= 'write' )
                    {
                    // InternalSmartCE.g:2727:3: (enumLiteral_2= 'write' )
                    // InternalSmartCE.g:2728:4: enumLiteral_2= 'write'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getWRITEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperationAccess().getWRITEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:2735:3: (enumLiteral_3= 'read' )
                    {
                    // InternalSmartCE.g:2735:3: (enumLiteral_3= 'read' )
                    // InternalSmartCE.g:2736:4: enumLiteral_3= 'read'
                    {
                    enumLiteral_3=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getREADEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperationAccess().getREADEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCE.g:2743:3: (enumLiteral_4= 'request' )
                    {
                    // InternalSmartCE.g:2743:3: (enumLiteral_4= 'request' )
                    // InternalSmartCE.g:2744:4: enumLiteral_4= 'request'
                    {
                    enumLiteral_4=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getREQUESTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperationAccess().getREQUESTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCE.g:2751:3: (enumLiteral_5= 'response' )
                    {
                    // InternalSmartCE.g:2751:3: (enumLiteral_5= 'response' )
                    // InternalSmartCE.g:2752:4: enumLiteral_5= 'response'
                    {
                    enumLiteral_5=(Token)match(input,67,FOLLOW_2); 

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
    // InternalSmartCE.g:2762:1: ruleWeekDay returns [Enumerator current=null] : ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) ) ;
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
            // InternalSmartCE.g:2768:2: ( ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) ) )
            // InternalSmartCE.g:2769:2: ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) )
            {
            // InternalSmartCE.g:2769:2: ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) )
            int alt29=7;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt29=1;
                }
                break;
            case 69:
                {
                alt29=2;
                }
                break;
            case 70:
                {
                alt29=3;
                }
                break;
            case 71:
                {
                alt29=4;
                }
                break;
            case 72:
                {
                alt29=5;
                }
                break;
            case 73:
                {
                alt29=6;
                }
                break;
            case 74:
                {
                alt29=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalSmartCE.g:2770:3: (enumLiteral_0= 'Sunday' )
                    {
                    // InternalSmartCE.g:2770:3: (enumLiteral_0= 'Sunday' )
                    // InternalSmartCE.g:2771:4: enumLiteral_0= 'Sunday'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getSUNDAYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWeekDayAccess().getSUNDAYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:2778:3: (enumLiteral_1= 'Monday' )
                    {
                    // InternalSmartCE.g:2778:3: (enumLiteral_1= 'Monday' )
                    // InternalSmartCE.g:2779:4: enumLiteral_1= 'Monday'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getMONDAYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWeekDayAccess().getMONDAYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:2786:3: (enumLiteral_2= 'Tuesday' )
                    {
                    // InternalSmartCE.g:2786:3: (enumLiteral_2= 'Tuesday' )
                    // InternalSmartCE.g:2787:4: enumLiteral_2= 'Tuesday'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTUESDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWeekDayAccess().getTUESDAYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:2794:3: (enumLiteral_3= 'Wednesday' )
                    {
                    // InternalSmartCE.g:2794:3: (enumLiteral_3= 'Wednesday' )
                    // InternalSmartCE.g:2795:4: enumLiteral_3= 'Wednesday'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getWEDNESDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWeekDayAccess().getWEDNESDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCE.g:2802:3: (enumLiteral_4= 'Thursday' )
                    {
                    // InternalSmartCE.g:2802:3: (enumLiteral_4= 'Thursday' )
                    // InternalSmartCE.g:2803:4: enumLiteral_4= 'Thursday'
                    {
                    enumLiteral_4=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTHURSDAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWeekDayAccess().getTHURSDAYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCE.g:2810:3: (enumLiteral_5= 'Friday' )
                    {
                    // InternalSmartCE.g:2810:3: (enumLiteral_5= 'Friday' )
                    // InternalSmartCE.g:2811:4: enumLiteral_5= 'Friday'
                    {
                    enumLiteral_5=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getFRIDAYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWeekDayAccess().getFRIDAYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSmartCE.g:2818:3: (enumLiteral_6= 'Saturday' )
                    {
                    // InternalSmartCE.g:2818:3: (enumLiteral_6= 'Saturday' )
                    // InternalSmartCE.g:2819:4: enumLiteral_6= 'Saturday'
                    {
                    enumLiteral_6=(Token)match(input,74,FOLLOW_2); 

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
    // InternalSmartCE.g:2829:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) ) ;
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
            // InternalSmartCE.g:2835:2: ( ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) ) )
            // InternalSmartCE.g:2836:2: ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) )
            {
            // InternalSmartCE.g:2836:2: ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) )
            int alt30=7;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt30=1;
                }
                break;
            case 76:
                {
                alt30=2;
                }
                break;
            case 77:
                {
                alt30=3;
                }
                break;
            case 78:
                {
                alt30=4;
                }
                break;
            case 79:
                {
                alt30=5;
                }
                break;
            case 80:
                {
                alt30=6;
                }
                break;
            case 81:
                {
                alt30=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalSmartCE.g:2837:3: (enumLiteral_0= 'Second' )
                    {
                    // InternalSmartCE.g:2837:3: (enumLiteral_0= 'Second' )
                    // InternalSmartCE.g:2838:4: enumLiteral_0= 'Second'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getSECONDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSECONDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:2845:3: (enumLiteral_1= 'Minute' )
                    {
                    // InternalSmartCE.g:2845:3: (enumLiteral_1= 'Minute' )
                    // InternalSmartCE.g:2846:4: enumLiteral_1= 'Minute'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:2853:3: (enumLiteral_2= 'Hour' )
                    {
                    // InternalSmartCE.g:2853:3: (enumLiteral_2= 'Hour' )
                    // InternalSmartCE.g:2854:4: enumLiteral_2= 'Hour'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCE.g:2861:3: (enumLiteral_3= 'Day' )
                    {
                    // InternalSmartCE.g:2861:3: (enumLiteral_3= 'Day' )
                    // InternalSmartCE.g:2862:4: enumLiteral_3= 'Day'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCE.g:2869:3: (enumLiteral_4= 'Week' )
                    {
                    // InternalSmartCE.g:2869:3: (enumLiteral_4= 'Week' )
                    // InternalSmartCE.g:2870:4: enumLiteral_4= 'Week'
                    {
                    enumLiteral_4=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCE.g:2877:3: (enumLiteral_5= 'Month' )
                    {
                    // InternalSmartCE.g:2877:3: (enumLiteral_5= 'Month' )
                    // InternalSmartCE.g:2878:4: enumLiteral_5= 'Month'
                    {
                    enumLiteral_5=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMONTHEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTimeUnitAccess().getMONTHEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSmartCE.g:2885:3: (enumLiteral_6= 'Year' )
                    {
                    // InternalSmartCE.g:2885:3: (enumLiteral_6= 'Year' )
                    // InternalSmartCE.g:2886:4: enumLiteral_6= 'Year'
                    {
                    enumLiteral_6=(Token)match(input,81,FOLLOW_2); 

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


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String dfa_1s = "\57\uffff";
    static final String dfa_2s = "\26\uffff\1\34\3\uffff\1\34\21\uffff\3\34";
    static final String dfa_3s = "\1\40\5\41\2\6\1\104\2\5\1\42\1\44\10\46\1\42\1\23\1\113\1\104\1\5\1\23\2\uffff\17\42\3\23";
    static final String dfa_4s = "\1\50\5\41\2\6\1\112\2\5\1\42\1\44\10\46\1\42\1\37\1\121\1\112\1\5\1\37\2\uffff\17\42\3\37";
    static final String dfa_5s = "\33\uffff\1\2\1\1\22\uffff";
    static final String dfa_6s = "\57\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\uffff\1\2\1\uffff\1\3\1\uffff\1\4\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\34\11\uffff\3\33",
            "\1\35\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52",
            "\1\53",
            "\1\34\11\uffff\3\33",
            "",
            "",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\56",
            "\1\34\11\uffff\3\33",
            "\1\34\11\uffff\3\33",
            "\1\34\11\uffff\3\33"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "620:2: (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition )";
        }
    }
    static final String dfa_8s = "\10\uffff";
    static final String dfa_9s = "\3\uffff\1\6\3\uffff\1\6";
    static final String dfa_10s = "\1\4\2\uffff\1\41\1\4\2\uffff\1\41";
    static final String dfa_11s = "\1\6\2\uffff\1\74\1\4\2\uffff\1\74";
    static final String dfa_12s = "\1\uffff\1\1\1\2\2\uffff\1\4\1\3\1\uffff";
    static final String dfa_13s = "\10\uffff}>";
    static final String[] dfa_14s = {
            "\1\3\1\2\1\1",
            "",
            "",
            "\1\5\1\6\7\uffff\1\6\2\uffff\2\6\1\uffff\14\6\1\4",
            "\1\7",
            "",
            "",
            "\1\5\1\6\7\uffff\1\6\2\uffff\2\6\1\uffff\14\6\1\4"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2249:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )";
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
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000180000780000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000180000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xC000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000001A900000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x000000000003F800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007F0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0200800200000070L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040400000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0200000200000070L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00FF000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x2000000000000000L});

}