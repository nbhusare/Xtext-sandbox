package org.neclipse.xtext.parentdsl.ui.contentassist.antlr.internal; 

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
import org.neclipse.xtext.parentdsl.services.ParentDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalParentDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'import'", "'.'", "'.*'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalParentDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalParentDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalParentDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g"; }


     
     	private ParentDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ParentDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleNamespaceDefinition"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:60:1: entryRuleNamespaceDefinition : ruleNamespaceDefinition EOF ;
    public final void entryRuleNamespaceDefinition() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:61:1: ( ruleNamespaceDefinition EOF )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:62:1: ruleNamespaceDefinition EOF
            {
             before(grammarAccess.getNamespaceDefinitionRule()); 
            pushFollow(FOLLOW_ruleNamespaceDefinition_in_entryRuleNamespaceDefinition61);
            ruleNamespaceDefinition();

            state._fsp--;

             after(grammarAccess.getNamespaceDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceDefinition68); 

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
    // $ANTLR end "entryRuleNamespaceDefinition"


    // $ANTLR start "ruleNamespaceDefinition"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:69:1: ruleNamespaceDefinition : ( ( rule__NamespaceDefinition__Group__0 ) ) ;
    public final void ruleNamespaceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:73:2: ( ( ( rule__NamespaceDefinition__Group__0 ) ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:74:1: ( ( rule__NamespaceDefinition__Group__0 ) )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:74:1: ( ( rule__NamespaceDefinition__Group__0 ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:75:1: ( rule__NamespaceDefinition__Group__0 )
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getGroup()); 
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:76:1: ( rule__NamespaceDefinition__Group__0 )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:76:2: rule__NamespaceDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__Group__0_in_ruleNamespaceDefinition94);
            rule__NamespaceDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleNamespaceDefinition"


    // $ANTLR start "entryRuleNamespaceDeclaration"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:88:1: entryRuleNamespaceDeclaration : ruleNamespaceDeclaration EOF ;
    public final void entryRuleNamespaceDeclaration() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:89:1: ( ruleNamespaceDeclaration EOF )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:90:1: ruleNamespaceDeclaration EOF
            {
             before(grammarAccess.getNamespaceDeclarationRule()); 
            pushFollow(FOLLOW_ruleNamespaceDeclaration_in_entryRuleNamespaceDeclaration121);
            ruleNamespaceDeclaration();

            state._fsp--;

             after(grammarAccess.getNamespaceDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceDeclaration128); 

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
    // $ANTLR end "entryRuleNamespaceDeclaration"


    // $ANTLR start "ruleNamespaceDeclaration"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:97:1: ruleNamespaceDeclaration : ( ( rule__NamespaceDeclaration__Group__0 ) ) ;
    public final void ruleNamespaceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:101:2: ( ( ( rule__NamespaceDeclaration__Group__0 ) ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:102:1: ( ( rule__NamespaceDeclaration__Group__0 ) )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:102:1: ( ( rule__NamespaceDeclaration__Group__0 ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:103:1: ( rule__NamespaceDeclaration__Group__0 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getGroup()); 
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:104:1: ( rule__NamespaceDeclaration__Group__0 )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:104:2: rule__NamespaceDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__0_in_ruleNamespaceDeclaration154);
            rule__NamespaceDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleNamespaceDeclaration"


    // $ANTLR start "entryRuleImportDeclaration"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:116:1: entryRuleImportDeclaration : ruleImportDeclaration EOF ;
    public final void entryRuleImportDeclaration() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:117:1: ( ruleImportDeclaration EOF )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:118:1: ruleImportDeclaration EOF
            {
             before(grammarAccess.getImportDeclarationRule()); 
            pushFollow(FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration181);
            ruleImportDeclaration();

            state._fsp--;

             after(grammarAccess.getImportDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDeclaration188); 

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
    // $ANTLR end "entryRuleImportDeclaration"


    // $ANTLR start "ruleImportDeclaration"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:125:1: ruleImportDeclaration : ( ( rule__ImportDeclaration__Group__0 ) ) ;
    public final void ruleImportDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:129:2: ( ( ( rule__ImportDeclaration__Group__0 ) ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:130:1: ( ( rule__ImportDeclaration__Group__0 ) )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:130:1: ( ( rule__ImportDeclaration__Group__0 ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:131:1: ( rule__ImportDeclaration__Group__0 )
            {
             before(grammarAccess.getImportDeclarationAccess().getGroup()); 
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:132:1: ( rule__ImportDeclaration__Group__0 )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:132:2: rule__ImportDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ImportDeclaration__Group__0_in_ruleImportDeclaration214);
            rule__ImportDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleImportDeclaration"


    // $ANTLR start "entryRuleImport"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:144:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:145:1: ( ruleImport EOF )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:146:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport241);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport248); 

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
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:153:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:157:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:158:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:158:1: ( ( rule__Import__Group__0 ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:159:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:160:1: ( rule__Import__Group__0 )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:160:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport274);
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


    // $ANTLR start "entryRuleQualifedName"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:172:1: entryRuleQualifedName : ruleQualifedName EOF ;
    public final void entryRuleQualifedName() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:173:1: ( ruleQualifedName EOF )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:174:1: ruleQualifedName EOF
            {
             before(grammarAccess.getQualifedNameRule()); 
            pushFollow(FOLLOW_ruleQualifedName_in_entryRuleQualifedName301);
            ruleQualifedName();

            state._fsp--;

             after(grammarAccess.getQualifedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifedName308); 

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
    // $ANTLR end "entryRuleQualifedName"


    // $ANTLR start "ruleQualifedName"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:181:1: ruleQualifedName : ( ( rule__QualifedName__Group__0 ) ) ;
    public final void ruleQualifedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:185:2: ( ( ( rule__QualifedName__Group__0 ) ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:186:1: ( ( rule__QualifedName__Group__0 ) )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:186:1: ( ( rule__QualifedName__Group__0 ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:187:1: ( rule__QualifedName__Group__0 )
            {
             before(grammarAccess.getQualifedNameAccess().getGroup()); 
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:188:1: ( rule__QualifedName__Group__0 )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:188:2: rule__QualifedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifedName__Group__0_in_ruleQualifedName334);
            rule__QualifedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifedName"


    // $ANTLR start "entryRuleQualifedNameWithWildcard"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:200:1: entryRuleQualifedNameWithWildcard : ruleQualifedNameWithWildcard EOF ;
    public final void entryRuleQualifedNameWithWildcard() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:201:1: ( ruleQualifedNameWithWildcard EOF )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:202:1: ruleQualifedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifedNameWithWildcard_in_entryRuleQualifedNameWithWildcard361);
            ruleQualifedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifedNameWithWildcard368); 

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
    // $ANTLR end "entryRuleQualifedNameWithWildcard"


    // $ANTLR start "ruleQualifedNameWithWildcard"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:209:1: ruleQualifedNameWithWildcard : ( ( rule__QualifedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:213:2: ( ( ( rule__QualifedNameWithWildcard__Group__0 ) ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:214:1: ( ( rule__QualifedNameWithWildcard__Group__0 ) )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:214:1: ( ( rule__QualifedNameWithWildcard__Group__0 ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:215:1: ( rule__QualifedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifedNameWithWildcardAccess().getGroup()); 
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:216:1: ( rule__QualifedNameWithWildcard__Group__0 )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:216:2: rule__QualifedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifedNameWithWildcard__Group__0_in_ruleQualifedNameWithWildcard394);
            rule__QualifedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifedNameWithWildcardAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifedNameWithWildcard"


    // $ANTLR start "entryRuleArtifact"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:228:1: entryRuleArtifact : ruleArtifact EOF ;
    public final void entryRuleArtifact() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:229:1: ( ruleArtifact EOF )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:230:1: ruleArtifact EOF
            {
             before(grammarAccess.getArtifactRule()); 
            pushFollow(FOLLOW_ruleArtifact_in_entryRuleArtifact421);
            ruleArtifact();

            state._fsp--;

             after(grammarAccess.getArtifactRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtifact428); 

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
    // $ANTLR end "entryRuleArtifact"


    // $ANTLR start "ruleArtifact"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:237:1: ruleArtifact : ( ( rule__Artifact__NameAssignment ) ) ;
    public final void ruleArtifact() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:241:2: ( ( ( rule__Artifact__NameAssignment ) ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:242:1: ( ( rule__Artifact__NameAssignment ) )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:242:1: ( ( rule__Artifact__NameAssignment ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:243:1: ( rule__Artifact__NameAssignment )
            {
             before(grammarAccess.getArtifactAccess().getNameAssignment()); 
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:244:1: ( rule__Artifact__NameAssignment )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:244:2: rule__Artifact__NameAssignment
            {
            pushFollow(FOLLOW_rule__Artifact__NameAssignment_in_ruleArtifact454);
            rule__Artifact__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleArtifact"


    // $ANTLR start "rule__NamespaceDefinition__Group__0"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:258:1: rule__NamespaceDefinition__Group__0 : rule__NamespaceDefinition__Group__0__Impl rule__NamespaceDefinition__Group__1 ;
    public final void rule__NamespaceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:262:1: ( rule__NamespaceDefinition__Group__0__Impl rule__NamespaceDefinition__Group__1 )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:263:2: rule__NamespaceDefinition__Group__0__Impl rule__NamespaceDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__Group__0__Impl_in_rule__NamespaceDefinition__Group__0488);
            rule__NamespaceDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDefinition__Group__1_in_rule__NamespaceDefinition__Group__0491);
            rule__NamespaceDefinition__Group__1();

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
    // $ANTLR end "rule__NamespaceDefinition__Group__0"


    // $ANTLR start "rule__NamespaceDefinition__Group__0__Impl"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:270:1: rule__NamespaceDefinition__Group__0__Impl : ( ( rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 ) ) ;
    public final void rule__NamespaceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:274:1: ( ( ( rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 ) ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:275:1: ( ( rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 ) )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:275:1: ( ( rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:276:1: ( rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 )
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getNamespaceDeclarationAssignment_0()); 
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:277:1: ( rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:277:2: rule__NamespaceDefinition__NamespaceDeclarationAssignment_0
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__NamespaceDeclarationAssignment_0_in_rule__NamespaceDefinition__Group__0__Impl518);
            rule__NamespaceDefinition__NamespaceDeclarationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDefinitionAccess().getNamespaceDeclarationAssignment_0()); 

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
    // $ANTLR end "rule__NamespaceDefinition__Group__0__Impl"


    // $ANTLR start "rule__NamespaceDefinition__Group__1"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:287:1: rule__NamespaceDefinition__Group__1 : rule__NamespaceDefinition__Group__1__Impl rule__NamespaceDefinition__Group__2 ;
    public final void rule__NamespaceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:291:1: ( rule__NamespaceDefinition__Group__1__Impl rule__NamespaceDefinition__Group__2 )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:292:2: rule__NamespaceDefinition__Group__1__Impl rule__NamespaceDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__Group__1__Impl_in_rule__NamespaceDefinition__Group__1548);
            rule__NamespaceDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDefinition__Group__2_in_rule__NamespaceDefinition__Group__1551);
            rule__NamespaceDefinition__Group__2();

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
    // $ANTLR end "rule__NamespaceDefinition__Group__1"


    // $ANTLR start "rule__NamespaceDefinition__Group__1__Impl"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:299:1: rule__NamespaceDefinition__Group__1__Impl : ( ( rule__NamespaceDefinition__ImportDeclarationAssignment_1 ) ) ;
    public final void rule__NamespaceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:303:1: ( ( ( rule__NamespaceDefinition__ImportDeclarationAssignment_1 ) ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:304:1: ( ( rule__NamespaceDefinition__ImportDeclarationAssignment_1 ) )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:304:1: ( ( rule__NamespaceDefinition__ImportDeclarationAssignment_1 ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:305:1: ( rule__NamespaceDefinition__ImportDeclarationAssignment_1 )
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getImportDeclarationAssignment_1()); 
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:306:1: ( rule__NamespaceDefinition__ImportDeclarationAssignment_1 )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:306:2: rule__NamespaceDefinition__ImportDeclarationAssignment_1
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__ImportDeclarationAssignment_1_in_rule__NamespaceDefinition__Group__1__Impl578);
            rule__NamespaceDefinition__ImportDeclarationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDefinitionAccess().getImportDeclarationAssignment_1()); 

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
    // $ANTLR end "rule__NamespaceDefinition__Group__1__Impl"


    // $ANTLR start "rule__NamespaceDefinition__Group__2"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:316:1: rule__NamespaceDefinition__Group__2 : rule__NamespaceDefinition__Group__2__Impl ;
    public final void rule__NamespaceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:320:1: ( rule__NamespaceDefinition__Group__2__Impl )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:321:2: rule__NamespaceDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__Group__2__Impl_in_rule__NamespaceDefinition__Group__2608);
            rule__NamespaceDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__NamespaceDefinition__Group__2"


    // $ANTLR start "rule__NamespaceDefinition__Group__2__Impl"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:327:1: rule__NamespaceDefinition__Group__2__Impl : ( ( rule__NamespaceDefinition__ArtifactAssignment_2 ) ) ;
    public final void rule__NamespaceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:331:1: ( ( ( rule__NamespaceDefinition__ArtifactAssignment_2 ) ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:332:1: ( ( rule__NamespaceDefinition__ArtifactAssignment_2 ) )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:332:1: ( ( rule__NamespaceDefinition__ArtifactAssignment_2 ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:333:1: ( rule__NamespaceDefinition__ArtifactAssignment_2 )
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getArtifactAssignment_2()); 
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:334:1: ( rule__NamespaceDefinition__ArtifactAssignment_2 )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:334:2: rule__NamespaceDefinition__ArtifactAssignment_2
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__ArtifactAssignment_2_in_rule__NamespaceDefinition__Group__2__Impl635);
            rule__NamespaceDefinition__ArtifactAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDefinitionAccess().getArtifactAssignment_2()); 

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
    // $ANTLR end "rule__NamespaceDefinition__Group__2__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group__0"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:350:1: rule__NamespaceDeclaration__Group__0 : rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1 ;
    public final void rule__NamespaceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:354:1: ( rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1 )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:355:2: rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__0__Impl_in_rule__NamespaceDeclaration__Group__0671);
            rule__NamespaceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__1_in_rule__NamespaceDeclaration__Group__0674);
            rule__NamespaceDeclaration__Group__1();

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
    // $ANTLR end "rule__NamespaceDeclaration__Group__0"


    // $ANTLR start "rule__NamespaceDeclaration__Group__0__Impl"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:362:1: rule__NamespaceDeclaration__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__NamespaceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:366:1: ( ( 'namespace' ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:367:1: ( 'namespace' )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:367:1: ( 'namespace' )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:368:1: 'namespace'
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__NamespaceDeclaration__Group__0__Impl702); 
             after(grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0()); 

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
    // $ANTLR end "rule__NamespaceDeclaration__Group__0__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group__1"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:381:1: rule__NamespaceDeclaration__Group__1 : rule__NamespaceDeclaration__Group__1__Impl ;
    public final void rule__NamespaceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:385:1: ( rule__NamespaceDeclaration__Group__1__Impl )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:386:2: rule__NamespaceDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__1__Impl_in_rule__NamespaceDeclaration__Group__1733);
            rule__NamespaceDeclaration__Group__1__Impl();

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
    // $ANTLR end "rule__NamespaceDeclaration__Group__1"


    // $ANTLR start "rule__NamespaceDeclaration__Group__1__Impl"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:392:1: rule__NamespaceDeclaration__Group__1__Impl : ( ( rule__NamespaceDeclaration__NameAssignment_1 ) ) ;
    public final void rule__NamespaceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:396:1: ( ( ( rule__NamespaceDeclaration__NameAssignment_1 ) ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:397:1: ( ( rule__NamespaceDeclaration__NameAssignment_1 ) )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:397:1: ( ( rule__NamespaceDeclaration__NameAssignment_1 ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:398:1: ( rule__NamespaceDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNameAssignment_1()); 
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:399:1: ( rule__NamespaceDeclaration__NameAssignment_1 )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:399:2: rule__NamespaceDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__NameAssignment_1_in_rule__NamespaceDeclaration__Group__1__Impl760);
            rule__NamespaceDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__NamespaceDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ImportDeclaration__Group__0"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:413:1: rule__ImportDeclaration__Group__0 : rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1 ;
    public final void rule__ImportDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:417:1: ( rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1 )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:418:2: rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ImportDeclaration__Group__0__Impl_in_rule__ImportDeclaration__Group__0794);
            rule__ImportDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportDeclaration__Group__1_in_rule__ImportDeclaration__Group__0797);
            rule__ImportDeclaration__Group__1();

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
    // $ANTLR end "rule__ImportDeclaration__Group__0"


    // $ANTLR start "rule__ImportDeclaration__Group__0__Impl"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:425:1: rule__ImportDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ImportDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:429:1: ( ( () ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:430:1: ( () )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:430:1: ( () )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:431:1: ()
            {
             before(grammarAccess.getImportDeclarationAccess().getImportDeclarationAction_0()); 
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:432:1: ()
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:434:1: 
            {
            }

             after(grammarAccess.getImportDeclarationAccess().getImportDeclarationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ImportDeclaration__Group__1"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:444:1: rule__ImportDeclaration__Group__1 : rule__ImportDeclaration__Group__1__Impl ;
    public final void rule__ImportDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:448:1: ( rule__ImportDeclaration__Group__1__Impl )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:449:2: rule__ImportDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportDeclaration__Group__1__Impl_in_rule__ImportDeclaration__Group__1855);
            rule__ImportDeclaration__Group__1__Impl();

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
    // $ANTLR end "rule__ImportDeclaration__Group__1"


    // $ANTLR start "rule__ImportDeclaration__Group__1__Impl"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:455:1: rule__ImportDeclaration__Group__1__Impl : ( ( rule__ImportDeclaration__ImportsAssignment_1 )* ) ;
    public final void rule__ImportDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:459:1: ( ( ( rule__ImportDeclaration__ImportsAssignment_1 )* ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:460:1: ( ( rule__ImportDeclaration__ImportsAssignment_1 )* )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:460:1: ( ( rule__ImportDeclaration__ImportsAssignment_1 )* )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:461:1: ( rule__ImportDeclaration__ImportsAssignment_1 )*
            {
             before(grammarAccess.getImportDeclarationAccess().getImportsAssignment_1()); 
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:462:1: ( rule__ImportDeclaration__ImportsAssignment_1 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:462:2: rule__ImportDeclaration__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ImportDeclaration__ImportsAssignment_1_in_rule__ImportDeclaration__Group__1__Impl882);
            	    rule__ImportDeclaration__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getImportDeclarationAccess().getImportsAssignment_1()); 

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
    // $ANTLR end "rule__ImportDeclaration__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:476:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:480:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:481:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0917);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0920);
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
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:488:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:492:1: ( ( 'import' ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:493:1: ( 'import' )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:493:1: ( 'import' )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:494:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Import__Group__0__Impl948); 
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
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:507:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:511:1: ( rule__Import__Group__1__Impl )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:512:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1979);
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
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:518:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:522:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:523:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:523:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:524:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:525:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:525:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1006);
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


    // $ANTLR start "rule__QualifedName__Group__0"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:539:1: rule__QualifedName__Group__0 : rule__QualifedName__Group__0__Impl rule__QualifedName__Group__1 ;
    public final void rule__QualifedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:543:1: ( rule__QualifedName__Group__0__Impl rule__QualifedName__Group__1 )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:544:2: rule__QualifedName__Group__0__Impl rule__QualifedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifedName__Group__0__Impl_in_rule__QualifedName__Group__01040);
            rule__QualifedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifedName__Group__1_in_rule__QualifedName__Group__01043);
            rule__QualifedName__Group__1();

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
    // $ANTLR end "rule__QualifedName__Group__0"


    // $ANTLR start "rule__QualifedName__Group__0__Impl"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:551:1: rule__QualifedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:555:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:556:1: ( RULE_ID )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:556:1: ( RULE_ID )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:557:1: RULE_ID
            {
             before(grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifedName__Group__0__Impl1070); 
             after(grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifedName__Group__0__Impl"


    // $ANTLR start "rule__QualifedName__Group__1"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:568:1: rule__QualifedName__Group__1 : rule__QualifedName__Group__1__Impl ;
    public final void rule__QualifedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:572:1: ( rule__QualifedName__Group__1__Impl )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:573:2: rule__QualifedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifedName__Group__1__Impl_in_rule__QualifedName__Group__11099);
            rule__QualifedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifedName__Group__1"


    // $ANTLR start "rule__QualifedName__Group__1__Impl"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:579:1: rule__QualifedName__Group__1__Impl : ( ( rule__QualifedName__Group_1__0 )* ) ;
    public final void rule__QualifedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:583:1: ( ( ( rule__QualifedName__Group_1__0 )* ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:584:1: ( ( rule__QualifedName__Group_1__0 )* )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:584:1: ( ( rule__QualifedName__Group_1__0 )* )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:585:1: ( rule__QualifedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifedNameAccess().getGroup_1()); 
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:586:1: ( rule__QualifedName__Group_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:586:2: rule__QualifedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifedName__Group_1__0_in_rule__QualifedName__Group__1__Impl1126);
            	    rule__QualifedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getQualifedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifedName__Group__1__Impl"


    // $ANTLR start "rule__QualifedName__Group_1__0"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:600:1: rule__QualifedName__Group_1__0 : rule__QualifedName__Group_1__0__Impl rule__QualifedName__Group_1__1 ;
    public final void rule__QualifedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:604:1: ( rule__QualifedName__Group_1__0__Impl rule__QualifedName__Group_1__1 )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:605:2: rule__QualifedName__Group_1__0__Impl rule__QualifedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifedName__Group_1__0__Impl_in_rule__QualifedName__Group_1__01161);
            rule__QualifedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifedName__Group_1__1_in_rule__QualifedName__Group_1__01164);
            rule__QualifedName__Group_1__1();

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
    // $ANTLR end "rule__QualifedName__Group_1__0"


    // $ANTLR start "rule__QualifedName__Group_1__0__Impl"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:612:1: rule__QualifedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:616:1: ( ( '.' ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:617:1: ( '.' )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:617:1: ( '.' )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:618:1: '.'
            {
             before(grammarAccess.getQualifedNameAccess().getFullStopKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__QualifedName__Group_1__0__Impl1192); 
             after(grammarAccess.getQualifedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifedName__Group_1__1"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:631:1: rule__QualifedName__Group_1__1 : rule__QualifedName__Group_1__1__Impl ;
    public final void rule__QualifedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:635:1: ( rule__QualifedName__Group_1__1__Impl )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:636:2: rule__QualifedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifedName__Group_1__1__Impl_in_rule__QualifedName__Group_1__11223);
            rule__QualifedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifedName__Group_1__1"


    // $ANTLR start "rule__QualifedName__Group_1__1__Impl"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:642:1: rule__QualifedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:646:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:647:1: ( RULE_ID )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:647:1: ( RULE_ID )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:648:1: RULE_ID
            {
             before(grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifedName__Group_1__1__Impl1250); 
             after(grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifedNameWithWildcard__Group__0"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:663:1: rule__QualifedNameWithWildcard__Group__0 : rule__QualifedNameWithWildcard__Group__0__Impl rule__QualifedNameWithWildcard__Group__1 ;
    public final void rule__QualifedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:667:1: ( rule__QualifedNameWithWildcard__Group__0__Impl rule__QualifedNameWithWildcard__Group__1 )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:668:2: rule__QualifedNameWithWildcard__Group__0__Impl rule__QualifedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifedNameWithWildcard__Group__0__Impl_in_rule__QualifedNameWithWildcard__Group__01283);
            rule__QualifedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifedNameWithWildcard__Group__1_in_rule__QualifedNameWithWildcard__Group__01286);
            rule__QualifedNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QualifedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifedNameWithWildcard__Group__0__Impl"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:675:1: rule__QualifedNameWithWildcard__Group__0__Impl : ( ruleQualifedName ) ;
    public final void rule__QualifedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:679:1: ( ( ruleQualifedName ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:680:1: ( ruleQualifedName )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:680:1: ( ruleQualifedName )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:681:1: ruleQualifedName
            {
             before(grammarAccess.getQualifedNameWithWildcardAccess().getQualifedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifedName_in_rule__QualifedNameWithWildcard__Group__0__Impl1313);
            ruleQualifedName();

            state._fsp--;

             after(grammarAccess.getQualifedNameWithWildcardAccess().getQualifedNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__QualifedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifedNameWithWildcard__Group__1"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:692:1: rule__QualifedNameWithWildcard__Group__1 : rule__QualifedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:696:1: ( rule__QualifedNameWithWildcard__Group__1__Impl )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:697:2: rule__QualifedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifedNameWithWildcard__Group__1__Impl_in_rule__QualifedNameWithWildcard__Group__11342);
            rule__QualifedNameWithWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifedNameWithWildcard__Group__1__Impl"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:703:1: rule__QualifedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:707:1: ( ( ( '.*' )? ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:708:1: ( ( '.*' )? )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:708:1: ( ( '.*' )? )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:709:1: ( '.*' )?
            {
             before(grammarAccess.getQualifedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:710:1: ( '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:711:2: '.*'
                    {
                    match(input,14,FOLLOW_14_in_rule__QualifedNameWithWildcard__Group__1__Impl1371); 

                    }
                    break;

            }

             after(grammarAccess.getQualifedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__QualifedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__NamespaceDefinition__NamespaceDeclarationAssignment_0"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:727:1: rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 : ( ruleNamespaceDeclaration ) ;
    public final void rule__NamespaceDefinition__NamespaceDeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:731:1: ( ( ruleNamespaceDeclaration ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:732:1: ( ruleNamespaceDeclaration )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:732:1: ( ruleNamespaceDeclaration )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:733:1: ruleNamespaceDeclaration
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getNamespaceDeclarationNamespaceDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNamespaceDeclaration_in_rule__NamespaceDefinition__NamespaceDeclarationAssignment_01413);
            ruleNamespaceDeclaration();

            state._fsp--;

             after(grammarAccess.getNamespaceDefinitionAccess().getNamespaceDeclarationNamespaceDeclarationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__NamespaceDefinition__NamespaceDeclarationAssignment_0"


    // $ANTLR start "rule__NamespaceDefinition__ImportDeclarationAssignment_1"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:742:1: rule__NamespaceDefinition__ImportDeclarationAssignment_1 : ( ruleImportDeclaration ) ;
    public final void rule__NamespaceDefinition__ImportDeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:746:1: ( ( ruleImportDeclaration ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:747:1: ( ruleImportDeclaration )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:747:1: ( ruleImportDeclaration )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:748:1: ruleImportDeclaration
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getImportDeclarationImportDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImportDeclaration_in_rule__NamespaceDefinition__ImportDeclarationAssignment_11444);
            ruleImportDeclaration();

            state._fsp--;

             after(grammarAccess.getNamespaceDefinitionAccess().getImportDeclarationImportDeclarationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NamespaceDefinition__ImportDeclarationAssignment_1"


    // $ANTLR start "rule__NamespaceDefinition__ArtifactAssignment_2"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:757:1: rule__NamespaceDefinition__ArtifactAssignment_2 : ( ruleArtifact ) ;
    public final void rule__NamespaceDefinition__ArtifactAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:761:1: ( ( ruleArtifact ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:762:1: ( ruleArtifact )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:762:1: ( ruleArtifact )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:763:1: ruleArtifact
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getArtifactArtifactParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleArtifact_in_rule__NamespaceDefinition__ArtifactAssignment_21475);
            ruleArtifact();

            state._fsp--;

             after(grammarAccess.getNamespaceDefinitionAccess().getArtifactArtifactParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__NamespaceDefinition__ArtifactAssignment_2"


    // $ANTLR start "rule__NamespaceDeclaration__NameAssignment_1"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:772:1: rule__NamespaceDeclaration__NameAssignment_1 : ( ruleQualifedName ) ;
    public final void rule__NamespaceDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:776:1: ( ( ruleQualifedName ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:777:1: ( ruleQualifedName )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:777:1: ( ruleQualifedName )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:778:1: ruleQualifedName
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNameQualifedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifedName_in_rule__NamespaceDeclaration__NameAssignment_11506);
            ruleQualifedName();

            state._fsp--;

             after(grammarAccess.getNamespaceDeclarationAccess().getNameQualifedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NamespaceDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ImportDeclaration__ImportsAssignment_1"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:787:1: rule__ImportDeclaration__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__ImportDeclaration__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:791:1: ( ( ruleImport ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:792:1: ( ruleImport )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:792:1: ( ruleImport )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:793:1: ruleImport
            {
             before(grammarAccess.getImportDeclarationAccess().getImportsImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__ImportDeclaration__ImportsAssignment_11537);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportDeclarationAccess().getImportsImportParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ImportDeclaration__ImportsAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:802:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:806:1: ( ( ruleQualifedNameWithWildcard ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:807:1: ( ruleQualifedNameWithWildcard )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:807:1: ( ruleQualifedNameWithWildcard )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:808:1: ruleQualifedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_11568);
            ruleQualifedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifedNameWithWildcardParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__Artifact__NameAssignment"
    // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:817:1: rule__Artifact__NameAssignment : ( RULE_ID ) ;
    public final void rule__Artifact__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:821:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:822:1: ( RULE_ID )
            {
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:822:1: ( RULE_ID )
            // ../org.neclipse.xtext.parentdsl.ui/src-gen/org/neclipse/xtext/parentdsl/ui/contentassist/antlr/internal/InternalParentDsl.g:823:1: RULE_ID
            {
             before(grammarAccess.getArtifactAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Artifact__NameAssignment1599); 
             after(grammarAccess.getArtifactAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Artifact__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleNamespaceDefinition_in_entryRuleNamespaceDefinition61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceDefinition68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__0_in_ruleNamespaceDefinition94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclaration_in_entryRuleNamespaceDeclaration121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceDeclaration128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__0_in_ruleNamespaceDeclaration154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclaration188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__Group__0_in_ruleImportDeclaration214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedName_in_entryRuleQualifedName301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifedName308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group__0_in_ruleQualifedName334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedNameWithWildcard_in_entryRuleQualifedNameWithWildcard361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifedNameWithWildcard368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedNameWithWildcard__Group__0_in_ruleQualifedNameWithWildcard394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtifact_in_entryRuleArtifact421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtifact428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Artifact__NameAssignment_in_ruleArtifact454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__0__Impl_in_rule__NamespaceDefinition__Group__0488 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__1_in_rule__NamespaceDefinition__Group__0491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__NamespaceDeclarationAssignment_0_in_rule__NamespaceDefinition__Group__0__Impl518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__1__Impl_in_rule__NamespaceDefinition__Group__1548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__2_in_rule__NamespaceDefinition__Group__1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__ImportDeclarationAssignment_1_in_rule__NamespaceDefinition__Group__1__Impl578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__2__Impl_in_rule__NamespaceDefinition__Group__2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__ArtifactAssignment_2_in_rule__NamespaceDefinition__Group__2__Impl635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__0__Impl_in_rule__NamespaceDeclaration__Group__0671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__1_in_rule__NamespaceDeclaration__Group__0674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__NamespaceDeclaration__Group__0__Impl702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__1__Impl_in_rule__NamespaceDeclaration__Group__1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__NameAssignment_1_in_rule__NamespaceDeclaration__Group__1__Impl760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__Group__0__Impl_in_rule__ImportDeclaration__Group__0794 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__Group__1_in_rule__ImportDeclaration__Group__0797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__Group__1__Impl_in_rule__ImportDeclaration__Group__1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__ImportsAssignment_1_in_rule__ImportDeclaration__Group__1__Impl882 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Import__Group__0__Impl948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group__0__Impl_in_rule__QualifedName__Group__01040 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__QualifedName__Group__1_in_rule__QualifedName__Group__01043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifedName__Group__0__Impl1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group__1__Impl_in_rule__QualifedName__Group__11099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group_1__0_in_rule__QualifedName__Group__1__Impl1126 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group_1__0__Impl_in_rule__QualifedName__Group_1__01161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifedName__Group_1__1_in_rule__QualifedName__Group_1__01164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__QualifedName__Group_1__0__Impl1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group_1__1__Impl_in_rule__QualifedName__Group_1__11223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifedName__Group_1__1__Impl1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedNameWithWildcard__Group__0__Impl_in_rule__QualifedNameWithWildcard__Group__01283 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__QualifedNameWithWildcard__Group__1_in_rule__QualifedNameWithWildcard__Group__01286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedName_in_rule__QualifedNameWithWildcard__Group__0__Impl1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedNameWithWildcard__Group__1__Impl_in_rule__QualifedNameWithWildcard__Group__11342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__QualifedNameWithWildcard__Group__1__Impl1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclaration_in_rule__NamespaceDefinition__NamespaceDeclarationAssignment_01413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_rule__NamespaceDefinition__ImportDeclarationAssignment_11444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtifact_in_rule__NamespaceDefinition__ArtifactAssignment_21475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedName_in_rule__NamespaceDeclaration__NameAssignment_11506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__ImportDeclaration__ImportsAssignment_11537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_11568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Artifact__NameAssignment1599 = new BitSet(new long[]{0x0000000000000002L});

}