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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'Contract'", "'{'", "'beginDate'", "'='", "'dueDate'", "'application'", "'process'", "'}'", "'Right'", "'Prohibition'", "'Obligation'", "'description'", "'rolePlayer'", "'rolePlayer.perform('", "')'", "'condition'", "'onBreach'", "'Timeout'", "'('", "'OperationsLimit'", "','", "'BusinessDay'", "'BusinessTime'", "'MessageContent'", "':'", "'Action'", "'&&'", "'||'", "'!'", "'<='", "'>='", "'>'", "'<'", "'!='", "'=='", "'is'", "'as'", "'+'", "'-'", "'*'", "'/'", "'.'", "'.*'", "'Monday'", "'Tuesday'", "'Second'", "'AND'", "'OR'", "'NOT'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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
    // InternalSmartCE.g:72:1: ruleModel returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_operations_2_0= ruleOperation ) )* ( (lv_contracts_3_0= ruleContract ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_operations_2_0 = null;

        EObject lv_contracts_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:78:2: ( ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_operations_2_0= ruleOperation ) )* ( (lv_contracts_3_0= ruleContract ) )* ) )
            // InternalSmartCE.g:79:2: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_operations_2_0= ruleOperation ) )* ( (lv_contracts_3_0= ruleContract ) )* )
            {
            // InternalSmartCE.g:79:2: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_operations_2_0= ruleOperation ) )* ( (lv_contracts_3_0= ruleContract ) )* )
            // InternalSmartCE.g:80:3: () ( (lv_imports_1_0= ruleImport ) )* ( (lv_operations_2_0= ruleOperation ) )* ( (lv_contracts_3_0= ruleContract ) )*
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

            // InternalSmartCE.g:106:3: ( (lv_operations_2_0= ruleOperation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSmartCE.g:107:4: (lv_operations_2_0= ruleOperation )
            	    {
            	    // InternalSmartCE.g:107:4: (lv_operations_2_0= ruleOperation )
            	    // InternalSmartCE.g:108:5: lv_operations_2_0= ruleOperation
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getOperationsOperationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_operations_2_0=ruleOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_2_0,
            	    						"br.edu.unijui.gca.smartce.SmartCE.Operation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSmartCE.g:125:3: ( (lv_contracts_3_0= ruleContract ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmartCE.g:126:4: (lv_contracts_3_0= ruleContract )
            	    {
            	    // InternalSmartCE.g:126:4: (lv_contracts_3_0= ruleContract )
            	    // InternalSmartCE.g:127:5: lv_contracts_3_0= ruleContract
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getContractsContractParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_contracts_3_0=ruleContract();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contracts",
            	    						lv_contracts_3_0,
            	    						"br.edu.unijui.gca.smartce.SmartCE.Contract");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // InternalSmartCE.g:148:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalSmartCE.g:148:47: (iv_ruleImport= ruleImport EOF )
            // InternalSmartCE.g:149:2: iv_ruleImport= ruleImport EOF
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
    // InternalSmartCE.g:155:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:161:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalSmartCE.g:162:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalSmartCE.g:162:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalSmartCE.g:163:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalSmartCE.g:167:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalSmartCE.g:168:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalSmartCE.g:168:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalSmartCE.g:169:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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


    // $ANTLR start "entryRuleOperation"
    // InternalSmartCE.g:190:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalSmartCE.g:190:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalSmartCE.g:191:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalSmartCE.g:197:1: ruleOperation returns [EObject current=null] : ( (lv_name_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:203:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) )
            // InternalSmartCE.g:204:2: ( (lv_name_0_0= ruleQualifiedName ) )
            {
            // InternalSmartCE.g:204:2: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalSmartCE.g:205:3: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalSmartCE.g:205:3: (lv_name_0_0= ruleQualifiedName )
            // InternalSmartCE.g:206:4: lv_name_0_0= ruleQualifiedName
            {

            				newCompositeNode(grammarAccess.getOperationAccess().getNameQualifiedNameParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getOperationRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleContract"
    // InternalSmartCE.g:226:1: entryRuleContract returns [EObject current=null] : iv_ruleContract= ruleContract EOF ;
    public final EObject entryRuleContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContract = null;


        try {
            // InternalSmartCE.g:226:49: (iv_ruleContract= ruleContract EOF )
            // InternalSmartCE.g:227:2: iv_ruleContract= ruleContract EOF
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
    // InternalSmartCE.g:233:1: ruleContract returns [EObject current=null] : (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= RULE_STRING ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= RULE_STRING ) ) otherlv_9= 'application' otherlv_10= '=' ( (lv_application_11_0= ruleApplication ) ) otherlv_12= 'process' otherlv_13= '=' ( (lv_process_14_0= ruleProcess ) ) ( (lv_clauses_15_0= ruleClause ) )* ( (lv_actions_16_0= ruleAction ) )* otherlv_17= '}' ) ;
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
            // InternalSmartCE.g:239:2: ( (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= RULE_STRING ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= RULE_STRING ) ) otherlv_9= 'application' otherlv_10= '=' ( (lv_application_11_0= ruleApplication ) ) otherlv_12= 'process' otherlv_13= '=' ( (lv_process_14_0= ruleProcess ) ) ( (lv_clauses_15_0= ruleClause ) )* ( (lv_actions_16_0= ruleAction ) )* otherlv_17= '}' ) )
            // InternalSmartCE.g:240:2: (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= RULE_STRING ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= RULE_STRING ) ) otherlv_9= 'application' otherlv_10= '=' ( (lv_application_11_0= ruleApplication ) ) otherlv_12= 'process' otherlv_13= '=' ( (lv_process_14_0= ruleProcess ) ) ( (lv_clauses_15_0= ruleClause ) )* ( (lv_actions_16_0= ruleAction ) )* otherlv_17= '}' )
            {
            // InternalSmartCE.g:240:2: (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= RULE_STRING ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= RULE_STRING ) ) otherlv_9= 'application' otherlv_10= '=' ( (lv_application_11_0= ruleApplication ) ) otherlv_12= 'process' otherlv_13= '=' ( (lv_process_14_0= ruleProcess ) ) ( (lv_clauses_15_0= ruleClause ) )* ( (lv_actions_16_0= ruleAction ) )* otherlv_17= '}' )
            // InternalSmartCE.g:241:3: otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'beginDate' otherlv_4= '=' ( (lv_beginDate_5_0= RULE_STRING ) ) otherlv_6= 'dueDate' otherlv_7= '=' ( (lv_dueDate_8_0= RULE_STRING ) ) otherlv_9= 'application' otherlv_10= '=' ( (lv_application_11_0= ruleApplication ) ) otherlv_12= 'process' otherlv_13= '=' ( (lv_process_14_0= ruleProcess ) ) ( (lv_clauses_15_0= ruleClause ) )* ( (lv_actions_16_0= ruleAction ) )* otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getContractAccess().getContractKeyword_0());
            		
            // InternalSmartCE.g:245:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCE.g:246:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCE.g:246:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCE.g:247:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getContractAccess().getBeginDateKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getContractAccess().getEqualsSignKeyword_4());
            		
            // InternalSmartCE.g:275:3: ( (lv_beginDate_5_0= RULE_STRING ) )
            // InternalSmartCE.g:276:4: (lv_beginDate_5_0= RULE_STRING )
            {
            // InternalSmartCE.g:276:4: (lv_beginDate_5_0= RULE_STRING )
            // InternalSmartCE.g:277:5: lv_beginDate_5_0= RULE_STRING
            {
            lv_beginDate_5_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            otherlv_6=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getContractAccess().getDueDateKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getContractAccess().getEqualsSignKeyword_7());
            		
            // InternalSmartCE.g:301:3: ( (lv_dueDate_8_0= RULE_STRING ) )
            // InternalSmartCE.g:302:4: (lv_dueDate_8_0= RULE_STRING )
            {
            // InternalSmartCE.g:302:4: (lv_dueDate_8_0= RULE_STRING )
            // InternalSmartCE.g:303:5: lv_dueDate_8_0= RULE_STRING
            {
            lv_dueDate_8_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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

            otherlv_9=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getContractAccess().getApplicationKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getContractAccess().getEqualsSignKeyword_10());
            		
            // InternalSmartCE.g:327:3: ( (lv_application_11_0= ruleApplication ) )
            // InternalSmartCE.g:328:4: (lv_application_11_0= ruleApplication )
            {
            // InternalSmartCE.g:328:4: (lv_application_11_0= ruleApplication )
            // InternalSmartCE.g:329:5: lv_application_11_0= ruleApplication
            {

            					newCompositeNode(grammarAccess.getContractAccess().getApplicationApplicationParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_12=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_12, grammarAccess.getContractAccess().getProcessKeyword_12());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_13, grammarAccess.getContractAccess().getEqualsSignKeyword_13());
            		
            // InternalSmartCE.g:354:3: ( (lv_process_14_0= ruleProcess ) )
            // InternalSmartCE.g:355:4: (lv_process_14_0= ruleProcess )
            {
            // InternalSmartCE.g:355:4: (lv_process_14_0= ruleProcess )
            // InternalSmartCE.g:356:5: lv_process_14_0= ruleProcess
            {

            					newCompositeNode(grammarAccess.getContractAccess().getProcessProcessParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalSmartCE.g:373:3: ( (lv_clauses_15_0= ruleClause ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=20 && LA4_0<=22)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSmartCE.g:374:4: (lv_clauses_15_0= ruleClause )
            	    {
            	    // InternalSmartCE.g:374:4: (lv_clauses_15_0= ruleClause )
            	    // InternalSmartCE.g:375:5: lv_clauses_15_0= ruleClause
            	    {

            	    					newCompositeNode(grammarAccess.getContractAccess().getClausesClauseParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
            	    break loop4;
                }
            } while (true);

            // InternalSmartCE.g:392:3: ( (lv_actions_16_0= ruleAction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==37) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmartCE.g:393:4: (lv_actions_16_0= ruleAction )
            	    {
            	    // InternalSmartCE.g:393:4: (lv_actions_16_0= ruleAction )
            	    // InternalSmartCE.g:394:5: lv_actions_16_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getContractAccess().getActionsActionParserRuleCall_16_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
            	    break loop5;
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
    // InternalSmartCE.g:419:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalSmartCE.g:419:47: (iv_ruleClause= ruleClause EOF )
            // InternalSmartCE.g:420:2: iv_ruleClause= ruleClause EOF
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
    // InternalSmartCE.g:426:1: ruleClause returns [EObject current=null] : ( (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'rolePlayer' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'rolePlayer.perform(' ( ( ruleQualifiedName ) ) otherlv_12= ')' otherlv_13= 'condition' otherlv_14= '{' ( (lv_condition_15_0= ruleCondition ) ) otherlv_16= '}' otherlv_17= 'onBreach' ( (lv_onBreach_18_0= ruleOnBreach ) ) otherlv_19= '}' ) ;
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
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_condition_15_0 = null;

        EObject lv_onBreach_18_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:432:2: ( ( (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'rolePlayer' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'rolePlayer.perform(' ( ( ruleQualifiedName ) ) otherlv_12= ')' otherlv_13= 'condition' otherlv_14= '{' ( (lv_condition_15_0= ruleCondition ) ) otherlv_16= '}' otherlv_17= 'onBreach' ( (lv_onBreach_18_0= ruleOnBreach ) ) otherlv_19= '}' ) )
            // InternalSmartCE.g:433:2: ( (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'rolePlayer' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'rolePlayer.perform(' ( ( ruleQualifiedName ) ) otherlv_12= ')' otherlv_13= 'condition' otherlv_14= '{' ( (lv_condition_15_0= ruleCondition ) ) otherlv_16= '}' otherlv_17= 'onBreach' ( (lv_onBreach_18_0= ruleOnBreach ) ) otherlv_19= '}' )
            {
            // InternalSmartCE.g:433:2: ( (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'rolePlayer' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'rolePlayer.perform(' ( ( ruleQualifiedName ) ) otherlv_12= ')' otherlv_13= 'condition' otherlv_14= '{' ( (lv_condition_15_0= ruleCondition ) ) otherlv_16= '}' otherlv_17= 'onBreach' ( (lv_onBreach_18_0= ruleOnBreach ) ) otherlv_19= '}' )
            // InternalSmartCE.g:434:3: (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'rolePlayer' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'rolePlayer.perform(' ( ( ruleQualifiedName ) ) otherlv_12= ')' otherlv_13= 'condition' otherlv_14= '{' ( (lv_condition_15_0= ruleCondition ) ) otherlv_16= '}' otherlv_17= 'onBreach' ( (lv_onBreach_18_0= ruleOnBreach ) ) otherlv_19= '}'
            {
            // InternalSmartCE.g:434:3: (otherlv_0= 'Right' | otherlv_1= 'Prohibition' | otherlv_2= 'Obligation' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSmartCE.g:435:4: otherlv_0= 'Right'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getClauseAccess().getRightKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:440:4: otherlv_1= 'Prohibition'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getClauseAccess().getProhibitionKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:445:4: otherlv_2= 'Obligation'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getClauseAccess().getObligationKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalSmartCE.g:450:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSmartCE.g:451:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSmartCE.g:451:4: (lv_name_3_0= RULE_ID )
            // InternalSmartCE.g:452:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_4=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getClauseAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getClauseAccess().getDescriptionKeyword_3());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getClauseAccess().getEqualsSignKeyword_4());
            		
            // InternalSmartCE.g:480:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalSmartCE.g:481:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalSmartCE.g:481:4: (lv_description_7_0= RULE_STRING )
            // InternalSmartCE.g:482:5: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            otherlv_8=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getClauseAccess().getRolePlayerKeyword_6());
            		
            // InternalSmartCE.g:502:3: ( (otherlv_9= RULE_ID ) )
            // InternalSmartCE.g:503:4: (otherlv_9= RULE_ID )
            {
            // InternalSmartCE.g:503:4: (otherlv_9= RULE_ID )
            // InternalSmartCE.g:504:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClauseRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_9, grammarAccess.getClauseAccess().getRolePlayerPartyCrossReference_7_0());
            				

            }


            }

            otherlv_10=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getClauseAccess().getRolePlayerPerformKeyword_8());
            		
            // InternalSmartCE.g:519:3: ( ( ruleQualifiedName ) )
            // InternalSmartCE.g:520:4: ( ruleQualifiedName )
            {
            // InternalSmartCE.g:520:4: ( ruleQualifiedName )
            // InternalSmartCE.g:521:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClauseRule());
            					}
            				

            					newCompositeNode(grammarAccess.getClauseAccess().getOperationOperationCrossReference_9_0());
            				
            pushFollow(FOLLOW_19);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_12, grammarAccess.getClauseAccess().getRightParenthesisKeyword_10());
            		
            otherlv_13=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_13, grammarAccess.getClauseAccess().getConditionKeyword_11());
            		
            otherlv_14=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_14, grammarAccess.getClauseAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalSmartCE.g:547:3: ( (lv_condition_15_0= ruleCondition ) )
            // InternalSmartCE.g:548:4: (lv_condition_15_0= ruleCondition )
            {
            // InternalSmartCE.g:548:4: (lv_condition_15_0= ruleCondition )
            // InternalSmartCE.g:549:5: lv_condition_15_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getConditionConditionParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_22);
            lv_condition_15_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_15_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,19,FOLLOW_23); 

            			newLeafNode(otherlv_16, grammarAccess.getClauseAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_17=(Token)match(input,28,FOLLOW_24); 

            			newLeafNode(otherlv_17, grammarAccess.getClauseAccess().getOnBreachKeyword_15());
            		
            // InternalSmartCE.g:574:3: ( (lv_onBreach_18_0= ruleOnBreach ) )
            // InternalSmartCE.g:575:4: (lv_onBreach_18_0= ruleOnBreach )
            {
            // InternalSmartCE.g:575:4: (lv_onBreach_18_0= ruleOnBreach )
            // InternalSmartCE.g:576:5: lv_onBreach_18_0= ruleOnBreach
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getOnBreachOnBreachParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_22);
            lv_onBreach_18_0=ruleOnBreach();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseRule());
            					}
            					set(
            						current,
            						"onBreach",
            						lv_onBreach_18_0,
            						"br.edu.unijui.gca.smartce.SmartCE.OnBreach");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getClauseAccess().getRightCurlyBracketKeyword_17());
            		

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
    // InternalSmartCE.g:601:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalSmartCE.g:601:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalSmartCE.g:602:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalSmartCE.g:608:1: ruleCondition returns [EObject current=null] : (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_BusinessRule_0 = null;

        EObject this_CompositeCondition_1 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:614:2: ( (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition ) )
            // InternalSmartCE.g:615:2: (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition )
            {
            // InternalSmartCE.g:615:2: (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalSmartCE.g:616:3: this_BusinessRule_0= ruleBusinessRule
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
                    // InternalSmartCE.g:625:3: this_CompositeCondition_1= ruleCompositeCondition
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
    // InternalSmartCE.g:637:1: entryRuleBusinessRule returns [EObject current=null] : iv_ruleBusinessRule= ruleBusinessRule EOF ;
    public final EObject entryRuleBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessRule = null;


        try {
            // InternalSmartCE.g:637:53: (iv_ruleBusinessRule= ruleBusinessRule EOF )
            // InternalSmartCE.g:638:2: iv_ruleBusinessRule= ruleBusinessRule EOF
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
    // InternalSmartCE.g:644:1: ruleBusinessRule returns [EObject current=null] : (this_Timeout_0= ruleTimeout | this_OperationsLimit_1= ruleOperationsLimit | this_BusinessDay_2= ruleBusinessDay | this_BusinessTime_3= ruleBusinessTime | this_MessageContent_4= ruleMessageContent ) ;
    public final EObject ruleBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject this_Timeout_0 = null;

        EObject this_OperationsLimit_1 = null;

        EObject this_BusinessDay_2 = null;

        EObject this_BusinessTime_3 = null;

        EObject this_MessageContent_4 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:650:2: ( (this_Timeout_0= ruleTimeout | this_OperationsLimit_1= ruleOperationsLimit | this_BusinessDay_2= ruleBusinessDay | this_BusinessTime_3= ruleBusinessTime | this_MessageContent_4= ruleMessageContent ) )
            // InternalSmartCE.g:651:2: (this_Timeout_0= ruleTimeout | this_OperationsLimit_1= ruleOperationsLimit | this_BusinessDay_2= ruleBusinessDay | this_BusinessTime_3= ruleBusinessTime | this_MessageContent_4= ruleMessageContent )
            {
            // InternalSmartCE.g:651:2: (this_Timeout_0= ruleTimeout | this_OperationsLimit_1= ruleOperationsLimit | this_BusinessDay_2= ruleBusinessDay | this_BusinessTime_3= ruleBusinessTime | this_MessageContent_4= ruleMessageContent )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt8=1;
                }
                break;
            case 31:
                {
                alt8=2;
                }
                break;
            case 33:
                {
                alt8=3;
                }
                break;
            case 34:
                {
                alt8=4;
                }
                break;
            case 35:
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
                    // InternalSmartCE.g:652:3: this_Timeout_0= ruleTimeout
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
                    // InternalSmartCE.g:661:3: this_OperationsLimit_1= ruleOperationsLimit
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
                    // InternalSmartCE.g:670:3: this_BusinessDay_2= ruleBusinessDay
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
                    // InternalSmartCE.g:679:3: this_BusinessTime_3= ruleBusinessTime
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
                    // InternalSmartCE.g:688:3: this_MessageContent_4= ruleMessageContent
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
    // InternalSmartCE.g:700:1: entryRuleCompositeCondition returns [EObject current=null] : iv_ruleCompositeCondition= ruleCompositeCondition EOF ;
    public final EObject entryRuleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCondition = null;


        try {
            // InternalSmartCE.g:700:59: (iv_ruleCompositeCondition= ruleCompositeCondition EOF )
            // InternalSmartCE.g:701:2: iv_ruleCompositeCondition= ruleCompositeCondition EOF
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
    // InternalSmartCE.g:707:1: ruleCompositeCondition returns [EObject current=null] : ( ( (lv_conditions_0_0= ruleBusinessRule ) )* ( (lv_logicalOperator_1_0= ruleLogicalOperator ) ) ( (lv_conditions_2_0= ruleBusinessRule ) ) ) ;
    public final EObject ruleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_conditions_0_0 = null;

        Enumerator lv_logicalOperator_1_0 = null;

        EObject lv_conditions_2_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:713:2: ( ( ( (lv_conditions_0_0= ruleBusinessRule ) )* ( (lv_logicalOperator_1_0= ruleLogicalOperator ) ) ( (lv_conditions_2_0= ruleBusinessRule ) ) ) )
            // InternalSmartCE.g:714:2: ( ( (lv_conditions_0_0= ruleBusinessRule ) )* ( (lv_logicalOperator_1_0= ruleLogicalOperator ) ) ( (lv_conditions_2_0= ruleBusinessRule ) ) )
            {
            // InternalSmartCE.g:714:2: ( ( (lv_conditions_0_0= ruleBusinessRule ) )* ( (lv_logicalOperator_1_0= ruleLogicalOperator ) ) ( (lv_conditions_2_0= ruleBusinessRule ) ) )
            // InternalSmartCE.g:715:3: ( (lv_conditions_0_0= ruleBusinessRule ) )* ( (lv_logicalOperator_1_0= ruleLogicalOperator ) ) ( (lv_conditions_2_0= ruleBusinessRule ) )
            {
            // InternalSmartCE.g:715:3: ( (lv_conditions_0_0= ruleBusinessRule ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29||LA9_0==31||(LA9_0>=33 && LA9_0<=35)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSmartCE.g:716:4: (lv_conditions_0_0= ruleBusinessRule )
            	    {
            	    // InternalSmartCE.g:716:4: (lv_conditions_0_0= ruleBusinessRule )
            	    // InternalSmartCE.g:717:5: lv_conditions_0_0= ruleBusinessRule
            	    {

            	    					newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_21);
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
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalSmartCE.g:734:3: ( (lv_logicalOperator_1_0= ruleLogicalOperator ) )
            // InternalSmartCE.g:735:4: (lv_logicalOperator_1_0= ruleLogicalOperator )
            {
            // InternalSmartCE.g:735:4: (lv_logicalOperator_1_0= ruleLogicalOperator )
            // InternalSmartCE.g:736:5: lv_logicalOperator_1_0= ruleLogicalOperator
            {

            					newCompositeNode(grammarAccess.getCompositeConditionAccess().getLogicalOperatorLogicalOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_logicalOperator_1_0=ruleLogicalOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            					}
            					set(
            						current,
            						"logicalOperator",
            						lv_logicalOperator_1_0,
            						"br.edu.unijui.gca.smartce.SmartCE.LogicalOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartCE.g:753:3: ( (lv_conditions_2_0= ruleBusinessRule ) )
            // InternalSmartCE.g:754:4: (lv_conditions_2_0= ruleBusinessRule )
            {
            // InternalSmartCE.g:754:4: (lv_conditions_2_0= ruleBusinessRule )
            // InternalSmartCE.g:755:5: lv_conditions_2_0= ruleBusinessRule
            {

            					newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsBusinessRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleTimeout"
    // InternalSmartCE.g:776:1: entryRuleTimeout returns [EObject current=null] : iv_ruleTimeout= ruleTimeout EOF ;
    public final EObject entryRuleTimeout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeout = null;


        try {
            // InternalSmartCE.g:776:48: (iv_ruleTimeout= ruleTimeout EOF )
            // InternalSmartCE.g:777:2: iv_ruleTimeout= ruleTimeout EOF
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
    // InternalSmartCE.g:783:1: ruleTimeout returns [EObject current=null] : (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleTimeout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSmartCE.g:789:2: ( (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalSmartCE.g:790:2: (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalSmartCE.g:790:2: (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalSmartCE.g:791:3: otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeoutAccess().getTimeoutKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeoutAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:799:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalSmartCE.g:800:4: (lv_value_2_0= RULE_INT )
            {
            // InternalSmartCE.g:800:4: (lv_value_2_0= RULE_INT )
            // InternalSmartCE.g:801:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

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

            otherlv_3=(Token)match(input,26,FOLLOW_2); 

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
    // InternalSmartCE.g:825:1: entryRuleOperationsLimit returns [EObject current=null] : iv_ruleOperationsLimit= ruleOperationsLimit EOF ;
    public final EObject entryRuleOperationsLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationsLimit = null;


        try {
            // InternalSmartCE.g:825:56: (iv_ruleOperationsLimit= ruleOperationsLimit EOF )
            // InternalSmartCE.g:826:2: iv_ruleOperationsLimit= ruleOperationsLimit EOF
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
    // InternalSmartCE.g:832:1: ruleOperationsLimit returns [EObject current=null] : (otherlv_0= 'OperationsLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_timeUnit_4_0= ruleUnitTime ) ) otherlv_5= ')' ) ;
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
            // InternalSmartCE.g:838:2: ( (otherlv_0= 'OperationsLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_timeUnit_4_0= ruleUnitTime ) ) otherlv_5= ')' ) )
            // InternalSmartCE.g:839:2: (otherlv_0= 'OperationsLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_timeUnit_4_0= ruleUnitTime ) ) otherlv_5= ')' )
            {
            // InternalSmartCE.g:839:2: (otherlv_0= 'OperationsLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_timeUnit_4_0= ruleUnitTime ) ) otherlv_5= ')' )
            // InternalSmartCE.g:840:3: otherlv_0= 'OperationsLimit' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_timeUnit_4_0= ruleUnitTime ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationsLimitAccess().getOperationsLimitKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationsLimitAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:848:3: ( (lv_operationsNumber_2_0= RULE_INT ) )
            // InternalSmartCE.g:849:4: (lv_operationsNumber_2_0= RULE_INT )
            {
            // InternalSmartCE.g:849:4: (lv_operationsNumber_2_0= RULE_INT )
            // InternalSmartCE.g:850:5: lv_operationsNumber_2_0= RULE_INT
            {
            lv_operationsNumber_2_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            otherlv_3=(Token)match(input,32,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationsLimitAccess().getCommaKeyword_3());
            		
            // InternalSmartCE.g:870:3: ( (lv_timeUnit_4_0= ruleUnitTime ) )
            // InternalSmartCE.g:871:4: (lv_timeUnit_4_0= ruleUnitTime )
            {
            // InternalSmartCE.g:871:4: (lv_timeUnit_4_0= ruleUnitTime )
            // InternalSmartCE.g:872:5: lv_timeUnit_4_0= ruleUnitTime
            {

            					newCompositeNode(grammarAccess.getOperationsLimitAccess().getTimeUnitUnitTimeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_timeUnit_4_0=ruleUnitTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationsLimitRule());
            					}
            					set(
            						current,
            						"timeUnit",
            						lv_timeUnit_4_0,
            						"br.edu.unijui.gca.smartce.SmartCE.UnitTime");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

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
    // InternalSmartCE.g:897:1: entryRuleBusinessDay returns [EObject current=null] : iv_ruleBusinessDay= ruleBusinessDay EOF ;
    public final EObject entryRuleBusinessDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessDay = null;


        try {
            // InternalSmartCE.g:897:52: (iv_ruleBusinessDay= ruleBusinessDay EOF )
            // InternalSmartCE.g:898:2: iv_ruleBusinessDay= ruleBusinessDay EOF
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
    // InternalSmartCE.g:904:1: ruleBusinessDay returns [EObject current=null] : (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDays ) ) otherlv_3= ',' ( (lv_end_4_0= ruleWeekDays ) ) otherlv_5= ')' ) ;
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
            // InternalSmartCE.g:910:2: ( (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDays ) ) otherlv_3= ',' ( (lv_end_4_0= ruleWeekDays ) ) otherlv_5= ')' ) )
            // InternalSmartCE.g:911:2: (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDays ) ) otherlv_3= ',' ( (lv_end_4_0= ruleWeekDays ) ) otherlv_5= ')' )
            {
            // InternalSmartCE.g:911:2: (otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDays ) ) otherlv_3= ',' ( (lv_end_4_0= ruleWeekDays ) ) otherlv_5= ')' )
            // InternalSmartCE.g:912:3: otherlv_0= 'BusinessDay' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDays ) ) otherlv_3= ',' ( (lv_end_4_0= ruleWeekDays ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessDayAccess().getBusinessDayKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getBusinessDayAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:920:3: ( (lv_start_2_0= ruleWeekDays ) )
            // InternalSmartCE.g:921:4: (lv_start_2_0= ruleWeekDays )
            {
            // InternalSmartCE.g:921:4: (lv_start_2_0= ruleWeekDays )
            // InternalSmartCE.g:922:5: lv_start_2_0= ruleWeekDays
            {

            					newCompositeNode(grammarAccess.getBusinessDayAccess().getStartWeekDaysEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_start_2_0=ruleWeekDays();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBusinessDayRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_2_0,
            						"br.edu.unijui.gca.smartce.SmartCE.WeekDays");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getBusinessDayAccess().getCommaKeyword_3());
            		
            // InternalSmartCE.g:943:3: ( (lv_end_4_0= ruleWeekDays ) )
            // InternalSmartCE.g:944:4: (lv_end_4_0= ruleWeekDays )
            {
            // InternalSmartCE.g:944:4: (lv_end_4_0= ruleWeekDays )
            // InternalSmartCE.g:945:5: lv_end_4_0= ruleWeekDays
            {

            					newCompositeNode(grammarAccess.getBusinessDayAccess().getEndWeekDaysEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_end_4_0=ruleWeekDays();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBusinessDayRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_4_0,
            						"br.edu.unijui.gca.smartce.SmartCE.WeekDays");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

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
    // InternalSmartCE.g:970:1: entryRuleBusinessTime returns [EObject current=null] : iv_ruleBusinessTime= ruleBusinessTime EOF ;
    public final EObject entryRuleBusinessTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessTime = null;


        try {
            // InternalSmartCE.g:970:53: (iv_ruleBusinessTime= ruleBusinessTime EOF )
            // InternalSmartCE.g:971:2: iv_ruleBusinessTime= ruleBusinessTime EOF
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
    // InternalSmartCE.g:977:1: ruleBusinessTime returns [EObject current=null] : (otherlv_0= 'BusinessTime' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
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
            // InternalSmartCE.g:983:2: ( (otherlv_0= 'BusinessTime' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalSmartCE.g:984:2: (otherlv_0= 'BusinessTime' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalSmartCE.g:984:2: (otherlv_0= 'BusinessTime' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalSmartCE.g:985:3: otherlv_0= 'BusinessTime' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessTimeAccess().getBusinessTimeKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getBusinessTimeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:993:3: ( (lv_start_2_0= RULE_STRING ) )
            // InternalSmartCE.g:994:4: (lv_start_2_0= RULE_STRING )
            {
            // InternalSmartCE.g:994:4: (lv_start_2_0= RULE_STRING )
            // InternalSmartCE.g:995:5: lv_start_2_0= RULE_STRING
            {
            lv_start_2_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

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

            otherlv_3=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getBusinessTimeAccess().getCommaKeyword_3());
            		
            // InternalSmartCE.g:1015:3: ( (lv_end_4_0= RULE_STRING ) )
            // InternalSmartCE.g:1016:4: (lv_end_4_0= RULE_STRING )
            {
            // InternalSmartCE.g:1016:4: (lv_end_4_0= RULE_STRING )
            // InternalSmartCE.g:1017:5: lv_end_4_0= RULE_STRING
            {
            lv_end_4_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

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
    // InternalSmartCE.g:1041:1: entryRuleMessageContent returns [EObject current=null] : iv_ruleMessageContent= ruleMessageContent EOF ;
    public final EObject entryRuleMessageContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageContent = null;


        try {
            // InternalSmartCE.g:1041:55: (iv_ruleMessageContent= ruleMessageContent EOF )
            // InternalSmartCE.g:1042:2: iv_ruleMessageContent= ruleMessageContent EOF
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
    // InternalSmartCE.g:1048:1: ruleMessageContent returns [EObject current=null] : (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleMessageContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1054:2: ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalSmartCE.g:1055:2: (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalSmartCE.g:1055:2: (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalSmartCE.g:1056:3: otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageContentAccess().getMessageContentKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:1064:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalSmartCE.g:1065:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalSmartCE.g:1065:4: (lv_content_2_0= RULE_STRING )
            // InternalSmartCE.g:1066:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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

            otherlv_3=(Token)match(input,26,FOLLOW_2); 

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
    // InternalSmartCE.g:1090:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalSmartCE.g:1090:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalSmartCE.g:1091:2: iv_ruleApplication= ruleApplication EOF
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
    // InternalSmartCE.g:1097:1: ruleApplication returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1103:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) ) )
            // InternalSmartCE.g:1104:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // InternalSmartCE.g:1104:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) )
            // InternalSmartCE.g:1105:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) )
            {
            // InternalSmartCE.g:1105:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSmartCE.g:1106:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSmartCE.g:1106:4: (lv_name_0_0= RULE_ID )
            // InternalSmartCE.g:1107:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            otherlv_1=(Token)match(input,36,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationAccess().getColonKeyword_1());
            		
            // InternalSmartCE.g:1127:3: ( (lv_description_2_0= RULE_STRING ) )
            // InternalSmartCE.g:1128:4: (lv_description_2_0= RULE_STRING )
            {
            // InternalSmartCE.g:1128:4: (lv_description_2_0= RULE_STRING )
            // InternalSmartCE.g:1129:5: lv_description_2_0= RULE_STRING
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
    // InternalSmartCE.g:1149:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalSmartCE.g:1149:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalSmartCE.g:1150:2: iv_ruleProcess= ruleProcess EOF
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
    // InternalSmartCE.g:1156:1: ruleProcess returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1162:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) ) )
            // InternalSmartCE.g:1163:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // InternalSmartCE.g:1163:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) )
            // InternalSmartCE.g:1164:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) )
            {
            // InternalSmartCE.g:1164:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSmartCE.g:1165:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSmartCE.g:1165:4: (lv_name_0_0= RULE_ID )
            // InternalSmartCE.g:1166:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            otherlv_1=(Token)match(input,36,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getColonKeyword_1());
            		
            // InternalSmartCE.g:1186:3: ( (lv_description_2_0= RULE_STRING ) )
            // InternalSmartCE.g:1187:4: (lv_description_2_0= RULE_STRING )
            {
            // InternalSmartCE.g:1187:4: (lv_description_2_0= RULE_STRING )
            // InternalSmartCE.g:1188:5: lv_description_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleOnBreach"
    // InternalSmartCE.g:1208:1: entryRuleOnBreach returns [EObject current=null] : iv_ruleOnBreach= ruleOnBreach EOF ;
    public final EObject entryRuleOnBreach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnBreach = null;


        try {
            // InternalSmartCE.g:1208:49: (iv_ruleOnBreach= ruleOnBreach EOF )
            // InternalSmartCE.g:1209:2: iv_ruleOnBreach= ruleOnBreach EOF
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
    // InternalSmartCE.g:1215:1: ruleOnBreach returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleOnBreach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:1221:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalSmartCE.g:1222:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalSmartCE.g:1222:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalSmartCE.g:1223:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_message_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOnBreachAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSmartCE.g:1227:3: ( (otherlv_1= RULE_ID ) )
            // InternalSmartCE.g:1228:4: (otherlv_1= RULE_ID )
            {
            // InternalSmartCE.g:1228:4: (otherlv_1= RULE_ID )
            // InternalSmartCE.g:1229:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnBreachRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_1, grammarAccess.getOnBreachAccess().getActionActionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getOnBreachAccess().getCommaKeyword_2());
            		
            // InternalSmartCE.g:1244:3: ( (lv_message_3_0= ruleExpression ) )
            // InternalSmartCE.g:1245:4: (lv_message_3_0= ruleExpression )
            {
            // InternalSmartCE.g:1245:4: (lv_message_3_0= ruleExpression )
            // InternalSmartCE.g:1246:5: lv_message_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOnBreachAccess().getMessageExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

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
    // InternalSmartCE.g:1271:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalSmartCE.g:1271:47: (iv_ruleAction= ruleAction EOF )
            // InternalSmartCE.g:1272:2: iv_ruleAction= ruleAction EOF
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
    // InternalSmartCE.g:1278:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleExpression ) ) otherlv_9= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_statements_8_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:1284:2: ( (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleExpression ) ) otherlv_9= '}' ) )
            // InternalSmartCE.g:1285:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleExpression ) ) otherlv_9= '}' )
            {
            // InternalSmartCE.g:1285:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleExpression ) ) otherlv_9= '}' )
            // InternalSmartCE.g:1286:3: otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleExpression ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalSmartCE.g:1290:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCE.g:1291:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCE.g:1291:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCE.g:1292:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSmartCE.g:1312:3: ( (lv_parameters_3_0= ruleVariable ) )
            // InternalSmartCE.g:1313:4: (lv_parameters_3_0= ruleVariable )
            {
            // InternalSmartCE.g:1313:4: (lv_parameters_3_0= ruleVariable )
            // InternalSmartCE.g:1314:5: lv_parameters_3_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getActionAccess().getParametersVariableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalSmartCE.g:1331:3: (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSmartCE.g:1332:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,32,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getActionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSmartCE.g:1336:4: ( (lv_parameters_5_0= ruleVariable ) )
            	    // InternalSmartCE.g:1337:5: (lv_parameters_5_0= ruleVariable )
            	    {
            	    // InternalSmartCE.g:1337:5: (lv_parameters_5_0= ruleVariable )
            	    // InternalSmartCE.g:1338:6: lv_parameters_5_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getActionAccess().getParametersVariableParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_31); 

            			newLeafNode(otherlv_7, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalSmartCE.g:1364:3: ( (lv_statements_8_0= ruleExpression ) )
            // InternalSmartCE.g:1365:4: (lv_statements_8_0= ruleExpression )
            {
            // InternalSmartCE.g:1365:4: (lv_statements_8_0= ruleExpression )
            // InternalSmartCE.g:1366:5: lv_statements_8_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getActionAccess().getStatementsExpressionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_22);
            lv_statements_8_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					add(
            						current,
            						"statements",
            						lv_statements_8_0,
            						"br.edu.unijui.gca.smartce.SmartCE.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalSmartCE.g:1391:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSmartCE.g:1391:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalSmartCE.g:1392:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalSmartCE.g:1398:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:1404:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) )
            // InternalSmartCE.g:1405:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            {
            // InternalSmartCE.g:1405:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            // InternalSmartCE.g:1406:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) )
            {
            // InternalSmartCE.g:1406:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSmartCE.g:1407:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSmartCE.g:1407:4: (lv_name_0_0= RULE_ID )
            // InternalSmartCE.g:1408:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            otherlv_1=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getColonKeyword_1());
            		
            // InternalSmartCE.g:1428:3: ( (lv_type_2_0= RULE_ID ) )
            // InternalSmartCE.g:1429:4: (lv_type_2_0= RULE_ID )
            {
            // InternalSmartCE.g:1429:4: (lv_type_2_0= RULE_ID )
            // InternalSmartCE.g:1430:5: lv_type_2_0= RULE_ID
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
    // InternalSmartCE.g:1450:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSmartCE.g:1450:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSmartCE.g:1451:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalSmartCE.g:1457:1: ruleExpression returns [EObject current=null] : (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        Token lv_symbol_3_0=null;
        EObject this_Negation_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:1463:2: ( (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* ) )
            // InternalSmartCE.g:1464:2: (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* )
            {
            // InternalSmartCE.g:1464:2: (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* )
            // InternalSmartCE.g:1465:3: this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getNegationParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_Negation_0=ruleNegation();

            state._fsp--;


            			current = this_Negation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:1473:3: ( () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=38 && LA12_0<=39)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSmartCE.g:1474:4: () ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) ) ( (lv_right_4_0= ruleNegation ) )
            	    {
            	    // InternalSmartCE.g:1474:4: ()
            	    // InternalSmartCE.g:1475:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:1481:4: ( ( (lv_symbol_2_0= '&&' ) ) | ( (lv_symbol_3_0= '||' ) ) )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==38) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==39) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalSmartCE.g:1482:5: ( (lv_symbol_2_0= '&&' ) )
            	            {
            	            // InternalSmartCE.g:1482:5: ( (lv_symbol_2_0= '&&' ) )
            	            // InternalSmartCE.g:1483:6: (lv_symbol_2_0= '&&' )
            	            {
            	            // InternalSmartCE.g:1483:6: (lv_symbol_2_0= '&&' )
            	            // InternalSmartCE.g:1484:7: lv_symbol_2_0= '&&'
            	            {
            	            lv_symbol_2_0=(Token)match(input,38,FOLLOW_31); 

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
            	            // InternalSmartCE.g:1497:5: ( (lv_symbol_3_0= '||' ) )
            	            {
            	            // InternalSmartCE.g:1497:5: ( (lv_symbol_3_0= '||' ) )
            	            // InternalSmartCE.g:1498:6: (lv_symbol_3_0= '||' )
            	            {
            	            // InternalSmartCE.g:1498:6: (lv_symbol_3_0= '||' )
            	            // InternalSmartCE.g:1499:7: lv_symbol_3_0= '||'
            	            {
            	            lv_symbol_3_0=(Token)match(input,39,FOLLOW_31); 

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

            	    // InternalSmartCE.g:1512:4: ( (lv_right_4_0= ruleNegation ) )
            	    // InternalSmartCE.g:1513:5: (lv_right_4_0= ruleNegation )
            	    {
            	    // InternalSmartCE.g:1513:5: (lv_right_4_0= ruleNegation )
            	    // InternalSmartCE.g:1514:6: lv_right_4_0= ruleNegation
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightNegationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
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
            	    break loop12;
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
    // InternalSmartCE.g:1536:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalSmartCE.g:1536:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalSmartCE.g:1537:2: iv_ruleNegation= ruleNegation EOF
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
    // InternalSmartCE.g:1543:1: ruleNegation returns [EObject current=null] : (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        EObject this_Comparison_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:1549:2: ( (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) ) )
            // InternalSmartCE.g:1550:2: (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) )
            {
            // InternalSmartCE.g:1550:2: (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||LA13_0==30||LA13_0==50) ) {
                alt13=1;
            }
            else if ( (LA13_0==40) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSmartCE.g:1551:3: this_Comparison_0= ruleComparison
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
                    // InternalSmartCE.g:1560:3: ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) )
                    {
                    // InternalSmartCE.g:1560:3: ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) )
                    // InternalSmartCE.g:1561:4: () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) )
                    {
                    // InternalSmartCE.g:1561:4: ()
                    // InternalSmartCE.g:1562:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegationAccess().getUnaryOperatorAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSmartCE.g:1568:4: ( (lv_symbol_2_0= '!' ) )
                    // InternalSmartCE.g:1569:5: (lv_symbol_2_0= '!' )
                    {
                    // InternalSmartCE.g:1569:5: (lv_symbol_2_0= '!' )
                    // InternalSmartCE.g:1570:6: lv_symbol_2_0= '!'
                    {
                    lv_symbol_2_0=(Token)match(input,40,FOLLOW_34); 

                    						newLeafNode(lv_symbol_2_0, grammarAccess.getNegationAccess().getSymbolExclamationMarkKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNegationRule());
                    						}
                    						setWithLastConsumed(current, "symbol", lv_symbol_2_0, "!");
                    					

                    }


                    }

                    // InternalSmartCE.g:1582:4: ( (lv_expression_3_0= ruleComparison ) )
                    // InternalSmartCE.g:1583:5: (lv_expression_3_0= ruleComparison )
                    {
                    // InternalSmartCE.g:1583:5: (lv_expression_3_0= ruleComparison )
                    // InternalSmartCE.g:1584:6: lv_expression_3_0= ruleComparison
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
    // InternalSmartCE.g:1606:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalSmartCE.g:1606:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalSmartCE.g:1607:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalSmartCE.g:1613:1: ruleComparison returns [EObject current=null] : (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* ) ;
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
            // InternalSmartCE.g:1619:2: ( (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* ) )
            // InternalSmartCE.g:1620:2: (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* )
            {
            // InternalSmartCE.g:1620:2: (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* )
            // InternalSmartCE.g:1621:3: this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_Plus_0=rulePlus();

            state._fsp--;


            			current = this_Plus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:1629:3: ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=41 && LA15_0<=48)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSmartCE.g:1630:4: () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) )
            	    {
            	    // InternalSmartCE.g:1630:4: ()
            	    // InternalSmartCE.g:1631:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:1637:4: ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) )
            	    int alt14=8;
            	    switch ( input.LA(1) ) {
            	    case 41:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt14=4;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt14=5;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt14=6;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt14=7;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt14=8;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt14) {
            	        case 1 :
            	            // InternalSmartCE.g:1638:5: ( (lv_symbol_2_0= '<=' ) )
            	            {
            	            // InternalSmartCE.g:1638:5: ( (lv_symbol_2_0= '<=' ) )
            	            // InternalSmartCE.g:1639:6: (lv_symbol_2_0= '<=' )
            	            {
            	            // InternalSmartCE.g:1639:6: (lv_symbol_2_0= '<=' )
            	            // InternalSmartCE.g:1640:7: lv_symbol_2_0= '<='
            	            {
            	            lv_symbol_2_0=(Token)match(input,41,FOLLOW_34); 

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
            	            // InternalSmartCE.g:1653:5: ( (lv_symbol_3_0= '>=' ) )
            	            {
            	            // InternalSmartCE.g:1653:5: ( (lv_symbol_3_0= '>=' ) )
            	            // InternalSmartCE.g:1654:6: (lv_symbol_3_0= '>=' )
            	            {
            	            // InternalSmartCE.g:1654:6: (lv_symbol_3_0= '>=' )
            	            // InternalSmartCE.g:1655:7: lv_symbol_3_0= '>='
            	            {
            	            lv_symbol_3_0=(Token)match(input,42,FOLLOW_34); 

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
            	            // InternalSmartCE.g:1668:5: ( (lv_symbol_4_0= '>' ) )
            	            {
            	            // InternalSmartCE.g:1668:5: ( (lv_symbol_4_0= '>' ) )
            	            // InternalSmartCE.g:1669:6: (lv_symbol_4_0= '>' )
            	            {
            	            // InternalSmartCE.g:1669:6: (lv_symbol_4_0= '>' )
            	            // InternalSmartCE.g:1670:7: lv_symbol_4_0= '>'
            	            {
            	            lv_symbol_4_0=(Token)match(input,43,FOLLOW_34); 

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
            	            // InternalSmartCE.g:1683:5: ( (lv_symbol_5_0= '<' ) )
            	            {
            	            // InternalSmartCE.g:1683:5: ( (lv_symbol_5_0= '<' ) )
            	            // InternalSmartCE.g:1684:6: (lv_symbol_5_0= '<' )
            	            {
            	            // InternalSmartCE.g:1684:6: (lv_symbol_5_0= '<' )
            	            // InternalSmartCE.g:1685:7: lv_symbol_5_0= '<'
            	            {
            	            lv_symbol_5_0=(Token)match(input,44,FOLLOW_34); 

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
            	            // InternalSmartCE.g:1698:5: ( (lv_symbol_6_0= '!=' ) )
            	            {
            	            // InternalSmartCE.g:1698:5: ( (lv_symbol_6_0= '!=' ) )
            	            // InternalSmartCE.g:1699:6: (lv_symbol_6_0= '!=' )
            	            {
            	            // InternalSmartCE.g:1699:6: (lv_symbol_6_0= '!=' )
            	            // InternalSmartCE.g:1700:7: lv_symbol_6_0= '!='
            	            {
            	            lv_symbol_6_0=(Token)match(input,45,FOLLOW_34); 

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
            	            // InternalSmartCE.g:1713:5: ( (lv_symbol_7_0= '==' ) )
            	            {
            	            // InternalSmartCE.g:1713:5: ( (lv_symbol_7_0= '==' ) )
            	            // InternalSmartCE.g:1714:6: (lv_symbol_7_0= '==' )
            	            {
            	            // InternalSmartCE.g:1714:6: (lv_symbol_7_0= '==' )
            	            // InternalSmartCE.g:1715:7: lv_symbol_7_0= '=='
            	            {
            	            lv_symbol_7_0=(Token)match(input,46,FOLLOW_34); 

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
            	            // InternalSmartCE.g:1728:5: ( (lv_symbol_8_0= 'is' ) )
            	            {
            	            // InternalSmartCE.g:1728:5: ( (lv_symbol_8_0= 'is' ) )
            	            // InternalSmartCE.g:1729:6: (lv_symbol_8_0= 'is' )
            	            {
            	            // InternalSmartCE.g:1729:6: (lv_symbol_8_0= 'is' )
            	            // InternalSmartCE.g:1730:7: lv_symbol_8_0= 'is'
            	            {
            	            lv_symbol_8_0=(Token)match(input,47,FOLLOW_34); 

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
            	            // InternalSmartCE.g:1743:5: ( (lv_symbol_9_0= 'as' ) )
            	            {
            	            // InternalSmartCE.g:1743:5: ( (lv_symbol_9_0= 'as' ) )
            	            // InternalSmartCE.g:1744:6: (lv_symbol_9_0= 'as' )
            	            {
            	            // InternalSmartCE.g:1744:6: (lv_symbol_9_0= 'as' )
            	            // InternalSmartCE.g:1745:7: lv_symbol_9_0= 'as'
            	            {
            	            lv_symbol_9_0=(Token)match(input,48,FOLLOW_34); 

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

            	    // InternalSmartCE.g:1758:4: ( (lv_right_10_0= rulePlus ) )
            	    // InternalSmartCE.g:1759:5: (lv_right_10_0= rulePlus )
            	    {
            	    // InternalSmartCE.g:1759:5: (lv_right_10_0= rulePlus )
            	    // InternalSmartCE.g:1760:6: lv_right_10_0= rulePlus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlus"
    // InternalSmartCE.g:1782:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalSmartCE.g:1782:45: (iv_rulePlus= rulePlus EOF )
            // InternalSmartCE.g:1783:2: iv_rulePlus= rulePlus EOF
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
    // InternalSmartCE.g:1789:1: rulePlus returns [EObject current=null] : (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:1795:2: ( (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* ) )
            // InternalSmartCE.g:1796:2: (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* )
            {
            // InternalSmartCE.g:1796:2: (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* )
            // InternalSmartCE.g:1797:3: this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:1805:3: ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=49 && LA17_0<=50)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSmartCE.g:1806:4: () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) )
            	    {
            	    // InternalSmartCE.g:1806:4: ()
            	    // InternalSmartCE.g:1807:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPlusAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:1813:4: (otherlv_2= '+' | otherlv_3= '-' )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==49) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==50) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalSmartCE.g:1814:5: otherlv_2= '+'
            	            {
            	            otherlv_2=(Token)match(input,49,FOLLOW_34); 

            	            					newLeafNode(otherlv_2, grammarAccess.getPlusAccess().getPlusSignKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSmartCE.g:1819:5: otherlv_3= '-'
            	            {
            	            otherlv_3=(Token)match(input,50,FOLLOW_34); 

            	            					newLeafNode(otherlv_3, grammarAccess.getPlusAccess().getHyphenMinusKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSmartCE.g:1824:4: ( (lv_right_4_0= ruleFactor ) )
            	    // InternalSmartCE.g:1825:5: (lv_right_4_0= ruleFactor )
            	    {
            	    // InternalSmartCE.g:1825:5: (lv_right_4_0= ruleFactor )
            	    // InternalSmartCE.g:1826:6: lv_right_4_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getPlusAccess().getRightFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_36);
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
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleFactor"
    // InternalSmartCE.g:1848:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalSmartCE.g:1848:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalSmartCE.g:1849:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalSmartCE.g:1855:1: ruleFactor returns [EObject current=null] : (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Negative_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:1861:2: ( (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* ) )
            // InternalSmartCE.g:1862:2: (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* )
            {
            // InternalSmartCE.g:1862:2: (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* )
            // InternalSmartCE.g:1863:3: this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getNegativeParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_Negative_0=ruleNegative();

            state._fsp--;


            			current = this_Negative_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartCE.g:1871:3: ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=51 && LA19_0<=52)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSmartCE.g:1872:4: () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) )
            	    {
            	    // InternalSmartCE.g:1872:4: ()
            	    // InternalSmartCE.g:1873:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFactorAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSmartCE.g:1879:4: (otherlv_2= '*' | otherlv_3= '/' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==51) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==52) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalSmartCE.g:1880:5: otherlv_2= '*'
            	            {
            	            otherlv_2=(Token)match(input,51,FOLLOW_34); 

            	            					newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSmartCE.g:1885:5: otherlv_3= '/'
            	            {
            	            otherlv_3=(Token)match(input,52,FOLLOW_34); 

            	            					newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSmartCE.g:1890:4: ( (lv_right_4_0= ruleNegative ) )
            	    // InternalSmartCE.g:1891:5: (lv_right_4_0= ruleNegative )
            	    {
            	    // InternalSmartCE.g:1891:5: (lv_right_4_0= ruleNegative )
            	    // InternalSmartCE.g:1892:6: lv_right_4_0= ruleNegative
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightNegativeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
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
            	    break loop19;
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
    // InternalSmartCE.g:1914:1: entryRuleNegative returns [EObject current=null] : iv_ruleNegative= ruleNegative EOF ;
    public final EObject entryRuleNegative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegative = null;


        try {
            // InternalSmartCE.g:1914:49: (iv_ruleNegative= ruleNegative EOF )
            // InternalSmartCE.g:1915:2: iv_ruleNegative= ruleNegative EOF
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
    // InternalSmartCE.g:1921:1: ruleNegative returns [EObject current=null] : (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) ) ;
    public final EObject ruleNegative() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:1927:2: ( (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) ) )
            // InternalSmartCE.g:1928:2: (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) )
            {
            // InternalSmartCE.g:1928:2: (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_INT)||LA20_0==30) ) {
                alt20=1;
            }
            else if ( (LA20_0==50) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSmartCE.g:1929:3: this_Primary_0= rulePrimary
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
                    // InternalSmartCE.g:1938:3: ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) )
                    {
                    // InternalSmartCE.g:1938:3: ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) )
                    // InternalSmartCE.g:1939:4: () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) )
                    {
                    // InternalSmartCE.g:1939:4: ()
                    // InternalSmartCE.g:1940:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegativeAccess().getUnaryOperatorAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,50,FOLLOW_38); 

                    				newLeafNode(otherlv_2, grammarAccess.getNegativeAccess().getHyphenMinusKeyword_1_1());
                    			
                    // InternalSmartCE.g:1950:4: ( (lv_expression_3_0= rulePrimary ) )
                    // InternalSmartCE.g:1951:5: (lv_expression_3_0= rulePrimary )
                    {
                    // InternalSmartCE.g:1951:5: (lv_expression_3_0= rulePrimary )
                    // InternalSmartCE.g:1952:6: lv_expression_3_0= rulePrimary
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
    // InternalSmartCE.g:1974:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSmartCE.g:1974:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSmartCE.g:1975:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalSmartCE.g:1981:1: rulePrimary returns [EObject current=null] : (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_LiteralValue_0 = null;

        EObject this_Expression_2 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:1987:2: ( (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) )
            // InternalSmartCE.g:1988:2: (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            {
            // InternalSmartCE.g:1988:2: (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_INT)) ) {
                alt21=1;
            }
            else if ( (LA21_0==30) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSmartCE.g:1989:3: this_LiteralValue_0= ruleLiteralValue
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
                    // InternalSmartCE.g:1998:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalSmartCE.g:1998:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalSmartCE.g:1999:4: otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_19);
                    this_Expression_2=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,26,FOLLOW_2); 

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
    // InternalSmartCE.g:2020:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // InternalSmartCE.g:2020:53: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // InternalSmartCE.g:2021:2: iv_ruleLiteralValue= ruleLiteralValue EOF
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
    // InternalSmartCE.g:2027:1: ruleLiteralValue returns [EObject current=null] : (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject this_NumericValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_VariableValue_2 = null;

        EObject this_FunctionCall_3 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2033:2: ( (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall ) )
            // InternalSmartCE.g:2034:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )
            {
            // InternalSmartCE.g:2034:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )
            int alt22=4;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalSmartCE.g:2035:3: this_NumericValue_0= ruleNumericValue
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
                    // InternalSmartCE.g:2044:3: this_StringValue_1= ruleStringValue
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
                    // InternalSmartCE.g:2053:3: this_VariableValue_2= ruleVariableValue
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
                    // InternalSmartCE.g:2062:3: this_FunctionCall_3= ruleFunctionCall
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
    // InternalSmartCE.g:2074:1: entryRuleNumericValue returns [EObject current=null] : iv_ruleNumericValue= ruleNumericValue EOF ;
    public final EObject entryRuleNumericValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericValue = null;


        try {
            // InternalSmartCE.g:2074:53: (iv_ruleNumericValue= ruleNumericValue EOF )
            // InternalSmartCE.g:2075:2: iv_ruleNumericValue= ruleNumericValue EOF
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
    // InternalSmartCE.g:2081:1: ruleNumericValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumericValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2087:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalSmartCE.g:2088:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalSmartCE.g:2088:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalSmartCE.g:2089:3: (lv_value_0_0= RULE_INT )
            {
            // InternalSmartCE.g:2089:3: (lv_value_0_0= RULE_INT )
            // InternalSmartCE.g:2090:4: lv_value_0_0= RULE_INT
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
    // InternalSmartCE.g:2109:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalSmartCE.g:2109:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalSmartCE.g:2110:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalSmartCE.g:2116:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2122:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSmartCE.g:2123:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSmartCE.g:2123:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSmartCE.g:2124:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalSmartCE.g:2124:3: (lv_value_0_0= RULE_STRING )
            // InternalSmartCE.g:2125:4: lv_value_0_0= RULE_STRING
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
    // InternalSmartCE.g:2144:1: entryRuleVariableValue returns [EObject current=null] : iv_ruleVariableValue= ruleVariableValue EOF ;
    public final EObject entryRuleVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableValue = null;


        try {
            // InternalSmartCE.g:2144:54: (iv_ruleVariableValue= ruleVariableValue EOF )
            // InternalSmartCE.g:2145:2: iv_ruleVariableValue= ruleVariableValue EOF
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
    // InternalSmartCE.g:2151:1: ruleVariableValue returns [EObject current=null] : ( (lv_value_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleVariableValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2157:2: ( ( (lv_value_0_0= ruleQualifiedName ) ) )
            // InternalSmartCE.g:2158:2: ( (lv_value_0_0= ruleQualifiedName ) )
            {
            // InternalSmartCE.g:2158:2: ( (lv_value_0_0= ruleQualifiedName ) )
            // InternalSmartCE.g:2159:3: (lv_value_0_0= ruleQualifiedName )
            {
            // InternalSmartCE.g:2159:3: (lv_value_0_0= ruleQualifiedName )
            // InternalSmartCE.g:2160:4: lv_value_0_0= ruleQualifiedName
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
    // InternalSmartCE.g:2180:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalSmartCE.g:2180:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalSmartCE.g:2181:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalSmartCE.g:2187:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' ) ;
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
            // InternalSmartCE.g:2193:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' ) )
            // InternalSmartCE.g:2194:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            {
            // InternalSmartCE.g:2194:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            // InternalSmartCE.g:2195:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')'
            {
            // InternalSmartCE.g:2195:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalSmartCE.g:2196:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalSmartCE.g:2196:4: (lv_name_0_0= ruleQualifiedName )
            // InternalSmartCE.g:2197:5: lv_name_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getNameQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_1=(Token)match(input,30,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmartCE.g:2218:3: ( (lv_params_2_0= ruleExpression ) )
            // InternalSmartCE.g:2219:4: (lv_params_2_0= ruleExpression )
            {
            // InternalSmartCE.g:2219:4: (lv_params_2_0= ruleExpression )
            // InternalSmartCE.g:2220:5: lv_params_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getParamsExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalSmartCE.g:2237:3: (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSmartCE.g:2238:4: otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,32,FOLLOW_31); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSmartCE.g:2242:4: ( (lv_params_4_0= ruleExpression ) )
            	    // InternalSmartCE.g:2243:5: (lv_params_4_0= ruleExpression )
            	    {
            	    // InternalSmartCE.g:2243:5: (lv_params_4_0= ruleExpression )
            	    // InternalSmartCE.g:2244:6: lv_params_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionCallAccess().getParamsExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop23;
                }
            } while (true);

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

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
    // InternalSmartCE.g:2270:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSmartCE.g:2270:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSmartCE.g:2271:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalSmartCE.g:2277:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2283:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSmartCE.g:2284:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSmartCE.g:2284:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSmartCE.g:2285:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_39); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSmartCE.g:2292:3: (kw= '.' this_ID_2= RULE_ID )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==53) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSmartCE.g:2293:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,53,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_39); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalSmartCE.g:2310:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalSmartCE.g:2310:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalSmartCE.g:2311:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalSmartCE.g:2317:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalSmartCE.g:2323:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.*' ) )
            // InternalSmartCE.g:2324:2: (this_QualifiedName_0= ruleQualifiedName kw= '.*' )
            {
            // InternalSmartCE.g:2324:2: (this_QualifiedName_0= ruleQualifiedName kw= '.*' )
            // InternalSmartCE.g:2325:3: this_QualifiedName_0= ruleQualifiedName kw= '.*'
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,54,FOLLOW_2); 

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
    // InternalSmartCE.g:2344:1: entryRuleYEAR returns [String current=null] : iv_ruleYEAR= ruleYEAR EOF ;
    public final String entryRuleYEAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleYEAR = null;


        try {
            // InternalSmartCE.g:2344:44: (iv_ruleYEAR= ruleYEAR EOF )
            // InternalSmartCE.g:2345:2: iv_ruleYEAR= ruleYEAR EOF
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
    // InternalSmartCE.g:2351:1: ruleYEAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleYEAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2357:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:2358:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:2368:1: entryRuleMONTH returns [String current=null] : iv_ruleMONTH= ruleMONTH EOF ;
    public final String entryRuleMONTH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMONTH = null;


        try {
            // InternalSmartCE.g:2368:45: (iv_ruleMONTH= ruleMONTH EOF )
            // InternalSmartCE.g:2369:2: iv_ruleMONTH= ruleMONTH EOF
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
    // InternalSmartCE.g:2375:1: ruleMONTH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleMONTH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2381:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:2382:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:2392:1: entryRuleDAY returns [String current=null] : iv_ruleDAY= ruleDAY EOF ;
    public final String entryRuleDAY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDAY = null;


        try {
            // InternalSmartCE.g:2392:43: (iv_ruleDAY= ruleDAY EOF )
            // InternalSmartCE.g:2393:2: iv_ruleDAY= ruleDAY EOF
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
    // InternalSmartCE.g:2399:1: ruleDAY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleDAY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2405:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:2406:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:2416:1: entryRuleHOUR returns [String current=null] : iv_ruleHOUR= ruleHOUR EOF ;
    public final String entryRuleHOUR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHOUR = null;


        try {
            // InternalSmartCE.g:2416:44: (iv_ruleHOUR= ruleHOUR EOF )
            // InternalSmartCE.g:2417:2: iv_ruleHOUR= ruleHOUR EOF
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
    // InternalSmartCE.g:2423:1: ruleHOUR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleHOUR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2429:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:2430:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:2440:1: entryRuleMIN returns [String current=null] : iv_ruleMIN= ruleMIN EOF ;
    public final String entryRuleMIN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMIN = null;


        try {
            // InternalSmartCE.g:2440:43: (iv_ruleMIN= ruleMIN EOF )
            // InternalSmartCE.g:2441:2: iv_ruleMIN= ruleMIN EOF
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
    // InternalSmartCE.g:2447:1: ruleMIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleMIN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2453:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:2454:2: this_INT_0= RULE_INT
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
    // InternalSmartCE.g:2464:1: entryRuleSEC returns [String current=null] : iv_ruleSEC= ruleSEC EOF ;
    public final String entryRuleSEC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSEC = null;


        try {
            // InternalSmartCE.g:2464:43: (iv_ruleSEC= ruleSEC EOF )
            // InternalSmartCE.g:2465:2: iv_ruleSEC= ruleSEC EOF
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
    // InternalSmartCE.g:2471:1: ruleSEC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleSEC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2477:2: (this_INT_0= RULE_INT )
            // InternalSmartCE.g:2478:2: this_INT_0= RULE_INT
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


    // $ANTLR start "ruleWeekDays"
    // InternalSmartCE.g:2488:1: ruleWeekDays returns [Enumerator current=null] : ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) ) ;
    public final Enumerator ruleWeekDays() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2494:2: ( ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) ) )
            // InternalSmartCE.g:2495:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) )
            {
            // InternalSmartCE.g:2495:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==55) ) {
                alt25=1;
            }
            else if ( (LA25_0==56) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalSmartCE.g:2496:3: (enumLiteral_0= 'Monday' )
                    {
                    // InternalSmartCE.g:2496:3: (enumLiteral_0= 'Monday' )
                    // InternalSmartCE.g:2497:4: enumLiteral_0= 'Monday'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getWeekDaysAccess().getMONDAYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWeekDaysAccess().getMONDAYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:2504:3: (enumLiteral_1= 'Tuesday' )
                    {
                    // InternalSmartCE.g:2504:3: (enumLiteral_1= 'Tuesday' )
                    // InternalSmartCE.g:2505:4: enumLiteral_1= 'Tuesday'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getWeekDaysAccess().getTUESDAYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWeekDaysAccess().getTUESDAYEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleWeekDays"


    // $ANTLR start "ruleUnitTime"
    // InternalSmartCE.g:2515:1: ruleUnitTime returns [Enumerator current=null] : (enumLiteral_0= 'Second' ) ;
    public final Enumerator ruleUnitTime() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2521:2: ( (enumLiteral_0= 'Second' ) )
            // InternalSmartCE.g:2522:2: (enumLiteral_0= 'Second' )
            {
            // InternalSmartCE.g:2522:2: (enumLiteral_0= 'Second' )
            // InternalSmartCE.g:2523:3: enumLiteral_0= 'Second'
            {
            enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

            			current = grammarAccess.getUnitTimeAccess().getSECONDEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getUnitTimeAccess().getSECONDEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleUnitTime"


    // $ANTLR start "ruleLogicalOperator"
    // InternalSmartCE.g:2532:1: ruleLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) ) ;
    public final Enumerator ruleLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSmartCE.g:2538:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) ) )
            // InternalSmartCE.g:2539:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) )
            {
            // InternalSmartCE.g:2539:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt26=1;
                }
                break;
            case 59:
                {
                alt26=2;
                }
                break;
            case 60:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalSmartCE.g:2540:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalSmartCE.g:2540:3: (enumLiteral_0= 'AND' )
                    // InternalSmartCE.g:2541:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCE.g:2548:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalSmartCE.g:2548:3: (enumLiteral_1= 'OR' )
                    // InternalSmartCE.g:2549:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getLogicalOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicalOperatorAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCE.g:2556:3: (enumLiteral_2= 'NOT' )
                    {
                    // InternalSmartCE.g:2556:3: (enumLiteral_2= 'NOT' )
                    // InternalSmartCE.g:2557:4: enumLiteral_2= 'NOT'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getLogicalOperatorAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLogicalOperatorAccess().getNOTEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleLogicalOperator"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\37\uffff";
    static final String dfa_2s = "\22\uffff\1\27\3\uffff\1\27\5\uffff\3\27";
    static final String dfa_3s = "\1\35\5\36\1\uffff\2\6\1\67\2\5\1\32\4\40\1\32\1\23\1\71\1\67\1\5\1\23\1\uffff\4\32\3\23";
    static final String dfa_4s = "\1\74\5\36\1\uffff\2\6\1\70\2\5\1\32\4\40\1\32\1\74\1\71\1\70\1\5\1\74\1\uffff\4\32\3\74";
    static final String dfa_5s = "\6\uffff\1\2\20\uffff\1\1\7\uffff";
    static final String dfa_6s = "\37\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\1\2\1\uffff\1\3\1\4\1\5\26\uffff\3\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "",
            "\1\14",
            "\1\15",
            "\1\16\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27\11\uffff\1\6\1\uffff\1\6\1\uffff\3\6\26\uffff\3\6",
            "\1\30",
            "\1\31\1\32",
            "\1\33",
            "\1\27\11\uffff\1\6\1\uffff\1\6\1\uffff\3\6\26\uffff\3\6",
            "",
            "\1\34",
            "\1\35",
            "\1\35",
            "\1\36",
            "\1\27\11\uffff\1\6\1\uffff\1\6\1\uffff\3\6\26\uffff\3\6",
            "\1\27\11\uffff\1\6\1\uffff\1\6\1\uffff\3\6\26\uffff\3\6",
            "\1\27\11\uffff\1\6\1\uffff\1\6\1\uffff\3\6\26\uffff\3\6"
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
            return "615:2: (this_BusinessRule_0= ruleBusinessRule | this_CompositeCondition_1= ruleCompositeCondition )";
        }
    }
    static final String dfa_8s = "\10\uffff";
    static final String dfa_9s = "\3\uffff\1\5\3\uffff\1\5";
    static final String dfa_10s = "\1\4\2\uffff\1\23\1\4\2\uffff\1\23";
    static final String dfa_11s = "\1\6\2\uffff\1\65\1\4\2\uffff\1\65";
    static final String dfa_12s = "\1\uffff\1\1\1\2\2\uffff\1\3\1\4\1\uffff";
    static final String dfa_13s = "\10\uffff}>";
    static final String[] dfa_14s = {
            "\1\3\1\2\1\1",
            "",
            "",
            "\1\5\6\uffff\1\5\3\uffff\1\6\1\uffff\1\5\5\uffff\2\5\1\uffff\14\5\1\4",
            "\1\7",
            "",
            "",
            "\1\5\6\uffff\1\5\3\uffff\1\6\1\uffff\1\5\5\uffff\2\5\1\uffff\14\5\1\4"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2034:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000780000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x1C00000EA0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000EA0000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004010040000070L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000040000070L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001FE0000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000040000070L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000000000000L});

}