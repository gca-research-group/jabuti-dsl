package br.edu.unijui.gca.jabuti.parser.antlr.internal;

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
import br.edu.unijui.gca.jabuti.services.JabutiGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJabutiParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'contract'", "'{'", "'dates'", "'beginDate'", "'='", "'dueDate'", "'}'", "'variables'", "'parties'", "'clauses'", "'rolePlayer'", "'right'", "'obligation'", "'prohibition'", "'application'", "'process'", "'AND'", "'&&'", "'||'", "'OR'", "'!'", "'<='", "'>='", "'>'", "'<'", "'!='", "'=='", "'is'", "'as'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "','", "'.'", "'.*'"
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


        public InternalJabutiParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJabutiParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJabutiParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJabuti.g"; }



     	private JabutiGrammarAccess grammarAccess;

        public InternalJabutiParser(TokenStream input, JabutiGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected JabutiGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalJabuti.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalJabuti.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalJabuti.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalJabuti.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_contract_1_0= ruleContract ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_contract_1_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:78:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_contract_1_0= ruleContract ) ) ) )
            // InternalJabuti.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_contract_1_0= ruleContract ) ) )
            {
            // InternalJabuti.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_contract_1_0= ruleContract ) ) )
            // InternalJabuti.g:80:3: ( (lv_imports_0_0= ruleImport ) )* ( (lv_contract_1_0= ruleContract ) )
            {
            // InternalJabuti.g:80:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJabuti.g:81:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalJabuti.g:81:4: (lv_imports_0_0= ruleImport )
            	    // InternalJabuti.g:82:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"br.edu.unijui.gca.jabuti.Jabuti.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalJabuti.g:99:3: ( (lv_contract_1_0= ruleContract ) )
            // InternalJabuti.g:100:4: (lv_contract_1_0= ruleContract )
            {
            // InternalJabuti.g:100:4: (lv_contract_1_0= ruleContract )
            // InternalJabuti.g:101:5: lv_contract_1_0= ruleContract
            {

            					newCompositeNode(grammarAccess.getModelAccess().getContractContractParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_contract_1_0=ruleContract();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"contract",
            						lv_contract_1_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.Contract");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // InternalJabuti.g:122:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalJabuti.g:122:47: (iv_ruleImport= ruleImport EOF )
            // InternalJabuti.g:123:2: iv_ruleImport= ruleImport EOF
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
    // InternalJabuti.g:129:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:135:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalJabuti.g:136:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalJabuti.g:136:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalJabuti.g:137:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalJabuti.g:141:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalJabuti.g:142:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalJabuti.g:142:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalJabuti.g:143:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
            						"br.edu.unijui.gca.jabuti.Jabuti.QualifiedNameWithWildcard");
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
    // InternalJabuti.g:164:1: entryRuleContract returns [EObject current=null] : iv_ruleContract= ruleContract EOF ;
    public final EObject entryRuleContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContract = null;


        try {
            // InternalJabuti.g:164:49: (iv_ruleContract= ruleContract EOF )
            // InternalJabuti.g:165:2: iv_ruleContract= ruleContract EOF
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
    // InternalJabuti.g:171:1: ruleContract returns [EObject current=null] : (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'dates' otherlv_4= '{' otherlv_5= 'beginDate' otherlv_6= '=' ( (lv_beginDate_7_0= RULE_STRING ) ) otherlv_8= 'dueDate' otherlv_9= '=' ( (lv_dueDate_10_0= RULE_STRING ) ) otherlv_11= '}' otherlv_12= 'variables' otherlv_13= '{' ( (lv_variables_14_0= ruleVariable ) )* otherlv_15= '}' otherlv_16= 'parties' otherlv_17= '{' ( (lv_application_18_0= ruleApplication ) ) ( (lv_process_19_0= ruleProcess ) ) otherlv_20= '}' otherlv_21= 'clauses' otherlv_22= '{' ( (lv_clauses_23_0= ruleClause ) )* otherlv_24= '}' otherlv_25= '}' ) ;
    public final EObject ruleContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_beginDate_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_dueDate_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        EObject lv_variables_14_0 = null;

        EObject lv_application_18_0 = null;

        EObject lv_process_19_0 = null;

        EObject lv_clauses_23_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:177:2: ( (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'dates' otherlv_4= '{' otherlv_5= 'beginDate' otherlv_6= '=' ( (lv_beginDate_7_0= RULE_STRING ) ) otherlv_8= 'dueDate' otherlv_9= '=' ( (lv_dueDate_10_0= RULE_STRING ) ) otherlv_11= '}' otherlv_12= 'variables' otherlv_13= '{' ( (lv_variables_14_0= ruleVariable ) )* otherlv_15= '}' otherlv_16= 'parties' otherlv_17= '{' ( (lv_application_18_0= ruleApplication ) ) ( (lv_process_19_0= ruleProcess ) ) otherlv_20= '}' otherlv_21= 'clauses' otherlv_22= '{' ( (lv_clauses_23_0= ruleClause ) )* otherlv_24= '}' otherlv_25= '}' ) )
            // InternalJabuti.g:178:2: (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'dates' otherlv_4= '{' otherlv_5= 'beginDate' otherlv_6= '=' ( (lv_beginDate_7_0= RULE_STRING ) ) otherlv_8= 'dueDate' otherlv_9= '=' ( (lv_dueDate_10_0= RULE_STRING ) ) otherlv_11= '}' otherlv_12= 'variables' otherlv_13= '{' ( (lv_variables_14_0= ruleVariable ) )* otherlv_15= '}' otherlv_16= 'parties' otherlv_17= '{' ( (lv_application_18_0= ruleApplication ) ) ( (lv_process_19_0= ruleProcess ) ) otherlv_20= '}' otherlv_21= 'clauses' otherlv_22= '{' ( (lv_clauses_23_0= ruleClause ) )* otherlv_24= '}' otherlv_25= '}' )
            {
            // InternalJabuti.g:178:2: (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'dates' otherlv_4= '{' otherlv_5= 'beginDate' otherlv_6= '=' ( (lv_beginDate_7_0= RULE_STRING ) ) otherlv_8= 'dueDate' otherlv_9= '=' ( (lv_dueDate_10_0= RULE_STRING ) ) otherlv_11= '}' otherlv_12= 'variables' otherlv_13= '{' ( (lv_variables_14_0= ruleVariable ) )* otherlv_15= '}' otherlv_16= 'parties' otherlv_17= '{' ( (lv_application_18_0= ruleApplication ) ) ( (lv_process_19_0= ruleProcess ) ) otherlv_20= '}' otherlv_21= 'clauses' otherlv_22= '{' ( (lv_clauses_23_0= ruleClause ) )* otherlv_24= '}' otherlv_25= '}' )
            // InternalJabuti.g:179:3: otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'dates' otherlv_4= '{' otherlv_5= 'beginDate' otherlv_6= '=' ( (lv_beginDate_7_0= RULE_STRING ) ) otherlv_8= 'dueDate' otherlv_9= '=' ( (lv_dueDate_10_0= RULE_STRING ) ) otherlv_11= '}' otherlv_12= 'variables' otherlv_13= '{' ( (lv_variables_14_0= ruleVariable ) )* otherlv_15= '}' otherlv_16= 'parties' otherlv_17= '{' ( (lv_application_18_0= ruleApplication ) ) ( (lv_process_19_0= ruleProcess ) ) otherlv_20= '}' otherlv_21= 'clauses' otherlv_22= '{' ( (lv_clauses_23_0= ruleClause ) )* otherlv_24= '}' otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getContractAccess().getContractKeyword_0());
            		
            // InternalJabuti.g:183:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJabuti.g:184:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJabuti.g:184:4: (lv_name_1_0= RULE_ID )
            // InternalJabuti.g:185:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getContractAccess().getDatesKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getContractAccess().getBeginDateKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getContractAccess().getEqualsSignKeyword_6());
            		
            // InternalJabuti.g:221:3: ( (lv_beginDate_7_0= RULE_STRING ) )
            // InternalJabuti.g:222:4: (lv_beginDate_7_0= RULE_STRING )
            {
            // InternalJabuti.g:222:4: (lv_beginDate_7_0= RULE_STRING )
            // InternalJabuti.g:223:5: lv_beginDate_7_0= RULE_STRING
            {
            lv_beginDate_7_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_beginDate_7_0, grammarAccess.getContractAccess().getBeginDateSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContractRule());
            					}
            					setWithLastConsumed(
            						current,
            						"beginDate",
            						lv_beginDate_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getContractAccess().getDueDateKeyword_8());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getContractAccess().getEqualsSignKeyword_9());
            		
            // InternalJabuti.g:247:3: ( (lv_dueDate_10_0= RULE_STRING ) )
            // InternalJabuti.g:248:4: (lv_dueDate_10_0= RULE_STRING )
            {
            // InternalJabuti.g:248:4: (lv_dueDate_10_0= RULE_STRING )
            // InternalJabuti.g:249:5: lv_dueDate_10_0= RULE_STRING
            {
            lv_dueDate_10_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_dueDate_10_0, grammarAccess.getContractAccess().getDueDateSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContractRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dueDate",
            						lv_dueDate_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_12=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_12, grammarAccess.getContractAccess().getVariablesKeyword_12());
            		
            otherlv_13=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_13, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalJabuti.g:277:3: ( (lv_variables_14_0= ruleVariable ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalJabuti.g:278:4: (lv_variables_14_0= ruleVariable )
            	    {
            	    // InternalJabuti.g:278:4: (lv_variables_14_0= ruleVariable )
            	    // InternalJabuti.g:279:5: lv_variables_14_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getContractAccess().getVariablesVariableParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_variables_14_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContractRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_14_0,
            	    						"br.edu.unijui.gca.jabuti.Jabuti.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_15=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_15, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_16=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_16, grammarAccess.getContractAccess().getPartiesKeyword_16());
            		
            otherlv_17=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_17, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_17());
            		
            // InternalJabuti.g:308:3: ( (lv_application_18_0= ruleApplication ) )
            // InternalJabuti.g:309:4: (lv_application_18_0= ruleApplication )
            {
            // InternalJabuti.g:309:4: (lv_application_18_0= ruleApplication )
            // InternalJabuti.g:310:5: lv_application_18_0= ruleApplication
            {

            					newCompositeNode(grammarAccess.getContractAccess().getApplicationApplicationParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_16);
            lv_application_18_0=ruleApplication();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"application",
            						lv_application_18_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.Application");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJabuti.g:327:3: ( (lv_process_19_0= ruleProcess ) )
            // InternalJabuti.g:328:4: (lv_process_19_0= ruleProcess )
            {
            // InternalJabuti.g:328:4: (lv_process_19_0= ruleProcess )
            // InternalJabuti.g:329:5: lv_process_19_0= ruleProcess
            {

            					newCompositeNode(grammarAccess.getContractAccess().getProcessProcessParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_11);
            lv_process_19_0=ruleProcess();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"process",
            						lv_process_19_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.Process");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_20=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_20, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_20());
            		
            otherlv_21=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_21, grammarAccess.getContractAccess().getClausesKeyword_21());
            		
            otherlv_22=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_22, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_22());
            		
            // InternalJabuti.g:358:3: ( (lv_clauses_23_0= ruleClause ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=23 && LA3_0<=25)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJabuti.g:359:4: (lv_clauses_23_0= ruleClause )
            	    {
            	    // InternalJabuti.g:359:4: (lv_clauses_23_0= ruleClause )
            	    // InternalJabuti.g:360:5: lv_clauses_23_0= ruleClause
            	    {

            	    					newCompositeNode(grammarAccess.getContractAccess().getClausesClauseParserRuleCall_23_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_clauses_23_0=ruleClause();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContractRule());
            	    					}
            	    					add(
            	    						current,
            	    						"clauses",
            	    						lv_clauses_23_0,
            	    						"br.edu.unijui.gca.jabuti.Jabuti.Clause");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_24=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_24, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_24());
            		
            otherlv_25=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_25());
            		

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
    // InternalJabuti.g:389:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalJabuti.g:389:47: (iv_ruleClause= ruleClause EOF )
            // InternalJabuti.g:390:2: iv_ruleClause= ruleClause EOF
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
    // InternalJabuti.g:396:1: ruleClause returns [EObject current=null] : ( (this_Right_0= ruleRight | this_Prohibition_1= ruleProhibition | this_Obligation_2= ruleObligation ) otherlv_3= '{' otherlv_4= 'rolePlayer' otherlv_5= '=' ( (lv_roleplayer_6_0= ruleRolePlayer ) ) otherlv_7= '}' ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_Right_0 = null;

        EObject this_Prohibition_1 = null;

        EObject this_Obligation_2 = null;

        Enumerator lv_roleplayer_6_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:402:2: ( ( (this_Right_0= ruleRight | this_Prohibition_1= ruleProhibition | this_Obligation_2= ruleObligation ) otherlv_3= '{' otherlv_4= 'rolePlayer' otherlv_5= '=' ( (lv_roleplayer_6_0= ruleRolePlayer ) ) otherlv_7= '}' ) )
            // InternalJabuti.g:403:2: ( (this_Right_0= ruleRight | this_Prohibition_1= ruleProhibition | this_Obligation_2= ruleObligation ) otherlv_3= '{' otherlv_4= 'rolePlayer' otherlv_5= '=' ( (lv_roleplayer_6_0= ruleRolePlayer ) ) otherlv_7= '}' )
            {
            // InternalJabuti.g:403:2: ( (this_Right_0= ruleRight | this_Prohibition_1= ruleProhibition | this_Obligation_2= ruleObligation ) otherlv_3= '{' otherlv_4= 'rolePlayer' otherlv_5= '=' ( (lv_roleplayer_6_0= ruleRolePlayer ) ) otherlv_7= '}' )
            // InternalJabuti.g:404:3: (this_Right_0= ruleRight | this_Prohibition_1= ruleProhibition | this_Obligation_2= ruleObligation ) otherlv_3= '{' otherlv_4= 'rolePlayer' otherlv_5= '=' ( (lv_roleplayer_6_0= ruleRolePlayer ) ) otherlv_7= '}'
            {
            // InternalJabuti.g:404:3: (this_Right_0= ruleRight | this_Prohibition_1= ruleProhibition | this_Obligation_2= ruleObligation )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 24:
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
                    // InternalJabuti.g:405:4: this_Right_0= ruleRight
                    {

                    				newCompositeNode(grammarAccess.getClauseAccess().getRightParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_5);
                    this_Right_0=ruleRight();

                    state._fsp--;


                    				current = this_Right_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalJabuti.g:414:4: this_Prohibition_1= ruleProhibition
                    {

                    				newCompositeNode(grammarAccess.getClauseAccess().getProhibitionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_5);
                    this_Prohibition_1=ruleProhibition();

                    state._fsp--;


                    				current = this_Prohibition_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalJabuti.g:423:4: this_Obligation_2= ruleObligation
                    {

                    				newCompositeNode(grammarAccess.getClauseAccess().getObligationParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_5);
                    this_Obligation_2=ruleObligation();

                    state._fsp--;


                    				current = this_Obligation_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getClauseAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getClauseAccess().getRolePlayerKeyword_2());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getClauseAccess().getEqualsSignKeyword_3());
            		
            // InternalJabuti.g:444:3: ( (lv_roleplayer_6_0= ruleRolePlayer ) )
            // InternalJabuti.g:445:4: (lv_roleplayer_6_0= ruleRolePlayer )
            {
            // InternalJabuti.g:445:4: (lv_roleplayer_6_0= ruleRolePlayer )
            // InternalJabuti.g:446:5: lv_roleplayer_6_0= ruleRolePlayer
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getRoleplayerRolePlayerEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_roleplayer_6_0=ruleRolePlayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseRule());
            					}
            					set(
            						current,
            						"roleplayer",
            						lv_roleplayer_6_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.RolePlayer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getClauseAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleRight"
    // InternalJabuti.g:471:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // InternalJabuti.g:471:46: (iv_ruleRight= ruleRight EOF )
            // InternalJabuti.g:472:2: iv_ruleRight= ruleRight EOF
            {
             newCompositeNode(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRight=ruleRight();

            state._fsp--;

             current =iv_ruleRight; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // InternalJabuti.g:478:1: ruleRight returns [EObject current=null] : (otherlv_0= 'right' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:484:2: ( (otherlv_0= 'right' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalJabuti.g:485:2: (otherlv_0= 'right' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalJabuti.g:485:2: (otherlv_0= 'right' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalJabuti.g:486:3: otherlv_0= 'right' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRightAccess().getRightKeyword_0());
            		
            // InternalJabuti.g:490:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJabuti.g:491:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJabuti.g:491:4: (lv_name_1_0= RULE_ID )
            // InternalJabuti.g:492:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRightAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRightRule());
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
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleObligation"
    // InternalJabuti.g:512:1: entryRuleObligation returns [EObject current=null] : iv_ruleObligation= ruleObligation EOF ;
    public final EObject entryRuleObligation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObligation = null;


        try {
            // InternalJabuti.g:512:51: (iv_ruleObligation= ruleObligation EOF )
            // InternalJabuti.g:513:2: iv_ruleObligation= ruleObligation EOF
            {
             newCompositeNode(grammarAccess.getObligationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObligation=ruleObligation();

            state._fsp--;

             current =iv_ruleObligation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObligation"


    // $ANTLR start "ruleObligation"
    // InternalJabuti.g:519:1: ruleObligation returns [EObject current=null] : (otherlv_0= 'obligation' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleObligation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:525:2: ( (otherlv_0= 'obligation' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalJabuti.g:526:2: (otherlv_0= 'obligation' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalJabuti.g:526:2: (otherlv_0= 'obligation' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalJabuti.g:527:3: otherlv_0= 'obligation' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObligationAccess().getObligationKeyword_0());
            		
            // InternalJabuti.g:531:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJabuti.g:532:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJabuti.g:532:4: (lv_name_1_0= RULE_ID )
            // InternalJabuti.g:533:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObligationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObligationRule());
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
    // $ANTLR end "ruleObligation"


    // $ANTLR start "entryRuleProhibition"
    // InternalJabuti.g:553:1: entryRuleProhibition returns [EObject current=null] : iv_ruleProhibition= ruleProhibition EOF ;
    public final EObject entryRuleProhibition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProhibition = null;


        try {
            // InternalJabuti.g:553:52: (iv_ruleProhibition= ruleProhibition EOF )
            // InternalJabuti.g:554:2: iv_ruleProhibition= ruleProhibition EOF
            {
             newCompositeNode(grammarAccess.getProhibitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProhibition=ruleProhibition();

            state._fsp--;

             current =iv_ruleProhibition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProhibition"


    // $ANTLR start "ruleProhibition"
    // InternalJabuti.g:560:1: ruleProhibition returns [EObject current=null] : (otherlv_0= 'prohibition' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleProhibition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:566:2: ( (otherlv_0= 'prohibition' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalJabuti.g:567:2: (otherlv_0= 'prohibition' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalJabuti.g:567:2: (otherlv_0= 'prohibition' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalJabuti.g:568:3: otherlv_0= 'prohibition' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProhibitionAccess().getProhibitionKeyword_0());
            		
            // InternalJabuti.g:572:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJabuti.g:573:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJabuti.g:573:4: (lv_name_1_0= RULE_ID )
            // InternalJabuti.g:574:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProhibitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProhibitionRule());
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
    // $ANTLR end "ruleProhibition"


    // $ANTLR start "entryRuleApplication"
    // InternalJabuti.g:594:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalJabuti.g:594:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalJabuti.g:595:2: iv_ruleApplication= ruleApplication EOF
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
    // InternalJabuti.g:601:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'application' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:607:2: ( (otherlv_0= 'application' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalJabuti.g:608:2: (otherlv_0= 'application' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalJabuti.g:608:2: (otherlv_0= 'application' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalJabuti.g:609:3: otherlv_0= 'application' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationAccess().getEqualsSignKeyword_1());
            		
            // InternalJabuti.g:617:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalJabuti.g:618:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalJabuti.g:618:4: (lv_name_2_0= RULE_STRING )
            // InternalJabuti.g:619:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getApplicationAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplicationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
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
    // InternalJabuti.g:639:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalJabuti.g:639:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalJabuti.g:640:2: iv_ruleProcess= ruleProcess EOF
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
    // InternalJabuti.g:646:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:652:2: ( (otherlv_0= 'process' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalJabuti.g:653:2: (otherlv_0= 'process' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalJabuti.g:653:2: (otherlv_0= 'process' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalJabuti.g:654:3: otherlv_0= 'process' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getEqualsSignKeyword_1());
            		
            // InternalJabuti.g:662:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalJabuti.g:663:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalJabuti.g:663:4: (lv_name_2_0= RULE_STRING )
            // InternalJabuti.g:664:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getProcessAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
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


    // $ANTLR start "entryRuleExpression"
    // InternalJabuti.g:684:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalJabuti.g:684:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalJabuti.g:685:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalJabuti.g:691:1: ruleExpression returns [EObject current=null] : (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) ) )* ) ;
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
            // InternalJabuti.g:697:2: ( (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) ) )* ) )
            // InternalJabuti.g:698:2: (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) ) )* )
            {
            // InternalJabuti.g:698:2: (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) ) )* )
            // InternalJabuti.g:699:3: this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getNegationParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_Negation_0=ruleNegation();

            state._fsp--;


            			current = this_Negation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJabuti.g:707:3: ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=28 && LA6_0<=31)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalJabuti.g:708:4: () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) )
            	    {
            	    // InternalJabuti.g:708:4: ()
            	    // InternalJabuti.g:709:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalJabuti.g:715:4: ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) )
            	    int alt5=4;
            	    switch ( input.LA(1) ) {
            	    case 28:
            	        {
            	        alt5=1;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt5=2;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt5=3;
            	        }
            	        break;
            	    case 31:
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
            	            // InternalJabuti.g:716:5: ( (lv_symbol_2_0= 'AND' ) )
            	            {
            	            // InternalJabuti.g:716:5: ( (lv_symbol_2_0= 'AND' ) )
            	            // InternalJabuti.g:717:6: (lv_symbol_2_0= 'AND' )
            	            {
            	            // InternalJabuti.g:717:6: (lv_symbol_2_0= 'AND' )
            	            // InternalJabuti.g:718:7: lv_symbol_2_0= 'AND'
            	            {
            	            lv_symbol_2_0=(Token)match(input,28,FOLLOW_22); 

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
            	            // InternalJabuti.g:731:5: ( (lv_symbol_3_0= '&&' ) )
            	            {
            	            // InternalJabuti.g:731:5: ( (lv_symbol_3_0= '&&' ) )
            	            // InternalJabuti.g:732:6: (lv_symbol_3_0= '&&' )
            	            {
            	            // InternalJabuti.g:732:6: (lv_symbol_3_0= '&&' )
            	            // InternalJabuti.g:733:7: lv_symbol_3_0= '&&'
            	            {
            	            lv_symbol_3_0=(Token)match(input,29,FOLLOW_22); 

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
            	            // InternalJabuti.g:746:5: ( (lv_symbol_4_0= '||' ) )
            	            {
            	            // InternalJabuti.g:746:5: ( (lv_symbol_4_0= '||' ) )
            	            // InternalJabuti.g:747:6: (lv_symbol_4_0= '||' )
            	            {
            	            // InternalJabuti.g:747:6: (lv_symbol_4_0= '||' )
            	            // InternalJabuti.g:748:7: lv_symbol_4_0= '||'
            	            {
            	            lv_symbol_4_0=(Token)match(input,30,FOLLOW_22); 

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
            	            // InternalJabuti.g:761:5: ( (lv_symbol_5_0= 'OR' ) )
            	            {
            	            // InternalJabuti.g:761:5: ( (lv_symbol_5_0= 'OR' ) )
            	            // InternalJabuti.g:762:6: (lv_symbol_5_0= 'OR' )
            	            {
            	            // InternalJabuti.g:762:6: (lv_symbol_5_0= 'OR' )
            	            // InternalJabuti.g:763:7: lv_symbol_5_0= 'OR'
            	            {
            	            lv_symbol_5_0=(Token)match(input,31,FOLLOW_22); 

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

            	    // InternalJabuti.g:776:4: ( (lv_right_6_0= ruleNegation ) )
            	    // InternalJabuti.g:777:5: (lv_right_6_0= ruleNegation )
            	    {
            	    // InternalJabuti.g:777:5: (lv_right_6_0= ruleNegation )
            	    // InternalJabuti.g:778:6: lv_right_6_0= ruleNegation
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightNegationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_6_0=ruleNegation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_6_0,
            	    							"br.edu.unijui.gca.jabuti.Jabuti.Negation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalJabuti.g:800:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalJabuti.g:800:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalJabuti.g:801:2: iv_ruleNegation= ruleNegation EOF
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
    // InternalJabuti.g:807:1: ruleNegation returns [EObject current=null] : (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        EObject this_Comparison_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:813:2: ( (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) ) )
            // InternalJabuti.g:814:2: (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) )
            {
            // InternalJabuti.g:814:2: (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||LA7_0==42||LA7_0==45) ) {
                alt7=1;
            }
            else if ( (LA7_0==32) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalJabuti.g:815:3: this_Comparison_0= ruleComparison
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
                    // InternalJabuti.g:824:3: ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) )
                    {
                    // InternalJabuti.g:824:3: ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) )
                    // InternalJabuti.g:825:4: () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) )
                    {
                    // InternalJabuti.g:825:4: ()
                    // InternalJabuti.g:826:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegationAccess().getUnaryOperatorAction_1_0(),
                    						current);
                    				

                    }

                    // InternalJabuti.g:832:4: ( (lv_symbol_2_0= '!' ) )
                    // InternalJabuti.g:833:5: (lv_symbol_2_0= '!' )
                    {
                    // InternalJabuti.g:833:5: (lv_symbol_2_0= '!' )
                    // InternalJabuti.g:834:6: lv_symbol_2_0= '!'
                    {
                    lv_symbol_2_0=(Token)match(input,32,FOLLOW_23); 

                    						newLeafNode(lv_symbol_2_0, grammarAccess.getNegationAccess().getSymbolExclamationMarkKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNegationRule());
                    						}
                    						setWithLastConsumed(current, "symbol", lv_symbol_2_0, "!");
                    					

                    }


                    }

                    // InternalJabuti.g:846:4: ( (lv_expression_3_0= ruleComparison ) )
                    // InternalJabuti.g:847:5: (lv_expression_3_0= ruleComparison )
                    {
                    // InternalJabuti.g:847:5: (lv_expression_3_0= ruleComparison )
                    // InternalJabuti.g:848:6: lv_expression_3_0= ruleComparison
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
                    							"br.edu.unijui.gca.jabuti.Jabuti.Comparison");
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
    // InternalJabuti.g:870:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalJabuti.g:870:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalJabuti.g:871:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalJabuti.g:877:1: ruleComparison returns [EObject current=null] : (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* ) ;
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
            // InternalJabuti.g:883:2: ( (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* ) )
            // InternalJabuti.g:884:2: (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* )
            {
            // InternalJabuti.g:884:2: (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* )
            // InternalJabuti.g:885:3: this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_Plus_0=rulePlus();

            state._fsp--;


            			current = this_Plus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJabuti.g:893:3: ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=33 && LA9_0<=40)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalJabuti.g:894:4: () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) )
            	    {
            	    // InternalJabuti.g:894:4: ()
            	    // InternalJabuti.g:895:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalJabuti.g:901:4: ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) )
            	    int alt8=8;
            	    switch ( input.LA(1) ) {
            	    case 33:
            	        {
            	        alt8=1;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt8=2;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt8=3;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt8=4;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt8=5;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt8=6;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt8=7;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt8=8;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt8) {
            	        case 1 :
            	            // InternalJabuti.g:902:5: ( (lv_symbol_2_0= '<=' ) )
            	            {
            	            // InternalJabuti.g:902:5: ( (lv_symbol_2_0= '<=' ) )
            	            // InternalJabuti.g:903:6: (lv_symbol_2_0= '<=' )
            	            {
            	            // InternalJabuti.g:903:6: (lv_symbol_2_0= '<=' )
            	            // InternalJabuti.g:904:7: lv_symbol_2_0= '<='
            	            {
            	            lv_symbol_2_0=(Token)match(input,33,FOLLOW_23); 

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
            	            // InternalJabuti.g:917:5: ( (lv_symbol_3_0= '>=' ) )
            	            {
            	            // InternalJabuti.g:917:5: ( (lv_symbol_3_0= '>=' ) )
            	            // InternalJabuti.g:918:6: (lv_symbol_3_0= '>=' )
            	            {
            	            // InternalJabuti.g:918:6: (lv_symbol_3_0= '>=' )
            	            // InternalJabuti.g:919:7: lv_symbol_3_0= '>='
            	            {
            	            lv_symbol_3_0=(Token)match(input,34,FOLLOW_23); 

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
            	            // InternalJabuti.g:932:5: ( (lv_symbol_4_0= '>' ) )
            	            {
            	            // InternalJabuti.g:932:5: ( (lv_symbol_4_0= '>' ) )
            	            // InternalJabuti.g:933:6: (lv_symbol_4_0= '>' )
            	            {
            	            // InternalJabuti.g:933:6: (lv_symbol_4_0= '>' )
            	            // InternalJabuti.g:934:7: lv_symbol_4_0= '>'
            	            {
            	            lv_symbol_4_0=(Token)match(input,35,FOLLOW_23); 

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
            	            // InternalJabuti.g:947:5: ( (lv_symbol_5_0= '<' ) )
            	            {
            	            // InternalJabuti.g:947:5: ( (lv_symbol_5_0= '<' ) )
            	            // InternalJabuti.g:948:6: (lv_symbol_5_0= '<' )
            	            {
            	            // InternalJabuti.g:948:6: (lv_symbol_5_0= '<' )
            	            // InternalJabuti.g:949:7: lv_symbol_5_0= '<'
            	            {
            	            lv_symbol_5_0=(Token)match(input,36,FOLLOW_23); 

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
            	            // InternalJabuti.g:962:5: ( (lv_symbol_6_0= '!=' ) )
            	            {
            	            // InternalJabuti.g:962:5: ( (lv_symbol_6_0= '!=' ) )
            	            // InternalJabuti.g:963:6: (lv_symbol_6_0= '!=' )
            	            {
            	            // InternalJabuti.g:963:6: (lv_symbol_6_0= '!=' )
            	            // InternalJabuti.g:964:7: lv_symbol_6_0= '!='
            	            {
            	            lv_symbol_6_0=(Token)match(input,37,FOLLOW_23); 

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
            	            // InternalJabuti.g:977:5: ( (lv_symbol_7_0= '==' ) )
            	            {
            	            // InternalJabuti.g:977:5: ( (lv_symbol_7_0= '==' ) )
            	            // InternalJabuti.g:978:6: (lv_symbol_7_0= '==' )
            	            {
            	            // InternalJabuti.g:978:6: (lv_symbol_7_0= '==' )
            	            // InternalJabuti.g:979:7: lv_symbol_7_0= '=='
            	            {
            	            lv_symbol_7_0=(Token)match(input,38,FOLLOW_23); 

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
            	            // InternalJabuti.g:992:5: ( (lv_symbol_8_0= 'is' ) )
            	            {
            	            // InternalJabuti.g:992:5: ( (lv_symbol_8_0= 'is' ) )
            	            // InternalJabuti.g:993:6: (lv_symbol_8_0= 'is' )
            	            {
            	            // InternalJabuti.g:993:6: (lv_symbol_8_0= 'is' )
            	            // InternalJabuti.g:994:7: lv_symbol_8_0= 'is'
            	            {
            	            lv_symbol_8_0=(Token)match(input,39,FOLLOW_23); 

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
            	            // InternalJabuti.g:1007:5: ( (lv_symbol_9_0= 'as' ) )
            	            {
            	            // InternalJabuti.g:1007:5: ( (lv_symbol_9_0= 'as' ) )
            	            // InternalJabuti.g:1008:6: (lv_symbol_9_0= 'as' )
            	            {
            	            // InternalJabuti.g:1008:6: (lv_symbol_9_0= 'as' )
            	            // InternalJabuti.g:1009:7: lv_symbol_9_0= 'as'
            	            {
            	            lv_symbol_9_0=(Token)match(input,40,FOLLOW_23); 

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

            	    // InternalJabuti.g:1022:4: ( (lv_right_10_0= rulePlus ) )
            	    // InternalJabuti.g:1023:5: (lv_right_10_0= rulePlus )
            	    {
            	    // InternalJabuti.g:1023:5: (lv_right_10_0= rulePlus )
            	    // InternalJabuti.g:1024:6: lv_right_10_0= rulePlus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_right_10_0=rulePlus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_10_0,
            	    							"br.edu.unijui.gca.jabuti.Jabuti.Plus");
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlus"
    // InternalJabuti.g:1046:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalJabuti.g:1046:45: (iv_rulePlus= rulePlus EOF )
            // InternalJabuti.g:1047:2: iv_rulePlus= rulePlus EOF
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
    // InternalJabuti.g:1053:1: rulePlus returns [EObject current=null] : (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1059:2: ( (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* ) )
            // InternalJabuti.g:1060:2: (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* )
            {
            // InternalJabuti.g:1060:2: (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* )
            // InternalJabuti.g:1061:3: this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJabuti.g:1069:3: ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=41 && LA11_0<=42)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJabuti.g:1070:4: () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) )
            	    {
            	    // InternalJabuti.g:1070:4: ()
            	    // InternalJabuti.g:1071:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPlusAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalJabuti.g:1077:4: (otherlv_2= '+' | otherlv_3= '-' )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==41) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==42) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalJabuti.g:1078:5: otherlv_2= '+'
            	            {
            	            otherlv_2=(Token)match(input,41,FOLLOW_23); 

            	            					newLeafNode(otherlv_2, grammarAccess.getPlusAccess().getPlusSignKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalJabuti.g:1083:5: otherlv_3= '-'
            	            {
            	            otherlv_3=(Token)match(input,42,FOLLOW_23); 

            	            					newLeafNode(otherlv_3, grammarAccess.getPlusAccess().getHyphenMinusKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalJabuti.g:1088:4: ( (lv_right_4_0= ruleFactor ) )
            	    // InternalJabuti.g:1089:5: (lv_right_4_0= ruleFactor )
            	    {
            	    // InternalJabuti.g:1089:5: (lv_right_4_0= ruleFactor )
            	    // InternalJabuti.g:1090:6: lv_right_4_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getPlusAccess().getRightFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_right_4_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"br.edu.unijui.gca.jabuti.Jabuti.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


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
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleFactor"
    // InternalJabuti.g:1112:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalJabuti.g:1112:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalJabuti.g:1113:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalJabuti.g:1119:1: ruleFactor returns [EObject current=null] : (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Negative_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1125:2: ( (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* ) )
            // InternalJabuti.g:1126:2: (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* )
            {
            // InternalJabuti.g:1126:2: (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* )
            // InternalJabuti.g:1127:3: this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getNegativeParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_Negative_0=ruleNegative();

            state._fsp--;


            			current = this_Negative_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJabuti.g:1135:3: ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=43 && LA13_0<=44)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalJabuti.g:1136:4: () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) )
            	    {
            	    // InternalJabuti.g:1136:4: ()
            	    // InternalJabuti.g:1137:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFactorAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalJabuti.g:1143:4: (otherlv_2= '*' | otherlv_3= '/' )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==43) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==44) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalJabuti.g:1144:5: otherlv_2= '*'
            	            {
            	            otherlv_2=(Token)match(input,43,FOLLOW_23); 

            	            					newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalJabuti.g:1149:5: otherlv_3= '/'
            	            {
            	            otherlv_3=(Token)match(input,44,FOLLOW_23); 

            	            					newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalJabuti.g:1154:4: ( (lv_right_4_0= ruleNegative ) )
            	    // InternalJabuti.g:1155:5: (lv_right_4_0= ruleNegative )
            	    {
            	    // InternalJabuti.g:1155:5: (lv_right_4_0= ruleNegative )
            	    // InternalJabuti.g:1156:6: lv_right_4_0= ruleNegative
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightNegativeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_right_4_0=ruleNegative();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"br.edu.unijui.gca.jabuti.Jabuti.Negative");
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


            	leaveRule();

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
    // InternalJabuti.g:1178:1: entryRuleNegative returns [EObject current=null] : iv_ruleNegative= ruleNegative EOF ;
    public final EObject entryRuleNegative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegative = null;


        try {
            // InternalJabuti.g:1178:49: (iv_ruleNegative= ruleNegative EOF )
            // InternalJabuti.g:1179:2: iv_ruleNegative= ruleNegative EOF
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
    // InternalJabuti.g:1185:1: ruleNegative returns [EObject current=null] : (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) ) ;
    public final EObject ruleNegative() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1191:2: ( (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) ) )
            // InternalJabuti.g:1192:2: (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) )
            {
            // InternalJabuti.g:1192:2: (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_INT)||LA14_0==45) ) {
                alt14=1;
            }
            else if ( (LA14_0==42) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalJabuti.g:1193:3: this_Primary_0= rulePrimary
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
                    // InternalJabuti.g:1202:3: ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) )
                    {
                    // InternalJabuti.g:1202:3: ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) )
                    // InternalJabuti.g:1203:4: () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) )
                    {
                    // InternalJabuti.g:1203:4: ()
                    // InternalJabuti.g:1204:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegativeAccess().getUnaryOperatorAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,42,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getNegativeAccess().getHyphenMinusKeyword_1_1());
                    			
                    // InternalJabuti.g:1214:4: ( (lv_expression_3_0= rulePrimary ) )
                    // InternalJabuti.g:1215:5: (lv_expression_3_0= rulePrimary )
                    {
                    // InternalJabuti.g:1215:5: (lv_expression_3_0= rulePrimary )
                    // InternalJabuti.g:1216:6: lv_expression_3_0= rulePrimary
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
                    							"br.edu.unijui.gca.jabuti.Jabuti.Primary");
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
    // InternalJabuti.g:1238:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalJabuti.g:1238:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalJabuti.g:1239:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalJabuti.g:1245:1: rulePrimary returns [EObject current=null] : (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_LiteralValue_0 = null;

        EObject this_Expression_2 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1251:2: ( (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) )
            // InternalJabuti.g:1252:2: (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            {
            // InternalJabuti.g:1252:2: (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_INT)) ) {
                alt15=1;
            }
            else if ( (LA15_0==45) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalJabuti.g:1253:3: this_LiteralValue_0= ruleLiteralValue
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
                    // InternalJabuti.g:1262:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalJabuti.g:1262:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalJabuti.g:1263:4: otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_28);
                    this_Expression_2=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,46,FOLLOW_2); 

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
    // InternalJabuti.g:1284:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // InternalJabuti.g:1284:53: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // InternalJabuti.g:1285:2: iv_ruleLiteralValue= ruleLiteralValue EOF
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
    // InternalJabuti.g:1291:1: ruleLiteralValue returns [EObject current=null] : (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject this_NumericValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_VariableValue_2 = null;

        EObject this_FunctionCall_3 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1297:2: ( (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall ) )
            // InternalJabuti.g:1298:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )
            {
            // InternalJabuti.g:1298:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )
            int alt16=4;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalJabuti.g:1299:3: this_NumericValue_0= ruleNumericValue
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
                    // InternalJabuti.g:1308:3: this_StringValue_1= ruleStringValue
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
                    // InternalJabuti.g:1317:3: this_VariableValue_2= ruleVariableValue
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
                    // InternalJabuti.g:1326:3: this_FunctionCall_3= ruleFunctionCall
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
    // InternalJabuti.g:1338:1: entryRuleNumericValue returns [EObject current=null] : iv_ruleNumericValue= ruleNumericValue EOF ;
    public final EObject entryRuleNumericValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericValue = null;


        try {
            // InternalJabuti.g:1338:53: (iv_ruleNumericValue= ruleNumericValue EOF )
            // InternalJabuti.g:1339:2: iv_ruleNumericValue= ruleNumericValue EOF
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
    // InternalJabuti.g:1345:1: ruleNumericValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumericValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:1351:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalJabuti.g:1352:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalJabuti.g:1352:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalJabuti.g:1353:3: (lv_value_0_0= RULE_INT )
            {
            // InternalJabuti.g:1353:3: (lv_value_0_0= RULE_INT )
            // InternalJabuti.g:1354:4: lv_value_0_0= RULE_INT
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
    // InternalJabuti.g:1373:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalJabuti.g:1373:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalJabuti.g:1374:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalJabuti.g:1380:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:1386:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalJabuti.g:1387:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalJabuti.g:1387:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalJabuti.g:1388:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalJabuti.g:1388:3: (lv_value_0_0= RULE_STRING )
            // InternalJabuti.g:1389:4: lv_value_0_0= RULE_STRING
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
    // InternalJabuti.g:1408:1: entryRuleVariableValue returns [EObject current=null] : iv_ruleVariableValue= ruleVariableValue EOF ;
    public final EObject entryRuleVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableValue = null;


        try {
            // InternalJabuti.g:1408:54: (iv_ruleVariableValue= ruleVariableValue EOF )
            // InternalJabuti.g:1409:2: iv_ruleVariableValue= ruleVariableValue EOF
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
    // InternalJabuti.g:1415:1: ruleVariableValue returns [EObject current=null] : ( (lv_value_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleVariableValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1421:2: ( ( (lv_value_0_0= ruleQualifiedName ) ) )
            // InternalJabuti.g:1422:2: ( (lv_value_0_0= ruleQualifiedName ) )
            {
            // InternalJabuti.g:1422:2: ( (lv_value_0_0= ruleQualifiedName ) )
            // InternalJabuti.g:1423:3: (lv_value_0_0= ruleQualifiedName )
            {
            // InternalJabuti.g:1423:3: (lv_value_0_0= ruleQualifiedName )
            // InternalJabuti.g:1424:4: lv_value_0_0= ruleQualifiedName
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
            					"br.edu.unijui.gca.jabuti.Jabuti.QualifiedName");
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
    // InternalJabuti.g:1444:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalJabuti.g:1444:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalJabuti.g:1445:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalJabuti.g:1451:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' ) ;
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
            // InternalJabuti.g:1457:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' ) )
            // InternalJabuti.g:1458:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            {
            // InternalJabuti.g:1458:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            // InternalJabuti.g:1459:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')'
            {
            // InternalJabuti.g:1459:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalJabuti.g:1460:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalJabuti.g:1460:4: (lv_name_0_0= ruleQualifiedName )
            // InternalJabuti.g:1461:5: lv_name_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getNameQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalJabuti.g:1482:3: ( (lv_params_2_0= ruleExpression ) )
            // InternalJabuti.g:1483:4: (lv_params_2_0= ruleExpression )
            {
            // InternalJabuti.g:1483:4: (lv_params_2_0= ruleExpression )
            // InternalJabuti.g:1484:5: lv_params_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getParamsExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_params_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            					}
            					add(
            						current,
            						"params",
            						lv_params_2_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJabuti.g:1501:3: (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==47) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalJabuti.g:1502:4: otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,47,FOLLOW_22); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalJabuti.g:1506:4: ( (lv_params_4_0= ruleExpression ) )
            	    // InternalJabuti.g:1507:5: (lv_params_4_0= ruleExpression )
            	    {
            	    // InternalJabuti.g:1507:5: (lv_params_4_0= ruleExpression )
            	    // InternalJabuti.g:1508:6: lv_params_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionCallAccess().getParamsExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_params_4_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            	    						}
            	    						add(
            	    							current,
            	    							"params",
            	    							lv_params_4_0,
            	    							"br.edu.unijui.gca.jabuti.Jabuti.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_5=(Token)match(input,46,FOLLOW_2); 

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


    // $ANTLR start "entryRuleVariable"
    // InternalJabuti.g:1534:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalJabuti.g:1534:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalJabuti.g:1535:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalJabuti.g:1541:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1547:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalJabuti.g:1548:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalJabuti.g:1548:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalJabuti.g:1549:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalJabuti.g:1549:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalJabuti.g:1550:4: (lv_name_0_0= RULE_ID )
            {
            // InternalJabuti.g:1550:4: (lv_name_0_0= RULE_ID )
            // InternalJabuti.g:1551:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
            		
            // InternalJabuti.g:1571:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJabuti.g:1572:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJabuti.g:1572:4: (lv_expression_2_0= ruleExpression )
            // InternalJabuti.g:1573:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.Expression");
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalJabuti.g:1594:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalJabuti.g:1594:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalJabuti.g:1595:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalJabuti.g:1601:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalJabuti.g:1607:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalJabuti.g:1608:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalJabuti.g:1608:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalJabuti.g:1609:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalJabuti.g:1616:3: (kw= '.' this_ID_2= RULE_ID )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==48) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalJabuti.g:1617:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,48,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalJabuti.g:1634:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalJabuti.g:1634:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalJabuti.g:1635:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalJabuti.g:1641:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1647:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.*' ) )
            // InternalJabuti.g:1648:2: (this_QualifiedName_0= ruleQualifiedName kw= '.*' )
            {
            // InternalJabuti.g:1648:2: (this_QualifiedName_0= ruleQualifiedName kw= '.*' )
            // InternalJabuti.g:1649:3: this_QualifiedName_0= ruleQualifiedName kw= '.*'
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,49,FOLLOW_2); 

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


    // $ANTLR start "ruleRolePlayer"
    // InternalJabuti.g:1668:1: ruleRolePlayer returns [Enumerator current=null] : ( (enumLiteral_0= 'application' ) | (enumLiteral_1= 'process' ) ) ;
    public final Enumerator ruleRolePlayer() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJabuti.g:1674:2: ( ( (enumLiteral_0= 'application' ) | (enumLiteral_1= 'process' ) ) )
            // InternalJabuti.g:1675:2: ( (enumLiteral_0= 'application' ) | (enumLiteral_1= 'process' ) )
            {
            // InternalJabuti.g:1675:2: ( (enumLiteral_0= 'application' ) | (enumLiteral_1= 'process' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            else if ( (LA19_0==27) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalJabuti.g:1676:3: (enumLiteral_0= 'application' )
                    {
                    // InternalJabuti.g:1676:3: (enumLiteral_0= 'application' )
                    // InternalJabuti.g:1677:4: enumLiteral_0= 'application'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getRolePlayerAccess().getAPPLICATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRolePlayerAccess().getAPPLICATIONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJabuti.g:1684:3: (enumLiteral_1= 'process' )
                    {
                    // InternalJabuti.g:1684:3: (enumLiteral_1= 'process' )
                    // InternalJabuti.g:1685:4: enumLiteral_1= 'process'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getRolePlayerAccess().getPROCESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRolePlayerAccess().getPROCESSEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleRolePlayer"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\3\uffff\1\6\3\uffff\1\6";
    static final String dfa_3s = "\1\4\2\uffff\2\4\2\uffff\1\4";
    static final String dfa_4s = "\1\6\2\uffff\1\60\1\4\2\uffff\1\60";
    static final String dfa_5s = "\1\uffff\1\1\1\2\2\uffff\1\4\1\3\1\uffff";
    static final String dfa_6s = "\10\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\2\1\1",
            "",
            "",
            "\1\6\15\uffff\1\6\11\uffff\4\6\1\uffff\14\6\1\5\2\6\1\4",
            "\1\7",
            "",
            "",
            "\1\6\15\uffff\1\6\11\uffff\4\6\1\uffff\14\6\1\5\2\6\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1298:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003840000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000240100000070L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000240000000070L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000001FE00000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000070L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000000L});

}