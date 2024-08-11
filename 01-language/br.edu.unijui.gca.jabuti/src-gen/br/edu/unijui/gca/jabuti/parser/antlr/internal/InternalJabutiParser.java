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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'contract'", "'{'", "'dates'", "'beginDate'", "'='", "'dueDate'", "'}'", "'parties'", "'variables'", "'clauses'", "'rolePlayer'", "'operation'", "'terms'", "'right'", "'obligation'", "'prohibition'", "'application'", "'process'", "'onSuccess'", "'('", "'log('", "')'", "'onBreach'", "'AND'", "'OR'", "'!'", "'<='", "'>='", "'>'", "'<'", "'!='", "'=='", "'+'", "'-'", "'*'", "'/'", "','", "'NOT'", "'when'", "'check'", "'TimeInterval'", "'to'", "'SessionInterval'", "'per'", "'Timeout'", "'MaxNumberOfOperation'", "'WeekDaysInterval'", "'MessageContent'", "'.'", "'.*'", "'push'", "'poll'", "'write'", "'read'", "'request'", "'response'", "'Sunday'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Second'", "'Minute'", "'Hour'", "'Day'", "'Week'", "'Month'", "'Year'", "'text'", "'numeric'", "'boolean'"
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
    // InternalJabuti.g:398:1: ruleClause returns [EObject current=null] : ( (this_Right_0= ruleRight | this_Prohibition_1= ruleProhibition | this_Obligation_2= ruleObligation ) otherlv_3= '{' otherlv_4= 'rolePlayer' otherlv_5= '=' ( (lv_rolePlayer_6_0= ruleRolePlayer ) ) otherlv_7= 'operation' otherlv_8= '=' ( (lv_operation_9_0= ruleOperation ) ) otherlv_10= 'terms' otherlv_11= '{' ( (lv_terms_12_0= ruleExpressionTerm ) ) otherlv_13= '}' ( (lv_onSuccess_14_0= ruleOnSuccess ) )? ( (lv_onBreach_15_0= ruleOnBreach ) )? otherlv_16= '}' ) ;
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
        Token otherlv_16=null;
        EObject this_Right_0 = null;

        EObject this_Prohibition_1 = null;

        EObject this_Obligation_2 = null;

        Enumerator lv_rolePlayer_6_0 = null;

        Enumerator lv_operation_9_0 = null;

        EObject lv_terms_12_0 = null;

        EObject lv_onSuccess_14_0 = null;

        EObject lv_onBreach_15_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:404:2: ( ( (this_Right_0= ruleRight | this_Prohibition_1= ruleProhibition | this_Obligation_2= ruleObligation ) otherlv_3= '{' otherlv_4= 'rolePlayer' otherlv_5= '=' ( (lv_rolePlayer_6_0= ruleRolePlayer ) ) otherlv_7= 'operation' otherlv_8= '=' ( (lv_operation_9_0= ruleOperation ) ) otherlv_10= 'terms' otherlv_11= '{' ( (lv_terms_12_0= ruleExpressionTerm ) ) otherlv_13= '}' ( (lv_onSuccess_14_0= ruleOnSuccess ) )? ( (lv_onBreach_15_0= ruleOnBreach ) )? otherlv_16= '}' ) )
            // InternalJabuti.g:405:2: ( (this_Right_0= ruleRight | this_Prohibition_1= ruleProhibition | this_Obligation_2= ruleObligation ) otherlv_3= '{' otherlv_4= 'rolePlayer' otherlv_5= '=' ( (lv_rolePlayer_6_0= ruleRolePlayer ) ) otherlv_7= 'operation' otherlv_8= '=' ( (lv_operation_9_0= ruleOperation ) ) otherlv_10= 'terms' otherlv_11= '{' ( (lv_terms_12_0= ruleExpressionTerm ) ) otherlv_13= '}' ( (lv_onSuccess_14_0= ruleOnSuccess ) )? ( (lv_onBreach_15_0= ruleOnBreach ) )? otherlv_16= '}' )
            {
            // InternalJabuti.g:405:2: ( (this_Right_0= ruleRight | this_Prohibition_1= ruleProhibition | this_Obligation_2= ruleObligation ) otherlv_3= '{' otherlv_4= 'rolePlayer' otherlv_5= '=' ( (lv_rolePlayer_6_0= ruleRolePlayer ) ) otherlv_7= 'operation' otherlv_8= '=' ( (lv_operation_9_0= ruleOperation ) ) otherlv_10= 'terms' otherlv_11= '{' ( (lv_terms_12_0= ruleExpressionTerm ) ) otherlv_13= '}' ( (lv_onSuccess_14_0= ruleOnSuccess ) )? ( (lv_onBreach_15_0= ruleOnBreach ) )? otherlv_16= '}' )
            // InternalJabuti.g:406:3: (this_Right_0= ruleRight | this_Prohibition_1= ruleProhibition | this_Obligation_2= ruleObligation ) otherlv_3= '{' otherlv_4= 'rolePlayer' otherlv_5= '=' ( (lv_rolePlayer_6_0= ruleRolePlayer ) ) otherlv_7= 'operation' otherlv_8= '=' ( (lv_operation_9_0= ruleOperation ) ) otherlv_10= 'terms' otherlv_11= '{' ( (lv_terms_12_0= ruleExpressionTerm ) ) otherlv_13= '}' ( (lv_onSuccess_14_0= ruleOnSuccess ) )? ( (lv_onBreach_15_0= ruleOnBreach ) )? otherlv_16= '}'
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
            		
            // InternalJabuti.g:446:3: ( (lv_rolePlayer_6_0= ruleRolePlayer ) )
            // InternalJabuti.g:447:4: (lv_rolePlayer_6_0= ruleRolePlayer )
            {
            // InternalJabuti.g:447:4: (lv_rolePlayer_6_0= ruleRolePlayer )
            // InternalJabuti.g:448:5: lv_rolePlayer_6_0= ruleRolePlayer
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getRolePlayerRolePlayerEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_rolePlayer_6_0=ruleRolePlayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseRule());
            					}
            					set(
            						current,
            						"rolePlayer",
            						lv_rolePlayer_6_0,
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
            		
            // InternalJabuti.g:500:3: ( (lv_terms_12_0= ruleExpressionTerm ) )
            // InternalJabuti.g:501:4: (lv_terms_12_0= ruleExpressionTerm )
            {
            // InternalJabuti.g:501:4: (lv_terms_12_0= ruleExpressionTerm )
            // InternalJabuti.g:502:5: lv_terms_12_0= ruleExpressionTerm
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getTermsExpressionTermParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_terms_12_0=ruleExpressionTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseRule());
            					}
            					set(
            						current,
            						"terms",
            						lv_terms_12_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.ExpressionTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,18,FOLLOW_25); 

            			newLeafNode(otherlv_13, grammarAccess.getClauseAccess().getRightCurlyBracketKeyword_11());
            		
            // InternalJabuti.g:523:3: ( (lv_onSuccess_14_0= ruleOnSuccess ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJabuti.g:524:4: (lv_onSuccess_14_0= ruleOnSuccess )
                    {
                    // InternalJabuti.g:524:4: (lv_onSuccess_14_0= ruleOnSuccess )
                    // InternalJabuti.g:525:5: lv_onSuccess_14_0= ruleOnSuccess
                    {

                    					newCompositeNode(grammarAccess.getClauseAccess().getOnSuccessOnSuccessParserRuleCall_12_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_onSuccess_14_0=ruleOnSuccess();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClauseRule());
                    					}
                    					set(
                    						current,
                    						"onSuccess",
                    						lv_onSuccess_14_0,
                    						"br.edu.unijui.gca.jabuti.Jabuti.OnSuccess");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalJabuti.g:542:3: ( (lv_onBreach_15_0= ruleOnBreach ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==34) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJabuti.g:543:4: (lv_onBreach_15_0= ruleOnBreach )
                    {
                    // InternalJabuti.g:543:4: (lv_onBreach_15_0= ruleOnBreach )
                    // InternalJabuti.g:544:5: lv_onBreach_15_0= ruleOnBreach
                    {

                    					newCompositeNode(grammarAccess.getClauseAccess().getOnBreachOnBreachParserRuleCall_13_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_onBreach_15_0=ruleOnBreach();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClauseRule());
                    					}
                    					set(
                    						current,
                    						"onBreach",
                    						lv_onBreach_15_0,
                    						"br.edu.unijui.gca.jabuti.Jabuti.OnBreach");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getClauseAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

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
    // InternalJabuti.g:569:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // InternalJabuti.g:569:46: (iv_ruleRight= ruleRight EOF )
            // InternalJabuti.g:570:2: iv_ruleRight= ruleRight EOF
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
    // InternalJabuti.g:576:1: ruleRight returns [EObject current=null] : (otherlv_0= 'right' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:582:2: ( (otherlv_0= 'right' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalJabuti.g:583:2: (otherlv_0= 'right' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalJabuti.g:583:2: (otherlv_0= 'right' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalJabuti.g:584:3: otherlv_0= 'right' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRightAccess().getRightKeyword_0());
            		
            // InternalJabuti.g:588:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJabuti.g:589:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJabuti.g:589:4: (lv_name_1_0= RULE_ID )
            // InternalJabuti.g:590:5: lv_name_1_0= RULE_ID
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
    // InternalJabuti.g:610:1: entryRuleObligation returns [EObject current=null] : iv_ruleObligation= ruleObligation EOF ;
    public final EObject entryRuleObligation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObligation = null;


        try {
            // InternalJabuti.g:610:51: (iv_ruleObligation= ruleObligation EOF )
            // InternalJabuti.g:611:2: iv_ruleObligation= ruleObligation EOF
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
    // InternalJabuti.g:617:1: ruleObligation returns [EObject current=null] : (otherlv_0= 'obligation' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleObligation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:623:2: ( (otherlv_0= 'obligation' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalJabuti.g:624:2: (otherlv_0= 'obligation' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalJabuti.g:624:2: (otherlv_0= 'obligation' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalJabuti.g:625:3: otherlv_0= 'obligation' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObligationAccess().getObligationKeyword_0());
            		
            // InternalJabuti.g:629:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJabuti.g:630:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJabuti.g:630:4: (lv_name_1_0= RULE_ID )
            // InternalJabuti.g:631:5: lv_name_1_0= RULE_ID
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
    // InternalJabuti.g:651:1: entryRuleProhibition returns [EObject current=null] : iv_ruleProhibition= ruleProhibition EOF ;
    public final EObject entryRuleProhibition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProhibition = null;


        try {
            // InternalJabuti.g:651:52: (iv_ruleProhibition= ruleProhibition EOF )
            // InternalJabuti.g:652:2: iv_ruleProhibition= ruleProhibition EOF
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
    // InternalJabuti.g:658:1: ruleProhibition returns [EObject current=null] : (otherlv_0= 'prohibition' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleProhibition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:664:2: ( (otherlv_0= 'prohibition' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalJabuti.g:665:2: (otherlv_0= 'prohibition' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalJabuti.g:665:2: (otherlv_0= 'prohibition' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalJabuti.g:666:3: otherlv_0= 'prohibition' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProhibitionAccess().getProhibitionKeyword_0());
            		
            // InternalJabuti.g:670:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJabuti.g:671:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJabuti.g:671:4: (lv_name_1_0= RULE_ID )
            // InternalJabuti.g:672:5: lv_name_1_0= RULE_ID
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
    // InternalJabuti.g:692:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalJabuti.g:692:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalJabuti.g:693:2: iv_ruleApplication= ruleApplication EOF
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
    // InternalJabuti.g:699:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'application' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:705:2: ( (otherlv_0= 'application' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalJabuti.g:706:2: (otherlv_0= 'application' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalJabuti.g:706:2: (otherlv_0= 'application' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalJabuti.g:707:3: otherlv_0= 'application' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationAccess().getEqualsSignKeyword_1());
            		
            // InternalJabuti.g:715:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalJabuti.g:716:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalJabuti.g:716:4: (lv_name_2_0= RULE_STRING )
            // InternalJabuti.g:717:5: lv_name_2_0= RULE_STRING
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
    // InternalJabuti.g:737:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalJabuti.g:737:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalJabuti.g:738:2: iv_ruleProcess= ruleProcess EOF
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
    // InternalJabuti.g:744:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:750:2: ( (otherlv_0= 'process' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalJabuti.g:751:2: (otherlv_0= 'process' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalJabuti.g:751:2: (otherlv_0= 'process' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalJabuti.g:752:3: otherlv_0= 'process' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getEqualsSignKeyword_1());
            		
            // InternalJabuti.g:760:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalJabuti.g:761:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalJabuti.g:761:4: (lv_name_2_0= RULE_STRING )
            // InternalJabuti.g:762:5: lv_name_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleOnSuccess"
    // InternalJabuti.g:782:1: entryRuleOnSuccess returns [EObject current=null] : iv_ruleOnSuccess= ruleOnSuccess EOF ;
    public final EObject entryRuleOnSuccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnSuccess = null;


        try {
            // InternalJabuti.g:782:50: (iv_ruleOnSuccess= ruleOnSuccess EOF )
            // InternalJabuti.g:783:2: iv_ruleOnSuccess= ruleOnSuccess EOF
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
    // InternalJabuti.g:789:1: ruleOnSuccess returns [EObject current=null] : (otherlv_0= 'onSuccess' otherlv_1= '(' otherlv_2= 'log(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= ')' ) ;
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
            // InternalJabuti.g:795:2: ( (otherlv_0= 'onSuccess' otherlv_1= '(' otherlv_2= 'log(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= ')' ) )
            // InternalJabuti.g:796:2: (otherlv_0= 'onSuccess' otherlv_1= '(' otherlv_2= 'log(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= ')' )
            {
            // InternalJabuti.g:796:2: (otherlv_0= 'onSuccess' otherlv_1= '(' otherlv_2= 'log(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= ')' )
            // InternalJabuti.g:797:3: otherlv_0= 'onSuccess' otherlv_1= '(' otherlv_2= 'log(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getOnSuccessAccess().getOnSuccessKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getOnSuccessAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getOnSuccessAccess().getLogKeyword_2());
            		
            // InternalJabuti.g:809:3: ( (lv_message_3_0= RULE_STRING ) )
            // InternalJabuti.g:810:4: (lv_message_3_0= RULE_STRING )
            {
            // InternalJabuti.g:810:4: (lv_message_3_0= RULE_STRING )
            // InternalJabuti.g:811:5: lv_message_3_0= RULE_STRING
            {
            lv_message_3_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            otherlv_4=(Token)match(input,33,FOLLOW_29); 

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
    // InternalJabuti.g:839:1: entryRuleOnBreach returns [EObject current=null] : iv_ruleOnBreach= ruleOnBreach EOF ;
    public final EObject entryRuleOnBreach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnBreach = null;


        try {
            // InternalJabuti.g:839:49: (iv_ruleOnBreach= ruleOnBreach EOF )
            // InternalJabuti.g:840:2: iv_ruleOnBreach= ruleOnBreach EOF
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
    // InternalJabuti.g:846:1: ruleOnBreach returns [EObject current=null] : (otherlv_0= 'onBreach' otherlv_1= '(' otherlv_2= 'log(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= ')' ) ;
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
            // InternalJabuti.g:852:2: ( (otherlv_0= 'onBreach' otherlv_1= '(' otherlv_2= 'log(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= ')' ) )
            // InternalJabuti.g:853:2: (otherlv_0= 'onBreach' otherlv_1= '(' otherlv_2= 'log(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= ')' )
            {
            // InternalJabuti.g:853:2: (otherlv_0= 'onBreach' otherlv_1= '(' otherlv_2= 'log(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= ')' )
            // InternalJabuti.g:854:3: otherlv_0= 'onBreach' otherlv_1= '(' otherlv_2= 'log(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getOnBreachAccess().getOnBreachKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getOnBreachAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getOnBreachAccess().getLogKeyword_2());
            		
            // InternalJabuti.g:866:3: ( (lv_message_3_0= RULE_STRING ) )
            // InternalJabuti.g:867:4: (lv_message_3_0= RULE_STRING )
            {
            // InternalJabuti.g:867:4: (lv_message_3_0= RULE_STRING )
            // InternalJabuti.g:868:5: lv_message_3_0= RULE_STRING
            {
            lv_message_3_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            otherlv_4=(Token)match(input,33,FOLLOW_29); 

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
    // InternalJabuti.g:896:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalJabuti.g:896:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalJabuti.g:897:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalJabuti.g:903:1: ruleExpression returns [EObject current=null] : (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        Token lv_symbol_3_0=null;
        EObject this_Negation_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:909:2: ( (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* ) )
            // InternalJabuti.g:910:2: (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* )
            {
            // InternalJabuti.g:910:2: (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* )
            // InternalJabuti.g:911:3: this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getNegationParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Negation_0=ruleNegation();

            state._fsp--;


            			current = this_Negation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJabuti.g:919:3: ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=35 && LA9_0<=36)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalJabuti.g:920:4: () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegation ) )
            	    {
            	    // InternalJabuti.g:920:4: ()
            	    // InternalJabuti.g:921:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalJabuti.g:927:4: ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= 'OR' ) ) )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==35) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==36) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalJabuti.g:928:5: ( (lv_symbol_2_0= 'AND' ) )
            	            {
            	            // InternalJabuti.g:928:5: ( (lv_symbol_2_0= 'AND' ) )
            	            // InternalJabuti.g:929:6: (lv_symbol_2_0= 'AND' )
            	            {
            	            // InternalJabuti.g:929:6: (lv_symbol_2_0= 'AND' )
            	            // InternalJabuti.g:930:7: lv_symbol_2_0= 'AND'
            	            {
            	            lv_symbol_2_0=(Token)match(input,35,FOLLOW_31); 

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
            	            // InternalJabuti.g:943:5: ( (lv_symbol_3_0= 'OR' ) )
            	            {
            	            // InternalJabuti.g:943:5: ( (lv_symbol_3_0= 'OR' ) )
            	            // InternalJabuti.g:944:6: (lv_symbol_3_0= 'OR' )
            	            {
            	            // InternalJabuti.g:944:6: (lv_symbol_3_0= 'OR' )
            	            // InternalJabuti.g:945:7: lv_symbol_3_0= 'OR'
            	            {
            	            lv_symbol_3_0=(Token)match(input,36,FOLLOW_31); 

            	            							newLeafNode(lv_symbol_3_0, grammarAccess.getExpressionAccess().getSymbolORKeyword_1_1_1_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_3_0, "OR");
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalJabuti.g:958:4: ( (lv_right_4_0= ruleNegation ) )
            	    // InternalJabuti.g:959:5: (lv_right_4_0= ruleNegation )
            	    {
            	    // InternalJabuti.g:959:5: (lv_right_4_0= ruleNegation )
            	    // InternalJabuti.g:960:6: lv_right_4_0= ruleNegation
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightNegationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_right_4_0=ruleNegation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
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
    // InternalJabuti.g:982:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalJabuti.g:982:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalJabuti.g:983:2: iv_ruleNegation= ruleNegation EOF
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
    // InternalJabuti.g:989:1: ruleNegation returns [EObject current=null] : (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        EObject this_Comparison_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:995:2: ( (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) ) )
            // InternalJabuti.g:996:2: (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) )
            {
            // InternalJabuti.g:996:2: (this_Comparison_0= ruleComparison | ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||LA10_0==31||LA10_0==45) ) {
                alt10=1;
            }
            else if ( (LA10_0==37) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalJabuti.g:997:3: this_Comparison_0= ruleComparison
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
                    // InternalJabuti.g:1006:3: ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) )
                    {
                    // InternalJabuti.g:1006:3: ( () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) ) )
                    // InternalJabuti.g:1007:4: () ( (lv_symbol_2_0= '!' ) ) ( (lv_expression_3_0= ruleComparison ) )
                    {
                    // InternalJabuti.g:1007:4: ()
                    // InternalJabuti.g:1008:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegationAccess().getUnaryOperatorAction_1_0(),
                    						current);
                    				

                    }

                    // InternalJabuti.g:1014:4: ( (lv_symbol_2_0= '!' ) )
                    // InternalJabuti.g:1015:5: (lv_symbol_2_0= '!' )
                    {
                    // InternalJabuti.g:1015:5: (lv_symbol_2_0= '!' )
                    // InternalJabuti.g:1016:6: lv_symbol_2_0= '!'
                    {
                    lv_symbol_2_0=(Token)match(input,37,FOLLOW_32); 

                    						newLeafNode(lv_symbol_2_0, grammarAccess.getNegationAccess().getSymbolExclamationMarkKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNegationRule());
                    						}
                    						setWithLastConsumed(current, "symbol", lv_symbol_2_0, "!");
                    					

                    }


                    }

                    // InternalJabuti.g:1028:4: ( (lv_expression_3_0= ruleComparison ) )
                    // InternalJabuti.g:1029:5: (lv_expression_3_0= ruleComparison )
                    {
                    // InternalJabuti.g:1029:5: (lv_expression_3_0= ruleComparison )
                    // InternalJabuti.g:1030:6: lv_expression_3_0= ruleComparison
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
    // InternalJabuti.g:1052:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalJabuti.g:1052:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalJabuti.g:1053:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalJabuti.g:1059:1: ruleComparison returns [EObject current=null] : (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) ) ( (lv_right_8_0= rulePlus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        Token lv_symbol_3_0=null;
        Token lv_symbol_4_0=null;
        Token lv_symbol_5_0=null;
        Token lv_symbol_6_0=null;
        Token lv_symbol_7_0=null;
        EObject this_Plus_0 = null;

        EObject lv_right_8_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1065:2: ( (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) ) ( (lv_right_8_0= rulePlus ) ) )* ) )
            // InternalJabuti.g:1066:2: (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) ) ( (lv_right_8_0= rulePlus ) ) )* )
            {
            // InternalJabuti.g:1066:2: (this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) ) ( (lv_right_8_0= rulePlus ) ) )* )
            // InternalJabuti.g:1067:3: this_Plus_0= rulePlus ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) ) ( (lv_right_8_0= rulePlus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_Plus_0=rulePlus();

            state._fsp--;


            			current = this_Plus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJabuti.g:1075:3: ( () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) ) ( (lv_right_8_0= rulePlus ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=38 && LA12_0<=43)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalJabuti.g:1076:4: () ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) ) ( (lv_right_8_0= rulePlus ) )
            	    {
            	    // InternalJabuti.g:1076:4: ()
            	    // InternalJabuti.g:1077:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalJabuti.g:1083:4: ( ( (lv_symbol_2_0= '<=' ) ) | ( (lv_symbol_3_0= '>=' ) ) | ( (lv_symbol_4_0= '>' ) ) | ( (lv_symbol_5_0= '<' ) ) | ( (lv_symbol_6_0= '!=' ) ) | ( (lv_symbol_7_0= '==' ) ) )
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
            	    case 40:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt11=4;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt11=5;
            	        }
            	        break;
            	    case 43:
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
            	            // InternalJabuti.g:1084:5: ( (lv_symbol_2_0= '<=' ) )
            	            {
            	            // InternalJabuti.g:1084:5: ( (lv_symbol_2_0= '<=' ) )
            	            // InternalJabuti.g:1085:6: (lv_symbol_2_0= '<=' )
            	            {
            	            // InternalJabuti.g:1085:6: (lv_symbol_2_0= '<=' )
            	            // InternalJabuti.g:1086:7: lv_symbol_2_0= '<='
            	            {
            	            lv_symbol_2_0=(Token)match(input,38,FOLLOW_32); 

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
            	            // InternalJabuti.g:1099:5: ( (lv_symbol_3_0= '>=' ) )
            	            {
            	            // InternalJabuti.g:1099:5: ( (lv_symbol_3_0= '>=' ) )
            	            // InternalJabuti.g:1100:6: (lv_symbol_3_0= '>=' )
            	            {
            	            // InternalJabuti.g:1100:6: (lv_symbol_3_0= '>=' )
            	            // InternalJabuti.g:1101:7: lv_symbol_3_0= '>='
            	            {
            	            lv_symbol_3_0=(Token)match(input,39,FOLLOW_32); 

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
            	            // InternalJabuti.g:1114:5: ( (lv_symbol_4_0= '>' ) )
            	            {
            	            // InternalJabuti.g:1114:5: ( (lv_symbol_4_0= '>' ) )
            	            // InternalJabuti.g:1115:6: (lv_symbol_4_0= '>' )
            	            {
            	            // InternalJabuti.g:1115:6: (lv_symbol_4_0= '>' )
            	            // InternalJabuti.g:1116:7: lv_symbol_4_0= '>'
            	            {
            	            lv_symbol_4_0=(Token)match(input,40,FOLLOW_32); 

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
            	            // InternalJabuti.g:1129:5: ( (lv_symbol_5_0= '<' ) )
            	            {
            	            // InternalJabuti.g:1129:5: ( (lv_symbol_5_0= '<' ) )
            	            // InternalJabuti.g:1130:6: (lv_symbol_5_0= '<' )
            	            {
            	            // InternalJabuti.g:1130:6: (lv_symbol_5_0= '<' )
            	            // InternalJabuti.g:1131:7: lv_symbol_5_0= '<'
            	            {
            	            lv_symbol_5_0=(Token)match(input,41,FOLLOW_32); 

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
            	            // InternalJabuti.g:1144:5: ( (lv_symbol_6_0= '!=' ) )
            	            {
            	            // InternalJabuti.g:1144:5: ( (lv_symbol_6_0= '!=' ) )
            	            // InternalJabuti.g:1145:6: (lv_symbol_6_0= '!=' )
            	            {
            	            // InternalJabuti.g:1145:6: (lv_symbol_6_0= '!=' )
            	            // InternalJabuti.g:1146:7: lv_symbol_6_0= '!='
            	            {
            	            lv_symbol_6_0=(Token)match(input,42,FOLLOW_32); 

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
            	            // InternalJabuti.g:1159:5: ( (lv_symbol_7_0= '==' ) )
            	            {
            	            // InternalJabuti.g:1159:5: ( (lv_symbol_7_0= '==' ) )
            	            // InternalJabuti.g:1160:6: (lv_symbol_7_0= '==' )
            	            {
            	            // InternalJabuti.g:1160:6: (lv_symbol_7_0= '==' )
            	            // InternalJabuti.g:1161:7: lv_symbol_7_0= '=='
            	            {
            	            lv_symbol_7_0=(Token)match(input,43,FOLLOW_32); 

            	            							newLeafNode(lv_symbol_7_0, grammarAccess.getComparisonAccess().getSymbolEqualsSignEqualsSignKeyword_1_1_5_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_7_0, "==");
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalJabuti.g:1174:4: ( (lv_right_8_0= rulePlus ) )
            	    // InternalJabuti.g:1175:5: (lv_right_8_0= rulePlus )
            	    {
            	    // InternalJabuti.g:1175:5: (lv_right_8_0= rulePlus )
            	    // InternalJabuti.g:1176:6: lv_right_8_0= rulePlus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_right_8_0=rulePlus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_8_0,
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
    // InternalJabuti.g:1198:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalJabuti.g:1198:45: (iv_rulePlus= rulePlus EOF )
            // InternalJabuti.g:1199:2: iv_rulePlus= rulePlus EOF
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
    // InternalJabuti.g:1205:1: rulePlus returns [EObject current=null] : (this_Factor_0= ruleFactor ( () ( ( (lv_symbol_2_0= '+' ) ) | ( (lv_symbol_3_0= '-' ) ) ) ( (lv_right_4_0= ruleFactor ) ) )* ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        Token lv_symbol_3_0=null;
        EObject this_Factor_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1211:2: ( (this_Factor_0= ruleFactor ( () ( ( (lv_symbol_2_0= '+' ) ) | ( (lv_symbol_3_0= '-' ) ) ) ( (lv_right_4_0= ruleFactor ) ) )* ) )
            // InternalJabuti.g:1212:2: (this_Factor_0= ruleFactor ( () ( ( (lv_symbol_2_0= '+' ) ) | ( (lv_symbol_3_0= '-' ) ) ) ( (lv_right_4_0= ruleFactor ) ) )* )
            {
            // InternalJabuti.g:1212:2: (this_Factor_0= ruleFactor ( () ( ( (lv_symbol_2_0= '+' ) ) | ( (lv_symbol_3_0= '-' ) ) ) ( (lv_right_4_0= ruleFactor ) ) )* )
            // InternalJabuti.g:1213:3: this_Factor_0= ruleFactor ( () ( ( (lv_symbol_2_0= '+' ) ) | ( (lv_symbol_3_0= '-' ) ) ) ( (lv_right_4_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJabuti.g:1221:3: ( () ( ( (lv_symbol_2_0= '+' ) ) | ( (lv_symbol_3_0= '-' ) ) ) ( (lv_right_4_0= ruleFactor ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=44 && LA14_0<=45)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJabuti.g:1222:4: () ( ( (lv_symbol_2_0= '+' ) ) | ( (lv_symbol_3_0= '-' ) ) ) ( (lv_right_4_0= ruleFactor ) )
            	    {
            	    // InternalJabuti.g:1222:4: ()
            	    // InternalJabuti.g:1223:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPlusAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalJabuti.g:1229:4: ( ( (lv_symbol_2_0= '+' ) ) | ( (lv_symbol_3_0= '-' ) ) )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==44) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==45) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalJabuti.g:1230:5: ( (lv_symbol_2_0= '+' ) )
            	            {
            	            // InternalJabuti.g:1230:5: ( (lv_symbol_2_0= '+' ) )
            	            // InternalJabuti.g:1231:6: (lv_symbol_2_0= '+' )
            	            {
            	            // InternalJabuti.g:1231:6: (lv_symbol_2_0= '+' )
            	            // InternalJabuti.g:1232:7: lv_symbol_2_0= '+'
            	            {
            	            lv_symbol_2_0=(Token)match(input,44,FOLLOW_32); 

            	            							newLeafNode(lv_symbol_2_0, grammarAccess.getPlusAccess().getSymbolPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getPlusRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_2_0, "+");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalJabuti.g:1245:5: ( (lv_symbol_3_0= '-' ) )
            	            {
            	            // InternalJabuti.g:1245:5: ( (lv_symbol_3_0= '-' ) )
            	            // InternalJabuti.g:1246:6: (lv_symbol_3_0= '-' )
            	            {
            	            // InternalJabuti.g:1246:6: (lv_symbol_3_0= '-' )
            	            // InternalJabuti.g:1247:7: lv_symbol_3_0= '-'
            	            {
            	            lv_symbol_3_0=(Token)match(input,45,FOLLOW_32); 

            	            							newLeafNode(lv_symbol_3_0, grammarAccess.getPlusAccess().getSymbolHyphenMinusKeyword_1_1_1_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getPlusRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_3_0, "-");
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalJabuti.g:1260:4: ( (lv_right_4_0= ruleFactor ) )
            	    // InternalJabuti.g:1261:5: (lv_right_4_0= ruleFactor )
            	    {
            	    // InternalJabuti.g:1261:5: (lv_right_4_0= ruleFactor )
            	    // InternalJabuti.g:1262:6: lv_right_4_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getPlusAccess().getRightFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
    // InternalJabuti.g:1284:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalJabuti.g:1284:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalJabuti.g:1285:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalJabuti.g:1291:1: ruleFactor returns [EObject current=null] : (this_Negative_0= ruleNegative ( () ( ( (lv_symbol_2_0= '*' ) ) | ( (lv_symbol_3_0= '/' ) ) ) ( (lv_right_4_0= ruleNegative ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        Token lv_symbol_3_0=null;
        EObject this_Negative_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1297:2: ( (this_Negative_0= ruleNegative ( () ( ( (lv_symbol_2_0= '*' ) ) | ( (lv_symbol_3_0= '/' ) ) ) ( (lv_right_4_0= ruleNegative ) ) )* ) )
            // InternalJabuti.g:1298:2: (this_Negative_0= ruleNegative ( () ( ( (lv_symbol_2_0= '*' ) ) | ( (lv_symbol_3_0= '/' ) ) ) ( (lv_right_4_0= ruleNegative ) ) )* )
            {
            // InternalJabuti.g:1298:2: (this_Negative_0= ruleNegative ( () ( ( (lv_symbol_2_0= '*' ) ) | ( (lv_symbol_3_0= '/' ) ) ) ( (lv_right_4_0= ruleNegative ) ) )* )
            // InternalJabuti.g:1299:3: this_Negative_0= ruleNegative ( () ( ( (lv_symbol_2_0= '*' ) ) | ( (lv_symbol_3_0= '/' ) ) ) ( (lv_right_4_0= ruleNegative ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getNegativeParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_Negative_0=ruleNegative();

            state._fsp--;


            			current = this_Negative_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJabuti.g:1307:3: ( () ( ( (lv_symbol_2_0= '*' ) ) | ( (lv_symbol_3_0= '/' ) ) ) ( (lv_right_4_0= ruleNegative ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=46 && LA16_0<=47)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalJabuti.g:1308:4: () ( ( (lv_symbol_2_0= '*' ) ) | ( (lv_symbol_3_0= '/' ) ) ) ( (lv_right_4_0= ruleNegative ) )
            	    {
            	    // InternalJabuti.g:1308:4: ()
            	    // InternalJabuti.g:1309:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFactorAccess().getBinaryOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalJabuti.g:1315:4: ( ( (lv_symbol_2_0= '*' ) ) | ( (lv_symbol_3_0= '/' ) ) )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==46) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==47) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalJabuti.g:1316:5: ( (lv_symbol_2_0= '*' ) )
            	            {
            	            // InternalJabuti.g:1316:5: ( (lv_symbol_2_0= '*' ) )
            	            // InternalJabuti.g:1317:6: (lv_symbol_2_0= '*' )
            	            {
            	            // InternalJabuti.g:1317:6: (lv_symbol_2_0= '*' )
            	            // InternalJabuti.g:1318:7: lv_symbol_2_0= '*'
            	            {
            	            lv_symbol_2_0=(Token)match(input,46,FOLLOW_32); 

            	            							newLeafNode(lv_symbol_2_0, grammarAccess.getFactorAccess().getSymbolAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getFactorRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_2_0, "*");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalJabuti.g:1331:5: ( (lv_symbol_3_0= '/' ) )
            	            {
            	            // InternalJabuti.g:1331:5: ( (lv_symbol_3_0= '/' ) )
            	            // InternalJabuti.g:1332:6: (lv_symbol_3_0= '/' )
            	            {
            	            // InternalJabuti.g:1332:6: (lv_symbol_3_0= '/' )
            	            // InternalJabuti.g:1333:7: lv_symbol_3_0= '/'
            	            {
            	            lv_symbol_3_0=(Token)match(input,47,FOLLOW_32); 

            	            							newLeafNode(lv_symbol_3_0, grammarAccess.getFactorAccess().getSymbolSolidusKeyword_1_1_1_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getFactorRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_3_0, "/");
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalJabuti.g:1346:4: ( (lv_right_4_0= ruleNegative ) )
            	    // InternalJabuti.g:1347:5: (lv_right_4_0= ruleNegative )
            	    {
            	    // InternalJabuti.g:1347:5: (lv_right_4_0= ruleNegative )
            	    // InternalJabuti.g:1348:6: lv_right_4_0= ruleNegative
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightNegativeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
    // InternalJabuti.g:1370:1: entryRuleNegative returns [EObject current=null] : iv_ruleNegative= ruleNegative EOF ;
    public final EObject entryRuleNegative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegative = null;


        try {
            // InternalJabuti.g:1370:49: (iv_ruleNegative= ruleNegative EOF )
            // InternalJabuti.g:1371:2: iv_ruleNegative= ruleNegative EOF
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
    // InternalJabuti.g:1377:1: ruleNegative returns [EObject current=null] : (this_Primary_0= rulePrimary | ( () ( (lv_symbol_2_0= '-' ) ) ( (lv_expression_3_0= rulePrimary ) ) ) ) ;
    public final EObject ruleNegative() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        EObject this_Primary_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1383:2: ( (this_Primary_0= rulePrimary | ( () ( (lv_symbol_2_0= '-' ) ) ( (lv_expression_3_0= rulePrimary ) ) ) ) )
            // InternalJabuti.g:1384:2: (this_Primary_0= rulePrimary | ( () ( (lv_symbol_2_0= '-' ) ) ( (lv_expression_3_0= rulePrimary ) ) ) )
            {
            // InternalJabuti.g:1384:2: (this_Primary_0= rulePrimary | ( () ( (lv_symbol_2_0= '-' ) ) ( (lv_expression_3_0= rulePrimary ) ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||LA17_0==31) ) {
                alt17=1;
            }
            else if ( (LA17_0==45) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalJabuti.g:1385:3: this_Primary_0= rulePrimary
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
                    // InternalJabuti.g:1394:3: ( () ( (lv_symbol_2_0= '-' ) ) ( (lv_expression_3_0= rulePrimary ) ) )
                    {
                    // InternalJabuti.g:1394:3: ( () ( (lv_symbol_2_0= '-' ) ) ( (lv_expression_3_0= rulePrimary ) ) )
                    // InternalJabuti.g:1395:4: () ( (lv_symbol_2_0= '-' ) ) ( (lv_expression_3_0= rulePrimary ) )
                    {
                    // InternalJabuti.g:1395:4: ()
                    // InternalJabuti.g:1396:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegativeAccess().getUnaryOperatorAction_1_0(),
                    						current);
                    				

                    }

                    // InternalJabuti.g:1402:4: ( (lv_symbol_2_0= '-' ) )
                    // InternalJabuti.g:1403:5: (lv_symbol_2_0= '-' )
                    {
                    // InternalJabuti.g:1403:5: (lv_symbol_2_0= '-' )
                    // InternalJabuti.g:1404:6: lv_symbol_2_0= '-'
                    {
                    lv_symbol_2_0=(Token)match(input,45,FOLLOW_36); 

                    						newLeafNode(lv_symbol_2_0, grammarAccess.getNegativeAccess().getSymbolHyphenMinusKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNegativeRule());
                    						}
                    						setWithLastConsumed(current, "symbol", lv_symbol_2_0, "-");
                    					

                    }


                    }

                    // InternalJabuti.g:1416:4: ( (lv_expression_3_0= rulePrimary ) )
                    // InternalJabuti.g:1417:5: (lv_expression_3_0= rulePrimary )
                    {
                    // InternalJabuti.g:1417:5: (lv_expression_3_0= rulePrimary )
                    // InternalJabuti.g:1418:6: lv_expression_3_0= rulePrimary
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
    // InternalJabuti.g:1440:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalJabuti.g:1440:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalJabuti.g:1441:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalJabuti.g:1447:1: rulePrimary returns [EObject current=null] : (this_LiteralValue_0= ruleLiteralValue | this_ParenthesizedExpression_1= ruleParenthesizedExpression ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralValue_0 = null;

        EObject this_ParenthesizedExpression_1 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1453:2: ( (this_LiteralValue_0= ruleLiteralValue | this_ParenthesizedExpression_1= ruleParenthesizedExpression ) )
            // InternalJabuti.g:1454:2: (this_LiteralValue_0= ruleLiteralValue | this_ParenthesizedExpression_1= ruleParenthesizedExpression )
            {
            // InternalJabuti.g:1454:2: (this_LiteralValue_0= ruleLiteralValue | this_ParenthesizedExpression_1= ruleParenthesizedExpression )
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
                    // InternalJabuti.g:1455:3: this_LiteralValue_0= ruleLiteralValue
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
                    // InternalJabuti.g:1464:3: this_ParenthesizedExpression_1= ruleParenthesizedExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesizedExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParenthesizedExpression_1=ruleParenthesizedExpression();

                    state._fsp--;


                    			current = this_ParenthesizedExpression_1;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesizedExpression"
    // InternalJabuti.g:1476:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // InternalJabuti.g:1476:64: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // InternalJabuti.g:1477:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;

             current =iv_ruleParenthesizedExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesizedExpression"


    // $ANTLR start "ruleParenthesizedExpression"
    // InternalJabuti.g:1483:1: ruleParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1489:2: ( (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalJabuti.g:1490:2: (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalJabuti.g:1490:2: (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalJabuti.g:1491:3: otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalJabuti.g:1495:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalJabuti.g:1496:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalJabuti.g:1496:4: (lv_expression_1_0= ruleExpression )
            // InternalJabuti.g:1497:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesizedExpressionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesizedExpression"


    // $ANTLR start "entryRuleLiteralValue"
    // InternalJabuti.g:1522:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // InternalJabuti.g:1522:53: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // InternalJabuti.g:1523:2: iv_ruleLiteralValue= ruleLiteralValue EOF
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
    // InternalJabuti.g:1529:1: ruleLiteralValue returns [EObject current=null] : (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject this_NumericValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_VariableValue_2 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1535:2: ( (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue ) )
            // InternalJabuti.g:1536:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue )
            {
            // InternalJabuti.g:1536:2: (this_NumericValue_0= ruleNumericValue | this_StringValue_1= ruleStringValue | this_VariableValue_2= ruleVariableValue )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt19=1;
                }
                break;
            case RULE_STRING:
                {
                alt19=2;
                }
                break;
            case RULE_ID:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalJabuti.g:1537:3: this_NumericValue_0= ruleNumericValue
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
                    // InternalJabuti.g:1546:3: this_StringValue_1= ruleStringValue
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
                    // InternalJabuti.g:1555:3: this_VariableValue_2= ruleVariableValue
                    {

                    			newCompositeNode(grammarAccess.getLiteralValueAccess().getVariableValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableValue_2=ruleVariableValue();

                    state._fsp--;


                    			current = this_VariableValue_2;
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
    // InternalJabuti.g:1644:1: ruleVariableValue returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalJabuti.g:1650:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalJabuti.g:1651:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalJabuti.g:1651:2: ( (otherlv_0= RULE_ID ) )
            // InternalJabuti.g:1652:3: (otherlv_0= RULE_ID )
            {
            // InternalJabuti.g:1652:3: (otherlv_0= RULE_ID )
            // InternalJabuti.g:1653:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableValueRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableValueAccess().getValueVariableCrossReference_0());
            			

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


    // $ANTLR start "entryRuleVariable"
    // InternalJabuti.g:1667:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalJabuti.g:1667:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalJabuti.g:1668:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalJabuti.g:1674:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expression_2_0= ruleExpression ) ) | ( ( (lv_term_3_1= ruleSessionInterval | lv_term_3_2= ruleMessageContent | lv_term_3_3= ruleTimeInterval | lv_term_3_4= ruleTimeout ) ) ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;

        EObject lv_term_3_1 = null;

        EObject lv_term_3_2 = null;

        EObject lv_term_3_3 = null;

        EObject lv_term_3_4 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1680:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expression_2_0= ruleExpression ) ) | ( ( (lv_term_3_1= ruleSessionInterval | lv_term_3_2= ruleMessageContent | lv_term_3_3= ruleTimeInterval | lv_term_3_4= ruleTimeout ) ) ) ) ) )
            // InternalJabuti.g:1681:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expression_2_0= ruleExpression ) ) | ( ( (lv_term_3_1= ruleSessionInterval | lv_term_3_2= ruleMessageContent | lv_term_3_3= ruleTimeInterval | lv_term_3_4= ruleTimeout ) ) ) ) )
            {
            // InternalJabuti.g:1681:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expression_2_0= ruleExpression ) ) | ( ( (lv_term_3_1= ruleSessionInterval | lv_term_3_2= ruleMessageContent | lv_term_3_3= ruleTimeInterval | lv_term_3_4= ruleTimeout ) ) ) ) )
            // InternalJabuti.g:1682:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expression_2_0= ruleExpression ) ) | ( ( (lv_term_3_1= ruleSessionInterval | lv_term_3_2= ruleMessageContent | lv_term_3_3= ruleTimeInterval | lv_term_3_4= ruleTimeout ) ) ) )
            {
            // InternalJabuti.g:1682:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalJabuti.g:1683:4: (lv_name_0_0= RULE_ID )
            {
            // InternalJabuti.g:1683:4: (lv_name_0_0= RULE_ID )
            // InternalJabuti.g:1684:5: lv_name_0_0= RULE_ID
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
            		
            // InternalJabuti.g:1704:3: ( ( (lv_expression_2_0= ruleExpression ) ) | ( ( (lv_term_3_1= ruleSessionInterval | lv_term_3_2= ruleMessageContent | lv_term_3_3= ruleTimeInterval | lv_term_3_4= ruleTimeout ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_INT)||LA21_0==31||LA21_0==37||LA21_0==45) ) {
                alt21=1;
            }
            else if ( (LA21_0==52||LA21_0==54||LA21_0==56||LA21_0==59) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalJabuti.g:1705:4: ( (lv_expression_2_0= ruleExpression ) )
                    {
                    // InternalJabuti.g:1705:4: ( (lv_expression_2_0= ruleExpression ) )
                    // InternalJabuti.g:1706:5: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalJabuti.g:1706:5: (lv_expression_2_0= ruleExpression )
                    // InternalJabuti.g:1707:6: lv_expression_2_0= ruleExpression
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
                    // InternalJabuti.g:1725:4: ( ( (lv_term_3_1= ruleSessionInterval | lv_term_3_2= ruleMessageContent | lv_term_3_3= ruleTimeInterval | lv_term_3_4= ruleTimeout ) ) )
                    {
                    // InternalJabuti.g:1725:4: ( ( (lv_term_3_1= ruleSessionInterval | lv_term_3_2= ruleMessageContent | lv_term_3_3= ruleTimeInterval | lv_term_3_4= ruleTimeout ) ) )
                    // InternalJabuti.g:1726:5: ( (lv_term_3_1= ruleSessionInterval | lv_term_3_2= ruleMessageContent | lv_term_3_3= ruleTimeInterval | lv_term_3_4= ruleTimeout ) )
                    {
                    // InternalJabuti.g:1726:5: ( (lv_term_3_1= ruleSessionInterval | lv_term_3_2= ruleMessageContent | lv_term_3_3= ruleTimeInterval | lv_term_3_4= ruleTimeout ) )
                    // InternalJabuti.g:1727:6: (lv_term_3_1= ruleSessionInterval | lv_term_3_2= ruleMessageContent | lv_term_3_3= ruleTimeInterval | lv_term_3_4= ruleTimeout )
                    {
                    // InternalJabuti.g:1727:6: (lv_term_3_1= ruleSessionInterval | lv_term_3_2= ruleMessageContent | lv_term_3_3= ruleTimeInterval | lv_term_3_4= ruleTimeout )
                    int alt20=4;
                    switch ( input.LA(1) ) {
                    case 54:
                        {
                        alt20=1;
                        }
                        break;
                    case 59:
                        {
                        alt20=2;
                        }
                        break;
                    case 52:
                        {
                        alt20=3;
                        }
                        break;
                    case 56:
                        {
                        alt20=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }

                    switch (alt20) {
                        case 1 :
                            // InternalJabuti.g:1728:7: lv_term_3_1= ruleSessionInterval
                            {

                            							newCompositeNode(grammarAccess.getVariableAccess().getTermSessionIntervalParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_term_3_1=ruleSessionInterval();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVariableRule());
                            							}
                            							set(
                            								current,
                            								"term",
                            								lv_term_3_1,
                            								"br.edu.unijui.gca.jabuti.Jabuti.SessionInterval");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalJabuti.g:1744:7: lv_term_3_2= ruleMessageContent
                            {

                            							newCompositeNode(grammarAccess.getVariableAccess().getTermMessageContentParserRuleCall_2_1_0_1());
                            						
                            pushFollow(FOLLOW_2);
                            lv_term_3_2=ruleMessageContent();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVariableRule());
                            							}
                            							set(
                            								current,
                            								"term",
                            								lv_term_3_2,
                            								"br.edu.unijui.gca.jabuti.Jabuti.MessageContent");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 3 :
                            // InternalJabuti.g:1760:7: lv_term_3_3= ruleTimeInterval
                            {

                            							newCompositeNode(grammarAccess.getVariableAccess().getTermTimeIntervalParserRuleCall_2_1_0_2());
                            						
                            pushFollow(FOLLOW_2);
                            lv_term_3_3=ruleTimeInterval();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVariableRule());
                            							}
                            							set(
                            								current,
                            								"term",
                            								lv_term_3_3,
                            								"br.edu.unijui.gca.jabuti.Jabuti.TimeInterval");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 4 :
                            // InternalJabuti.g:1776:7: lv_term_3_4= ruleTimeout
                            {

                            							newCompositeNode(grammarAccess.getVariableAccess().getTermTimeoutParserRuleCall_2_1_0_3());
                            						
                            pushFollow(FOLLOW_2);
                            lv_term_3_4=ruleTimeout();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVariableRule());
                            							}
                            							set(
                            								current,
                            								"term",
                            								lv_term_3_4,
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


    // $ANTLR start "entryRuleExpressionTerm"
    // InternalJabuti.g:1799:1: entryRuleExpressionTerm returns [EObject current=null] : iv_ruleExpressionTerm= ruleExpressionTerm EOF ;
    public final EObject entryRuleExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionTerm = null;


        try {
            // InternalJabuti.g:1799:55: (iv_ruleExpressionTerm= ruleExpressionTerm EOF )
            // InternalJabuti.g:1800:2: iv_ruleExpressionTerm= ruleExpressionTerm EOF
            {
             newCompositeNode(grammarAccess.getExpressionTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionTerm=ruleExpressionTerm();

            state._fsp--;

             current =iv_ruleExpressionTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionTerm"


    // $ANTLR start "ruleExpressionTerm"
    // InternalJabuti.g:1806:1: ruleExpressionTerm returns [EObject current=null] : (this_NegationTerm_0= ruleNegationTerm ( () ( ( (lv_symbol_2_0= ',' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegationTerm ) ) )* ) ;
    public final EObject ruleExpressionTerm() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        Token lv_symbol_3_0=null;
        EObject this_NegationTerm_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1812:2: ( (this_NegationTerm_0= ruleNegationTerm ( () ( ( (lv_symbol_2_0= ',' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegationTerm ) ) )* ) )
            // InternalJabuti.g:1813:2: (this_NegationTerm_0= ruleNegationTerm ( () ( ( (lv_symbol_2_0= ',' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegationTerm ) ) )* )
            {
            // InternalJabuti.g:1813:2: (this_NegationTerm_0= ruleNegationTerm ( () ( ( (lv_symbol_2_0= ',' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegationTerm ) ) )* )
            // InternalJabuti.g:1814:3: this_NegationTerm_0= ruleNegationTerm ( () ( ( (lv_symbol_2_0= ',' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegationTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionTermAccess().getNegationTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_NegationTerm_0=ruleNegationTerm();

            state._fsp--;


            			current = this_NegationTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalJabuti.g:1822:3: ( () ( ( (lv_symbol_2_0= ',' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegationTerm ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==36||LA23_0==48) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalJabuti.g:1823:4: () ( ( (lv_symbol_2_0= ',' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegationTerm ) )
            	    {
            	    // InternalJabuti.g:1823:4: ()
            	    // InternalJabuti.g:1824:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionTermAccess().getBinaryTermOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalJabuti.g:1830:4: ( ( (lv_symbol_2_0= ',' ) ) | ( (lv_symbol_3_0= 'OR' ) ) )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==48) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==36) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalJabuti.g:1831:5: ( (lv_symbol_2_0= ',' ) )
            	            {
            	            // InternalJabuti.g:1831:5: ( (lv_symbol_2_0= ',' ) )
            	            // InternalJabuti.g:1832:6: (lv_symbol_2_0= ',' )
            	            {
            	            // InternalJabuti.g:1832:6: (lv_symbol_2_0= ',' )
            	            // InternalJabuti.g:1833:7: lv_symbol_2_0= ','
            	            {
            	            lv_symbol_2_0=(Token)match(input,48,FOLLOW_24); 

            	            							newLeafNode(lv_symbol_2_0, grammarAccess.getExpressionTermAccess().getSymbolCommaKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getExpressionTermRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_2_0, ",");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalJabuti.g:1846:5: ( (lv_symbol_3_0= 'OR' ) )
            	            {
            	            // InternalJabuti.g:1846:5: ( (lv_symbol_3_0= 'OR' ) )
            	            // InternalJabuti.g:1847:6: (lv_symbol_3_0= 'OR' )
            	            {
            	            // InternalJabuti.g:1847:6: (lv_symbol_3_0= 'OR' )
            	            // InternalJabuti.g:1848:7: lv_symbol_3_0= 'OR'
            	            {
            	            lv_symbol_3_0=(Token)match(input,36,FOLLOW_24); 

            	            							newLeafNode(lv_symbol_3_0, grammarAccess.getExpressionTermAccess().getSymbolORKeyword_1_1_1_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getExpressionTermRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_3_0, "OR");
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalJabuti.g:1861:4: ( (lv_right_4_0= ruleNegationTerm ) )
            	    // InternalJabuti.g:1862:5: (lv_right_4_0= ruleNegationTerm )
            	    {
            	    // InternalJabuti.g:1862:5: (lv_right_4_0= ruleNegationTerm )
            	    // InternalJabuti.g:1863:6: lv_right_4_0= ruleNegationTerm
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionTermAccess().getRightNegationTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_right_4_0=ruleNegationTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionTermRule());
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
    // $ANTLR end "ruleExpressionTerm"


    // $ANTLR start "entryRuleNegationTerm"
    // InternalJabuti.g:1885:1: entryRuleNegationTerm returns [EObject current=null] : iv_ruleNegationTerm= ruleNegationTerm EOF ;
    public final EObject entryRuleNegationTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationTerm = null;


        try {
            // InternalJabuti.g:1885:53: (iv_ruleNegationTerm= ruleNegationTerm EOF )
            // InternalJabuti.g:1886:2: iv_ruleNegationTerm= ruleNegationTerm EOF
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
    // InternalJabuti.g:1892:1: ruleNegationTerm returns [EObject current=null] : (this_Term_0= ruleTerm | ( () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_expressionTerm_3_0= ruleTerm ) ) ) ) ;
    public final EObject ruleNegationTerm() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        EObject this_Term_0 = null;

        EObject lv_expressionTerm_3_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1898:2: ( (this_Term_0= ruleTerm | ( () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_expressionTerm_3_0= ruleTerm ) ) ) ) )
            // InternalJabuti.g:1899:2: (this_Term_0= ruleTerm | ( () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_expressionTerm_3_0= ruleTerm ) ) ) )
            {
            // InternalJabuti.g:1899:2: (this_Term_0= ruleTerm | ( () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_expressionTerm_3_0= ruleTerm ) ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31||(LA24_0>=35 && LA24_0<=36)||LA24_0==48||LA24_0==50||LA24_0==52||LA24_0==54||(LA24_0>=56 && LA24_0<=59)) ) {
                alt24=1;
            }
            else if ( (LA24_0==49) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalJabuti.g:1900:3: this_Term_0= ruleTerm
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
                    // InternalJabuti.g:1909:3: ( () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_expressionTerm_3_0= ruleTerm ) ) )
                    {
                    // InternalJabuti.g:1909:3: ( () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_expressionTerm_3_0= ruleTerm ) ) )
                    // InternalJabuti.g:1910:4: () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_expressionTerm_3_0= ruleTerm ) )
                    {
                    // InternalJabuti.g:1910:4: ()
                    // InternalJabuti.g:1911:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegationTermAccess().getUnaryTermOperatorAction_1_0(),
                    						current);
                    				

                    }

                    // InternalJabuti.g:1917:4: ( (lv_symbol_2_0= 'NOT' ) )
                    // InternalJabuti.g:1918:5: (lv_symbol_2_0= 'NOT' )
                    {
                    // InternalJabuti.g:1918:5: (lv_symbol_2_0= 'NOT' )
                    // InternalJabuti.g:1919:6: lv_symbol_2_0= 'NOT'
                    {
                    lv_symbol_2_0=(Token)match(input,49,FOLLOW_39); 

                    						newLeafNode(lv_symbol_2_0, grammarAccess.getNegationTermAccess().getSymbolNOTKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNegationTermRule());
                    						}
                    						setWithLastConsumed(current, "symbol", lv_symbol_2_0, "NOT");
                    					

                    }


                    }

                    // InternalJabuti.g:1931:4: ( (lv_expressionTerm_3_0= ruleTerm ) )
                    // InternalJabuti.g:1932:5: (lv_expressionTerm_3_0= ruleTerm )
                    {
                    // InternalJabuti.g:1932:5: (lv_expressionTerm_3_0= ruleTerm )
                    // InternalJabuti.g:1933:6: lv_expressionTerm_3_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getNegationTermAccess().getExpressionTermTermParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expressionTerm_3_0=ruleTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNegationTermRule());
                    						}
                    						set(
                    							current,
                    							"expressionTerm",
                    							lv_expressionTerm_3_0,
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
    // InternalJabuti.g:1955:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalJabuti.g:1955:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalJabuti.g:1956:2: iv_ruleTerm= ruleTerm EOF
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
    // InternalJabuti.g:1962:1: ruleTerm returns [EObject current=null] : ( (otherlv_0= '(' this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= ')' ) | this_ConditionalExpression_3= ruleConditionalExpression | this_SessionInterval_4= ruleSessionInterval | this_WeekDaysInterval_5= ruleWeekDaysInterval | this_TimeInterval_6= ruleTimeInterval | this_Timeout_7= ruleTimeout | this_MaxNumberOfOperation_8= ruleMaxNumberOfOperation | this_MessageContent_9= ruleMessageContent ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ExpressionTerm_1 = null;

        EObject this_ConditionalExpression_3 = null;

        EObject this_SessionInterval_4 = null;

        EObject this_WeekDaysInterval_5 = null;

        EObject this_TimeInterval_6 = null;

        EObject this_Timeout_7 = null;

        EObject this_MaxNumberOfOperation_8 = null;

        EObject this_MessageContent_9 = null;



        	enterRule();

        try {
            // InternalJabuti.g:1968:2: ( ( (otherlv_0= '(' this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= ')' ) | this_ConditionalExpression_3= ruleConditionalExpression | this_SessionInterval_4= ruleSessionInterval | this_WeekDaysInterval_5= ruleWeekDaysInterval | this_TimeInterval_6= ruleTimeInterval | this_Timeout_7= ruleTimeout | this_MaxNumberOfOperation_8= ruleMaxNumberOfOperation | this_MessageContent_9= ruleMessageContent ) )
            // InternalJabuti.g:1969:2: ( (otherlv_0= '(' this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= ')' ) | this_ConditionalExpression_3= ruleConditionalExpression | this_SessionInterval_4= ruleSessionInterval | this_WeekDaysInterval_5= ruleWeekDaysInterval | this_TimeInterval_6= ruleTimeInterval | this_Timeout_7= ruleTimeout | this_MaxNumberOfOperation_8= ruleMaxNumberOfOperation | this_MessageContent_9= ruleMessageContent )
            {
            // InternalJabuti.g:1969:2: ( (otherlv_0= '(' this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= ')' ) | this_ConditionalExpression_3= ruleConditionalExpression | this_SessionInterval_4= ruleSessionInterval | this_WeekDaysInterval_5= ruleWeekDaysInterval | this_TimeInterval_6= ruleTimeInterval | this_Timeout_7= ruleTimeout | this_MaxNumberOfOperation_8= ruleMaxNumberOfOperation | this_MessageContent_9= ruleMessageContent )
            int alt25=8;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt25=1;
                }
                break;
            case 35:
            case 36:
            case 48:
            case 50:
                {
                alt25=2;
                }
                break;
            case 54:
                {
                alt25=3;
                }
                break;
            case 58:
                {
                alt25=4;
                }
                break;
            case 52:
                {
                alt25=5;
                }
                break;
            case 56:
                {
                alt25=6;
                }
                break;
            case 57:
                {
                alt25=7;
                }
                break;
            case 59:
                {
                alt25=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalJabuti.g:1970:3: (otherlv_0= '(' this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= ')' )
                    {
                    // InternalJabuti.g:1970:3: (otherlv_0= '(' this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= ')' )
                    // InternalJabuti.g:1971:4: otherlv_0= '(' this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_0, grammarAccess.getTermAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getTermAccess().getExpressionTermParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_29);
                    this_ExpressionTerm_1=ruleExpressionTerm();

                    state._fsp--;


                    				current = this_ExpressionTerm_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTermAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJabuti.g:1989:3: this_ConditionalExpression_3= ruleConditionalExpression
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getConditionalExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionalExpression_3=ruleConditionalExpression();

                    state._fsp--;


                    			current = this_ConditionalExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJabuti.g:1998:3: this_SessionInterval_4= ruleSessionInterval
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getSessionIntervalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SessionInterval_4=ruleSessionInterval();

                    state._fsp--;


                    			current = this_SessionInterval_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJabuti.g:2007:3: this_WeekDaysInterval_5= ruleWeekDaysInterval
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getWeekDaysIntervalParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_WeekDaysInterval_5=ruleWeekDaysInterval();

                    state._fsp--;


                    			current = this_WeekDaysInterval_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJabuti.g:2016:3: this_TimeInterval_6= ruleTimeInterval
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getTimeIntervalParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeInterval_6=ruleTimeInterval();

                    state._fsp--;


                    			current = this_TimeInterval_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalJabuti.g:2025:3: this_Timeout_7= ruleTimeout
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getTimeoutParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Timeout_7=ruleTimeout();

                    state._fsp--;


                    			current = this_Timeout_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalJabuti.g:2034:3: this_MaxNumberOfOperation_8= ruleMaxNumberOfOperation
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getMaxNumberOfOperationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxNumberOfOperation_8=ruleMaxNumberOfOperation();

                    state._fsp--;


                    			current = this_MaxNumberOfOperation_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalJabuti.g:2043:3: this_MessageContent_9= ruleMessageContent
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getMessageContentParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_MessageContent_9=ruleMessageContent();

                    state._fsp--;


                    			current = this_MessageContent_9;
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


    // $ANTLR start "entryRuleConditionalExpression"
    // InternalJabuti.g:2055:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // InternalJabuti.g:2055:62: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // InternalJabuti.g:2056:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
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
    // InternalJabuti.g:2062:1: ruleConditionalExpression returns [EObject current=null] : ( ( (lv_beforeSymbol_0_0= ruleLogicalOperator ) )? otherlv_1= 'when' otherlv_2= '(' ( ( ruleQualifiedName | this_STRING_4= RULE_STRING ) ( ( (lv_comparisonOperator_5_0= ruleComparisonOperator ) ) ( ruleQualifiedName | this_STRING_7= RULE_STRING ) )? ) ( ( (lv_logicalOperator_8_0= ruleLogicalOperator ) ) ruleQualifiedName ( ( (lv_comparisonOperator_10_0= ruleComparisonOperator ) ) ( ruleQualifiedName | this_STRING_12= RULE_STRING ) )? )* otherlv_13= ')' otherlv_14= 'check' otherlv_15= '{' ( (lv_expressionTerm_16_0= ruleExpressionTerm ) ) otherlv_17= '}' ( (lv_afterSymbol_18_0= ruleLogicalOperator ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_STRING_4=null;
        Token this_STRING_7=null;
        Token this_STRING_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_beforeSymbol_0_0 = null;

        EObject lv_comparisonOperator_5_0 = null;

        EObject lv_logicalOperator_8_0 = null;

        EObject lv_comparisonOperator_10_0 = null;

        EObject lv_expressionTerm_16_0 = null;

        EObject lv_afterSymbol_18_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:2068:2: ( ( ( (lv_beforeSymbol_0_0= ruleLogicalOperator ) )? otherlv_1= 'when' otherlv_2= '(' ( ( ruleQualifiedName | this_STRING_4= RULE_STRING ) ( ( (lv_comparisonOperator_5_0= ruleComparisonOperator ) ) ( ruleQualifiedName | this_STRING_7= RULE_STRING ) )? ) ( ( (lv_logicalOperator_8_0= ruleLogicalOperator ) ) ruleQualifiedName ( ( (lv_comparisonOperator_10_0= ruleComparisonOperator ) ) ( ruleQualifiedName | this_STRING_12= RULE_STRING ) )? )* otherlv_13= ')' otherlv_14= 'check' otherlv_15= '{' ( (lv_expressionTerm_16_0= ruleExpressionTerm ) ) otherlv_17= '}' ( (lv_afterSymbol_18_0= ruleLogicalOperator ) )? ) )
            // InternalJabuti.g:2069:2: ( ( (lv_beforeSymbol_0_0= ruleLogicalOperator ) )? otherlv_1= 'when' otherlv_2= '(' ( ( ruleQualifiedName | this_STRING_4= RULE_STRING ) ( ( (lv_comparisonOperator_5_0= ruleComparisonOperator ) ) ( ruleQualifiedName | this_STRING_7= RULE_STRING ) )? ) ( ( (lv_logicalOperator_8_0= ruleLogicalOperator ) ) ruleQualifiedName ( ( (lv_comparisonOperator_10_0= ruleComparisonOperator ) ) ( ruleQualifiedName | this_STRING_12= RULE_STRING ) )? )* otherlv_13= ')' otherlv_14= 'check' otherlv_15= '{' ( (lv_expressionTerm_16_0= ruleExpressionTerm ) ) otherlv_17= '}' ( (lv_afterSymbol_18_0= ruleLogicalOperator ) )? )
            {
            // InternalJabuti.g:2069:2: ( ( (lv_beforeSymbol_0_0= ruleLogicalOperator ) )? otherlv_1= 'when' otherlv_2= '(' ( ( ruleQualifiedName | this_STRING_4= RULE_STRING ) ( ( (lv_comparisonOperator_5_0= ruleComparisonOperator ) ) ( ruleQualifiedName | this_STRING_7= RULE_STRING ) )? ) ( ( (lv_logicalOperator_8_0= ruleLogicalOperator ) ) ruleQualifiedName ( ( (lv_comparisonOperator_10_0= ruleComparisonOperator ) ) ( ruleQualifiedName | this_STRING_12= RULE_STRING ) )? )* otherlv_13= ')' otherlv_14= 'check' otherlv_15= '{' ( (lv_expressionTerm_16_0= ruleExpressionTerm ) ) otherlv_17= '}' ( (lv_afterSymbol_18_0= ruleLogicalOperator ) )? )
            // InternalJabuti.g:2070:3: ( (lv_beforeSymbol_0_0= ruleLogicalOperator ) )? otherlv_1= 'when' otherlv_2= '(' ( ( ruleQualifiedName | this_STRING_4= RULE_STRING ) ( ( (lv_comparisonOperator_5_0= ruleComparisonOperator ) ) ( ruleQualifiedName | this_STRING_7= RULE_STRING ) )? ) ( ( (lv_logicalOperator_8_0= ruleLogicalOperator ) ) ruleQualifiedName ( ( (lv_comparisonOperator_10_0= ruleComparisonOperator ) ) ( ruleQualifiedName | this_STRING_12= RULE_STRING ) )? )* otherlv_13= ')' otherlv_14= 'check' otherlv_15= '{' ( (lv_expressionTerm_16_0= ruleExpressionTerm ) ) otherlv_17= '}' ( (lv_afterSymbol_18_0= ruleLogicalOperator ) )?
            {
            // InternalJabuti.g:2070:3: ( (lv_beforeSymbol_0_0= ruleLogicalOperator ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=35 && LA26_0<=36)||LA26_0==48) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJabuti.g:2071:4: (lv_beforeSymbol_0_0= ruleLogicalOperator )
                    {
                    // InternalJabuti.g:2071:4: (lv_beforeSymbol_0_0= ruleLogicalOperator )
                    // InternalJabuti.g:2072:5: lv_beforeSymbol_0_0= ruleLogicalOperator
                    {

                    					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getBeforeSymbolLogicalOperatorParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_40);
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

            otherlv_1=(Token)match(input,50,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalExpressionAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalJabuti.g:2097:3: ( ( ruleQualifiedName | this_STRING_4= RULE_STRING ) ( ( (lv_comparisonOperator_5_0= ruleComparisonOperator ) ) ( ruleQualifiedName | this_STRING_7= RULE_STRING ) )? )
            // InternalJabuti.g:2098:4: ( ruleQualifiedName | this_STRING_4= RULE_STRING ) ( ( (lv_comparisonOperator_5_0= ruleComparisonOperator ) ) ( ruleQualifiedName | this_STRING_7= RULE_STRING ) )?
            {
            // InternalJabuti.g:2098:4: ( ruleQualifiedName | this_STRING_4= RULE_STRING )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_STRING) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalJabuti.g:2099:5: ruleQualifiedName
                    {

                    					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getQualifiedNameParserRuleCall_3_0_0());
                    				
                    pushFollow(FOLLOW_42);
                    ruleQualifiedName();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalJabuti.g:2107:5: this_STRING_4= RULE_STRING
                    {
                    this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_42); 

                    					newLeafNode(this_STRING_4, grammarAccess.getConditionalExpressionAccess().getSTRINGTerminalRuleCall_3_0_1());
                    				

                    }
                    break;

            }

            // InternalJabuti.g:2112:4: ( ( (lv_comparisonOperator_5_0= ruleComparisonOperator ) ) ( ruleQualifiedName | this_STRING_7= RULE_STRING ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=38 && LA29_0<=43)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalJabuti.g:2113:5: ( (lv_comparisonOperator_5_0= ruleComparisonOperator ) ) ( ruleQualifiedName | this_STRING_7= RULE_STRING )
                    {
                    // InternalJabuti.g:2113:5: ( (lv_comparisonOperator_5_0= ruleComparisonOperator ) )
                    // InternalJabuti.g:2114:6: (lv_comparisonOperator_5_0= ruleComparisonOperator )
                    {
                    // InternalJabuti.g:2114:6: (lv_comparisonOperator_5_0= ruleComparisonOperator )
                    // InternalJabuti.g:2115:7: lv_comparisonOperator_5_0= ruleComparisonOperator
                    {

                    							newCompositeNode(grammarAccess.getConditionalExpressionAccess().getComparisonOperatorComparisonOperatorParserRuleCall_3_1_0_0());
                    						
                    pushFollow(FOLLOW_41);
                    lv_comparisonOperator_5_0=ruleComparisonOperator();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                    							}
                    							add(
                    								current,
                    								"comparisonOperator",
                    								lv_comparisonOperator_5_0,
                    								"br.edu.unijui.gca.jabuti.Jabuti.ComparisonOperator");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalJabuti.g:2132:5: ( ruleQualifiedName | this_STRING_7= RULE_STRING )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_ID) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==RULE_STRING) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalJabuti.g:2133:6: ruleQualifiedName
                            {

                            						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getQualifiedNameParserRuleCall_3_1_1_0());
                            					
                            pushFollow(FOLLOW_43);
                            ruleQualifiedName();

                            state._fsp--;


                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;
                        case 2 :
                            // InternalJabuti.g:2141:6: this_STRING_7= RULE_STRING
                            {
                            this_STRING_7=(Token)match(input,RULE_STRING,FOLLOW_43); 

                            						newLeafNode(this_STRING_7, grammarAccess.getConditionalExpressionAccess().getSTRINGTerminalRuleCall_3_1_1_1());
                            					

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            // InternalJabuti.g:2148:3: ( ( (lv_logicalOperator_8_0= ruleLogicalOperator ) ) ruleQualifiedName ( ( (lv_comparisonOperator_10_0= ruleComparisonOperator ) ) ( ruleQualifiedName | this_STRING_12= RULE_STRING ) )? )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=35 && LA32_0<=36)||LA32_0==48) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalJabuti.g:2149:4: ( (lv_logicalOperator_8_0= ruleLogicalOperator ) ) ruleQualifiedName ( ( (lv_comparisonOperator_10_0= ruleComparisonOperator ) ) ( ruleQualifiedName | this_STRING_12= RULE_STRING ) )?
            	    {
            	    // InternalJabuti.g:2149:4: ( (lv_logicalOperator_8_0= ruleLogicalOperator ) )
            	    // InternalJabuti.g:2150:5: (lv_logicalOperator_8_0= ruleLogicalOperator )
            	    {
            	    // InternalJabuti.g:2150:5: (lv_logicalOperator_8_0= ruleLogicalOperator )
            	    // InternalJabuti.g:2151:6: lv_logicalOperator_8_0= ruleLogicalOperator
            	    {

            	    						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOperatorLogicalOperatorParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_logicalOperator_8_0=ruleLogicalOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"logicalOperator",
            	    							lv_logicalOperator_8_0,
            	    							"br.edu.unijui.gca.jabuti.Jabuti.LogicalOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    				newCompositeNode(grammarAccess.getConditionalExpressionAccess().getQualifiedNameParserRuleCall_4_1());
            	    			
            	    pushFollow(FOLLOW_42);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalJabuti.g:2175:4: ( ( (lv_comparisonOperator_10_0= ruleComparisonOperator ) ) ( ruleQualifiedName | this_STRING_12= RULE_STRING ) )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( ((LA31_0>=38 && LA31_0<=43)) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalJabuti.g:2176:5: ( (lv_comparisonOperator_10_0= ruleComparisonOperator ) ) ( ruleQualifiedName | this_STRING_12= RULE_STRING )
            	            {
            	            // InternalJabuti.g:2176:5: ( (lv_comparisonOperator_10_0= ruleComparisonOperator ) )
            	            // InternalJabuti.g:2177:6: (lv_comparisonOperator_10_0= ruleComparisonOperator )
            	            {
            	            // InternalJabuti.g:2177:6: (lv_comparisonOperator_10_0= ruleComparisonOperator )
            	            // InternalJabuti.g:2178:7: lv_comparisonOperator_10_0= ruleComparisonOperator
            	            {

            	            							newCompositeNode(grammarAccess.getConditionalExpressionAccess().getComparisonOperatorComparisonOperatorParserRuleCall_4_2_0_0());
            	            						
            	            pushFollow(FOLLOW_41);
            	            lv_comparisonOperator_10_0=ruleComparisonOperator();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
            	            							}
            	            							add(
            	            								current,
            	            								"comparisonOperator",
            	            								lv_comparisonOperator_10_0,
            	            								"br.edu.unijui.gca.jabuti.Jabuti.ComparisonOperator");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }

            	            // InternalJabuti.g:2195:5: ( ruleQualifiedName | this_STRING_12= RULE_STRING )
            	            int alt30=2;
            	            int LA30_0 = input.LA(1);

            	            if ( (LA30_0==RULE_ID) ) {
            	                alt30=1;
            	            }
            	            else if ( (LA30_0==RULE_STRING) ) {
            	                alt30=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 30, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt30) {
            	                case 1 :
            	                    // InternalJabuti.g:2196:6: ruleQualifiedName
            	                    {

            	                    						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getQualifiedNameParserRuleCall_4_2_1_0());
            	                    					
            	                    pushFollow(FOLLOW_43);
            	                    ruleQualifiedName();

            	                    state._fsp--;


            	                    						afterParserOrEnumRuleCall();
            	                    					

            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalJabuti.g:2204:6: this_STRING_12= RULE_STRING
            	                    {
            	                    this_STRING_12=(Token)match(input,RULE_STRING,FOLLOW_43); 

            	                    						newLeafNode(this_STRING_12, grammarAccess.getConditionalExpressionAccess().getSTRINGTerminalRuleCall_4_2_1_1());
            	                    					

            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_13=(Token)match(input,33,FOLLOW_44); 

            			newLeafNode(otherlv_13, grammarAccess.getConditionalExpressionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_14=(Token)match(input,51,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getConditionalExpressionAccess().getCheckKeyword_6());
            		
            otherlv_15=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_15, grammarAccess.getConditionalExpressionAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalJabuti.g:2223:3: ( (lv_expressionTerm_16_0= ruleExpressionTerm ) )
            // InternalJabuti.g:2224:4: (lv_expressionTerm_16_0= ruleExpressionTerm )
            {
            // InternalJabuti.g:2224:4: (lv_expressionTerm_16_0= ruleExpressionTerm )
            // InternalJabuti.g:2225:5: lv_expressionTerm_16_0= ruleExpressionTerm
            {

            					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getExpressionTermExpressionTermParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_expressionTerm_16_0=ruleExpressionTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
            					}
            					set(
            						current,
            						"expressionTerm",
            						lv_expressionTerm_16_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.ExpressionTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,18,FOLLOW_45); 

            			newLeafNode(otherlv_17, grammarAccess.getConditionalExpressionAccess().getRightCurlyBracketKeyword_9());
            		
            // InternalJabuti.g:2246:3: ( (lv_afterSymbol_18_0= ruleLogicalOperator ) )?
            int alt33=2;
            switch ( input.LA(1) ) {
                case 48:
                    {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==48) ) {
                        alt33=1;
                    }
                    else if ( (LA33_1==EOF||LA33_1==18||LA33_1==33||LA33_1==36) ) {
                        alt33=1;
                    }
                    }
                    break;
                case 35:
                    {
                    alt33=1;
                    }
                    break;
                case 36:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (LA33_3==48) ) {
                        alt33=1;
                    }
                    else if ( (LA33_3==EOF||LA33_3==18||LA33_3==33||LA33_3==36) ) {
                        alt33=1;
                    }
                    }
                    break;
            }

            switch (alt33) {
                case 1 :
                    // InternalJabuti.g:2247:4: (lv_afterSymbol_18_0= ruleLogicalOperator )
                    {
                    // InternalJabuti.g:2247:4: (lv_afterSymbol_18_0= ruleLogicalOperator )
                    // InternalJabuti.g:2248:5: lv_afterSymbol_18_0= ruleLogicalOperator
                    {

                    					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getAfterSymbolLogicalOperatorParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_afterSymbol_18_0=ruleLogicalOperator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                    					}
                    					set(
                    						current,
                    						"afterSymbol",
                    						lv_afterSymbol_18_0,
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


    // $ANTLR start "entryRuleLogicalOperator"
    // InternalJabuti.g:2269:1: entryRuleLogicalOperator returns [EObject current=null] : iv_ruleLogicalOperator= ruleLogicalOperator EOF ;
    public final EObject entryRuleLogicalOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOperator = null;


        try {
            // InternalJabuti.g:2269:56: (iv_ruleLogicalOperator= ruleLogicalOperator EOF )
            // InternalJabuti.g:2270:2: iv_ruleLogicalOperator= ruleLogicalOperator EOF
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
    // InternalJabuti.g:2276:1: ruleLogicalOperator returns [EObject current=null] : ( ( (lv_symbol_0_1= ',' | lv_symbol_0_2= 'AND' | lv_symbol_0_3= 'OR' ) ) ) ;
    public final EObject ruleLogicalOperator() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_1=null;
        Token lv_symbol_0_2=null;
        Token lv_symbol_0_3=null;


        	enterRule();

        try {
            // InternalJabuti.g:2282:2: ( ( ( (lv_symbol_0_1= ',' | lv_symbol_0_2= 'AND' | lv_symbol_0_3= 'OR' ) ) ) )
            // InternalJabuti.g:2283:2: ( ( (lv_symbol_0_1= ',' | lv_symbol_0_2= 'AND' | lv_symbol_0_3= 'OR' ) ) )
            {
            // InternalJabuti.g:2283:2: ( ( (lv_symbol_0_1= ',' | lv_symbol_0_2= 'AND' | lv_symbol_0_3= 'OR' ) ) )
            // InternalJabuti.g:2284:3: ( (lv_symbol_0_1= ',' | lv_symbol_0_2= 'AND' | lv_symbol_0_3= 'OR' ) )
            {
            // InternalJabuti.g:2284:3: ( (lv_symbol_0_1= ',' | lv_symbol_0_2= 'AND' | lv_symbol_0_3= 'OR' ) )
            // InternalJabuti.g:2285:4: (lv_symbol_0_1= ',' | lv_symbol_0_2= 'AND' | lv_symbol_0_3= 'OR' )
            {
            // InternalJabuti.g:2285:4: (lv_symbol_0_1= ',' | lv_symbol_0_2= 'AND' | lv_symbol_0_3= 'OR' )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt34=1;
                }
                break;
            case 35:
                {
                alt34=2;
                }
                break;
            case 36:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalJabuti.g:2286:5: lv_symbol_0_1= ','
                    {
                    lv_symbol_0_1=(Token)match(input,48,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_1, grammarAccess.getLogicalOperatorAccess().getSymbolCommaKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalJabuti.g:2297:5: lv_symbol_0_2= 'AND'
                    {
                    lv_symbol_0_2=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_2, grammarAccess.getLogicalOperatorAccess().getSymbolANDKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalJabuti.g:2308:5: lv_symbol_0_3= 'OR'
                    {
                    lv_symbol_0_3=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_3, grammarAccess.getLogicalOperatorAccess().getSymbolORKeyword_0_2());
                    				

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
    // InternalJabuti.g:2324:1: entryRuleTimeInterval returns [EObject current=null] : iv_ruleTimeInterval= ruleTimeInterval EOF ;
    public final EObject entryRuleTimeInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeInterval = null;


        try {
            // InternalJabuti.g:2324:53: (iv_ruleTimeInterval= ruleTimeInterval EOF )
            // InternalJabuti.g:2325:2: iv_ruleTimeInterval= ruleTimeInterval EOF
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
    // InternalJabuti.g:2331:1: ruleTimeInterval returns [EObject current=null] : (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
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
            // InternalJabuti.g:2337:2: ( (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalJabuti.g:2338:2: (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalJabuti.g:2338:2: (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalJabuti.g:2339:3: otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeIntervalAccess().getTimeIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeIntervalAccess().getLeftParenthesisKeyword_1());
            		
            // InternalJabuti.g:2347:3: ( (lv_start_2_0= RULE_STRING ) )
            // InternalJabuti.g:2348:4: (lv_start_2_0= RULE_STRING )
            {
            // InternalJabuti.g:2348:4: (lv_start_2_0= RULE_STRING )
            // InternalJabuti.g:2349:5: lv_start_2_0= RULE_STRING
            {
            lv_start_2_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

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

            otherlv_3=(Token)match(input,53,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeIntervalAccess().getToKeyword_3());
            		
            // InternalJabuti.g:2369:3: ( (lv_end_4_0= RULE_STRING ) )
            // InternalJabuti.g:2370:4: (lv_end_4_0= RULE_STRING )
            {
            // InternalJabuti.g:2370:4: (lv_end_4_0= RULE_STRING )
            // InternalJabuti.g:2371:5: lv_end_4_0= RULE_STRING
            {
            lv_end_4_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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
    // InternalJabuti.g:2395:1: entryRuleSessionInterval returns [EObject current=null] : iv_ruleSessionInterval= ruleSessionInterval EOF ;
    public final EObject entryRuleSessionInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSessionInterval = null;


        try {
            // InternalJabuti.g:2395:56: (iv_ruleSessionInterval= ruleSessionInterval EOF )
            // InternalJabuti.g:2396:2: iv_ruleSessionInterval= ruleSessionInterval EOF
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
    // InternalJabuti.g:2402:1: ruleSessionInterval returns [EObject current=null] : (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) (otherlv_4= 'per' ( ( (lv_messageContent_5_0= ruleMessageContent ) ) | ( (lv_value_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ')' ) ;
    public final EObject ruleSessionInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_frequency_2_0=null;
        Token otherlv_4=null;
        Token lv_value_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_timeUnit_3_0 = null;

        EObject lv_messageContent_5_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:2408:2: ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) (otherlv_4= 'per' ( ( (lv_messageContent_5_0= ruleMessageContent ) ) | ( (lv_value_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ')' ) )
            // InternalJabuti.g:2409:2: (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) (otherlv_4= 'per' ( ( (lv_messageContent_5_0= ruleMessageContent ) ) | ( (lv_value_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ')' )
            {
            // InternalJabuti.g:2409:2: (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) (otherlv_4= 'per' ( ( (lv_messageContent_5_0= ruleMessageContent ) ) | ( (lv_value_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ')' )
            // InternalJabuti.g:2410:3: otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) (otherlv_4= 'per' ( ( (lv_messageContent_5_0= ruleMessageContent ) ) | ( (lv_value_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getSessionIntervalAccess().getSessionIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getSessionIntervalAccess().getLeftParenthesisKeyword_1());
            		
            // InternalJabuti.g:2418:3: ( (lv_frequency_2_0= RULE_INT ) )
            // InternalJabuti.g:2419:4: (lv_frequency_2_0= RULE_INT )
            {
            // InternalJabuti.g:2419:4: (lv_frequency_2_0= RULE_INT )
            // InternalJabuti.g:2420:5: lv_frequency_2_0= RULE_INT
            {
            lv_frequency_2_0=(Token)match(input,RULE_INT,FOLLOW_48); 

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

            // InternalJabuti.g:2436:3: ( (lv_timeUnit_3_0= ruleTimeUnit ) )
            // InternalJabuti.g:2437:4: (lv_timeUnit_3_0= ruleTimeUnit )
            {
            // InternalJabuti.g:2437:4: (lv_timeUnit_3_0= ruleTimeUnit )
            // InternalJabuti.g:2438:5: lv_timeUnit_3_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getSessionIntervalAccess().getTimeUnitTimeUnitEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_49);
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

            // InternalJabuti.g:2455:3: (otherlv_4= 'per' ( ( (lv_messageContent_5_0= ruleMessageContent ) ) | ( (lv_value_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==55) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalJabuti.g:2456:4: otherlv_4= 'per' ( ( (lv_messageContent_5_0= ruleMessageContent ) ) | ( (lv_value_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) )
                    {
                    otherlv_4=(Token)match(input,55,FOLLOW_50); 

                    				newLeafNode(otherlv_4, grammarAccess.getSessionIntervalAccess().getPerKeyword_4_0());
                    			
                    // InternalJabuti.g:2460:4: ( ( (lv_messageContent_5_0= ruleMessageContent ) ) | ( (lv_value_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) )
                    int alt35=3;
                    switch ( input.LA(1) ) {
                    case 59:
                        {
                        alt35=1;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt35=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt35=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }

                    switch (alt35) {
                        case 1 :
                            // InternalJabuti.g:2461:5: ( (lv_messageContent_5_0= ruleMessageContent ) )
                            {
                            // InternalJabuti.g:2461:5: ( (lv_messageContent_5_0= ruleMessageContent ) )
                            // InternalJabuti.g:2462:6: (lv_messageContent_5_0= ruleMessageContent )
                            {
                            // InternalJabuti.g:2462:6: (lv_messageContent_5_0= ruleMessageContent )
                            // InternalJabuti.g:2463:7: lv_messageContent_5_0= ruleMessageContent
                            {

                            							newCompositeNode(grammarAccess.getSessionIntervalAccess().getMessageContentMessageContentParserRuleCall_4_1_0_0());
                            						
                            pushFollow(FOLLOW_29);
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
                            // InternalJabuti.g:2481:5: ( (lv_value_6_0= RULE_STRING ) )
                            {
                            // InternalJabuti.g:2481:5: ( (lv_value_6_0= RULE_STRING ) )
                            // InternalJabuti.g:2482:6: (lv_value_6_0= RULE_STRING )
                            {
                            // InternalJabuti.g:2482:6: (lv_value_6_0= RULE_STRING )
                            // InternalJabuti.g:2483:7: lv_value_6_0= RULE_STRING
                            {
                            lv_value_6_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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
                            // InternalJabuti.g:2500:5: ( (otherlv_7= RULE_ID ) )
                            {
                            // InternalJabuti.g:2500:5: ( (otherlv_7= RULE_ID ) )
                            // InternalJabuti.g:2501:6: (otherlv_7= RULE_ID )
                            {
                            // InternalJabuti.g:2501:6: (otherlv_7= RULE_ID )
                            // InternalJabuti.g:2502:7: otherlv_7= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSessionIntervalRule());
                            							}
                            						
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_29); 

                            							newLeafNode(otherlv_7, grammarAccess.getSessionIntervalAccess().getVariableVariableCrossReference_4_1_2_0());
                            						

                            }


                            }


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
    // InternalJabuti.g:2523:1: entryRuleTimeout returns [EObject current=null] : iv_ruleTimeout= ruleTimeout EOF ;
    public final EObject entryRuleTimeout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeout = null;


        try {
            // InternalJabuti.g:2523:48: (iv_ruleTimeout= ruleTimeout EOF )
            // InternalJabuti.g:2524:2: iv_ruleTimeout= ruleTimeout EOF
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
    // InternalJabuti.g:2530:1: ruleTimeout returns [EObject current=null] : (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_seconds_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleTimeout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_seconds_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalJabuti.g:2536:2: ( (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_seconds_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalJabuti.g:2537:2: (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_seconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalJabuti.g:2537:2: (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_seconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalJabuti.g:2538:3: otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_seconds_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeoutAccess().getTimeoutKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeoutAccess().getLeftParenthesisKeyword_1());
            		
            // InternalJabuti.g:2546:3: ( (lv_seconds_2_0= RULE_INT ) )
            // InternalJabuti.g:2547:4: (lv_seconds_2_0= RULE_INT )
            {
            // InternalJabuti.g:2547:4: (lv_seconds_2_0= RULE_INT )
            // InternalJabuti.g:2548:5: lv_seconds_2_0= RULE_INT
            {
            lv_seconds_2_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_seconds_2_0, grammarAccess.getTimeoutAccess().getSecondsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeoutRule());
            					}
            					setWithLastConsumed(
            						current,
            						"seconds",
            						lv_seconds_2_0,
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


    // $ANTLR start "entryRuleMaxNumberOfOperation"
    // InternalJabuti.g:2572:1: entryRuleMaxNumberOfOperation returns [EObject current=null] : iv_ruleMaxNumberOfOperation= ruleMaxNumberOfOperation EOF ;
    public final EObject entryRuleMaxNumberOfOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxNumberOfOperation = null;


        try {
            // InternalJabuti.g:2572:61: (iv_ruleMaxNumberOfOperation= ruleMaxNumberOfOperation EOF )
            // InternalJabuti.g:2573:2: iv_ruleMaxNumberOfOperation= ruleMaxNumberOfOperation EOF
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
    // InternalJabuti.g:2579:1: ruleMaxNumberOfOperation returns [EObject current=null] : (otherlv_0= 'MaxNumberOfOperation' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) ( (lv_perTime_3_0= ruleTimeUnitSpec ) )? otherlv_4= ')' ) ;
    public final EObject ruleMaxNumberOfOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_operationsNumber_2_0=null;
        Token otherlv_4=null;
        EObject lv_perTime_3_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:2585:2: ( (otherlv_0= 'MaxNumberOfOperation' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) ( (lv_perTime_3_0= ruleTimeUnitSpec ) )? otherlv_4= ')' ) )
            // InternalJabuti.g:2586:2: (otherlv_0= 'MaxNumberOfOperation' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) ( (lv_perTime_3_0= ruleTimeUnitSpec ) )? otherlv_4= ')' )
            {
            // InternalJabuti.g:2586:2: (otherlv_0= 'MaxNumberOfOperation' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) ( (lv_perTime_3_0= ruleTimeUnitSpec ) )? otherlv_4= ')' )
            // InternalJabuti.g:2587:3: otherlv_0= 'MaxNumberOfOperation' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) ( (lv_perTime_3_0= ruleTimeUnitSpec ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getMaxNumberOfOperationAccess().getMaxNumberOfOperationKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxNumberOfOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalJabuti.g:2595:3: ( (lv_operationsNumber_2_0= RULE_INT ) )
            // InternalJabuti.g:2596:4: (lv_operationsNumber_2_0= RULE_INT )
            {
            // InternalJabuti.g:2596:4: (lv_operationsNumber_2_0= RULE_INT )
            // InternalJabuti.g:2597:5: lv_operationsNumber_2_0= RULE_INT
            {
            lv_operationsNumber_2_0=(Token)match(input,RULE_INT,FOLLOW_49); 

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

            // InternalJabuti.g:2613:3: ( (lv_perTime_3_0= ruleTimeUnitSpec ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==55) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalJabuti.g:2614:4: (lv_perTime_3_0= ruleTimeUnitSpec )
                    {
                    // InternalJabuti.g:2614:4: (lv_perTime_3_0= ruleTimeUnitSpec )
                    // InternalJabuti.g:2615:5: lv_perTime_3_0= ruleTimeUnitSpec
                    {

                    					newCompositeNode(grammarAccess.getMaxNumberOfOperationAccess().getPerTimeTimeUnitSpecParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_perTime_3_0=ruleTimeUnitSpec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMaxNumberOfOperationRule());
                    					}
                    					set(
                    						current,
                    						"perTime",
                    						lv_perTime_3_0,
                    						"br.edu.unijui.gca.jabuti.Jabuti.TimeUnitSpec");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMaxNumberOfOperationAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalJabuti.g:2640:1: entryRuleWeekDaysInterval returns [EObject current=null] : iv_ruleWeekDaysInterval= ruleWeekDaysInterval EOF ;
    public final EObject entryRuleWeekDaysInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeekDaysInterval = null;


        try {
            // InternalJabuti.g:2640:57: (iv_ruleWeekDaysInterval= ruleWeekDaysInterval EOF )
            // InternalJabuti.g:2641:2: iv_ruleWeekDaysInterval= ruleWeekDaysInterval EOF
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
    // InternalJabuti.g:2647:1: ruleWeekDaysInterval returns [EObject current=null] : (otherlv_0= 'WeekDaysInterval' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' ) ;
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
            // InternalJabuti.g:2653:2: ( (otherlv_0= 'WeekDaysInterval' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' ) )
            // InternalJabuti.g:2654:2: (otherlv_0= 'WeekDaysInterval' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' )
            {
            // InternalJabuti.g:2654:2: (otherlv_0= 'WeekDaysInterval' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' )
            // InternalJabuti.g:2655:3: otherlv_0= 'WeekDaysInterval' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getWeekDaysIntervalAccess().getWeekDaysIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getWeekDaysIntervalAccess().getLeftParenthesisKeyword_1());
            		
            // InternalJabuti.g:2663:3: ( (lv_start_2_0= ruleWeekDay ) )
            // InternalJabuti.g:2664:4: (lv_start_2_0= ruleWeekDay )
            {
            // InternalJabuti.g:2664:4: (lv_start_2_0= ruleWeekDay )
            // InternalJabuti.g:2665:5: lv_start_2_0= ruleWeekDay
            {

            					newCompositeNode(grammarAccess.getWeekDaysIntervalAccess().getStartWeekDayEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_46);
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

            otherlv_3=(Token)match(input,53,FOLLOW_51); 

            			newLeafNode(otherlv_3, grammarAccess.getWeekDaysIntervalAccess().getToKeyword_3());
            		
            // InternalJabuti.g:2686:3: ( (lv_end_4_0= ruleWeekDay ) )
            // InternalJabuti.g:2687:4: (lv_end_4_0= ruleWeekDay )
            {
            // InternalJabuti.g:2687:4: (lv_end_4_0= ruleWeekDay )
            // InternalJabuti.g:2688:5: lv_end_4_0= ruleWeekDay
            {

            					newCompositeNode(grammarAccess.getWeekDaysIntervalAccess().getEndWeekDayEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_29);
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
    // InternalJabuti.g:2713:1: entryRuleMessageContent returns [EObject current=null] : iv_ruleMessageContent= ruleMessageContent EOF ;
    public final EObject entryRuleMessageContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageContent = null;


        try {
            // InternalJabuti.g:2713:55: (iv_ruleMessageContent= ruleMessageContent EOF )
            // InternalJabuti.g:2714:2: iv_ruleMessageContent= ruleMessageContent EOF
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
    // InternalJabuti.g:2720:1: ruleMessageContent returns [EObject current=null] : (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_returnType_2_0= ruleDataType ) ) otherlv_3= '(' ( ( (lv_content_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' ( ( (lv_comparisonOperator_7_0= ruleComparisonOperator ) ) ( (lv_expression_8_0= ruleExpression ) ) ( (lv_perTime_9_0= ruleTimeUnitSpec ) )? )? otherlv_10= ')' ) ;
    public final EObject ruleMessageContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_content_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Enumerator lv_returnType_2_0 = null;

        EObject lv_comparisonOperator_7_0 = null;

        EObject lv_expression_8_0 = null;

        EObject lv_perTime_9_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:2726:2: ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_returnType_2_0= ruleDataType ) ) otherlv_3= '(' ( ( (lv_content_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' ( ( (lv_comparisonOperator_7_0= ruleComparisonOperator ) ) ( (lv_expression_8_0= ruleExpression ) ) ( (lv_perTime_9_0= ruleTimeUnitSpec ) )? )? otherlv_10= ')' ) )
            // InternalJabuti.g:2727:2: (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_returnType_2_0= ruleDataType ) ) otherlv_3= '(' ( ( (lv_content_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' ( ( (lv_comparisonOperator_7_0= ruleComparisonOperator ) ) ( (lv_expression_8_0= ruleExpression ) ) ( (lv_perTime_9_0= ruleTimeUnitSpec ) )? )? otherlv_10= ')' )
            {
            // InternalJabuti.g:2727:2: (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_returnType_2_0= ruleDataType ) ) otherlv_3= '(' ( ( (lv_content_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' ( ( (lv_comparisonOperator_7_0= ruleComparisonOperator ) ) ( (lv_expression_8_0= ruleExpression ) ) ( (lv_perTime_9_0= ruleTimeUnitSpec ) )? )? otherlv_10= ')' )
            // InternalJabuti.g:2728:3: otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_returnType_2_0= ruleDataType ) ) otherlv_3= '(' ( ( (lv_content_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' ( ( (lv_comparisonOperator_7_0= ruleComparisonOperator ) ) ( (lv_expression_8_0= ruleExpression ) ) ( (lv_perTime_9_0= ruleTimeUnitSpec ) )? )? otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageContentAccess().getMessageContentKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalJabuti.g:2736:3: ( (lv_returnType_2_0= ruleDataType ) )
            // InternalJabuti.g:2737:4: (lv_returnType_2_0= ruleDataType )
            {
            // InternalJabuti.g:2737:4: (lv_returnType_2_0= ruleDataType )
            // InternalJabuti.g:2738:5: lv_returnType_2_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getMessageContentAccess().getReturnTypeDataTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_returnType_2_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageContentRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_2_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_3());
            		
            // InternalJabuti.g:2759:3: ( ( (lv_content_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_ID) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalJabuti.g:2760:4: ( (lv_content_4_0= RULE_STRING ) )
                    {
                    // InternalJabuti.g:2760:4: ( (lv_content_4_0= RULE_STRING ) )
                    // InternalJabuti.g:2761:5: (lv_content_4_0= RULE_STRING )
                    {
                    // InternalJabuti.g:2761:5: (lv_content_4_0= RULE_STRING )
                    // InternalJabuti.g:2762:6: lv_content_4_0= RULE_STRING
                    {
                    lv_content_4_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

                    						newLeafNode(lv_content_4_0, grammarAccess.getMessageContentAccess().getContentSTRINGTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageContentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJabuti.g:2779:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalJabuti.g:2779:4: ( (otherlv_5= RULE_ID ) )
                    // InternalJabuti.g:2780:5: (otherlv_5= RULE_ID )
                    {
                    // InternalJabuti.g:2780:5: (otherlv_5= RULE_ID )
                    // InternalJabuti.g:2781:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageContentRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_5, grammarAccess.getMessageContentAccess().getVariableVariableCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_53); 

            			newLeafNode(otherlv_6, grammarAccess.getMessageContentAccess().getRightParenthesisKeyword_5());
            		
            // InternalJabuti.g:2797:3: ( ( (lv_comparisonOperator_7_0= ruleComparisonOperator ) ) ( (lv_expression_8_0= ruleExpression ) ) ( (lv_perTime_9_0= ruleTimeUnitSpec ) )? )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=38 && LA40_0<=43)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalJabuti.g:2798:4: ( (lv_comparisonOperator_7_0= ruleComparisonOperator ) ) ( (lv_expression_8_0= ruleExpression ) ) ( (lv_perTime_9_0= ruleTimeUnitSpec ) )?
                    {
                    // InternalJabuti.g:2798:4: ( (lv_comparisonOperator_7_0= ruleComparisonOperator ) )
                    // InternalJabuti.g:2799:5: (lv_comparisonOperator_7_0= ruleComparisonOperator )
                    {
                    // InternalJabuti.g:2799:5: (lv_comparisonOperator_7_0= ruleComparisonOperator )
                    // InternalJabuti.g:2800:6: lv_comparisonOperator_7_0= ruleComparisonOperator
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getComparisonOperatorComparisonOperatorParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_comparisonOperator_7_0=ruleComparisonOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageContentRule());
                    						}
                    						set(
                    							current,
                    							"comparisonOperator",
                    							lv_comparisonOperator_7_0,
                    							"br.edu.unijui.gca.jabuti.Jabuti.ComparisonOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJabuti.g:2817:4: ( (lv_expression_8_0= ruleExpression ) )
                    // InternalJabuti.g:2818:5: (lv_expression_8_0= ruleExpression )
                    {
                    // InternalJabuti.g:2818:5: (lv_expression_8_0= ruleExpression )
                    // InternalJabuti.g:2819:6: lv_expression_8_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getExpressionExpressionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_expression_8_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageContentRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_8_0,
                    							"br.edu.unijui.gca.jabuti.Jabuti.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJabuti.g:2836:4: ( (lv_perTime_9_0= ruleTimeUnitSpec ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==55) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalJabuti.g:2837:5: (lv_perTime_9_0= ruleTimeUnitSpec )
                            {
                            // InternalJabuti.g:2837:5: (lv_perTime_9_0= ruleTimeUnitSpec )
                            // InternalJabuti.g:2838:6: lv_perTime_9_0= ruleTimeUnitSpec
                            {

                            						newCompositeNode(grammarAccess.getMessageContentAccess().getPerTimeTimeUnitSpecParserRuleCall_6_2_0());
                            					
                            pushFollow(FOLLOW_29);
                            lv_perTime_9_0=ruleTimeUnitSpec();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getMessageContentRule());
                            						}
                            						set(
                            							current,
                            							"perTime",
                            							lv_perTime_9_0,
                            							"br.edu.unijui.gca.jabuti.Jabuti.TimeUnitSpec");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMessageContentAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleTimeUnitSpec"
    // InternalJabuti.g:2864:1: entryRuleTimeUnitSpec returns [EObject current=null] : iv_ruleTimeUnitSpec= ruleTimeUnitSpec EOF ;
    public final EObject entryRuleTimeUnitSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeUnitSpec = null;


        try {
            // InternalJabuti.g:2864:53: (iv_ruleTimeUnitSpec= ruleTimeUnitSpec EOF )
            // InternalJabuti.g:2865:2: iv_ruleTimeUnitSpec= ruleTimeUnitSpec EOF
            {
             newCompositeNode(grammarAccess.getTimeUnitSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeUnitSpec=ruleTimeUnitSpec();

            state._fsp--;

             current =iv_ruleTimeUnitSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeUnitSpec"


    // $ANTLR start "ruleTimeUnitSpec"
    // InternalJabuti.g:2871:1: ruleTimeUnitSpec returns [EObject current=null] : (otherlv_0= 'per' ( (lv_timeUnit_1_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTimeUnitSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_timeUnit_1_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:2877:2: ( (otherlv_0= 'per' ( (lv_timeUnit_1_0= ruleTimeUnit ) ) ) )
            // InternalJabuti.g:2878:2: (otherlv_0= 'per' ( (lv_timeUnit_1_0= ruleTimeUnit ) ) )
            {
            // InternalJabuti.g:2878:2: (otherlv_0= 'per' ( (lv_timeUnit_1_0= ruleTimeUnit ) ) )
            // InternalJabuti.g:2879:3: otherlv_0= 'per' ( (lv_timeUnit_1_0= ruleTimeUnit ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeUnitSpecAccess().getPerKeyword_0());
            		
            // InternalJabuti.g:2883:3: ( (lv_timeUnit_1_0= ruleTimeUnit ) )
            // InternalJabuti.g:2884:4: (lv_timeUnit_1_0= ruleTimeUnit )
            {
            // InternalJabuti.g:2884:4: (lv_timeUnit_1_0= ruleTimeUnit )
            // InternalJabuti.g:2885:5: lv_timeUnit_1_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getTimeUnitSpecAccess().getTimeUnitTimeUnitEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_timeUnit_1_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeUnitSpecRule());
            					}
            					set(
            						current,
            						"timeUnit",
            						lv_timeUnit_1_0,
            						"br.edu.unijui.gca.jabuti.Jabuti.TimeUnit");
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
    // $ANTLR end "ruleTimeUnitSpec"


    // $ANTLR start "entryRuleComparisonOperator"
    // InternalJabuti.g:2906:1: entryRuleComparisonOperator returns [EObject current=null] : iv_ruleComparisonOperator= ruleComparisonOperator EOF ;
    public final EObject entryRuleComparisonOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperator = null;


        try {
            // InternalJabuti.g:2906:59: (iv_ruleComparisonOperator= ruleComparisonOperator EOF )
            // InternalJabuti.g:2907:2: iv_ruleComparisonOperator= ruleComparisonOperator EOF
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
    // InternalJabuti.g:2913:1: ruleComparisonOperator returns [EObject current=null] : ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) ) ;
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
            // InternalJabuti.g:2919:2: ( ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) ) )
            // InternalJabuti.g:2920:2: ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) )
            {
            // InternalJabuti.g:2920:2: ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) )
            int alt41=6;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt41=1;
                }
                break;
            case 39:
                {
                alt41=2;
                }
                break;
            case 40:
                {
                alt41=3;
                }
                break;
            case 41:
                {
                alt41=4;
                }
                break;
            case 42:
                {
                alt41=5;
                }
                break;
            case 43:
                {
                alt41=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalJabuti.g:2921:3: ( (lv_symbol_0_0= '<=' ) )
                    {
                    // InternalJabuti.g:2921:3: ( (lv_symbol_0_0= '<=' ) )
                    // InternalJabuti.g:2922:4: (lv_symbol_0_0= '<=' )
                    {
                    // InternalJabuti.g:2922:4: (lv_symbol_0_0= '<=' )
                    // InternalJabuti.g:2923:5: lv_symbol_0_0= '<='
                    {
                    lv_symbol_0_0=(Token)match(input,38,FOLLOW_2); 

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
                    // InternalJabuti.g:2936:3: ( (lv_symbol_1_0= '>=' ) )
                    {
                    // InternalJabuti.g:2936:3: ( (lv_symbol_1_0= '>=' ) )
                    // InternalJabuti.g:2937:4: (lv_symbol_1_0= '>=' )
                    {
                    // InternalJabuti.g:2937:4: (lv_symbol_1_0= '>=' )
                    // InternalJabuti.g:2938:5: lv_symbol_1_0= '>='
                    {
                    lv_symbol_1_0=(Token)match(input,39,FOLLOW_2); 

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
                    // InternalJabuti.g:2951:3: ( (lv_symbol_2_0= '>' ) )
                    {
                    // InternalJabuti.g:2951:3: ( (lv_symbol_2_0= '>' ) )
                    // InternalJabuti.g:2952:4: (lv_symbol_2_0= '>' )
                    {
                    // InternalJabuti.g:2952:4: (lv_symbol_2_0= '>' )
                    // InternalJabuti.g:2953:5: lv_symbol_2_0= '>'
                    {
                    lv_symbol_2_0=(Token)match(input,40,FOLLOW_2); 

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
                    // InternalJabuti.g:2966:3: ( (lv_symbol_3_0= '<' ) )
                    {
                    // InternalJabuti.g:2966:3: ( (lv_symbol_3_0= '<' ) )
                    // InternalJabuti.g:2967:4: (lv_symbol_3_0= '<' )
                    {
                    // InternalJabuti.g:2967:4: (lv_symbol_3_0= '<' )
                    // InternalJabuti.g:2968:5: lv_symbol_3_0= '<'
                    {
                    lv_symbol_3_0=(Token)match(input,41,FOLLOW_2); 

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
                    // InternalJabuti.g:2981:3: ( (lv_symbol_4_0= '!=' ) )
                    {
                    // InternalJabuti.g:2981:3: ( (lv_symbol_4_0= '!=' ) )
                    // InternalJabuti.g:2982:4: (lv_symbol_4_0= '!=' )
                    {
                    // InternalJabuti.g:2982:4: (lv_symbol_4_0= '!=' )
                    // InternalJabuti.g:2983:5: lv_symbol_4_0= '!='
                    {
                    lv_symbol_4_0=(Token)match(input,42,FOLLOW_2); 

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
                    // InternalJabuti.g:2996:3: ( (lv_symbol_5_0= '==' ) )
                    {
                    // InternalJabuti.g:2996:3: ( (lv_symbol_5_0= '==' ) )
                    // InternalJabuti.g:2997:4: (lv_symbol_5_0= '==' )
                    {
                    // InternalJabuti.g:2997:4: (lv_symbol_5_0= '==' )
                    // InternalJabuti.g:2998:5: lv_symbol_5_0= '=='
                    {
                    lv_symbol_5_0=(Token)match(input,43,FOLLOW_2); 

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
    // InternalJabuti.g:3014:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalJabuti.g:3014:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalJabuti.g:3015:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalJabuti.g:3021:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalJabuti.g:3027:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalJabuti.g:3028:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalJabuti.g:3028:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalJabuti.g:3029:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_54); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalJabuti.g:3036:3: (kw= '.' this_ID_2= RULE_ID )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==60) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalJabuti.g:3037:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,60,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_54); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalJabuti.g:3054:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalJabuti.g:3054:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalJabuti.g:3055:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalJabuti.g:3061:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalJabuti.g:3067:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.*' ) )
            // InternalJabuti.g:3068:2: (this_QualifiedName_0= ruleQualifiedName kw= '.*' )
            {
            // InternalJabuti.g:3068:2: (this_QualifiedName_0= ruleQualifiedName kw= '.*' )
            // InternalJabuti.g:3069:3: this_QualifiedName_0= ruleQualifiedName kw= '.*'
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_55);
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


    // $ANTLR start "ruleRolePlayer"
    // InternalJabuti.g:3088:1: ruleRolePlayer returns [Enumerator current=null] : ( (enumLiteral_0= 'application' ) | (enumLiteral_1= 'process' ) ) ;
    public final Enumerator ruleRolePlayer() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJabuti.g:3094:2: ( ( (enumLiteral_0= 'application' ) | (enumLiteral_1= 'process' ) ) )
            // InternalJabuti.g:3095:2: ( (enumLiteral_0= 'application' ) | (enumLiteral_1= 'process' ) )
            {
            // InternalJabuti.g:3095:2: ( (enumLiteral_0= 'application' ) | (enumLiteral_1= 'process' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==28) ) {
                alt43=1;
            }
            else if ( (LA43_0==29) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalJabuti.g:3096:3: (enumLiteral_0= 'application' )
                    {
                    // InternalJabuti.g:3096:3: (enumLiteral_0= 'application' )
                    // InternalJabuti.g:3097:4: enumLiteral_0= 'application'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getRolePlayerAccess().getAPPLICATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRolePlayerAccess().getAPPLICATIONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJabuti.g:3104:3: (enumLiteral_1= 'process' )
                    {
                    // InternalJabuti.g:3104:3: (enumLiteral_1= 'process' )
                    // InternalJabuti.g:3105:4: enumLiteral_1= 'process'
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
    // InternalJabuti.g:3115:1: ruleOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) ) ;
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
            // InternalJabuti.g:3121:2: ( ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) ) )
            // InternalJabuti.g:3122:2: ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) )
            {
            // InternalJabuti.g:3122:2: ( (enumLiteral_0= 'push' ) | (enumLiteral_1= 'poll' ) | (enumLiteral_2= 'write' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'request' ) | (enumLiteral_5= 'response' ) )
            int alt44=6;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt44=1;
                }
                break;
            case 63:
                {
                alt44=2;
                }
                break;
            case 64:
                {
                alt44=3;
                }
                break;
            case 65:
                {
                alt44=4;
                }
                break;
            case 66:
                {
                alt44=5;
                }
                break;
            case 67:
                {
                alt44=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalJabuti.g:3123:3: (enumLiteral_0= 'push' )
                    {
                    // InternalJabuti.g:3123:3: (enumLiteral_0= 'push' )
                    // InternalJabuti.g:3124:4: enumLiteral_0= 'push'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getPUSHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationAccess().getPUSHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJabuti.g:3131:3: (enumLiteral_1= 'poll' )
                    {
                    // InternalJabuti.g:3131:3: (enumLiteral_1= 'poll' )
                    // InternalJabuti.g:3132:4: enumLiteral_1= 'poll'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getPOLLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationAccess().getPOLLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJabuti.g:3139:3: (enumLiteral_2= 'write' )
                    {
                    // InternalJabuti.g:3139:3: (enumLiteral_2= 'write' )
                    // InternalJabuti.g:3140:4: enumLiteral_2= 'write'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getWRITEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperationAccess().getWRITEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJabuti.g:3147:3: (enumLiteral_3= 'read' )
                    {
                    // InternalJabuti.g:3147:3: (enumLiteral_3= 'read' )
                    // InternalJabuti.g:3148:4: enumLiteral_3= 'read'
                    {
                    enumLiteral_3=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getREADEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperationAccess().getREADEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJabuti.g:3155:3: (enumLiteral_4= 'request' )
                    {
                    // InternalJabuti.g:3155:3: (enumLiteral_4= 'request' )
                    // InternalJabuti.g:3156:4: enumLiteral_4= 'request'
                    {
                    enumLiteral_4=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getREQUESTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperationAccess().getREQUESTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJabuti.g:3163:3: (enumLiteral_5= 'response' )
                    {
                    // InternalJabuti.g:3163:3: (enumLiteral_5= 'response' )
                    // InternalJabuti.g:3164:4: enumLiteral_5= 'response'
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
    // InternalJabuti.g:3174:1: ruleWeekDay returns [Enumerator current=null] : ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) ) ;
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
            // InternalJabuti.g:3180:2: ( ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) ) )
            // InternalJabuti.g:3181:2: ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) )
            {
            // InternalJabuti.g:3181:2: ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) )
            int alt45=7;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt45=1;
                }
                break;
            case 69:
                {
                alt45=2;
                }
                break;
            case 70:
                {
                alt45=3;
                }
                break;
            case 71:
                {
                alt45=4;
                }
                break;
            case 72:
                {
                alt45=5;
                }
                break;
            case 73:
                {
                alt45=6;
                }
                break;
            case 74:
                {
                alt45=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalJabuti.g:3182:3: (enumLiteral_0= 'Sunday' )
                    {
                    // InternalJabuti.g:3182:3: (enumLiteral_0= 'Sunday' )
                    // InternalJabuti.g:3183:4: enumLiteral_0= 'Sunday'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getSUNDAYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWeekDayAccess().getSUNDAYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJabuti.g:3190:3: (enumLiteral_1= 'Monday' )
                    {
                    // InternalJabuti.g:3190:3: (enumLiteral_1= 'Monday' )
                    // InternalJabuti.g:3191:4: enumLiteral_1= 'Monday'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getMONDAYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWeekDayAccess().getMONDAYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJabuti.g:3198:3: (enumLiteral_2= 'Tuesday' )
                    {
                    // InternalJabuti.g:3198:3: (enumLiteral_2= 'Tuesday' )
                    // InternalJabuti.g:3199:4: enumLiteral_2= 'Tuesday'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTUESDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWeekDayAccess().getTUESDAYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJabuti.g:3206:3: (enumLiteral_3= 'Wednesday' )
                    {
                    // InternalJabuti.g:3206:3: (enumLiteral_3= 'Wednesday' )
                    // InternalJabuti.g:3207:4: enumLiteral_3= 'Wednesday'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getWEDNESDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWeekDayAccess().getWEDNESDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJabuti.g:3214:3: (enumLiteral_4= 'Thursday' )
                    {
                    // InternalJabuti.g:3214:3: (enumLiteral_4= 'Thursday' )
                    // InternalJabuti.g:3215:4: enumLiteral_4= 'Thursday'
                    {
                    enumLiteral_4=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTHURSDAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWeekDayAccess().getTHURSDAYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJabuti.g:3222:3: (enumLiteral_5= 'Friday' )
                    {
                    // InternalJabuti.g:3222:3: (enumLiteral_5= 'Friday' )
                    // InternalJabuti.g:3223:4: enumLiteral_5= 'Friday'
                    {
                    enumLiteral_5=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getFRIDAYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWeekDayAccess().getFRIDAYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJabuti.g:3230:3: (enumLiteral_6= 'Saturday' )
                    {
                    // InternalJabuti.g:3230:3: (enumLiteral_6= 'Saturday' )
                    // InternalJabuti.g:3231:4: enumLiteral_6= 'Saturday'
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
    // InternalJabuti.g:3241:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) ) ;
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
            // InternalJabuti.g:3247:2: ( ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) ) )
            // InternalJabuti.g:3248:2: ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) )
            {
            // InternalJabuti.g:3248:2: ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) )
            int alt46=7;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt46=1;
                }
                break;
            case 76:
                {
                alt46=2;
                }
                break;
            case 77:
                {
                alt46=3;
                }
                break;
            case 78:
                {
                alt46=4;
                }
                break;
            case 79:
                {
                alt46=5;
                }
                break;
            case 80:
                {
                alt46=6;
                }
                break;
            case 81:
                {
                alt46=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalJabuti.g:3249:3: (enumLiteral_0= 'Second' )
                    {
                    // InternalJabuti.g:3249:3: (enumLiteral_0= 'Second' )
                    // InternalJabuti.g:3250:4: enumLiteral_0= 'Second'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getSECONDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSECONDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJabuti.g:3257:3: (enumLiteral_1= 'Minute' )
                    {
                    // InternalJabuti.g:3257:3: (enumLiteral_1= 'Minute' )
                    // InternalJabuti.g:3258:4: enumLiteral_1= 'Minute'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJabuti.g:3265:3: (enumLiteral_2= 'Hour' )
                    {
                    // InternalJabuti.g:3265:3: (enumLiteral_2= 'Hour' )
                    // InternalJabuti.g:3266:4: enumLiteral_2= 'Hour'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJabuti.g:3273:3: (enumLiteral_3= 'Day' )
                    {
                    // InternalJabuti.g:3273:3: (enumLiteral_3= 'Day' )
                    // InternalJabuti.g:3274:4: enumLiteral_3= 'Day'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJabuti.g:3281:3: (enumLiteral_4= 'Week' )
                    {
                    // InternalJabuti.g:3281:3: (enumLiteral_4= 'Week' )
                    // InternalJabuti.g:3282:4: enumLiteral_4= 'Week'
                    {
                    enumLiteral_4=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJabuti.g:3289:3: (enumLiteral_5= 'Month' )
                    {
                    // InternalJabuti.g:3289:3: (enumLiteral_5= 'Month' )
                    // InternalJabuti.g:3290:4: enumLiteral_5= 'Month'
                    {
                    enumLiteral_5=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMONTHEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTimeUnitAccess().getMONTHEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJabuti.g:3297:3: (enumLiteral_6= 'Year' )
                    {
                    // InternalJabuti.g:3297:3: (enumLiteral_6= 'Year' )
                    // InternalJabuti.g:3298:4: enumLiteral_6= 'Year'
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


    // $ANTLR start "ruleDataType"
    // InternalJabuti.g:3308:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'numeric' ) | (enumLiteral_2= 'boolean' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJabuti.g:3314:2: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'numeric' ) | (enumLiteral_2= 'boolean' ) ) )
            // InternalJabuti.g:3315:2: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'numeric' ) | (enumLiteral_2= 'boolean' ) )
            {
            // InternalJabuti.g:3315:2: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'numeric' ) | (enumLiteral_2= 'boolean' ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt47=1;
                }
                break;
            case 83:
                {
                alt47=2;
                }
                break;
            case 84:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalJabuti.g:3316:3: (enumLiteral_0= 'text' )
                    {
                    // InternalJabuti.g:3316:3: (enumLiteral_0= 'text' )
                    // InternalJabuti.g:3317:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getTEXTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getTEXTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJabuti.g:3324:3: (enumLiteral_1= 'numeric' )
                    {
                    // InternalJabuti.g:3324:3: (enumLiteral_1= 'numeric' )
                    // InternalJabuti.g:3325:4: enumLiteral_1= 'numeric'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getNUMERICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getNUMERICEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJabuti.g:3332:3: (enumLiteral_2= 'boolean' )
                    {
                    // InternalJabuti.g:3332:3: (enumLiteral_2= 'boolean' )
                    // InternalJabuti.g:3333:4: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleDataType"

    // Delegated rules


 

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
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0xC000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0F57001880000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000440040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000202080000070L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200080000070L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080000070L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0F55203880000070L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001001000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0F55001880000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00010FDA00000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001001A00000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001001800000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x000000000003F800L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0080000200000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0F55001880000030L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007F0L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x00000000001C0000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00000FC200000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x2000000000000000L});

}