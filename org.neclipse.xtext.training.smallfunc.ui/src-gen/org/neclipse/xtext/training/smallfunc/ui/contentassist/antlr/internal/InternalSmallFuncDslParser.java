package org.neclipse.xtext.training.smallfunc.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.neclipse.xtext.training.smallfunc.services.SmallFuncDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallFuncDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'boolean'", "'int'", "'long'", "'double'", "'namespace'", "'import'", "'.'", "'.*'", "'def'", "'('", "')'", "'{'", "'}'", "','"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSmallFuncDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallFuncDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallFuncDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g"; }


     
     	private SmallFuncDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SmallFuncDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleNamespace"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:60:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:61:1: ( ruleNamespace EOF )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:62:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace61);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace68); 

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
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:69:1: ruleNamespace : ( ( rule__Namespace__Group__0 ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:73:2: ( ( ( rule__Namespace__Group__0 ) ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:74:1: ( ( rule__Namespace__Group__0 ) )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:74:1: ( ( rule__Namespace__Group__0 ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:75:1: ( rule__Namespace__Group__0 )
            {
             before(grammarAccess.getNamespaceAccess().getGroup()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:76:1: ( rule__Namespace__Group__0 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:76:2: rule__Namespace__Group__0
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0_in_ruleNamespace94);
            rule__Namespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getGroup()); 

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
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleImport"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:89:1: ( ruleImport EOF )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:90:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport121);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport128); 

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
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:102:1: ( ( rule__Import__Group__0 ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:104:1: ( rule__Import__Group__0 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:104:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport154);
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


    // $ANTLR start "entryRuleQName"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:116:1: entryRuleQName : ruleQName EOF ;
    public final void entryRuleQName() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:117:1: ( ruleQName EOF )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:118:1: ruleQName EOF
            {
             before(grammarAccess.getQNameRule()); 
            pushFollow(FOLLOW_ruleQName_in_entryRuleQName181);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getQNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQName188); 

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
    // $ANTLR end "entryRuleQName"


    // $ANTLR start "ruleQName"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:125:1: ruleQName : ( ( rule__QName__Group__0 ) ) ;
    public final void ruleQName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:129:2: ( ( ( rule__QName__Group__0 ) ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:130:1: ( ( rule__QName__Group__0 ) )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:130:1: ( ( rule__QName__Group__0 ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:131:1: ( rule__QName__Group__0 )
            {
             before(grammarAccess.getQNameAccess().getGroup()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:132:1: ( rule__QName__Group__0 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:132:2: rule__QName__Group__0
            {
            pushFollow(FOLLOW_rule__QName__Group__0_in_ruleQName214);
            rule__QName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQName"


    // $ANTLR start "entryRuleQNameWithWildcard"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:144:1: entryRuleQNameWithWildcard : ruleQNameWithWildcard EOF ;
    public final void entryRuleQNameWithWildcard() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:145:1: ( ruleQNameWithWildcard EOF )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:146:1: ruleQNameWithWildcard EOF
            {
             before(grammarAccess.getQNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQNameWithWildcard_in_entryRuleQNameWithWildcard241);
            ruleQNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQNameWithWildcard248); 

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
    // $ANTLR end "entryRuleQNameWithWildcard"


    // $ANTLR start "ruleQNameWithWildcard"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:153:1: ruleQNameWithWildcard : ( ( rule__QNameWithWildcard__Group__0 ) ) ;
    public final void ruleQNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:157:2: ( ( ( rule__QNameWithWildcard__Group__0 ) ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:158:1: ( ( rule__QNameWithWildcard__Group__0 ) )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:158:1: ( ( rule__QNameWithWildcard__Group__0 ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:159:1: ( rule__QNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQNameWithWildcardAccess().getGroup()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:160:1: ( rule__QNameWithWildcard__Group__0 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:160:2: rule__QNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QNameWithWildcard__Group__0_in_ruleQNameWithWildcard274);
            rule__QNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQNameWithWildcardAccess().getGroup()); 

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
    // $ANTLR end "ruleQNameWithWildcard"


    // $ANTLR start "entryRuleSmallFunction"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:172:1: entryRuleSmallFunction : ruleSmallFunction EOF ;
    public final void entryRuleSmallFunction() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:173:1: ( ruleSmallFunction EOF )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:174:1: ruleSmallFunction EOF
            {
             before(grammarAccess.getSmallFunctionRule()); 
            pushFollow(FOLLOW_ruleSmallFunction_in_entryRuleSmallFunction301);
            ruleSmallFunction();

            state._fsp--;

             after(grammarAccess.getSmallFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallFunction308); 

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
    // $ANTLR end "entryRuleSmallFunction"


    // $ANTLR start "ruleSmallFunction"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:181:1: ruleSmallFunction : ( ( rule__SmallFunction__Group__0 ) ) ;
    public final void ruleSmallFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:185:2: ( ( ( rule__SmallFunction__Group__0 ) ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:186:1: ( ( rule__SmallFunction__Group__0 ) )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:186:1: ( ( rule__SmallFunction__Group__0 ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:187:1: ( rule__SmallFunction__Group__0 )
            {
             before(grammarAccess.getSmallFunctionAccess().getGroup()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:188:1: ( rule__SmallFunction__Group__0 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:188:2: rule__SmallFunction__Group__0
            {
            pushFollow(FOLLOW_rule__SmallFunction__Group__0_in_ruleSmallFunction334);
            rule__SmallFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmallFunctionAccess().getGroup()); 

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
    // $ANTLR end "ruleSmallFunction"


    // $ANTLR start "entryRuleParam"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:200:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:201:1: ( ruleParam EOF )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:202:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam361);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam368); 

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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:209:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:213:2: ( ( ( rule__Param__Group__0 ) ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:214:1: ( ( rule__Param__Group__0 ) )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:214:1: ( ( rule__Param__Group__0 ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:215:1: ( rule__Param__Group__0 )
            {
             before(grammarAccess.getParamAccess().getGroup()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:216:1: ( rule__Param__Group__0 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:216:2: rule__Param__Group__0
            {
            pushFollow(FOLLOW_rule__Param__Group__0_in_ruleParam394);
            rule__Param__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getGroup()); 

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleDataType"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:228:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:229:1: ( ruleDataType EOF )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:230:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType421);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType428); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:237:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:241:2: ( ( ( rule__DataType__Alternatives ) ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:242:1: ( ( rule__DataType__Alternatives ) )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:242:1: ( ( rule__DataType__Alternatives ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:243:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:244:1: ( rule__DataType__Alternatives )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:244:2: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_rule__DataType__Alternatives_in_ruleDataType454);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleBasicType"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:256:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:257:1: ( ruleBasicType EOF )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:258:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType481);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType488); 

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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:265:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:269:2: ( ( ( rule__BasicType__Alternatives ) ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:270:1: ( ( rule__BasicType__Alternatives ) )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:270:1: ( ( rule__BasicType__Alternatives ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:271:1: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:272:1: ( rule__BasicType__Alternatives )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:272:2: rule__BasicType__Alternatives
            {
            pushFollow(FOLLOW_rule__BasicType__Alternatives_in_ruleBasicType514);
            rule__BasicType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleClassType"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:284:1: entryRuleClassType : ruleClassType EOF ;
    public final void entryRuleClassType() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:285:1: ( ruleClassType EOF )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:286:1: ruleClassType EOF
            {
             before(grammarAccess.getClassTypeRule()); 
            pushFollow(FOLLOW_ruleClassType_in_entryRuleClassType541);
            ruleClassType();

            state._fsp--;

             after(grammarAccess.getClassTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassType548); 

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
    // $ANTLR end "entryRuleClassType"


    // $ANTLR start "ruleClassType"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:293:1: ruleClassType : ( ( rule__ClassType__TypeAssignment ) ) ;
    public final void ruleClassType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:297:2: ( ( ( rule__ClassType__TypeAssignment ) ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:298:1: ( ( rule__ClassType__TypeAssignment ) )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:298:1: ( ( rule__ClassType__TypeAssignment ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:299:1: ( rule__ClassType__TypeAssignment )
            {
             before(grammarAccess.getClassTypeAccess().getTypeAssignment()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:300:1: ( rule__ClassType__TypeAssignment )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:300:2: rule__ClassType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__ClassType__TypeAssignment_in_ruleClassType574);
            rule__ClassType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getClassTypeAccess().getTypeAssignment()); 

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
    // $ANTLR end "ruleClassType"


    // $ANTLR start "rule__DataType__Alternatives"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:312:1: rule__DataType__Alternatives : ( ( ( rule__DataType__Group_0__0 ) ) | ( ruleClassType ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:316:1: ( ( ( rule__DataType__Group_0__0 ) ) | ( ruleClassType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=15)) ) {
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
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:317:1: ( ( rule__DataType__Group_0__0 ) )
                    {
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:317:1: ( ( rule__DataType__Group_0__0 ) )
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:318:1: ( rule__DataType__Group_0__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_0()); 
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:319:1: ( rule__DataType__Group_0__0 )
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:319:2: rule__DataType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__DataType__Group_0__0_in_rule__DataType__Alternatives610);
                    rule__DataType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:323:6: ( ruleClassType )
                    {
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:323:6: ( ruleClassType )
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:324:1: ruleClassType
                    {
                     before(grammarAccess.getDataTypeAccess().getClassTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleClassType_in_rule__DataType__Alternatives628);
                    ruleClassType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getClassTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__BasicType__Alternatives"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:334:1: rule__BasicType__Alternatives : ( ( 'String' ) | ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'double' ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:338:1: ( ( 'String' ) | ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'double' ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:339:1: ( 'String' )
                    {
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:339:1: ( 'String' )
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:340:1: 'String'
                    {
                     before(grammarAccess.getBasicTypeAccess().getStringKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__BasicType__Alternatives661); 
                     after(grammarAccess.getBasicTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:347:6: ( 'boolean' )
                    {
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:347:6: ( 'boolean' )
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:348:1: 'boolean'
                    {
                     before(grammarAccess.getBasicTypeAccess().getBooleanKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__BasicType__Alternatives681); 
                     after(grammarAccess.getBasicTypeAccess().getBooleanKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:355:6: ( 'int' )
                    {
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:355:6: ( 'int' )
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:356:1: 'int'
                    {
                     before(grammarAccess.getBasicTypeAccess().getIntKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__BasicType__Alternatives701); 
                     after(grammarAccess.getBasicTypeAccess().getIntKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:363:6: ( 'long' )
                    {
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:363:6: ( 'long' )
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:364:1: 'long'
                    {
                     before(grammarAccess.getBasicTypeAccess().getLongKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__BasicType__Alternatives721); 
                     after(grammarAccess.getBasicTypeAccess().getLongKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:371:6: ( 'double' )
                    {
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:371:6: ( 'double' )
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:372:1: 'double'
                    {
                     before(grammarAccess.getBasicTypeAccess().getDoubleKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__BasicType__Alternatives741); 
                     after(grammarAccess.getBasicTypeAccess().getDoubleKeyword_4()); 

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
    // $ANTLR end "rule__BasicType__Alternatives"


    // $ANTLR start "rule__Namespace__Group__0"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:386:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:390:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:391:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__0773);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__0776);
            rule__Namespace__Group__1();

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
    // $ANTLR end "rule__Namespace__Group__0"


    // $ANTLR start "rule__Namespace__Group__0__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:398:1: rule__Namespace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:402:1: ( ( 'namespace' ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:403:1: ( 'namespace' )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:403:1: ( 'namespace' )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:404:1: 'namespace'
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Namespace__Group__0__Impl804); 
             after(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 

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
    // $ANTLR end "rule__Namespace__Group__0__Impl"


    // $ANTLR start "rule__Namespace__Group__1"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:417:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl rule__Namespace__Group__2 ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:421:1: ( rule__Namespace__Group__1__Impl rule__Namespace__Group__2 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:422:2: rule__Namespace__Group__1__Impl rule__Namespace__Group__2
            {
            pushFollow(FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__1835);
            rule__Namespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__2_in_rule__Namespace__Group__1838);
            rule__Namespace__Group__2();

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
    // $ANTLR end "rule__Namespace__Group__1"


    // $ANTLR start "rule__Namespace__Group__1__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:429:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__NameAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:433:1: ( ( ( rule__Namespace__NameAssignment_1 ) ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:434:1: ( ( rule__Namespace__NameAssignment_1 ) )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:434:1: ( ( rule__Namespace__NameAssignment_1 ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:435:1: ( rule__Namespace__NameAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getNameAssignment_1()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:436:1: ( rule__Namespace__NameAssignment_1 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:436:2: rule__Namespace__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Namespace__NameAssignment_1_in_rule__Namespace__Group__1__Impl865);
            rule__Namespace__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Namespace__Group__1__Impl"


    // $ANTLR start "rule__Namespace__Group__2"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:446:1: rule__Namespace__Group__2 : rule__Namespace__Group__2__Impl rule__Namespace__Group__3 ;
    public final void rule__Namespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:450:1: ( rule__Namespace__Group__2__Impl rule__Namespace__Group__3 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:451:2: rule__Namespace__Group__2__Impl rule__Namespace__Group__3
            {
            pushFollow(FOLLOW_rule__Namespace__Group__2__Impl_in_rule__Namespace__Group__2895);
            rule__Namespace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__3_in_rule__Namespace__Group__2898);
            rule__Namespace__Group__3();

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
    // $ANTLR end "rule__Namespace__Group__2"


    // $ANTLR start "rule__Namespace__Group__2__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:458:1: rule__Namespace__Group__2__Impl : ( ( rule__Namespace__ImportsAssignment_2 )* ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:462:1: ( ( ( rule__Namespace__ImportsAssignment_2 )* ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:463:1: ( ( rule__Namespace__ImportsAssignment_2 )* )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:463:1: ( ( rule__Namespace__ImportsAssignment_2 )* )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:464:1: ( rule__Namespace__ImportsAssignment_2 )*
            {
             before(grammarAccess.getNamespaceAccess().getImportsAssignment_2()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:465:1: ( rule__Namespace__ImportsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:465:2: rule__Namespace__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Namespace__ImportsAssignment_2_in_rule__Namespace__Group__2__Impl925);
            	    rule__Namespace__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getNamespaceAccess().getImportsAssignment_2()); 

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
    // $ANTLR end "rule__Namespace__Group__2__Impl"


    // $ANTLR start "rule__Namespace__Group__3"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:475:1: rule__Namespace__Group__3 : rule__Namespace__Group__3__Impl ;
    public final void rule__Namespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:479:1: ( rule__Namespace__Group__3__Impl )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:480:2: rule__Namespace__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group__3__Impl_in_rule__Namespace__Group__3956);
            rule__Namespace__Group__3__Impl();

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
    // $ANTLR end "rule__Namespace__Group__3"


    // $ANTLR start "rule__Namespace__Group__3__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:486:1: rule__Namespace__Group__3__Impl : ( ( rule__Namespace__FunctionAssignment_3 ) ) ;
    public final void rule__Namespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:490:1: ( ( ( rule__Namespace__FunctionAssignment_3 ) ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:491:1: ( ( rule__Namespace__FunctionAssignment_3 ) )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:491:1: ( ( rule__Namespace__FunctionAssignment_3 ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:492:1: ( rule__Namespace__FunctionAssignment_3 )
            {
             before(grammarAccess.getNamespaceAccess().getFunctionAssignment_3()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:493:1: ( rule__Namespace__FunctionAssignment_3 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:493:2: rule__Namespace__FunctionAssignment_3
            {
            pushFollow(FOLLOW_rule__Namespace__FunctionAssignment_3_in_rule__Namespace__Group__3__Impl983);
            rule__Namespace__FunctionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getFunctionAssignment_3()); 

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
    // $ANTLR end "rule__Namespace__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:511:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:515:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:516:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01021);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01024);
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
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:523:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:527:1: ( ( 'import' ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:528:1: ( 'import' )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:528:1: ( 'import' )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:529:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Import__Group__0__Impl1052); 
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
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:542:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:546:1: ( rule__Import__Group__1__Impl )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:547:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11083);
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
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:553:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:557:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:558:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:558:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:559:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:560:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:560:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1110);
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


    // $ANTLR start "rule__QName__Group__0"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:574:1: rule__QName__Group__0 : rule__QName__Group__0__Impl rule__QName__Group__1 ;
    public final void rule__QName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:578:1: ( rule__QName__Group__0__Impl rule__QName__Group__1 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:579:2: rule__QName__Group__0__Impl rule__QName__Group__1
            {
            pushFollow(FOLLOW_rule__QName__Group__0__Impl_in_rule__QName__Group__01144);
            rule__QName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QName__Group__1_in_rule__QName__Group__01147);
            rule__QName__Group__1();

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
    // $ANTLR end "rule__QName__Group__0"


    // $ANTLR start "rule__QName__Group__0__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:586:1: rule__QName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:590:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:591:1: ( RULE_ID )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:591:1: ( RULE_ID )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:592:1: RULE_ID
            {
             before(grammarAccess.getQNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QName__Group__0__Impl1174); 
             after(grammarAccess.getQNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QName__Group__0__Impl"


    // $ANTLR start "rule__QName__Group__1"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:603:1: rule__QName__Group__1 : rule__QName__Group__1__Impl ;
    public final void rule__QName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:607:1: ( rule__QName__Group__1__Impl )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:608:2: rule__QName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QName__Group__1__Impl_in_rule__QName__Group__11203);
            rule__QName__Group__1__Impl();

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
    // $ANTLR end "rule__QName__Group__1"


    // $ANTLR start "rule__QName__Group__1__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:614:1: rule__QName__Group__1__Impl : ( ( rule__QName__Group_1__0 )* ) ;
    public final void rule__QName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:618:1: ( ( ( rule__QName__Group_1__0 )* ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:619:1: ( ( rule__QName__Group_1__0 )* )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:619:1: ( ( rule__QName__Group_1__0 )* )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:620:1: ( rule__QName__Group_1__0 )*
            {
             before(grammarAccess.getQNameAccess().getGroup_1()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:621:1: ( rule__QName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:621:2: rule__QName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QName__Group_1__0_in_rule__QName__Group__1__Impl1230);
            	    rule__QName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getQNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QName__Group__1__Impl"


    // $ANTLR start "rule__QName__Group_1__0"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:635:1: rule__QName__Group_1__0 : rule__QName__Group_1__0__Impl rule__QName__Group_1__1 ;
    public final void rule__QName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:639:1: ( rule__QName__Group_1__0__Impl rule__QName__Group_1__1 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:640:2: rule__QName__Group_1__0__Impl rule__QName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QName__Group_1__0__Impl_in_rule__QName__Group_1__01265);
            rule__QName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QName__Group_1__1_in_rule__QName__Group_1__01268);
            rule__QName__Group_1__1();

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
    // $ANTLR end "rule__QName__Group_1__0"


    // $ANTLR start "rule__QName__Group_1__0__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:647:1: rule__QName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:651:1: ( ( '.' ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:652:1: ( '.' )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:652:1: ( '.' )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:653:1: '.'
            {
             before(grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__QName__Group_1__0__Impl1296); 
             after(grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QName__Group_1__0__Impl"


    // $ANTLR start "rule__QName__Group_1__1"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:666:1: rule__QName__Group_1__1 : rule__QName__Group_1__1__Impl ;
    public final void rule__QName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:670:1: ( rule__QName__Group_1__1__Impl )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:671:2: rule__QName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QName__Group_1__1__Impl_in_rule__QName__Group_1__11327);
            rule__QName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QName__Group_1__1"


    // $ANTLR start "rule__QName__Group_1__1__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:677:1: rule__QName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:681:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:682:1: ( RULE_ID )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:682:1: ( RULE_ID )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:683:1: RULE_ID
            {
             before(grammarAccess.getQNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QName__Group_1__1__Impl1354); 
             after(grammarAccess.getQNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QName__Group_1__1__Impl"


    // $ANTLR start "rule__QNameWithWildcard__Group__0"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:698:1: rule__QNameWithWildcard__Group__0 : rule__QNameWithWildcard__Group__0__Impl rule__QNameWithWildcard__Group__1 ;
    public final void rule__QNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:702:1: ( rule__QNameWithWildcard__Group__0__Impl rule__QNameWithWildcard__Group__1 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:703:2: rule__QNameWithWildcard__Group__0__Impl rule__QNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QNameWithWildcard__Group__0__Impl_in_rule__QNameWithWildcard__Group__01387);
            rule__QNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QNameWithWildcard__Group__1_in_rule__QNameWithWildcard__Group__01390);
            rule__QNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QNameWithWildcard__Group__0"


    // $ANTLR start "rule__QNameWithWildcard__Group__0__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:710:1: rule__QNameWithWildcard__Group__0__Impl : ( ruleQName ) ;
    public final void rule__QNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:714:1: ( ( ruleQName ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:715:1: ( ruleQName )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:715:1: ( ruleQName )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:716:1: ruleQName
            {
             before(grammarAccess.getQNameWithWildcardAccess().getQNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQName_in_rule__QNameWithWildcard__Group__0__Impl1417);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getQNameWithWildcardAccess().getQNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__QNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QNameWithWildcard__Group__1"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:727:1: rule__QNameWithWildcard__Group__1 : rule__QNameWithWildcard__Group__1__Impl ;
    public final void rule__QNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:731:1: ( rule__QNameWithWildcard__Group__1__Impl )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:732:2: rule__QNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QNameWithWildcard__Group__1__Impl_in_rule__QNameWithWildcard__Group__11446);
            rule__QNameWithWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__QNameWithWildcard__Group__1"


    // $ANTLR start "rule__QNameWithWildcard__Group__1__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:738:1: rule__QNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:742:1: ( ( ( '.*' )? ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:743:1: ( ( '.*' )? )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:743:1: ( ( '.*' )? )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:744:1: ( '.*' )?
            {
             before(grammarAccess.getQNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:745:1: ( '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:746:2: '.*'
                    {
                    match(input,19,FOLLOW_19_in_rule__QNameWithWildcard__Group__1__Impl1475); 

                    }
                    break;

            }

             after(grammarAccess.getQNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__QNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__SmallFunction__Group__0"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:761:1: rule__SmallFunction__Group__0 : rule__SmallFunction__Group__0__Impl rule__SmallFunction__Group__1 ;
    public final void rule__SmallFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:765:1: ( rule__SmallFunction__Group__0__Impl rule__SmallFunction__Group__1 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:766:2: rule__SmallFunction__Group__0__Impl rule__SmallFunction__Group__1
            {
            pushFollow(FOLLOW_rule__SmallFunction__Group__0__Impl_in_rule__SmallFunction__Group__01512);
            rule__SmallFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallFunction__Group__1_in_rule__SmallFunction__Group__01515);
            rule__SmallFunction__Group__1();

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
    // $ANTLR end "rule__SmallFunction__Group__0"


    // $ANTLR start "rule__SmallFunction__Group__0__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:773:1: rule__SmallFunction__Group__0__Impl : ( 'def' ) ;
    public final void rule__SmallFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:777:1: ( ( 'def' ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:778:1: ( 'def' )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:778:1: ( 'def' )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:779:1: 'def'
            {
             before(grammarAccess.getSmallFunctionAccess().getDefKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__SmallFunction__Group__0__Impl1543); 
             after(grammarAccess.getSmallFunctionAccess().getDefKeyword_0()); 

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
    // $ANTLR end "rule__SmallFunction__Group__0__Impl"


    // $ANTLR start "rule__SmallFunction__Group__1"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:792:1: rule__SmallFunction__Group__1 : rule__SmallFunction__Group__1__Impl rule__SmallFunction__Group__2 ;
    public final void rule__SmallFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:796:1: ( rule__SmallFunction__Group__1__Impl rule__SmallFunction__Group__2 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:797:2: rule__SmallFunction__Group__1__Impl rule__SmallFunction__Group__2
            {
            pushFollow(FOLLOW_rule__SmallFunction__Group__1__Impl_in_rule__SmallFunction__Group__11574);
            rule__SmallFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallFunction__Group__2_in_rule__SmallFunction__Group__11577);
            rule__SmallFunction__Group__2();

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
    // $ANTLR end "rule__SmallFunction__Group__1"


    // $ANTLR start "rule__SmallFunction__Group__1__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:804:1: rule__SmallFunction__Group__1__Impl : ( ( rule__SmallFunction__NameAssignment_1 ) ) ;
    public final void rule__SmallFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:808:1: ( ( ( rule__SmallFunction__NameAssignment_1 ) ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:809:1: ( ( rule__SmallFunction__NameAssignment_1 ) )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:809:1: ( ( rule__SmallFunction__NameAssignment_1 ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:810:1: ( rule__SmallFunction__NameAssignment_1 )
            {
             before(grammarAccess.getSmallFunctionAccess().getNameAssignment_1()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:811:1: ( rule__SmallFunction__NameAssignment_1 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:811:2: rule__SmallFunction__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SmallFunction__NameAssignment_1_in_rule__SmallFunction__Group__1__Impl1604);
            rule__SmallFunction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSmallFunctionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SmallFunction__Group__1__Impl"


    // $ANTLR start "rule__SmallFunction__Group__2"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:821:1: rule__SmallFunction__Group__2 : rule__SmallFunction__Group__2__Impl rule__SmallFunction__Group__3 ;
    public final void rule__SmallFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:825:1: ( rule__SmallFunction__Group__2__Impl rule__SmallFunction__Group__3 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:826:2: rule__SmallFunction__Group__2__Impl rule__SmallFunction__Group__3
            {
            pushFollow(FOLLOW_rule__SmallFunction__Group__2__Impl_in_rule__SmallFunction__Group__21634);
            rule__SmallFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallFunction__Group__3_in_rule__SmallFunction__Group__21637);
            rule__SmallFunction__Group__3();

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
    // $ANTLR end "rule__SmallFunction__Group__2"


    // $ANTLR start "rule__SmallFunction__Group__2__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:833:1: rule__SmallFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__SmallFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:837:1: ( ( '(' ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:838:1: ( '(' )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:838:1: ( '(' )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:839:1: '('
            {
             before(grammarAccess.getSmallFunctionAccess().getLeftParenthesisKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__SmallFunction__Group__2__Impl1665); 
             after(grammarAccess.getSmallFunctionAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__SmallFunction__Group__2__Impl"


    // $ANTLR start "rule__SmallFunction__Group__3"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:852:1: rule__SmallFunction__Group__3 : rule__SmallFunction__Group__3__Impl rule__SmallFunction__Group__4 ;
    public final void rule__SmallFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:856:1: ( rule__SmallFunction__Group__3__Impl rule__SmallFunction__Group__4 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:857:2: rule__SmallFunction__Group__3__Impl rule__SmallFunction__Group__4
            {
            pushFollow(FOLLOW_rule__SmallFunction__Group__3__Impl_in_rule__SmallFunction__Group__31696);
            rule__SmallFunction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallFunction__Group__4_in_rule__SmallFunction__Group__31699);
            rule__SmallFunction__Group__4();

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
    // $ANTLR end "rule__SmallFunction__Group__3"


    // $ANTLR start "rule__SmallFunction__Group__3__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:864:1: rule__SmallFunction__Group__3__Impl : ( ( rule__SmallFunction__ParamsAssignment_3 ) ) ;
    public final void rule__SmallFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:868:1: ( ( ( rule__SmallFunction__ParamsAssignment_3 ) ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:869:1: ( ( rule__SmallFunction__ParamsAssignment_3 ) )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:869:1: ( ( rule__SmallFunction__ParamsAssignment_3 ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:870:1: ( rule__SmallFunction__ParamsAssignment_3 )
            {
             before(grammarAccess.getSmallFunctionAccess().getParamsAssignment_3()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:871:1: ( rule__SmallFunction__ParamsAssignment_3 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:871:2: rule__SmallFunction__ParamsAssignment_3
            {
            pushFollow(FOLLOW_rule__SmallFunction__ParamsAssignment_3_in_rule__SmallFunction__Group__3__Impl1726);
            rule__SmallFunction__ParamsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSmallFunctionAccess().getParamsAssignment_3()); 

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
    // $ANTLR end "rule__SmallFunction__Group__3__Impl"


    // $ANTLR start "rule__SmallFunction__Group__4"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:881:1: rule__SmallFunction__Group__4 : rule__SmallFunction__Group__4__Impl rule__SmallFunction__Group__5 ;
    public final void rule__SmallFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:885:1: ( rule__SmallFunction__Group__4__Impl rule__SmallFunction__Group__5 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:886:2: rule__SmallFunction__Group__4__Impl rule__SmallFunction__Group__5
            {
            pushFollow(FOLLOW_rule__SmallFunction__Group__4__Impl_in_rule__SmallFunction__Group__41756);
            rule__SmallFunction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallFunction__Group__5_in_rule__SmallFunction__Group__41759);
            rule__SmallFunction__Group__5();

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
    // $ANTLR end "rule__SmallFunction__Group__4"


    // $ANTLR start "rule__SmallFunction__Group__4__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:893:1: rule__SmallFunction__Group__4__Impl : ( ( rule__SmallFunction__Group_4__0 )* ) ;
    public final void rule__SmallFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:897:1: ( ( ( rule__SmallFunction__Group_4__0 )* ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:898:1: ( ( rule__SmallFunction__Group_4__0 )* )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:898:1: ( ( rule__SmallFunction__Group_4__0 )* )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:899:1: ( rule__SmallFunction__Group_4__0 )*
            {
             before(grammarAccess.getSmallFunctionAccess().getGroup_4()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:900:1: ( rule__SmallFunction__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:900:2: rule__SmallFunction__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__SmallFunction__Group_4__0_in_rule__SmallFunction__Group__4__Impl1786);
            	    rule__SmallFunction__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSmallFunctionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__SmallFunction__Group__4__Impl"


    // $ANTLR start "rule__SmallFunction__Group__5"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:910:1: rule__SmallFunction__Group__5 : rule__SmallFunction__Group__5__Impl rule__SmallFunction__Group__6 ;
    public final void rule__SmallFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:914:1: ( rule__SmallFunction__Group__5__Impl rule__SmallFunction__Group__6 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:915:2: rule__SmallFunction__Group__5__Impl rule__SmallFunction__Group__6
            {
            pushFollow(FOLLOW_rule__SmallFunction__Group__5__Impl_in_rule__SmallFunction__Group__51817);
            rule__SmallFunction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallFunction__Group__6_in_rule__SmallFunction__Group__51820);
            rule__SmallFunction__Group__6();

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
    // $ANTLR end "rule__SmallFunction__Group__5"


    // $ANTLR start "rule__SmallFunction__Group__5__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:922:1: rule__SmallFunction__Group__5__Impl : ( ')' ) ;
    public final void rule__SmallFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:926:1: ( ( ')' ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:927:1: ( ')' )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:927:1: ( ')' )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:928:1: ')'
            {
             before(grammarAccess.getSmallFunctionAccess().getRightParenthesisKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__SmallFunction__Group__5__Impl1848); 
             after(grammarAccess.getSmallFunctionAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__SmallFunction__Group__5__Impl"


    // $ANTLR start "rule__SmallFunction__Group__6"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:941:1: rule__SmallFunction__Group__6 : rule__SmallFunction__Group__6__Impl rule__SmallFunction__Group__7 ;
    public final void rule__SmallFunction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:945:1: ( rule__SmallFunction__Group__6__Impl rule__SmallFunction__Group__7 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:946:2: rule__SmallFunction__Group__6__Impl rule__SmallFunction__Group__7
            {
            pushFollow(FOLLOW_rule__SmallFunction__Group__6__Impl_in_rule__SmallFunction__Group__61879);
            rule__SmallFunction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallFunction__Group__7_in_rule__SmallFunction__Group__61882);
            rule__SmallFunction__Group__7();

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
    // $ANTLR end "rule__SmallFunction__Group__6"


    // $ANTLR start "rule__SmallFunction__Group__6__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:953:1: rule__SmallFunction__Group__6__Impl : ( '{' ) ;
    public final void rule__SmallFunction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:957:1: ( ( '{' ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:958:1: ( '{' )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:958:1: ( '{' )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:959:1: '{'
            {
             before(grammarAccess.getSmallFunctionAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__SmallFunction__Group__6__Impl1910); 
             after(grammarAccess.getSmallFunctionAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__SmallFunction__Group__6__Impl"


    // $ANTLR start "rule__SmallFunction__Group__7"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:972:1: rule__SmallFunction__Group__7 : rule__SmallFunction__Group__7__Impl ;
    public final void rule__SmallFunction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:976:1: ( rule__SmallFunction__Group__7__Impl )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:977:2: rule__SmallFunction__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__SmallFunction__Group__7__Impl_in_rule__SmallFunction__Group__71941);
            rule__SmallFunction__Group__7__Impl();

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
    // $ANTLR end "rule__SmallFunction__Group__7"


    // $ANTLR start "rule__SmallFunction__Group__7__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:983:1: rule__SmallFunction__Group__7__Impl : ( '}' ) ;
    public final void rule__SmallFunction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:987:1: ( ( '}' ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:988:1: ( '}' )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:988:1: ( '}' )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:989:1: '}'
            {
             before(grammarAccess.getSmallFunctionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_24_in_rule__SmallFunction__Group__7__Impl1969); 
             after(grammarAccess.getSmallFunctionAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__SmallFunction__Group__7__Impl"


    // $ANTLR start "rule__SmallFunction__Group_4__0"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1018:1: rule__SmallFunction__Group_4__0 : rule__SmallFunction__Group_4__0__Impl rule__SmallFunction__Group_4__1 ;
    public final void rule__SmallFunction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1022:1: ( rule__SmallFunction__Group_4__0__Impl rule__SmallFunction__Group_4__1 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1023:2: rule__SmallFunction__Group_4__0__Impl rule__SmallFunction__Group_4__1
            {
            pushFollow(FOLLOW_rule__SmallFunction__Group_4__0__Impl_in_rule__SmallFunction__Group_4__02016);
            rule__SmallFunction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallFunction__Group_4__1_in_rule__SmallFunction__Group_4__02019);
            rule__SmallFunction__Group_4__1();

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
    // $ANTLR end "rule__SmallFunction__Group_4__0"


    // $ANTLR start "rule__SmallFunction__Group_4__0__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1030:1: rule__SmallFunction__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SmallFunction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1034:1: ( ( ',' ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1035:1: ( ',' )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1035:1: ( ',' )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1036:1: ','
            {
             before(grammarAccess.getSmallFunctionAccess().getCommaKeyword_4_0()); 
            match(input,25,FOLLOW_25_in_rule__SmallFunction__Group_4__0__Impl2047); 
             after(grammarAccess.getSmallFunctionAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__SmallFunction__Group_4__0__Impl"


    // $ANTLR start "rule__SmallFunction__Group_4__1"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1049:1: rule__SmallFunction__Group_4__1 : rule__SmallFunction__Group_4__1__Impl ;
    public final void rule__SmallFunction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1053:1: ( rule__SmallFunction__Group_4__1__Impl )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1054:2: rule__SmallFunction__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SmallFunction__Group_4__1__Impl_in_rule__SmallFunction__Group_4__12078);
            rule__SmallFunction__Group_4__1__Impl();

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
    // $ANTLR end "rule__SmallFunction__Group_4__1"


    // $ANTLR start "rule__SmallFunction__Group_4__1__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1060:1: rule__SmallFunction__Group_4__1__Impl : ( ( rule__SmallFunction__ParamsAssignment_4_1 ) ) ;
    public final void rule__SmallFunction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1064:1: ( ( ( rule__SmallFunction__ParamsAssignment_4_1 ) ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1065:1: ( ( rule__SmallFunction__ParamsAssignment_4_1 ) )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1065:1: ( ( rule__SmallFunction__ParamsAssignment_4_1 ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1066:1: ( rule__SmallFunction__ParamsAssignment_4_1 )
            {
             before(grammarAccess.getSmallFunctionAccess().getParamsAssignment_4_1()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1067:1: ( rule__SmallFunction__ParamsAssignment_4_1 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1067:2: rule__SmallFunction__ParamsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SmallFunction__ParamsAssignment_4_1_in_rule__SmallFunction__Group_4__1__Impl2105);
            rule__SmallFunction__ParamsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSmallFunctionAccess().getParamsAssignment_4_1()); 

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
    // $ANTLR end "rule__SmallFunction__Group_4__1__Impl"


    // $ANTLR start "rule__Param__Group__0"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1081:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1085:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1086:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__02139);
            rule__Param__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Param__Group__1_in_rule__Param__Group__02142);
            rule__Param__Group__1();

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
    // $ANTLR end "rule__Param__Group__0"


    // $ANTLR start "rule__Param__Group__0__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1093:1: rule__Param__Group__0__Impl : ( ( rule__Param__DataTypeAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1097:1: ( ( ( rule__Param__DataTypeAssignment_0 ) ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1098:1: ( ( rule__Param__DataTypeAssignment_0 ) )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1098:1: ( ( rule__Param__DataTypeAssignment_0 ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1099:1: ( rule__Param__DataTypeAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getDataTypeAssignment_0()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1100:1: ( rule__Param__DataTypeAssignment_0 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1100:2: rule__Param__DataTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Param__DataTypeAssignment_0_in_rule__Param__Group__0__Impl2169);
            rule__Param__DataTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getDataTypeAssignment_0()); 

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
    // $ANTLR end "rule__Param__Group__0__Impl"


    // $ANTLR start "rule__Param__Group__1"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1110:1: rule__Param__Group__1 : rule__Param__Group__1__Impl ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1114:1: ( rule__Param__Group__1__Impl )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1115:2: rule__Param__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__12199);
            rule__Param__Group__1__Impl();

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
    // $ANTLR end "rule__Param__Group__1"


    // $ANTLR start "rule__Param__Group__1__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1121:1: rule__Param__Group__1__Impl : ( ( rule__Param__NameAssignment_1 ) ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1125:1: ( ( ( rule__Param__NameAssignment_1 ) ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1126:1: ( ( rule__Param__NameAssignment_1 ) )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1126:1: ( ( rule__Param__NameAssignment_1 ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1127:1: ( rule__Param__NameAssignment_1 )
            {
             before(grammarAccess.getParamAccess().getNameAssignment_1()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1128:1: ( rule__Param__NameAssignment_1 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1128:2: rule__Param__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Param__NameAssignment_1_in_rule__Param__Group__1__Impl2226);
            rule__Param__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Param__Group__1__Impl"


    // $ANTLR start "rule__DataType__Group_0__0"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1142:1: rule__DataType__Group_0__0 : rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1 ;
    public final void rule__DataType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1146:1: ( rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1 )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1147:2: rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1
            {
            pushFollow(FOLLOW_rule__DataType__Group_0__0__Impl_in_rule__DataType__Group_0__02260);
            rule__DataType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group_0__1_in_rule__DataType__Group_0__02263);
            rule__DataType__Group_0__1();

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
    // $ANTLR end "rule__DataType__Group_0__0"


    // $ANTLR start "rule__DataType__Group_0__0__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1154:1: rule__DataType__Group_0__0__Impl : ( () ) ;
    public final void rule__DataType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1158:1: ( ( () ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1159:1: ( () )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1159:1: ( () )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1160:1: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_0_0()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1161:1: ()
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1163:1: 
            {
            }

             after(grammarAccess.getDataTypeAccess().getDataTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0__0__Impl"


    // $ANTLR start "rule__DataType__Group_0__1"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1173:1: rule__DataType__Group_0__1 : rule__DataType__Group_0__1__Impl ;
    public final void rule__DataType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1177:1: ( rule__DataType__Group_0__1__Impl )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1178:2: rule__DataType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group_0__1__Impl_in_rule__DataType__Group_0__12321);
            rule__DataType__Group_0__1__Impl();

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
    // $ANTLR end "rule__DataType__Group_0__1"


    // $ANTLR start "rule__DataType__Group_0__1__Impl"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1184:1: rule__DataType__Group_0__1__Impl : ( ruleBasicType ) ;
    public final void rule__DataType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1188:1: ( ( ruleBasicType ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1189:1: ( ruleBasicType )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1189:1: ( ruleBasicType )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1190:1: ruleBasicType
            {
             before(grammarAccess.getDataTypeAccess().getBasicTypeParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleBasicType_in_rule__DataType__Group_0__1__Impl2348);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getBasicTypeParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__DataType__Group_0__1__Impl"


    // $ANTLR start "rule__Namespace__NameAssignment_1"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1206:1: rule__Namespace__NameAssignment_1 : ( ruleQName ) ;
    public final void rule__Namespace__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1210:1: ( ( ruleQName ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1211:1: ( ruleQName )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1211:1: ( ruleQName )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1212:1: ruleQName
            {
             before(grammarAccess.getNamespaceAccess().getNameQNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQName_in_rule__Namespace__NameAssignment_12386);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getNameQNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Namespace__NameAssignment_1"


    // $ANTLR start "rule__Namespace__ImportsAssignment_2"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1221:1: rule__Namespace__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Namespace__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1225:1: ( ( ruleImport ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1226:1: ( ruleImport )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1226:1: ( ruleImport )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1227:1: ruleImport
            {
             before(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Namespace__ImportsAssignment_22417);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Namespace__ImportsAssignment_2"


    // $ANTLR start "rule__Namespace__FunctionAssignment_3"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1236:1: rule__Namespace__FunctionAssignment_3 : ( ruleSmallFunction ) ;
    public final void rule__Namespace__FunctionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1240:1: ( ( ruleSmallFunction ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1241:1: ( ruleSmallFunction )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1241:1: ( ruleSmallFunction )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1242:1: ruleSmallFunction
            {
             before(grammarAccess.getNamespaceAccess().getFunctionSmallFunctionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSmallFunction_in_rule__Namespace__FunctionAssignment_32448);
            ruleSmallFunction();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getFunctionSmallFunctionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Namespace__FunctionAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1251:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1255:1: ( ( ruleQNameWithWildcard ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1256:1: ( ruleQNameWithWildcard )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1256:1: ( ruleQNameWithWildcard )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1257:1: ruleQNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_12479);
            ruleQNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQNameWithWildcardParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__SmallFunction__NameAssignment_1"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1266:1: rule__SmallFunction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SmallFunction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1270:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1271:1: ( RULE_ID )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1271:1: ( RULE_ID )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1272:1: RULE_ID
            {
             before(grammarAccess.getSmallFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallFunction__NameAssignment_12510); 
             after(grammarAccess.getSmallFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SmallFunction__NameAssignment_1"


    // $ANTLR start "rule__SmallFunction__ParamsAssignment_3"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1281:1: rule__SmallFunction__ParamsAssignment_3 : ( ruleParam ) ;
    public final void rule__SmallFunction__ParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1285:1: ( ( ruleParam ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1286:1: ( ruleParam )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1286:1: ( ruleParam )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1287:1: ruleParam
            {
             before(grammarAccess.getSmallFunctionAccess().getParamsParamParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__SmallFunction__ParamsAssignment_32541);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getSmallFunctionAccess().getParamsParamParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SmallFunction__ParamsAssignment_3"


    // $ANTLR start "rule__SmallFunction__ParamsAssignment_4_1"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1296:1: rule__SmallFunction__ParamsAssignment_4_1 : ( ruleParam ) ;
    public final void rule__SmallFunction__ParamsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1300:1: ( ( ruleParam ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1301:1: ( ruleParam )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1301:1: ( ruleParam )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1302:1: ruleParam
            {
             before(grammarAccess.getSmallFunctionAccess().getParamsParamParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__SmallFunction__ParamsAssignment_4_12572);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getSmallFunctionAccess().getParamsParamParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__SmallFunction__ParamsAssignment_4_1"


    // $ANTLR start "rule__Param__DataTypeAssignment_0"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1311:1: rule__Param__DataTypeAssignment_0 : ( ruleDataType ) ;
    public final void rule__Param__DataTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1315:1: ( ( ruleDataType ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1316:1: ( ruleDataType )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1316:1: ( ruleDataType )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1317:1: ruleDataType
            {
             before(grammarAccess.getParamAccess().getDataTypeDataTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__Param__DataTypeAssignment_02603);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getParamAccess().getDataTypeDataTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Param__DataTypeAssignment_0"


    // $ANTLR start "rule__Param__NameAssignment_1"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1326:1: rule__Param__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1330:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1331:1: ( RULE_ID )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1331:1: ( RULE_ID )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1332:1: RULE_ID
            {
             before(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Param__NameAssignment_12634); 
             after(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Param__NameAssignment_1"


    // $ANTLR start "rule__ClassType__TypeAssignment"
    // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1341:1: rule__ClassType__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ClassType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1345:1: ( ( ( RULE_ID ) ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1346:1: ( ( RULE_ID ) )
            {
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1346:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1347:1: ( RULE_ID )
            {
             before(grammarAccess.getClassTypeAccess().getTypeSmallClassCrossReference_0()); 
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1348:1: ( RULE_ID )
            // ../org.neclipse.xtext.training.smallfunc.ui/src-gen/org/neclipse/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1349:1: RULE_ID
            {
             before(grammarAccess.getClassTypeAccess().getTypeSmallClassIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ClassType__TypeAssignment2669); 
             after(grammarAccess.getClassTypeAccess().getTypeSmallClassIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getClassTypeAccess().getTypeSmallClassCrossReference_0()); 

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
    // $ANTLR end "rule__ClassType__TypeAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0_in_ruleNamespace94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_entryRuleQName181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQName188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group__0_in_ruleQName214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNameWithWildcard_in_entryRuleQNameWithWildcard241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQNameWithWildcard248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QNameWithWildcard__Group__0_in_ruleQNameWithWildcard274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallFunction_in_entryRuleSmallFunction301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallFunction308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunction__Group__0_in_ruleSmallFunction334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0_in_ruleParam394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Alternatives_in_ruleDataType454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicType__Alternatives_in_ruleBasicType514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassType_in_entryRuleClassType541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassType548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__TypeAssignment_in_ruleClassType574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_0__0_in_rule__DataType__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassType_in_rule__DataType__Alternatives628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BasicType__Alternatives661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BasicType__Alternatives681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BasicType__Alternatives701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BasicType__Alternatives721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BasicType__Alternatives741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__0773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__0776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Namespace__Group__0__Impl804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__1835 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__Namespace__Group__2_in_rule__Namespace__Group__1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__NameAssignment_1_in_rule__Namespace__Group__1__Impl865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__2__Impl_in_rule__Namespace__Group__2895 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__Namespace__Group__3_in_rule__Namespace__Group__2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__ImportsAssignment_2_in_rule__Namespace__Group__2__Impl925 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__3__Impl_in_rule__Namespace__Group__3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__FunctionAssignment_3_in_rule__Namespace__Group__3__Impl983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Import__Group__0__Impl1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group__0__Impl_in_rule__QName__Group__01144 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__QName__Group__1_in_rule__QName__Group__01147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QName__Group__0__Impl1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group__1__Impl_in_rule__QName__Group__11203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group_1__0_in_rule__QName__Group__1__Impl1230 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__QName__Group_1__0__Impl_in_rule__QName__Group_1__01265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QName__Group_1__1_in_rule__QName__Group_1__01268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__QName__Group_1__0__Impl1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group_1__1__Impl_in_rule__QName__Group_1__11327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QName__Group_1__1__Impl1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QNameWithWildcard__Group__0__Impl_in_rule__QNameWithWildcard__Group__01387 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__QNameWithWildcard__Group__1_in_rule__QNameWithWildcard__Group__01390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_rule__QNameWithWildcard__Group__0__Impl1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QNameWithWildcard__Group__1__Impl_in_rule__QNameWithWildcard__Group__11446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QNameWithWildcard__Group__1__Impl1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunction__Group__0__Impl_in_rule__SmallFunction__Group__01512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmallFunction__Group__1_in_rule__SmallFunction__Group__01515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SmallFunction__Group__0__Impl1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunction__Group__1__Impl_in_rule__SmallFunction__Group__11574 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SmallFunction__Group__2_in_rule__SmallFunction__Group__11577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunction__NameAssignment_1_in_rule__SmallFunction__Group__1__Impl1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunction__Group__2__Impl_in_rule__SmallFunction__Group__21634 = new BitSet(new long[]{0x000000000000F810L});
    public static final BitSet FOLLOW_rule__SmallFunction__Group__3_in_rule__SmallFunction__Group__21637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SmallFunction__Group__2__Impl1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunction__Group__3__Impl_in_rule__SmallFunction__Group__31696 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_rule__SmallFunction__Group__4_in_rule__SmallFunction__Group__31699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunction__ParamsAssignment_3_in_rule__SmallFunction__Group__3__Impl1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunction__Group__4__Impl_in_rule__SmallFunction__Group__41756 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_rule__SmallFunction__Group__5_in_rule__SmallFunction__Group__41759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunction__Group_4__0_in_rule__SmallFunction__Group__4__Impl1786 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__SmallFunction__Group__5__Impl_in_rule__SmallFunction__Group__51817 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SmallFunction__Group__6_in_rule__SmallFunction__Group__51820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SmallFunction__Group__5__Impl1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunction__Group__6__Impl_in_rule__SmallFunction__Group__61879 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__SmallFunction__Group__7_in_rule__SmallFunction__Group__61882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SmallFunction__Group__6__Impl1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunction__Group__7__Impl_in_rule__SmallFunction__Group__71941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SmallFunction__Group__7__Impl1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunction__Group_4__0__Impl_in_rule__SmallFunction__Group_4__02016 = new BitSet(new long[]{0x000000000000F810L});
    public static final BitSet FOLLOW_rule__SmallFunction__Group_4__1_in_rule__SmallFunction__Group_4__02019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SmallFunction__Group_4__0__Impl2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunction__Group_4__1__Impl_in_rule__SmallFunction__Group_4__12078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunction__ParamsAssignment_4_1_in_rule__SmallFunction__Group_4__1__Impl2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__02139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Param__Group__1_in_rule__Param__Group__02142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__DataTypeAssignment_0_in_rule__Param__Group__0__Impl2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__12199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__NameAssignment_1_in_rule__Param__Group__1__Impl2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_0__0__Impl_in_rule__DataType__Group_0__02260 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_rule__DataType__Group_0__1_in_rule__DataType__Group_0__02263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_0__1__Impl_in_rule__DataType__Group_0__12321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_rule__DataType__Group_0__1__Impl2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_rule__Namespace__NameAssignment_12386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Namespace__ImportsAssignment_22417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallFunction_in_rule__Namespace__FunctionAssignment_32448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_12479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallFunction__NameAssignment_12510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__SmallFunction__ParamsAssignment_32541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__SmallFunction__ParamsAssignment_4_12572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Param__DataTypeAssignment_02603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Param__NameAssignment_12634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ClassType__TypeAssignment2669 = new BitSet(new long[]{0x0000000000000002L});

}