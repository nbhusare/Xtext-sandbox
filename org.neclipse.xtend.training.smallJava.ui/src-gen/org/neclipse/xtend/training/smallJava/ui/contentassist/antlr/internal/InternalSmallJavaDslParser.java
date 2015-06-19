package org.neclipse.xtend.training.smallJava.ui.contentassist.antlr.internal; 

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
import org.neclipse.xtend.training.smallJava.services.SmallJavaDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallJavaDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'boolean'", "'int'", "'long'", "'double'", "'namespace'", "'import'", "'.'", "'.*'", "'class'", "'{'", "'}'", "'extends'", "'[]'"
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSmallJavaDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallJavaDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallJavaDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g"; }


     
     	private SmallJavaDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SmallJavaDslGrammarAccess grammarAccess) {
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:60:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:61:1: ( ruleNamespace EOF )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:62:1: ruleNamespace EOF
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:69:1: ruleNamespace : ( ( rule__Namespace__Group__0 ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:73:2: ( ( ( rule__Namespace__Group__0 ) ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:74:1: ( ( rule__Namespace__Group__0 ) )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:74:1: ( ( rule__Namespace__Group__0 ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:75:1: ( rule__Namespace__Group__0 )
            {
             before(grammarAccess.getNamespaceAccess().getGroup()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:76:1: ( rule__Namespace__Group__0 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:76:2: rule__Namespace__Group__0
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:89:1: ( ruleImport EOF )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:90:1: ruleImport EOF
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:102:1: ( ( rule__Import__Group__0 ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:104:1: ( rule__Import__Group__0 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:104:2: rule__Import__Group__0
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:116:1: entryRuleQName : ruleQName EOF ;
    public final void entryRuleQName() throws RecognitionException {
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:117:1: ( ruleQName EOF )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:118:1: ruleQName EOF
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:125:1: ruleQName : ( ( rule__QName__Group__0 ) ) ;
    public final void ruleQName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:129:2: ( ( ( rule__QName__Group__0 ) ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:130:1: ( ( rule__QName__Group__0 ) )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:130:1: ( ( rule__QName__Group__0 ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:131:1: ( rule__QName__Group__0 )
            {
             before(grammarAccess.getQNameAccess().getGroup()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:132:1: ( rule__QName__Group__0 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:132:2: rule__QName__Group__0
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:144:1: entryRuleQNameWithWildcard : ruleQNameWithWildcard EOF ;
    public final void entryRuleQNameWithWildcard() throws RecognitionException {
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:145:1: ( ruleQNameWithWildcard EOF )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:146:1: ruleQNameWithWildcard EOF
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:153:1: ruleQNameWithWildcard : ( ( rule__QNameWithWildcard__Group__0 ) ) ;
    public final void ruleQNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:157:2: ( ( ( rule__QNameWithWildcard__Group__0 ) ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:158:1: ( ( rule__QNameWithWildcard__Group__0 ) )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:158:1: ( ( rule__QNameWithWildcard__Group__0 ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:159:1: ( rule__QNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQNameWithWildcardAccess().getGroup()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:160:1: ( rule__QNameWithWildcard__Group__0 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:160:2: rule__QNameWithWildcard__Group__0
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


    // $ANTLR start "entryRuleSmallClass"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:172:1: entryRuleSmallClass : ruleSmallClass EOF ;
    public final void entryRuleSmallClass() throws RecognitionException {
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:173:1: ( ruleSmallClass EOF )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:174:1: ruleSmallClass EOF
            {
             before(grammarAccess.getSmallClassRule()); 
            pushFollow(FOLLOW_ruleSmallClass_in_entryRuleSmallClass301);
            ruleSmallClass();

            state._fsp--;

             after(grammarAccess.getSmallClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallClass308); 

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
    // $ANTLR end "entryRuleSmallClass"


    // $ANTLR start "ruleSmallClass"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:181:1: ruleSmallClass : ( ( rule__SmallClass__Group__0 ) ) ;
    public final void ruleSmallClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:185:2: ( ( ( rule__SmallClass__Group__0 ) ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:186:1: ( ( rule__SmallClass__Group__0 ) )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:186:1: ( ( rule__SmallClass__Group__0 ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:187:1: ( rule__SmallClass__Group__0 )
            {
             before(grammarAccess.getSmallClassAccess().getGroup()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:188:1: ( rule__SmallClass__Group__0 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:188:2: rule__SmallClass__Group__0
            {
            pushFollow(FOLLOW_rule__SmallClass__Group__0_in_ruleSmallClass334);
            rule__SmallClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmallClassAccess().getGroup()); 

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
    // $ANTLR end "ruleSmallClass"


    // $ANTLR start "entryRuleAttribute"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:200:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:201:1: ( ruleAttribute EOF )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:202:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute361);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute368); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:209:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:213:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:214:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:214:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:215:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:216:1: ( rule__Attribute__Group__0 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:216:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute394);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDataType"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:228:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:229:1: ( ruleDataType EOF )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:230:1: ruleDataType EOF
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:237:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:241:2: ( ( ( rule__DataType__Alternatives ) ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:242:1: ( ( rule__DataType__Alternatives ) )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:242:1: ( ( rule__DataType__Alternatives ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:243:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:244:1: ( rule__DataType__Alternatives )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:244:2: rule__DataType__Alternatives
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:256:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:257:1: ( ruleBasicType EOF )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:258:1: ruleBasicType EOF
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:265:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:269:2: ( ( ( rule__BasicType__Alternatives ) ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:270:1: ( ( rule__BasicType__Alternatives ) )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:270:1: ( ( rule__BasicType__Alternatives ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:271:1: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:272:1: ( rule__BasicType__Alternatives )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:272:2: rule__BasicType__Alternatives
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:284:1: entryRuleClassType : ruleClassType EOF ;
    public final void entryRuleClassType() throws RecognitionException {
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:285:1: ( ruleClassType EOF )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:286:1: ruleClassType EOF
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:293:1: ruleClassType : ( ( rule__ClassType__TypeAssignment ) ) ;
    public final void ruleClassType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:297:2: ( ( ( rule__ClassType__TypeAssignment ) ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:298:1: ( ( rule__ClassType__TypeAssignment ) )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:298:1: ( ( rule__ClassType__TypeAssignment ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:299:1: ( rule__ClassType__TypeAssignment )
            {
             before(grammarAccess.getClassTypeAccess().getTypeAssignment()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:300:1: ( rule__ClassType__TypeAssignment )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:300:2: rule__ClassType__TypeAssignment
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:312:1: rule__DataType__Alternatives : ( ( ( rule__DataType__Group_0__0 ) ) | ( ruleClassType ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:316:1: ( ( ( rule__DataType__Group_0__0 ) ) | ( ruleClassType ) )
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
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:317:1: ( ( rule__DataType__Group_0__0 ) )
                    {
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:317:1: ( ( rule__DataType__Group_0__0 ) )
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:318:1: ( rule__DataType__Group_0__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_0()); 
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:319:1: ( rule__DataType__Group_0__0 )
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:319:2: rule__DataType__Group_0__0
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
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:323:6: ( ruleClassType )
                    {
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:323:6: ( ruleClassType )
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:324:1: ruleClassType
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:334:1: rule__BasicType__Alternatives : ( ( 'String' ) | ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'double' ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:338:1: ( ( 'String' ) | ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'double' ) )
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
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:339:1: ( 'String' )
                    {
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:339:1: ( 'String' )
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:340:1: 'String'
                    {
                     before(grammarAccess.getBasicTypeAccess().getStringKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__BasicType__Alternatives661); 
                     after(grammarAccess.getBasicTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:347:6: ( 'boolean' )
                    {
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:347:6: ( 'boolean' )
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:348:1: 'boolean'
                    {
                     before(grammarAccess.getBasicTypeAccess().getBooleanKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__BasicType__Alternatives681); 
                     after(grammarAccess.getBasicTypeAccess().getBooleanKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:355:6: ( 'int' )
                    {
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:355:6: ( 'int' )
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:356:1: 'int'
                    {
                     before(grammarAccess.getBasicTypeAccess().getIntKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__BasicType__Alternatives701); 
                     after(grammarAccess.getBasicTypeAccess().getIntKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:363:6: ( 'long' )
                    {
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:363:6: ( 'long' )
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:364:1: 'long'
                    {
                     before(grammarAccess.getBasicTypeAccess().getLongKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__BasicType__Alternatives721); 
                     after(grammarAccess.getBasicTypeAccess().getLongKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:371:6: ( 'double' )
                    {
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:371:6: ( 'double' )
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:372:1: 'double'
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:386:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:390:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:391:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:398:1: rule__Namespace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:402:1: ( ( 'namespace' ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:403:1: ( 'namespace' )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:403:1: ( 'namespace' )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:404:1: 'namespace'
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:417:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl rule__Namespace__Group__2 ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:421:1: ( rule__Namespace__Group__1__Impl rule__Namespace__Group__2 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:422:2: rule__Namespace__Group__1__Impl rule__Namespace__Group__2
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:429:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__NameAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:433:1: ( ( ( rule__Namespace__NameAssignment_1 ) ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:434:1: ( ( rule__Namespace__NameAssignment_1 ) )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:434:1: ( ( rule__Namespace__NameAssignment_1 ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:435:1: ( rule__Namespace__NameAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getNameAssignment_1()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:436:1: ( rule__Namespace__NameAssignment_1 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:436:2: rule__Namespace__NameAssignment_1
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:446:1: rule__Namespace__Group__2 : rule__Namespace__Group__2__Impl rule__Namespace__Group__3 ;
    public final void rule__Namespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:450:1: ( rule__Namespace__Group__2__Impl rule__Namespace__Group__3 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:451:2: rule__Namespace__Group__2__Impl rule__Namespace__Group__3
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:458:1: rule__Namespace__Group__2__Impl : ( ( rule__Namespace__ImportsAssignment_2 )* ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:462:1: ( ( ( rule__Namespace__ImportsAssignment_2 )* ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:463:1: ( ( rule__Namespace__ImportsAssignment_2 )* )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:463:1: ( ( rule__Namespace__ImportsAssignment_2 )* )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:464:1: ( rule__Namespace__ImportsAssignment_2 )*
            {
             before(grammarAccess.getNamespaceAccess().getImportsAssignment_2()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:465:1: ( rule__Namespace__ImportsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:465:2: rule__Namespace__ImportsAssignment_2
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:475:1: rule__Namespace__Group__3 : rule__Namespace__Group__3__Impl ;
    public final void rule__Namespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:479:1: ( rule__Namespace__Group__3__Impl )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:480:2: rule__Namespace__Group__3__Impl
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:486:1: rule__Namespace__Group__3__Impl : ( ( rule__Namespace__ClassAssignment_3 ) ) ;
    public final void rule__Namespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:490:1: ( ( ( rule__Namespace__ClassAssignment_3 ) ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:491:1: ( ( rule__Namespace__ClassAssignment_3 ) )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:491:1: ( ( rule__Namespace__ClassAssignment_3 ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:492:1: ( rule__Namespace__ClassAssignment_3 )
            {
             before(grammarAccess.getNamespaceAccess().getClassAssignment_3()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:493:1: ( rule__Namespace__ClassAssignment_3 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:493:2: rule__Namespace__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__Namespace__ClassAssignment_3_in_rule__Namespace__Group__3__Impl983);
            rule__Namespace__ClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getClassAssignment_3()); 

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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:511:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:515:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:516:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:523:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:527:1: ( ( 'import' ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:528:1: ( 'import' )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:528:1: ( 'import' )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:529:1: 'import'
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:542:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:546:1: ( rule__Import__Group__1__Impl )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:547:2: rule__Import__Group__1__Impl
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:553:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:557:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:558:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:558:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:559:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:560:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:560:2: rule__Import__ImportedNamespaceAssignment_1
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:574:1: rule__QName__Group__0 : rule__QName__Group__0__Impl rule__QName__Group__1 ;
    public final void rule__QName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:578:1: ( rule__QName__Group__0__Impl rule__QName__Group__1 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:579:2: rule__QName__Group__0__Impl rule__QName__Group__1
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:586:1: rule__QName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:590:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:591:1: ( RULE_ID )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:591:1: ( RULE_ID )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:592:1: RULE_ID
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:603:1: rule__QName__Group__1 : rule__QName__Group__1__Impl ;
    public final void rule__QName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:607:1: ( rule__QName__Group__1__Impl )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:608:2: rule__QName__Group__1__Impl
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:614:1: rule__QName__Group__1__Impl : ( ( rule__QName__Group_1__0 )* ) ;
    public final void rule__QName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:618:1: ( ( ( rule__QName__Group_1__0 )* ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:619:1: ( ( rule__QName__Group_1__0 )* )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:619:1: ( ( rule__QName__Group_1__0 )* )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:620:1: ( rule__QName__Group_1__0 )*
            {
             before(grammarAccess.getQNameAccess().getGroup_1()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:621:1: ( rule__QName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:621:2: rule__QName__Group_1__0
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:635:1: rule__QName__Group_1__0 : rule__QName__Group_1__0__Impl rule__QName__Group_1__1 ;
    public final void rule__QName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:639:1: ( rule__QName__Group_1__0__Impl rule__QName__Group_1__1 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:640:2: rule__QName__Group_1__0__Impl rule__QName__Group_1__1
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:647:1: rule__QName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:651:1: ( ( '.' ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:652:1: ( '.' )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:652:1: ( '.' )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:653:1: '.'
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:666:1: rule__QName__Group_1__1 : rule__QName__Group_1__1__Impl ;
    public final void rule__QName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:670:1: ( rule__QName__Group_1__1__Impl )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:671:2: rule__QName__Group_1__1__Impl
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:677:1: rule__QName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:681:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:682:1: ( RULE_ID )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:682:1: ( RULE_ID )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:683:1: RULE_ID
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:698:1: rule__QNameWithWildcard__Group__0 : rule__QNameWithWildcard__Group__0__Impl rule__QNameWithWildcard__Group__1 ;
    public final void rule__QNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:702:1: ( rule__QNameWithWildcard__Group__0__Impl rule__QNameWithWildcard__Group__1 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:703:2: rule__QNameWithWildcard__Group__0__Impl rule__QNameWithWildcard__Group__1
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:710:1: rule__QNameWithWildcard__Group__0__Impl : ( ruleQName ) ;
    public final void rule__QNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:714:1: ( ( ruleQName ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:715:1: ( ruleQName )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:715:1: ( ruleQName )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:716:1: ruleQName
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:727:1: rule__QNameWithWildcard__Group__1 : rule__QNameWithWildcard__Group__1__Impl ;
    public final void rule__QNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:731:1: ( rule__QNameWithWildcard__Group__1__Impl )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:732:2: rule__QNameWithWildcard__Group__1__Impl
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:738:1: rule__QNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:742:1: ( ( ( '.*' )? ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:743:1: ( ( '.*' )? )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:743:1: ( ( '.*' )? )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:744:1: ( '.*' )?
            {
             before(grammarAccess.getQNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:745:1: ( '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:746:2: '.*'
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


    // $ANTLR start "rule__SmallClass__Group__0"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:761:1: rule__SmallClass__Group__0 : rule__SmallClass__Group__0__Impl rule__SmallClass__Group__1 ;
    public final void rule__SmallClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:765:1: ( rule__SmallClass__Group__0__Impl rule__SmallClass__Group__1 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:766:2: rule__SmallClass__Group__0__Impl rule__SmallClass__Group__1
            {
            pushFollow(FOLLOW_rule__SmallClass__Group__0__Impl_in_rule__SmallClass__Group__01512);
            rule__SmallClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallClass__Group__1_in_rule__SmallClass__Group__01515);
            rule__SmallClass__Group__1();

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
    // $ANTLR end "rule__SmallClass__Group__0"


    // $ANTLR start "rule__SmallClass__Group__0__Impl"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:773:1: rule__SmallClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__SmallClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:777:1: ( ( 'class' ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:778:1: ( 'class' )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:778:1: ( 'class' )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:779:1: 'class'
            {
             before(grammarAccess.getSmallClassAccess().getClassKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__SmallClass__Group__0__Impl1543); 
             after(grammarAccess.getSmallClassAccess().getClassKeyword_0()); 

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
    // $ANTLR end "rule__SmallClass__Group__0__Impl"


    // $ANTLR start "rule__SmallClass__Group__1"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:792:1: rule__SmallClass__Group__1 : rule__SmallClass__Group__1__Impl rule__SmallClass__Group__2 ;
    public final void rule__SmallClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:796:1: ( rule__SmallClass__Group__1__Impl rule__SmallClass__Group__2 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:797:2: rule__SmallClass__Group__1__Impl rule__SmallClass__Group__2
            {
            pushFollow(FOLLOW_rule__SmallClass__Group__1__Impl_in_rule__SmallClass__Group__11574);
            rule__SmallClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallClass__Group__2_in_rule__SmallClass__Group__11577);
            rule__SmallClass__Group__2();

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
    // $ANTLR end "rule__SmallClass__Group__1"


    // $ANTLR start "rule__SmallClass__Group__1__Impl"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:804:1: rule__SmallClass__Group__1__Impl : ( ( rule__SmallClass__NameAssignment_1 ) ) ;
    public final void rule__SmallClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:808:1: ( ( ( rule__SmallClass__NameAssignment_1 ) ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:809:1: ( ( rule__SmallClass__NameAssignment_1 ) )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:809:1: ( ( rule__SmallClass__NameAssignment_1 ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:810:1: ( rule__SmallClass__NameAssignment_1 )
            {
             before(grammarAccess.getSmallClassAccess().getNameAssignment_1()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:811:1: ( rule__SmallClass__NameAssignment_1 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:811:2: rule__SmallClass__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SmallClass__NameAssignment_1_in_rule__SmallClass__Group__1__Impl1604);
            rule__SmallClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSmallClassAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SmallClass__Group__1__Impl"


    // $ANTLR start "rule__SmallClass__Group__2"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:821:1: rule__SmallClass__Group__2 : rule__SmallClass__Group__2__Impl rule__SmallClass__Group__3 ;
    public final void rule__SmallClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:825:1: ( rule__SmallClass__Group__2__Impl rule__SmallClass__Group__3 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:826:2: rule__SmallClass__Group__2__Impl rule__SmallClass__Group__3
            {
            pushFollow(FOLLOW_rule__SmallClass__Group__2__Impl_in_rule__SmallClass__Group__21634);
            rule__SmallClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallClass__Group__3_in_rule__SmallClass__Group__21637);
            rule__SmallClass__Group__3();

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
    // $ANTLR end "rule__SmallClass__Group__2"


    // $ANTLR start "rule__SmallClass__Group__2__Impl"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:833:1: rule__SmallClass__Group__2__Impl : ( ( rule__SmallClass__Group_2__0 )? ) ;
    public final void rule__SmallClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:837:1: ( ( ( rule__SmallClass__Group_2__0 )? ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:838:1: ( ( rule__SmallClass__Group_2__0 )? )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:838:1: ( ( rule__SmallClass__Group_2__0 )? )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:839:1: ( rule__SmallClass__Group_2__0 )?
            {
             before(grammarAccess.getSmallClassAccess().getGroup_2()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:840:1: ( rule__SmallClass__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:840:2: rule__SmallClass__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SmallClass__Group_2__0_in_rule__SmallClass__Group__2__Impl1664);
                    rule__SmallClass__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmallClassAccess().getGroup_2()); 

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
    // $ANTLR end "rule__SmallClass__Group__2__Impl"


    // $ANTLR start "rule__SmallClass__Group__3"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:850:1: rule__SmallClass__Group__3 : rule__SmallClass__Group__3__Impl rule__SmallClass__Group__4 ;
    public final void rule__SmallClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:854:1: ( rule__SmallClass__Group__3__Impl rule__SmallClass__Group__4 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:855:2: rule__SmallClass__Group__3__Impl rule__SmallClass__Group__4
            {
            pushFollow(FOLLOW_rule__SmallClass__Group__3__Impl_in_rule__SmallClass__Group__31695);
            rule__SmallClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallClass__Group__4_in_rule__SmallClass__Group__31698);
            rule__SmallClass__Group__4();

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
    // $ANTLR end "rule__SmallClass__Group__3"


    // $ANTLR start "rule__SmallClass__Group__3__Impl"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:862:1: rule__SmallClass__Group__3__Impl : ( '{' ) ;
    public final void rule__SmallClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:866:1: ( ( '{' ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:867:1: ( '{' )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:867:1: ( '{' )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:868:1: '{'
            {
             before(grammarAccess.getSmallClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__SmallClass__Group__3__Impl1726); 
             after(grammarAccess.getSmallClassAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__SmallClass__Group__3__Impl"


    // $ANTLR start "rule__SmallClass__Group__4"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:881:1: rule__SmallClass__Group__4 : rule__SmallClass__Group__4__Impl rule__SmallClass__Group__5 ;
    public final void rule__SmallClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:885:1: ( rule__SmallClass__Group__4__Impl rule__SmallClass__Group__5 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:886:2: rule__SmallClass__Group__4__Impl rule__SmallClass__Group__5
            {
            pushFollow(FOLLOW_rule__SmallClass__Group__4__Impl_in_rule__SmallClass__Group__41757);
            rule__SmallClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallClass__Group__5_in_rule__SmallClass__Group__41760);
            rule__SmallClass__Group__5();

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
    // $ANTLR end "rule__SmallClass__Group__4"


    // $ANTLR start "rule__SmallClass__Group__4__Impl"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:893:1: rule__SmallClass__Group__4__Impl : ( ( rule__SmallClass__AttributesAssignment_4 )* ) ;
    public final void rule__SmallClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:897:1: ( ( ( rule__SmallClass__AttributesAssignment_4 )* ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:898:1: ( ( rule__SmallClass__AttributesAssignment_4 )* )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:898:1: ( ( rule__SmallClass__AttributesAssignment_4 )* )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:899:1: ( rule__SmallClass__AttributesAssignment_4 )*
            {
             before(grammarAccess.getSmallClassAccess().getAttributesAssignment_4()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:900:1: ( rule__SmallClass__AttributesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=11 && LA7_0<=15)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:900:2: rule__SmallClass__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__SmallClass__AttributesAssignment_4_in_rule__SmallClass__Group__4__Impl1787);
            	    rule__SmallClass__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSmallClassAccess().getAttributesAssignment_4()); 

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
    // $ANTLR end "rule__SmallClass__Group__4__Impl"


    // $ANTLR start "rule__SmallClass__Group__5"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:910:1: rule__SmallClass__Group__5 : rule__SmallClass__Group__5__Impl ;
    public final void rule__SmallClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:914:1: ( rule__SmallClass__Group__5__Impl )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:915:2: rule__SmallClass__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SmallClass__Group__5__Impl_in_rule__SmallClass__Group__51818);
            rule__SmallClass__Group__5__Impl();

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
    // $ANTLR end "rule__SmallClass__Group__5"


    // $ANTLR start "rule__SmallClass__Group__5__Impl"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:921:1: rule__SmallClass__Group__5__Impl : ( '}' ) ;
    public final void rule__SmallClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:925:1: ( ( '}' ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:926:1: ( '}' )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:926:1: ( '}' )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:927:1: '}'
            {
             before(grammarAccess.getSmallClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__SmallClass__Group__5__Impl1846); 
             after(grammarAccess.getSmallClassAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__SmallClass__Group__5__Impl"


    // $ANTLR start "rule__SmallClass__Group_2__0"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:952:1: rule__SmallClass__Group_2__0 : rule__SmallClass__Group_2__0__Impl rule__SmallClass__Group_2__1 ;
    public final void rule__SmallClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:956:1: ( rule__SmallClass__Group_2__0__Impl rule__SmallClass__Group_2__1 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:957:2: rule__SmallClass__Group_2__0__Impl rule__SmallClass__Group_2__1
            {
            pushFollow(FOLLOW_rule__SmallClass__Group_2__0__Impl_in_rule__SmallClass__Group_2__01889);
            rule__SmallClass__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallClass__Group_2__1_in_rule__SmallClass__Group_2__01892);
            rule__SmallClass__Group_2__1();

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
    // $ANTLR end "rule__SmallClass__Group_2__0"


    // $ANTLR start "rule__SmallClass__Group_2__0__Impl"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:964:1: rule__SmallClass__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__SmallClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:968:1: ( ( 'extends' ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:969:1: ( 'extends' )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:969:1: ( 'extends' )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:970:1: 'extends'
            {
             before(grammarAccess.getSmallClassAccess().getExtendsKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__SmallClass__Group_2__0__Impl1920); 
             after(grammarAccess.getSmallClassAccess().getExtendsKeyword_2_0()); 

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
    // $ANTLR end "rule__SmallClass__Group_2__0__Impl"


    // $ANTLR start "rule__SmallClass__Group_2__1"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:983:1: rule__SmallClass__Group_2__1 : rule__SmallClass__Group_2__1__Impl ;
    public final void rule__SmallClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:987:1: ( rule__SmallClass__Group_2__1__Impl )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:988:2: rule__SmallClass__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SmallClass__Group_2__1__Impl_in_rule__SmallClass__Group_2__11951);
            rule__SmallClass__Group_2__1__Impl();

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
    // $ANTLR end "rule__SmallClass__Group_2__1"


    // $ANTLR start "rule__SmallClass__Group_2__1__Impl"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:994:1: rule__SmallClass__Group_2__1__Impl : ( ( rule__SmallClass__SuperClassAssignment_2_1 ) ) ;
    public final void rule__SmallClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:998:1: ( ( ( rule__SmallClass__SuperClassAssignment_2_1 ) ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:999:1: ( ( rule__SmallClass__SuperClassAssignment_2_1 ) )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:999:1: ( ( rule__SmallClass__SuperClassAssignment_2_1 ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1000:1: ( rule__SmallClass__SuperClassAssignment_2_1 )
            {
             before(grammarAccess.getSmallClassAccess().getSuperClassAssignment_2_1()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1001:1: ( rule__SmallClass__SuperClassAssignment_2_1 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1001:2: rule__SmallClass__SuperClassAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SmallClass__SuperClassAssignment_2_1_in_rule__SmallClass__Group_2__1__Impl1978);
            rule__SmallClass__SuperClassAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSmallClassAccess().getSuperClassAssignment_2_1()); 

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
    // $ANTLR end "rule__SmallClass__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1015:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1019:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1020:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02012);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02015);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1027:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__DatatypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1031:1: ( ( ( rule__Attribute__DatatypeAssignment_0 ) ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1032:1: ( ( rule__Attribute__DatatypeAssignment_0 ) )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1032:1: ( ( rule__Attribute__DatatypeAssignment_0 ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1033:1: ( rule__Attribute__DatatypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getDatatypeAssignment_0()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1034:1: ( rule__Attribute__DatatypeAssignment_0 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1034:2: rule__Attribute__DatatypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__DatatypeAssignment_0_in_rule__Attribute__Group__0__Impl2042);
            rule__Attribute__DatatypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDatatypeAssignment_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1044:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1048:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1049:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12072);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12075);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1056:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__ArrayAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1060:1: ( ( ( rule__Attribute__ArrayAssignment_1 )? ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1061:1: ( ( rule__Attribute__ArrayAssignment_1 )? )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1061:1: ( ( rule__Attribute__ArrayAssignment_1 )? )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1062:1: ( rule__Attribute__ArrayAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getArrayAssignment_1()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1063:1: ( rule__Attribute__ArrayAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1063:2: rule__Attribute__ArrayAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__ArrayAssignment_1_in_rule__Attribute__Group__1__Impl2102);
                    rule__Attribute__ArrayAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getArrayAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1073:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1077:1: ( rule__Attribute__Group__2__Impl )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1078:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22133);
            rule__Attribute__Group__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1084:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1088:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1089:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1089:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1090:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1091:1: ( rule__Attribute__NameAssignment_2 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1091:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl2160);
            rule__Attribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__DataType__Group_0__0"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1107:1: rule__DataType__Group_0__0 : rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1 ;
    public final void rule__DataType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1111:1: ( rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1 )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1112:2: rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1
            {
            pushFollow(FOLLOW_rule__DataType__Group_0__0__Impl_in_rule__DataType__Group_0__02196);
            rule__DataType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group_0__1_in_rule__DataType__Group_0__02199);
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1119:1: rule__DataType__Group_0__0__Impl : ( () ) ;
    public final void rule__DataType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1123:1: ( ( () ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1124:1: ( () )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1124:1: ( () )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1125:1: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_0_0()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1126:1: ()
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1128:1: 
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1138:1: rule__DataType__Group_0__1 : rule__DataType__Group_0__1__Impl ;
    public final void rule__DataType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1142:1: ( rule__DataType__Group_0__1__Impl )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1143:2: rule__DataType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group_0__1__Impl_in_rule__DataType__Group_0__12257);
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1149:1: rule__DataType__Group_0__1__Impl : ( ruleBasicType ) ;
    public final void rule__DataType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1153:1: ( ( ruleBasicType ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1154:1: ( ruleBasicType )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1154:1: ( ruleBasicType )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1155:1: ruleBasicType
            {
             before(grammarAccess.getDataTypeAccess().getBasicTypeParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleBasicType_in_rule__DataType__Group_0__1__Impl2284);
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1171:1: rule__Namespace__NameAssignment_1 : ( ruleQName ) ;
    public final void rule__Namespace__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1175:1: ( ( ruleQName ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1176:1: ( ruleQName )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1176:1: ( ruleQName )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1177:1: ruleQName
            {
             before(grammarAccess.getNamespaceAccess().getNameQNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQName_in_rule__Namespace__NameAssignment_12322);
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
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1186:1: rule__Namespace__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Namespace__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1190:1: ( ( ruleImport ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1191:1: ( ruleImport )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1191:1: ( ruleImport )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1192:1: ruleImport
            {
             before(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Namespace__ImportsAssignment_22353);
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


    // $ANTLR start "rule__Namespace__ClassAssignment_3"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1201:1: rule__Namespace__ClassAssignment_3 : ( ruleSmallClass ) ;
    public final void rule__Namespace__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1205:1: ( ( ruleSmallClass ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1206:1: ( ruleSmallClass )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1206:1: ( ruleSmallClass )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1207:1: ruleSmallClass
            {
             before(grammarAccess.getNamespaceAccess().getClassSmallClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSmallClass_in_rule__Namespace__ClassAssignment_32384);
            ruleSmallClass();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getClassSmallClassParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Namespace__ClassAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1216:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1220:1: ( ( ruleQNameWithWildcard ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1221:1: ( ruleQNameWithWildcard )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1221:1: ( ruleQNameWithWildcard )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1222:1: ruleQNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_12415);
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


    // $ANTLR start "rule__SmallClass__NameAssignment_1"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1231:1: rule__SmallClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SmallClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1235:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1236:1: ( RULE_ID )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1236:1: ( RULE_ID )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1237:1: RULE_ID
            {
             before(grammarAccess.getSmallClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallClass__NameAssignment_12446); 
             after(grammarAccess.getSmallClassAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SmallClass__NameAssignment_1"


    // $ANTLR start "rule__SmallClass__SuperClassAssignment_2_1"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1246:1: rule__SmallClass__SuperClassAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__SmallClass__SuperClassAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1250:1: ( ( ( RULE_ID ) ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1251:1: ( ( RULE_ID ) )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1251:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1252:1: ( RULE_ID )
            {
             before(grammarAccess.getSmallClassAccess().getSuperClassSmallClassCrossReference_2_1_0()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1253:1: ( RULE_ID )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1254:1: RULE_ID
            {
             before(grammarAccess.getSmallClassAccess().getSuperClassSmallClassIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallClass__SuperClassAssignment_2_12481); 
             after(grammarAccess.getSmallClassAccess().getSuperClassSmallClassIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getSmallClassAccess().getSuperClassSmallClassCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__SmallClass__SuperClassAssignment_2_1"


    // $ANTLR start "rule__SmallClass__AttributesAssignment_4"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1265:1: rule__SmallClass__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__SmallClass__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1269:1: ( ( ruleAttribute ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1270:1: ( ruleAttribute )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1270:1: ( ruleAttribute )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1271:1: ruleAttribute
            {
             before(grammarAccess.getSmallClassAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__SmallClass__AttributesAssignment_42516);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSmallClassAccess().getAttributesAttributeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SmallClass__AttributesAssignment_4"


    // $ANTLR start "rule__Attribute__DatatypeAssignment_0"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1280:1: rule__Attribute__DatatypeAssignment_0 : ( ruleDataType ) ;
    public final void rule__Attribute__DatatypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1284:1: ( ( ruleDataType ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1285:1: ( ruleDataType )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1285:1: ( ruleDataType )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1286:1: ruleDataType
            {
             before(grammarAccess.getAttributeAccess().getDatatypeDataTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__Attribute__DatatypeAssignment_02547);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getDatatypeDataTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Attribute__DatatypeAssignment_0"


    // $ANTLR start "rule__Attribute__ArrayAssignment_1"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1295:1: rule__Attribute__ArrayAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__Attribute__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1299:1: ( ( ( '[]' ) ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1300:1: ( ( '[]' ) )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1300:1: ( ( '[]' ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1301:1: ( '[]' )
            {
             before(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1302:1: ( '[]' )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1303:1: '[]'
            {
             before(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Attribute__ArrayAssignment_12583); 
             after(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 

            }

             after(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__Attribute__ArrayAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1318:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1322:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1323:1: ( RULE_ID )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1323:1: ( RULE_ID )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1324:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_22622); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_2"


    // $ANTLR start "rule__ClassType__TypeAssignment"
    // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1333:1: rule__ClassType__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ClassType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1337:1: ( ( ( RULE_ID ) ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1338:1: ( ( RULE_ID ) )
            {
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1338:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1339:1: ( RULE_ID )
            {
             before(grammarAccess.getClassTypeAccess().getTypeSmallClassCrossReference_0()); 
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1340:1: ( RULE_ID )
            // ../org.neclipse.xtend.training.smallJava.ui/src-gen/org/neclipse/xtend/training/smallJava/ui/contentassist/antlr/internal/InternalSmallJavaDsl.g:1341:1: RULE_ID
            {
             before(grammarAccess.getClassTypeAccess().getTypeSmallClassIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ClassType__TypeAssignment2657); 
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
    public static final BitSet FOLLOW_ruleSmallClass_in_entryRuleSmallClass301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallClass308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__0_in_ruleSmallClass334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute394 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Namespace__ClassAssignment_3_in_rule__Namespace__Group__3__Impl983 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__SmallClass__Group__0__Impl_in_rule__SmallClass__Group__01512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__1_in_rule__SmallClass__Group__01515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SmallClass__Group__0__Impl1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__1__Impl_in_rule__SmallClass__Group__11574 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__2_in_rule__SmallClass__Group__11577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__NameAssignment_1_in_rule__SmallClass__Group__1__Impl1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__2__Impl_in_rule__SmallClass__Group__21634 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__3_in_rule__SmallClass__Group__21637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group_2__0_in_rule__SmallClass__Group__2__Impl1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__3__Impl_in_rule__SmallClass__Group__31695 = new BitSet(new long[]{0x000000000040F810L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__4_in_rule__SmallClass__Group__31698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SmallClass__Group__3__Impl1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__4__Impl_in_rule__SmallClass__Group__41757 = new BitSet(new long[]{0x000000000040F810L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__5_in_rule__SmallClass__Group__41760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__AttributesAssignment_4_in_rule__SmallClass__Group__4__Impl1787 = new BitSet(new long[]{0x000000000000F812L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__5__Impl_in_rule__SmallClass__Group__51818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SmallClass__Group__5__Impl1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group_2__0__Impl_in_rule__SmallClass__Group_2__01889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmallClass__Group_2__1_in_rule__SmallClass__Group_2__01892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SmallClass__Group_2__0__Impl1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group_2__1__Impl_in_rule__SmallClass__Group_2__11951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__SuperClassAssignment_2_1_in_rule__SmallClass__Group_2__1__Impl1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02012 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DatatypeAssignment_0_in_rule__Attribute__Group__0__Impl2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12072 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ArrayAssignment_1_in_rule__Attribute__Group__1__Impl2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_0__0__Impl_in_rule__DataType__Group_0__02196 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_rule__DataType__Group_0__1_in_rule__DataType__Group_0__02199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_0__1__Impl_in_rule__DataType__Group_0__12257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_rule__DataType__Group_0__1__Impl2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_rule__Namespace__NameAssignment_12322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Namespace__ImportsAssignment_22353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallClass_in_rule__Namespace__ClassAssignment_32384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_12415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallClass__NameAssignment_12446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallClass__SuperClassAssignment_2_12481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__SmallClass__AttributesAssignment_42516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Attribute__DatatypeAssignment_02547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Attribute__ArrayAssignment_12583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_22622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ClassType__TypeAssignment2657 = new BitSet(new long[]{0x0000000000000002L});

}