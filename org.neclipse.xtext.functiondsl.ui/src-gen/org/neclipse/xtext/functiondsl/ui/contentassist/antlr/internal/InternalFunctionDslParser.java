package org.neclipse.xtext.functiondsl.ui.contentassist.antlr.internal; 

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
import org.neclipse.xtext.functiondsl.services.FunctionDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFunctionDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "'('", "')'", "'{'", "'}'", "','", "'var'", "'='", "'.'", "':'", "'namespace'", "'import'", "'.*'", "'[]'"
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


        public InternalFunctionDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFunctionDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFunctionDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g"; }


     
     	private FunctionDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FunctionDslGrammarAccess grammarAccess) {
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:60:1: entryRuleNamespaceDefinition : ruleNamespaceDefinition EOF ;
    public final void entryRuleNamespaceDefinition() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:61:1: ( ruleNamespaceDefinition EOF )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:62:1: ruleNamespaceDefinition EOF
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:69:1: ruleNamespaceDefinition : ( ( rule__NamespaceDefinition__Group__0 ) ) ;
    public final void ruleNamespaceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:73:2: ( ( ( rule__NamespaceDefinition__Group__0 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:74:1: ( ( rule__NamespaceDefinition__Group__0 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:74:1: ( ( rule__NamespaceDefinition__Group__0 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:75:1: ( rule__NamespaceDefinition__Group__0 )
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getGroup()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:76:1: ( rule__NamespaceDefinition__Group__0 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:76:2: rule__NamespaceDefinition__Group__0
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


    // $ANTLR start "entryRuleFunction"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:88:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:89:1: ( ruleFunction EOF )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:90:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction121);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction128); 

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:97:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:101:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:102:1: ( ( rule__Function__Group__0 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:102:1: ( ( rule__Function__Group__0 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:103:1: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:104:1: ( rule__Function__Group__0 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:104:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction154);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:116:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:117:1: ( ruleVariableDeclaration EOF )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:118:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration181);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration188); 

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:125:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:129:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:130:1: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:130:1: ( ( rule__VariableDeclaration__Group__0 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:131:1: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:132:1: ( rule__VariableDeclaration__Group__0 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:132:2: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration214);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleEntityAttribute"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:144:1: entryRuleEntityAttribute : ruleEntityAttribute EOF ;
    public final void entryRuleEntityAttribute() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:145:1: ( ruleEntityAttribute EOF )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:146:1: ruleEntityAttribute EOF
            {
             before(grammarAccess.getEntityAttributeRule()); 
            pushFollow(FOLLOW_ruleEntityAttribute_in_entryRuleEntityAttribute241);
            ruleEntityAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityAttribute248); 

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
    // $ANTLR end "entryRuleEntityAttribute"


    // $ANTLR start "ruleEntityAttribute"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:153:1: ruleEntityAttribute : ( ( rule__EntityAttribute__Group__0 ) ) ;
    public final void ruleEntityAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:157:2: ( ( ( rule__EntityAttribute__Group__0 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:158:1: ( ( rule__EntityAttribute__Group__0 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:158:1: ( ( rule__EntityAttribute__Group__0 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:159:1: ( rule__EntityAttribute__Group__0 )
            {
             before(grammarAccess.getEntityAttributeAccess().getGroup()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:160:1: ( rule__EntityAttribute__Group__0 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:160:2: rule__EntityAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__EntityAttribute__Group__0_in_ruleEntityAttribute274);
            rule__EntityAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityAttribute"


    // $ANTLR start "entryRuleParameter"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:172:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:173:1: ( ruleParameter EOF )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:174:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter301);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter308); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:181:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:185:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:186:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:186:1: ( ( rule__Parameter__Group__0 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:187:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:188:1: ( rule__Parameter__Group__0 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:188:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter334);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleNamespaceDeclaration"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:200:1: entryRuleNamespaceDeclaration : ruleNamespaceDeclaration EOF ;
    public final void entryRuleNamespaceDeclaration() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:201:1: ( ruleNamespaceDeclaration EOF )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:202:1: ruleNamespaceDeclaration EOF
            {
             before(grammarAccess.getNamespaceDeclarationRule()); 
            pushFollow(FOLLOW_ruleNamespaceDeclaration_in_entryRuleNamespaceDeclaration361);
            ruleNamespaceDeclaration();

            state._fsp--;

             after(grammarAccess.getNamespaceDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceDeclaration368); 

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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:209:1: ruleNamespaceDeclaration : ( ( rule__NamespaceDeclaration__Group__0 ) ) ;
    public final void ruleNamespaceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:213:2: ( ( ( rule__NamespaceDeclaration__Group__0 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:214:1: ( ( rule__NamespaceDeclaration__Group__0 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:214:1: ( ( rule__NamespaceDeclaration__Group__0 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:215:1: ( rule__NamespaceDeclaration__Group__0 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getGroup()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:216:1: ( rule__NamespaceDeclaration__Group__0 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:216:2: rule__NamespaceDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__0_in_ruleNamespaceDeclaration394);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:228:1: entryRuleImportDeclaration : ruleImportDeclaration EOF ;
    public final void entryRuleImportDeclaration() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:229:1: ( ruleImportDeclaration EOF )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:230:1: ruleImportDeclaration EOF
            {
             before(grammarAccess.getImportDeclarationRule()); 
            pushFollow(FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration421);
            ruleImportDeclaration();

            state._fsp--;

             after(grammarAccess.getImportDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDeclaration428); 

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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:237:1: ruleImportDeclaration : ( ( rule__ImportDeclaration__Group__0 ) ) ;
    public final void ruleImportDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:241:2: ( ( ( rule__ImportDeclaration__Group__0 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:242:1: ( ( rule__ImportDeclaration__Group__0 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:242:1: ( ( rule__ImportDeclaration__Group__0 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:243:1: ( rule__ImportDeclaration__Group__0 )
            {
             before(grammarAccess.getImportDeclarationAccess().getGroup()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:244:1: ( rule__ImportDeclaration__Group__0 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:244:2: rule__ImportDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ImportDeclaration__Group__0_in_ruleImportDeclaration454);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:256:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:257:1: ( ruleImport EOF )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:258:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport481);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport488); 

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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:265:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:269:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:270:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:270:1: ( ( rule__Import__Group__0 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:271:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:272:1: ( rule__Import__Group__0 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:272:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport514);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:284:1: entryRuleQualifedName : ruleQualifedName EOF ;
    public final void entryRuleQualifedName() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:285:1: ( ruleQualifedName EOF )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:286:1: ruleQualifedName EOF
            {
             before(grammarAccess.getQualifedNameRule()); 
            pushFollow(FOLLOW_ruleQualifedName_in_entryRuleQualifedName541);
            ruleQualifedName();

            state._fsp--;

             after(grammarAccess.getQualifedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifedName548); 

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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:293:1: ruleQualifedName : ( ( rule__QualifedName__Group__0 ) ) ;
    public final void ruleQualifedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:297:2: ( ( ( rule__QualifedName__Group__0 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:298:1: ( ( rule__QualifedName__Group__0 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:298:1: ( ( rule__QualifedName__Group__0 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:299:1: ( rule__QualifedName__Group__0 )
            {
             before(grammarAccess.getQualifedNameAccess().getGroup()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:300:1: ( rule__QualifedName__Group__0 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:300:2: rule__QualifedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifedName__Group__0_in_ruleQualifedName574);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:312:1: entryRuleQualifedNameWithWildcard : ruleQualifedNameWithWildcard EOF ;
    public final void entryRuleQualifedNameWithWildcard() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:313:1: ( ruleQualifedNameWithWildcard EOF )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:314:1: ruleQualifedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifedNameWithWildcard_in_entryRuleQualifedNameWithWildcard601);
            ruleQualifedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifedNameWithWildcard608); 

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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:321:1: ruleQualifedNameWithWildcard : ( ( rule__QualifedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:325:2: ( ( ( rule__QualifedNameWithWildcard__Group__0 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:326:1: ( ( rule__QualifedNameWithWildcard__Group__0 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:326:1: ( ( rule__QualifedNameWithWildcard__Group__0 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:327:1: ( rule__QualifedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifedNameWithWildcardAccess().getGroup()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:328:1: ( rule__QualifedNameWithWildcard__Group__0 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:328:2: rule__QualifedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifedNameWithWildcard__Group__0_in_ruleQualifedNameWithWildcard634);
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


    // $ANTLR start "rule__NamespaceDefinition__Group__0"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:344:1: rule__NamespaceDefinition__Group__0 : rule__NamespaceDefinition__Group__0__Impl rule__NamespaceDefinition__Group__1 ;
    public final void rule__NamespaceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:348:1: ( rule__NamespaceDefinition__Group__0__Impl rule__NamespaceDefinition__Group__1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:349:2: rule__NamespaceDefinition__Group__0__Impl rule__NamespaceDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__Group__0__Impl_in_rule__NamespaceDefinition__Group__0670);
            rule__NamespaceDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDefinition__Group__1_in_rule__NamespaceDefinition__Group__0673);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:356:1: rule__NamespaceDefinition__Group__0__Impl : ( ( rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 ) ) ;
    public final void rule__NamespaceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:360:1: ( ( ( rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:361:1: ( ( rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:361:1: ( ( rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:362:1: ( rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 )
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getNamespaceDeclarationAssignment_0()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:363:1: ( rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:363:2: rule__NamespaceDefinition__NamespaceDeclarationAssignment_0
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__NamespaceDeclarationAssignment_0_in_rule__NamespaceDefinition__Group__0__Impl700);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:373:1: rule__NamespaceDefinition__Group__1 : rule__NamespaceDefinition__Group__1__Impl rule__NamespaceDefinition__Group__2 ;
    public final void rule__NamespaceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:377:1: ( rule__NamespaceDefinition__Group__1__Impl rule__NamespaceDefinition__Group__2 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:378:2: rule__NamespaceDefinition__Group__1__Impl rule__NamespaceDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__Group__1__Impl_in_rule__NamespaceDefinition__Group__1730);
            rule__NamespaceDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDefinition__Group__2_in_rule__NamespaceDefinition__Group__1733);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:385:1: rule__NamespaceDefinition__Group__1__Impl : ( ( rule__NamespaceDefinition__ImportDeclarationAssignment_1 ) ) ;
    public final void rule__NamespaceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:389:1: ( ( ( rule__NamespaceDefinition__ImportDeclarationAssignment_1 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:390:1: ( ( rule__NamespaceDefinition__ImportDeclarationAssignment_1 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:390:1: ( ( rule__NamespaceDefinition__ImportDeclarationAssignment_1 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:391:1: ( rule__NamespaceDefinition__ImportDeclarationAssignment_1 )
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getImportDeclarationAssignment_1()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:392:1: ( rule__NamespaceDefinition__ImportDeclarationAssignment_1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:392:2: rule__NamespaceDefinition__ImportDeclarationAssignment_1
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__ImportDeclarationAssignment_1_in_rule__NamespaceDefinition__Group__1__Impl760);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:402:1: rule__NamespaceDefinition__Group__2 : rule__NamespaceDefinition__Group__2__Impl ;
    public final void rule__NamespaceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:406:1: ( rule__NamespaceDefinition__Group__2__Impl )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:407:2: rule__NamespaceDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__Group__2__Impl_in_rule__NamespaceDefinition__Group__2790);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:413:1: rule__NamespaceDefinition__Group__2__Impl : ( ( rule__NamespaceDefinition__ArtifactAssignment_2 ) ) ;
    public final void rule__NamespaceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:417:1: ( ( ( rule__NamespaceDefinition__ArtifactAssignment_2 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:418:1: ( ( rule__NamespaceDefinition__ArtifactAssignment_2 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:418:1: ( ( rule__NamespaceDefinition__ArtifactAssignment_2 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:419:1: ( rule__NamespaceDefinition__ArtifactAssignment_2 )
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getArtifactAssignment_2()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:420:1: ( rule__NamespaceDefinition__ArtifactAssignment_2 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:420:2: rule__NamespaceDefinition__ArtifactAssignment_2
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__ArtifactAssignment_2_in_rule__NamespaceDefinition__Group__2__Impl817);
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


    // $ANTLR start "rule__Function__Group__0"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:436:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:440:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:441:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__0853);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__0856);
            rule__Function__Group__1();

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
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:448:1: rule__Function__Group__0__Impl : ( () ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:452:1: ( ( () ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:453:1: ( () )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:453:1: ( () )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:454:1: ()
            {
             before(grammarAccess.getFunctionAccess().getFunctionAction_0()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:455:1: ()
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:457:1: 
            {
            }

             after(grammarAccess.getFunctionAccess().getFunctionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:467:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:471:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:472:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__1914);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__1917);
            rule__Function__Group__2();

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
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:479:1: rule__Function__Group__1__Impl : ( 'function' ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:483:1: ( ( 'function' ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:484:1: ( 'function' )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:484:1: ( 'function' )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:485:1: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__Function__Group__1__Impl945); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:498:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:502:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:503:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__2976);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__2979);
            rule__Function__Group__3();

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
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:510:1: rule__Function__Group__2__Impl : ( ( rule__Function__NameAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:514:1: ( ( ( rule__Function__NameAssignment_2 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:515:1: ( ( rule__Function__NameAssignment_2 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:515:1: ( ( rule__Function__NameAssignment_2 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:516:1: ( rule__Function__NameAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_2()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:517:1: ( rule__Function__NameAssignment_2 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:517:2: rule__Function__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_2_in_rule__Function__Group__2__Impl1006);
            rule__Function__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:527:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:531:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:532:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__31036);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__31039);
            rule__Function__Group__4();

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
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:539:1: rule__Function__Group__3__Impl : ( '(' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:543:1: ( ( '(' ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:544:1: ( '(' )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:544:1: ( '(' )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:545:1: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Function__Group__3__Impl1067); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:558:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:562:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:563:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__41098);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__5_in_rule__Function__Group__41101);
            rule__Function__Group__5();

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
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:570:1: rule__Function__Group__4__Impl : ( ( rule__Function__Group_4__0 )? ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:574:1: ( ( ( rule__Function__Group_4__0 )? ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:575:1: ( ( rule__Function__Group_4__0 )? )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:575:1: ( ( rule__Function__Group_4__0 )? )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:576:1: ( rule__Function__Group_4__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_4()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:577:1: ( rule__Function__Group_4__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:577:2: rule__Function__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Function__Group_4__0_in_rule__Function__Group__4__Impl1128);
                    rule__Function__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:587:1: rule__Function__Group__5 : rule__Function__Group__5__Impl rule__Function__Group__6 ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:591:1: ( rule__Function__Group__5__Impl rule__Function__Group__6 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:592:2: rule__Function__Group__5__Impl rule__Function__Group__6
            {
            pushFollow(FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__51159);
            rule__Function__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__6_in_rule__Function__Group__51162);
            rule__Function__Group__6();

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
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:599:1: rule__Function__Group__5__Impl : ( ')' ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:603:1: ( ( ')' ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:604:1: ( ')' )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:604:1: ( ')' )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:605:1: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__Function__Group__5__Impl1190); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__Function__Group__6"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:618:1: rule__Function__Group__6 : rule__Function__Group__6__Impl rule__Function__Group__7 ;
    public final void rule__Function__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:622:1: ( rule__Function__Group__6__Impl rule__Function__Group__7 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:623:2: rule__Function__Group__6__Impl rule__Function__Group__7
            {
            pushFollow(FOLLOW_rule__Function__Group__6__Impl_in_rule__Function__Group__61221);
            rule__Function__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__7_in_rule__Function__Group__61224);
            rule__Function__Group__7();

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
    // $ANTLR end "rule__Function__Group__6"


    // $ANTLR start "rule__Function__Group__6__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:630:1: rule__Function__Group__6__Impl : ( '{' ) ;
    public final void rule__Function__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:634:1: ( ( '{' ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:635:1: ( '{' )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:635:1: ( '{' )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:636:1: '{'
            {
             before(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Function__Group__6__Impl1252); 
             after(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__6__Impl"


    // $ANTLR start "rule__Function__Group__7"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:649:1: rule__Function__Group__7 : rule__Function__Group__7__Impl rule__Function__Group__8 ;
    public final void rule__Function__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:653:1: ( rule__Function__Group__7__Impl rule__Function__Group__8 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:654:2: rule__Function__Group__7__Impl rule__Function__Group__8
            {
            pushFollow(FOLLOW_rule__Function__Group__7__Impl_in_rule__Function__Group__71283);
            rule__Function__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__8_in_rule__Function__Group__71286);
            rule__Function__Group__8();

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
    // $ANTLR end "rule__Function__Group__7"


    // $ANTLR start "rule__Function__Group__7__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:661:1: rule__Function__Group__7__Impl : ( ( rule__Function__VariableDeclarationAssignment_7 ) ) ;
    public final void rule__Function__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:665:1: ( ( ( rule__Function__VariableDeclarationAssignment_7 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:666:1: ( ( rule__Function__VariableDeclarationAssignment_7 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:666:1: ( ( rule__Function__VariableDeclarationAssignment_7 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:667:1: ( rule__Function__VariableDeclarationAssignment_7 )
            {
             before(grammarAccess.getFunctionAccess().getVariableDeclarationAssignment_7()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:668:1: ( rule__Function__VariableDeclarationAssignment_7 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:668:2: rule__Function__VariableDeclarationAssignment_7
            {
            pushFollow(FOLLOW_rule__Function__VariableDeclarationAssignment_7_in_rule__Function__Group__7__Impl1313);
            rule__Function__VariableDeclarationAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getVariableDeclarationAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__7__Impl"


    // $ANTLR start "rule__Function__Group__8"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:678:1: rule__Function__Group__8 : rule__Function__Group__8__Impl ;
    public final void rule__Function__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:682:1: ( rule__Function__Group__8__Impl )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:683:2: rule__Function__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__8__Impl_in_rule__Function__Group__81343);
            rule__Function__Group__8__Impl();

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
    // $ANTLR end "rule__Function__Group__8"


    // $ANTLR start "rule__Function__Group__8__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:689:1: rule__Function__Group__8__Impl : ( '}' ) ;
    public final void rule__Function__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:693:1: ( ( '}' ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:694:1: ( '}' )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:694:1: ( '}' )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:695:1: '}'
            {
             before(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_15_in_rule__Function__Group__8__Impl1371); 
             after(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__8__Impl"


    // $ANTLR start "rule__Function__Group_4__0"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:726:1: rule__Function__Group_4__0 : rule__Function__Group_4__0__Impl rule__Function__Group_4__1 ;
    public final void rule__Function__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:730:1: ( rule__Function__Group_4__0__Impl rule__Function__Group_4__1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:731:2: rule__Function__Group_4__0__Impl rule__Function__Group_4__1
            {
            pushFollow(FOLLOW_rule__Function__Group_4__0__Impl_in_rule__Function__Group_4__01420);
            rule__Function__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_4__1_in_rule__Function__Group_4__01423);
            rule__Function__Group_4__1();

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
    // $ANTLR end "rule__Function__Group_4__0"


    // $ANTLR start "rule__Function__Group_4__0__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:738:1: rule__Function__Group_4__0__Impl : ( ( rule__Function__ParametersAssignment_4_0 ) ) ;
    public final void rule__Function__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:742:1: ( ( ( rule__Function__ParametersAssignment_4_0 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:743:1: ( ( rule__Function__ParametersAssignment_4_0 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:743:1: ( ( rule__Function__ParametersAssignment_4_0 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:744:1: ( rule__Function__ParametersAssignment_4_0 )
            {
             before(grammarAccess.getFunctionAccess().getParametersAssignment_4_0()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:745:1: ( rule__Function__ParametersAssignment_4_0 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:745:2: rule__Function__ParametersAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Function__ParametersAssignment_4_0_in_rule__Function__Group_4__0__Impl1450);
            rule__Function__ParametersAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getParametersAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_4__0__Impl"


    // $ANTLR start "rule__Function__Group_4__1"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:755:1: rule__Function__Group_4__1 : rule__Function__Group_4__1__Impl ;
    public final void rule__Function__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:759:1: ( rule__Function__Group_4__1__Impl )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:760:2: rule__Function__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_4__1__Impl_in_rule__Function__Group_4__11480);
            rule__Function__Group_4__1__Impl();

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
    // $ANTLR end "rule__Function__Group_4__1"


    // $ANTLR start "rule__Function__Group_4__1__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:766:1: rule__Function__Group_4__1__Impl : ( ( rule__Function__Group_4_1__0 )* ) ;
    public final void rule__Function__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:770:1: ( ( ( rule__Function__Group_4_1__0 )* ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:771:1: ( ( rule__Function__Group_4_1__0 )* )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:771:1: ( ( rule__Function__Group_4_1__0 )* )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:772:1: ( rule__Function__Group_4_1__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_4_1()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:773:1: ( rule__Function__Group_4_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:773:2: rule__Function__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Function__Group_4_1__0_in_rule__Function__Group_4__1__Impl1507);
            	    rule__Function__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_4__1__Impl"


    // $ANTLR start "rule__Function__Group_4_1__0"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:787:1: rule__Function__Group_4_1__0 : rule__Function__Group_4_1__0__Impl rule__Function__Group_4_1__1 ;
    public final void rule__Function__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:791:1: ( rule__Function__Group_4_1__0__Impl rule__Function__Group_4_1__1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:792:2: rule__Function__Group_4_1__0__Impl rule__Function__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Function__Group_4_1__0__Impl_in_rule__Function__Group_4_1__01542);
            rule__Function__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_4_1__1_in_rule__Function__Group_4_1__01545);
            rule__Function__Group_4_1__1();

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
    // $ANTLR end "rule__Function__Group_4_1__0"


    // $ANTLR start "rule__Function__Group_4_1__0__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:799:1: rule__Function__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Function__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:803:1: ( ( ',' ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:804:1: ( ',' )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:804:1: ( ',' )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:805:1: ','
            {
             before(grammarAccess.getFunctionAccess().getCommaKeyword_4_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Function__Group_4_1__0__Impl1573); 
             after(grammarAccess.getFunctionAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_4_1__0__Impl"


    // $ANTLR start "rule__Function__Group_4_1__1"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:818:1: rule__Function__Group_4_1__1 : rule__Function__Group_4_1__1__Impl ;
    public final void rule__Function__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:822:1: ( rule__Function__Group_4_1__1__Impl )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:823:2: rule__Function__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_4_1__1__Impl_in_rule__Function__Group_4_1__11604);
            rule__Function__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__Function__Group_4_1__1"


    // $ANTLR start "rule__Function__Group_4_1__1__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:829:1: rule__Function__Group_4_1__1__Impl : ( ( rule__Function__ParametersAssignment_4_1_1 ) ) ;
    public final void rule__Function__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:833:1: ( ( ( rule__Function__ParametersAssignment_4_1_1 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:834:1: ( ( rule__Function__ParametersAssignment_4_1_1 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:834:1: ( ( rule__Function__ParametersAssignment_4_1_1 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:835:1: ( rule__Function__ParametersAssignment_4_1_1 )
            {
             before(grammarAccess.getFunctionAccess().getParametersAssignment_4_1_1()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:836:1: ( rule__Function__ParametersAssignment_4_1_1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:836:2: rule__Function__ParametersAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Function__ParametersAssignment_4_1_1_in_rule__Function__Group_4_1__1__Impl1631);
            rule__Function__ParametersAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getParametersAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_4_1__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:850:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:854:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:855:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__01665);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__01668);
            rule__VariableDeclaration__Group__1();

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
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:862:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:866:1: ( ( 'var' ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:867:1: ( 'var' )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:867:1: ( 'var' )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:868:1: 'var'
            {
             before(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__VariableDeclaration__Group__0__Impl1696); 
             after(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:881:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:885:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:886:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__11727);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__11730);
            rule__VariableDeclaration__Group__2();

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
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:893:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:897:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:898:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:898:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:899:1: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:900:1: ( rule__VariableDeclaration__NameAssignment_1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:900:2: rule__VariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__NameAssignment_1_in_rule__VariableDeclaration__Group__1__Impl1757);
            rule__VariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:910:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:914:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:915:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__21787);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__21790);
            rule__VariableDeclaration__Group__3();

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
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:922:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:926:1: ( ( '=' ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:927:1: ( '=' )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:927:1: ( '=' )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:928:1: '='
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__VariableDeclaration__Group__2__Impl1818); 
             after(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:941:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:945:1: ( rule__VariableDeclaration__Group__3__Impl )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:946:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__31849);
            rule__VariableDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:952:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__EntityAttributeAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:956:1: ( ( ( rule__VariableDeclaration__EntityAttributeAssignment_3 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:957:1: ( ( rule__VariableDeclaration__EntityAttributeAssignment_3 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:957:1: ( ( rule__VariableDeclaration__EntityAttributeAssignment_3 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:958:1: ( rule__VariableDeclaration__EntityAttributeAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getEntityAttributeAssignment_3()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:959:1: ( rule__VariableDeclaration__EntityAttributeAssignment_3 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:959:2: rule__VariableDeclaration__EntityAttributeAssignment_3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__EntityAttributeAssignment_3_in_rule__VariableDeclaration__Group__3__Impl1876);
            rule__VariableDeclaration__EntityAttributeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getEntityAttributeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__EntityAttribute__Group__0"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:977:1: rule__EntityAttribute__Group__0 : rule__EntityAttribute__Group__0__Impl rule__EntityAttribute__Group__1 ;
    public final void rule__EntityAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:981:1: ( rule__EntityAttribute__Group__0__Impl rule__EntityAttribute__Group__1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:982:2: rule__EntityAttribute__Group__0__Impl rule__EntityAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__EntityAttribute__Group__0__Impl_in_rule__EntityAttribute__Group__01914);
            rule__EntityAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityAttribute__Group__1_in_rule__EntityAttribute__Group__01917);
            rule__EntityAttribute__Group__1();

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
    // $ANTLR end "rule__EntityAttribute__Group__0"


    // $ANTLR start "rule__EntityAttribute__Group__0__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:989:1: rule__EntityAttribute__Group__0__Impl : ( () ) ;
    public final void rule__EntityAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:993:1: ( ( () ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:994:1: ( () )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:994:1: ( () )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:995:1: ()
            {
             before(grammarAccess.getEntityAttributeAccess().getEntityAttributeAction_0()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:996:1: ()
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:998:1: 
            {
            }

             after(grammarAccess.getEntityAttributeAccess().getEntityAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group__0__Impl"


    // $ANTLR start "rule__EntityAttribute__Group__1"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1008:1: rule__EntityAttribute__Group__1 : rule__EntityAttribute__Group__1__Impl rule__EntityAttribute__Group__2 ;
    public final void rule__EntityAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1012:1: ( rule__EntityAttribute__Group__1__Impl rule__EntityAttribute__Group__2 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1013:2: rule__EntityAttribute__Group__1__Impl rule__EntityAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__EntityAttribute__Group__1__Impl_in_rule__EntityAttribute__Group__11975);
            rule__EntityAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityAttribute__Group__2_in_rule__EntityAttribute__Group__11978);
            rule__EntityAttribute__Group__2();

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
    // $ANTLR end "rule__EntityAttribute__Group__1"


    // $ANTLR start "rule__EntityAttribute__Group__1__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1020:1: rule__EntityAttribute__Group__1__Impl : ( ( rule__EntityAttribute__EntityReferenceAssignment_1 ) ) ;
    public final void rule__EntityAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1024:1: ( ( ( rule__EntityAttribute__EntityReferenceAssignment_1 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1025:1: ( ( rule__EntityAttribute__EntityReferenceAssignment_1 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1025:1: ( ( rule__EntityAttribute__EntityReferenceAssignment_1 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1026:1: ( rule__EntityAttribute__EntityReferenceAssignment_1 )
            {
             before(grammarAccess.getEntityAttributeAccess().getEntityReferenceAssignment_1()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1027:1: ( rule__EntityAttribute__EntityReferenceAssignment_1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1027:2: rule__EntityAttribute__EntityReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__EntityAttribute__EntityReferenceAssignment_1_in_rule__EntityAttribute__Group__1__Impl2005);
            rule__EntityAttribute__EntityReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAttributeAccess().getEntityReferenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group__1__Impl"


    // $ANTLR start "rule__EntityAttribute__Group__2"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1037:1: rule__EntityAttribute__Group__2 : rule__EntityAttribute__Group__2__Impl ;
    public final void rule__EntityAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1041:1: ( rule__EntityAttribute__Group__2__Impl )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1042:2: rule__EntityAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EntityAttribute__Group__2__Impl_in_rule__EntityAttribute__Group__22035);
            rule__EntityAttribute__Group__2__Impl();

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
    // $ANTLR end "rule__EntityAttribute__Group__2"


    // $ANTLR start "rule__EntityAttribute__Group__2__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1048:1: rule__EntityAttribute__Group__2__Impl : ( ( rule__EntityAttribute__Group_2__0 )* ) ;
    public final void rule__EntityAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1052:1: ( ( ( rule__EntityAttribute__Group_2__0 )* ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1053:1: ( ( rule__EntityAttribute__Group_2__0 )* )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1053:1: ( ( rule__EntityAttribute__Group_2__0 )* )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1054:1: ( rule__EntityAttribute__Group_2__0 )*
            {
             before(grammarAccess.getEntityAttributeAccess().getGroup_2()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1055:1: ( rule__EntityAttribute__Group_2__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1055:2: rule__EntityAttribute__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EntityAttribute__Group_2__0_in_rule__EntityAttribute__Group__2__Impl2062);
            	    rule__EntityAttribute__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEntityAttributeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group__2__Impl"


    // $ANTLR start "rule__EntityAttribute__Group_2__0"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1071:1: rule__EntityAttribute__Group_2__0 : rule__EntityAttribute__Group_2__0__Impl rule__EntityAttribute__Group_2__1 ;
    public final void rule__EntityAttribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1075:1: ( rule__EntityAttribute__Group_2__0__Impl rule__EntityAttribute__Group_2__1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1076:2: rule__EntityAttribute__Group_2__0__Impl rule__EntityAttribute__Group_2__1
            {
            pushFollow(FOLLOW_rule__EntityAttribute__Group_2__0__Impl_in_rule__EntityAttribute__Group_2__02099);
            rule__EntityAttribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityAttribute__Group_2__1_in_rule__EntityAttribute__Group_2__02102);
            rule__EntityAttribute__Group_2__1();

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
    // $ANTLR end "rule__EntityAttribute__Group_2__0"


    // $ANTLR start "rule__EntityAttribute__Group_2__0__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1083:1: rule__EntityAttribute__Group_2__0__Impl : ( () ) ;
    public final void rule__EntityAttribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1087:1: ( ( () ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1088:1: ( () )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1088:1: ( () )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1089:1: ()
            {
             before(grammarAccess.getEntityAttributeAccess().getEntityAttributeRefAction_2_0()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1090:1: ()
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1092:1: 
            {
            }

             after(grammarAccess.getEntityAttributeAccess().getEntityAttributeRefAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group_2__0__Impl"


    // $ANTLR start "rule__EntityAttribute__Group_2__1"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1102:1: rule__EntityAttribute__Group_2__1 : rule__EntityAttribute__Group_2__1__Impl rule__EntityAttribute__Group_2__2 ;
    public final void rule__EntityAttribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1106:1: ( rule__EntityAttribute__Group_2__1__Impl rule__EntityAttribute__Group_2__2 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1107:2: rule__EntityAttribute__Group_2__1__Impl rule__EntityAttribute__Group_2__2
            {
            pushFollow(FOLLOW_rule__EntityAttribute__Group_2__1__Impl_in_rule__EntityAttribute__Group_2__12160);
            rule__EntityAttribute__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityAttribute__Group_2__2_in_rule__EntityAttribute__Group_2__12163);
            rule__EntityAttribute__Group_2__2();

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
    // $ANTLR end "rule__EntityAttribute__Group_2__1"


    // $ANTLR start "rule__EntityAttribute__Group_2__1__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1114:1: rule__EntityAttribute__Group_2__1__Impl : ( '.' ) ;
    public final void rule__EntityAttribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1118:1: ( ( '.' ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1119:1: ( '.' )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1119:1: ( '.' )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1120:1: '.'
            {
             before(grammarAccess.getEntityAttributeAccess().getFullStopKeyword_2_1()); 
            match(input,19,FOLLOW_19_in_rule__EntityAttribute__Group_2__1__Impl2191); 
             after(grammarAccess.getEntityAttributeAccess().getFullStopKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group_2__1__Impl"


    // $ANTLR start "rule__EntityAttribute__Group_2__2"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1133:1: rule__EntityAttribute__Group_2__2 : rule__EntityAttribute__Group_2__2__Impl ;
    public final void rule__EntityAttribute__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1137:1: ( rule__EntityAttribute__Group_2__2__Impl )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1138:2: rule__EntityAttribute__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__EntityAttribute__Group_2__2__Impl_in_rule__EntityAttribute__Group_2__22222);
            rule__EntityAttribute__Group_2__2__Impl();

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
    // $ANTLR end "rule__EntityAttribute__Group_2__2"


    // $ANTLR start "rule__EntityAttribute__Group_2__2__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1144:1: rule__EntityAttribute__Group_2__2__Impl : ( ( rule__EntityAttribute__AttributeAssignment_2_2 ) ) ;
    public final void rule__EntityAttribute__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1148:1: ( ( ( rule__EntityAttribute__AttributeAssignment_2_2 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1149:1: ( ( rule__EntityAttribute__AttributeAssignment_2_2 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1149:1: ( ( rule__EntityAttribute__AttributeAssignment_2_2 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1150:1: ( rule__EntityAttribute__AttributeAssignment_2_2 )
            {
             before(grammarAccess.getEntityAttributeAccess().getAttributeAssignment_2_2()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1151:1: ( rule__EntityAttribute__AttributeAssignment_2_2 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1151:2: rule__EntityAttribute__AttributeAssignment_2_2
            {
            pushFollow(FOLLOW_rule__EntityAttribute__AttributeAssignment_2_2_in_rule__EntityAttribute__Group_2__2__Impl2249);
            rule__EntityAttribute__AttributeAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAttributeAccess().getAttributeAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__Group_2__2__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1167:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1171:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1172:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__02285);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02288);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1179:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1183:1: ( ( () ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1184:1: ( () )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1184:1: ( () )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1185:1: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1186:1: ()
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1188:1: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1198:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1202:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1203:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__12346);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__12349);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1210:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1214:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1215:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1215:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1216:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1217:1: ( rule__Parameter__NameAssignment_1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1217:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl2376);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1227:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1231:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1232:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__22406);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__22409);
            rule__Parameter__Group__3();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1239:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__ArrayAssignment_2 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1243:1: ( ( ( rule__Parameter__ArrayAssignment_2 )? ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1244:1: ( ( rule__Parameter__ArrayAssignment_2 )? )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1244:1: ( ( rule__Parameter__ArrayAssignment_2 )? )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1245:1: ( rule__Parameter__ArrayAssignment_2 )?
            {
             before(grammarAccess.getParameterAccess().getArrayAssignment_2()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1246:1: ( rule__Parameter__ArrayAssignment_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1246:2: rule__Parameter__ArrayAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Parameter__ArrayAssignment_2_in_rule__Parameter__Group__2__Impl2436);
                    rule__Parameter__ArrayAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getArrayAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1256:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1260:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1261:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__32467);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__4_in_rule__Parameter__Group__32470);
            rule__Parameter__Group__4();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1268:1: rule__Parameter__Group__3__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1272:1: ( ( ':' ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1273:1: ( ':' )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1273:1: ( ':' )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1274:1: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__Parameter__Group__3__Impl2498); 
             after(grammarAccess.getParameterAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1287:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1291:1: ( rule__Parameter__Group__4__Impl )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1292:2: rule__Parameter__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__4__Impl_in_rule__Parameter__Group__42529);
            rule__Parameter__Group__4__Impl();

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
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1298:1: rule__Parameter__Group__4__Impl : ( ( rule__Parameter__DataTypeAssignment_4 ) ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1302:1: ( ( ( rule__Parameter__DataTypeAssignment_4 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1303:1: ( ( rule__Parameter__DataTypeAssignment_4 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1303:1: ( ( rule__Parameter__DataTypeAssignment_4 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1304:1: ( rule__Parameter__DataTypeAssignment_4 )
            {
             before(grammarAccess.getParameterAccess().getDataTypeAssignment_4()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1305:1: ( rule__Parameter__DataTypeAssignment_4 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1305:2: rule__Parameter__DataTypeAssignment_4
            {
            pushFollow(FOLLOW_rule__Parameter__DataTypeAssignment_4_in_rule__Parameter__Group__4__Impl2556);
            rule__Parameter__DataTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getDataTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group__0"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1325:1: rule__NamespaceDeclaration__Group__0 : rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1 ;
    public final void rule__NamespaceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1329:1: ( rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1330:2: rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__0__Impl_in_rule__NamespaceDeclaration__Group__02596);
            rule__NamespaceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__1_in_rule__NamespaceDeclaration__Group__02599);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1337:1: rule__NamespaceDeclaration__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__NamespaceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1341:1: ( ( 'namespace' ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1342:1: ( 'namespace' )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1342:1: ( 'namespace' )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1343:1: 'namespace'
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__NamespaceDeclaration__Group__0__Impl2627); 
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1356:1: rule__NamespaceDeclaration__Group__1 : rule__NamespaceDeclaration__Group__1__Impl ;
    public final void rule__NamespaceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1360:1: ( rule__NamespaceDeclaration__Group__1__Impl )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1361:2: rule__NamespaceDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__1__Impl_in_rule__NamespaceDeclaration__Group__12658);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1367:1: rule__NamespaceDeclaration__Group__1__Impl : ( ( rule__NamespaceDeclaration__NameAssignment_1 ) ) ;
    public final void rule__NamespaceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1371:1: ( ( ( rule__NamespaceDeclaration__NameAssignment_1 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1372:1: ( ( rule__NamespaceDeclaration__NameAssignment_1 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1372:1: ( ( rule__NamespaceDeclaration__NameAssignment_1 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1373:1: ( rule__NamespaceDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNameAssignment_1()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1374:1: ( rule__NamespaceDeclaration__NameAssignment_1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1374:2: rule__NamespaceDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__NameAssignment_1_in_rule__NamespaceDeclaration__Group__1__Impl2685);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1388:1: rule__ImportDeclaration__Group__0 : rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1 ;
    public final void rule__ImportDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1392:1: ( rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1393:2: rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ImportDeclaration__Group__0__Impl_in_rule__ImportDeclaration__Group__02719);
            rule__ImportDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportDeclaration__Group__1_in_rule__ImportDeclaration__Group__02722);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1400:1: rule__ImportDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ImportDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1404:1: ( ( () ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1405:1: ( () )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1405:1: ( () )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1406:1: ()
            {
             before(grammarAccess.getImportDeclarationAccess().getImportDeclarationAction_0()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1407:1: ()
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1409:1: 
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1419:1: rule__ImportDeclaration__Group__1 : rule__ImportDeclaration__Group__1__Impl ;
    public final void rule__ImportDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1423:1: ( rule__ImportDeclaration__Group__1__Impl )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1424:2: rule__ImportDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportDeclaration__Group__1__Impl_in_rule__ImportDeclaration__Group__12780);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1430:1: rule__ImportDeclaration__Group__1__Impl : ( ( rule__ImportDeclaration__ImportsAssignment_1 )* ) ;
    public final void rule__ImportDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1434:1: ( ( ( rule__ImportDeclaration__ImportsAssignment_1 )* ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1435:1: ( ( rule__ImportDeclaration__ImportsAssignment_1 )* )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1435:1: ( ( rule__ImportDeclaration__ImportsAssignment_1 )* )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1436:1: ( rule__ImportDeclaration__ImportsAssignment_1 )*
            {
             before(grammarAccess.getImportDeclarationAccess().getImportsAssignment_1()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1437:1: ( rule__ImportDeclaration__ImportsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1437:2: rule__ImportDeclaration__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ImportDeclaration__ImportsAssignment_1_in_rule__ImportDeclaration__Group__1__Impl2807);
            	    rule__ImportDeclaration__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1451:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1455:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1456:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02842);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02845);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1463:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1467:1: ( ( 'import' ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1468:1: ( 'import' )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1468:1: ( 'import' )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1469:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Import__Group__0__Impl2873); 
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1482:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1486:1: ( rule__Import__Group__1__Impl )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1487:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12904);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1493:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1497:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1498:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1498:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1499:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1500:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1500:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2931);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1514:1: rule__QualifedName__Group__0 : rule__QualifedName__Group__0__Impl rule__QualifedName__Group__1 ;
    public final void rule__QualifedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1518:1: ( rule__QualifedName__Group__0__Impl rule__QualifedName__Group__1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1519:2: rule__QualifedName__Group__0__Impl rule__QualifedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifedName__Group__0__Impl_in_rule__QualifedName__Group__02965);
            rule__QualifedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifedName__Group__1_in_rule__QualifedName__Group__02968);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1526:1: rule__QualifedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1530:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1531:1: ( RULE_ID )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1531:1: ( RULE_ID )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1532:1: RULE_ID
            {
             before(grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifedName__Group__0__Impl2995); 
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1543:1: rule__QualifedName__Group__1 : rule__QualifedName__Group__1__Impl ;
    public final void rule__QualifedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1547:1: ( rule__QualifedName__Group__1__Impl )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1548:2: rule__QualifedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifedName__Group__1__Impl_in_rule__QualifedName__Group__13024);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1554:1: rule__QualifedName__Group__1__Impl : ( ( rule__QualifedName__Group_1__0 )* ) ;
    public final void rule__QualifedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1558:1: ( ( ( rule__QualifedName__Group_1__0 )* ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1559:1: ( ( rule__QualifedName__Group_1__0 )* )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1559:1: ( ( rule__QualifedName__Group_1__0 )* )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1560:1: ( rule__QualifedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifedNameAccess().getGroup_1()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1561:1: ( rule__QualifedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1561:2: rule__QualifedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifedName__Group_1__0_in_rule__QualifedName__Group__1__Impl3051);
            	    rule__QualifedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1575:1: rule__QualifedName__Group_1__0 : rule__QualifedName__Group_1__0__Impl rule__QualifedName__Group_1__1 ;
    public final void rule__QualifedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1579:1: ( rule__QualifedName__Group_1__0__Impl rule__QualifedName__Group_1__1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1580:2: rule__QualifedName__Group_1__0__Impl rule__QualifedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifedName__Group_1__0__Impl_in_rule__QualifedName__Group_1__03086);
            rule__QualifedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifedName__Group_1__1_in_rule__QualifedName__Group_1__03089);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1587:1: rule__QualifedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1591:1: ( ( '.' ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1592:1: ( '.' )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1592:1: ( '.' )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1593:1: '.'
            {
             before(grammarAccess.getQualifedNameAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__QualifedName__Group_1__0__Impl3117); 
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1606:1: rule__QualifedName__Group_1__1 : rule__QualifedName__Group_1__1__Impl ;
    public final void rule__QualifedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1610:1: ( rule__QualifedName__Group_1__1__Impl )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1611:2: rule__QualifedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifedName__Group_1__1__Impl_in_rule__QualifedName__Group_1__13148);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1617:1: rule__QualifedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1621:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1622:1: ( RULE_ID )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1622:1: ( RULE_ID )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1623:1: RULE_ID
            {
             before(grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifedName__Group_1__1__Impl3175); 
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1638:1: rule__QualifedNameWithWildcard__Group__0 : rule__QualifedNameWithWildcard__Group__0__Impl rule__QualifedNameWithWildcard__Group__1 ;
    public final void rule__QualifedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1642:1: ( rule__QualifedNameWithWildcard__Group__0__Impl rule__QualifedNameWithWildcard__Group__1 )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1643:2: rule__QualifedNameWithWildcard__Group__0__Impl rule__QualifedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifedNameWithWildcard__Group__0__Impl_in_rule__QualifedNameWithWildcard__Group__03208);
            rule__QualifedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifedNameWithWildcard__Group__1_in_rule__QualifedNameWithWildcard__Group__03211);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1650:1: rule__QualifedNameWithWildcard__Group__0__Impl : ( ruleQualifedName ) ;
    public final void rule__QualifedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1654:1: ( ( ruleQualifedName ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1655:1: ( ruleQualifedName )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1655:1: ( ruleQualifedName )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1656:1: ruleQualifedName
            {
             before(grammarAccess.getQualifedNameWithWildcardAccess().getQualifedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifedName_in_rule__QualifedNameWithWildcard__Group__0__Impl3238);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1667:1: rule__QualifedNameWithWildcard__Group__1 : rule__QualifedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1671:1: ( rule__QualifedNameWithWildcard__Group__1__Impl )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1672:2: rule__QualifedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifedNameWithWildcard__Group__1__Impl_in_rule__QualifedNameWithWildcard__Group__13267);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1678:1: rule__QualifedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1682:1: ( ( ( '.*' )? ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1683:1: ( ( '.*' )? )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1683:1: ( ( '.*' )? )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1684:1: ( '.*' )?
            {
             before(grammarAccess.getQualifedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1685:1: ( '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1686:2: '.*'
                    {
                    match(input,23,FOLLOW_23_in_rule__QualifedNameWithWildcard__Group__1__Impl3296); 

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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1702:1: rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 : ( ruleNamespaceDeclaration ) ;
    public final void rule__NamespaceDefinition__NamespaceDeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1706:1: ( ( ruleNamespaceDeclaration ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1707:1: ( ruleNamespaceDeclaration )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1707:1: ( ruleNamespaceDeclaration )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1708:1: ruleNamespaceDeclaration
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getNamespaceDeclarationNamespaceDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNamespaceDeclaration_in_rule__NamespaceDefinition__NamespaceDeclarationAssignment_03338);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1717:1: rule__NamespaceDefinition__ImportDeclarationAssignment_1 : ( ruleImportDeclaration ) ;
    public final void rule__NamespaceDefinition__ImportDeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1721:1: ( ( ruleImportDeclaration ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1722:1: ( ruleImportDeclaration )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1722:1: ( ruleImportDeclaration )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1723:1: ruleImportDeclaration
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getImportDeclarationImportDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImportDeclaration_in_rule__NamespaceDefinition__ImportDeclarationAssignment_13369);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1732:1: rule__NamespaceDefinition__ArtifactAssignment_2 : ( ruleFunction ) ;
    public final void rule__NamespaceDefinition__ArtifactAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1736:1: ( ( ruleFunction ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1737:1: ( ruleFunction )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1737:1: ( ruleFunction )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1738:1: ruleFunction
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getArtifactFunctionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFunction_in_rule__NamespaceDefinition__ArtifactAssignment_23400);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getNamespaceDefinitionAccess().getArtifactFunctionParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Function__NameAssignment_2"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1747:1: rule__Function__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1751:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1752:1: ( RULE_ID )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1752:1: ( RULE_ID )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1753:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__NameAssignment_23431); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_2"


    // $ANTLR start "rule__Function__ParametersAssignment_4_0"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1762:1: rule__Function__ParametersAssignment_4_0 : ( ruleParameter ) ;
    public final void rule__Function__ParametersAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1766:1: ( ( ruleParameter ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1767:1: ( ruleParameter )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1767:1: ( ruleParameter )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1768:1: ruleParameter
            {
             before(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Function__ParametersAssignment_4_03462);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ParametersAssignment_4_0"


    // $ANTLR start "rule__Function__ParametersAssignment_4_1_1"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1777:1: rule__Function__ParametersAssignment_4_1_1 : ( ruleParameter ) ;
    public final void rule__Function__ParametersAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1781:1: ( ( ruleParameter ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1782:1: ( ruleParameter )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1782:1: ( ruleParameter )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1783:1: ruleParameter
            {
             before(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Function__ParametersAssignment_4_1_13493);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ParametersAssignment_4_1_1"


    // $ANTLR start "rule__Function__VariableDeclarationAssignment_7"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1792:1: rule__Function__VariableDeclarationAssignment_7 : ( ruleVariableDeclaration ) ;
    public final void rule__Function__VariableDeclarationAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1796:1: ( ( ruleVariableDeclaration ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1797:1: ( ruleVariableDeclaration )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1797:1: ( ruleVariableDeclaration )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1798:1: ruleVariableDeclaration
            {
             before(grammarAccess.getFunctionAccess().getVariableDeclarationVariableDeclarationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__Function__VariableDeclarationAssignment_73524);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getVariableDeclarationVariableDeclarationParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__VariableDeclarationAssignment_7"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1807:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1811:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1812:1: ( RULE_ID )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1812:1: ( RULE_ID )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1813:1: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_13555); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__EntityAttributeAssignment_3"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1822:1: rule__VariableDeclaration__EntityAttributeAssignment_3 : ( ruleEntityAttribute ) ;
    public final void rule__VariableDeclaration__EntityAttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1826:1: ( ( ruleEntityAttribute ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1827:1: ( ruleEntityAttribute )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1827:1: ( ruleEntityAttribute )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1828:1: ruleEntityAttribute
            {
             before(grammarAccess.getVariableDeclarationAccess().getEntityAttributeEntityAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEntityAttribute_in_rule__VariableDeclaration__EntityAttributeAssignment_33586);
            ruleEntityAttribute();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getEntityAttributeEntityAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__EntityAttributeAssignment_3"


    // $ANTLR start "rule__EntityAttribute__EntityReferenceAssignment_1"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1837:1: rule__EntityAttribute__EntityReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EntityAttribute__EntityReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1841:1: ( ( ( RULE_ID ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1842:1: ( ( RULE_ID ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1842:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1843:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAttributeAccess().getEntityReferenceParameterCrossReference_1_0()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1844:1: ( RULE_ID )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1845:1: RULE_ID
            {
             before(grammarAccess.getEntityAttributeAccess().getEntityReferenceParameterIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityAttribute__EntityReferenceAssignment_13621); 
             after(grammarAccess.getEntityAttributeAccess().getEntityReferenceParameterIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEntityAttributeAccess().getEntityReferenceParameterCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__EntityReferenceAssignment_1"


    // $ANTLR start "rule__EntityAttribute__AttributeAssignment_2_2"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1856:1: rule__EntityAttribute__AttributeAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__EntityAttribute__AttributeAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1860:1: ( ( ( RULE_ID ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1861:1: ( ( RULE_ID ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1861:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1862:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAttributeAccess().getAttributeAttributeCrossReference_2_2_0()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1863:1: ( RULE_ID )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1864:1: RULE_ID
            {
             before(grammarAccess.getEntityAttributeAccess().getAttributeAttributeIDTerminalRuleCall_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityAttribute__AttributeAssignment_2_23660); 
             after(grammarAccess.getEntityAttributeAccess().getAttributeAttributeIDTerminalRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getEntityAttributeAccess().getAttributeAttributeCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityAttribute__AttributeAssignment_2_2"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1875:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1879:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1880:1: ( RULE_ID )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1880:1: ( RULE_ID )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1881:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_13695); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Parameter__ArrayAssignment_2"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1890:1: rule__Parameter__ArrayAssignment_2 : ( ( '[]' ) ) ;
    public final void rule__Parameter__ArrayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1894:1: ( ( ( '[]' ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1895:1: ( ( '[]' ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1895:1: ( ( '[]' ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1896:1: ( '[]' )
            {
             before(grammarAccess.getParameterAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1897:1: ( '[]' )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1898:1: '[]'
            {
             before(grammarAccess.getParameterAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Parameter__ArrayAssignment_23731); 
             after(grammarAccess.getParameterAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_2_0()); 

            }

             after(grammarAccess.getParameterAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ArrayAssignment_2"


    // $ANTLR start "rule__Parameter__DataTypeAssignment_4"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1913:1: rule__Parameter__DataTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__DataTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1917:1: ( ( ( RULE_ID ) ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1918:1: ( ( RULE_ID ) )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1918:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1919:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getDataTypeEntityCrossReference_4_0()); 
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1920:1: ( RULE_ID )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1921:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getDataTypeEntityIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__DataTypeAssignment_43774); 
             after(grammarAccess.getParameterAccess().getDataTypeEntityIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getDataTypeEntityCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__DataTypeAssignment_4"


    // $ANTLR start "rule__NamespaceDeclaration__NameAssignment_1"
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1932:1: rule__NamespaceDeclaration__NameAssignment_1 : ( ruleQualifedName ) ;
    public final void rule__NamespaceDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1936:1: ( ( ruleQualifedName ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1937:1: ( ruleQualifedName )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1937:1: ( ruleQualifedName )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1938:1: ruleQualifedName
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNameQualifedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifedName_in_rule__NamespaceDeclaration__NameAssignment_13809);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1947:1: rule__ImportDeclaration__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__ImportDeclaration__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1951:1: ( ( ruleImport ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1952:1: ( ruleImport )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1952:1: ( ruleImport )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1953:1: ruleImport
            {
             before(grammarAccess.getImportDeclarationAccess().getImportsImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__ImportDeclaration__ImportsAssignment_13840);
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
    // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1962:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1966:1: ( ( ruleQualifedNameWithWildcard ) )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1967:1: ( ruleQualifedNameWithWildcard )
            {
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1967:1: ( ruleQualifedNameWithWildcard )
            // ../org.neclipse.xtext.functiondsl.ui/src-gen/org/neclipse/xtext/functiondsl/ui/contentassist/antlr/internal/InternalFunctionDsl.g:1968:1: ruleQualifedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_13871);
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleNamespaceDefinition_in_entryRuleNamespaceDefinition61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceDefinition68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__0_in_ruleNamespaceDefinition94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityAttribute_in_entryRuleEntityAttribute241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityAttribute248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityAttribute__Group__0_in_ruleEntityAttribute274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclaration_in_entryRuleNamespaceDeclaration361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceDeclaration368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__0_in_ruleNamespaceDeclaration394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclaration428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__Group__0_in_ruleImportDeclaration454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedName_in_entryRuleQualifedName541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifedName548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group__0_in_ruleQualifedName574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedNameWithWildcard_in_entryRuleQualifedNameWithWildcard601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifedNameWithWildcard608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedNameWithWildcard__Group__0_in_ruleQualifedNameWithWildcard634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__0__Impl_in_rule__NamespaceDefinition__Group__0670 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__1_in_rule__NamespaceDefinition__Group__0673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__NamespaceDeclarationAssignment_0_in_rule__NamespaceDefinition__Group__0__Impl700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__1__Impl_in_rule__NamespaceDefinition__Group__1730 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__2_in_rule__NamespaceDefinition__Group__1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__ImportDeclarationAssignment_1_in_rule__NamespaceDefinition__Group__1__Impl760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__2__Impl_in_rule__NamespaceDefinition__Group__2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__ArtifactAssignment_2_in_rule__NamespaceDefinition__Group__2__Impl817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__0853 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__0856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__1914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Function__Group__1__Impl945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__2976 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_2_in_rule__Function__Group__2__Impl1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__31036 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__31039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Function__Group__3__Impl1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__41098 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Function__Group__5_in_rule__Function__Group__41101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_4__0_in_rule__Function__Group__4__Impl1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__51159 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Function__Group__6_in_rule__Function__Group__51162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Function__Group__5__Impl1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__6__Impl_in_rule__Function__Group__61221 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Function__Group__7_in_rule__Function__Group__61224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Function__Group__6__Impl1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__7__Impl_in_rule__Function__Group__71283 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Function__Group__8_in_rule__Function__Group__71286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__VariableDeclarationAssignment_7_in_rule__Function__Group__7__Impl1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__8__Impl_in_rule__Function__Group__81343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Function__Group__8__Impl1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_4__0__Impl_in_rule__Function__Group_4__01420 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Function__Group_4__1_in_rule__Function__Group_4__01423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__ParametersAssignment_4_0_in_rule__Function__Group_4__0__Impl1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_4__1__Impl_in_rule__Function__Group_4__11480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_4_1__0_in_rule__Function__Group_4__1__Impl1507 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Function__Group_4_1__0__Impl_in_rule__Function__Group_4_1__01542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group_4_1__1_in_rule__Function__Group_4_1__01545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Function__Group_4_1__0__Impl1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_4_1__1__Impl_in_rule__Function__Group_4_1__11604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__ParametersAssignment_4_1_1_in_rule__Function__Group_4_1__1__Impl1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__01665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__01668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__VariableDeclaration__Group__0__Impl1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__11727 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__11730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__NameAssignment_1_in_rule__VariableDeclaration__Group__1__Impl1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__21787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__21790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__VariableDeclaration__Group__2__Impl1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__31849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__EntityAttributeAssignment_3_in_rule__VariableDeclaration__Group__3__Impl1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityAttribute__Group__0__Impl_in_rule__EntityAttribute__Group__01914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityAttribute__Group__1_in_rule__EntityAttribute__Group__01917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityAttribute__Group__1__Impl_in_rule__EntityAttribute__Group__11975 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EntityAttribute__Group__2_in_rule__EntityAttribute__Group__11978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityAttribute__EntityReferenceAssignment_1_in_rule__EntityAttribute__Group__1__Impl2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityAttribute__Group__2__Impl_in_rule__EntityAttribute__Group__22035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityAttribute__Group_2__0_in_rule__EntityAttribute__Group__2__Impl2062 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__EntityAttribute__Group_2__0__Impl_in_rule__EntityAttribute__Group_2__02099 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EntityAttribute__Group_2__1_in_rule__EntityAttribute__Group_2__02102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityAttribute__Group_2__1__Impl_in_rule__EntityAttribute__Group_2__12160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityAttribute__Group_2__2_in_rule__EntityAttribute__Group_2__12163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EntityAttribute__Group_2__1__Impl2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityAttribute__Group_2__2__Impl_in_rule__EntityAttribute__Group_2__22222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityAttribute__AttributeAssignment_2_2_in_rule__EntityAttribute__Group_2__2__Impl2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__02285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__12346 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__12349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__22406 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__22409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ArrayAssignment_2_in_rule__Parameter__Group__2__Impl2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__32467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__4_in_rule__Parameter__Group__32470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Parameter__Group__3__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__4__Impl_in_rule__Parameter__Group__42529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__DataTypeAssignment_4_in_rule__Parameter__Group__4__Impl2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__0__Impl_in_rule__NamespaceDeclaration__Group__02596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__1_in_rule__NamespaceDeclaration__Group__02599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__NamespaceDeclaration__Group__0__Impl2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__1__Impl_in_rule__NamespaceDeclaration__Group__12658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__NameAssignment_1_in_rule__NamespaceDeclaration__Group__1__Impl2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__Group__0__Impl_in_rule__ImportDeclaration__Group__02719 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__Group__1_in_rule__ImportDeclaration__Group__02722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__Group__1__Impl_in_rule__ImportDeclaration__Group__12780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__ImportsAssignment_1_in_rule__ImportDeclaration__Group__1__Impl2807 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Import__Group__0__Impl2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group__0__Impl_in_rule__QualifedName__Group__02965 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__QualifedName__Group__1_in_rule__QualifedName__Group__02968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifedName__Group__0__Impl2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group__1__Impl_in_rule__QualifedName__Group__13024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group_1__0_in_rule__QualifedName__Group__1__Impl3051 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group_1__0__Impl_in_rule__QualifedName__Group_1__03086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifedName__Group_1__1_in_rule__QualifedName__Group_1__03089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QualifedName__Group_1__0__Impl3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group_1__1__Impl_in_rule__QualifedName__Group_1__13148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifedName__Group_1__1__Impl3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedNameWithWildcard__Group__0__Impl_in_rule__QualifedNameWithWildcard__Group__03208 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__QualifedNameWithWildcard__Group__1_in_rule__QualifedNameWithWildcard__Group__03211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedName_in_rule__QualifedNameWithWildcard__Group__0__Impl3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedNameWithWildcard__Group__1__Impl_in_rule__QualifedNameWithWildcard__Group__13267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__QualifedNameWithWildcard__Group__1__Impl3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclaration_in_rule__NamespaceDefinition__NamespaceDeclarationAssignment_03338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_rule__NamespaceDefinition__ImportDeclarationAssignment_13369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__NamespaceDefinition__ArtifactAssignment_23400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__NameAssignment_23431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Function__ParametersAssignment_4_03462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Function__ParametersAssignment_4_1_13493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__Function__VariableDeclarationAssignment_73524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_13555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityAttribute_in_rule__VariableDeclaration__EntityAttributeAssignment_33586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityAttribute__EntityReferenceAssignment_13621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityAttribute__AttributeAssignment_2_23660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_13695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Parameter__ArrayAssignment_23731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__DataTypeAssignment_43774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedName_in_rule__NamespaceDeclaration__NameAssignment_13809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__ImportDeclaration__ImportsAssignment_13840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_13871 = new BitSet(new long[]{0x0000000000000002L});

}