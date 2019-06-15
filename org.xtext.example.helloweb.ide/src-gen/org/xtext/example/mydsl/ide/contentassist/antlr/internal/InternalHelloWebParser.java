package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.HelloWebGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHelloWebParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TAKEOFF'", "'LAND'", "';'", "'.'", "'SNAPSHOT'", "'('", "')'", "'UP'", "'DOWN'", "'LEFT'", "'RIGHT'", "'FORWARD'", "'BACKWARD'", "'ROTATELEFT'", "'ROTATERIGHT'", "'WAIT'", "'()'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalHelloWebParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHelloWebParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHelloWebParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHelloWeb.g"; }


    	private HelloWebGrammarAccess grammarAccess;

    	public void setGrammarAccess(HelloWebGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalHelloWeb.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalHelloWeb.g:54:1: ( ruleProgram EOF )
            // InternalHelloWeb.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalHelloWeb.g:62:1: ruleProgram : ( ( rule__Program__MainAssignment ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:66:2: ( ( ( rule__Program__MainAssignment ) ) )
            // InternalHelloWeb.g:67:2: ( ( rule__Program__MainAssignment ) )
            {
            // InternalHelloWeb.g:67:2: ( ( rule__Program__MainAssignment ) )
            // InternalHelloWeb.g:68:3: ( rule__Program__MainAssignment )
            {
             before(grammarAccess.getProgramAccess().getMainAssignment()); 
            // InternalHelloWeb.g:69:3: ( rule__Program__MainAssignment )
            // InternalHelloWeb.g:69:4: rule__Program__MainAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Program__MainAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getMainAssignment()); 

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleMain"
    // InternalHelloWeb.g:78:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // InternalHelloWeb.g:79:1: ( ruleMain EOF )
            // InternalHelloWeb.g:80:1: ruleMain EOF
            {
             before(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getMainRule()); 
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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalHelloWeb.g:87:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:91:2: ( ( ( rule__Main__Group__0 ) ) )
            // InternalHelloWeb.g:92:2: ( ( rule__Main__Group__0 ) )
            {
            // InternalHelloWeb.g:92:2: ( ( rule__Main__Group__0 ) )
            // InternalHelloWeb.g:93:3: ( rule__Main__Group__0 )
            {
             before(grammarAccess.getMainAccess().getGroup()); 
            // InternalHelloWeb.g:94:3: ( rule__Main__Group__0 )
            // InternalHelloWeb.g:94:4: rule__Main__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getGroup()); 

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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleTakeoff"
    // InternalHelloWeb.g:103:1: entryRuleTakeoff : ruleTakeoff EOF ;
    public final void entryRuleTakeoff() throws RecognitionException {
        try {
            // InternalHelloWeb.g:104:1: ( ruleTakeoff EOF )
            // InternalHelloWeb.g:105:1: ruleTakeoff EOF
            {
             before(grammarAccess.getTakeoffRule()); 
            pushFollow(FOLLOW_1);
            ruleTakeoff();

            state._fsp--;

             after(grammarAccess.getTakeoffRule()); 
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
    // $ANTLR end "entryRuleTakeoff"


    // $ANTLR start "ruleTakeoff"
    // InternalHelloWeb.g:112:1: ruleTakeoff : ( 'TAKEOFF' ) ;
    public final void ruleTakeoff() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:116:2: ( ( 'TAKEOFF' ) )
            // InternalHelloWeb.g:117:2: ( 'TAKEOFF' )
            {
            // InternalHelloWeb.g:117:2: ( 'TAKEOFF' )
            // InternalHelloWeb.g:118:3: 'TAKEOFF'
            {
             before(grammarAccess.getTakeoffAccess().getTAKEOFFKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTakeoffAccess().getTAKEOFFKeyword()); 

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
    // $ANTLR end "ruleTakeoff"


    // $ANTLR start "entryRuleLand"
    // InternalHelloWeb.g:128:1: entryRuleLand : ruleLand EOF ;
    public final void entryRuleLand() throws RecognitionException {
        try {
            // InternalHelloWeb.g:129:1: ( ruleLand EOF )
            // InternalHelloWeb.g:130:1: ruleLand EOF
            {
             before(grammarAccess.getLandRule()); 
            pushFollow(FOLLOW_1);
            ruleLand();

            state._fsp--;

             after(grammarAccess.getLandRule()); 
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
    // $ANTLR end "entryRuleLand"


    // $ANTLR start "ruleLand"
    // InternalHelloWeb.g:137:1: ruleLand : ( 'LAND' ) ;
    public final void ruleLand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:141:2: ( ( 'LAND' ) )
            // InternalHelloWeb.g:142:2: ( 'LAND' )
            {
            // InternalHelloWeb.g:142:2: ( 'LAND' )
            // InternalHelloWeb.g:143:3: 'LAND'
            {
             before(grammarAccess.getLandAccess().getLANDKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLandAccess().getLANDKeyword()); 

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
    // $ANTLR end "ruleLand"


    // $ANTLR start "entryRuleSuperCommand"
    // InternalHelloWeb.g:153:1: entryRuleSuperCommand : ruleSuperCommand EOF ;
    public final void entryRuleSuperCommand() throws RecognitionException {
        try {
            // InternalHelloWeb.g:154:1: ( ruleSuperCommand EOF )
            // InternalHelloWeb.g:155:1: ruleSuperCommand EOF
            {
             before(grammarAccess.getSuperCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleSuperCommand();

            state._fsp--;

             after(grammarAccess.getSuperCommandRule()); 
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
    // $ANTLR end "entryRuleSuperCommand"


    // $ANTLR start "ruleSuperCommand"
    // InternalHelloWeb.g:162:1: ruleSuperCommand : ( ( rule__SuperCommand__Alternatives ) ) ;
    public final void ruleSuperCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:166:2: ( ( ( rule__SuperCommand__Alternatives ) ) )
            // InternalHelloWeb.g:167:2: ( ( rule__SuperCommand__Alternatives ) )
            {
            // InternalHelloWeb.g:167:2: ( ( rule__SuperCommand__Alternatives ) )
            // InternalHelloWeb.g:168:3: ( rule__SuperCommand__Alternatives )
            {
             before(grammarAccess.getSuperCommandAccess().getAlternatives()); 
            // InternalHelloWeb.g:169:3: ( rule__SuperCommand__Alternatives )
            // InternalHelloWeb.g:169:4: rule__SuperCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SuperCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSuperCommandAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSuperCommand"


    // $ANTLR start "entryRuleCommand"
    // InternalHelloWeb.g:178:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalHelloWeb.g:179:1: ( ruleCommand EOF )
            // InternalHelloWeb.g:180:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalHelloWeb.g:187:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:191:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalHelloWeb.g:192:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalHelloWeb.g:192:2: ( ( rule__Command__Alternatives ) )
            // InternalHelloWeb.g:193:3: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // InternalHelloWeb.g:194:3: ( rule__Command__Alternatives )
            // InternalHelloWeb.g:194:4: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Command__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalHelloWeb.g:203:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalHelloWeb.g:204:1: ( ruleDOUBLE EOF )
            // InternalHelloWeb.g:205:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalHelloWeb.g:212:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:216:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // InternalHelloWeb.g:217:2: ( ( rule__DOUBLE__Group__0 ) )
            {
            // InternalHelloWeb.g:217:2: ( ( rule__DOUBLE__Group__0 ) )
            // InternalHelloWeb.g:218:3: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // InternalHelloWeb.g:219:3: ( rule__DOUBLE__Group__0 )
            // InternalHelloWeb.g:219:4: rule__DOUBLE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDOUBLEAccess().getGroup()); 

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
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuleSnapshot"
    // InternalHelloWeb.g:228:1: entryRuleSnapshot : ruleSnapshot EOF ;
    public final void entryRuleSnapshot() throws RecognitionException {
        try {
            // InternalHelloWeb.g:229:1: ( ruleSnapshot EOF )
            // InternalHelloWeb.g:230:1: ruleSnapshot EOF
            {
             before(grammarAccess.getSnapshotRule()); 
            pushFollow(FOLLOW_1);
            ruleSnapshot();

            state._fsp--;

             after(grammarAccess.getSnapshotRule()); 
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
    // $ANTLR end "entryRuleSnapshot"


    // $ANTLR start "ruleSnapshot"
    // InternalHelloWeb.g:237:1: ruleSnapshot : ( ( rule__Snapshot__Group__0 ) ) ;
    public final void ruleSnapshot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:241:2: ( ( ( rule__Snapshot__Group__0 ) ) )
            // InternalHelloWeb.g:242:2: ( ( rule__Snapshot__Group__0 ) )
            {
            // InternalHelloWeb.g:242:2: ( ( rule__Snapshot__Group__0 ) )
            // InternalHelloWeb.g:243:3: ( rule__Snapshot__Group__0 )
            {
             before(grammarAccess.getSnapshotAccess().getGroup()); 
            // InternalHelloWeb.g:244:3: ( rule__Snapshot__Group__0 )
            // InternalHelloWeb.g:244:4: rule__Snapshot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Snapshot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSnapshotAccess().getGroup()); 

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
    // $ANTLR end "ruleSnapshot"


    // $ANTLR start "entryRuleUp"
    // InternalHelloWeb.g:253:1: entryRuleUp : ruleUp EOF ;
    public final void entryRuleUp() throws RecognitionException {
        try {
            // InternalHelloWeb.g:254:1: ( ruleUp EOF )
            // InternalHelloWeb.g:255:1: ruleUp EOF
            {
             before(grammarAccess.getUpRule()); 
            pushFollow(FOLLOW_1);
            ruleUp();

            state._fsp--;

             after(grammarAccess.getUpRule()); 
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
    // $ANTLR end "entryRuleUp"


    // $ANTLR start "ruleUp"
    // InternalHelloWeb.g:262:1: ruleUp : ( ( rule__Up__Group__0 ) ) ;
    public final void ruleUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:266:2: ( ( ( rule__Up__Group__0 ) ) )
            // InternalHelloWeb.g:267:2: ( ( rule__Up__Group__0 ) )
            {
            // InternalHelloWeb.g:267:2: ( ( rule__Up__Group__0 ) )
            // InternalHelloWeb.g:268:3: ( rule__Up__Group__0 )
            {
             before(grammarAccess.getUpAccess().getGroup()); 
            // InternalHelloWeb.g:269:3: ( rule__Up__Group__0 )
            // InternalHelloWeb.g:269:4: rule__Up__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Up__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpAccess().getGroup()); 

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
    // $ANTLR end "ruleUp"


    // $ANTLR start "entryRuleDown"
    // InternalHelloWeb.g:278:1: entryRuleDown : ruleDown EOF ;
    public final void entryRuleDown() throws RecognitionException {
        try {
            // InternalHelloWeb.g:279:1: ( ruleDown EOF )
            // InternalHelloWeb.g:280:1: ruleDown EOF
            {
             before(grammarAccess.getDownRule()); 
            pushFollow(FOLLOW_1);
            ruleDown();

            state._fsp--;

             after(grammarAccess.getDownRule()); 
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
    // $ANTLR end "entryRuleDown"


    // $ANTLR start "ruleDown"
    // InternalHelloWeb.g:287:1: ruleDown : ( ( rule__Down__Group__0 ) ) ;
    public final void ruleDown() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:291:2: ( ( ( rule__Down__Group__0 ) ) )
            // InternalHelloWeb.g:292:2: ( ( rule__Down__Group__0 ) )
            {
            // InternalHelloWeb.g:292:2: ( ( rule__Down__Group__0 ) )
            // InternalHelloWeb.g:293:3: ( rule__Down__Group__0 )
            {
             before(grammarAccess.getDownAccess().getGroup()); 
            // InternalHelloWeb.g:294:3: ( rule__Down__Group__0 )
            // InternalHelloWeb.g:294:4: rule__Down__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Down__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDownAccess().getGroup()); 

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
    // $ANTLR end "ruleDown"


    // $ANTLR start "entryRuleLeft"
    // InternalHelloWeb.g:303:1: entryRuleLeft : ruleLeft EOF ;
    public final void entryRuleLeft() throws RecognitionException {
        try {
            // InternalHelloWeb.g:304:1: ( ruleLeft EOF )
            // InternalHelloWeb.g:305:1: ruleLeft EOF
            {
             before(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_1);
            ruleLeft();

            state._fsp--;

             after(grammarAccess.getLeftRule()); 
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
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // InternalHelloWeb.g:312:1: ruleLeft : ( ( rule__Left__Group__0 ) ) ;
    public final void ruleLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:316:2: ( ( ( rule__Left__Group__0 ) ) )
            // InternalHelloWeb.g:317:2: ( ( rule__Left__Group__0 ) )
            {
            // InternalHelloWeb.g:317:2: ( ( rule__Left__Group__0 ) )
            // InternalHelloWeb.g:318:3: ( rule__Left__Group__0 )
            {
             before(grammarAccess.getLeftAccess().getGroup()); 
            // InternalHelloWeb.g:319:3: ( rule__Left__Group__0 )
            // InternalHelloWeb.g:319:4: rule__Left__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Left__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeftAccess().getGroup()); 

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
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleRight"
    // InternalHelloWeb.g:328:1: entryRuleRight : ruleRight EOF ;
    public final void entryRuleRight() throws RecognitionException {
        try {
            // InternalHelloWeb.g:329:1: ( ruleRight EOF )
            // InternalHelloWeb.g:330:1: ruleRight EOF
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
    // InternalHelloWeb.g:337:1: ruleRight : ( ( rule__Right__Group__0 ) ) ;
    public final void ruleRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:341:2: ( ( ( rule__Right__Group__0 ) ) )
            // InternalHelloWeb.g:342:2: ( ( rule__Right__Group__0 ) )
            {
            // InternalHelloWeb.g:342:2: ( ( rule__Right__Group__0 ) )
            // InternalHelloWeb.g:343:3: ( rule__Right__Group__0 )
            {
             before(grammarAccess.getRightAccess().getGroup()); 
            // InternalHelloWeb.g:344:3: ( rule__Right__Group__0 )
            // InternalHelloWeb.g:344:4: rule__Right__Group__0
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


    // $ANTLR start "entryRuleForward"
    // InternalHelloWeb.g:353:1: entryRuleForward : ruleForward EOF ;
    public final void entryRuleForward() throws RecognitionException {
        try {
            // InternalHelloWeb.g:354:1: ( ruleForward EOF )
            // InternalHelloWeb.g:355:1: ruleForward EOF
            {
             before(grammarAccess.getForwardRule()); 
            pushFollow(FOLLOW_1);
            ruleForward();

            state._fsp--;

             after(grammarAccess.getForwardRule()); 
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
    // $ANTLR end "entryRuleForward"


    // $ANTLR start "ruleForward"
    // InternalHelloWeb.g:362:1: ruleForward : ( ( rule__Forward__Group__0 ) ) ;
    public final void ruleForward() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:366:2: ( ( ( rule__Forward__Group__0 ) ) )
            // InternalHelloWeb.g:367:2: ( ( rule__Forward__Group__0 ) )
            {
            // InternalHelloWeb.g:367:2: ( ( rule__Forward__Group__0 ) )
            // InternalHelloWeb.g:368:3: ( rule__Forward__Group__0 )
            {
             before(grammarAccess.getForwardAccess().getGroup()); 
            // InternalHelloWeb.g:369:3: ( rule__Forward__Group__0 )
            // InternalHelloWeb.g:369:4: rule__Forward__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Forward__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForwardAccess().getGroup()); 

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
    // $ANTLR end "ruleForward"


    // $ANTLR start "entryRuleBackward"
    // InternalHelloWeb.g:378:1: entryRuleBackward : ruleBackward EOF ;
    public final void entryRuleBackward() throws RecognitionException {
        try {
            // InternalHelloWeb.g:379:1: ( ruleBackward EOF )
            // InternalHelloWeb.g:380:1: ruleBackward EOF
            {
             before(grammarAccess.getBackwardRule()); 
            pushFollow(FOLLOW_1);
            ruleBackward();

            state._fsp--;

             after(grammarAccess.getBackwardRule()); 
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
    // $ANTLR end "entryRuleBackward"


    // $ANTLR start "ruleBackward"
    // InternalHelloWeb.g:387:1: ruleBackward : ( ( rule__Backward__Group__0 ) ) ;
    public final void ruleBackward() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:391:2: ( ( ( rule__Backward__Group__0 ) ) )
            // InternalHelloWeb.g:392:2: ( ( rule__Backward__Group__0 ) )
            {
            // InternalHelloWeb.g:392:2: ( ( rule__Backward__Group__0 ) )
            // InternalHelloWeb.g:393:3: ( rule__Backward__Group__0 )
            {
             before(grammarAccess.getBackwardAccess().getGroup()); 
            // InternalHelloWeb.g:394:3: ( rule__Backward__Group__0 )
            // InternalHelloWeb.g:394:4: rule__Backward__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Backward__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackwardAccess().getGroup()); 

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
    // $ANTLR end "ruleBackward"


    // $ANTLR start "entryRuleRotateL"
    // InternalHelloWeb.g:403:1: entryRuleRotateL : ruleRotateL EOF ;
    public final void entryRuleRotateL() throws RecognitionException {
        try {
            // InternalHelloWeb.g:404:1: ( ruleRotateL EOF )
            // InternalHelloWeb.g:405:1: ruleRotateL EOF
            {
             before(grammarAccess.getRotateLRule()); 
            pushFollow(FOLLOW_1);
            ruleRotateL();

            state._fsp--;

             after(grammarAccess.getRotateLRule()); 
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
    // $ANTLR end "entryRuleRotateL"


    // $ANTLR start "ruleRotateL"
    // InternalHelloWeb.g:412:1: ruleRotateL : ( ( rule__RotateL__Group__0 ) ) ;
    public final void ruleRotateL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:416:2: ( ( ( rule__RotateL__Group__0 ) ) )
            // InternalHelloWeb.g:417:2: ( ( rule__RotateL__Group__0 ) )
            {
            // InternalHelloWeb.g:417:2: ( ( rule__RotateL__Group__0 ) )
            // InternalHelloWeb.g:418:3: ( rule__RotateL__Group__0 )
            {
             before(grammarAccess.getRotateLAccess().getGroup()); 
            // InternalHelloWeb.g:419:3: ( rule__RotateL__Group__0 )
            // InternalHelloWeb.g:419:4: rule__RotateL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RotateL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotateLAccess().getGroup()); 

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
    // $ANTLR end "ruleRotateL"


    // $ANTLR start "entryRuleRotateR"
    // InternalHelloWeb.g:428:1: entryRuleRotateR : ruleRotateR EOF ;
    public final void entryRuleRotateR() throws RecognitionException {
        try {
            // InternalHelloWeb.g:429:1: ( ruleRotateR EOF )
            // InternalHelloWeb.g:430:1: ruleRotateR EOF
            {
             before(grammarAccess.getRotateRRule()); 
            pushFollow(FOLLOW_1);
            ruleRotateR();

            state._fsp--;

             after(grammarAccess.getRotateRRule()); 
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
    // $ANTLR end "entryRuleRotateR"


    // $ANTLR start "ruleRotateR"
    // InternalHelloWeb.g:437:1: ruleRotateR : ( ( rule__RotateR__Group__0 ) ) ;
    public final void ruleRotateR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:441:2: ( ( ( rule__RotateR__Group__0 ) ) )
            // InternalHelloWeb.g:442:2: ( ( rule__RotateR__Group__0 ) )
            {
            // InternalHelloWeb.g:442:2: ( ( rule__RotateR__Group__0 ) )
            // InternalHelloWeb.g:443:3: ( rule__RotateR__Group__0 )
            {
             before(grammarAccess.getRotateRAccess().getGroup()); 
            // InternalHelloWeb.g:444:3: ( rule__RotateR__Group__0 )
            // InternalHelloWeb.g:444:4: rule__RotateR__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RotateR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotateRAccess().getGroup()); 

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
    // $ANTLR end "ruleRotateR"


    // $ANTLR start "entryRuleWait"
    // InternalHelloWeb.g:453:1: entryRuleWait : ruleWait EOF ;
    public final void entryRuleWait() throws RecognitionException {
        try {
            // InternalHelloWeb.g:454:1: ( ruleWait EOF )
            // InternalHelloWeb.g:455:1: ruleWait EOF
            {
             before(grammarAccess.getWaitRule()); 
            pushFollow(FOLLOW_1);
            ruleWait();

            state._fsp--;

             after(grammarAccess.getWaitRule()); 
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
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // InternalHelloWeb.g:462:1: ruleWait : ( ( rule__Wait__Group__0 ) ) ;
    public final void ruleWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:466:2: ( ( ( rule__Wait__Group__0 ) ) )
            // InternalHelloWeb.g:467:2: ( ( rule__Wait__Group__0 ) )
            {
            // InternalHelloWeb.g:467:2: ( ( rule__Wait__Group__0 ) )
            // InternalHelloWeb.g:468:3: ( rule__Wait__Group__0 )
            {
             before(grammarAccess.getWaitAccess().getGroup()); 
            // InternalHelloWeb.g:469:3: ( rule__Wait__Group__0 )
            // InternalHelloWeb.g:469:4: rule__Wait__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Wait__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWaitAccess().getGroup()); 

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
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleFunctionName"
    // InternalHelloWeb.g:478:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalHelloWeb.g:479:1: ( ruleFunctionName EOF )
            // InternalHelloWeb.g:480:1: ruleFunctionName EOF
            {
             before(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionName();

            state._fsp--;

             after(grammarAccess.getFunctionNameRule()); 
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
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // InternalHelloWeb.g:487:1: ruleFunctionName : ( ( rule__FunctionName__Group__0 ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:491:2: ( ( ( rule__FunctionName__Group__0 ) ) )
            // InternalHelloWeb.g:492:2: ( ( rule__FunctionName__Group__0 ) )
            {
            // InternalHelloWeb.g:492:2: ( ( rule__FunctionName__Group__0 ) )
            // InternalHelloWeb.g:493:3: ( rule__FunctionName__Group__0 )
            {
             before(grammarAccess.getFunctionNameAccess().getGroup()); 
            // InternalHelloWeb.g:494:3: ( rule__FunctionName__Group__0 )
            // InternalHelloWeb.g:494:4: rule__FunctionName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionNameAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "rule__SuperCommand__Alternatives"
    // InternalHelloWeb.g:502:1: rule__SuperCommand__Alternatives : ( ( ruleCommand ) | ( ruleFunctionName ) );
    public final void rule__SuperCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:506:1: ( ( ruleCommand ) | ( ruleFunctionName ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15||(LA1_0>=18 && LA1_0<=26)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalHelloWeb.g:507:2: ( ruleCommand )
                    {
                    // InternalHelloWeb.g:507:2: ( ruleCommand )
                    // InternalHelloWeb.g:508:3: ruleCommand
                    {
                     before(grammarAccess.getSuperCommandAccess().getCommandParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCommand();

                    state._fsp--;

                     after(grammarAccess.getSuperCommandAccess().getCommandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHelloWeb.g:513:2: ( ruleFunctionName )
                    {
                    // InternalHelloWeb.g:513:2: ( ruleFunctionName )
                    // InternalHelloWeb.g:514:3: ruleFunctionName
                    {
                     before(grammarAccess.getSuperCommandAccess().getFunctionNameParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionName();

                    state._fsp--;

                     after(grammarAccess.getSuperCommandAccess().getFunctionNameParserRuleCall_1()); 

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
    // $ANTLR end "rule__SuperCommand__Alternatives"


    // $ANTLR start "rule__Command__Alternatives"
    // InternalHelloWeb.g:523:1: rule__Command__Alternatives : ( ( ruleUp ) | ( ruleDown ) | ( ruleLeft ) | ( ruleRight ) | ( ruleForward ) | ( ruleBackward ) | ( ruleRotateL ) | ( ruleRotateR ) | ( ruleWait ) | ( ruleSnapshot ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:527:1: ( ( ruleUp ) | ( ruleDown ) | ( ruleLeft ) | ( ruleRight ) | ( ruleForward ) | ( ruleBackward ) | ( ruleRotateL ) | ( ruleRotateR ) | ( ruleWait ) | ( ruleSnapshot ) )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            case 22:
                {
                alt2=5;
                }
                break;
            case 23:
                {
                alt2=6;
                }
                break;
            case 24:
                {
                alt2=7;
                }
                break;
            case 25:
                {
                alt2=8;
                }
                break;
            case 26:
                {
                alt2=9;
                }
                break;
            case 15:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalHelloWeb.g:528:2: ( ruleUp )
                    {
                    // InternalHelloWeb.g:528:2: ( ruleUp )
                    // InternalHelloWeb.g:529:3: ruleUp
                    {
                     before(grammarAccess.getCommandAccess().getUpParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUp();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getUpParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHelloWeb.g:534:2: ( ruleDown )
                    {
                    // InternalHelloWeb.g:534:2: ( ruleDown )
                    // InternalHelloWeb.g:535:3: ruleDown
                    {
                     before(grammarAccess.getCommandAccess().getDownParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDown();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getDownParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHelloWeb.g:540:2: ( ruleLeft )
                    {
                    // InternalHelloWeb.g:540:2: ( ruleLeft )
                    // InternalHelloWeb.g:541:3: ruleLeft
                    {
                     before(grammarAccess.getCommandAccess().getLeftParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLeft();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getLeftParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHelloWeb.g:546:2: ( ruleRight )
                    {
                    // InternalHelloWeb.g:546:2: ( ruleRight )
                    // InternalHelloWeb.g:547:3: ruleRight
                    {
                     before(grammarAccess.getCommandAccess().getRightParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRight();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getRightParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHelloWeb.g:552:2: ( ruleForward )
                    {
                    // InternalHelloWeb.g:552:2: ( ruleForward )
                    // InternalHelloWeb.g:553:3: ruleForward
                    {
                     before(grammarAccess.getCommandAccess().getForwardParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleForward();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getForwardParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHelloWeb.g:558:2: ( ruleBackward )
                    {
                    // InternalHelloWeb.g:558:2: ( ruleBackward )
                    // InternalHelloWeb.g:559:3: ruleBackward
                    {
                     before(grammarAccess.getCommandAccess().getBackwardParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleBackward();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getBackwardParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalHelloWeb.g:564:2: ( ruleRotateL )
                    {
                    // InternalHelloWeb.g:564:2: ( ruleRotateL )
                    // InternalHelloWeb.g:565:3: ruleRotateL
                    {
                     before(grammarAccess.getCommandAccess().getRotateLParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleRotateL();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getRotateLParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalHelloWeb.g:570:2: ( ruleRotateR )
                    {
                    // InternalHelloWeb.g:570:2: ( ruleRotateR )
                    // InternalHelloWeb.g:571:3: ruleRotateR
                    {
                     before(grammarAccess.getCommandAccess().getRotateRParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleRotateR();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getRotateRParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalHelloWeb.g:576:2: ( ruleWait )
                    {
                    // InternalHelloWeb.g:576:2: ( ruleWait )
                    // InternalHelloWeb.g:577:3: ruleWait
                    {
                     before(grammarAccess.getCommandAccess().getWaitParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleWait();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getWaitParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalHelloWeb.g:582:2: ( ruleSnapshot )
                    {
                    // InternalHelloWeb.g:582:2: ( ruleSnapshot )
                    // InternalHelloWeb.g:583:3: ruleSnapshot
                    {
                     before(grammarAccess.getCommandAccess().getSnapshotParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleSnapshot();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getSnapshotParserRuleCall_9()); 

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
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__Main__Group__0"
    // InternalHelloWeb.g:592:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:596:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalHelloWeb.g:597:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Main__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__1();

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
    // $ANTLR end "rule__Main__Group__0"


    // $ANTLR start "rule__Main__Group__0__Impl"
    // InternalHelloWeb.g:604:1: rule__Main__Group__0__Impl : ( ( rule__Main__Group_0__0 )? ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:608:1: ( ( ( rule__Main__Group_0__0 )? ) )
            // InternalHelloWeb.g:609:1: ( ( rule__Main__Group_0__0 )? )
            {
            // InternalHelloWeb.g:609:1: ( ( rule__Main__Group_0__0 )? )
            // InternalHelloWeb.g:610:2: ( rule__Main__Group_0__0 )?
            {
             before(grammarAccess.getMainAccess().getGroup_0()); 
            // InternalHelloWeb.g:611:2: ( rule__Main__Group_0__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalHelloWeb.g:611:3: rule__Main__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Main__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMainAccess().getGroup_0()); 

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
    // $ANTLR end "rule__Main__Group__0__Impl"


    // $ANTLR start "rule__Main__Group__1"
    // InternalHelloWeb.g:619:1: rule__Main__Group__1 : rule__Main__Group__1__Impl ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:623:1: ( rule__Main__Group__1__Impl )
            // InternalHelloWeb.g:624:2: rule__Main__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__1__Impl();

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
    // $ANTLR end "rule__Main__Group__1"


    // $ANTLR start "rule__Main__Group__1__Impl"
    // InternalHelloWeb.g:630:1: rule__Main__Group__1__Impl : ( ( rule__Main__Group_1__0 )? ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:634:1: ( ( ( rule__Main__Group_1__0 )? ) )
            // InternalHelloWeb.g:635:1: ( ( rule__Main__Group_1__0 )? )
            {
            // InternalHelloWeb.g:635:1: ( ( rule__Main__Group_1__0 )? )
            // InternalHelloWeb.g:636:2: ( rule__Main__Group_1__0 )?
            {
             before(grammarAccess.getMainAccess().getGroup_1()); 
            // InternalHelloWeb.g:637:2: ( rule__Main__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalHelloWeb.g:637:3: rule__Main__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Main__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMainAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Main__Group__1__Impl"


    // $ANTLR start "rule__Main__Group_0__0"
    // InternalHelloWeb.g:646:1: rule__Main__Group_0__0 : rule__Main__Group_0__0__Impl rule__Main__Group_0__1 ;
    public final void rule__Main__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:650:1: ( rule__Main__Group_0__0__Impl rule__Main__Group_0__1 )
            // InternalHelloWeb.g:651:2: rule__Main__Group_0__0__Impl rule__Main__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Main__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group_0__1();

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
    // $ANTLR end "rule__Main__Group_0__0"


    // $ANTLR start "rule__Main__Group_0__0__Impl"
    // InternalHelloWeb.g:658:1: rule__Main__Group_0__0__Impl : ( ( rule__Main__CommandsAssignment_0_0 ) ) ;
    public final void rule__Main__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:662:1: ( ( ( rule__Main__CommandsAssignment_0_0 ) ) )
            // InternalHelloWeb.g:663:1: ( ( rule__Main__CommandsAssignment_0_0 ) )
            {
            // InternalHelloWeb.g:663:1: ( ( rule__Main__CommandsAssignment_0_0 ) )
            // InternalHelloWeb.g:664:2: ( rule__Main__CommandsAssignment_0_0 )
            {
             before(grammarAccess.getMainAccess().getCommandsAssignment_0_0()); 
            // InternalHelloWeb.g:665:2: ( rule__Main__CommandsAssignment_0_0 )
            // InternalHelloWeb.g:665:3: rule__Main__CommandsAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Main__CommandsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getCommandsAssignment_0_0()); 

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
    // $ANTLR end "rule__Main__Group_0__0__Impl"


    // $ANTLR start "rule__Main__Group_0__1"
    // InternalHelloWeb.g:673:1: rule__Main__Group_0__1 : rule__Main__Group_0__1__Impl ;
    public final void rule__Main__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:677:1: ( rule__Main__Group_0__1__Impl )
            // InternalHelloWeb.g:678:2: rule__Main__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group_0__1__Impl();

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
    // $ANTLR end "rule__Main__Group_0__1"


    // $ANTLR start "rule__Main__Group_0__1__Impl"
    // InternalHelloWeb.g:684:1: rule__Main__Group_0__1__Impl : ( ( ';' )? ) ;
    public final void rule__Main__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:688:1: ( ( ( ';' )? ) )
            // InternalHelloWeb.g:689:1: ( ( ';' )? )
            {
            // InternalHelloWeb.g:689:1: ( ( ';' )? )
            // InternalHelloWeb.g:690:2: ( ';' )?
            {
             before(grammarAccess.getMainAccess().getSemicolonKeyword_0_1()); 
            // InternalHelloWeb.g:691:2: ( ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalHelloWeb.g:691:3: ';'
                    {
                    match(input,13,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMainAccess().getSemicolonKeyword_0_1()); 

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
    // $ANTLR end "rule__Main__Group_0__1__Impl"


    // $ANTLR start "rule__Main__Group_1__0"
    // InternalHelloWeb.g:700:1: rule__Main__Group_1__0 : rule__Main__Group_1__0__Impl rule__Main__Group_1__1 ;
    public final void rule__Main__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:704:1: ( rule__Main__Group_1__0__Impl rule__Main__Group_1__1 )
            // InternalHelloWeb.g:705:2: rule__Main__Group_1__0__Impl rule__Main__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Main__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group_1__1();

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
    // $ANTLR end "rule__Main__Group_1__0"


    // $ANTLR start "rule__Main__Group_1__0__Impl"
    // InternalHelloWeb.g:712:1: rule__Main__Group_1__0__Impl : ( ( rule__Main__Group_1_0__0 ) ) ;
    public final void rule__Main__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:716:1: ( ( ( rule__Main__Group_1_0__0 ) ) )
            // InternalHelloWeb.g:717:1: ( ( rule__Main__Group_1_0__0 ) )
            {
            // InternalHelloWeb.g:717:1: ( ( rule__Main__Group_1_0__0 ) )
            // InternalHelloWeb.g:718:2: ( rule__Main__Group_1_0__0 )
            {
             before(grammarAccess.getMainAccess().getGroup_1_0()); 
            // InternalHelloWeb.g:719:2: ( rule__Main__Group_1_0__0 )
            // InternalHelloWeb.g:719:3: rule__Main__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getGroup_1_0()); 

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
    // $ANTLR end "rule__Main__Group_1__0__Impl"


    // $ANTLR start "rule__Main__Group_1__1"
    // InternalHelloWeb.g:727:1: rule__Main__Group_1__1 : rule__Main__Group_1__1__Impl rule__Main__Group_1__2 ;
    public final void rule__Main__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:731:1: ( rule__Main__Group_1__1__Impl rule__Main__Group_1__2 )
            // InternalHelloWeb.g:732:2: rule__Main__Group_1__1__Impl rule__Main__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Main__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group_1__2();

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
    // $ANTLR end "rule__Main__Group_1__1"


    // $ANTLR start "rule__Main__Group_1__1__Impl"
    // InternalHelloWeb.g:739:1: rule__Main__Group_1__1__Impl : ( ( rule__Main__Group_1_1__0 )* ) ;
    public final void rule__Main__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:743:1: ( ( ( rule__Main__Group_1_1__0 )* ) )
            // InternalHelloWeb.g:744:1: ( ( rule__Main__Group_1_1__0 )* )
            {
            // InternalHelloWeb.g:744:1: ( ( rule__Main__Group_1_1__0 )* )
            // InternalHelloWeb.g:745:2: ( rule__Main__Group_1_1__0 )*
            {
             before(grammarAccess.getMainAccess().getGroup_1_1()); 
            // InternalHelloWeb.g:746:2: ( rule__Main__Group_1_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==15||(LA6_0>=18 && LA6_0<=26)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalHelloWeb.g:746:3: rule__Main__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Main__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMainAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Main__Group_1__1__Impl"


    // $ANTLR start "rule__Main__Group_1__2"
    // InternalHelloWeb.g:754:1: rule__Main__Group_1__2 : rule__Main__Group_1__2__Impl ;
    public final void rule__Main__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:758:1: ( rule__Main__Group_1__2__Impl )
            // InternalHelloWeb.g:759:2: rule__Main__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group_1__2__Impl();

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
    // $ANTLR end "rule__Main__Group_1__2"


    // $ANTLR start "rule__Main__Group_1__2__Impl"
    // InternalHelloWeb.g:765:1: rule__Main__Group_1__2__Impl : ( ( rule__Main__Group_1_2__0 ) ) ;
    public final void rule__Main__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:769:1: ( ( ( rule__Main__Group_1_2__0 ) ) )
            // InternalHelloWeb.g:770:1: ( ( rule__Main__Group_1_2__0 ) )
            {
            // InternalHelloWeb.g:770:1: ( ( rule__Main__Group_1_2__0 ) )
            // InternalHelloWeb.g:771:2: ( rule__Main__Group_1_2__0 )
            {
             before(grammarAccess.getMainAccess().getGroup_1_2()); 
            // InternalHelloWeb.g:772:2: ( rule__Main__Group_1_2__0 )
            // InternalHelloWeb.g:772:3: rule__Main__Group_1_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Main__Group_1__2__Impl"


    // $ANTLR start "rule__Main__Group_1_0__0"
    // InternalHelloWeb.g:781:1: rule__Main__Group_1_0__0 : rule__Main__Group_1_0__0__Impl rule__Main__Group_1_0__1 ;
    public final void rule__Main__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:785:1: ( rule__Main__Group_1_0__0__Impl rule__Main__Group_1_0__1 )
            // InternalHelloWeb.g:786:2: rule__Main__Group_1_0__0__Impl rule__Main__Group_1_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Main__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group_1_0__1();

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
    // $ANTLR end "rule__Main__Group_1_0__0"


    // $ANTLR start "rule__Main__Group_1_0__0__Impl"
    // InternalHelloWeb.g:793:1: rule__Main__Group_1_0__0__Impl : ( ( rule__Main__TakeoffAssignment_1_0_0 ) ) ;
    public final void rule__Main__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:797:1: ( ( ( rule__Main__TakeoffAssignment_1_0_0 ) ) )
            // InternalHelloWeb.g:798:1: ( ( rule__Main__TakeoffAssignment_1_0_0 ) )
            {
            // InternalHelloWeb.g:798:1: ( ( rule__Main__TakeoffAssignment_1_0_0 ) )
            // InternalHelloWeb.g:799:2: ( rule__Main__TakeoffAssignment_1_0_0 )
            {
             before(grammarAccess.getMainAccess().getTakeoffAssignment_1_0_0()); 
            // InternalHelloWeb.g:800:2: ( rule__Main__TakeoffAssignment_1_0_0 )
            // InternalHelloWeb.g:800:3: rule__Main__TakeoffAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Main__TakeoffAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getTakeoffAssignment_1_0_0()); 

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
    // $ANTLR end "rule__Main__Group_1_0__0__Impl"


    // $ANTLR start "rule__Main__Group_1_0__1"
    // InternalHelloWeb.g:808:1: rule__Main__Group_1_0__1 : rule__Main__Group_1_0__1__Impl ;
    public final void rule__Main__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:812:1: ( rule__Main__Group_1_0__1__Impl )
            // InternalHelloWeb.g:813:2: rule__Main__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__Main__Group_1_0__1"


    // $ANTLR start "rule__Main__Group_1_0__1__Impl"
    // InternalHelloWeb.g:819:1: rule__Main__Group_1_0__1__Impl : ( ( ';' )? ) ;
    public final void rule__Main__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:823:1: ( ( ( ';' )? ) )
            // InternalHelloWeb.g:824:1: ( ( ';' )? )
            {
            // InternalHelloWeb.g:824:1: ( ( ';' )? )
            // InternalHelloWeb.g:825:2: ( ';' )?
            {
             before(grammarAccess.getMainAccess().getSemicolonKeyword_1_0_1()); 
            // InternalHelloWeb.g:826:2: ( ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalHelloWeb.g:826:3: ';'
                    {
                    match(input,13,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMainAccess().getSemicolonKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Main__Group_1_0__1__Impl"


    // $ANTLR start "rule__Main__Group_1_1__0"
    // InternalHelloWeb.g:835:1: rule__Main__Group_1_1__0 : rule__Main__Group_1_1__0__Impl rule__Main__Group_1_1__1 ;
    public final void rule__Main__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:839:1: ( rule__Main__Group_1_1__0__Impl rule__Main__Group_1_1__1 )
            // InternalHelloWeb.g:840:2: rule__Main__Group_1_1__0__Impl rule__Main__Group_1_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Main__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group_1_1__1();

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
    // $ANTLR end "rule__Main__Group_1_1__0"


    // $ANTLR start "rule__Main__Group_1_1__0__Impl"
    // InternalHelloWeb.g:847:1: rule__Main__Group_1_1__0__Impl : ( ( rule__Main__CommandsAssignment_1_1_0 ) ) ;
    public final void rule__Main__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:851:1: ( ( ( rule__Main__CommandsAssignment_1_1_0 ) ) )
            // InternalHelloWeb.g:852:1: ( ( rule__Main__CommandsAssignment_1_1_0 ) )
            {
            // InternalHelloWeb.g:852:1: ( ( rule__Main__CommandsAssignment_1_1_0 ) )
            // InternalHelloWeb.g:853:2: ( rule__Main__CommandsAssignment_1_1_0 )
            {
             before(grammarAccess.getMainAccess().getCommandsAssignment_1_1_0()); 
            // InternalHelloWeb.g:854:2: ( rule__Main__CommandsAssignment_1_1_0 )
            // InternalHelloWeb.g:854:3: rule__Main__CommandsAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Main__CommandsAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getCommandsAssignment_1_1_0()); 

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
    // $ANTLR end "rule__Main__Group_1_1__0__Impl"


    // $ANTLR start "rule__Main__Group_1_1__1"
    // InternalHelloWeb.g:862:1: rule__Main__Group_1_1__1 : rule__Main__Group_1_1__1__Impl ;
    public final void rule__Main__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:866:1: ( rule__Main__Group_1_1__1__Impl )
            // InternalHelloWeb.g:867:2: rule__Main__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Main__Group_1_1__1"


    // $ANTLR start "rule__Main__Group_1_1__1__Impl"
    // InternalHelloWeb.g:873:1: rule__Main__Group_1_1__1__Impl : ( ( ';' )? ) ;
    public final void rule__Main__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:877:1: ( ( ( ';' )? ) )
            // InternalHelloWeb.g:878:1: ( ( ';' )? )
            {
            // InternalHelloWeb.g:878:1: ( ( ';' )? )
            // InternalHelloWeb.g:879:2: ( ';' )?
            {
             before(grammarAccess.getMainAccess().getSemicolonKeyword_1_1_1()); 
            // InternalHelloWeb.g:880:2: ( ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalHelloWeb.g:880:3: ';'
                    {
                    match(input,13,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMainAccess().getSemicolonKeyword_1_1_1()); 

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
    // $ANTLR end "rule__Main__Group_1_1__1__Impl"


    // $ANTLR start "rule__Main__Group_1_2__0"
    // InternalHelloWeb.g:889:1: rule__Main__Group_1_2__0 : rule__Main__Group_1_2__0__Impl rule__Main__Group_1_2__1 ;
    public final void rule__Main__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:893:1: ( rule__Main__Group_1_2__0__Impl rule__Main__Group_1_2__1 )
            // InternalHelloWeb.g:894:2: rule__Main__Group_1_2__0__Impl rule__Main__Group_1_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Main__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group_1_2__1();

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
    // $ANTLR end "rule__Main__Group_1_2__0"


    // $ANTLR start "rule__Main__Group_1_2__0__Impl"
    // InternalHelloWeb.g:901:1: rule__Main__Group_1_2__0__Impl : ( ( rule__Main__LandAssignment_1_2_0 ) ) ;
    public final void rule__Main__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:905:1: ( ( ( rule__Main__LandAssignment_1_2_0 ) ) )
            // InternalHelloWeb.g:906:1: ( ( rule__Main__LandAssignment_1_2_0 ) )
            {
            // InternalHelloWeb.g:906:1: ( ( rule__Main__LandAssignment_1_2_0 ) )
            // InternalHelloWeb.g:907:2: ( rule__Main__LandAssignment_1_2_0 )
            {
             before(grammarAccess.getMainAccess().getLandAssignment_1_2_0()); 
            // InternalHelloWeb.g:908:2: ( rule__Main__LandAssignment_1_2_0 )
            // InternalHelloWeb.g:908:3: rule__Main__LandAssignment_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Main__LandAssignment_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getLandAssignment_1_2_0()); 

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
    // $ANTLR end "rule__Main__Group_1_2__0__Impl"


    // $ANTLR start "rule__Main__Group_1_2__1"
    // InternalHelloWeb.g:916:1: rule__Main__Group_1_2__1 : rule__Main__Group_1_2__1__Impl ;
    public final void rule__Main__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:920:1: ( rule__Main__Group_1_2__1__Impl )
            // InternalHelloWeb.g:921:2: rule__Main__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__Main__Group_1_2__1"


    // $ANTLR start "rule__Main__Group_1_2__1__Impl"
    // InternalHelloWeb.g:927:1: rule__Main__Group_1_2__1__Impl : ( ( ';' )? ) ;
    public final void rule__Main__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:931:1: ( ( ( ';' )? ) )
            // InternalHelloWeb.g:932:1: ( ( ';' )? )
            {
            // InternalHelloWeb.g:932:1: ( ( ';' )? )
            // InternalHelloWeb.g:933:2: ( ';' )?
            {
             before(grammarAccess.getMainAccess().getSemicolonKeyword_1_2_1()); 
            // InternalHelloWeb.g:934:2: ( ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalHelloWeb.g:934:3: ';'
                    {
                    match(input,13,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMainAccess().getSemicolonKeyword_1_2_1()); 

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
    // $ANTLR end "rule__Main__Group_1_2__1__Impl"


    // $ANTLR start "rule__DOUBLE__Group__0"
    // InternalHelloWeb.g:943:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:947:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // InternalHelloWeb.g:948:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__1();

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
    // $ANTLR end "rule__DOUBLE__Group__0"


    // $ANTLR start "rule__DOUBLE__Group__0__Impl"
    // InternalHelloWeb.g:955:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:959:1: ( ( RULE_INT ) )
            // InternalHelloWeb.g:960:1: ( RULE_INT )
            {
            // InternalHelloWeb.g:960:1: ( RULE_INT )
            // InternalHelloWeb.g:961:2: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__DOUBLE__Group__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group__1"
    // InternalHelloWeb.g:970:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:974:1: ( rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 )
            // InternalHelloWeb.g:975:2: rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__DOUBLE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__2();

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
    // $ANTLR end "rule__DOUBLE__Group__1"


    // $ANTLR start "rule__DOUBLE__Group__1__Impl"
    // InternalHelloWeb.g:982:1: rule__DOUBLE__Group__1__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:986:1: ( ( '.' ) )
            // InternalHelloWeb.g:987:1: ( '.' )
            {
            // InternalHelloWeb.g:987:1: ( '.' )
            // InternalHelloWeb.g:988:2: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__DOUBLE__Group__1__Impl"


    // $ANTLR start "rule__DOUBLE__Group__2"
    // InternalHelloWeb.g:997:1: rule__DOUBLE__Group__2 : rule__DOUBLE__Group__2__Impl ;
    public final void rule__DOUBLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1001:1: ( rule__DOUBLE__Group__2__Impl )
            // InternalHelloWeb.g:1002:2: rule__DOUBLE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__2__Impl();

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
    // $ANTLR end "rule__DOUBLE__Group__2"


    // $ANTLR start "rule__DOUBLE__Group__2__Impl"
    // InternalHelloWeb.g:1008:1: rule__DOUBLE__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1012:1: ( ( RULE_INT ) )
            // InternalHelloWeb.g:1013:1: ( RULE_INT )
            {
            // InternalHelloWeb.g:1013:1: ( RULE_INT )
            // InternalHelloWeb.g:1014:2: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__DOUBLE__Group__2__Impl"


    // $ANTLR start "rule__Snapshot__Group__0"
    // InternalHelloWeb.g:1024:1: rule__Snapshot__Group__0 : rule__Snapshot__Group__0__Impl rule__Snapshot__Group__1 ;
    public final void rule__Snapshot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1028:1: ( rule__Snapshot__Group__0__Impl rule__Snapshot__Group__1 )
            // InternalHelloWeb.g:1029:2: rule__Snapshot__Group__0__Impl rule__Snapshot__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Snapshot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Snapshot__Group__1();

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
    // $ANTLR end "rule__Snapshot__Group__0"


    // $ANTLR start "rule__Snapshot__Group__0__Impl"
    // InternalHelloWeb.g:1036:1: rule__Snapshot__Group__0__Impl : ( 'SNAPSHOT' ) ;
    public final void rule__Snapshot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1040:1: ( ( 'SNAPSHOT' ) )
            // InternalHelloWeb.g:1041:1: ( 'SNAPSHOT' )
            {
            // InternalHelloWeb.g:1041:1: ( 'SNAPSHOT' )
            // InternalHelloWeb.g:1042:2: 'SNAPSHOT'
            {
             before(grammarAccess.getSnapshotAccess().getSNAPSHOTKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSnapshotAccess().getSNAPSHOTKeyword_0()); 

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
    // $ANTLR end "rule__Snapshot__Group__0__Impl"


    // $ANTLR start "rule__Snapshot__Group__1"
    // InternalHelloWeb.g:1051:1: rule__Snapshot__Group__1 : rule__Snapshot__Group__1__Impl rule__Snapshot__Group__2 ;
    public final void rule__Snapshot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1055:1: ( rule__Snapshot__Group__1__Impl rule__Snapshot__Group__2 )
            // InternalHelloWeb.g:1056:2: rule__Snapshot__Group__1__Impl rule__Snapshot__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Snapshot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Snapshot__Group__2();

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
    // $ANTLR end "rule__Snapshot__Group__1"


    // $ANTLR start "rule__Snapshot__Group__1__Impl"
    // InternalHelloWeb.g:1063:1: rule__Snapshot__Group__1__Impl : ( '(' ) ;
    public final void rule__Snapshot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1067:1: ( ( '(' ) )
            // InternalHelloWeb.g:1068:1: ( '(' )
            {
            // InternalHelloWeb.g:1068:1: ( '(' )
            // InternalHelloWeb.g:1069:2: '('
            {
             before(grammarAccess.getSnapshotAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSnapshotAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Snapshot__Group__1__Impl"


    // $ANTLR start "rule__Snapshot__Group__2"
    // InternalHelloWeb.g:1078:1: rule__Snapshot__Group__2 : rule__Snapshot__Group__2__Impl rule__Snapshot__Group__3 ;
    public final void rule__Snapshot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1082:1: ( rule__Snapshot__Group__2__Impl rule__Snapshot__Group__3 )
            // InternalHelloWeb.g:1083:2: rule__Snapshot__Group__2__Impl rule__Snapshot__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Snapshot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Snapshot__Group__3();

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
    // $ANTLR end "rule__Snapshot__Group__2"


    // $ANTLR start "rule__Snapshot__Group__2__Impl"
    // InternalHelloWeb.g:1090:1: rule__Snapshot__Group__2__Impl : ( ( rule__Snapshot__Image_nameAssignment_2 ) ) ;
    public final void rule__Snapshot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1094:1: ( ( ( rule__Snapshot__Image_nameAssignment_2 ) ) )
            // InternalHelloWeb.g:1095:1: ( ( rule__Snapshot__Image_nameAssignment_2 ) )
            {
            // InternalHelloWeb.g:1095:1: ( ( rule__Snapshot__Image_nameAssignment_2 ) )
            // InternalHelloWeb.g:1096:2: ( rule__Snapshot__Image_nameAssignment_2 )
            {
             before(grammarAccess.getSnapshotAccess().getImage_nameAssignment_2()); 
            // InternalHelloWeb.g:1097:2: ( rule__Snapshot__Image_nameAssignment_2 )
            // InternalHelloWeb.g:1097:3: rule__Snapshot__Image_nameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Snapshot__Image_nameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSnapshotAccess().getImage_nameAssignment_2()); 

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
    // $ANTLR end "rule__Snapshot__Group__2__Impl"


    // $ANTLR start "rule__Snapshot__Group__3"
    // InternalHelloWeb.g:1105:1: rule__Snapshot__Group__3 : rule__Snapshot__Group__3__Impl ;
    public final void rule__Snapshot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1109:1: ( rule__Snapshot__Group__3__Impl )
            // InternalHelloWeb.g:1110:2: rule__Snapshot__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Snapshot__Group__3__Impl();

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
    // $ANTLR end "rule__Snapshot__Group__3"


    // $ANTLR start "rule__Snapshot__Group__3__Impl"
    // InternalHelloWeb.g:1116:1: rule__Snapshot__Group__3__Impl : ( ')' ) ;
    public final void rule__Snapshot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1120:1: ( ( ')' ) )
            // InternalHelloWeb.g:1121:1: ( ')' )
            {
            // InternalHelloWeb.g:1121:1: ( ')' )
            // InternalHelloWeb.g:1122:2: ')'
            {
             before(grammarAccess.getSnapshotAccess().getRightParenthesisKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSnapshotAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Snapshot__Group__3__Impl"


    // $ANTLR start "rule__Up__Group__0"
    // InternalHelloWeb.g:1132:1: rule__Up__Group__0 : rule__Up__Group__0__Impl rule__Up__Group__1 ;
    public final void rule__Up__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1136:1: ( rule__Up__Group__0__Impl rule__Up__Group__1 )
            // InternalHelloWeb.g:1137:2: rule__Up__Group__0__Impl rule__Up__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Up__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Up__Group__1();

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
    // $ANTLR end "rule__Up__Group__0"


    // $ANTLR start "rule__Up__Group__0__Impl"
    // InternalHelloWeb.g:1144:1: rule__Up__Group__0__Impl : ( 'UP' ) ;
    public final void rule__Up__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1148:1: ( ( 'UP' ) )
            // InternalHelloWeb.g:1149:1: ( 'UP' )
            {
            // InternalHelloWeb.g:1149:1: ( 'UP' )
            // InternalHelloWeb.g:1150:2: 'UP'
            {
             before(grammarAccess.getUpAccess().getUPKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUpAccess().getUPKeyword_0()); 

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
    // $ANTLR end "rule__Up__Group__0__Impl"


    // $ANTLR start "rule__Up__Group__1"
    // InternalHelloWeb.g:1159:1: rule__Up__Group__1 : rule__Up__Group__1__Impl rule__Up__Group__2 ;
    public final void rule__Up__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1163:1: ( rule__Up__Group__1__Impl rule__Up__Group__2 )
            // InternalHelloWeb.g:1164:2: rule__Up__Group__1__Impl rule__Up__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Up__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Up__Group__2();

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
    // $ANTLR end "rule__Up__Group__1"


    // $ANTLR start "rule__Up__Group__1__Impl"
    // InternalHelloWeb.g:1171:1: rule__Up__Group__1__Impl : ( '(' ) ;
    public final void rule__Up__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1175:1: ( ( '(' ) )
            // InternalHelloWeb.g:1176:1: ( '(' )
            {
            // InternalHelloWeb.g:1176:1: ( '(' )
            // InternalHelloWeb.g:1177:2: '('
            {
             before(grammarAccess.getUpAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUpAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Up__Group__1__Impl"


    // $ANTLR start "rule__Up__Group__2"
    // InternalHelloWeb.g:1186:1: rule__Up__Group__2 : rule__Up__Group__2__Impl rule__Up__Group__3 ;
    public final void rule__Up__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1190:1: ( rule__Up__Group__2__Impl rule__Up__Group__3 )
            // InternalHelloWeb.g:1191:2: rule__Up__Group__2__Impl rule__Up__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Up__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Up__Group__3();

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
    // $ANTLR end "rule__Up__Group__2"


    // $ANTLR start "rule__Up__Group__2__Impl"
    // InternalHelloWeb.g:1198:1: rule__Up__Group__2__Impl : ( ( rule__Up__DistanceAssignment_2 ) ) ;
    public final void rule__Up__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1202:1: ( ( ( rule__Up__DistanceAssignment_2 ) ) )
            // InternalHelloWeb.g:1203:1: ( ( rule__Up__DistanceAssignment_2 ) )
            {
            // InternalHelloWeb.g:1203:1: ( ( rule__Up__DistanceAssignment_2 ) )
            // InternalHelloWeb.g:1204:2: ( rule__Up__DistanceAssignment_2 )
            {
             before(grammarAccess.getUpAccess().getDistanceAssignment_2()); 
            // InternalHelloWeb.g:1205:2: ( rule__Up__DistanceAssignment_2 )
            // InternalHelloWeb.g:1205:3: rule__Up__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Up__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUpAccess().getDistanceAssignment_2()); 

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
    // $ANTLR end "rule__Up__Group__2__Impl"


    // $ANTLR start "rule__Up__Group__3"
    // InternalHelloWeb.g:1213:1: rule__Up__Group__3 : rule__Up__Group__3__Impl ;
    public final void rule__Up__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1217:1: ( rule__Up__Group__3__Impl )
            // InternalHelloWeb.g:1218:2: rule__Up__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Up__Group__3__Impl();

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
    // $ANTLR end "rule__Up__Group__3"


    // $ANTLR start "rule__Up__Group__3__Impl"
    // InternalHelloWeb.g:1224:1: rule__Up__Group__3__Impl : ( ')' ) ;
    public final void rule__Up__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1228:1: ( ( ')' ) )
            // InternalHelloWeb.g:1229:1: ( ')' )
            {
            // InternalHelloWeb.g:1229:1: ( ')' )
            // InternalHelloWeb.g:1230:2: ')'
            {
             before(grammarAccess.getUpAccess().getRightParenthesisKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUpAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Up__Group__3__Impl"


    // $ANTLR start "rule__Down__Group__0"
    // InternalHelloWeb.g:1240:1: rule__Down__Group__0 : rule__Down__Group__0__Impl rule__Down__Group__1 ;
    public final void rule__Down__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1244:1: ( rule__Down__Group__0__Impl rule__Down__Group__1 )
            // InternalHelloWeb.g:1245:2: rule__Down__Group__0__Impl rule__Down__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Down__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Down__Group__1();

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
    // $ANTLR end "rule__Down__Group__0"


    // $ANTLR start "rule__Down__Group__0__Impl"
    // InternalHelloWeb.g:1252:1: rule__Down__Group__0__Impl : ( 'DOWN' ) ;
    public final void rule__Down__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1256:1: ( ( 'DOWN' ) )
            // InternalHelloWeb.g:1257:1: ( 'DOWN' )
            {
            // InternalHelloWeb.g:1257:1: ( 'DOWN' )
            // InternalHelloWeb.g:1258:2: 'DOWN'
            {
             before(grammarAccess.getDownAccess().getDOWNKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDownAccess().getDOWNKeyword_0()); 

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
    // $ANTLR end "rule__Down__Group__0__Impl"


    // $ANTLR start "rule__Down__Group__1"
    // InternalHelloWeb.g:1267:1: rule__Down__Group__1 : rule__Down__Group__1__Impl rule__Down__Group__2 ;
    public final void rule__Down__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1271:1: ( rule__Down__Group__1__Impl rule__Down__Group__2 )
            // InternalHelloWeb.g:1272:2: rule__Down__Group__1__Impl rule__Down__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Down__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Down__Group__2();

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
    // $ANTLR end "rule__Down__Group__1"


    // $ANTLR start "rule__Down__Group__1__Impl"
    // InternalHelloWeb.g:1279:1: rule__Down__Group__1__Impl : ( '(' ) ;
    public final void rule__Down__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1283:1: ( ( '(' ) )
            // InternalHelloWeb.g:1284:1: ( '(' )
            {
            // InternalHelloWeb.g:1284:1: ( '(' )
            // InternalHelloWeb.g:1285:2: '('
            {
             before(grammarAccess.getDownAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDownAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Down__Group__1__Impl"


    // $ANTLR start "rule__Down__Group__2"
    // InternalHelloWeb.g:1294:1: rule__Down__Group__2 : rule__Down__Group__2__Impl rule__Down__Group__3 ;
    public final void rule__Down__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1298:1: ( rule__Down__Group__2__Impl rule__Down__Group__3 )
            // InternalHelloWeb.g:1299:2: rule__Down__Group__2__Impl rule__Down__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Down__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Down__Group__3();

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
    // $ANTLR end "rule__Down__Group__2"


    // $ANTLR start "rule__Down__Group__2__Impl"
    // InternalHelloWeb.g:1306:1: rule__Down__Group__2__Impl : ( ( rule__Down__DistanceAssignment_2 ) ) ;
    public final void rule__Down__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1310:1: ( ( ( rule__Down__DistanceAssignment_2 ) ) )
            // InternalHelloWeb.g:1311:1: ( ( rule__Down__DistanceAssignment_2 ) )
            {
            // InternalHelloWeb.g:1311:1: ( ( rule__Down__DistanceAssignment_2 ) )
            // InternalHelloWeb.g:1312:2: ( rule__Down__DistanceAssignment_2 )
            {
             before(grammarAccess.getDownAccess().getDistanceAssignment_2()); 
            // InternalHelloWeb.g:1313:2: ( rule__Down__DistanceAssignment_2 )
            // InternalHelloWeb.g:1313:3: rule__Down__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Down__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDownAccess().getDistanceAssignment_2()); 

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
    // $ANTLR end "rule__Down__Group__2__Impl"


    // $ANTLR start "rule__Down__Group__3"
    // InternalHelloWeb.g:1321:1: rule__Down__Group__3 : rule__Down__Group__3__Impl ;
    public final void rule__Down__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1325:1: ( rule__Down__Group__3__Impl )
            // InternalHelloWeb.g:1326:2: rule__Down__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Down__Group__3__Impl();

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
    // $ANTLR end "rule__Down__Group__3"


    // $ANTLR start "rule__Down__Group__3__Impl"
    // InternalHelloWeb.g:1332:1: rule__Down__Group__3__Impl : ( ')' ) ;
    public final void rule__Down__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1336:1: ( ( ')' ) )
            // InternalHelloWeb.g:1337:1: ( ')' )
            {
            // InternalHelloWeb.g:1337:1: ( ')' )
            // InternalHelloWeb.g:1338:2: ')'
            {
             before(grammarAccess.getDownAccess().getRightParenthesisKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDownAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Down__Group__3__Impl"


    // $ANTLR start "rule__Left__Group__0"
    // InternalHelloWeb.g:1348:1: rule__Left__Group__0 : rule__Left__Group__0__Impl rule__Left__Group__1 ;
    public final void rule__Left__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1352:1: ( rule__Left__Group__0__Impl rule__Left__Group__1 )
            // InternalHelloWeb.g:1353:2: rule__Left__Group__0__Impl rule__Left__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Left__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Left__Group__1();

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
    // $ANTLR end "rule__Left__Group__0"


    // $ANTLR start "rule__Left__Group__0__Impl"
    // InternalHelloWeb.g:1360:1: rule__Left__Group__0__Impl : ( 'LEFT' ) ;
    public final void rule__Left__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1364:1: ( ( 'LEFT' ) )
            // InternalHelloWeb.g:1365:1: ( 'LEFT' )
            {
            // InternalHelloWeb.g:1365:1: ( 'LEFT' )
            // InternalHelloWeb.g:1366:2: 'LEFT'
            {
             before(grammarAccess.getLeftAccess().getLEFTKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLeftAccess().getLEFTKeyword_0()); 

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
    // $ANTLR end "rule__Left__Group__0__Impl"


    // $ANTLR start "rule__Left__Group__1"
    // InternalHelloWeb.g:1375:1: rule__Left__Group__1 : rule__Left__Group__1__Impl rule__Left__Group__2 ;
    public final void rule__Left__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1379:1: ( rule__Left__Group__1__Impl rule__Left__Group__2 )
            // InternalHelloWeb.g:1380:2: rule__Left__Group__1__Impl rule__Left__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Left__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Left__Group__2();

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
    // $ANTLR end "rule__Left__Group__1"


    // $ANTLR start "rule__Left__Group__1__Impl"
    // InternalHelloWeb.g:1387:1: rule__Left__Group__1__Impl : ( '(' ) ;
    public final void rule__Left__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1391:1: ( ( '(' ) )
            // InternalHelloWeb.g:1392:1: ( '(' )
            {
            // InternalHelloWeb.g:1392:1: ( '(' )
            // InternalHelloWeb.g:1393:2: '('
            {
             before(grammarAccess.getLeftAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLeftAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Left__Group__1__Impl"


    // $ANTLR start "rule__Left__Group__2"
    // InternalHelloWeb.g:1402:1: rule__Left__Group__2 : rule__Left__Group__2__Impl rule__Left__Group__3 ;
    public final void rule__Left__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1406:1: ( rule__Left__Group__2__Impl rule__Left__Group__3 )
            // InternalHelloWeb.g:1407:2: rule__Left__Group__2__Impl rule__Left__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Left__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Left__Group__3();

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
    // $ANTLR end "rule__Left__Group__2"


    // $ANTLR start "rule__Left__Group__2__Impl"
    // InternalHelloWeb.g:1414:1: rule__Left__Group__2__Impl : ( ( rule__Left__DistanceAssignment_2 ) ) ;
    public final void rule__Left__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1418:1: ( ( ( rule__Left__DistanceAssignment_2 ) ) )
            // InternalHelloWeb.g:1419:1: ( ( rule__Left__DistanceAssignment_2 ) )
            {
            // InternalHelloWeb.g:1419:1: ( ( rule__Left__DistanceAssignment_2 ) )
            // InternalHelloWeb.g:1420:2: ( rule__Left__DistanceAssignment_2 )
            {
             before(grammarAccess.getLeftAccess().getDistanceAssignment_2()); 
            // InternalHelloWeb.g:1421:2: ( rule__Left__DistanceAssignment_2 )
            // InternalHelloWeb.g:1421:3: rule__Left__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Left__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLeftAccess().getDistanceAssignment_2()); 

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
    // $ANTLR end "rule__Left__Group__2__Impl"


    // $ANTLR start "rule__Left__Group__3"
    // InternalHelloWeb.g:1429:1: rule__Left__Group__3 : rule__Left__Group__3__Impl ;
    public final void rule__Left__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1433:1: ( rule__Left__Group__3__Impl )
            // InternalHelloWeb.g:1434:2: rule__Left__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Left__Group__3__Impl();

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
    // $ANTLR end "rule__Left__Group__3"


    // $ANTLR start "rule__Left__Group__3__Impl"
    // InternalHelloWeb.g:1440:1: rule__Left__Group__3__Impl : ( ')' ) ;
    public final void rule__Left__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1444:1: ( ( ')' ) )
            // InternalHelloWeb.g:1445:1: ( ')' )
            {
            // InternalHelloWeb.g:1445:1: ( ')' )
            // InternalHelloWeb.g:1446:2: ')'
            {
             before(grammarAccess.getLeftAccess().getRightParenthesisKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLeftAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Left__Group__3__Impl"


    // $ANTLR start "rule__Right__Group__0"
    // InternalHelloWeb.g:1456:1: rule__Right__Group__0 : rule__Right__Group__0__Impl rule__Right__Group__1 ;
    public final void rule__Right__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1460:1: ( rule__Right__Group__0__Impl rule__Right__Group__1 )
            // InternalHelloWeb.g:1461:2: rule__Right__Group__0__Impl rule__Right__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalHelloWeb.g:1468:1: rule__Right__Group__0__Impl : ( 'RIGHT' ) ;
    public final void rule__Right__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1472:1: ( ( 'RIGHT' ) )
            // InternalHelloWeb.g:1473:1: ( 'RIGHT' )
            {
            // InternalHelloWeb.g:1473:1: ( 'RIGHT' )
            // InternalHelloWeb.g:1474:2: 'RIGHT'
            {
             before(grammarAccess.getRightAccess().getRIGHTKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRightAccess().getRIGHTKeyword_0()); 

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
    // InternalHelloWeb.g:1483:1: rule__Right__Group__1 : rule__Right__Group__1__Impl rule__Right__Group__2 ;
    public final void rule__Right__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1487:1: ( rule__Right__Group__1__Impl rule__Right__Group__2 )
            // InternalHelloWeb.g:1488:2: rule__Right__Group__1__Impl rule__Right__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Right__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Right__Group__2();

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
    // InternalHelloWeb.g:1495:1: rule__Right__Group__1__Impl : ( '(' ) ;
    public final void rule__Right__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1499:1: ( ( '(' ) )
            // InternalHelloWeb.g:1500:1: ( '(' )
            {
            // InternalHelloWeb.g:1500:1: ( '(' )
            // InternalHelloWeb.g:1501:2: '('
            {
             before(grammarAccess.getRightAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRightAccess().getLeftParenthesisKeyword_1()); 

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


    // $ANTLR start "rule__Right__Group__2"
    // InternalHelloWeb.g:1510:1: rule__Right__Group__2 : rule__Right__Group__2__Impl rule__Right__Group__3 ;
    public final void rule__Right__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1514:1: ( rule__Right__Group__2__Impl rule__Right__Group__3 )
            // InternalHelloWeb.g:1515:2: rule__Right__Group__2__Impl rule__Right__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Right__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Right__Group__3();

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
    // $ANTLR end "rule__Right__Group__2"


    // $ANTLR start "rule__Right__Group__2__Impl"
    // InternalHelloWeb.g:1522:1: rule__Right__Group__2__Impl : ( ( rule__Right__DistanceAssignment_2 ) ) ;
    public final void rule__Right__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1526:1: ( ( ( rule__Right__DistanceAssignment_2 ) ) )
            // InternalHelloWeb.g:1527:1: ( ( rule__Right__DistanceAssignment_2 ) )
            {
            // InternalHelloWeb.g:1527:1: ( ( rule__Right__DistanceAssignment_2 ) )
            // InternalHelloWeb.g:1528:2: ( rule__Right__DistanceAssignment_2 )
            {
             before(grammarAccess.getRightAccess().getDistanceAssignment_2()); 
            // InternalHelloWeb.g:1529:2: ( rule__Right__DistanceAssignment_2 )
            // InternalHelloWeb.g:1529:3: rule__Right__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Right__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getDistanceAssignment_2()); 

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
    // $ANTLR end "rule__Right__Group__2__Impl"


    // $ANTLR start "rule__Right__Group__3"
    // InternalHelloWeb.g:1537:1: rule__Right__Group__3 : rule__Right__Group__3__Impl ;
    public final void rule__Right__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1541:1: ( rule__Right__Group__3__Impl )
            // InternalHelloWeb.g:1542:2: rule__Right__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Right__Group__3__Impl();

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
    // $ANTLR end "rule__Right__Group__3"


    // $ANTLR start "rule__Right__Group__3__Impl"
    // InternalHelloWeb.g:1548:1: rule__Right__Group__3__Impl : ( ')' ) ;
    public final void rule__Right__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1552:1: ( ( ')' ) )
            // InternalHelloWeb.g:1553:1: ( ')' )
            {
            // InternalHelloWeb.g:1553:1: ( ')' )
            // InternalHelloWeb.g:1554:2: ')'
            {
             before(grammarAccess.getRightAccess().getRightParenthesisKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRightAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Right__Group__3__Impl"


    // $ANTLR start "rule__Forward__Group__0"
    // InternalHelloWeb.g:1564:1: rule__Forward__Group__0 : rule__Forward__Group__0__Impl rule__Forward__Group__1 ;
    public final void rule__Forward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1568:1: ( rule__Forward__Group__0__Impl rule__Forward__Group__1 )
            // InternalHelloWeb.g:1569:2: rule__Forward__Group__0__Impl rule__Forward__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Forward__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forward__Group__1();

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
    // $ANTLR end "rule__Forward__Group__0"


    // $ANTLR start "rule__Forward__Group__0__Impl"
    // InternalHelloWeb.g:1576:1: rule__Forward__Group__0__Impl : ( 'FORWARD' ) ;
    public final void rule__Forward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1580:1: ( ( 'FORWARD' ) )
            // InternalHelloWeb.g:1581:1: ( 'FORWARD' )
            {
            // InternalHelloWeb.g:1581:1: ( 'FORWARD' )
            // InternalHelloWeb.g:1582:2: 'FORWARD'
            {
             before(grammarAccess.getForwardAccess().getFORWARDKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getForwardAccess().getFORWARDKeyword_0()); 

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
    // $ANTLR end "rule__Forward__Group__0__Impl"


    // $ANTLR start "rule__Forward__Group__1"
    // InternalHelloWeb.g:1591:1: rule__Forward__Group__1 : rule__Forward__Group__1__Impl rule__Forward__Group__2 ;
    public final void rule__Forward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1595:1: ( rule__Forward__Group__1__Impl rule__Forward__Group__2 )
            // InternalHelloWeb.g:1596:2: rule__Forward__Group__1__Impl rule__Forward__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Forward__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forward__Group__2();

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
    // $ANTLR end "rule__Forward__Group__1"


    // $ANTLR start "rule__Forward__Group__1__Impl"
    // InternalHelloWeb.g:1603:1: rule__Forward__Group__1__Impl : ( '(' ) ;
    public final void rule__Forward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1607:1: ( ( '(' ) )
            // InternalHelloWeb.g:1608:1: ( '(' )
            {
            // InternalHelloWeb.g:1608:1: ( '(' )
            // InternalHelloWeb.g:1609:2: '('
            {
             before(grammarAccess.getForwardAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getForwardAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Forward__Group__1__Impl"


    // $ANTLR start "rule__Forward__Group__2"
    // InternalHelloWeb.g:1618:1: rule__Forward__Group__2 : rule__Forward__Group__2__Impl rule__Forward__Group__3 ;
    public final void rule__Forward__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1622:1: ( rule__Forward__Group__2__Impl rule__Forward__Group__3 )
            // InternalHelloWeb.g:1623:2: rule__Forward__Group__2__Impl rule__Forward__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Forward__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forward__Group__3();

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
    // $ANTLR end "rule__Forward__Group__2"


    // $ANTLR start "rule__Forward__Group__2__Impl"
    // InternalHelloWeb.g:1630:1: rule__Forward__Group__2__Impl : ( ( rule__Forward__DistanceAssignment_2 ) ) ;
    public final void rule__Forward__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1634:1: ( ( ( rule__Forward__DistanceAssignment_2 ) ) )
            // InternalHelloWeb.g:1635:1: ( ( rule__Forward__DistanceAssignment_2 ) )
            {
            // InternalHelloWeb.g:1635:1: ( ( rule__Forward__DistanceAssignment_2 ) )
            // InternalHelloWeb.g:1636:2: ( rule__Forward__DistanceAssignment_2 )
            {
             before(grammarAccess.getForwardAccess().getDistanceAssignment_2()); 
            // InternalHelloWeb.g:1637:2: ( rule__Forward__DistanceAssignment_2 )
            // InternalHelloWeb.g:1637:3: rule__Forward__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Forward__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForwardAccess().getDistanceAssignment_2()); 

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
    // $ANTLR end "rule__Forward__Group__2__Impl"


    // $ANTLR start "rule__Forward__Group__3"
    // InternalHelloWeb.g:1645:1: rule__Forward__Group__3 : rule__Forward__Group__3__Impl ;
    public final void rule__Forward__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1649:1: ( rule__Forward__Group__3__Impl )
            // InternalHelloWeb.g:1650:2: rule__Forward__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Forward__Group__3__Impl();

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
    // $ANTLR end "rule__Forward__Group__3"


    // $ANTLR start "rule__Forward__Group__3__Impl"
    // InternalHelloWeb.g:1656:1: rule__Forward__Group__3__Impl : ( ')' ) ;
    public final void rule__Forward__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1660:1: ( ( ')' ) )
            // InternalHelloWeb.g:1661:1: ( ')' )
            {
            // InternalHelloWeb.g:1661:1: ( ')' )
            // InternalHelloWeb.g:1662:2: ')'
            {
             before(grammarAccess.getForwardAccess().getRightParenthesisKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getForwardAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Forward__Group__3__Impl"


    // $ANTLR start "rule__Backward__Group__0"
    // InternalHelloWeb.g:1672:1: rule__Backward__Group__0 : rule__Backward__Group__0__Impl rule__Backward__Group__1 ;
    public final void rule__Backward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1676:1: ( rule__Backward__Group__0__Impl rule__Backward__Group__1 )
            // InternalHelloWeb.g:1677:2: rule__Backward__Group__0__Impl rule__Backward__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Backward__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Backward__Group__1();

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
    // $ANTLR end "rule__Backward__Group__0"


    // $ANTLR start "rule__Backward__Group__0__Impl"
    // InternalHelloWeb.g:1684:1: rule__Backward__Group__0__Impl : ( 'BACKWARD' ) ;
    public final void rule__Backward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1688:1: ( ( 'BACKWARD' ) )
            // InternalHelloWeb.g:1689:1: ( 'BACKWARD' )
            {
            // InternalHelloWeb.g:1689:1: ( 'BACKWARD' )
            // InternalHelloWeb.g:1690:2: 'BACKWARD'
            {
             before(grammarAccess.getBackwardAccess().getBACKWARDKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBackwardAccess().getBACKWARDKeyword_0()); 

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
    // $ANTLR end "rule__Backward__Group__0__Impl"


    // $ANTLR start "rule__Backward__Group__1"
    // InternalHelloWeb.g:1699:1: rule__Backward__Group__1 : rule__Backward__Group__1__Impl rule__Backward__Group__2 ;
    public final void rule__Backward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1703:1: ( rule__Backward__Group__1__Impl rule__Backward__Group__2 )
            // InternalHelloWeb.g:1704:2: rule__Backward__Group__1__Impl rule__Backward__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Backward__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Backward__Group__2();

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
    // $ANTLR end "rule__Backward__Group__1"


    // $ANTLR start "rule__Backward__Group__1__Impl"
    // InternalHelloWeb.g:1711:1: rule__Backward__Group__1__Impl : ( '(' ) ;
    public final void rule__Backward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1715:1: ( ( '(' ) )
            // InternalHelloWeb.g:1716:1: ( '(' )
            {
            // InternalHelloWeb.g:1716:1: ( '(' )
            // InternalHelloWeb.g:1717:2: '('
            {
             before(grammarAccess.getBackwardAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBackwardAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Backward__Group__1__Impl"


    // $ANTLR start "rule__Backward__Group__2"
    // InternalHelloWeb.g:1726:1: rule__Backward__Group__2 : rule__Backward__Group__2__Impl rule__Backward__Group__3 ;
    public final void rule__Backward__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1730:1: ( rule__Backward__Group__2__Impl rule__Backward__Group__3 )
            // InternalHelloWeb.g:1731:2: rule__Backward__Group__2__Impl rule__Backward__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Backward__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Backward__Group__3();

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
    // $ANTLR end "rule__Backward__Group__2"


    // $ANTLR start "rule__Backward__Group__2__Impl"
    // InternalHelloWeb.g:1738:1: rule__Backward__Group__2__Impl : ( ( rule__Backward__DistanceAssignment_2 ) ) ;
    public final void rule__Backward__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1742:1: ( ( ( rule__Backward__DistanceAssignment_2 ) ) )
            // InternalHelloWeb.g:1743:1: ( ( rule__Backward__DistanceAssignment_2 ) )
            {
            // InternalHelloWeb.g:1743:1: ( ( rule__Backward__DistanceAssignment_2 ) )
            // InternalHelloWeb.g:1744:2: ( rule__Backward__DistanceAssignment_2 )
            {
             before(grammarAccess.getBackwardAccess().getDistanceAssignment_2()); 
            // InternalHelloWeb.g:1745:2: ( rule__Backward__DistanceAssignment_2 )
            // InternalHelloWeb.g:1745:3: rule__Backward__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Backward__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBackwardAccess().getDistanceAssignment_2()); 

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
    // $ANTLR end "rule__Backward__Group__2__Impl"


    // $ANTLR start "rule__Backward__Group__3"
    // InternalHelloWeb.g:1753:1: rule__Backward__Group__3 : rule__Backward__Group__3__Impl ;
    public final void rule__Backward__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1757:1: ( rule__Backward__Group__3__Impl )
            // InternalHelloWeb.g:1758:2: rule__Backward__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Backward__Group__3__Impl();

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
    // $ANTLR end "rule__Backward__Group__3"


    // $ANTLR start "rule__Backward__Group__3__Impl"
    // InternalHelloWeb.g:1764:1: rule__Backward__Group__3__Impl : ( ')' ) ;
    public final void rule__Backward__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1768:1: ( ( ')' ) )
            // InternalHelloWeb.g:1769:1: ( ')' )
            {
            // InternalHelloWeb.g:1769:1: ( ')' )
            // InternalHelloWeb.g:1770:2: ')'
            {
             before(grammarAccess.getBackwardAccess().getRightParenthesisKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBackwardAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Backward__Group__3__Impl"


    // $ANTLR start "rule__RotateL__Group__0"
    // InternalHelloWeb.g:1780:1: rule__RotateL__Group__0 : rule__RotateL__Group__0__Impl rule__RotateL__Group__1 ;
    public final void rule__RotateL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1784:1: ( rule__RotateL__Group__0__Impl rule__RotateL__Group__1 )
            // InternalHelloWeb.g:1785:2: rule__RotateL__Group__0__Impl rule__RotateL__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__RotateL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateL__Group__1();

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
    // $ANTLR end "rule__RotateL__Group__0"


    // $ANTLR start "rule__RotateL__Group__0__Impl"
    // InternalHelloWeb.g:1792:1: rule__RotateL__Group__0__Impl : ( 'ROTATELEFT' ) ;
    public final void rule__RotateL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1796:1: ( ( 'ROTATELEFT' ) )
            // InternalHelloWeb.g:1797:1: ( 'ROTATELEFT' )
            {
            // InternalHelloWeb.g:1797:1: ( 'ROTATELEFT' )
            // InternalHelloWeb.g:1798:2: 'ROTATELEFT'
            {
             before(grammarAccess.getRotateLAccess().getROTATELEFTKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRotateLAccess().getROTATELEFTKeyword_0()); 

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
    // $ANTLR end "rule__RotateL__Group__0__Impl"


    // $ANTLR start "rule__RotateL__Group__1"
    // InternalHelloWeb.g:1807:1: rule__RotateL__Group__1 : rule__RotateL__Group__1__Impl rule__RotateL__Group__2 ;
    public final void rule__RotateL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1811:1: ( rule__RotateL__Group__1__Impl rule__RotateL__Group__2 )
            // InternalHelloWeb.g:1812:2: rule__RotateL__Group__1__Impl rule__RotateL__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__RotateL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateL__Group__2();

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
    // $ANTLR end "rule__RotateL__Group__1"


    // $ANTLR start "rule__RotateL__Group__1__Impl"
    // InternalHelloWeb.g:1819:1: rule__RotateL__Group__1__Impl : ( '(' ) ;
    public final void rule__RotateL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1823:1: ( ( '(' ) )
            // InternalHelloWeb.g:1824:1: ( '(' )
            {
            // InternalHelloWeb.g:1824:1: ( '(' )
            // InternalHelloWeb.g:1825:2: '('
            {
             before(grammarAccess.getRotateLAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRotateLAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__RotateL__Group__1__Impl"


    // $ANTLR start "rule__RotateL__Group__2"
    // InternalHelloWeb.g:1834:1: rule__RotateL__Group__2 : rule__RotateL__Group__2__Impl rule__RotateL__Group__3 ;
    public final void rule__RotateL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1838:1: ( rule__RotateL__Group__2__Impl rule__RotateL__Group__3 )
            // InternalHelloWeb.g:1839:2: rule__RotateL__Group__2__Impl rule__RotateL__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__RotateL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateL__Group__3();

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
    // $ANTLR end "rule__RotateL__Group__2"


    // $ANTLR start "rule__RotateL__Group__2__Impl"
    // InternalHelloWeb.g:1846:1: rule__RotateL__Group__2__Impl : ( ( rule__RotateL__AngleAssignment_2 ) ) ;
    public final void rule__RotateL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1850:1: ( ( ( rule__RotateL__AngleAssignment_2 ) ) )
            // InternalHelloWeb.g:1851:1: ( ( rule__RotateL__AngleAssignment_2 ) )
            {
            // InternalHelloWeb.g:1851:1: ( ( rule__RotateL__AngleAssignment_2 ) )
            // InternalHelloWeb.g:1852:2: ( rule__RotateL__AngleAssignment_2 )
            {
             before(grammarAccess.getRotateLAccess().getAngleAssignment_2()); 
            // InternalHelloWeb.g:1853:2: ( rule__RotateL__AngleAssignment_2 )
            // InternalHelloWeb.g:1853:3: rule__RotateL__AngleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RotateL__AngleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRotateLAccess().getAngleAssignment_2()); 

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
    // $ANTLR end "rule__RotateL__Group__2__Impl"


    // $ANTLR start "rule__RotateL__Group__3"
    // InternalHelloWeb.g:1861:1: rule__RotateL__Group__3 : rule__RotateL__Group__3__Impl ;
    public final void rule__RotateL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1865:1: ( rule__RotateL__Group__3__Impl )
            // InternalHelloWeb.g:1866:2: rule__RotateL__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RotateL__Group__3__Impl();

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
    // $ANTLR end "rule__RotateL__Group__3"


    // $ANTLR start "rule__RotateL__Group__3__Impl"
    // InternalHelloWeb.g:1872:1: rule__RotateL__Group__3__Impl : ( ')' ) ;
    public final void rule__RotateL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1876:1: ( ( ')' ) )
            // InternalHelloWeb.g:1877:1: ( ')' )
            {
            // InternalHelloWeb.g:1877:1: ( ')' )
            // InternalHelloWeb.g:1878:2: ')'
            {
             before(grammarAccess.getRotateLAccess().getRightParenthesisKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRotateLAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__RotateL__Group__3__Impl"


    // $ANTLR start "rule__RotateR__Group__0"
    // InternalHelloWeb.g:1888:1: rule__RotateR__Group__0 : rule__RotateR__Group__0__Impl rule__RotateR__Group__1 ;
    public final void rule__RotateR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1892:1: ( rule__RotateR__Group__0__Impl rule__RotateR__Group__1 )
            // InternalHelloWeb.g:1893:2: rule__RotateR__Group__0__Impl rule__RotateR__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__RotateR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateR__Group__1();

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
    // $ANTLR end "rule__RotateR__Group__0"


    // $ANTLR start "rule__RotateR__Group__0__Impl"
    // InternalHelloWeb.g:1900:1: rule__RotateR__Group__0__Impl : ( 'ROTATERIGHT' ) ;
    public final void rule__RotateR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1904:1: ( ( 'ROTATERIGHT' ) )
            // InternalHelloWeb.g:1905:1: ( 'ROTATERIGHT' )
            {
            // InternalHelloWeb.g:1905:1: ( 'ROTATERIGHT' )
            // InternalHelloWeb.g:1906:2: 'ROTATERIGHT'
            {
             before(grammarAccess.getRotateRAccess().getROTATERIGHTKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRotateRAccess().getROTATERIGHTKeyword_0()); 

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
    // $ANTLR end "rule__RotateR__Group__0__Impl"


    // $ANTLR start "rule__RotateR__Group__1"
    // InternalHelloWeb.g:1915:1: rule__RotateR__Group__1 : rule__RotateR__Group__1__Impl rule__RotateR__Group__2 ;
    public final void rule__RotateR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1919:1: ( rule__RotateR__Group__1__Impl rule__RotateR__Group__2 )
            // InternalHelloWeb.g:1920:2: rule__RotateR__Group__1__Impl rule__RotateR__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__RotateR__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateR__Group__2();

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
    // $ANTLR end "rule__RotateR__Group__1"


    // $ANTLR start "rule__RotateR__Group__1__Impl"
    // InternalHelloWeb.g:1927:1: rule__RotateR__Group__1__Impl : ( '(' ) ;
    public final void rule__RotateR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1931:1: ( ( '(' ) )
            // InternalHelloWeb.g:1932:1: ( '(' )
            {
            // InternalHelloWeb.g:1932:1: ( '(' )
            // InternalHelloWeb.g:1933:2: '('
            {
             before(grammarAccess.getRotateRAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRotateRAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__RotateR__Group__1__Impl"


    // $ANTLR start "rule__RotateR__Group__2"
    // InternalHelloWeb.g:1942:1: rule__RotateR__Group__2 : rule__RotateR__Group__2__Impl rule__RotateR__Group__3 ;
    public final void rule__RotateR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1946:1: ( rule__RotateR__Group__2__Impl rule__RotateR__Group__3 )
            // InternalHelloWeb.g:1947:2: rule__RotateR__Group__2__Impl rule__RotateR__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__RotateR__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateR__Group__3();

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
    // $ANTLR end "rule__RotateR__Group__2"


    // $ANTLR start "rule__RotateR__Group__2__Impl"
    // InternalHelloWeb.g:1954:1: rule__RotateR__Group__2__Impl : ( ( rule__RotateR__AngleAssignment_2 ) ) ;
    public final void rule__RotateR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1958:1: ( ( ( rule__RotateR__AngleAssignment_2 ) ) )
            // InternalHelloWeb.g:1959:1: ( ( rule__RotateR__AngleAssignment_2 ) )
            {
            // InternalHelloWeb.g:1959:1: ( ( rule__RotateR__AngleAssignment_2 ) )
            // InternalHelloWeb.g:1960:2: ( rule__RotateR__AngleAssignment_2 )
            {
             before(grammarAccess.getRotateRAccess().getAngleAssignment_2()); 
            // InternalHelloWeb.g:1961:2: ( rule__RotateR__AngleAssignment_2 )
            // InternalHelloWeb.g:1961:3: rule__RotateR__AngleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RotateR__AngleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRotateRAccess().getAngleAssignment_2()); 

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
    // $ANTLR end "rule__RotateR__Group__2__Impl"


    // $ANTLR start "rule__RotateR__Group__3"
    // InternalHelloWeb.g:1969:1: rule__RotateR__Group__3 : rule__RotateR__Group__3__Impl ;
    public final void rule__RotateR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1973:1: ( rule__RotateR__Group__3__Impl )
            // InternalHelloWeb.g:1974:2: rule__RotateR__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RotateR__Group__3__Impl();

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
    // $ANTLR end "rule__RotateR__Group__3"


    // $ANTLR start "rule__RotateR__Group__3__Impl"
    // InternalHelloWeb.g:1980:1: rule__RotateR__Group__3__Impl : ( ')' ) ;
    public final void rule__RotateR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:1984:1: ( ( ')' ) )
            // InternalHelloWeb.g:1985:1: ( ')' )
            {
            // InternalHelloWeb.g:1985:1: ( ')' )
            // InternalHelloWeb.g:1986:2: ')'
            {
             before(grammarAccess.getRotateRAccess().getRightParenthesisKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRotateRAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__RotateR__Group__3__Impl"


    // $ANTLR start "rule__Wait__Group__0"
    // InternalHelloWeb.g:1996:1: rule__Wait__Group__0 : rule__Wait__Group__0__Impl rule__Wait__Group__1 ;
    public final void rule__Wait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2000:1: ( rule__Wait__Group__0__Impl rule__Wait__Group__1 )
            // InternalHelloWeb.g:2001:2: rule__Wait__Group__0__Impl rule__Wait__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Wait__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wait__Group__1();

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
    // $ANTLR end "rule__Wait__Group__0"


    // $ANTLR start "rule__Wait__Group__0__Impl"
    // InternalHelloWeb.g:2008:1: rule__Wait__Group__0__Impl : ( 'WAIT' ) ;
    public final void rule__Wait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2012:1: ( ( 'WAIT' ) )
            // InternalHelloWeb.g:2013:1: ( 'WAIT' )
            {
            // InternalHelloWeb.g:2013:1: ( 'WAIT' )
            // InternalHelloWeb.g:2014:2: 'WAIT'
            {
             before(grammarAccess.getWaitAccess().getWAITKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWaitAccess().getWAITKeyword_0()); 

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
    // $ANTLR end "rule__Wait__Group__0__Impl"


    // $ANTLR start "rule__Wait__Group__1"
    // InternalHelloWeb.g:2023:1: rule__Wait__Group__1 : rule__Wait__Group__1__Impl rule__Wait__Group__2 ;
    public final void rule__Wait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2027:1: ( rule__Wait__Group__1__Impl rule__Wait__Group__2 )
            // InternalHelloWeb.g:2028:2: rule__Wait__Group__1__Impl rule__Wait__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Wait__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wait__Group__2();

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
    // $ANTLR end "rule__Wait__Group__1"


    // $ANTLR start "rule__Wait__Group__1__Impl"
    // InternalHelloWeb.g:2035:1: rule__Wait__Group__1__Impl : ( '(' ) ;
    public final void rule__Wait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2039:1: ( ( '(' ) )
            // InternalHelloWeb.g:2040:1: ( '(' )
            {
            // InternalHelloWeb.g:2040:1: ( '(' )
            // InternalHelloWeb.g:2041:2: '('
            {
             before(grammarAccess.getWaitAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWaitAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Wait__Group__1__Impl"


    // $ANTLR start "rule__Wait__Group__2"
    // InternalHelloWeb.g:2050:1: rule__Wait__Group__2 : rule__Wait__Group__2__Impl rule__Wait__Group__3 ;
    public final void rule__Wait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2054:1: ( rule__Wait__Group__2__Impl rule__Wait__Group__3 )
            // InternalHelloWeb.g:2055:2: rule__Wait__Group__2__Impl rule__Wait__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Wait__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wait__Group__3();

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
    // $ANTLR end "rule__Wait__Group__2"


    // $ANTLR start "rule__Wait__Group__2__Impl"
    // InternalHelloWeb.g:2062:1: rule__Wait__Group__2__Impl : ( ( rule__Wait__SecondsAssignment_2 ) ) ;
    public final void rule__Wait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2066:1: ( ( ( rule__Wait__SecondsAssignment_2 ) ) )
            // InternalHelloWeb.g:2067:1: ( ( rule__Wait__SecondsAssignment_2 ) )
            {
            // InternalHelloWeb.g:2067:1: ( ( rule__Wait__SecondsAssignment_2 ) )
            // InternalHelloWeb.g:2068:2: ( rule__Wait__SecondsAssignment_2 )
            {
             before(grammarAccess.getWaitAccess().getSecondsAssignment_2()); 
            // InternalHelloWeb.g:2069:2: ( rule__Wait__SecondsAssignment_2 )
            // InternalHelloWeb.g:2069:3: rule__Wait__SecondsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Wait__SecondsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWaitAccess().getSecondsAssignment_2()); 

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
    // $ANTLR end "rule__Wait__Group__2__Impl"


    // $ANTLR start "rule__Wait__Group__3"
    // InternalHelloWeb.g:2077:1: rule__Wait__Group__3 : rule__Wait__Group__3__Impl ;
    public final void rule__Wait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2081:1: ( rule__Wait__Group__3__Impl )
            // InternalHelloWeb.g:2082:2: rule__Wait__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wait__Group__3__Impl();

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
    // $ANTLR end "rule__Wait__Group__3"


    // $ANTLR start "rule__Wait__Group__3__Impl"
    // InternalHelloWeb.g:2088:1: rule__Wait__Group__3__Impl : ( ')' ) ;
    public final void rule__Wait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2092:1: ( ( ')' ) )
            // InternalHelloWeb.g:2093:1: ( ')' )
            {
            // InternalHelloWeb.g:2093:1: ( ')' )
            // InternalHelloWeb.g:2094:2: ')'
            {
             before(grammarAccess.getWaitAccess().getRightParenthesisKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWaitAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Wait__Group__3__Impl"


    // $ANTLR start "rule__FunctionName__Group__0"
    // InternalHelloWeb.g:2104:1: rule__FunctionName__Group__0 : rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1 ;
    public final void rule__FunctionName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2108:1: ( rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1 )
            // InternalHelloWeb.g:2109:2: rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__FunctionName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionName__Group__1();

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
    // $ANTLR end "rule__FunctionName__Group__0"


    // $ANTLR start "rule__FunctionName__Group__0__Impl"
    // InternalHelloWeb.g:2116:1: rule__FunctionName__Group__0__Impl : ( ( rule__FunctionName__Func_nameAssignment_0 ) ) ;
    public final void rule__FunctionName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2120:1: ( ( ( rule__FunctionName__Func_nameAssignment_0 ) ) )
            // InternalHelloWeb.g:2121:1: ( ( rule__FunctionName__Func_nameAssignment_0 ) )
            {
            // InternalHelloWeb.g:2121:1: ( ( rule__FunctionName__Func_nameAssignment_0 ) )
            // InternalHelloWeb.g:2122:2: ( rule__FunctionName__Func_nameAssignment_0 )
            {
             before(grammarAccess.getFunctionNameAccess().getFunc_nameAssignment_0()); 
            // InternalHelloWeb.g:2123:2: ( rule__FunctionName__Func_nameAssignment_0 )
            // InternalHelloWeb.g:2123:3: rule__FunctionName__Func_nameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionName__Func_nameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionNameAccess().getFunc_nameAssignment_0()); 

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
    // $ANTLR end "rule__FunctionName__Group__0__Impl"


    // $ANTLR start "rule__FunctionName__Group__1"
    // InternalHelloWeb.g:2131:1: rule__FunctionName__Group__1 : rule__FunctionName__Group__1__Impl ;
    public final void rule__FunctionName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2135:1: ( rule__FunctionName__Group__1__Impl )
            // InternalHelloWeb.g:2136:2: rule__FunctionName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionName__Group__1__Impl();

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
    // $ANTLR end "rule__FunctionName__Group__1"


    // $ANTLR start "rule__FunctionName__Group__1__Impl"
    // InternalHelloWeb.g:2142:1: rule__FunctionName__Group__1__Impl : ( '()' ) ;
    public final void rule__FunctionName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2146:1: ( ( '()' ) )
            // InternalHelloWeb.g:2147:1: ( '()' )
            {
            // InternalHelloWeb.g:2147:1: ( '()' )
            // InternalHelloWeb.g:2148:2: '()'
            {
             before(grammarAccess.getFunctionNameAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFunctionNameAccess().getLeftParenthesisRightParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__FunctionName__Group__1__Impl"


    // $ANTLR start "rule__Program__MainAssignment"
    // InternalHelloWeb.g:2158:1: rule__Program__MainAssignment : ( ruleMain ) ;
    public final void rule__Program__MainAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2162:1: ( ( ruleMain ) )
            // InternalHelloWeb.g:2163:2: ( ruleMain )
            {
            // InternalHelloWeb.g:2163:2: ( ruleMain )
            // InternalHelloWeb.g:2164:3: ruleMain
            {
             before(grammarAccess.getProgramAccess().getMainMainParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getMainMainParserRuleCall_0()); 

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
    // $ANTLR end "rule__Program__MainAssignment"


    // $ANTLR start "rule__Main__CommandsAssignment_0_0"
    // InternalHelloWeb.g:2173:1: rule__Main__CommandsAssignment_0_0 : ( ruleSnapshot ) ;
    public final void rule__Main__CommandsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2177:1: ( ( ruleSnapshot ) )
            // InternalHelloWeb.g:2178:2: ( ruleSnapshot )
            {
            // InternalHelloWeb.g:2178:2: ( ruleSnapshot )
            // InternalHelloWeb.g:2179:3: ruleSnapshot
            {
             before(grammarAccess.getMainAccess().getCommandsSnapshotParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSnapshot();

            state._fsp--;

             after(grammarAccess.getMainAccess().getCommandsSnapshotParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Main__CommandsAssignment_0_0"


    // $ANTLR start "rule__Main__TakeoffAssignment_1_0_0"
    // InternalHelloWeb.g:2188:1: rule__Main__TakeoffAssignment_1_0_0 : ( ruleTakeoff ) ;
    public final void rule__Main__TakeoffAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2192:1: ( ( ruleTakeoff ) )
            // InternalHelloWeb.g:2193:2: ( ruleTakeoff )
            {
            // InternalHelloWeb.g:2193:2: ( ruleTakeoff )
            // InternalHelloWeb.g:2194:3: ruleTakeoff
            {
             before(grammarAccess.getMainAccess().getTakeoffTakeoffParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTakeoff();

            state._fsp--;

             after(grammarAccess.getMainAccess().getTakeoffTakeoffParserRuleCall_1_0_0_0()); 

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
    // $ANTLR end "rule__Main__TakeoffAssignment_1_0_0"


    // $ANTLR start "rule__Main__CommandsAssignment_1_1_0"
    // InternalHelloWeb.g:2203:1: rule__Main__CommandsAssignment_1_1_0 : ( ruleSuperCommand ) ;
    public final void rule__Main__CommandsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2207:1: ( ( ruleSuperCommand ) )
            // InternalHelloWeb.g:2208:2: ( ruleSuperCommand )
            {
            // InternalHelloWeb.g:2208:2: ( ruleSuperCommand )
            // InternalHelloWeb.g:2209:3: ruleSuperCommand
            {
             before(grammarAccess.getMainAccess().getCommandsSuperCommandParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSuperCommand();

            state._fsp--;

             after(grammarAccess.getMainAccess().getCommandsSuperCommandParserRuleCall_1_1_0_0()); 

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
    // $ANTLR end "rule__Main__CommandsAssignment_1_1_0"


    // $ANTLR start "rule__Main__LandAssignment_1_2_0"
    // InternalHelloWeb.g:2218:1: rule__Main__LandAssignment_1_2_0 : ( ruleLand ) ;
    public final void rule__Main__LandAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2222:1: ( ( ruleLand ) )
            // InternalHelloWeb.g:2223:2: ( ruleLand )
            {
            // InternalHelloWeb.g:2223:2: ( ruleLand )
            // InternalHelloWeb.g:2224:3: ruleLand
            {
             before(grammarAccess.getMainAccess().getLandLandParserRuleCall_1_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLand();

            state._fsp--;

             after(grammarAccess.getMainAccess().getLandLandParserRuleCall_1_2_0_0()); 

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
    // $ANTLR end "rule__Main__LandAssignment_1_2_0"


    // $ANTLR start "rule__Snapshot__Image_nameAssignment_2"
    // InternalHelloWeb.g:2233:1: rule__Snapshot__Image_nameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Snapshot__Image_nameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2237:1: ( ( RULE_ID ) )
            // InternalHelloWeb.g:2238:2: ( RULE_ID )
            {
            // InternalHelloWeb.g:2238:2: ( RULE_ID )
            // InternalHelloWeb.g:2239:3: RULE_ID
            {
             before(grammarAccess.getSnapshotAccess().getImage_nameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSnapshotAccess().getImage_nameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Snapshot__Image_nameAssignment_2"


    // $ANTLR start "rule__Up__DistanceAssignment_2"
    // InternalHelloWeb.g:2248:1: rule__Up__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Up__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2252:1: ( ( ruleDOUBLE ) )
            // InternalHelloWeb.g:2253:2: ( ruleDOUBLE )
            {
            // InternalHelloWeb.g:2253:2: ( ruleDOUBLE )
            // InternalHelloWeb.g:2254:3: ruleDOUBLE
            {
             before(grammarAccess.getUpAccess().getDistanceDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getUpAccess().getDistanceDOUBLEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Up__DistanceAssignment_2"


    // $ANTLR start "rule__Down__DistanceAssignment_2"
    // InternalHelloWeb.g:2263:1: rule__Down__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Down__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2267:1: ( ( ruleDOUBLE ) )
            // InternalHelloWeb.g:2268:2: ( ruleDOUBLE )
            {
            // InternalHelloWeb.g:2268:2: ( ruleDOUBLE )
            // InternalHelloWeb.g:2269:3: ruleDOUBLE
            {
             before(grammarAccess.getDownAccess().getDistanceDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDownAccess().getDistanceDOUBLEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Down__DistanceAssignment_2"


    // $ANTLR start "rule__Left__DistanceAssignment_2"
    // InternalHelloWeb.g:2278:1: rule__Left__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Left__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2282:1: ( ( ruleDOUBLE ) )
            // InternalHelloWeb.g:2283:2: ( ruleDOUBLE )
            {
            // InternalHelloWeb.g:2283:2: ( ruleDOUBLE )
            // InternalHelloWeb.g:2284:3: ruleDOUBLE
            {
             before(grammarAccess.getLeftAccess().getDistanceDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getLeftAccess().getDistanceDOUBLEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Left__DistanceAssignment_2"


    // $ANTLR start "rule__Right__DistanceAssignment_2"
    // InternalHelloWeb.g:2293:1: rule__Right__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Right__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2297:1: ( ( ruleDOUBLE ) )
            // InternalHelloWeb.g:2298:2: ( ruleDOUBLE )
            {
            // InternalHelloWeb.g:2298:2: ( ruleDOUBLE )
            // InternalHelloWeb.g:2299:3: ruleDOUBLE
            {
             before(grammarAccess.getRightAccess().getDistanceDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getRightAccess().getDistanceDOUBLEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Right__DistanceAssignment_2"


    // $ANTLR start "rule__Forward__DistanceAssignment_2"
    // InternalHelloWeb.g:2308:1: rule__Forward__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Forward__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2312:1: ( ( ruleDOUBLE ) )
            // InternalHelloWeb.g:2313:2: ( ruleDOUBLE )
            {
            // InternalHelloWeb.g:2313:2: ( ruleDOUBLE )
            // InternalHelloWeb.g:2314:3: ruleDOUBLE
            {
             before(grammarAccess.getForwardAccess().getDistanceDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getForwardAccess().getDistanceDOUBLEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Forward__DistanceAssignment_2"


    // $ANTLR start "rule__Backward__DistanceAssignment_2"
    // InternalHelloWeb.g:2323:1: rule__Backward__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Backward__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2327:1: ( ( ruleDOUBLE ) )
            // InternalHelloWeb.g:2328:2: ( ruleDOUBLE )
            {
            // InternalHelloWeb.g:2328:2: ( ruleDOUBLE )
            // InternalHelloWeb.g:2329:3: ruleDOUBLE
            {
             before(grammarAccess.getBackwardAccess().getDistanceDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getBackwardAccess().getDistanceDOUBLEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Backward__DistanceAssignment_2"


    // $ANTLR start "rule__RotateL__AngleAssignment_2"
    // InternalHelloWeb.g:2338:1: rule__RotateL__AngleAssignment_2 : ( RULE_INT ) ;
    public final void rule__RotateL__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2342:1: ( ( RULE_INT ) )
            // InternalHelloWeb.g:2343:2: ( RULE_INT )
            {
            // InternalHelloWeb.g:2343:2: ( RULE_INT )
            // InternalHelloWeb.g:2344:3: RULE_INT
            {
             before(grammarAccess.getRotateLAccess().getAngleINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRotateLAccess().getAngleINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__RotateL__AngleAssignment_2"


    // $ANTLR start "rule__RotateR__AngleAssignment_2"
    // InternalHelloWeb.g:2353:1: rule__RotateR__AngleAssignment_2 : ( RULE_INT ) ;
    public final void rule__RotateR__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2357:1: ( ( RULE_INT ) )
            // InternalHelloWeb.g:2358:2: ( RULE_INT )
            {
            // InternalHelloWeb.g:2358:2: ( RULE_INT )
            // InternalHelloWeb.g:2359:3: RULE_INT
            {
             before(grammarAccess.getRotateRAccess().getAngleINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRotateRAccess().getAngleINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__RotateR__AngleAssignment_2"


    // $ANTLR start "rule__Wait__SecondsAssignment_2"
    // InternalHelloWeb.g:2368:1: rule__Wait__SecondsAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Wait__SecondsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2372:1: ( ( ruleDOUBLE ) )
            // InternalHelloWeb.g:2373:2: ( ruleDOUBLE )
            {
            // InternalHelloWeb.g:2373:2: ( ruleDOUBLE )
            // InternalHelloWeb.g:2374:3: ruleDOUBLE
            {
             before(grammarAccess.getWaitAccess().getSecondsDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getWaitAccess().getSecondsDOUBLEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Wait__SecondsAssignment_2"


    // $ANTLR start "rule__FunctionName__Func_nameAssignment_0"
    // InternalHelloWeb.g:2383:1: rule__FunctionName__Func_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionName__Func_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHelloWeb.g:2387:1: ( ( RULE_ID ) )
            // InternalHelloWeb.g:2388:2: ( RULE_ID )
            {
            // InternalHelloWeb.g:2388:2: ( RULE_ID )
            // InternalHelloWeb.g:2389:3: RULE_ID
            {
             before(grammarAccess.getFunctionNameAccess().getFunc_nameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionNameAccess().getFunc_nameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__FunctionName__Func_nameAssignment_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000007FC9020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000007FC8022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});

}