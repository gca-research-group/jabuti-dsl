package br.edu.unijui.gca.jabuti.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import br.edu.unijui.gca.jabuti.services.JabutiGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJabutiParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application'", "'process'", "'import'", "'contract'", "'{'", "'parties'", "'}'", "'clauses'", "'rolePlayer'", "'='", "'right'", "'obligation'", "'prohibition'", "'.'", "'.*'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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

    	public void setGrammarAccess(JabutiGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalJabuti.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalJabuti.g:54:1: ( ruleModel EOF )
            // InternalJabuti.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalJabuti.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalJabuti.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalJabuti.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalJabuti.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalJabuti.g:69:3: ( rule__Model__Group__0 )
            // InternalJabuti.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // InternalJabuti.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalJabuti.g:79:1: ( ruleImport EOF )
            // InternalJabuti.g:80:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalJabuti.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalJabuti.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalJabuti.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalJabuti.g:93:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalJabuti.g:94:3: ( rule__Import__Group__0 )
            // InternalJabuti.g:94:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleContract"
    // InternalJabuti.g:103:1: entryRuleContract : ruleContract EOF ;
    public final void entryRuleContract() throws RecognitionException {
        try {
            // InternalJabuti.g:104:1: ( ruleContract EOF )
            // InternalJabuti.g:105:1: ruleContract EOF
            {
             before(grammarAccess.getContractRule()); 
            pushFollow(FOLLOW_1);
            ruleContract();

            state._fsp--;

             after(grammarAccess.getContractRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContract"


    // $ANTLR start "ruleContract"
    // InternalJabuti.g:112:1: ruleContract : ( ( rule__Contract__Group__0 ) ) ;
    public final void ruleContract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:116:2: ( ( ( rule__Contract__Group__0 ) ) )
            // InternalJabuti.g:117:2: ( ( rule__Contract__Group__0 ) )
            {
            // InternalJabuti.g:117:2: ( ( rule__Contract__Group__0 ) )
            // InternalJabuti.g:118:3: ( rule__Contract__Group__0 )
            {
             before(grammarAccess.getContractAccess().getGroup()); 
            // InternalJabuti.g:119:3: ( rule__Contract__Group__0 )
            // InternalJabuti.g:119:4: rule__Contract__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Contract__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContractAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContract"


    // $ANTLR start "entryRuleClause"
    // InternalJabuti.g:128:1: entryRuleClause : ruleClause EOF ;
    public final void entryRuleClause() throws RecognitionException {
        try {
            // InternalJabuti.g:129:1: ( ruleClause EOF )
            // InternalJabuti.g:130:1: ruleClause EOF
            {
             before(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getClauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClause"


    // $ANTLR start "ruleClause"
    // InternalJabuti.g:137:1: ruleClause : ( ( rule__Clause__Group__0 ) ) ;
    public final void ruleClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:141:2: ( ( ( rule__Clause__Group__0 ) ) )
            // InternalJabuti.g:142:2: ( ( rule__Clause__Group__0 ) )
            {
            // InternalJabuti.g:142:2: ( ( rule__Clause__Group__0 ) )
            // InternalJabuti.g:143:3: ( rule__Clause__Group__0 )
            {
             before(grammarAccess.getClauseAccess().getGroup()); 
            // InternalJabuti.g:144:3: ( rule__Clause__Group__0 )
            // InternalJabuti.g:144:4: rule__Clause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Clause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleRight"
    // InternalJabuti.g:153:1: entryRuleRight : ruleRight EOF ;
    public final void entryRuleRight() throws RecognitionException {
        try {
            // InternalJabuti.g:154:1: ( ruleRight EOF )
            // InternalJabuti.g:155:1: ruleRight EOF
            {
             before(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_1);
            ruleRight();

            state._fsp--;

             after(grammarAccess.getRightRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // InternalJabuti.g:162:1: ruleRight : ( ( rule__Right__Group__0 ) ) ;
    public final void ruleRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:166:2: ( ( ( rule__Right__Group__0 ) ) )
            // InternalJabuti.g:167:2: ( ( rule__Right__Group__0 ) )
            {
            // InternalJabuti.g:167:2: ( ( rule__Right__Group__0 ) )
            // InternalJabuti.g:168:3: ( rule__Right__Group__0 )
            {
             before(grammarAccess.getRightAccess().getGroup()); 
            // InternalJabuti.g:169:3: ( rule__Right__Group__0 )
            // InternalJabuti.g:169:4: rule__Right__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Right__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleObligation"
    // InternalJabuti.g:178:1: entryRuleObligation : ruleObligation EOF ;
    public final void entryRuleObligation() throws RecognitionException {
        try {
            // InternalJabuti.g:179:1: ( ruleObligation EOF )
            // InternalJabuti.g:180:1: ruleObligation EOF
            {
             before(grammarAccess.getObligationRule()); 
            pushFollow(FOLLOW_1);
            ruleObligation();

            state._fsp--;

             after(grammarAccess.getObligationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObligation"


    // $ANTLR start "ruleObligation"
    // InternalJabuti.g:187:1: ruleObligation : ( ( rule__Obligation__Group__0 ) ) ;
    public final void ruleObligation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:191:2: ( ( ( rule__Obligation__Group__0 ) ) )
            // InternalJabuti.g:192:2: ( ( rule__Obligation__Group__0 ) )
            {
            // InternalJabuti.g:192:2: ( ( rule__Obligation__Group__0 ) )
            // InternalJabuti.g:193:3: ( rule__Obligation__Group__0 )
            {
             before(grammarAccess.getObligationAccess().getGroup()); 
            // InternalJabuti.g:194:3: ( rule__Obligation__Group__0 )
            // InternalJabuti.g:194:4: rule__Obligation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Obligation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObligationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObligation"


    // $ANTLR start "entryRuleProhibition"
    // InternalJabuti.g:203:1: entryRuleProhibition : ruleProhibition EOF ;
    public final void entryRuleProhibition() throws RecognitionException {
        try {
            // InternalJabuti.g:204:1: ( ruleProhibition EOF )
            // InternalJabuti.g:205:1: ruleProhibition EOF
            {
             before(grammarAccess.getProhibitionRule()); 
            pushFollow(FOLLOW_1);
            ruleProhibition();

            state._fsp--;

             after(grammarAccess.getProhibitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProhibition"


    // $ANTLR start "ruleProhibition"
    // InternalJabuti.g:212:1: ruleProhibition : ( ( rule__Prohibition__Group__0 ) ) ;
    public final void ruleProhibition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:216:2: ( ( ( rule__Prohibition__Group__0 ) ) )
            // InternalJabuti.g:217:2: ( ( rule__Prohibition__Group__0 ) )
            {
            // InternalJabuti.g:217:2: ( ( rule__Prohibition__Group__0 ) )
            // InternalJabuti.g:218:3: ( rule__Prohibition__Group__0 )
            {
             before(grammarAccess.getProhibitionAccess().getGroup()); 
            // InternalJabuti.g:219:3: ( rule__Prohibition__Group__0 )
            // InternalJabuti.g:219:4: rule__Prohibition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Prohibition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProhibitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProhibition"


    // $ANTLR start "entryRuleApplication"
    // InternalJabuti.g:228:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // InternalJabuti.g:229:1: ( ruleApplication EOF )
            // InternalJabuti.g:230:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalJabuti.g:237:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:241:2: ( ( ( rule__Application__Group__0 ) ) )
            // InternalJabuti.g:242:2: ( ( rule__Application__Group__0 ) )
            {
            // InternalJabuti.g:242:2: ( ( rule__Application__Group__0 ) )
            // InternalJabuti.g:243:3: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // InternalJabuti.g:244:3: ( rule__Application__Group__0 )
            // InternalJabuti.g:244:4: rule__Application__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleProcess"
    // InternalJabuti.g:253:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalJabuti.g:254:1: ( ruleProcess EOF )
            // InternalJabuti.g:255:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalJabuti.g:262:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:266:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalJabuti.g:267:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalJabuti.g:267:2: ( ( rule__Process__Group__0 ) )
            // InternalJabuti.g:268:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalJabuti.g:269:3: ( rule__Process__Group__0 )
            // InternalJabuti.g:269:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalJabuti.g:278:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalJabuti.g:279:1: ( ruleQualifiedName EOF )
            // InternalJabuti.g:280:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalJabuti.g:287:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:291:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalJabuti.g:292:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalJabuti.g:292:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalJabuti.g:293:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalJabuti.g:294:3: ( rule__QualifiedName__Group__0 )
            // InternalJabuti.g:294:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalJabuti.g:303:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalJabuti.g:304:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalJabuti.g:305:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalJabuti.g:312:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:316:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalJabuti.g:317:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalJabuti.g:317:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalJabuti.g:318:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalJabuti.g:319:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalJabuti.g:319:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "ruleRolePlayer"
    // InternalJabuti.g:328:1: ruleRolePlayer : ( ( rule__RolePlayer__Alternatives ) ) ;
    public final void ruleRolePlayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:332:1: ( ( ( rule__RolePlayer__Alternatives ) ) )
            // InternalJabuti.g:333:2: ( ( rule__RolePlayer__Alternatives ) )
            {
            // InternalJabuti.g:333:2: ( ( rule__RolePlayer__Alternatives ) )
            // InternalJabuti.g:334:3: ( rule__RolePlayer__Alternatives )
            {
             before(grammarAccess.getRolePlayerAccess().getAlternatives()); 
            // InternalJabuti.g:335:3: ( rule__RolePlayer__Alternatives )
            // InternalJabuti.g:335:4: rule__RolePlayer__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RolePlayer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRolePlayerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRolePlayer"


    // $ANTLR start "rule__Clause__Alternatives_0"
    // InternalJabuti.g:343:1: rule__Clause__Alternatives_0 : ( ( ruleRight ) | ( ruleProhibition ) | ( ruleObligation ) );
    public final void rule__Clause__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:347:1: ( ( ruleRight ) | ( ruleProhibition ) | ( ruleObligation ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalJabuti.g:348:2: ( ruleRight )
                    {
                    // InternalJabuti.g:348:2: ( ruleRight )
                    // InternalJabuti.g:349:3: ruleRight
                    {
                     before(grammarAccess.getClauseAccess().getRightParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRight();

                    state._fsp--;

                     after(grammarAccess.getClauseAccess().getRightParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJabuti.g:354:2: ( ruleProhibition )
                    {
                    // InternalJabuti.g:354:2: ( ruleProhibition )
                    // InternalJabuti.g:355:3: ruleProhibition
                    {
                     before(grammarAccess.getClauseAccess().getProhibitionParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleProhibition();

                    state._fsp--;

                     after(grammarAccess.getClauseAccess().getProhibitionParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJabuti.g:360:2: ( ruleObligation )
                    {
                    // InternalJabuti.g:360:2: ( ruleObligation )
                    // InternalJabuti.g:361:3: ruleObligation
                    {
                     before(grammarAccess.getClauseAccess().getObligationParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleObligation();

                    state._fsp--;

                     after(grammarAccess.getClauseAccess().getObligationParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Alternatives_0"


    // $ANTLR start "rule__RolePlayer__Alternatives"
    // InternalJabuti.g:370:1: rule__RolePlayer__Alternatives : ( ( ( 'application' ) ) | ( ( 'process' ) ) );
    public final void rule__RolePlayer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:374:1: ( ( ( 'application' ) ) | ( ( 'process' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJabuti.g:375:2: ( ( 'application' ) )
                    {
                    // InternalJabuti.g:375:2: ( ( 'application' ) )
                    // InternalJabuti.g:376:3: ( 'application' )
                    {
                     before(grammarAccess.getRolePlayerAccess().getAPPLICATIONEnumLiteralDeclaration_0()); 
                    // InternalJabuti.g:377:3: ( 'application' )
                    // InternalJabuti.g:377:4: 'application'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getRolePlayerAccess().getAPPLICATIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJabuti.g:381:2: ( ( 'process' ) )
                    {
                    // InternalJabuti.g:381:2: ( ( 'process' ) )
                    // InternalJabuti.g:382:3: ( 'process' )
                    {
                     before(grammarAccess.getRolePlayerAccess().getPROCESSEnumLiteralDeclaration_1()); 
                    // InternalJabuti.g:383:3: ( 'process' )
                    // InternalJabuti.g:383:4: 'process'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getRolePlayerAccess().getPROCESSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolePlayer__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalJabuti.g:391:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:395:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalJabuti.g:396:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalJabuti.g:403:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:407:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // InternalJabuti.g:408:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // InternalJabuti.g:408:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // InternalJabuti.g:409:2: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalJabuti.g:410:2: ( rule__Model__ImportsAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJabuti.g:410:3: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalJabuti.g:418:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:422:1: ( rule__Model__Group__1__Impl )
            // InternalJabuti.g:423:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalJabuti.g:429:1: rule__Model__Group__1__Impl : ( ( rule__Model__ContractAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:433:1: ( ( ( rule__Model__ContractAssignment_1 ) ) )
            // InternalJabuti.g:434:1: ( ( rule__Model__ContractAssignment_1 ) )
            {
            // InternalJabuti.g:434:1: ( ( rule__Model__ContractAssignment_1 ) )
            // InternalJabuti.g:435:2: ( rule__Model__ContractAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getContractAssignment_1()); 
            // InternalJabuti.g:436:2: ( rule__Model__ContractAssignment_1 )
            // InternalJabuti.g:436:3: rule__Model__ContractAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__ContractAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getContractAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalJabuti.g:445:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:449:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalJabuti.g:450:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalJabuti.g:457:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:461:1: ( ( 'import' ) )
            // InternalJabuti.g:462:1: ( 'import' )
            {
            // InternalJabuti.g:462:1: ( 'import' )
            // InternalJabuti.g:463:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalJabuti.g:472:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:476:1: ( rule__Import__Group__1__Impl )
            // InternalJabuti.g:477:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalJabuti.g:483:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:487:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalJabuti.g:488:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalJabuti.g:488:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalJabuti.g:489:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalJabuti.g:490:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalJabuti.g:490:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Contract__Group__0"
    // InternalJabuti.g:499:1: rule__Contract__Group__0 : rule__Contract__Group__0__Impl rule__Contract__Group__1 ;
    public final void rule__Contract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:503:1: ( rule__Contract__Group__0__Impl rule__Contract__Group__1 )
            // InternalJabuti.g:504:2: rule__Contract__Group__0__Impl rule__Contract__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Contract__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__0"


    // $ANTLR start "rule__Contract__Group__0__Impl"
    // InternalJabuti.g:511:1: rule__Contract__Group__0__Impl : ( 'contract' ) ;
    public final void rule__Contract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:515:1: ( ( 'contract' ) )
            // InternalJabuti.g:516:1: ( 'contract' )
            {
            // InternalJabuti.g:516:1: ( 'contract' )
            // InternalJabuti.g:517:2: 'contract'
            {
             before(grammarAccess.getContractAccess().getContractKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getContractKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__0__Impl"


    // $ANTLR start "rule__Contract__Group__1"
    // InternalJabuti.g:526:1: rule__Contract__Group__1 : rule__Contract__Group__1__Impl rule__Contract__Group__2 ;
    public final void rule__Contract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:530:1: ( rule__Contract__Group__1__Impl rule__Contract__Group__2 )
            // InternalJabuti.g:531:2: rule__Contract__Group__1__Impl rule__Contract__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Contract__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__1"


    // $ANTLR start "rule__Contract__Group__1__Impl"
    // InternalJabuti.g:538:1: rule__Contract__Group__1__Impl : ( ( rule__Contract__NameAssignment_1 ) ) ;
    public final void rule__Contract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:542:1: ( ( ( rule__Contract__NameAssignment_1 ) ) )
            // InternalJabuti.g:543:1: ( ( rule__Contract__NameAssignment_1 ) )
            {
            // InternalJabuti.g:543:1: ( ( rule__Contract__NameAssignment_1 ) )
            // InternalJabuti.g:544:2: ( rule__Contract__NameAssignment_1 )
            {
             before(grammarAccess.getContractAccess().getNameAssignment_1()); 
            // InternalJabuti.g:545:2: ( rule__Contract__NameAssignment_1 )
            // InternalJabuti.g:545:3: rule__Contract__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Contract__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContractAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__1__Impl"


    // $ANTLR start "rule__Contract__Group__2"
    // InternalJabuti.g:553:1: rule__Contract__Group__2 : rule__Contract__Group__2__Impl rule__Contract__Group__3 ;
    public final void rule__Contract__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:557:1: ( rule__Contract__Group__2__Impl rule__Contract__Group__3 )
            // InternalJabuti.g:558:2: rule__Contract__Group__2__Impl rule__Contract__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Contract__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__2"


    // $ANTLR start "rule__Contract__Group__2__Impl"
    // InternalJabuti.g:565:1: rule__Contract__Group__2__Impl : ( '{' ) ;
    public final void rule__Contract__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:569:1: ( ( '{' ) )
            // InternalJabuti.g:570:1: ( '{' )
            {
            // InternalJabuti.g:570:1: ( '{' )
            // InternalJabuti.g:571:2: '{'
            {
             before(grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__2__Impl"


    // $ANTLR start "rule__Contract__Group__3"
    // InternalJabuti.g:580:1: rule__Contract__Group__3 : rule__Contract__Group__3__Impl rule__Contract__Group__4 ;
    public final void rule__Contract__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:584:1: ( rule__Contract__Group__3__Impl rule__Contract__Group__4 )
            // InternalJabuti.g:585:2: rule__Contract__Group__3__Impl rule__Contract__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Contract__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__3"


    // $ANTLR start "rule__Contract__Group__3__Impl"
    // InternalJabuti.g:592:1: rule__Contract__Group__3__Impl : ( 'parties' ) ;
    public final void rule__Contract__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:596:1: ( ( 'parties' ) )
            // InternalJabuti.g:597:1: ( 'parties' )
            {
            // InternalJabuti.g:597:1: ( 'parties' )
            // InternalJabuti.g:598:2: 'parties'
            {
             before(grammarAccess.getContractAccess().getPartiesKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getPartiesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__3__Impl"


    // $ANTLR start "rule__Contract__Group__4"
    // InternalJabuti.g:607:1: rule__Contract__Group__4 : rule__Contract__Group__4__Impl rule__Contract__Group__5 ;
    public final void rule__Contract__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:611:1: ( rule__Contract__Group__4__Impl rule__Contract__Group__5 )
            // InternalJabuti.g:612:2: rule__Contract__Group__4__Impl rule__Contract__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Contract__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__4"


    // $ANTLR start "rule__Contract__Group__4__Impl"
    // InternalJabuti.g:619:1: rule__Contract__Group__4__Impl : ( '{' ) ;
    public final void rule__Contract__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:623:1: ( ( '{' ) )
            // InternalJabuti.g:624:1: ( '{' )
            {
            // InternalJabuti.g:624:1: ( '{' )
            // InternalJabuti.g:625:2: '{'
            {
             before(grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__4__Impl"


    // $ANTLR start "rule__Contract__Group__5"
    // InternalJabuti.g:634:1: rule__Contract__Group__5 : rule__Contract__Group__5__Impl rule__Contract__Group__6 ;
    public final void rule__Contract__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:638:1: ( rule__Contract__Group__5__Impl rule__Contract__Group__6 )
            // InternalJabuti.g:639:2: rule__Contract__Group__5__Impl rule__Contract__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Contract__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__5"


    // $ANTLR start "rule__Contract__Group__5__Impl"
    // InternalJabuti.g:646:1: rule__Contract__Group__5__Impl : ( ( rule__Contract__ApplicationAssignment_5 ) ) ;
    public final void rule__Contract__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:650:1: ( ( ( rule__Contract__ApplicationAssignment_5 ) ) )
            // InternalJabuti.g:651:1: ( ( rule__Contract__ApplicationAssignment_5 ) )
            {
            // InternalJabuti.g:651:1: ( ( rule__Contract__ApplicationAssignment_5 ) )
            // InternalJabuti.g:652:2: ( rule__Contract__ApplicationAssignment_5 )
            {
             before(grammarAccess.getContractAccess().getApplicationAssignment_5()); 
            // InternalJabuti.g:653:2: ( rule__Contract__ApplicationAssignment_5 )
            // InternalJabuti.g:653:3: rule__Contract__ApplicationAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Contract__ApplicationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getContractAccess().getApplicationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__5__Impl"


    // $ANTLR start "rule__Contract__Group__6"
    // InternalJabuti.g:661:1: rule__Contract__Group__6 : rule__Contract__Group__6__Impl rule__Contract__Group__7 ;
    public final void rule__Contract__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:665:1: ( rule__Contract__Group__6__Impl rule__Contract__Group__7 )
            // InternalJabuti.g:666:2: rule__Contract__Group__6__Impl rule__Contract__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Contract__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__6"


    // $ANTLR start "rule__Contract__Group__6__Impl"
    // InternalJabuti.g:673:1: rule__Contract__Group__6__Impl : ( ( rule__Contract__ProcessAssignment_6 ) ) ;
    public final void rule__Contract__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:677:1: ( ( ( rule__Contract__ProcessAssignment_6 ) ) )
            // InternalJabuti.g:678:1: ( ( rule__Contract__ProcessAssignment_6 ) )
            {
            // InternalJabuti.g:678:1: ( ( rule__Contract__ProcessAssignment_6 ) )
            // InternalJabuti.g:679:2: ( rule__Contract__ProcessAssignment_6 )
            {
             before(grammarAccess.getContractAccess().getProcessAssignment_6()); 
            // InternalJabuti.g:680:2: ( rule__Contract__ProcessAssignment_6 )
            // InternalJabuti.g:680:3: rule__Contract__ProcessAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Contract__ProcessAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getContractAccess().getProcessAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__6__Impl"


    // $ANTLR start "rule__Contract__Group__7"
    // InternalJabuti.g:688:1: rule__Contract__Group__7 : rule__Contract__Group__7__Impl rule__Contract__Group__8 ;
    public final void rule__Contract__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:692:1: ( rule__Contract__Group__7__Impl rule__Contract__Group__8 )
            // InternalJabuti.g:693:2: rule__Contract__Group__7__Impl rule__Contract__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Contract__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__7"


    // $ANTLR start "rule__Contract__Group__7__Impl"
    // InternalJabuti.g:700:1: rule__Contract__Group__7__Impl : ( '}' ) ;
    public final void rule__Contract__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:704:1: ( ( '}' ) )
            // InternalJabuti.g:705:1: ( '}' )
            {
            // InternalJabuti.g:705:1: ( '}' )
            // InternalJabuti.g:706:2: '}'
            {
             before(grammarAccess.getContractAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__7__Impl"


    // $ANTLR start "rule__Contract__Group__8"
    // InternalJabuti.g:715:1: rule__Contract__Group__8 : rule__Contract__Group__8__Impl rule__Contract__Group__9 ;
    public final void rule__Contract__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:719:1: ( rule__Contract__Group__8__Impl rule__Contract__Group__9 )
            // InternalJabuti.g:720:2: rule__Contract__Group__8__Impl rule__Contract__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Contract__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__8"


    // $ANTLR start "rule__Contract__Group__8__Impl"
    // InternalJabuti.g:727:1: rule__Contract__Group__8__Impl : ( 'clauses' ) ;
    public final void rule__Contract__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:731:1: ( ( 'clauses' ) )
            // InternalJabuti.g:732:1: ( 'clauses' )
            {
            // InternalJabuti.g:732:1: ( 'clauses' )
            // InternalJabuti.g:733:2: 'clauses'
            {
             before(grammarAccess.getContractAccess().getClausesKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getClausesKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__8__Impl"


    // $ANTLR start "rule__Contract__Group__9"
    // InternalJabuti.g:742:1: rule__Contract__Group__9 : rule__Contract__Group__9__Impl rule__Contract__Group__10 ;
    public final void rule__Contract__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:746:1: ( rule__Contract__Group__9__Impl rule__Contract__Group__10 )
            // InternalJabuti.g:747:2: rule__Contract__Group__9__Impl rule__Contract__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Contract__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__9"


    // $ANTLR start "rule__Contract__Group__9__Impl"
    // InternalJabuti.g:754:1: rule__Contract__Group__9__Impl : ( '{' ) ;
    public final void rule__Contract__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:758:1: ( ( '{' ) )
            // InternalJabuti.g:759:1: ( '{' )
            {
            // InternalJabuti.g:759:1: ( '{' )
            // InternalJabuti.g:760:2: '{'
            {
             before(grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__9__Impl"


    // $ANTLR start "rule__Contract__Group__10"
    // InternalJabuti.g:769:1: rule__Contract__Group__10 : rule__Contract__Group__10__Impl rule__Contract__Group__11 ;
    public final void rule__Contract__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:773:1: ( rule__Contract__Group__10__Impl rule__Contract__Group__11 )
            // InternalJabuti.g:774:2: rule__Contract__Group__10__Impl rule__Contract__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__Contract__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__10"


    // $ANTLR start "rule__Contract__Group__10__Impl"
    // InternalJabuti.g:781:1: rule__Contract__Group__10__Impl : ( ( rule__Contract__ClausesAssignment_10 )* ) ;
    public final void rule__Contract__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:785:1: ( ( ( rule__Contract__ClausesAssignment_10 )* ) )
            // InternalJabuti.g:786:1: ( ( rule__Contract__ClausesAssignment_10 )* )
            {
            // InternalJabuti.g:786:1: ( ( rule__Contract__ClausesAssignment_10 )* )
            // InternalJabuti.g:787:2: ( rule__Contract__ClausesAssignment_10 )*
            {
             before(grammarAccess.getContractAccess().getClausesAssignment_10()); 
            // InternalJabuti.g:788:2: ( rule__Contract__ClausesAssignment_10 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=21 && LA4_0<=23)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalJabuti.g:788:3: rule__Contract__ClausesAssignment_10
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Contract__ClausesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getContractAccess().getClausesAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__10__Impl"


    // $ANTLR start "rule__Contract__Group__11"
    // InternalJabuti.g:796:1: rule__Contract__Group__11 : rule__Contract__Group__11__Impl rule__Contract__Group__12 ;
    public final void rule__Contract__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:800:1: ( rule__Contract__Group__11__Impl rule__Contract__Group__12 )
            // InternalJabuti.g:801:2: rule__Contract__Group__11__Impl rule__Contract__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__Contract__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contract__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__11"


    // $ANTLR start "rule__Contract__Group__11__Impl"
    // InternalJabuti.g:808:1: rule__Contract__Group__11__Impl : ( '}' ) ;
    public final void rule__Contract__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:812:1: ( ( '}' ) )
            // InternalJabuti.g:813:1: ( '}' )
            {
            // InternalJabuti.g:813:1: ( '}' )
            // InternalJabuti.g:814:2: '}'
            {
             before(grammarAccess.getContractAccess().getRightCurlyBracketKeyword_11()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__11__Impl"


    // $ANTLR start "rule__Contract__Group__12"
    // InternalJabuti.g:823:1: rule__Contract__Group__12 : rule__Contract__Group__12__Impl ;
    public final void rule__Contract__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:827:1: ( rule__Contract__Group__12__Impl )
            // InternalJabuti.g:828:2: rule__Contract__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Contract__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__12"


    // $ANTLR start "rule__Contract__Group__12__Impl"
    // InternalJabuti.g:834:1: rule__Contract__Group__12__Impl : ( '}' ) ;
    public final void rule__Contract__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:838:1: ( ( '}' ) )
            // InternalJabuti.g:839:1: ( '}' )
            {
            // InternalJabuti.g:839:1: ( '}' )
            // InternalJabuti.g:840:2: '}'
            {
             before(grammarAccess.getContractAccess().getRightCurlyBracketKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__Group__12__Impl"


    // $ANTLR start "rule__Clause__Group__0"
    // InternalJabuti.g:850:1: rule__Clause__Group__0 : rule__Clause__Group__0__Impl rule__Clause__Group__1 ;
    public final void rule__Clause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:854:1: ( rule__Clause__Group__0__Impl rule__Clause__Group__1 )
            // InternalJabuti.g:855:2: rule__Clause__Group__0__Impl rule__Clause__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Clause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Group__0"


    // $ANTLR start "rule__Clause__Group__0__Impl"
    // InternalJabuti.g:862:1: rule__Clause__Group__0__Impl : ( ( rule__Clause__Alternatives_0 ) ) ;
    public final void rule__Clause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:866:1: ( ( ( rule__Clause__Alternatives_0 ) ) )
            // InternalJabuti.g:867:1: ( ( rule__Clause__Alternatives_0 ) )
            {
            // InternalJabuti.g:867:1: ( ( rule__Clause__Alternatives_0 ) )
            // InternalJabuti.g:868:2: ( rule__Clause__Alternatives_0 )
            {
             before(grammarAccess.getClauseAccess().getAlternatives_0()); 
            // InternalJabuti.g:869:2: ( rule__Clause__Alternatives_0 )
            // InternalJabuti.g:869:3: rule__Clause__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Clause__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Group__0__Impl"


    // $ANTLR start "rule__Clause__Group__1"
    // InternalJabuti.g:877:1: rule__Clause__Group__1 : rule__Clause__Group__1__Impl rule__Clause__Group__2 ;
    public final void rule__Clause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:881:1: ( rule__Clause__Group__1__Impl rule__Clause__Group__2 )
            // InternalJabuti.g:882:2: rule__Clause__Group__1__Impl rule__Clause__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Clause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clause__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Group__1"


    // $ANTLR start "rule__Clause__Group__1__Impl"
    // InternalJabuti.g:889:1: rule__Clause__Group__1__Impl : ( '{' ) ;
    public final void rule__Clause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:893:1: ( ( '{' ) )
            // InternalJabuti.g:894:1: ( '{' )
            {
            // InternalJabuti.g:894:1: ( '{' )
            // InternalJabuti.g:895:2: '{'
            {
             before(grammarAccess.getClauseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClauseAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Group__1__Impl"


    // $ANTLR start "rule__Clause__Group__2"
    // InternalJabuti.g:904:1: rule__Clause__Group__2 : rule__Clause__Group__2__Impl rule__Clause__Group__3 ;
    public final void rule__Clause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:908:1: ( rule__Clause__Group__2__Impl rule__Clause__Group__3 )
            // InternalJabuti.g:909:2: rule__Clause__Group__2__Impl rule__Clause__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Clause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clause__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Group__2"


    // $ANTLR start "rule__Clause__Group__2__Impl"
    // InternalJabuti.g:916:1: rule__Clause__Group__2__Impl : ( 'rolePlayer' ) ;
    public final void rule__Clause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:920:1: ( ( 'rolePlayer' ) )
            // InternalJabuti.g:921:1: ( 'rolePlayer' )
            {
            // InternalJabuti.g:921:1: ( 'rolePlayer' )
            // InternalJabuti.g:922:2: 'rolePlayer'
            {
             before(grammarAccess.getClauseAccess().getRolePlayerKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getClauseAccess().getRolePlayerKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Group__2__Impl"


    // $ANTLR start "rule__Clause__Group__3"
    // InternalJabuti.g:931:1: rule__Clause__Group__3 : rule__Clause__Group__3__Impl rule__Clause__Group__4 ;
    public final void rule__Clause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:935:1: ( rule__Clause__Group__3__Impl rule__Clause__Group__4 )
            // InternalJabuti.g:936:2: rule__Clause__Group__3__Impl rule__Clause__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Clause__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clause__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Group__3"


    // $ANTLR start "rule__Clause__Group__3__Impl"
    // InternalJabuti.g:943:1: rule__Clause__Group__3__Impl : ( '=' ) ;
    public final void rule__Clause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:947:1: ( ( '=' ) )
            // InternalJabuti.g:948:1: ( '=' )
            {
            // InternalJabuti.g:948:1: ( '=' )
            // InternalJabuti.g:949:2: '='
            {
             before(grammarAccess.getClauseAccess().getEqualsSignKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getClauseAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Group__3__Impl"


    // $ANTLR start "rule__Clause__Group__4"
    // InternalJabuti.g:958:1: rule__Clause__Group__4 : rule__Clause__Group__4__Impl rule__Clause__Group__5 ;
    public final void rule__Clause__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:962:1: ( rule__Clause__Group__4__Impl rule__Clause__Group__5 )
            // InternalJabuti.g:963:2: rule__Clause__Group__4__Impl rule__Clause__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Clause__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clause__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Group__4"


    // $ANTLR start "rule__Clause__Group__4__Impl"
    // InternalJabuti.g:970:1: rule__Clause__Group__4__Impl : ( ( rule__Clause__RoleplayerAssignment_4 ) ) ;
    public final void rule__Clause__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:974:1: ( ( ( rule__Clause__RoleplayerAssignment_4 ) ) )
            // InternalJabuti.g:975:1: ( ( rule__Clause__RoleplayerAssignment_4 ) )
            {
            // InternalJabuti.g:975:1: ( ( rule__Clause__RoleplayerAssignment_4 ) )
            // InternalJabuti.g:976:2: ( rule__Clause__RoleplayerAssignment_4 )
            {
             before(grammarAccess.getClauseAccess().getRoleplayerAssignment_4()); 
            // InternalJabuti.g:977:2: ( rule__Clause__RoleplayerAssignment_4 )
            // InternalJabuti.g:977:3: rule__Clause__RoleplayerAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Clause__RoleplayerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getClauseAccess().getRoleplayerAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Group__4__Impl"


    // $ANTLR start "rule__Clause__Group__5"
    // InternalJabuti.g:985:1: rule__Clause__Group__5 : rule__Clause__Group__5__Impl ;
    public final void rule__Clause__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:989:1: ( rule__Clause__Group__5__Impl )
            // InternalJabuti.g:990:2: rule__Clause__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clause__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Group__5"


    // $ANTLR start "rule__Clause__Group__5__Impl"
    // InternalJabuti.g:996:1: rule__Clause__Group__5__Impl : ( '}' ) ;
    public final void rule__Clause__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1000:1: ( ( '}' ) )
            // InternalJabuti.g:1001:1: ( '}' )
            {
            // InternalJabuti.g:1001:1: ( '}' )
            // InternalJabuti.g:1002:2: '}'
            {
             before(grammarAccess.getClauseAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClauseAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Group__5__Impl"


    // $ANTLR start "rule__Right__Group__0"
    // InternalJabuti.g:1012:1: rule__Right__Group__0 : rule__Right__Group__0__Impl rule__Right__Group__1 ;
    public final void rule__Right__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1016:1: ( rule__Right__Group__0__Impl rule__Right__Group__1 )
            // InternalJabuti.g:1017:2: rule__Right__Group__0__Impl rule__Right__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Right__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Right__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__0"


    // $ANTLR start "rule__Right__Group__0__Impl"
    // InternalJabuti.g:1024:1: rule__Right__Group__0__Impl : ( 'right' ) ;
    public final void rule__Right__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1028:1: ( ( 'right' ) )
            // InternalJabuti.g:1029:1: ( 'right' )
            {
            // InternalJabuti.g:1029:1: ( 'right' )
            // InternalJabuti.g:1030:2: 'right'
            {
             before(grammarAccess.getRightAccess().getRightKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRightAccess().getRightKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__0__Impl"


    // $ANTLR start "rule__Right__Group__1"
    // InternalJabuti.g:1039:1: rule__Right__Group__1 : rule__Right__Group__1__Impl ;
    public final void rule__Right__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1043:1: ( rule__Right__Group__1__Impl )
            // InternalJabuti.g:1044:2: rule__Right__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Right__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__1"


    // $ANTLR start "rule__Right__Group__1__Impl"
    // InternalJabuti.g:1050:1: rule__Right__Group__1__Impl : ( ( rule__Right__NameAssignment_1 ) ) ;
    public final void rule__Right__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1054:1: ( ( ( rule__Right__NameAssignment_1 ) ) )
            // InternalJabuti.g:1055:1: ( ( rule__Right__NameAssignment_1 ) )
            {
            // InternalJabuti.g:1055:1: ( ( rule__Right__NameAssignment_1 ) )
            // InternalJabuti.g:1056:2: ( rule__Right__NameAssignment_1 )
            {
             before(grammarAccess.getRightAccess().getNameAssignment_1()); 
            // InternalJabuti.g:1057:2: ( rule__Right__NameAssignment_1 )
            // InternalJabuti.g:1057:3: rule__Right__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Right__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__1__Impl"


    // $ANTLR start "rule__Obligation__Group__0"
    // InternalJabuti.g:1066:1: rule__Obligation__Group__0 : rule__Obligation__Group__0__Impl rule__Obligation__Group__1 ;
    public final void rule__Obligation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1070:1: ( rule__Obligation__Group__0__Impl rule__Obligation__Group__1 )
            // InternalJabuti.g:1071:2: rule__Obligation__Group__0__Impl rule__Obligation__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Obligation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obligation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obligation__Group__0"


    // $ANTLR start "rule__Obligation__Group__0__Impl"
    // InternalJabuti.g:1078:1: rule__Obligation__Group__0__Impl : ( 'obligation' ) ;
    public final void rule__Obligation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1082:1: ( ( 'obligation' ) )
            // InternalJabuti.g:1083:1: ( 'obligation' )
            {
            // InternalJabuti.g:1083:1: ( 'obligation' )
            // InternalJabuti.g:1084:2: 'obligation'
            {
             before(grammarAccess.getObligationAccess().getObligationKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getObligationAccess().getObligationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obligation__Group__0__Impl"


    // $ANTLR start "rule__Obligation__Group__1"
    // InternalJabuti.g:1093:1: rule__Obligation__Group__1 : rule__Obligation__Group__1__Impl ;
    public final void rule__Obligation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1097:1: ( rule__Obligation__Group__1__Impl )
            // InternalJabuti.g:1098:2: rule__Obligation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Obligation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obligation__Group__1"


    // $ANTLR start "rule__Obligation__Group__1__Impl"
    // InternalJabuti.g:1104:1: rule__Obligation__Group__1__Impl : ( ( rule__Obligation__NameAssignment_1 ) ) ;
    public final void rule__Obligation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1108:1: ( ( ( rule__Obligation__NameAssignment_1 ) ) )
            // InternalJabuti.g:1109:1: ( ( rule__Obligation__NameAssignment_1 ) )
            {
            // InternalJabuti.g:1109:1: ( ( rule__Obligation__NameAssignment_1 ) )
            // InternalJabuti.g:1110:2: ( rule__Obligation__NameAssignment_1 )
            {
             before(grammarAccess.getObligationAccess().getNameAssignment_1()); 
            // InternalJabuti.g:1111:2: ( rule__Obligation__NameAssignment_1 )
            // InternalJabuti.g:1111:3: rule__Obligation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Obligation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObligationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obligation__Group__1__Impl"


    // $ANTLR start "rule__Prohibition__Group__0"
    // InternalJabuti.g:1120:1: rule__Prohibition__Group__0 : rule__Prohibition__Group__0__Impl rule__Prohibition__Group__1 ;
    public final void rule__Prohibition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1124:1: ( rule__Prohibition__Group__0__Impl rule__Prohibition__Group__1 )
            // InternalJabuti.g:1125:2: rule__Prohibition__Group__0__Impl rule__Prohibition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Prohibition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prohibition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prohibition__Group__0"


    // $ANTLR start "rule__Prohibition__Group__0__Impl"
    // InternalJabuti.g:1132:1: rule__Prohibition__Group__0__Impl : ( 'prohibition' ) ;
    public final void rule__Prohibition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1136:1: ( ( 'prohibition' ) )
            // InternalJabuti.g:1137:1: ( 'prohibition' )
            {
            // InternalJabuti.g:1137:1: ( 'prohibition' )
            // InternalJabuti.g:1138:2: 'prohibition'
            {
             before(grammarAccess.getProhibitionAccess().getProhibitionKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProhibitionAccess().getProhibitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prohibition__Group__0__Impl"


    // $ANTLR start "rule__Prohibition__Group__1"
    // InternalJabuti.g:1147:1: rule__Prohibition__Group__1 : rule__Prohibition__Group__1__Impl ;
    public final void rule__Prohibition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1151:1: ( rule__Prohibition__Group__1__Impl )
            // InternalJabuti.g:1152:2: rule__Prohibition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Prohibition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prohibition__Group__1"


    // $ANTLR start "rule__Prohibition__Group__1__Impl"
    // InternalJabuti.g:1158:1: rule__Prohibition__Group__1__Impl : ( ( rule__Prohibition__NameAssignment_1 ) ) ;
    public final void rule__Prohibition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1162:1: ( ( ( rule__Prohibition__NameAssignment_1 ) ) )
            // InternalJabuti.g:1163:1: ( ( rule__Prohibition__NameAssignment_1 ) )
            {
            // InternalJabuti.g:1163:1: ( ( rule__Prohibition__NameAssignment_1 ) )
            // InternalJabuti.g:1164:2: ( rule__Prohibition__NameAssignment_1 )
            {
             before(grammarAccess.getProhibitionAccess().getNameAssignment_1()); 
            // InternalJabuti.g:1165:2: ( rule__Prohibition__NameAssignment_1 )
            // InternalJabuti.g:1165:3: rule__Prohibition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Prohibition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProhibitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prohibition__Group__1__Impl"


    // $ANTLR start "rule__Application__Group__0"
    // InternalJabuti.g:1174:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1178:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalJabuti.g:1179:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Application__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0"


    // $ANTLR start "rule__Application__Group__0__Impl"
    // InternalJabuti.g:1186:1: rule__Application__Group__0__Impl : ( 'application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1190:1: ( ( 'application' ) )
            // InternalJabuti.g:1191:1: ( 'application' )
            {
            // InternalJabuti.g:1191:1: ( 'application' )
            // InternalJabuti.g:1192:2: 'application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0__Impl"


    // $ANTLR start "rule__Application__Group__1"
    // InternalJabuti.g:1201:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1205:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalJabuti.g:1206:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Application__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1"


    // $ANTLR start "rule__Application__Group__1__Impl"
    // InternalJabuti.g:1213:1: rule__Application__Group__1__Impl : ( '=' ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1217:1: ( ( '=' ) )
            // InternalJabuti.g:1218:1: ( '=' )
            {
            // InternalJabuti.g:1218:1: ( '=' )
            // InternalJabuti.g:1219:2: '='
            {
             before(grammarAccess.getApplicationAccess().getEqualsSignKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1__Impl"


    // $ANTLR start "rule__Application__Group__2"
    // InternalJabuti.g:1228:1: rule__Application__Group__2 : rule__Application__Group__2__Impl ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1232:1: ( rule__Application__Group__2__Impl )
            // InternalJabuti.g:1233:2: rule__Application__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2"


    // $ANTLR start "rule__Application__Group__2__Impl"
    // InternalJabuti.g:1239:1: rule__Application__Group__2__Impl : ( ( rule__Application__NameAssignment_2 ) ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1243:1: ( ( ( rule__Application__NameAssignment_2 ) ) )
            // InternalJabuti.g:1244:1: ( ( rule__Application__NameAssignment_2 ) )
            {
            // InternalJabuti.g:1244:1: ( ( rule__Application__NameAssignment_2 ) )
            // InternalJabuti.g:1245:2: ( rule__Application__NameAssignment_2 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_2()); 
            // InternalJabuti.g:1246:2: ( rule__Application__NameAssignment_2 )
            // InternalJabuti.g:1246:3: rule__Application__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Application__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__0"
    // InternalJabuti.g:1255:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1259:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalJabuti.g:1260:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalJabuti.g:1267:1: rule__Process__Group__0__Impl : ( 'process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1271:1: ( ( 'process' ) )
            // InternalJabuti.g:1272:1: ( 'process' )
            {
            // InternalJabuti.g:1272:1: ( 'process' )
            // InternalJabuti.g:1273:2: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalJabuti.g:1282:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1286:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalJabuti.g:1287:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalJabuti.g:1294:1: rule__Process__Group__1__Impl : ( '=' ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1298:1: ( ( '=' ) )
            // InternalJabuti.g:1299:1: ( '=' )
            {
            // InternalJabuti.g:1299:1: ( '=' )
            // InternalJabuti.g:1300:2: '='
            {
             before(grammarAccess.getProcessAccess().getEqualsSignKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalJabuti.g:1309:1: rule__Process__Group__2 : rule__Process__Group__2__Impl ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1313:1: ( rule__Process__Group__2__Impl )
            // InternalJabuti.g:1314:2: rule__Process__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalJabuti.g:1320:1: rule__Process__Group__2__Impl : ( ( rule__Process__NameAssignment_2 ) ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1324:1: ( ( ( rule__Process__NameAssignment_2 ) ) )
            // InternalJabuti.g:1325:1: ( ( rule__Process__NameAssignment_2 ) )
            {
            // InternalJabuti.g:1325:1: ( ( rule__Process__NameAssignment_2 ) )
            // InternalJabuti.g:1326:2: ( rule__Process__NameAssignment_2 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_2()); 
            // InternalJabuti.g:1327:2: ( rule__Process__NameAssignment_2 )
            // InternalJabuti.g:1327:3: rule__Process__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalJabuti.g:1336:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1340:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalJabuti.g:1341:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalJabuti.g:1348:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1352:1: ( ( RULE_ID ) )
            // InternalJabuti.g:1353:1: ( RULE_ID )
            {
            // InternalJabuti.g:1353:1: ( RULE_ID )
            // InternalJabuti.g:1354:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalJabuti.g:1363:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1367:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalJabuti.g:1368:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalJabuti.g:1374:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1378:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalJabuti.g:1379:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalJabuti.g:1379:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalJabuti.g:1380:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalJabuti.g:1381:2: ( rule__QualifiedName__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalJabuti.g:1381:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalJabuti.g:1390:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1394:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalJabuti.g:1395:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalJabuti.g:1402:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1406:1: ( ( '.' ) )
            // InternalJabuti.g:1407:1: ( '.' )
            {
            // InternalJabuti.g:1407:1: ( '.' )
            // InternalJabuti.g:1408:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalJabuti.g:1417:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1421:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalJabuti.g:1422:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalJabuti.g:1428:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1432:1: ( ( RULE_ID ) )
            // InternalJabuti.g:1433:1: ( RULE_ID )
            {
            // InternalJabuti.g:1433:1: ( RULE_ID )
            // InternalJabuti.g:1434:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalJabuti.g:1444:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1448:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalJabuti.g:1449:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalJabuti.g:1456:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1460:1: ( ( ruleQualifiedName ) )
            // InternalJabuti.g:1461:1: ( ruleQualifiedName )
            {
            // InternalJabuti.g:1461:1: ( ruleQualifiedName )
            // InternalJabuti.g:1462:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalJabuti.g:1471:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1475:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalJabuti.g:1476:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalJabuti.g:1482:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( '.*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1486:1: ( ( '.*' ) )
            // InternalJabuti.g:1487:1: ( '.*' )
            {
            // InternalJabuti.g:1487:1: ( '.*' )
            // InternalJabuti.g:1488:2: '.*'
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // InternalJabuti.g:1498:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1502:1: ( ( ruleImport ) )
            // InternalJabuti.g:1503:2: ( ruleImport )
            {
            // InternalJabuti.g:1503:2: ( ruleImport )
            // InternalJabuti.g:1504:3: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_0"


    // $ANTLR start "rule__Model__ContractAssignment_1"
    // InternalJabuti.g:1513:1: rule__Model__ContractAssignment_1 : ( ruleContract ) ;
    public final void rule__Model__ContractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1517:1: ( ( ruleContract ) )
            // InternalJabuti.g:1518:2: ( ruleContract )
            {
            // InternalJabuti.g:1518:2: ( ruleContract )
            // InternalJabuti.g:1519:3: ruleContract
            {
             before(grammarAccess.getModelAccess().getContractContractParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContract();

            state._fsp--;

             after(grammarAccess.getModelAccess().getContractContractParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ContractAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalJabuti.g:1528:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1532:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalJabuti.g:1533:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalJabuti.g:1533:2: ( ruleQualifiedNameWithWildcard )
            // InternalJabuti.g:1534:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Contract__NameAssignment_1"
    // InternalJabuti.g:1543:1: rule__Contract__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Contract__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1547:1: ( ( RULE_ID ) )
            // InternalJabuti.g:1548:2: ( RULE_ID )
            {
            // InternalJabuti.g:1548:2: ( RULE_ID )
            // InternalJabuti.g:1549:3: RULE_ID
            {
             before(grammarAccess.getContractAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContractAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__NameAssignment_1"


    // $ANTLR start "rule__Contract__ApplicationAssignment_5"
    // InternalJabuti.g:1558:1: rule__Contract__ApplicationAssignment_5 : ( ruleApplication ) ;
    public final void rule__Contract__ApplicationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1562:1: ( ( ruleApplication ) )
            // InternalJabuti.g:1563:2: ( ruleApplication )
            {
            // InternalJabuti.g:1563:2: ( ruleApplication )
            // InternalJabuti.g:1564:3: ruleApplication
            {
             before(grammarAccess.getContractAccess().getApplicationApplicationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getContractAccess().getApplicationApplicationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__ApplicationAssignment_5"


    // $ANTLR start "rule__Contract__ProcessAssignment_6"
    // InternalJabuti.g:1573:1: rule__Contract__ProcessAssignment_6 : ( ruleProcess ) ;
    public final void rule__Contract__ProcessAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1577:1: ( ( ruleProcess ) )
            // InternalJabuti.g:1578:2: ( ruleProcess )
            {
            // InternalJabuti.g:1578:2: ( ruleProcess )
            // InternalJabuti.g:1579:3: ruleProcess
            {
             before(grammarAccess.getContractAccess().getProcessProcessParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getContractAccess().getProcessProcessParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__ProcessAssignment_6"


    // $ANTLR start "rule__Contract__ClausesAssignment_10"
    // InternalJabuti.g:1588:1: rule__Contract__ClausesAssignment_10 : ( ruleClause ) ;
    public final void rule__Contract__ClausesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1592:1: ( ( ruleClause ) )
            // InternalJabuti.g:1593:2: ( ruleClause )
            {
            // InternalJabuti.g:1593:2: ( ruleClause )
            // InternalJabuti.g:1594:3: ruleClause
            {
             before(grammarAccess.getContractAccess().getClausesClauseParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getContractAccess().getClausesClauseParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contract__ClausesAssignment_10"


    // $ANTLR start "rule__Clause__RoleplayerAssignment_4"
    // InternalJabuti.g:1603:1: rule__Clause__RoleplayerAssignment_4 : ( ruleRolePlayer ) ;
    public final void rule__Clause__RoleplayerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1607:1: ( ( ruleRolePlayer ) )
            // InternalJabuti.g:1608:2: ( ruleRolePlayer )
            {
            // InternalJabuti.g:1608:2: ( ruleRolePlayer )
            // InternalJabuti.g:1609:3: ruleRolePlayer
            {
             before(grammarAccess.getClauseAccess().getRoleplayerRolePlayerEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRolePlayer();

            state._fsp--;

             after(grammarAccess.getClauseAccess().getRoleplayerRolePlayerEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__RoleplayerAssignment_4"


    // $ANTLR start "rule__Right__NameAssignment_1"
    // InternalJabuti.g:1618:1: rule__Right__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Right__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1622:1: ( ( RULE_ID ) )
            // InternalJabuti.g:1623:2: ( RULE_ID )
            {
            // InternalJabuti.g:1623:2: ( RULE_ID )
            // InternalJabuti.g:1624:3: RULE_ID
            {
             before(grammarAccess.getRightAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRightAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__NameAssignment_1"


    // $ANTLR start "rule__Obligation__NameAssignment_1"
    // InternalJabuti.g:1633:1: rule__Obligation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Obligation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1637:1: ( ( RULE_ID ) )
            // InternalJabuti.g:1638:2: ( RULE_ID )
            {
            // InternalJabuti.g:1638:2: ( RULE_ID )
            // InternalJabuti.g:1639:3: RULE_ID
            {
             before(grammarAccess.getObligationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObligationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obligation__NameAssignment_1"


    // $ANTLR start "rule__Prohibition__NameAssignment_1"
    // InternalJabuti.g:1648:1: rule__Prohibition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Prohibition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1652:1: ( ( RULE_ID ) )
            // InternalJabuti.g:1653:2: ( RULE_ID )
            {
            // InternalJabuti.g:1653:2: ( RULE_ID )
            // InternalJabuti.g:1654:3: RULE_ID
            {
             before(grammarAccess.getProhibitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProhibitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prohibition__NameAssignment_1"


    // $ANTLR start "rule__Application__NameAssignment_2"
    // InternalJabuti.g:1663:1: rule__Application__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Application__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1667:1: ( ( RULE_STRING ) )
            // InternalJabuti.g:1668:2: ( RULE_STRING )
            {
            // InternalJabuti.g:1668:2: ( RULE_STRING )
            // InternalJabuti.g:1669:3: RULE_STRING
            {
             before(grammarAccess.getApplicationAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__NameAssignment_2"


    // $ANTLR start "rule__Process__NameAssignment_2"
    // InternalJabuti.g:1678:1: rule__Process__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Process__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJabuti.g:1682:1: ( ( RULE_STRING ) )
            // InternalJabuti.g:1683:2: ( RULE_STRING )
            {
            // InternalJabuti.g:1683:2: ( RULE_STRING )
            // InternalJabuti.g:1684:3: RULE_STRING
            {
             before(grammarAccess.getProcessAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000E20000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});

}