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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'contract'", "'{'", "'dates'", "'beginDate'", "'='", "'dueDate'", "'}'", "'parties'", "'variables'", "'clauses'", "'rolePlayer'", "'operation'", "'terms'", "'right'", "'obligation'", "'prohibition'", "'application'", "'process'", "'onSuccess'", "'('", "'log('", "')'", "'onBreach'", "'AND'", "'&&'", "'||'", "'OR'", "'!'", "'<='", "'>='", "'>'", "'<'", "'!='", "'=='", "'is'", "'as'", "'+'", "'-'", "'*'", "'/'", "','", "'when'", "'do'", "'NOT'", "'TimeInterval'", "'to'", "'SessionInterval'", "'per'", "'Timeout'", "'MaxNumberOfOperation'", "'WeekDaysInterval'", "'MessageContent'", "'.'", "'.*'", "'push'", "'poll'", "'write'", "'read'", "'request'", "'response'", "'Sunday'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Second'", "'Minute'", "'Hour'", "'Day'", "'Week'", "'Month'", "'Year'"
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
    // InternalJabuti.g:171:1: ruleContract returns [EObject current=null] : (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'dates' otherlv_4= '{' otherlv_5= 'beginDate' otherlv_6= '=' ( (lv_beginDate_7_0= RULE_STRING ) ) otherlv_8= 'dueDate' otherlv_9= '=' ( (lv_dueDate_10_0= RULE_STRING ) ) otherlv_11= '}' otherlv_12= 'parties' otherlv_13= '{' ( (lv_application_14_0= ruleApplication ) ) ( (lv_process_15_0= ruleProcess ) ) otherlv_16= '}' (otherlv_17= 'variables' otherlv_18= '{' ( (lv_variables_19_0= ruleVariable ) )* otherlv_20= '}' )? otherlv_21= 'clauses' otherlv_22= '{' ( (lv_clauses_23_0= ruleClause ) )* otherlv_24= '}' otherlv_25= '}' ) ;
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
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        EObject lv_application_14_0 = null;

        EObject lv_process_15_0 = null;

        EObject lv_variables_19_0 = null;

        EObject lv_clauses_23_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:177:2: ( (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'dates' otherlv_4= '{' otherlv_5= 'beginDate' otherlv_6= '=' ( (lv_beginDate_7_0= RULE_STRING ) ) otherlv_8= 'dueDate' otherlv_9= '=' ( (lv_dueDate_10_0= RULE_STRING ) ) otherlv_11= '}' otherlv_12= 'parties' otherlv_13= '{' ( (lv_application_14_0= ruleApplication ) ) ( (lv_process_15_0= ruleProcess ) ) otherlv_16= '}' (otherlv_17= 'variables' otherlv_18= '{' ( (lv_variables_19_0= ruleVariable ) )* otherlv_20= '}' )? otherlv_21= 'clauses' otherlv_22= '{' ( (lv_clauses_23_0= ruleClause ) )* otherlv_24= '}' otherlv_25= '}' ) )
            // InternalJabuti.g:178:2: (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'dates' otherlv_4= '{' otherlv_5= 'beginDate' otherlv_6= '=' ( (lv_beginDate_7_0= RULE_STRING ) ) otherlv_8= 'dueDate' otherlv_9= '=' ( (lv_dueDate_10_0= RULE_STRING ) ) otherlv_11= '}' otherlv_12= 'parties' otherlv_13= '{' ( (lv_application_14_0= ruleApplication ) ) ( (lv_process_15_0= ruleProcess ) ) otherlv_16= '}' (otherlv_17= 'variables' otherlv_18= '{' ( (lv_variables_19_0= ruleVariable ) )* otherlv_20= '}' )? otherlv_21= 'clauses' otherlv_22= '{' ( (lv_clauses_23_0= ruleClause ) )* otherlv_24= '}' otherlv_25= '}' )
            {
            // InternalJabuti.g:178:2: (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'dates' otherlv_4= '{' otherlv_5= 'beginDate' otherlv_6= '=' ( (lv_beginDate_7_0= RULE_STRING ) ) otherlv_8= 'dueDate' otherlv_9= '=' ( (lv_dueDate_10_0= RULE_STRING ) ) otherlv_11= '}' otherlv_12= 'parties' otherlv_13= '{' ( (lv_application_14_0= ruleApplication ) ) ( (lv_process_15_0= ruleProcess ) ) otherlv_16= '}' (otherlv_17= 'variables' otherlv_18= '{' ( (lv_variables_19_0= ruleVariable ) )* otherlv_20= '}' )? otherlv_21= 'clauses' otherlv_22= '{' ( (lv_clauses_23_0= ruleClause ) )* otherlv_24= '}' otherlv_25= '}' )
            // InternalJabuti.g:179:3: otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'dates' otherlv_4= '{' otherlv_5= 'beginDate' otherlv_6= '=' ( (lv_beginDate_7_0= RULE_STRING ) ) otherlv_8= 'dueDate' otherlv_9= '=' ( (lv_dueDate_10_0= RULE_STRING ) ) otherlv_11= '}' otherlv_12= 'parties' otherlv_13= '{' ( (lv_application_14_0= ruleApplication ) ) ( (lv_process_15_0= ruleProcess ) ) otherlv_16= '}' (otherlv_17= 'variables' otherlv_18= '{' ( (lv_variables_19_0= ruleVariable ) )* otherlv_20= '}' )? otherlv_21= 'clauses' otherlv_22= '{' ( (lv_clauses_23_0= ruleClause ) )* otherlv_24= '}' otherlv_25= '}'
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

            			newLeafNode(otherlv_12, grammarAccess.getContractAccess().getPartiesKeyword_12());
            		
            otherlv_13=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_13, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalJabuti.g:277:3: ( (lv_application_14_0= ruleApplication ) )
            // InternalJabuti.g:278:4: (lv_application_14_0= ruleApplication )
            {
            // InternalJabuti.g:278:4: (lv_application_14_0= ruleApplication )
            // InternalJabuti.g:279:5: lv_application_14_0= ruleApplication
            {

            					newCompositeNode(grammarAccess.getContractAccess().getApplicationApplicationParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_14);
            lv_application_14_0=ruleApplication();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"application",
            						lv_application_14_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.Application");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJabuti.g:296:3: ( (lv_process_15_0= ruleProcess ) )
            // InternalJabuti.g:297:4: (lv_process_15_0= ruleProcess )
            {
            // InternalJabuti.g:297:4: (lv_process_15_0= ruleProcess )
            // InternalJabuti.g:298:5: lv_process_15_0= ruleProcess
            {

            					newCompositeNode(grammarAccess.getContractAccess().getProcessProcessParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_11);
            lv_process_15_0=ruleProcess();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					set(
            						current,
            						"process",
            						lv_process_15_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.Process");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_16, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_16());
            		
            // InternalJabuti.g:319:3: (otherlv_17= 'variables' otherlv_18= '{' ( (lv_variables_19_0= ruleVariable ) )* otherlv_20= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalJabuti.g:320:4: otherlv_17= 'variables' otherlv_18= '{' ( (lv_variables_19_0= ruleVariable ) )* otherlv_20= '}'
                    {
                    otherlv_17=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_17, grammarAccess.getContractAccess().getVariablesKeyword_17_0());
                    			
                    otherlv_18=(Token)match(input,13,FOLLOW_16); 

                    				newLeafNode(otherlv_18, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_17_1());
                    			
                    // InternalJabuti.g:328:4: ( (lv_variables_19_0= ruleVariable ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalJabuti.g:329:5: (lv_variables_19_0= ruleVariable )
                    	    {
                    	    // InternalJabuti.g:329:5: (lv_variables_19_0= ruleVariable )
                    	    // InternalJabuti.g:330:6: lv_variables_19_0= ruleVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getContractAccess().getVariablesVariableParserRuleCall_17_2_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_variables_19_0=ruleVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getContractRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_19_0,
                    	    							"br.edu.unijui.gca.jabuti.Jabuti.Variable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_20, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_17_3());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_21, grammarAccess.getContractAccess().getClausesKeyword_18());
            		
            otherlv_22=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_22, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_19());
            		
            // InternalJabuti.g:360:3: ( (lv_clauses_23_0= ruleClause ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=25 && LA4_0<=27)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalJabuti.g:361:4: (lv_clauses_23_0= ruleClause )
            	    {
            	    // InternalJabuti.g:361:4: (lv_clauses_23_0= ruleClause )
            	    // InternalJabuti.g:362:5: lv_clauses_23_0= ruleClause
            	    {

            	    					newCompositeNode(grammarAccess.getContractAccess().getClausesClauseParserRuleCall_20_0());
            	    				
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
            	    break loop4;
                }
            } while (true);

            otherlv_24=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_24, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_21());
            		
            otherlv_25=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_22());
            		

            }


            }


            	leaveRule();

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
    // InternalJabuti.g:391:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalJabuti.g:391:47: (iv_ruleClause= ruleClause EOF )
            // InternalJabuti.g:392:2: iv_ruleClause= ruleClause EOF
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
    // InternalJabuti.g:398:1: ruleClause returns [EObject current=null] : ( (this_Right_0= ruleRight | this_Prohibition_1= ruleProhibition | this_Obligation_2= ruleObligation ) otherlv_3= '{' otherlv_4= 'rolePlayer' otherlv_5= '=' ( (lv_roleplayer_6_0= ruleRolePlayer ) ) otherlv_7= 'operation' otherlv_8= '=' ( (lv_operation_9_0= ruleOperation ) ) otherlv_10= 'terms' otherlv_11= '{' ( (lv_condition_12_0= ruleCondition ) ) otherlv_13= '}' ( (lv_eventLog_14_0= ruleEventLog ) )* otherlv_15= '}' ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject this_Right_0 = null;

        EObject this_Prohibition_1 = null;

        EObject this_Obligation_2 = null;

        Enumerator lv_roleplayer_6_0 = null;

        Enumerator lv_operation_9_0 = null;

        EObject lv_condition_12_0 = null;

        EObject lv_eventLog_14_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:404:2: ( ( (this_Right_0= ruleRight | this_Prohibition_1= ruleProhibition | this_Obligation_2= ruleObligation ) otherlv_3= '{' otherlv_4= 'rolePlayer' otherlv_5= '=' ( (lv_roleplayer_6_0= ruleRolePlayer ) ) otherlv_7= 'operation' otherlv_8= '=' ( (lv_operation_9_0= ruleOperation ) ) otherlv_10= 'terms' otherlv_11= '{' ( (lv_condition_12_0= ruleCondition ) ) otherlv_13= '}' ( (lv_eventLog_14_0= ruleEventLog ) )* otherlv_15= '}' ) )
            // InternalJabuti.g:405:2: ( (this_Right_0= ruleRight | this_Prohibition_1= ruleProhibition | this_Obligation_2= ruleObligation ) otherlv_3= '{' otherlv_4= 'rolePlayer' otherlv_5= '=' ( (lv_roleplayer_6_0= ruleRolePlayer ) ) otherlv_7= 'operation' otherlv_8= '=' ( (lv_operation_9_0= ruleOperation ) ) otherlv_10= 'terms' otherlv_11= '{' ( (lv_condition_12_0= ruleCondition ) ) otherlv_13= '}' ( (lv_eventLog_14_0= ruleEventLog ) )* otherlv_15= '}' )
            {
            // InternalJabuti.g:405:2: ( (this_Right_0= ruleRight | this_Prohibition_1= ruleProhibition | this_Obligation_2= ruleObligation ) otherlv_3= '{' otherlv_4= 'rolePlayer' otherlv_5= '=' ( (lv_roleplayer_6_0= ruleRolePlayer ) ) otherlv_7= 'operation' otherlv_8= '=' ( (lv_operation_9_0= ruleOperation ) ) otherlv_10= 'terms' otherlv_11= '{' ( (lv_condition_12_0= ruleCondition ) ) otherlv_13= '}' ( (lv_eventLog_14_0= ruleEventLog ) )* otherlv_15= '}' )
            // InternalJabuti.g:406:3: (this_Right_0= ruleRight | this_Prohibition_1= ruleProhibition | this_Obligation_2= ruleObligation ) otherlv_3= '{' otherlv_4= 'rolePlayer' otherlv_5= '=' ( (lv_roleplayer_6_0= ruleRolePlayer ) ) otherlv_7= 'operation' otherlv_8= '=' ( (lv_operation_9_0= ruleOperation ) ) otherlv_10= 'terms' otherlv_11= '{' ( (lv_condition_12_0= ruleCondition ) ) otherlv_13= '}' ( (lv_eventLog_14_0= ruleEventLog ) )* otherlv_15= '}'
            {
            // InternalJabuti.g:406:3: (this_Right_0= ruleRight | this_Prohibition_1= ruleProhibition | this_Obligation_2= ruleObligation )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case 26:
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
                    // InternalJabuti.g:407:4: this_Right_0= ruleRight
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
                    // InternalJabuti.g:416:4: this_Prohibition_1= ruleProhibition
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
                    // InternalJabuti.g:425:4: this_Obligation_2= ruleObligation
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
            		
            // InternalJabuti.g:446:3: ( (lv_roleplayer_6_0= ruleRolePlayer ) )
            // InternalJabuti.g:447:4: (lv_roleplayer_6_0= ruleRolePlayer )
            {
            // InternalJabuti.g:447:4: (lv_roleplayer_6_0= ruleRolePlayer )
            // InternalJabuti.g:448:5: lv_roleplayer_6_0= ruleRolePlayer
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getRoleplayerRolePlayerEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_7=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getClauseAccess().getOperationKeyword_5());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getClauseAccess().getEqualsSignKeyword_6());
            		
            // InternalJabuti.g:473:3: ( (lv_operation_9_0= ruleOperation ) )
            // InternalJabuti.g:474:4: (lv_operation_9_0= ruleOperation )
            {
            // InternalJabuti.g:474:4: (lv_operation_9_0= ruleOperation )
            // InternalJabuti.g:475:5: lv_operation_9_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getOperationOperationEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_23);
            lv_operation_9_0=ruleOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_9_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.Operation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getClauseAccess().getTermsKeyword_8());
            		
            otherlv_11=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_11, grammarAccess.getClauseAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalJabuti.g:500:3: ( (lv_condition_12_0= ruleCondition ) )
            // InternalJabuti.g:501:4: (lv_condition_12_0= ruleCondition )
            {
            // InternalJabuti.g:501:4: (lv_condition_12_0= ruleCondition )
            // InternalJabuti.g:502:5: lv_condition_12_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getConditionConditionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_condition_12_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_12_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,18,FOLLOW_25); 

            			newLeafNode(otherlv_13, grammarAccess.getClauseAccess().getRightCurlyBracketKeyword_11());
            		
            // InternalJabuti.g:523:3: ( (lv_eventLog_14_0= ruleEventLog ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==30||LA6_0==34) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalJabuti.g:524:4: (lv_eventLog_14_0= ruleEventLog )
            	    {
            	    // InternalJabuti.g:524:4: (lv_eventLog_14_0= ruleEventLog )
            	    // InternalJabuti.g:525:5: lv_eventLog_14_0= ruleEventLog
            	    {

            	    					newCompositeNode(grammarAccess.getClauseAccess().getEventLogEventLogParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_eventLog_14_0=ruleEventLog();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClauseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"eventLog",
            	    						lv_eventLog_14_0,
            	    						"br.edu.unijui.gca.jabuti.Jabuti.EventLog");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_15=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getClauseAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

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
    // InternalJabuti.g:550:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // InternalJabuti.g:550:46: (iv_ruleRight= ruleRight EOF )
            // InternalJabuti.g:551:2: iv_ruleRight= ruleRight EOF
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
    // InternalJabuti.g:557:1: ruleRight returns [EObject current=null] : (otherlv_0= 'right' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:563:2: ( (otherlv_0= 'right' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalJabuti.g:564:2: (otherlv_0= 'right' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalJabuti.g:564:2: (otherlv_0= 'right' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalJabuti.g:565:3: otherlv_0= 'right' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRightAccess().getRightKeyword_0());
            		
            // InternalJabuti.g:569:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJabuti.g:570:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJabuti.g:570:4: (lv_name_1_0= RULE_ID )
            // InternalJabuti.g:571:5: lv_name_1_0= RULE_ID
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
    // InternalJabuti.g:591:1: entryRuleObligation returns [EObject current=null] : iv_ruleObligation= ruleObligation EOF ;
    public final EObject entryRuleObligation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObligation = null;


        try {
            // InternalJabuti.g:591:51: (iv_ruleObligation= ruleObligation EOF )
            // InternalJabuti.g:592:2: iv_ruleObligation= ruleObligation EOF
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
    // InternalJabuti.g:598:1: ruleObligation returns [EObject current=null] : (otherlv_0= 'obligation' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleObligation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:604:2: ( (otherlv_0= 'obligation' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalJabuti.g:605:2: (otherlv_0= 'obligation' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalJabuti.g:605:2: (otherlv_0= 'obligation' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalJabuti.g:606:3: otherlv_0= 'obligation' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObligationAccess().getObligationKeyword_0());
            		
            // InternalJabuti.g:610:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJabuti.g:611:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJabuti.g:611:4: (lv_name_1_0= RULE_ID )
            // InternalJabuti.g:612:5: lv_name_1_0= RULE_ID
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
    // InternalJabuti.g:632:1: entryRuleProhibition returns [EObject current=null] : iv_ruleProhibition= ruleProhibition EOF ;
    public final EObject entryRuleProhibition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProhibition = null;


        try {
            // InternalJabuti.g:632:52: (iv_ruleProhibition= ruleProhibition EOF )
            // InternalJabuti.g:633:2: iv_ruleProhibition= ruleProhibition EOF
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
    // InternalJabuti.g:639:1: ruleProhibition returns [EObject current=null] : (otherlv_0= 'prohibition' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleProhibition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:645:2: ( (otherlv_0= 'prohibition' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalJabuti.g:646:2: (otherlv_0= 'prohibition' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalJabuti.g:646:2: (otherlv_0= 'prohibition' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalJabuti.g:647:3: otherlv_0= 'prohibition' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProhibitionAccess().getProhibitionKeyword_0());
            		
            // InternalJabuti.g:651:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJabuti.g:652:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJabuti.g:652:4: (lv_name_1_0= RULE_ID )
            // InternalJabuti.g:653:5: lv_name_1_0= RULE_ID
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
    // InternalJabuti.g:673:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalJabuti.g:673:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalJabuti.g:674:2: iv_ruleApplication= ruleApplication EOF
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
    // InternalJabuti.g:680:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'application' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:686:2: ( (otherlv_0= 'application' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalJabuti.g:687:2: (otherlv_0= 'application' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalJabuti.g:687:2: (otherlv_0= 'application' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalJabuti.g:688:3: otherlv_0= 'application' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationAccess().getEqualsSignKeyword_1());
            		
            // InternalJabuti.g:696:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalJabuti.g:697:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalJabuti.g:697:4: (lv_name_2_0= RULE_STRING )
            // InternalJabuti.g:698:5: lv_name_2_0= RULE_STRING
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
    // InternalJabuti.g:718:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalJabuti.g:718:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalJabuti.g:719:2: iv_ruleProcess= ruleProcess EOF
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
    // InternalJabuti.g:725:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:731:2: ( (otherlv_0= 'process' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalJabuti.g:732:2: (otherlv_0= 'process' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalJabuti.g:732:2: (otherlv_0= 'process' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalJabuti.g:733:3: otherlv_0= 'process' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getEqualsSignKeyword_1());
            		
            // InternalJabuti.g:741:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalJabuti.g:742:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalJabuti.g:742:4: (lv_name_2_0= RULE_STRING )
            // InternalJabuti.g:743:5: lv_name_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleEventLog"
    // InternalJabuti.g:763:1: entryRuleEventLog returns [EObject current=null] : iv_ruleEventLog= ruleEventLog EOF ;
    public final EObject entryRuleEventLog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventLog = null;


        try {
            // InternalJabuti.g:763:49: (iv_ruleEventLog= ruleEventLog EOF )
            // InternalJabuti.g:764:2: iv_ruleEventLog= ruleEventLog EOF
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
    // InternalJabuti.g:770:1: ruleEventLog returns [EObject current=null] : (this_OnSuccess_0= ruleOnSuccess | this_OnBreach_1= ruleOnBreach ) ;
    public final EObject ruleEventLog() throws RecognitionException {
        EObject current = null;

        EObject this_OnSuccess_0 = null;

        EObject this_OnBreach_1 = null;



        	enterRule();

        try {
            // InternalJabuti.g:776:2: ( (this_OnSuccess_0= ruleOnSuccess | this_OnBreach_1= ruleOnBreach ) )
            // InternalJabuti.g:777:2: (this_OnSuccess_0= ruleOnSuccess | this_OnBreach_1= ruleOnBreach )
            {
            // InternalJabuti.g:777:2: (this_OnSuccess_0= ruleOnSuccess | this_OnBreach_1= ruleOnBreach )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            else if ( (LA7_0==34) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalJabuti.g:778:3: this_OnSuccess_0= ruleOnSuccess
                    {

                    			newCompositeNode(grammarAccess.getEventLogAccess().getOnSuccessParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OnSuccess_0=ruleOnSuccess();

                    state._fsp--;


                    			current = this_OnSuccess_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJabuti.g:787:3: this_OnBreach_1= ruleOnBreach
                    {

                    			newCompositeNode(grammarAccess.getEventLogAccess().getOnBreachParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OnBreach_1=ruleOnBreach();

                    state._fsp--;


                    			current = this_OnBreach_1;
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
    // $ANTLR end "ruleEventLog"


    // $ANTLR start "entryRuleOnSuccess"
    // InternalJabuti.g:799:1: entryRuleOnSuccess returns [EObject current=null] : iv_ruleOnSuccess= ruleOnSuccess EOF ;
    public final EObject entryRuleOnSuccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnSuccess = null;


        try {
            // InternalJabuti.g:799:50: (iv_ruleOnSuccess= ruleOnSuccess EOF )
            // InternalJabuti.g:800:2: iv_ruleOnSuccess= ruleOnSuccess EOF
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
    // InternalJabuti.g:806:1: ruleOnSuccess returns [EObject current=null] : (otherlv_0= 'onSuccess' otherlv_1= '(' otherlv_2= 'log(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= ')' ) ;
    public final EObject ruleOnSuccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_message_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalJabuti.g:812:2: ( (otherlv_0= 'onSuccess' otherlv_1= '(' otherlv_2= 'log(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= ')' ) )
            // InternalJabuti.g:813:2: (otherlv_0= 'onSuccess' otherlv_1= '(' otherlv_2= 'log(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= ')' )
            {
            // InternalJabuti.g:813:2: (otherlv_0= 'onSuccess' otherlv_1= '(' otherlv_2= 'log(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= ')' )
            // InternalJabuti.g:814:3: otherlv_0= 'onSuccess' otherlv_1= '(' otherlv_2= 'log(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getOnSuccessAccess().getOnSuccessKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getOnSuccessAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getOnSuccessAccess().getLogKeyword_2());
            		
            // InternalJabuti.g:826:3: ( (lv_message_3_0= RULE_STRING ) )
            // InternalJabuti.g:827:4: (lv_message_3_0= RULE_STRING )
            {
            // InternalJabuti.g:827:4: (lv_message_3_0= RULE_STRING )
            // InternalJabuti.g:828:5: lv_message_3_0= RULE_STRING
            {
            lv_message_3_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_message_3_0, grammarAccess.getOnSuccessAccess().getMessageSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnSuccessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"message",
            						lv_message_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_28); 

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
    // InternalJabuti.g:856:1: entryRuleOnBreach returns [EObject current=null] : iv_ruleOnBreach= ruleOnBreach EOF ;
    public final EObject entryRuleOnBreach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnBreach = null;


        try {
            // InternalJabuti.g:856:49: (iv_ruleOnBreach= ruleOnBreach EOF )
            // InternalJabuti.g:857:2: iv_ruleOnBreach= ruleOnBreach EOF
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
    // InternalJabuti.g:863:1: ruleOnBreach returns [EObject current=null] : (otherlv_0= 'onBreach' otherlv_1= '(' otherlv_2= 'log(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= ')' ) ;
    public final EObject ruleOnBreach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_message_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalJabuti.g:869:2: ( (otherlv_0= 'onBreach' otherlv_1= '(' otherlv_2= 'log(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= ')' ) )
            // InternalJabuti.g:870:2: (otherlv_0= 'onBreach' otherlv_1= '(' otherlv_2= 'log(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= ')' )
            {
            // InternalJabuti.g:870:2: (otherlv_0= 'onBreach' otherlv_1= '(' otherlv_2= 'log(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= ')' )
            // InternalJabuti.g:871:3: otherlv_0= 'onBreach' otherlv_1= '(' otherlv_2= 'log(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getOnBreachAccess().getOnBreachKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getOnBreachAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getOnBreachAccess().getLogKeyword_2());
            		
            // InternalJabuti.g:883:3: ( (lv_message_3_0= RULE_STRING ) )
            // InternalJabuti.g:884:4: (lv_message_3_0= RULE_STRING )
            {
            // InternalJabuti.g:884:4: (lv_message_3_0= RULE_STRING )
            // InternalJabuti.g:885:5: lv_message_3_0= RULE_STRING
            {
            lv_message_3_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_message_3_0, grammarAccess.getOnBreachAccess().getMessageSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnBreachRule());
            					}
            					setWithLastConsumed(
            						current,
            						"message",
            						lv_message_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_28); 

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


    // $ANTLR start "entryRuleExpression"
    // InternalJabuti.g:913:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalJabuti.g:913:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalJabuti.g:914:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalJabuti.g:920:1: ruleExpression returns [EObject current=null] : (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) ) )* ) ;
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
            // InternalJabuti.g:926:2: ( (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) ) )* ) )
            // InternalJabuti.g:927:2: (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) ) )* )
            {
            // InternalJabuti.g:927:2: (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) ) )* )
            // InternalJabuti.g:928:3: this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getNegationParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Negation_0=ruleNegation();

            state._fsp--;


            			current = this_Negation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJabuti.g:936:3: ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=35 && LA9_0<=38)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalJabuti.g:937:4: () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) ) ( (lv_right_6_0= ruleNegation ) )
            	    {
            	    // InternalJabuti.g:937:4: ()
            	    // InternalJabuti.g:938:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalJabuti.g:944:4: ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= '&&' ) ) | ( (lv_symbol_4_0= '||' ) ) | ( (lv_symbol_5_0= 'OR' ) ) )
            	    int alt8=4;
            	    switch ( input.LA(1) ) {
            	    case 35:
            	        {
            	        alt8=1;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt8=2;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt8=3;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt8=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt8) {
            	        case 1 :
            	            // InternalJabuti.g:945:5: ( (lv_symbol_2_0= 'AND' ) )
            	            {
            	            // InternalJabuti.g:945:5: ( (lv_symbol_2_0= 'AND' ) )
            	            // InternalJabuti.g:946:6: (lv_symbol_2_0= 'AND' )
            	            {
            	            // InternalJabuti.g:946:6: (lv_symbol_2_0= 'AND' )
            	            // InternalJabuti.g:947:7: lv_symbol_2_0= 'AND'
            	            {
            	            lv_symbol_2_0=(Token)match(input,35,FOLLOW_30); 

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
            	            // InternalJabuti.g:960:5: ( (lv_symbol_3_0= '&&' ) )
            	            {
            	            // InternalJabuti.g:960:5: ( (lv_symbol_3_0= '&&' ) )
            	            // InternalJabuti.g:961:6: (lv_symbol_3_0= '&&' )
            	            {
            	            // InternalJabuti.g:961:6: (lv_symbol_3_0= '&&' )
            	            // InternalJabuti.g:962:7: lv_symbol_3_0= '&&'
            	            {
            	            lv_symbol_3_0=(Token)match(input,36,FOLLOW_30); 

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
            	            // InternalJabuti.g:975:5: ( (lv_symbol_4_0= '||' ) )
            	            {
            	            // InternalJabuti.g:975:5: ( (lv_symbol_4_0= '||' ) )
            	            // InternalJabuti.g:976:6: (lv_symbol_4_0= '||' )
            	            {
            	            // InternalJabuti.g:976:6: (lv_symbol_4_0= '||' )
            	            // InternalJabuti.g:977:7: lv_symbol_4_0= '||'
            	            {
            	            lv_symbol_4_0=(Token)match(input,37,FOLLOW_30); 

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
            	            // InternalJabuti.g:990:5: ( (lv_symbol_5_0= 'OR' ) )
            	            {
            	            // InternalJabuti.g:990:5: ( (lv_symbol_5_0= 'OR' ) )
            	            // InternalJabuti.g:991:6: (lv_symbol_5_0= 'OR' )
            	            {
            	            // InternalJabuti.g:991:6: (lv_symbol_5_0= 'OR' )
            	            // InternalJabuti.g:992:7: lv_symbol_5_0= 'OR'
            	            {
            	            lv_symbol_5_0=(Token)match(input,38,FOLLOW_30); 

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

            	    // InternalJabuti.g:1005:4: ( (lv_right_6_0= ruleNegation ) )
            	    // InternalJabuti.g:1006:5: (lv_right_6_0= ruleNegation )
            	    {
            	    // InternalJabuti.g:1006:5: (lv_right_6_0= ruleNegation )
            	    // InternalJabuti.g:1007:6: lv_right_6_0= ruleNegation
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightNegationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleNegation"
    // InternalJabuti.g:1029:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalJabuti.g:1029:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalJabuti.g:1030:2: iv_ruleNegation= ruleNegation EOF
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
    // InternalJabuti.g:1036:1: ruleNegation returns [EObject current=null] : (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        EObject this_Comparison_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1042:2: ( (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) ) )
            // InternalJabuti.g:1043:2: (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) )
            {
            // InternalJabuti.g:1043:2: (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||LA10_0==31||LA10_0==49) ) {
                alt10=1;
            }
            else if ( (LA10_0==39) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalJabuti.g:1044:3: this_Comparison_0= ruleComparison
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
                    // InternalJabuti.g:1053:3: ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) )
                    {
                    // InternalJabuti.g:1053:3: ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) )
                    // InternalJabuti.g:1054:4: () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) )
                    {
                    // InternalJabuti.g:1054:4: ()
                    // InternalJabuti.g:1055:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegationAccess().getUnaryOperatorAction_1_0(),
                    						current);
                    				

                    }

                    // InternalJabuti.g:1061:4: ( (lv_symbol_2_0= '!' ) )
                    // InternalJabuti.g:1062:5: (lv_symbol_2_0= '!' )
                    {
                    // InternalJabuti.g:1062:5: (lv_symbol_2_0= '!' )
                    // InternalJabuti.g:1063:6: lv_symbol_2_0= '!'
                    {
                    lv_symbol_2_0=(Token)match(input,39,FOLLOW_31); 

                    						newLeafNode(lv_symbol_2_0, grammarAccess.getNegationAccess().getSymbolExclamationMarkKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNegationRule());
                    						}
                    						setWithLastConsumed(current, "symbol", lv_symbol_2_0, "!");
                    					

                    }


                    }

                    // InternalJabuti.g:1075:4: ( (lv_expression_3_0= ruleComparison ) )
                    // InternalJabuti.g:1076:5: (lv_expression_3_0= ruleComparison )
                    {
                    // InternalJabuti.g:1076:5: (lv_expression_3_0= ruleComparison )
                    // InternalJabuti.g:1077:6: lv_expression_3_0= ruleComparison
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
    // InternalJabuti.g:1099:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalJabuti.g:1099:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalJabuti.g:1100:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalJabuti.g:1106:1: ruleComparison returns [EObject current=null] : (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* ) ;
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
            // InternalJabuti.g:1112:2: ( (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* ) )
            // InternalJabuti.g:1113:2: (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* )
            {
            // InternalJabuti.g:1113:2: (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )* )
            // InternalJabuti.g:1114:3: this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_Plus_0=rulePlus();

            state._fsp--;


            			current = this_Plus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJabuti.g:1122:3: ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=40 && LA12_0<=47)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalJabuti.g:1123:4: () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) ) ( (lv_right_10_0= rulePlus ) )
            	    {
            	    // InternalJabuti.g:1123:4: ()
            	    // InternalJabuti.g:1124:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalJabuti.g:1130:4: ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) | ( (lv_symbol_8_0= 'is' ) ) | ( (lv_symbol_9_0= 'as' ) ) )
            	    int alt11=8;
            	    switch ( input.LA(1) ) {
            	    case 40:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt11=4;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt11=5;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt11=6;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt11=7;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt11=8;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // InternalJabuti.g:1131:5: ( (lv_symbol_2_0= '<=' ) )
            	            {
            	            // InternalJabuti.g:1131:5: ( (lv_symbol_2_0= '<=' ) )
            	            // InternalJabuti.g:1132:6: (lv_symbol_2_0= '<=' )
            	            {
            	            // InternalJabuti.g:1132:6: (lv_symbol_2_0= '<=' )
            	            // InternalJabuti.g:1133:7: lv_symbol_2_0= '<='
            	            {
            	            lv_symbol_2_0=(Token)match(input,40,FOLLOW_31); 

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
            	            // InternalJabuti.g:1146:5: ( (lv_symbol_3_0= '>=' ) )
            	            {
            	            // InternalJabuti.g:1146:5: ( (lv_symbol_3_0= '>=' ) )
            	            // InternalJabuti.g:1147:6: (lv_symbol_3_0= '>=' )
            	            {
            	            // InternalJabuti.g:1147:6: (lv_symbol_3_0= '>=' )
            	            // InternalJabuti.g:1148:7: lv_symbol_3_0= '>='
            	            {
            	            lv_symbol_3_0=(Token)match(input,41,FOLLOW_31); 

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
            	            // InternalJabuti.g:1161:5: ( (lv_symbol_4_0= '>' ) )
            	            {
            	            // InternalJabuti.g:1161:5: ( (lv_symbol_4_0= '>' ) )
            	            // InternalJabuti.g:1162:6: (lv_symbol_4_0= '>' )
            	            {
            	            // InternalJabuti.g:1162:6: (lv_symbol_4_0= '>' )
            	            // InternalJabuti.g:1163:7: lv_symbol_4_0= '>'
            	            {
            	            lv_symbol_4_0=(Token)match(input,42,FOLLOW_31); 

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
            	            // InternalJabuti.g:1176:5: ( (lv_symbol_5_0= '<' ) )
            	            {
            	            // InternalJabuti.g:1176:5: ( (lv_symbol_5_0= '<' ) )
            	            // InternalJabuti.g:1177:6: (lv_symbol_5_0= '<' )
            	            {
            	            // InternalJabuti.g:1177:6: (lv_symbol_5_0= '<' )
            	            // InternalJabuti.g:1178:7: lv_symbol_5_0= '<'
            	            {
            	            lv_symbol_5_0=(Token)match(input,43,FOLLOW_31); 

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
            	            // InternalJabuti.g:1191:5: ( (lv_symbol_6_0= '!=' ) )
            	            {
            	            // InternalJabuti.g:1191:5: ( (lv_symbol_6_0= '!=' ) )
            	            // InternalJabuti.g:1192:6: (lv_symbol_6_0= '!=' )
            	            {
            	            // InternalJabuti.g:1192:6: (lv_symbol_6_0= '!=' )
            	            // InternalJabuti.g:1193:7: lv_symbol_6_0= '!='
            	            {
            	            lv_symbol_6_0=(Token)match(input,44,FOLLOW_31); 

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
            	            // InternalJabuti.g:1206:5: ( (lv_symbol_7_0= '==' ) )
            	            {
            	            // InternalJabuti.g:1206:5: ( (lv_symbol_7_0= '==' ) )
            	            // InternalJabuti.g:1207:6: (lv_symbol_7_0= '==' )
            	            {
            	            // InternalJabuti.g:1207:6: (lv_symbol_7_0= '==' )
            	            // InternalJabuti.g:1208:7: lv_symbol_7_0= '=='
            	            {
            	            lv_symbol_7_0=(Token)match(input,45,FOLLOW_31); 

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
            	            // InternalJabuti.g:1221:5: ( (lv_symbol_8_0= 'is' ) )
            	            {
            	            // InternalJabuti.g:1221:5: ( (lv_symbol_8_0= 'is' ) )
            	            // InternalJabuti.g:1222:6: (lv_symbol_8_0= 'is' )
            	            {
            	            // InternalJabuti.g:1222:6: (lv_symbol_8_0= 'is' )
            	            // InternalJabuti.g:1223:7: lv_symbol_8_0= 'is'
            	            {
            	            lv_symbol_8_0=(Token)match(input,46,FOLLOW_31); 

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
            	            // InternalJabuti.g:1236:5: ( (lv_symbol_9_0= 'as' ) )
            	            {
            	            // InternalJabuti.g:1236:5: ( (lv_symbol_9_0= 'as' ) )
            	            // InternalJabuti.g:1237:6: (lv_symbol_9_0= 'as' )
            	            {
            	            // InternalJabuti.g:1237:6: (lv_symbol_9_0= 'as' )
            	            // InternalJabuti.g:1238:7: lv_symbol_9_0= 'as'
            	            {
            	            lv_symbol_9_0=(Token)match(input,47,FOLLOW_31); 

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

            	    // InternalJabuti.g:1251:4: ( (lv_right_10_0= rulePlus ) )
            	    // InternalJabuti.g:1252:5: (lv_right_10_0= rulePlus )
            	    {
            	    // InternalJabuti.g:1252:5: (lv_right_10_0= rulePlus )
            	    // InternalJabuti.g:1253:6: lv_right_10_0= rulePlus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlus"
    // InternalJabuti.g:1275:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalJabuti.g:1275:45: (iv_rulePlus= rulePlus EOF )
            // InternalJabuti.g:1276:2: iv_rulePlus= rulePlus EOF
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
    // InternalJabuti.g:1282:1: rulePlus returns [EObject current=null] : (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1288:2: ( (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* ) )
            // InternalJabuti.g:1289:2: (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* )
            {
            // InternalJabuti.g:1289:2: (this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )* )
            // InternalJabuti.g:1290:3: this_Factor_0= ruleFactor ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJabuti.g:1298:3: ( () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=48 && LA14_0<=49)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJabuti.g:1299:4: () (otherlv_2= '+' | otherlv_3= '-' ) ( (lv_right_4_0= ruleFactor ) )
            	    {
            	    // InternalJabuti.g:1299:4: ()
            	    // InternalJabuti.g:1300:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPlusAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalJabuti.g:1306:4: (otherlv_2= '+' | otherlv_3= '-' )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==48) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==49) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalJabuti.g:1307:5: otherlv_2= '+'
            	            {
            	            otherlv_2=(Token)match(input,48,FOLLOW_31); 

            	            					newLeafNode(otherlv_2, grammarAccess.getPlusAccess().getPlusSignKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalJabuti.g:1312:5: otherlv_3= '-'
            	            {
            	            otherlv_3=(Token)match(input,49,FOLLOW_31); 

            	            					newLeafNode(otherlv_3, grammarAccess.getPlusAccess().getHyphenMinusKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalJabuti.g:1317:4: ( (lv_right_4_0= ruleFactor ) )
            	    // InternalJabuti.g:1318:5: (lv_right_4_0= ruleFactor )
            	    {
            	    // InternalJabuti.g:1318:5: (lv_right_4_0= ruleFactor )
            	    // InternalJabuti.g:1319:6: lv_right_4_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getPlusAccess().getRightFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
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
            	    break loop14;
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
    // InternalJabuti.g:1341:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalJabuti.g:1341:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalJabuti.g:1342:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalJabuti.g:1348:1: ruleFactor returns [EObject current=null] : (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Negative_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1354:2: ( (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* ) )
            // InternalJabuti.g:1355:2: (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* )
            {
            // InternalJabuti.g:1355:2: (this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )* )
            // InternalJabuti.g:1356:3: this_Negative_0= ruleNegative ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getNegativeParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_Negative_0=ruleNegative();

            state._fsp--;


            			current = this_Negative_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJabuti.g:1364:3: ( () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=50 && LA16_0<=51)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalJabuti.g:1365:4: () (otherlv_2= '*' | otherlv_3= '/' ) ( (lv_right_4_0= ruleNegative ) )
            	    {
            	    // InternalJabuti.g:1365:4: ()
            	    // InternalJabuti.g:1366:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFactorAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalJabuti.g:1372:4: (otherlv_2= '*' | otherlv_3= '/' )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==50) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==51) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalJabuti.g:1373:5: otherlv_2= '*'
            	            {
            	            otherlv_2=(Token)match(input,50,FOLLOW_31); 

            	            					newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalJabuti.g:1378:5: otherlv_3= '/'
            	            {
            	            otherlv_3=(Token)match(input,51,FOLLOW_31); 

            	            					newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalJabuti.g:1383:4: ( (lv_right_4_0= ruleNegative ) )
            	    // InternalJabuti.g:1384:5: (lv_right_4_0= ruleNegative )
            	    {
            	    // InternalJabuti.g:1384:5: (lv_right_4_0= ruleNegative )
            	    // InternalJabuti.g:1385:6: lv_right_4_0= ruleNegative
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightNegativeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
            	    break loop16;
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
    // InternalJabuti.g:1407:1: entryRuleNegative returns [EObject current=null] : iv_ruleNegative= ruleNegative EOF ;
    public final EObject entryRuleNegative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegative = null;


        try {
            // InternalJabuti.g:1407:49: (iv_ruleNegative= ruleNegative EOF )
            // InternalJabuti.g:1408:2: iv_ruleNegative= ruleNegative EOF
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
    // InternalJabuti.g:1414:1: ruleNegative returns [EObject current=null] : (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) ) ;
    public final EObject ruleNegative() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1420:2: ( (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) ) )
            // InternalJabuti.g:1421:2: (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) )
            {
            // InternalJabuti.g:1421:2: (this_Primary_0= rulePrimary | ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||LA17_0==31) ) {
                alt17=1;
            }
            else if ( (LA17_0==49) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalJabuti.g:1422:3: this_Primary_0= rulePrimary
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
                    // InternalJabuti.g:1431:3: ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) )
                    {
                    // InternalJabuti.g:1431:3: ( () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) ) )
                    // InternalJabuti.g:1432:4: () otherlv_2= '-' ( (lv_expression_3_0= rulePrimary ) )
                    {
                    // InternalJabuti.g:1432:4: ()
                    // InternalJabuti.g:1433:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegativeAccess().getUnaryOperatorAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,49,FOLLOW_35); 

                    				newLeafNode(otherlv_2, grammarAccess.getNegativeAccess().getHyphenMinusKeyword_1_1());
                    			
                    // InternalJabuti.g:1443:4: ( (lv_expression_3_0= rulePrimary ) )
                    // InternalJabuti.g:1444:5: (lv_expression_3_0= rulePrimary )
                    {
                    // InternalJabuti.g:1444:5: (lv_expression_3_0= rulePrimary )
                    // InternalJabuti.g:1445:6: lv_expression_3_0= rulePrimary
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
    // InternalJabuti.g:1467:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalJabuti.g:1467:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalJabuti.g:1468:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalJabuti.g:1474:1: rulePrimary returns [EObject current=null] : (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_LiteralValue_0 = null;

        EObject this_Expression_2 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1480:2: ( (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) )
            // InternalJabuti.g:1481:2: (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            {
            // InternalJabuti.g:1481:2: (this_LiteralValue_0= ruleLiteralValue | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_INT)) ) {
                alt18=1;
            }
            else if ( (LA18_0==31) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalJabuti.g:1482:3: this_LiteralValue_0= ruleLiteralValue
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
                    // InternalJabuti.g:1491:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalJabuti.g:1491:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalJabuti.g:1492:4: otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_28);
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
    // InternalJabuti.g:1513:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // InternalJabuti.g:1513:53: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // InternalJabuti.g:1514:2: iv_ruleLiteralValue= ruleLiteralValue EOF
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
    // InternalJabuti.g:1520:1: ruleLiteralValue returns [EObject current=null] : (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject this_NumericValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_VariableValue_2 = null;

        EObject this_FunctionCall_3 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1526:2: ( (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall ) )
            // InternalJabuti.g:1527:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )
            {
            // InternalJabuti.g:1527:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )
            int alt19=4;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalJabuti.g:1528:3: this_NumericValue_0= ruleNumericValue
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
                    // InternalJabuti.g:1537:3: this_StringValue_1= ruleStringValue
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
                    // InternalJabuti.g:1546:3: this_VariableValue_2= ruleVariableValue
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
                    // InternalJabuti.g:1555:3: this_FunctionCall_3= ruleFunctionCall
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
    // InternalJabuti.g:1567:1: entryRuleNumericValue returns [EObject current=null] : iv_ruleNumericValue= ruleNumericValue EOF ;
    public final EObject entryRuleNumericValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericValue = null;


        try {
            // InternalJabuti.g:1567:53: (iv_ruleNumericValue= ruleNumericValue EOF )
            // InternalJabuti.g:1568:2: iv_ruleNumericValue= ruleNumericValue EOF
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
    // InternalJabuti.g:1574:1: ruleNumericValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumericValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:1580:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalJabuti.g:1581:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalJabuti.g:1581:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalJabuti.g:1582:3: (lv_value_0_0= RULE_INT )
            {
            // InternalJabuti.g:1582:3: (lv_value_0_0= RULE_INT )
            // InternalJabuti.g:1583:4: lv_value_0_0= RULE_INT
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
    // InternalJabuti.g:1602:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalJabuti.g:1602:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalJabuti.g:1603:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalJabuti.g:1609:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:1615:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalJabuti.g:1616:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalJabuti.g:1616:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalJabuti.g:1617:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalJabuti.g:1617:3: (lv_value_0_0= RULE_STRING )
            // InternalJabuti.g:1618:4: lv_value_0_0= RULE_STRING
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
    // InternalJabuti.g:1637:1: entryRuleVariableValue returns [EObject current=null] : iv_ruleVariableValue= ruleVariableValue EOF ;
    public final EObject entryRuleVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableValue = null;


        try {
            // InternalJabuti.g:1637:54: (iv_ruleVariableValue= ruleVariableValue EOF )
            // InternalJabuti.g:1638:2: iv_ruleVariableValue= ruleVariableValue EOF
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
    // InternalJabuti.g:1644:1: ruleVariableValue returns [EObject current=null] : ( (lv_value_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleVariableValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1650:2: ( ( (lv_value_0_0= ruleQualifiedName ) ) )
            // InternalJabuti.g:1651:2: ( (lv_value_0_0= ruleQualifiedName ) )
            {
            // InternalJabuti.g:1651:2: ( (lv_value_0_0= ruleQualifiedName ) )
            // InternalJabuti.g:1652:3: (lv_value_0_0= ruleQualifiedName )
            {
            // InternalJabuti.g:1652:3: (lv_value_0_0= ruleQualifiedName )
            // InternalJabuti.g:1653:4: lv_value_0_0= ruleQualifiedName
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
    // InternalJabuti.g:1673:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalJabuti.g:1673:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalJabuti.g:1674:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalJabuti.g:1680:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' ) ;
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
            // InternalJabuti.g:1686:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' ) )
            // InternalJabuti.g:1687:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            {
            // InternalJabuti.g:1687:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            // InternalJabuti.g:1688:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* otherlv_5= ')'
            {
            // InternalJabuti.g:1688:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalJabuti.g:1689:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalJabuti.g:1689:4: (lv_name_0_0= ruleQualifiedName )
            // InternalJabuti.g:1690:5: lv_name_0_0= ruleQualifiedName
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
            						"br.edu.unijui.gca.jabuti.Jabuti.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalJabuti.g:1711:3: ( (lv_params_2_0= ruleExpression ) )
            // InternalJabuti.g:1712:4: (lv_params_2_0= ruleExpression )
            {
            // InternalJabuti.g:1712:4: (lv_params_2_0= ruleExpression )
            // InternalJabuti.g:1713:5: lv_params_2_0= ruleExpression
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
            						"br.edu.unijui.gca.jabuti.Jabuti.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJabuti.g:1730:3: (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==52) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalJabuti.g:1731:4: otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,52,FOLLOW_30); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalJabuti.g:1735:4: ( (lv_params_4_0= ruleExpression ) )
            	    // InternalJabuti.g:1736:5: (lv_params_4_0= ruleExpression )
            	    {
            	    // InternalJabuti.g:1736:5: (lv_params_4_0= ruleExpression )
            	    // InternalJabuti.g:1737:6: lv_params_4_0= ruleExpression
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
            	    							"br.edu.unijui.gca.jabuti.Jabuti.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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


    // $ANTLR start "entryRuleVariable"
    // InternalJabuti.g:1763:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalJabuti.g:1763:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalJabuti.g:1764:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalJabuti.g:1770:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expression_2_0= ruleExpression ) ) | ( ( (lv_term_3_1= ruleMessageContent | lv_term_3_2= ruleTimeInterval | lv_term_3_3= ruleTimeout ) ) ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;

        EObject lv_term_3_1 = null;

        EObject lv_term_3_2 = null;

        EObject lv_term_3_3 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1776:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expression_2_0= ruleExpression ) ) | ( ( (lv_term_3_1= ruleMessageContent | lv_term_3_2= ruleTimeInterval | lv_term_3_3= ruleTimeout ) ) ) ) ) )
            // InternalJabuti.g:1777:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expression_2_0= ruleExpression ) ) | ( ( (lv_term_3_1= ruleMessageContent | lv_term_3_2= ruleTimeInterval | lv_term_3_3= ruleTimeout ) ) ) ) )
            {
            // InternalJabuti.g:1777:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expression_2_0= ruleExpression ) ) | ( ( (lv_term_3_1= ruleMessageContent | lv_term_3_2= ruleTimeInterval | lv_term_3_3= ruleTimeout ) ) ) ) )
            // InternalJabuti.g:1778:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expression_2_0= ruleExpression ) ) | ( ( (lv_term_3_1= ruleMessageContent | lv_term_3_2= ruleTimeInterval | lv_term_3_3= ruleTimeout ) ) ) )
            {
            // InternalJabuti.g:1778:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalJabuti.g:1779:4: (lv_name_0_0= RULE_ID )
            {
            // InternalJabuti.g:1779:4: (lv_name_0_0= RULE_ID )
            // InternalJabuti.g:1780:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,16,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
            		
            // InternalJabuti.g:1800:3: ( ( (lv_expression_2_0= ruleExpression ) ) | ( ( (lv_term_3_1= ruleMessageContent | lv_term_3_2= ruleTimeInterval | lv_term_3_3= ruleTimeout ) ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_INT)||LA22_0==31||LA22_0==39||LA22_0==49) ) {
                alt22=1;
            }
            else if ( (LA22_0==56||LA22_0==60||LA22_0==63) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalJabuti.g:1801:4: ( (lv_expression_2_0= ruleExpression ) )
                    {
                    // InternalJabuti.g:1801:4: ( (lv_expression_2_0= ruleExpression ) )
                    // InternalJabuti.g:1802:5: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalJabuti.g:1802:5: (lv_expression_2_0= ruleExpression )
                    // InternalJabuti.g:1803:6: lv_expression_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0_0());
                    					
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
                    break;
                case 2 :
                    // InternalJabuti.g:1821:4: ( ( (lv_term_3_1= ruleMessageContent | lv_term_3_2= ruleTimeInterval | lv_term_3_3= ruleTimeout ) ) )
                    {
                    // InternalJabuti.g:1821:4: ( ( (lv_term_3_1= ruleMessageContent | lv_term_3_2= ruleTimeInterval | lv_term_3_3= ruleTimeout ) ) )
                    // InternalJabuti.g:1822:5: ( (lv_term_3_1= ruleMessageContent | lv_term_3_2= ruleTimeInterval | lv_term_3_3= ruleTimeout ) )
                    {
                    // InternalJabuti.g:1822:5: ( (lv_term_3_1= ruleMessageContent | lv_term_3_2= ruleTimeInterval | lv_term_3_3= ruleTimeout ) )
                    // InternalJabuti.g:1823:6: (lv_term_3_1= ruleMessageContent | lv_term_3_2= ruleTimeInterval | lv_term_3_3= ruleTimeout )
                    {
                    // InternalJabuti.g:1823:6: (lv_term_3_1= ruleMessageContent | lv_term_3_2= ruleTimeInterval | lv_term_3_3= ruleTimeout )
                    int alt21=3;
                    switch ( input.LA(1) ) {
                    case 63:
                        {
                        alt21=1;
                        }
                        break;
                    case 56:
                        {
                        alt21=2;
                        }
                        break;
                    case 60:
                        {
                        alt21=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }

                    switch (alt21) {
                        case 1 :
                            // InternalJabuti.g:1824:7: lv_term_3_1= ruleMessageContent
                            {

                            							newCompositeNode(grammarAccess.getVariableAccess().getTermMessageContentParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_term_3_1=ruleMessageContent();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVariableRule());
                            							}
                            							set(
                            								current,
                            								"term",
                            								lv_term_3_1,
                            								"br.edu.unijui.gca.jabuti.Jabuti.MessageContent");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalJabuti.g:1840:7: lv_term_3_2= ruleTimeInterval
                            {

                            							newCompositeNode(grammarAccess.getVariableAccess().getTermTimeIntervalParserRuleCall_2_1_0_1());
                            						
                            pushFollow(FOLLOW_2);
                            lv_term_3_2=ruleTimeInterval();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVariableRule());
                            							}
                            							set(
                            								current,
                            								"term",
                            								lv_term_3_2,
                            								"br.edu.unijui.gca.jabuti.Jabuti.TimeInterval");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 3 :
                            // InternalJabuti.g:1856:7: lv_term_3_3= ruleTimeout
                            {

                            							newCompositeNode(grammarAccess.getVariableAccess().getTermTimeoutParserRuleCall_2_1_0_2());
                            						
                            pushFollow(FOLLOW_2);
                            lv_term_3_3=ruleTimeout();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVariableRule());
                            							}
                            							set(
                            								current,
                            								"term",
                            								lv_term_3_3,
                            								"br.edu.unijui.gca.jabuti.Jabuti.Timeout");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleCondition"
    // InternalJabuti.g:1879:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalJabuti.g:1879:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalJabuti.g:1880:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalJabuti.g:1886:1: ruleCondition returns [EObject current=null] : ( ( (lv_conditionTerm_0_0= ruleConditionTerm ) ) | ( (lv_conditionalExpression_1_0= ruleConditionalExpression ) ) )+ ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_conditionTerm_0_0 = null;

        EObject lv_conditionalExpression_1_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1892:2: ( ( ( (lv_conditionTerm_0_0= ruleConditionTerm ) ) | ( (lv_conditionalExpression_1_0= ruleConditionalExpression ) ) )+ )
            // InternalJabuti.g:1893:2: ( ( (lv_conditionTerm_0_0= ruleConditionTerm ) ) | ( (lv_conditionalExpression_1_0= ruleConditionalExpression ) ) )+
            {
            // InternalJabuti.g:1893:2: ( ( (lv_conditionTerm_0_0= ruleConditionTerm ) ) | ( (lv_conditionalExpression_1_0= ruleConditionalExpression ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=3;
                switch ( input.LA(1) ) {
                case 31:
                case 56:
                case 58:
                case 60:
                case 61:
                case 62:
                case 63:
                    {
                    alt23=1;
                    }
                    break;
                case 55:
                    {
                    int LA23_3 = input.LA(2);

                    if ( (LA23_3==53) ) {
                        alt23=2;
                    }
                    else if ( (LA23_3==31||LA23_3==56||LA23_3==58||(LA23_3>=60 && LA23_3<=63)) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 38:
                case 52:
                case 53:
                    {
                    alt23=2;
                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // InternalJabuti.g:1894:3: ( (lv_conditionTerm_0_0= ruleConditionTerm ) )
            	    {
            	    // InternalJabuti.g:1894:3: ( (lv_conditionTerm_0_0= ruleConditionTerm ) )
            	    // InternalJabuti.g:1895:4: (lv_conditionTerm_0_0= ruleConditionTerm )
            	    {
            	    // InternalJabuti.g:1895:4: (lv_conditionTerm_0_0= ruleConditionTerm )
            	    // InternalJabuti.g:1896:5: lv_conditionTerm_0_0= ruleConditionTerm
            	    {

            	    					newCompositeNode(grammarAccess.getConditionAccess().getConditionTermConditionTermParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_conditionTerm_0_0=ruleConditionTerm();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"conditionTerm",
            	    						lv_conditionTerm_0_0,
            	    						"br.edu.unijui.gca.jabuti.Jabuti.ConditionTerm");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalJabuti.g:1914:3: ( (lv_conditionalExpression_1_0= ruleConditionalExpression ) )
            	    {
            	    // InternalJabuti.g:1914:3: ( (lv_conditionalExpression_1_0= ruleConditionalExpression ) )
            	    // InternalJabuti.g:1915:4: (lv_conditionalExpression_1_0= ruleConditionalExpression )
            	    {
            	    // InternalJabuti.g:1915:4: (lv_conditionalExpression_1_0= ruleConditionalExpression )
            	    // InternalJabuti.g:1916:5: lv_conditionalExpression_1_0= ruleConditionalExpression
            	    {

            	    					newCompositeNode(grammarAccess.getConditionAccess().getConditionalExpressionConditionalExpressionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_conditionalExpression_1_0=ruleConditionalExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"conditionalExpression",
            	    						lv_conditionalExpression_1_0,
            	    						"br.edu.unijui.gca.jabuti.Jabuti.ConditionalExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConditionalExpression"
    // InternalJabuti.g:1937:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // InternalJabuti.g:1937:62: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // InternalJabuti.g:1938:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
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
    // InternalJabuti.g:1944:1: ruleConditionalExpression returns [EObject current=null] : ( ( (lv_beforeSymbol_0_0= ruleLogicalOperator ) )? otherlv_1= 'when' otherlv_2= '(' ( (lv_conditionParam_3_0= ruleConditionTerm ) ) otherlv_4= ')' otherlv_5= 'do' otherlv_6= '{' ( (lv_conditionTerm_7_0= ruleConditionTerm ) ) otherlv_8= '}' ( (lv_afterSymbol_9_0= ruleLogicalOperator ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_beforeSymbol_0_0 = null;

        EObject lv_conditionParam_3_0 = null;

        EObject lv_conditionTerm_7_0 = null;

        EObject lv_afterSymbol_9_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1950:2: ( ( ( (lv_beforeSymbol_0_0= ruleLogicalOperator ) )? otherlv_1= 'when' otherlv_2= '(' ( (lv_conditionParam_3_0= ruleConditionTerm ) ) otherlv_4= ')' otherlv_5= 'do' otherlv_6= '{' ( (lv_conditionTerm_7_0= ruleConditionTerm ) ) otherlv_8= '}' ( (lv_afterSymbol_9_0= ruleLogicalOperator ) )? ) )
            // InternalJabuti.g:1951:2: ( ( (lv_beforeSymbol_0_0= ruleLogicalOperator ) )? otherlv_1= 'when' otherlv_2= '(' ( (lv_conditionParam_3_0= ruleConditionTerm ) ) otherlv_4= ')' otherlv_5= 'do' otherlv_6= '{' ( (lv_conditionTerm_7_0= ruleConditionTerm ) ) otherlv_8= '}' ( (lv_afterSymbol_9_0= ruleLogicalOperator ) )? )
            {
            // InternalJabuti.g:1951:2: ( ( (lv_beforeSymbol_0_0= ruleLogicalOperator ) )? otherlv_1= 'when' otherlv_2= '(' ( (lv_conditionParam_3_0= ruleConditionTerm ) ) otherlv_4= ')' otherlv_5= 'do' otherlv_6= '{' ( (lv_conditionTerm_7_0= ruleConditionTerm ) ) otherlv_8= '}' ( (lv_afterSymbol_9_0= ruleLogicalOperator ) )? )
            // InternalJabuti.g:1952:3: ( (lv_beforeSymbol_0_0= ruleLogicalOperator ) )? otherlv_1= 'when' otherlv_2= '(' ( (lv_conditionParam_3_0= ruleConditionTerm ) ) otherlv_4= ')' otherlv_5= 'do' otherlv_6= '{' ( (lv_conditionTerm_7_0= ruleConditionTerm ) ) otherlv_8= '}' ( (lv_afterSymbol_9_0= ruleLogicalOperator ) )?
            {
            // InternalJabuti.g:1952:3: ( (lv_beforeSymbol_0_0= ruleLogicalOperator ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38||LA24_0==52||LA24_0==55) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJabuti.g:1953:4: (lv_beforeSymbol_0_0= ruleLogicalOperator )
                    {
                    // InternalJabuti.g:1953:4: (lv_beforeSymbol_0_0= ruleLogicalOperator )
                    // InternalJabuti.g:1954:5: lv_beforeSymbol_0_0= ruleLogicalOperator
                    {

                    					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getBeforeSymbolLogicalOperatorParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_39);
                    lv_beforeSymbol_0_0=ruleLogicalOperator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                    					}
                    					set(
                    						current,
                    						"beforeSymbol",
                    						lv_beforeSymbol_0_0,
                    						"br.edu.unijui.gca.jabuti.Jabuti.LogicalOperator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,53,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalExpressionAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalJabuti.g:1979:3: ( (lv_conditionParam_3_0= ruleConditionTerm ) )
            // InternalJabuti.g:1980:4: (lv_conditionParam_3_0= ruleConditionTerm )
            {
            // InternalJabuti.g:1980:4: (lv_conditionParam_3_0= ruleConditionTerm )
            // InternalJabuti.g:1981:5: lv_conditionParam_3_0= ruleConditionTerm
            {

            					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getConditionParamConditionTermParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_conditionParam_3_0=ruleConditionTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
            					}
            					set(
            						current,
            						"conditionParam",
            						lv_conditionParam_3_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.ConditionTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_41); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,54,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getConditionalExpressionAccess().getDoKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_40); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionalExpressionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalJabuti.g:2010:3: ( (lv_conditionTerm_7_0= ruleConditionTerm ) )
            // InternalJabuti.g:2011:4: (lv_conditionTerm_7_0= ruleConditionTerm )
            {
            // InternalJabuti.g:2011:4: (lv_conditionTerm_7_0= ruleConditionTerm )
            // InternalJabuti.g:2012:5: lv_conditionTerm_7_0= ruleConditionTerm
            {

            					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getConditionTermConditionTermParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_conditionTerm_7_0=ruleConditionTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
            					}
            					set(
            						current,
            						"conditionTerm",
            						lv_conditionTerm_7_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.ConditionTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_42); 

            			newLeafNode(otherlv_8, grammarAccess.getConditionalExpressionAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalJabuti.g:2033:3: ( (lv_afterSymbol_9_0= ruleLogicalOperator ) )?
            int alt25=2;
            switch ( input.LA(1) ) {
                case 52:
                    {
                    alt25=1;
                    }
                    break;
                case 38:
                    {
                    alt25=1;
                    }
                    break;
                case 55:
                    {
                    alt25=1;
                    }
                    break;
            }

            switch (alt25) {
                case 1 :
                    // InternalJabuti.g:2034:4: (lv_afterSymbol_9_0= ruleLogicalOperator )
                    {
                    // InternalJabuti.g:2034:4: (lv_afterSymbol_9_0= ruleLogicalOperator )
                    // InternalJabuti.g:2035:5: lv_afterSymbol_9_0= ruleLogicalOperator
                    {

                    					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getAfterSymbolLogicalOperatorParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_afterSymbol_9_0=ruleLogicalOperator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                    					}
                    					set(
                    						current,
                    						"afterSymbol",
                    						lv_afterSymbol_9_0,
                    						"br.edu.unijui.gca.jabuti.Jabuti.LogicalOperator");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleConditionalExpression"


    // $ANTLR start "entryRuleConditionTerm"
    // InternalJabuti.g:2056:1: entryRuleConditionTerm returns [EObject current=null] : iv_ruleConditionTerm= ruleConditionTerm EOF ;
    public final EObject entryRuleConditionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionTerm = null;


        try {
            // InternalJabuti.g:2056:54: (iv_ruleConditionTerm= ruleConditionTerm EOF )
            // InternalJabuti.g:2057:2: iv_ruleConditionTerm= ruleConditionTerm EOF
            {
             newCompositeNode(grammarAccess.getConditionTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionTerm=ruleConditionTerm();

            state._fsp--;

             current =iv_ruleConditionTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionTerm"


    // $ANTLR start "ruleConditionTerm"
    // InternalJabuti.g:2063:1: ruleConditionTerm returns [EObject current=null] : this_CompositeCondition_0= ruleCompositeCondition ;
    public final EObject ruleConditionTerm() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeCondition_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:2069:2: (this_CompositeCondition_0= ruleCompositeCondition )
            // InternalJabuti.g:2070:2: this_CompositeCondition_0= ruleCompositeCondition
            {

            		newCompositeNode(grammarAccess.getConditionTermAccess().getCompositeConditionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CompositeCondition_0=ruleCompositeCondition();

            state._fsp--;


            		current = this_CompositeCondition_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionTerm"


    // $ANTLR start "entryRuleCompositeCondition"
    // InternalJabuti.g:2081:1: entryRuleCompositeCondition returns [EObject current=null] : iv_ruleCompositeCondition= ruleCompositeCondition EOF ;
    public final EObject entryRuleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCondition = null;


        try {
            // InternalJabuti.g:2081:59: (iv_ruleCompositeCondition= ruleCompositeCondition EOF )
            // InternalJabuti.g:2082:2: iv_ruleCompositeCondition= ruleCompositeCondition EOF
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
    // InternalJabuti.g:2088:1: ruleCompositeCondition returns [EObject current=null] : (this_NegationTerm_0= ruleNegationTerm ( () ( ( (lv_symbol_2_0= ',' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegationTerm ) ) )* ) ;
    public final EObject ruleCompositeCondition() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        Token lv_symbol_3_0=null;
        EObject this_NegationTerm_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:2094:2: ( (this_NegationTerm_0= ruleNegationTerm ( () ( ( (lv_symbol_2_0= ',' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegationTerm ) ) )* ) )
            // InternalJabuti.g:2095:2: (this_NegationTerm_0= ruleNegationTerm ( () ( ( (lv_symbol_2_0= ',' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegationTerm ) ) )* )
            {
            // InternalJabuti.g:2095:2: (this_NegationTerm_0= ruleNegationTerm ( () ( ( (lv_symbol_2_0= ',' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegationTerm ) ) )* )
            // InternalJabuti.g:2096:3: this_NegationTerm_0= ruleNegationTerm ( () ( ( (lv_symbol_2_0= ',' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegationTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompositeConditionAccess().getNegationTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_NegationTerm_0=ruleNegationTerm();

            state._fsp--;


            			current = this_NegationTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJabuti.g:2104:3: ( () ( ( (lv_symbol_2_0= ',' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegationTerm ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==52) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==31||(LA27_2>=55 && LA27_2<=56)||LA27_2==58||(LA27_2>=60 && LA27_2<=63)) ) {
                        alt27=1;
                    }


                }
                else if ( (LA27_0==38) ) {
                    int LA27_3 = input.LA(2);

                    if ( (LA27_3==31||(LA27_3>=55 && LA27_3<=56)||LA27_3==58||(LA27_3>=60 && LA27_3<=63)) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalJabuti.g:2105:4: () ( ( (lv_symbol_2_0= ',' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegationTerm ) )
            	    {
            	    // InternalJabuti.g:2105:4: ()
            	    // InternalJabuti.g:2106:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCompositeConditionAccess().getBinaryTermOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalJabuti.g:2112:4: ( ( (lv_symbol_2_0= ',' ) ) | ( (lv_symbol_3_0= 'OR' ) ) )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==52) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==38) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalJabuti.g:2113:5: ( (lv_symbol_2_0= ',' ) )
            	            {
            	            // InternalJabuti.g:2113:5: ( (lv_symbol_2_0= ',' ) )
            	            // InternalJabuti.g:2114:6: (lv_symbol_2_0= ',' )
            	            {
            	            // InternalJabuti.g:2114:6: (lv_symbol_2_0= ',' )
            	            // InternalJabuti.g:2115:7: lv_symbol_2_0= ','
            	            {
            	            lv_symbol_2_0=(Token)match(input,52,FOLLOW_40); 

            	            							newLeafNode(lv_symbol_2_0, grammarAccess.getCompositeConditionAccess().getSymbolCommaKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompositeConditionRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_2_0, ",");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalJabuti.g:2128:5: ( (lv_symbol_3_0= 'OR' ) )
            	            {
            	            // InternalJabuti.g:2128:5: ( (lv_symbol_3_0= 'OR' ) )
            	            // InternalJabuti.g:2129:6: (lv_symbol_3_0= 'OR' )
            	            {
            	            // InternalJabuti.g:2129:6: (lv_symbol_3_0= 'OR' )
            	            // InternalJabuti.g:2130:7: lv_symbol_3_0= 'OR'
            	            {
            	            lv_symbol_3_0=(Token)match(input,38,FOLLOW_40); 

            	            							newLeafNode(lv_symbol_3_0, grammarAccess.getCompositeConditionAccess().getSymbolORKeyword_1_1_1_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompositeConditionRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_3_0, "OR");
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalJabuti.g:2143:4: ( (lv_right_4_0= ruleNegationTerm ) )
            	    // InternalJabuti.g:2144:5: (lv_right_4_0= ruleNegationTerm )
            	    {
            	    // InternalJabuti.g:2144:5: (lv_right_4_0= ruleNegationTerm )
            	    // InternalJabuti.g:2145:6: lv_right_4_0= ruleNegationTerm
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConditionAccess().getRightNegationTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_right_4_0=ruleNegationTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"br.edu.unijui.gca.jabuti.Jabuti.NegationTerm");
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
    // $ANTLR end "ruleCompositeCondition"


    // $ANTLR start "entryRuleNegationTerm"
    // InternalJabuti.g:2167:1: entryRuleNegationTerm returns [EObject current=null] : iv_ruleNegationTerm= ruleNegationTerm EOF ;
    public final EObject entryRuleNegationTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationTerm = null;


        try {
            // InternalJabuti.g:2167:53: (iv_ruleNegationTerm= ruleNegationTerm EOF )
            // InternalJabuti.g:2168:2: iv_ruleNegationTerm= ruleNegationTerm EOF
            {
             newCompositeNode(grammarAccess.getNegationTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegationTerm=ruleNegationTerm();

            state._fsp--;

             current =iv_ruleNegationTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegationTerm"


    // $ANTLR start "ruleNegationTerm"
    // InternalJabuti.g:2174:1: ruleNegationTerm returns [EObject current=null] : (this_Term_0= ruleTerm | ( () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_conditionTerm_3_0= ruleTerm ) ) ) ) ;
    public final EObject ruleNegationTerm() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        EObject this_Term_0 = null;

        EObject lv_conditionTerm_3_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:2180:2: ( (this_Term_0= ruleTerm | ( () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_conditionTerm_3_0= ruleTerm ) ) ) ) )
            // InternalJabuti.g:2181:2: (this_Term_0= ruleTerm | ( () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_conditionTerm_3_0= ruleTerm ) ) ) )
            {
            // InternalJabuti.g:2181:2: (this_Term_0= ruleTerm | ( () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_conditionTerm_3_0= ruleTerm ) ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31||LA28_0==56||LA28_0==58||(LA28_0>=60 && LA28_0<=63)) ) {
                alt28=1;
            }
            else if ( (LA28_0==55) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalJabuti.g:2182:3: this_Term_0= ruleTerm
                    {

                    			newCompositeNode(grammarAccess.getNegationTermAccess().getTermParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Term_0=ruleTerm();

                    state._fsp--;


                    			current = this_Term_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJabuti.g:2191:3: ( () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_conditionTerm_3_0= ruleTerm ) ) )
                    {
                    // InternalJabuti.g:2191:3: ( () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_conditionTerm_3_0= ruleTerm ) ) )
                    // InternalJabuti.g:2192:4: () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_conditionTerm_3_0= ruleTerm ) )
                    {
                    // InternalJabuti.g:2192:4: ()
                    // InternalJabuti.g:2193:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegationTermAccess().getUnaryTermOperatorAction_1_0(),
                    						current);
                    				

                    }

                    // InternalJabuti.g:2199:4: ( (lv_symbol_2_0= 'NOT' ) )
                    // InternalJabuti.g:2200:5: (lv_symbol_2_0= 'NOT' )
                    {
                    // InternalJabuti.g:2200:5: (lv_symbol_2_0= 'NOT' )
                    // InternalJabuti.g:2201:6: lv_symbol_2_0= 'NOT'
                    {
                    lv_symbol_2_0=(Token)match(input,55,FOLLOW_44); 

                    						newLeafNode(lv_symbol_2_0, grammarAccess.getNegationTermAccess().getSymbolNOTKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNegationTermRule());
                    						}
                    						setWithLastConsumed(current, "symbol", lv_symbol_2_0, "NOT");
                    					

                    }


                    }

                    // InternalJabuti.g:2213:4: ( (lv_conditionTerm_3_0= ruleTerm ) )
                    // InternalJabuti.g:2214:5: (lv_conditionTerm_3_0= ruleTerm )
                    {
                    // InternalJabuti.g:2214:5: (lv_conditionTerm_3_0= ruleTerm )
                    // InternalJabuti.g:2215:6: lv_conditionTerm_3_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getNegationTermAccess().getConditionTermTermParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_conditionTerm_3_0=ruleTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNegationTermRule());
                    						}
                    						set(
                    							current,
                    							"conditionTerm",
                    							lv_conditionTerm_3_0,
                    							"br.edu.unijui.gca.jabuti.Jabuti.Term");
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
    // $ANTLR end "ruleNegationTerm"


    // $ANTLR start "entryRuleTerm"
    // InternalJabuti.g:2237:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalJabuti.g:2237:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalJabuti.g:2238:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalJabuti.g:2244:1: ruleTerm returns [EObject current=null] : ( (otherlv_0= '(' this_ConditionTerm_1= ruleConditionTerm otherlv_2= ')' ) | this_SessionInterval_3= ruleSessionInterval | this_WeekDaysInterval_4= ruleWeekDaysInterval | this_TimeInterval_5= ruleTimeInterval | this_Timeout_6= ruleTimeout | this_MaxNumberOfOperation_7= ruleMaxNumberOfOperation | this_MessageContent_8= ruleMessageContent ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ConditionTerm_1 = null;

        EObject this_SessionInterval_3 = null;

        EObject this_WeekDaysInterval_4 = null;

        EObject this_TimeInterval_5 = null;

        EObject this_Timeout_6 = null;

        EObject this_MaxNumberOfOperation_7 = null;

        EObject this_MessageContent_8 = null;



        	enterRule();

        try {
            // InternalJabuti.g:2250:2: ( ( (otherlv_0= '(' this_ConditionTerm_1= ruleConditionTerm otherlv_2= ')' ) | this_SessionInterval_3= ruleSessionInterval | this_WeekDaysInterval_4= ruleWeekDaysInterval | this_TimeInterval_5= ruleTimeInterval | this_Timeout_6= ruleTimeout | this_MaxNumberOfOperation_7= ruleMaxNumberOfOperation | this_MessageContent_8= ruleMessageContent ) )
            // InternalJabuti.g:2251:2: ( (otherlv_0= '(' this_ConditionTerm_1= ruleConditionTerm otherlv_2= ')' ) | this_SessionInterval_3= ruleSessionInterval | this_WeekDaysInterval_4= ruleWeekDaysInterval | this_TimeInterval_5= ruleTimeInterval | this_Timeout_6= ruleTimeout | this_MaxNumberOfOperation_7= ruleMaxNumberOfOperation | this_MessageContent_8= ruleMessageContent )
            {
            // InternalJabuti.g:2251:2: ( (otherlv_0= '(' this_ConditionTerm_1= ruleConditionTerm otherlv_2= ')' ) | this_SessionInterval_3= ruleSessionInterval | this_WeekDaysInterval_4= ruleWeekDaysInterval | this_TimeInterval_5= ruleTimeInterval | this_Timeout_6= ruleTimeout | this_MaxNumberOfOperation_7= ruleMaxNumberOfOperation | this_MessageContent_8= ruleMessageContent )
            int alt29=7;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt29=1;
                }
                break;
            case 58:
                {
                alt29=2;
                }
                break;
            case 62:
                {
                alt29=3;
                }
                break;
            case 56:
                {
                alt29=4;
                }
                break;
            case 60:
                {
                alt29=5;
                }
                break;
            case 61:
                {
                alt29=6;
                }
                break;
            case 63:
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
                    // InternalJabuti.g:2252:3: (otherlv_0= '(' this_ConditionTerm_1= ruleConditionTerm otherlv_2= ')' )
                    {
                    // InternalJabuti.g:2252:3: (otherlv_0= '(' this_ConditionTerm_1= ruleConditionTerm otherlv_2= ')' )
                    // InternalJabuti.g:2253:4: otherlv_0= '(' this_ConditionTerm_1= ruleConditionTerm otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_40); 

                    				newLeafNode(otherlv_0, grammarAccess.getTermAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getTermAccess().getConditionTermParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_28);
                    this_ConditionTerm_1=ruleConditionTerm();

                    state._fsp--;


                    				current = this_ConditionTerm_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTermAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJabuti.g:2271:3: this_SessionInterval_3= ruleSessionInterval
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getSessionIntervalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SessionInterval_3=ruleSessionInterval();

                    state._fsp--;


                    			current = this_SessionInterval_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJabuti.g:2280:3: this_WeekDaysInterval_4= ruleWeekDaysInterval
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getWeekDaysIntervalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_WeekDaysInterval_4=ruleWeekDaysInterval();

                    state._fsp--;


                    			current = this_WeekDaysInterval_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJabuti.g:2289:3: this_TimeInterval_5= ruleTimeInterval
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getTimeIntervalParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeInterval_5=ruleTimeInterval();

                    state._fsp--;


                    			current = this_TimeInterval_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJabuti.g:2298:3: this_Timeout_6= ruleTimeout
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getTimeoutParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Timeout_6=ruleTimeout();

                    state._fsp--;


                    			current = this_Timeout_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalJabuti.g:2307:3: this_MaxNumberOfOperation_7= ruleMaxNumberOfOperation
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getMaxNumberOfOperationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxNumberOfOperation_7=ruleMaxNumberOfOperation();

                    state._fsp--;


                    			current = this_MaxNumberOfOperation_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalJabuti.g:2316:3: this_MessageContent_8= ruleMessageContent
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getMessageContentParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_MessageContent_8=ruleMessageContent();

                    state._fsp--;


                    			current = this_MessageContent_8;
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleLogicalOperator"
    // InternalJabuti.g:2328:1: entryRuleLogicalOperator returns [EObject current=null] : iv_ruleLogicalOperator= ruleLogicalOperator EOF ;
    public final EObject entryRuleLogicalOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOperator = null;


        try {
            // InternalJabuti.g:2328:56: (iv_ruleLogicalOperator= ruleLogicalOperator EOF )
            // InternalJabuti.g:2329:2: iv_ruleLogicalOperator= ruleLogicalOperator EOF
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
    // InternalJabuti.g:2335:1: ruleLogicalOperator returns [EObject current=null] : ( ( (lv_symbol_0_1= ',' | lv_symbol_0_2= 'OR' | lv_symbol_0_3= 'NOT' ) ) ) ;
    public final EObject ruleLogicalOperator() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_1=null;
        Token lv_symbol_0_2=null;
        Token lv_symbol_0_3=null;


        	enterRule();

        try {
            // InternalJabuti.g:2341:2: ( ( ( (lv_symbol_0_1= ',' | lv_symbol_0_2= 'OR' | lv_symbol_0_3= 'NOT' ) ) ) )
            // InternalJabuti.g:2342:2: ( ( (lv_symbol_0_1= ',' | lv_symbol_0_2= 'OR' | lv_symbol_0_3= 'NOT' ) ) )
            {
            // InternalJabuti.g:2342:2: ( ( (lv_symbol_0_1= ',' | lv_symbol_0_2= 'OR' | lv_symbol_0_3= 'NOT' ) ) )
            // InternalJabuti.g:2343:3: ( (lv_symbol_0_1= ',' | lv_symbol_0_2= 'OR' | lv_symbol_0_3= 'NOT' ) )
            {
            // InternalJabuti.g:2343:3: ( (lv_symbol_0_1= ',' | lv_symbol_0_2= 'OR' | lv_symbol_0_3= 'NOT' ) )
            // InternalJabuti.g:2344:4: (lv_symbol_0_1= ',' | lv_symbol_0_2= 'OR' | lv_symbol_0_3= 'NOT' )
            {
            // InternalJabuti.g:2344:4: (lv_symbol_0_1= ',' | lv_symbol_0_2= 'OR' | lv_symbol_0_3= 'NOT' )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt30=1;
                }
                break;
            case 38:
                {
                alt30=2;
                }
                break;
            case 55:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalJabuti.g:2345:5: lv_symbol_0_1= ','
                    {
                    lv_symbol_0_1=(Token)match(input,52,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_1, grammarAccess.getLogicalOperatorAccess().getSymbolCommaKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalJabuti.g:2356:5: lv_symbol_0_2= 'OR'
                    {
                    lv_symbol_0_2=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_2, grammarAccess.getLogicalOperatorAccess().getSymbolORKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalJabuti.g:2367:5: lv_symbol_0_3= 'NOT'
                    {
                    lv_symbol_0_3=(Token)match(input,55,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_3, grammarAccess.getLogicalOperatorAccess().getSymbolNOTKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_3, null);
                    				

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


    // $ANTLR start "entryRuleTimeInterval"
    // InternalJabuti.g:2383:1: entryRuleTimeInterval returns [EObject current=null] : iv_ruleTimeInterval= ruleTimeInterval EOF ;
    public final EObject entryRuleTimeInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeInterval = null;


        try {
            // InternalJabuti.g:2383:53: (iv_ruleTimeInterval= ruleTimeInterval EOF )
            // InternalJabuti.g:2384:2: iv_ruleTimeInterval= ruleTimeInterval EOF
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
    // InternalJabuti.g:2390:1: ruleTimeInterval returns [EObject current=null] : (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
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
            // InternalJabuti.g:2396:2: ( (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalJabuti.g:2397:2: (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalJabuti.g:2397:2: (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalJabuti.g:2398:3: otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeIntervalAccess().getTimeIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeIntervalAccess().getLeftParenthesisKeyword_1());
            		
            // InternalJabuti.g:2406:3: ( (lv_start_2_0= RULE_STRING ) )
            // InternalJabuti.g:2407:4: (lv_start_2_0= RULE_STRING )
            {
            // InternalJabuti.g:2407:4: (lv_start_2_0= RULE_STRING )
            // InternalJabuti.g:2408:5: lv_start_2_0= RULE_STRING
            {
            lv_start_2_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

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

            otherlv_3=(Token)match(input,57,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeIntervalAccess().getToKeyword_3());
            		
            // InternalJabuti.g:2428:3: ( (lv_end_4_0= RULE_STRING ) )
            // InternalJabuti.g:2429:4: (lv_end_4_0= RULE_STRING )
            {
            // InternalJabuti.g:2429:4: (lv_end_4_0= RULE_STRING )
            // InternalJabuti.g:2430:5: lv_end_4_0= RULE_STRING
            {
            lv_end_4_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

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
    // InternalJabuti.g:2454:1: entryRuleSessionInterval returns [EObject current=null] : iv_ruleSessionInterval= ruleSessionInterval EOF ;
    public final EObject entryRuleSessionInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSessionInterval = null;


        try {
            // InternalJabuti.g:2454:56: (iv_ruleSessionInterval= ruleSessionInterval EOF )
            // InternalJabuti.g:2455:2: iv_ruleSessionInterval= ruleSessionInterval EOF
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
    // InternalJabuti.g:2461:1: ruleSessionInterval returns [EObject current=null] : (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) (otherlv_4= 'per' ( ( (lv_messageContent_5_0= ruleMessageContent ) ) | ( (lv_value_6_0= RULE_STRING ) ) | ruleQualifiedName ) )? otherlv_8= ')' ) ;
    public final EObject ruleSessionInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_frequency_2_0=null;
        Token otherlv_4=null;
        Token lv_value_6_0=null;
        Token otherlv_8=null;
        Enumerator lv_timeUnit_3_0 = null;

        EObject lv_messageContent_5_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:2467:2: ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) (otherlv_4= 'per' ( ( (lv_messageContent_5_0= ruleMessageContent ) ) | ( (lv_value_6_0= RULE_STRING ) ) | ruleQualifiedName ) )? otherlv_8= ')' ) )
            // InternalJabuti.g:2468:2: (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) (otherlv_4= 'per' ( ( (lv_messageContent_5_0= ruleMessageContent ) ) | ( (lv_value_6_0= RULE_STRING ) ) | ruleQualifiedName ) )? otherlv_8= ')' )
            {
            // InternalJabuti.g:2468:2: (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) (otherlv_4= 'per' ( ( (lv_messageContent_5_0= ruleMessageContent ) ) | ( (lv_value_6_0= RULE_STRING ) ) | ruleQualifiedName ) )? otherlv_8= ')' )
            // InternalJabuti.g:2469:3: otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) (otherlv_4= 'per' ( ( (lv_messageContent_5_0= ruleMessageContent ) ) | ( (lv_value_6_0= RULE_STRING ) ) | ruleQualifiedName ) )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getSessionIntervalAccess().getSessionIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getSessionIntervalAccess().getLeftParenthesisKeyword_1());
            		
            // InternalJabuti.g:2477:3: ( (lv_frequency_2_0= RULE_INT ) )
            // InternalJabuti.g:2478:4: (lv_frequency_2_0= RULE_INT )
            {
            // InternalJabuti.g:2478:4: (lv_frequency_2_0= RULE_INT )
            // InternalJabuti.g:2479:5: lv_frequency_2_0= RULE_INT
            {
            lv_frequency_2_0=(Token)match(input,RULE_INT,FOLLOW_47); 

            					newLeafNode(lv_frequency_2_0, grammarAccess.getSessionIntervalAccess().getFrequencyINTTerminalRuleCall_2_0());
            				

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

            // InternalJabuti.g:2495:3: ( (lv_timeUnit_3_0= ruleTimeUnit ) )
            // InternalJabuti.g:2496:4: (lv_timeUnit_3_0= ruleTimeUnit )
            {
            // InternalJabuti.g:2496:4: (lv_timeUnit_3_0= ruleTimeUnit )
            // InternalJabuti.g:2497:5: lv_timeUnit_3_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getSessionIntervalAccess().getTimeUnitTimeUnitEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_48);
            lv_timeUnit_3_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSessionIntervalRule());
            					}
            					set(
            						current,
            						"timeUnit",
            						lv_timeUnit_3_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.TimeUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJabuti.g:2514:3: (otherlv_4= 'per' ( ( (lv_messageContent_5_0= ruleMessageContent ) ) | ( (lv_value_6_0= RULE_STRING ) ) | ruleQualifiedName ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==59) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalJabuti.g:2515:4: otherlv_4= 'per' ( ( (lv_messageContent_5_0= ruleMessageContent ) ) | ( (lv_value_6_0= RULE_STRING ) ) | ruleQualifiedName )
                    {
                    otherlv_4=(Token)match(input,59,FOLLOW_49); 

                    				newLeafNode(otherlv_4, grammarAccess.getSessionIntervalAccess().getPerKeyword_4_0());
                    			
                    // InternalJabuti.g:2519:4: ( ( (lv_messageContent_5_0= ruleMessageContent ) ) | ( (lv_value_6_0= RULE_STRING ) ) | ruleQualifiedName )
                    int alt31=3;
                    switch ( input.LA(1) ) {
                    case 63:
                        {
                        alt31=1;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt31=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt31=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }

                    switch (alt31) {
                        case 1 :
                            // InternalJabuti.g:2520:5: ( (lv_messageContent_5_0= ruleMessageContent ) )
                            {
                            // InternalJabuti.g:2520:5: ( (lv_messageContent_5_0= ruleMessageContent ) )
                            // InternalJabuti.g:2521:6: (lv_messageContent_5_0= ruleMessageContent )
                            {
                            // InternalJabuti.g:2521:6: (lv_messageContent_5_0= ruleMessageContent )
                            // InternalJabuti.g:2522:7: lv_messageContent_5_0= ruleMessageContent
                            {

                            							newCompositeNode(grammarAccess.getSessionIntervalAccess().getMessageContentMessageContentParserRuleCall_4_1_0_0());
                            						
                            pushFollow(FOLLOW_28);
                            lv_messageContent_5_0=ruleMessageContent();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSessionIntervalRule());
                            							}
                            							set(
                            								current,
                            								"messageContent",
                            								lv_messageContent_5_0,
                            								"br.edu.unijui.gca.jabuti.Jabuti.MessageContent");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalJabuti.g:2540:5: ( (lv_value_6_0= RULE_STRING ) )
                            {
                            // InternalJabuti.g:2540:5: ( (lv_value_6_0= RULE_STRING ) )
                            // InternalJabuti.g:2541:6: (lv_value_6_0= RULE_STRING )
                            {
                            // InternalJabuti.g:2541:6: (lv_value_6_0= RULE_STRING )
                            // InternalJabuti.g:2542:7: lv_value_6_0= RULE_STRING
                            {
                            lv_value_6_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

                            							newLeafNode(lv_value_6_0, grammarAccess.getSessionIntervalAccess().getValueSTRINGTerminalRuleCall_4_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSessionIntervalRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"value",
                            								lv_value_6_0,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalJabuti.g:2559:5: ruleQualifiedName
                            {

                            					newCompositeNode(grammarAccess.getSessionIntervalAccess().getQualifiedNameParserRuleCall_4_1_2());
                            				
                            pushFollow(FOLLOW_28);
                            ruleQualifiedName();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSessionIntervalAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleTimeout"
    // InternalJabuti.g:2576:1: entryRuleTimeout returns [EObject current=null] : iv_ruleTimeout= ruleTimeout EOF ;
    public final EObject entryRuleTimeout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeout = null;


        try {
            // InternalJabuti.g:2576:48: (iv_ruleTimeout= ruleTimeout EOF )
            // InternalJabuti.g:2577:2: iv_ruleTimeout= ruleTimeout EOF
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
    // InternalJabuti.g:2583:1: ruleTimeout returns [EObject current=null] : (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleTimeout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:2589:2: ( (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalJabuti.g:2590:2: (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalJabuti.g:2590:2: (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalJabuti.g:2591:3: otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeoutAccess().getTimeoutKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeoutAccess().getLeftParenthesisKeyword_1());
            		
            // InternalJabuti.g:2599:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJabuti.g:2600:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJabuti.g:2600:4: (lv_expression_2_0= ruleExpression )
            // InternalJabuti.g:2601:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getTimeoutAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeoutRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.Expression");
            					afterParserOrEnumRuleCall();
            				

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


    // $ANTLR start "entryRuleMaxNumberOfOperation"
    // InternalJabuti.g:2626:1: entryRuleMaxNumberOfOperation returns [EObject current=null] : iv_ruleMaxNumberOfOperation= ruleMaxNumberOfOperation EOF ;
    public final EObject entryRuleMaxNumberOfOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxNumberOfOperation = null;


        try {
            // InternalJabuti.g:2626:61: (iv_ruleMaxNumberOfOperation= ruleMaxNumberOfOperation EOF )
            // InternalJabuti.g:2627:2: iv_ruleMaxNumberOfOperation= ruleMaxNumberOfOperation EOF
            {
             newCompositeNode(grammarAccess.getMaxNumberOfOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxNumberOfOperation=ruleMaxNumberOfOperation();

            state._fsp--;

             current =iv_ruleMaxNumberOfOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaxNumberOfOperation"


    // $ANTLR start "ruleMaxNumberOfOperation"
    // InternalJabuti.g:2633:1: ruleMaxNumberOfOperation returns [EObject current=null] : (otherlv_0= 'MaxNumberOfOperation' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) (otherlv_3= 'per' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleMaxNumberOfOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_operationsNumber_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_timeUnit_4_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:2639:2: ( (otherlv_0= 'MaxNumberOfOperation' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) (otherlv_3= 'per' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) )? otherlv_5= ')' ) )
            // InternalJabuti.g:2640:2: (otherlv_0= 'MaxNumberOfOperation' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) (otherlv_3= 'per' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) )? otherlv_5= ')' )
            {
            // InternalJabuti.g:2640:2: (otherlv_0= 'MaxNumberOfOperation' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) (otherlv_3= 'per' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) )? otherlv_5= ')' )
            // InternalJabuti.g:2641:3: otherlv_0= 'MaxNumberOfOperation' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) (otherlv_3= 'per' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getMaxNumberOfOperationAccess().getMaxNumberOfOperationKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxNumberOfOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalJabuti.g:2649:3: ( (lv_operationsNumber_2_0= RULE_INT ) )
            // InternalJabuti.g:2650:4: (lv_operationsNumber_2_0= RULE_INT )
            {
            // InternalJabuti.g:2650:4: (lv_operationsNumber_2_0= RULE_INT )
            // InternalJabuti.g:2651:5: lv_operationsNumber_2_0= RULE_INT
            {
            lv_operationsNumber_2_0=(Token)match(input,RULE_INT,FOLLOW_48); 

            					newLeafNode(lv_operationsNumber_2_0, grammarAccess.getMaxNumberOfOperationAccess().getOperationsNumberINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxNumberOfOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operationsNumber",
            						lv_operationsNumber_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalJabuti.g:2667:3: (otherlv_3= 'per' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==59) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalJabuti.g:2668:4: otherlv_3= 'per' ( (lv_timeUnit_4_0= ruleTimeUnit ) )
                    {
                    otherlv_3=(Token)match(input,59,FOLLOW_47); 

                    				newLeafNode(otherlv_3, grammarAccess.getMaxNumberOfOperationAccess().getPerKeyword_3_0());
                    			
                    // InternalJabuti.g:2672:4: ( (lv_timeUnit_4_0= ruleTimeUnit ) )
                    // InternalJabuti.g:2673:5: (lv_timeUnit_4_0= ruleTimeUnit )
                    {
                    // InternalJabuti.g:2673:5: (lv_timeUnit_4_0= ruleTimeUnit )
                    // InternalJabuti.g:2674:6: lv_timeUnit_4_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getMaxNumberOfOperationAccess().getTimeUnitTimeUnitEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_timeUnit_4_0=ruleTimeUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMaxNumberOfOperationRule());
                    						}
                    						set(
                    							current,
                    							"timeUnit",
                    							lv_timeUnit_4_0,
                    							"br.edu.unijui.gca.jabuti.Jabuti.TimeUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMaxNumberOfOperationAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaxNumberOfOperation"


    // $ANTLR start "entryRuleWeekDaysInterval"
    // InternalJabuti.g:2700:1: entryRuleWeekDaysInterval returns [EObject current=null] : iv_ruleWeekDaysInterval= ruleWeekDaysInterval EOF ;
    public final EObject entryRuleWeekDaysInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeekDaysInterval = null;


        try {
            // InternalJabuti.g:2700:57: (iv_ruleWeekDaysInterval= ruleWeekDaysInterval EOF )
            // InternalJabuti.g:2701:2: iv_ruleWeekDaysInterval= ruleWeekDaysInterval EOF
            {
             newCompositeNode(grammarAccess.getWeekDaysIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWeekDaysInterval=ruleWeekDaysInterval();

            state._fsp--;

             current =iv_ruleWeekDaysInterval; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWeekDaysInterval"


    // $ANTLR start "ruleWeekDaysInterval"
    // InternalJabuti.g:2707:1: ruleWeekDaysInterval returns [EObject current=null] : (otherlv_0= 'WeekDaysInterval' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' ) ;
    public final EObject ruleWeekDaysInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_start_2_0 = null;

        Enumerator lv_end_4_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:2713:2: ( (otherlv_0= 'WeekDaysInterval' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' ) )
            // InternalJabuti.g:2714:2: (otherlv_0= 'WeekDaysInterval' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' )
            {
            // InternalJabuti.g:2714:2: (otherlv_0= 'WeekDaysInterval' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' )
            // InternalJabuti.g:2715:3: otherlv_0= 'WeekDaysInterval' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getWeekDaysIntervalAccess().getWeekDaysIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getWeekDaysIntervalAccess().getLeftParenthesisKeyword_1());
            		
            // InternalJabuti.g:2723:3: ( (lv_start_2_0= ruleWeekDay ) )
            // InternalJabuti.g:2724:4: (lv_start_2_0= ruleWeekDay )
            {
            // InternalJabuti.g:2724:4: (lv_start_2_0= ruleWeekDay )
            // InternalJabuti.g:2725:5: lv_start_2_0= ruleWeekDay
            {

            					newCompositeNode(grammarAccess.getWeekDaysIntervalAccess().getStartWeekDayEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_45);
            lv_start_2_0=ruleWeekDay();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWeekDaysIntervalRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_2_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.WeekDay");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,57,FOLLOW_50); 

            			newLeafNode(otherlv_3, grammarAccess.getWeekDaysIntervalAccess().getToKeyword_3());
            		
            // InternalJabuti.g:2746:3: ( (lv_end_4_0= ruleWeekDay ) )
            // InternalJabuti.g:2747:4: (lv_end_4_0= ruleWeekDay )
            {
            // InternalJabuti.g:2747:4: (lv_end_4_0= ruleWeekDay )
            // InternalJabuti.g:2748:5: lv_end_4_0= ruleWeekDay
            {

            					newCompositeNode(grammarAccess.getWeekDaysIntervalAccess().getEndWeekDayEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
            lv_end_4_0=ruleWeekDay();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWeekDaysIntervalRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_4_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.WeekDay");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWeekDaysIntervalAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWeekDaysInterval"


    // $ANTLR start "entryRuleMessageContent"
    // InternalJabuti.g:2773:1: entryRuleMessageContent returns [EObject current=null] : iv_ruleMessageContent= ruleMessageContent EOF ;
    public final EObject entryRuleMessageContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageContent = null;


        try {
            // InternalJabuti.g:2773:55: (iv_ruleMessageContent= ruleMessageContent EOF )
            // InternalJabuti.g:2774:2: iv_ruleMessageContent= ruleMessageContent EOF
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
    // InternalJabuti.g:2780:1: ruleMessageContent returns [EObject current=null] : (otherlv_0= 'MessageContent' otherlv_1= '(' ( ( (lv_content_2_0= RULE_STRING ) ) | ruleQualifiedName ) ( ( (lv_comparisonOperator_4_0= ruleComparisonOperator ) ) ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= 'per' ( (lv_timeUnit_7_0= ruleTimeUnit ) ) )? )? otherlv_8= ')' ) ;
    public final EObject ruleMessageContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_comparisonOperator_4_0 = null;

        EObject lv_expression_5_0 = null;

        Enumerator lv_timeUnit_7_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:2786:2: ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( ( (lv_content_2_0= RULE_STRING ) ) | ruleQualifiedName ) ( ( (lv_comparisonOperator_4_0= ruleComparisonOperator ) ) ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= 'per' ( (lv_timeUnit_7_0= ruleTimeUnit ) ) )? )? otherlv_8= ')' ) )
            // InternalJabuti.g:2787:2: (otherlv_0= 'MessageContent' otherlv_1= '(' ( ( (lv_content_2_0= RULE_STRING ) ) | ruleQualifiedName ) ( ( (lv_comparisonOperator_4_0= ruleComparisonOperator ) ) ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= 'per' ( (lv_timeUnit_7_0= ruleTimeUnit ) ) )? )? otherlv_8= ')' )
            {
            // InternalJabuti.g:2787:2: (otherlv_0= 'MessageContent' otherlv_1= '(' ( ( (lv_content_2_0= RULE_STRING ) ) | ruleQualifiedName ) ( ( (lv_comparisonOperator_4_0= ruleComparisonOperator ) ) ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= 'per' ( (lv_timeUnit_7_0= ruleTimeUnit ) ) )? )? otherlv_8= ')' )
            // InternalJabuti.g:2788:3: otherlv_0= 'MessageContent' otherlv_1= '(' ( ( (lv_content_2_0= RULE_STRING ) ) | ruleQualifiedName ) ( ( (lv_comparisonOperator_4_0= ruleComparisonOperator ) ) ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= 'per' ( (lv_timeUnit_7_0= ruleTimeUnit ) ) )? )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageContentAccess().getMessageContentKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalJabuti.g:2796:3: ( ( (lv_content_2_0= RULE_STRING ) ) | ruleQualifiedName )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_ID) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalJabuti.g:2797:4: ( (lv_content_2_0= RULE_STRING ) )
                    {
                    // InternalJabuti.g:2797:4: ( (lv_content_2_0= RULE_STRING ) )
                    // InternalJabuti.g:2798:5: (lv_content_2_0= RULE_STRING )
                    {
                    // InternalJabuti.g:2798:5: (lv_content_2_0= RULE_STRING )
                    // InternalJabuti.g:2799:6: lv_content_2_0= RULE_STRING
                    {
                    lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_52); 

                    						newLeafNode(lv_content_2_0, grammarAccess.getMessageContentAccess().getContentSTRINGTerminalRuleCall_2_0_0());
                    					

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


                    }
                    break;
                case 2 :
                    // InternalJabuti.g:2816:4: ruleQualifiedName
                    {

                    				newCompositeNode(grammarAccess.getMessageContentAccess().getQualifiedNameParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_52);
                    ruleQualifiedName();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalJabuti.g:2824:3: ( ( (lv_comparisonOperator_4_0= ruleComparisonOperator ) ) ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= 'per' ( (lv_timeUnit_7_0= ruleTimeUnit ) ) )? )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=40 && LA36_0<=45)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalJabuti.g:2825:4: ( (lv_comparisonOperator_4_0= ruleComparisonOperator ) ) ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= 'per' ( (lv_timeUnit_7_0= ruleTimeUnit ) ) )?
                    {
                    // InternalJabuti.g:2825:4: ( (lv_comparisonOperator_4_0= ruleComparisonOperator ) )
                    // InternalJabuti.g:2826:5: (lv_comparisonOperator_4_0= ruleComparisonOperator )
                    {
                    // InternalJabuti.g:2826:5: (lv_comparisonOperator_4_0= ruleComparisonOperator )
                    // InternalJabuti.g:2827:6: lv_comparisonOperator_4_0= ruleComparisonOperator
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getComparisonOperatorComparisonOperatorParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_comparisonOperator_4_0=ruleComparisonOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageContentRule());
                    						}
                    						set(
                    							current,
                    							"comparisonOperator",
                    							lv_comparisonOperator_4_0,
                    							"br.edu.unijui.gca.jabuti.Jabuti.ComparisonOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJabuti.g:2844:4: ( (lv_expression_5_0= ruleExpression ) )
                    // InternalJabuti.g:2845:5: (lv_expression_5_0= ruleExpression )
                    {
                    // InternalJabuti.g:2845:5: (lv_expression_5_0= ruleExpression )
                    // InternalJabuti.g:2846:6: lv_expression_5_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getExpressionExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_expression_5_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageContentRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_5_0,
                    							"br.edu.unijui.gca.jabuti.Jabuti.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJabuti.g:2863:4: (otherlv_6= 'per' ( (lv_timeUnit_7_0= ruleTimeUnit ) ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==59) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalJabuti.g:2864:5: otherlv_6= 'per' ( (lv_timeUnit_7_0= ruleTimeUnit ) )
                            {
                            otherlv_6=(Token)match(input,59,FOLLOW_47); 

                            					newLeafNode(otherlv_6, grammarAccess.getMessageContentAccess().getPerKeyword_3_2_0());
                            				
                            // InternalJabuti.g:2868:5: ( (lv_timeUnit_7_0= ruleTimeUnit ) )
                            // InternalJabuti.g:2869:6: (lv_timeUnit_7_0= ruleTimeUnit )
                            {
                            // InternalJabuti.g:2869:6: (lv_timeUnit_7_0= ruleTimeUnit )
                            // InternalJabuti.g:2870:7: lv_timeUnit_7_0= ruleTimeUnit
                            {

                            							newCompositeNode(grammarAccess.getMessageContentAccess().getTimeUnitTimeUnitEnumRuleCall_3_2_1_0());
                            						
                            pushFollow(FOLLOW_28);
                            lv_timeUnit_7_0=ruleTimeUnit();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMessageContentRule());
                            							}
                            							set(
                            								current,
                            								"timeUnit",
                            								lv_timeUnit_7_0,
                            								"br.edu.unijui.gca.jabuti.Jabuti.TimeUnit");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMessageContentAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleComparisonOperator"
    // InternalJabuti.g:2897:1: entryRuleComparisonOperator returns [EObject current=null] : iv_ruleComparisonOperator= ruleComparisonOperator EOF ;
    public final EObject entryRuleComparisonOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperator = null;


        try {
            // InternalJabuti.g:2897:59: (iv_ruleComparisonOperator= ruleComparisonOperator EOF )
            // InternalJabuti.g:2898:2: iv_ruleComparisonOperator= ruleComparisonOperator EOF
            {
             newCompositeNode(grammarAccess.getComparisonOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisonOperator=ruleComparisonOperator();

            state._fsp--;

             current =iv_ruleComparisonOperator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonOperator"


    // $ANTLR start "ruleComparisonOperator"
    // InternalJabuti.g:2904:1: ruleComparisonOperator returns [EObject current=null] : ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) ) ;
    public final EObject ruleComparisonOperator() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token lv_symbol_1_0=null;
        Token lv_symbol_2_0=null;
        Token lv_symbol_3_0=null;
        Token lv_symbol_4_0=null;
        Token lv_symbol_5_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:2910:2: ( ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) ) )
            // InternalJabuti.g:2911:2: ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) )
            {
            // InternalJabuti.g:2911:2: ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) )
            int alt37=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt37=1;
                }
                break;
            case 41:
                {
                alt37=2;
                }
                break;
            case 42:
                {
                alt37=3;
                }
                break;
            case 43:
                {
                alt37=4;
                }
                break;
            case 44:
                {
                alt37=5;
                }
                break;
            case 45:
                {
                alt37=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalJabuti.g:2912:3: ( (lv_symbol_0_0= '<=' ) )
                    {
                    // InternalJabuti.g:2912:3: ( (lv_symbol_0_0= '<=' ) )
                    // InternalJabuti.g:2913:4: (lv_symbol_0_0= '<=' )
                    {
                    // InternalJabuti.g:2913:4: (lv_symbol_0_0= '<=' )
                    // InternalJabuti.g:2914:5: lv_symbol_0_0= '<='
                    {
                    lv_symbol_0_0=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_0, grammarAccess.getComparisonOperatorAccess().getSymbolLessThanSignEqualsSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComparisonOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_0, "<=");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJabuti.g:2927:3: ( (lv_symbol_1_0= '>=' ) )
                    {
                    // InternalJabuti.g:2927:3: ( (lv_symbol_1_0= '>=' ) )
                    // InternalJabuti.g:2928:4: (lv_symbol_1_0= '>=' )
                    {
                    // InternalJabuti.g:2928:4: (lv_symbol_1_0= '>=' )
                    // InternalJabuti.g:2929:5: lv_symbol_1_0= '>='
                    {
                    lv_symbol_1_0=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_symbol_1_0, grammarAccess.getComparisonOperatorAccess().getSymbolGreaterThanSignEqualsSignKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComparisonOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_1_0, ">=");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJabuti.g:2942:3: ( (lv_symbol_2_0= '>' ) )
                    {
                    // InternalJabuti.g:2942:3: ( (lv_symbol_2_0= '>' ) )
                    // InternalJabuti.g:2943:4: (lv_symbol_2_0= '>' )
                    {
                    // InternalJabuti.g:2943:4: (lv_symbol_2_0= '>' )
                    // InternalJabuti.g:2944:5: lv_symbol_2_0= '>'
                    {
                    lv_symbol_2_0=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(lv_symbol_2_0, grammarAccess.getComparisonOperatorAccess().getSymbolGreaterThanSignKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComparisonOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_2_0, ">");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalJabuti.g:2957:3: ( (lv_symbol_3_0= '<' ) )
                    {
                    // InternalJabuti.g:2957:3: ( (lv_symbol_3_0= '<' ) )
                    // InternalJabuti.g:2958:4: (lv_symbol_3_0= '<' )
                    {
                    // InternalJabuti.g:2958:4: (lv_symbol_3_0= '<' )
                    // InternalJabuti.g:2959:5: lv_symbol_3_0= '<'
                    {
                    lv_symbol_3_0=(Token)match(input,43,FOLLOW_2); 

                    					newLeafNode(lv_symbol_3_0, grammarAccess.getComparisonOperatorAccess().getSymbolLessThanSignKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComparisonOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_3_0, "<");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalJabuti.g:2972:3: ( (lv_symbol_4_0= '!=' ) )
                    {
                    // InternalJabuti.g:2972:3: ( (lv_symbol_4_0= '!=' ) )
                    // InternalJabuti.g:2973:4: (lv_symbol_4_0= '!=' )
                    {
                    // InternalJabuti.g:2973:4: (lv_symbol_4_0= '!=' )
                    // InternalJabuti.g:2974:5: lv_symbol_4_0= '!='
                    {
                    lv_symbol_4_0=(Token)match(input,44,FOLLOW_2); 

                    					newLeafNode(lv_symbol_4_0, grammarAccess.getComparisonOperatorAccess().getSymbolExclamationMarkEqualsSignKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComparisonOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_4_0, "!=");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalJabuti.g:2987:3: ( (lv_symbol_5_0= '==' ) )
                    {
                    // InternalJabuti.g:2987:3: ( (lv_symbol_5_0= '==' ) )
                    // InternalJabuti.g:2988:4: (lv_symbol_5_0= '==' )
                    {
                    // InternalJabuti.g:2988:4: (lv_symbol_5_0= '==' )
                    // InternalJabuti.g:2989:5: lv_symbol_5_0= '=='
                    {
                    lv_symbol_5_0=(Token)match(input,45,FOLLOW_2); 

                    					newLeafNode(lv_symbol_5_0, grammarAccess.getComparisonOperatorAccess().getSymbolEqualsSignEqualsSignKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComparisonOperatorRule());
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
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalJabuti.g:3005:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalJabuti.g:3005:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalJabuti.g:3006:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalJabuti.g:3012:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalJabuti.g:3018:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalJabuti.g:3019:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalJabuti.g:3019:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalJabuti.g:3020:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_53); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalJabuti.g:3027:3: (kw= '.' this_ID_2= RULE_ID )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==64) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalJabuti.g:3028:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,64,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_53); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalJabuti.g:3045:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalJabuti.g:3045:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalJabuti.g:3046:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalJabuti.g:3052:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:3058:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.*' ) )
            // InternalJabuti.g:3059:2: (this_QualifiedName_0= ruleQualifiedName kw= '.*' )
            {
            // InternalJabuti.g:3059:2: (this_QualifiedName_0= ruleQualifiedName kw= '.*' )
            // InternalJabuti.g:3060:3: this_QualifiedName_0= ruleQualifiedName kw= '.*'
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_54);
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


    // $ANTLR start "ruleRolePlayer"
    // InternalJabuti.g:3079:1: ruleRolePlayer returns [Enumerator current=null] : ( (enumLiteral_0= 'application' ) | (enumLiteral_1= 'process' ) ) ;
    public final Enumerator ruleRolePlayer() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJabuti.g:3085:2: ( ( (enumLiteral_0= 'application' ) | (enumLiteral_1= 'process' ) ) )
            // InternalJabuti.g:3086:2: ( (enumLiteral_0= 'application' ) | (enumLiteral_1= 'process' ) )
            {
            // InternalJabuti.g:3086:2: ( (enumLiteral_0= 'application' ) | (enumLiteral_1= 'process' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==28) ) {
                alt39=1;
            }
            else if ( (LA39_0==29) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalJabuti.g:3087:3: (enumLiteral_0= 'application' )
                    {
                    // InternalJabuti.g:3087:3: (enumLiteral_0= 'application' )
                    // InternalJabuti.g:3088:4: enumLiteral_0= 'application'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getRolePlayerAccess().getAPPLICATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRolePlayerAccess().getAPPLICATIONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJabuti.g:3095:3: (enumLiteral_1= 'process' )
                    {
                    // InternalJabuti.g:3095:3: (enumLiteral_1= 'process' )
                    // InternalJabuti.g:3096:4: enumLiteral_1= 'process'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

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


    // $ANTLR start "ruleOperation"
    // InternalJabuti.g:3106:1: ruleOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) ) ;
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
            // InternalJabuti.g:3112:2: ( ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) ) )
            // InternalJabuti.g:3113:2: ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) )
            {
            // InternalJabuti.g:3113:2: ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) )
            int alt40=6;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt40=1;
                }
                break;
            case 67:
                {
                alt40=2;
                }
                break;
            case 68:
                {
                alt40=3;
                }
                break;
            case 69:
                {
                alt40=4;
                }
                break;
            case 70:
                {
                alt40=5;
                }
                break;
            case 71:
                {
                alt40=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalJabuti.g:3114:3: (enumLiteral_0= 'push' )
                    {
                    // InternalJabuti.g:3114:3: (enumLiteral_0= 'push' )
                    // InternalJabuti.g:3115:4: enumLiteral_0= 'push'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getPUSHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationAccess().getPUSHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJabuti.g:3122:3: (enumLiteral_1= 'poll' )
                    {
                    // InternalJabuti.g:3122:3: (enumLiteral_1= 'poll' )
                    // InternalJabuti.g:3123:4: enumLiteral_1= 'poll'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getPOLLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationAccess().getPOLLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJabuti.g:3130:3: (enumLiteral_2= 'write' )
                    {
                    // InternalJabuti.g:3130:3: (enumLiteral_2= 'write' )
                    // InternalJabuti.g:3131:4: enumLiteral_2= 'write'
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getWRITEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperationAccess().getWRITEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJabuti.g:3138:3: (enumLiteral_3= 'read' )
                    {
                    // InternalJabuti.g:3138:3: (enumLiteral_3= 'read' )
                    // InternalJabuti.g:3139:4: enumLiteral_3= 'read'
                    {
                    enumLiteral_3=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getREADEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperationAccess().getREADEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJabuti.g:3146:3: (enumLiteral_4= 'request' )
                    {
                    // InternalJabuti.g:3146:3: (enumLiteral_4= 'request' )
                    // InternalJabuti.g:3147:4: enumLiteral_4= 'request'
                    {
                    enumLiteral_4=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getREQUESTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperationAccess().getREQUESTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJabuti.g:3154:3: (enumLiteral_5= 'response' )
                    {
                    // InternalJabuti.g:3154:3: (enumLiteral_5= 'response' )
                    // InternalJabuti.g:3155:4: enumLiteral_5= 'response'
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
    // InternalJabuti.g:3165:1: ruleWeekDay returns [Enumerator current=null] : ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) ) ;
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
            // InternalJabuti.g:3171:2: ( ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) ) )
            // InternalJabuti.g:3172:2: ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) )
            {
            // InternalJabuti.g:3172:2: ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) )
            int alt41=7;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt41=1;
                }
                break;
            case 73:
                {
                alt41=2;
                }
                break;
            case 74:
                {
                alt41=3;
                }
                break;
            case 75:
                {
                alt41=4;
                }
                break;
            case 76:
                {
                alt41=5;
                }
                break;
            case 77:
                {
                alt41=6;
                }
                break;
            case 78:
                {
                alt41=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalJabuti.g:3173:3: (enumLiteral_0= 'Sunday' )
                    {
                    // InternalJabuti.g:3173:3: (enumLiteral_0= 'Sunday' )
                    // InternalJabuti.g:3174:4: enumLiteral_0= 'Sunday'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getSUNDAYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWeekDayAccess().getSUNDAYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJabuti.g:3181:3: (enumLiteral_1= 'Monday' )
                    {
                    // InternalJabuti.g:3181:3: (enumLiteral_1= 'Monday' )
                    // InternalJabuti.g:3182:4: enumLiteral_1= 'Monday'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getMONDAYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWeekDayAccess().getMONDAYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJabuti.g:3189:3: (enumLiteral_2= 'Tuesday' )
                    {
                    // InternalJabuti.g:3189:3: (enumLiteral_2= 'Tuesday' )
                    // InternalJabuti.g:3190:4: enumLiteral_2= 'Tuesday'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTUESDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWeekDayAccess().getTUESDAYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJabuti.g:3197:3: (enumLiteral_3= 'Wednesday' )
                    {
                    // InternalJabuti.g:3197:3: (enumLiteral_3= 'Wednesday' )
                    // InternalJabuti.g:3198:4: enumLiteral_3= 'Wednesday'
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getWEDNESDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWeekDayAccess().getWEDNESDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJabuti.g:3205:3: (enumLiteral_4= 'Thursday' )
                    {
                    // InternalJabuti.g:3205:3: (enumLiteral_4= 'Thursday' )
                    // InternalJabuti.g:3206:4: enumLiteral_4= 'Thursday'
                    {
                    enumLiteral_4=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTHURSDAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWeekDayAccess().getTHURSDAYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJabuti.g:3213:3: (enumLiteral_5= 'Friday' )
                    {
                    // InternalJabuti.g:3213:3: (enumLiteral_5= 'Friday' )
                    // InternalJabuti.g:3214:4: enumLiteral_5= 'Friday'
                    {
                    enumLiteral_5=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getFRIDAYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWeekDayAccess().getFRIDAYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJabuti.g:3221:3: (enumLiteral_6= 'Saturday' )
                    {
                    // InternalJabuti.g:3221:3: (enumLiteral_6= 'Saturday' )
                    // InternalJabuti.g:3222:4: enumLiteral_6= 'Saturday'
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
    // InternalJabuti.g:3232:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) ) ;
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
            // InternalJabuti.g:3238:2: ( ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) ) )
            // InternalJabuti.g:3239:2: ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) )
            {
            // InternalJabuti.g:3239:2: ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) )
            int alt42=7;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt42=1;
                }
                break;
            case 80:
                {
                alt42=2;
                }
                break;
            case 81:
                {
                alt42=3;
                }
                break;
            case 82:
                {
                alt42=4;
                }
                break;
            case 83:
                {
                alt42=5;
                }
                break;
            case 84:
                {
                alt42=6;
                }
                break;
            case 85:
                {
                alt42=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalJabuti.g:3240:3: (enumLiteral_0= 'Second' )
                    {
                    // InternalJabuti.g:3240:3: (enumLiteral_0= 'Second' )
                    // InternalJabuti.g:3241:4: enumLiteral_0= 'Second'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getSECONDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSECONDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJabuti.g:3248:3: (enumLiteral_1= 'Minute' )
                    {
                    // InternalJabuti.g:3248:3: (enumLiteral_1= 'Minute' )
                    // InternalJabuti.g:3249:4: enumLiteral_1= 'Minute'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJabuti.g:3256:3: (enumLiteral_2= 'Hour' )
                    {
                    // InternalJabuti.g:3256:3: (enumLiteral_2= 'Hour' )
                    // InternalJabuti.g:3257:4: enumLiteral_2= 'Hour'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJabuti.g:3264:3: (enumLiteral_3= 'Day' )
                    {
                    // InternalJabuti.g:3264:3: (enumLiteral_3= 'Day' )
                    // InternalJabuti.g:3265:4: enumLiteral_3= 'Day'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJabuti.g:3272:3: (enumLiteral_4= 'Week' )
                    {
                    // InternalJabuti.g:3272:3: (enumLiteral_4= 'Week' )
                    // InternalJabuti.g:3273:4: enumLiteral_4= 'Week'
                    {
                    enumLiteral_4=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJabuti.g:3280:3: (enumLiteral_5= 'Month' )
                    {
                    // InternalJabuti.g:3280:3: (enumLiteral_5= 'Month' )
                    // InternalJabuti.g:3281:4: enumLiteral_5= 'Month'
                    {
                    enumLiteral_5=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMONTHEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTimeUnitAccess().getMONTHEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJabuti.g:3288:3: (enumLiteral_6= 'Year' )
                    {
                    // InternalJabuti.g:3288:3: (enumLiteral_6= 'Year' )
                    // InternalJabuti.g:3289:4: enumLiteral_6= 'Year'
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

    // Delegated rules


    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\3\uffff\1\6\3\uffff\1\6";
    static final String dfa_3s = "\1\4\2\uffff\2\4\2\uffff\1\4";
    static final String dfa_4s = "\1\6\2\uffff\1\100\1\4\2\uffff\1\100";
    static final String dfa_5s = "\1\uffff\1\1\1\2\2\uffff\1\4\1\3\1\uffff";
    static final String dfa_6s = "\10\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\2\1\1",
            "",
            "",
            "\1\6\15\uffff\1\6\14\uffff\1\5\1\uffff\1\6\1\uffff\4\6\1\uffff\15\6\6\uffff\1\6\4\uffff\1\4",
            "\1\7",
            "",
            "",
            "\1\6\15\uffff\1\6\14\uffff\1\5\1\uffff\1\6\1\uffff\4\6\1\uffff\15\6\6\uffff\1\6\4\uffff\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1527:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue | this_FunctionCall_3= ruleFunctionCall )";
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
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000E040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0xF5B0004080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000440040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002008080000070L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000080000070L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000FF0000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000070L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010000200000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xF502008080000070L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0xF5B0004080000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xF580000080000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0090004000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0010004000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0xF500000080000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x00000000003F8000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0800000200000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0xF500000080000030L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007F00L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00003F0200000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});

}