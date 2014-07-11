package org.neclipse.xtext.entitydsl.ui.contentassist.antlr.internal; 

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
import org.neclipse.xtext.entitydsl.services.EntityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntityDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Entity'", "'{'", "'}'", "':'", "'('", "'length'", "'='", "')'", "','", "'default-value'", "'namespace'", "'import'", "'.'", "'.*'", "'string'"
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


        public InternalEntityDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEntityDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEntityDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g"; }


     
     	private EntityDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EntityDslGrammarAccess grammarAccess) {
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:60:1: entryRuleNamespaceDefinition : ruleNamespaceDefinition EOF ;
    public final void entryRuleNamespaceDefinition() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:61:1: ( ruleNamespaceDefinition EOF )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:62:1: ruleNamespaceDefinition EOF
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:69:1: ruleNamespaceDefinition : ( ( rule__NamespaceDefinition__Group__0 ) ) ;
    public final void ruleNamespaceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:73:2: ( ( ( rule__NamespaceDefinition__Group__0 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:74:1: ( ( rule__NamespaceDefinition__Group__0 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:74:1: ( ( rule__NamespaceDefinition__Group__0 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:75:1: ( rule__NamespaceDefinition__Group__0 )
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getGroup()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:76:1: ( rule__NamespaceDefinition__Group__0 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:76:2: rule__NamespaceDefinition__Group__0
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


    // $ANTLR start "entryRuleEntity"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:88:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:89:1: ( ruleEntity EOF )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:90:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity121);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity128); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:97:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:101:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:102:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:102:1: ( ( rule__Entity__Group__0 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:103:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:104:1: ( rule__Entity__Group__0 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:104:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity154);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:116:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:117:1: ( ruleAttribute EOF )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:118:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute181);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute188); 

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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:125:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:129:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:130:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:130:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:131:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:132:1: ( rule__Attribute__Group__0 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:132:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute214);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:144:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:145:1: ( ruleDataType EOF )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:146:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType241);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType248); 

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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:153:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:157:2: ( ( ( rule__DataType__Alternatives ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:158:1: ( ( rule__DataType__Alternatives ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:158:1: ( ( rule__DataType__Alternatives ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:159:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:160:1: ( rule__DataType__Alternatives )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:160:2: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_rule__DataType__Alternatives_in_ruleDataType274);
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


    // $ANTLR start "entryRuleEntityReference"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:172:1: entryRuleEntityReference : ruleEntityReference EOF ;
    public final void entryRuleEntityReference() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:173:1: ( ruleEntityReference EOF )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:174:1: ruleEntityReference EOF
            {
             before(grammarAccess.getEntityReferenceRule()); 
            pushFollow(FOLLOW_ruleEntityReference_in_entryRuleEntityReference301);
            ruleEntityReference();

            state._fsp--;

             after(grammarAccess.getEntityReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityReference308); 

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
    // $ANTLR end "entryRuleEntityReference"


    // $ANTLR start "ruleEntityReference"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:181:1: ruleEntityReference : ( ( rule__EntityReference__Group__0 ) ) ;
    public final void ruleEntityReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:185:2: ( ( ( rule__EntityReference__Group__0 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:186:1: ( ( rule__EntityReference__Group__0 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:186:1: ( ( rule__EntityReference__Group__0 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:187:1: ( rule__EntityReference__Group__0 )
            {
             before(grammarAccess.getEntityReferenceAccess().getGroup()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:188:1: ( rule__EntityReference__Group__0 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:188:2: rule__EntityReference__Group__0
            {
            pushFollow(FOLLOW_rule__EntityReference__Group__0_in_ruleEntityReference334);
            rule__EntityReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityReference"


    // $ANTLR start "entryRuleStringType"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:200:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:201:1: ( ruleStringType EOF )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:202:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType361);
            ruleStringType();

            state._fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType368); 

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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:209:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:213:2: ( ( ( rule__StringType__Group__0 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:214:1: ( ( rule__StringType__Group__0 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:214:1: ( ( rule__StringType__Group__0 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:215:1: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:216:1: ( rule__StringType__Group__0 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:216:2: rule__StringType__Group__0
            {
            pushFollow(FOLLOW_rule__StringType__Group__0_in_ruleStringType394);
            rule__StringType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleNamespaceDeclaration"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:228:1: entryRuleNamespaceDeclaration : ruleNamespaceDeclaration EOF ;
    public final void entryRuleNamespaceDeclaration() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:229:1: ( ruleNamespaceDeclaration EOF )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:230:1: ruleNamespaceDeclaration EOF
            {
             before(grammarAccess.getNamespaceDeclarationRule()); 
            pushFollow(FOLLOW_ruleNamespaceDeclaration_in_entryRuleNamespaceDeclaration421);
            ruleNamespaceDeclaration();

            state._fsp--;

             after(grammarAccess.getNamespaceDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceDeclaration428); 

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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:237:1: ruleNamespaceDeclaration : ( ( rule__NamespaceDeclaration__Group__0 ) ) ;
    public final void ruleNamespaceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:241:2: ( ( ( rule__NamespaceDeclaration__Group__0 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:242:1: ( ( rule__NamespaceDeclaration__Group__0 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:242:1: ( ( rule__NamespaceDeclaration__Group__0 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:243:1: ( rule__NamespaceDeclaration__Group__0 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getGroup()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:244:1: ( rule__NamespaceDeclaration__Group__0 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:244:2: rule__NamespaceDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__0_in_ruleNamespaceDeclaration454);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:256:1: entryRuleImportDeclaration : ruleImportDeclaration EOF ;
    public final void entryRuleImportDeclaration() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:257:1: ( ruleImportDeclaration EOF )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:258:1: ruleImportDeclaration EOF
            {
             before(grammarAccess.getImportDeclarationRule()); 
            pushFollow(FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration481);
            ruleImportDeclaration();

            state._fsp--;

             after(grammarAccess.getImportDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDeclaration488); 

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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:265:1: ruleImportDeclaration : ( ( rule__ImportDeclaration__Group__0 ) ) ;
    public final void ruleImportDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:269:2: ( ( ( rule__ImportDeclaration__Group__0 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:270:1: ( ( rule__ImportDeclaration__Group__0 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:270:1: ( ( rule__ImportDeclaration__Group__0 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:271:1: ( rule__ImportDeclaration__Group__0 )
            {
             before(grammarAccess.getImportDeclarationAccess().getGroup()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:272:1: ( rule__ImportDeclaration__Group__0 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:272:2: rule__ImportDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ImportDeclaration__Group__0_in_ruleImportDeclaration514);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:284:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:285:1: ( ruleImport EOF )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:286:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport541);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport548); 

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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:293:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:297:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:298:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:298:1: ( ( rule__Import__Group__0 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:299:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:300:1: ( rule__Import__Group__0 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:300:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport574);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:312:1: entryRuleQualifedName : ruleQualifedName EOF ;
    public final void entryRuleQualifedName() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:313:1: ( ruleQualifedName EOF )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:314:1: ruleQualifedName EOF
            {
             before(grammarAccess.getQualifedNameRule()); 
            pushFollow(FOLLOW_ruleQualifedName_in_entryRuleQualifedName601);
            ruleQualifedName();

            state._fsp--;

             after(grammarAccess.getQualifedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifedName608); 

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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:321:1: ruleQualifedName : ( ( rule__QualifedName__Group__0 ) ) ;
    public final void ruleQualifedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:325:2: ( ( ( rule__QualifedName__Group__0 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:326:1: ( ( rule__QualifedName__Group__0 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:326:1: ( ( rule__QualifedName__Group__0 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:327:1: ( rule__QualifedName__Group__0 )
            {
             before(grammarAccess.getQualifedNameAccess().getGroup()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:328:1: ( rule__QualifedName__Group__0 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:328:2: rule__QualifedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifedName__Group__0_in_ruleQualifedName634);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:340:1: entryRuleQualifedNameWithWildcard : ruleQualifedNameWithWildcard EOF ;
    public final void entryRuleQualifedNameWithWildcard() throws RecognitionException {
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:341:1: ( ruleQualifedNameWithWildcard EOF )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:342:1: ruleQualifedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifedNameWithWildcard_in_entryRuleQualifedNameWithWildcard661);
            ruleQualifedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifedNameWithWildcard668); 

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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:349:1: ruleQualifedNameWithWildcard : ( ( rule__QualifedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:353:2: ( ( ( rule__QualifedNameWithWildcard__Group__0 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:354:1: ( ( rule__QualifedNameWithWildcard__Group__0 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:354:1: ( ( rule__QualifedNameWithWildcard__Group__0 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:355:1: ( rule__QualifedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifedNameWithWildcardAccess().getGroup()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:356:1: ( rule__QualifedNameWithWildcard__Group__0 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:356:2: rule__QualifedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifedNameWithWildcard__Group__0_in_ruleQualifedNameWithWildcard694);
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


    // $ANTLR start "rule__DataType__Alternatives"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:370:1: rule__DataType__Alternatives : ( ( ruleStringType ) | ( ruleEntityReference ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:374:1: ( ( ruleStringType ) | ( ruleEntityReference ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==25) ) {
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
                    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:375:1: ( ruleStringType )
                    {
                    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:375:1: ( ruleStringType )
                    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:376:1: ruleStringType
                    {
                     before(grammarAccess.getDataTypeAccess().getStringTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__DataType__Alternatives732);
                    ruleStringType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getStringTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:381:6: ( ruleEntityReference )
                    {
                    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:381:6: ( ruleEntityReference )
                    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:382:1: ruleEntityReference
                    {
                     before(grammarAccess.getDataTypeAccess().getEntityReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntityReference_in_rule__DataType__Alternatives749);
                    ruleEntityReference();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getEntityReferenceParserRuleCall_1()); 

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


    // $ANTLR start "rule__NamespaceDefinition__Group__0"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:394:1: rule__NamespaceDefinition__Group__0 : rule__NamespaceDefinition__Group__0__Impl rule__NamespaceDefinition__Group__1 ;
    public final void rule__NamespaceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:398:1: ( rule__NamespaceDefinition__Group__0__Impl rule__NamespaceDefinition__Group__1 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:399:2: rule__NamespaceDefinition__Group__0__Impl rule__NamespaceDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__Group__0__Impl_in_rule__NamespaceDefinition__Group__0779);
            rule__NamespaceDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDefinition__Group__1_in_rule__NamespaceDefinition__Group__0782);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:406:1: rule__NamespaceDefinition__Group__0__Impl : ( ( rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 ) ) ;
    public final void rule__NamespaceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:410:1: ( ( ( rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:411:1: ( ( rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:411:1: ( ( rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:412:1: ( rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 )
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getNamespaceDeclarationAssignment_0()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:413:1: ( rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:413:2: rule__NamespaceDefinition__NamespaceDeclarationAssignment_0
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__NamespaceDeclarationAssignment_0_in_rule__NamespaceDefinition__Group__0__Impl809);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:423:1: rule__NamespaceDefinition__Group__1 : rule__NamespaceDefinition__Group__1__Impl rule__NamespaceDefinition__Group__2 ;
    public final void rule__NamespaceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:427:1: ( rule__NamespaceDefinition__Group__1__Impl rule__NamespaceDefinition__Group__2 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:428:2: rule__NamespaceDefinition__Group__1__Impl rule__NamespaceDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__Group__1__Impl_in_rule__NamespaceDefinition__Group__1839);
            rule__NamespaceDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDefinition__Group__2_in_rule__NamespaceDefinition__Group__1842);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:435:1: rule__NamespaceDefinition__Group__1__Impl : ( ( rule__NamespaceDefinition__ImportDeclarationAssignment_1 ) ) ;
    public final void rule__NamespaceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:439:1: ( ( ( rule__NamespaceDefinition__ImportDeclarationAssignment_1 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:440:1: ( ( rule__NamespaceDefinition__ImportDeclarationAssignment_1 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:440:1: ( ( rule__NamespaceDefinition__ImportDeclarationAssignment_1 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:441:1: ( rule__NamespaceDefinition__ImportDeclarationAssignment_1 )
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getImportDeclarationAssignment_1()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:442:1: ( rule__NamespaceDefinition__ImportDeclarationAssignment_1 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:442:2: rule__NamespaceDefinition__ImportDeclarationAssignment_1
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__ImportDeclarationAssignment_1_in_rule__NamespaceDefinition__Group__1__Impl869);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:452:1: rule__NamespaceDefinition__Group__2 : rule__NamespaceDefinition__Group__2__Impl ;
    public final void rule__NamespaceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:456:1: ( rule__NamespaceDefinition__Group__2__Impl )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:457:2: rule__NamespaceDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__Group__2__Impl_in_rule__NamespaceDefinition__Group__2899);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:463:1: rule__NamespaceDefinition__Group__2__Impl : ( ( rule__NamespaceDefinition__ArtifactAssignment_2 ) ) ;
    public final void rule__NamespaceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:467:1: ( ( ( rule__NamespaceDefinition__ArtifactAssignment_2 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:468:1: ( ( rule__NamespaceDefinition__ArtifactAssignment_2 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:468:1: ( ( rule__NamespaceDefinition__ArtifactAssignment_2 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:469:1: ( rule__NamespaceDefinition__ArtifactAssignment_2 )
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getArtifactAssignment_2()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:470:1: ( rule__NamespaceDefinition__ArtifactAssignment_2 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:470:2: rule__NamespaceDefinition__ArtifactAssignment_2
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__ArtifactAssignment_2_in_rule__NamespaceDefinition__Group__2__Impl926);
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


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:486:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:490:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:491:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0962);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0965);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:498:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:502:1: ( ( () ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:503:1: ( () )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:503:1: ( () )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:504:1: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:505:1: ()
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:507:1: 
            {
            }

             after(grammarAccess.getEntityAccess().getEntityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:517:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:521:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:522:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11023);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11026);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:529:1: rule__Entity__Group__1__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:533:1: ( ( 'Entity' ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:534:1: ( 'Entity' )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:534:1: ( 'Entity' )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:535:1: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__Entity__Group__1__Impl1054); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:548:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:552:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:553:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21085);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21088);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:560:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:564:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:565:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:565:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:566:1: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:567:1: ( rule__Entity__NameAssignment_2 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:567:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl1115);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:577:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:581:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:582:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31145);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31148);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:589:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:593:1: ( ( '{' ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:594:1: ( '{' )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:594:1: ( '{' )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:595:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Entity__Group__3__Impl1176); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:608:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:612:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:613:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41207);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41210);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:620:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__AttributesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:624:1: ( ( ( rule__Entity__AttributesAssignment_4 )* ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:625:1: ( ( rule__Entity__AttributesAssignment_4 )* )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:625:1: ( ( rule__Entity__AttributesAssignment_4 )* )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:626:1: ( rule__Entity__AttributesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:627:1: ( rule__Entity__AttributesAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:627:2: rule__Entity__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AttributesAssignment_4_in_rule__Entity__Group__4__Impl1237);
            	    rule__Entity__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:637:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:641:1: ( rule__Entity__Group__5__Impl )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:642:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51268);
            rule__Entity__Group__5__Impl();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:648:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:652:1: ( ( '}' ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:653:1: ( '}' )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:653:1: ( '}' )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:654:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__Entity__Group__5__Impl1296); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:679:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:683:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:684:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01339);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01342);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:691:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:695:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:696:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:696:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:697:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:698:1: ( rule__Attribute__NameAssignment_0 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:698:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl1369);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:708:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:712:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:713:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11399);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11402);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:720:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:724:1: ( ( ':' ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:725:1: ( ':' )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:725:1: ( ':' )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:726:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Attribute__Group__1__Impl1430); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:739:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:743:1: ( rule__Attribute__Group__2__Impl )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:744:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21461);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:750:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:754:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:755:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:755:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:756:1: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:757:1: ( rule__Attribute__TypeAssignment_2 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:757:2: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl1488);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__EntityReference__Group__0"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:773:1: rule__EntityReference__Group__0 : rule__EntityReference__Group__0__Impl rule__EntityReference__Group__1 ;
    public final void rule__EntityReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:777:1: ( rule__EntityReference__Group__0__Impl rule__EntityReference__Group__1 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:778:2: rule__EntityReference__Group__0__Impl rule__EntityReference__Group__1
            {
            pushFollow(FOLLOW_rule__EntityReference__Group__0__Impl_in_rule__EntityReference__Group__01524);
            rule__EntityReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group__1_in_rule__EntityReference__Group__01527);
            rule__EntityReference__Group__1();

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
    // $ANTLR end "rule__EntityReference__Group__0"


    // $ANTLR start "rule__EntityReference__Group__0__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:785:1: rule__EntityReference__Group__0__Impl : ( () ) ;
    public final void rule__EntityReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:789:1: ( ( () ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:790:1: ( () )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:790:1: ( () )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:791:1: ()
            {
             before(grammarAccess.getEntityReferenceAccess().getEntityReferenceAction_0()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:792:1: ()
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:794:1: 
            {
            }

             after(grammarAccess.getEntityReferenceAccess().getEntityReferenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group__0__Impl"


    // $ANTLR start "rule__EntityReference__Group__1"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:804:1: rule__EntityReference__Group__1 : rule__EntityReference__Group__1__Impl ;
    public final void rule__EntityReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:808:1: ( rule__EntityReference__Group__1__Impl )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:809:2: rule__EntityReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EntityReference__Group__1__Impl_in_rule__EntityReference__Group__11585);
            rule__EntityReference__Group__1__Impl();

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
    // $ANTLR end "rule__EntityReference__Group__1"


    // $ANTLR start "rule__EntityReference__Group__1__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:815:1: rule__EntityReference__Group__1__Impl : ( ( rule__EntityReference__EntityAssignment_1 ) ) ;
    public final void rule__EntityReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:819:1: ( ( ( rule__EntityReference__EntityAssignment_1 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:820:1: ( ( rule__EntityReference__EntityAssignment_1 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:820:1: ( ( rule__EntityReference__EntityAssignment_1 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:821:1: ( rule__EntityReference__EntityAssignment_1 )
            {
             before(grammarAccess.getEntityReferenceAccess().getEntityAssignment_1()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:822:1: ( rule__EntityReference__EntityAssignment_1 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:822:2: rule__EntityReference__EntityAssignment_1
            {
            pushFollow(FOLLOW_rule__EntityReference__EntityAssignment_1_in_rule__EntityReference__Group__1__Impl1612);
            rule__EntityReference__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityReferenceAccess().getEntityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group__1__Impl"


    // $ANTLR start "rule__StringType__Group__0"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:836:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:840:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:841:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_rule__StringType__Group__0__Impl_in_rule__StringType__Group__01646);
            rule__StringType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__01649);
            rule__StringType__Group__1();

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
    // $ANTLR end "rule__StringType__Group__0"


    // $ANTLR start "rule__StringType__Group__0__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:848:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:852:1: ( ( () ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:853:1: ( () )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:853:1: ( () )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:854:1: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:855:1: ()
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:857:1: 
            {
            }

             after(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__0__Impl"


    // $ANTLR start "rule__StringType__Group__1"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:867:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl rule__StringType__Group__2 ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:871:1: ( rule__StringType__Group__1__Impl rule__StringType__Group__2 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:872:2: rule__StringType__Group__1__Impl rule__StringType__Group__2
            {
            pushFollow(FOLLOW_rule__StringType__Group__1__Impl_in_rule__StringType__Group__11707);
            rule__StringType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringType__Group__2_in_rule__StringType__Group__11710);
            rule__StringType__Group__2();

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
    // $ANTLR end "rule__StringType__Group__1"


    // $ANTLR start "rule__StringType__Group__1__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:879:1: rule__StringType__Group__1__Impl : ( ( rule__StringType__NameAssignment_1 ) ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:883:1: ( ( ( rule__StringType__NameAssignment_1 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:884:1: ( ( rule__StringType__NameAssignment_1 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:884:1: ( ( rule__StringType__NameAssignment_1 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:885:1: ( rule__StringType__NameAssignment_1 )
            {
             before(grammarAccess.getStringTypeAccess().getNameAssignment_1()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:886:1: ( rule__StringType__NameAssignment_1 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:886:2: rule__StringType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StringType__NameAssignment_1_in_rule__StringType__Group__1__Impl1737);
            rule__StringType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__1__Impl"


    // $ANTLR start "rule__StringType__Group__2"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:896:1: rule__StringType__Group__2 : rule__StringType__Group__2__Impl ;
    public final void rule__StringType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:900:1: ( rule__StringType__Group__2__Impl )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:901:2: rule__StringType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StringType__Group__2__Impl_in_rule__StringType__Group__21767);
            rule__StringType__Group__2__Impl();

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
    // $ANTLR end "rule__StringType__Group__2"


    // $ANTLR start "rule__StringType__Group__2__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:907:1: rule__StringType__Group__2__Impl : ( ( rule__StringType__Group_2__0 )? ) ;
    public final void rule__StringType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:911:1: ( ( ( rule__StringType__Group_2__0 )? ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:912:1: ( ( rule__StringType__Group_2__0 )? )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:912:1: ( ( rule__StringType__Group_2__0 )? )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:913:1: ( rule__StringType__Group_2__0 )?
            {
             before(grammarAccess.getStringTypeAccess().getGroup_2()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:914:1: ( rule__StringType__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:914:2: rule__StringType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StringType__Group_2__0_in_rule__StringType__Group__2__Impl1794);
                    rule__StringType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__2__Impl"


    // $ANTLR start "rule__StringType__Group_2__0"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:930:1: rule__StringType__Group_2__0 : rule__StringType__Group_2__0__Impl rule__StringType__Group_2__1 ;
    public final void rule__StringType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:934:1: ( rule__StringType__Group_2__0__Impl rule__StringType__Group_2__1 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:935:2: rule__StringType__Group_2__0__Impl rule__StringType__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringType__Group_2__0__Impl_in_rule__StringType__Group_2__01831);
            rule__StringType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringType__Group_2__1_in_rule__StringType__Group_2__01834);
            rule__StringType__Group_2__1();

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
    // $ANTLR end "rule__StringType__Group_2__0"


    // $ANTLR start "rule__StringType__Group_2__0__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:942:1: rule__StringType__Group_2__0__Impl : ( '(' ) ;
    public final void rule__StringType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:946:1: ( ( '(' ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:947:1: ( '(' )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:947:1: ( '(' )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:948:1: '('
            {
             before(grammarAccess.getStringTypeAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,15,FOLLOW_15_in_rule__StringType__Group_2__0__Impl1862); 
             after(grammarAccess.getStringTypeAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_2__0__Impl"


    // $ANTLR start "rule__StringType__Group_2__1"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:961:1: rule__StringType__Group_2__1 : rule__StringType__Group_2__1__Impl rule__StringType__Group_2__2 ;
    public final void rule__StringType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:965:1: ( rule__StringType__Group_2__1__Impl rule__StringType__Group_2__2 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:966:2: rule__StringType__Group_2__1__Impl rule__StringType__Group_2__2
            {
            pushFollow(FOLLOW_rule__StringType__Group_2__1__Impl_in_rule__StringType__Group_2__11893);
            rule__StringType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringType__Group_2__2_in_rule__StringType__Group_2__11896);
            rule__StringType__Group_2__2();

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
    // $ANTLR end "rule__StringType__Group_2__1"


    // $ANTLR start "rule__StringType__Group_2__1__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:973:1: rule__StringType__Group_2__1__Impl : ( 'length' ) ;
    public final void rule__StringType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:977:1: ( ( 'length' ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:978:1: ( 'length' )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:978:1: ( 'length' )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:979:1: 'length'
            {
             before(grammarAccess.getStringTypeAccess().getLengthKeyword_2_1()); 
            match(input,16,FOLLOW_16_in_rule__StringType__Group_2__1__Impl1924); 
             after(grammarAccess.getStringTypeAccess().getLengthKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_2__1__Impl"


    // $ANTLR start "rule__StringType__Group_2__2"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:992:1: rule__StringType__Group_2__2 : rule__StringType__Group_2__2__Impl rule__StringType__Group_2__3 ;
    public final void rule__StringType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:996:1: ( rule__StringType__Group_2__2__Impl rule__StringType__Group_2__3 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:997:2: rule__StringType__Group_2__2__Impl rule__StringType__Group_2__3
            {
            pushFollow(FOLLOW_rule__StringType__Group_2__2__Impl_in_rule__StringType__Group_2__21955);
            rule__StringType__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringType__Group_2__3_in_rule__StringType__Group_2__21958);
            rule__StringType__Group_2__3();

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
    // $ANTLR end "rule__StringType__Group_2__2"


    // $ANTLR start "rule__StringType__Group_2__2__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1004:1: rule__StringType__Group_2__2__Impl : ( '=' ) ;
    public final void rule__StringType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1008:1: ( ( '=' ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1009:1: ( '=' )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1009:1: ( '=' )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1010:1: '='
            {
             before(grammarAccess.getStringTypeAccess().getEqualsSignKeyword_2_2()); 
            match(input,17,FOLLOW_17_in_rule__StringType__Group_2__2__Impl1986); 
             after(grammarAccess.getStringTypeAccess().getEqualsSignKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_2__2__Impl"


    // $ANTLR start "rule__StringType__Group_2__3"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1023:1: rule__StringType__Group_2__3 : rule__StringType__Group_2__3__Impl rule__StringType__Group_2__4 ;
    public final void rule__StringType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1027:1: ( rule__StringType__Group_2__3__Impl rule__StringType__Group_2__4 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1028:2: rule__StringType__Group_2__3__Impl rule__StringType__Group_2__4
            {
            pushFollow(FOLLOW_rule__StringType__Group_2__3__Impl_in_rule__StringType__Group_2__32017);
            rule__StringType__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringType__Group_2__4_in_rule__StringType__Group_2__32020);
            rule__StringType__Group_2__4();

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
    // $ANTLR end "rule__StringType__Group_2__3"


    // $ANTLR start "rule__StringType__Group_2__3__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1035:1: rule__StringType__Group_2__3__Impl : ( ( rule__StringType__LengthAssignment_2_3 ) ) ;
    public final void rule__StringType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1039:1: ( ( ( rule__StringType__LengthAssignment_2_3 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1040:1: ( ( rule__StringType__LengthAssignment_2_3 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1040:1: ( ( rule__StringType__LengthAssignment_2_3 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1041:1: ( rule__StringType__LengthAssignment_2_3 )
            {
             before(grammarAccess.getStringTypeAccess().getLengthAssignment_2_3()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1042:1: ( rule__StringType__LengthAssignment_2_3 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1042:2: rule__StringType__LengthAssignment_2_3
            {
            pushFollow(FOLLOW_rule__StringType__LengthAssignment_2_3_in_rule__StringType__Group_2__3__Impl2047);
            rule__StringType__LengthAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getLengthAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_2__3__Impl"


    // $ANTLR start "rule__StringType__Group_2__4"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1052:1: rule__StringType__Group_2__4 : rule__StringType__Group_2__4__Impl rule__StringType__Group_2__5 ;
    public final void rule__StringType__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1056:1: ( rule__StringType__Group_2__4__Impl rule__StringType__Group_2__5 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1057:2: rule__StringType__Group_2__4__Impl rule__StringType__Group_2__5
            {
            pushFollow(FOLLOW_rule__StringType__Group_2__4__Impl_in_rule__StringType__Group_2__42077);
            rule__StringType__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringType__Group_2__5_in_rule__StringType__Group_2__42080);
            rule__StringType__Group_2__5();

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
    // $ANTLR end "rule__StringType__Group_2__4"


    // $ANTLR start "rule__StringType__Group_2__4__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1064:1: rule__StringType__Group_2__4__Impl : ( ( rule__StringType__Group_2_4__0 )? ) ;
    public final void rule__StringType__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1068:1: ( ( ( rule__StringType__Group_2_4__0 )? ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1069:1: ( ( rule__StringType__Group_2_4__0 )? )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1069:1: ( ( rule__StringType__Group_2_4__0 )? )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1070:1: ( rule__StringType__Group_2_4__0 )?
            {
             before(grammarAccess.getStringTypeAccess().getGroup_2_4()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1071:1: ( rule__StringType__Group_2_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1071:2: rule__StringType__Group_2_4__0
                    {
                    pushFollow(FOLLOW_rule__StringType__Group_2_4__0_in_rule__StringType__Group_2__4__Impl2107);
                    rule__StringType__Group_2_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringTypeAccess().getGroup_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_2__4__Impl"


    // $ANTLR start "rule__StringType__Group_2__5"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1081:1: rule__StringType__Group_2__5 : rule__StringType__Group_2__5__Impl ;
    public final void rule__StringType__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1085:1: ( rule__StringType__Group_2__5__Impl )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1086:2: rule__StringType__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__StringType__Group_2__5__Impl_in_rule__StringType__Group_2__52138);
            rule__StringType__Group_2__5__Impl();

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
    // $ANTLR end "rule__StringType__Group_2__5"


    // $ANTLR start "rule__StringType__Group_2__5__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1092:1: rule__StringType__Group_2__5__Impl : ( ')' ) ;
    public final void rule__StringType__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1096:1: ( ( ')' ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1097:1: ( ')' )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1097:1: ( ')' )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1098:1: ')'
            {
             before(grammarAccess.getStringTypeAccess().getRightParenthesisKeyword_2_5()); 
            match(input,18,FOLLOW_18_in_rule__StringType__Group_2__5__Impl2166); 
             after(grammarAccess.getStringTypeAccess().getRightParenthesisKeyword_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_2__5__Impl"


    // $ANTLR start "rule__StringType__Group_2_4__0"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1123:1: rule__StringType__Group_2_4__0 : rule__StringType__Group_2_4__0__Impl rule__StringType__Group_2_4__1 ;
    public final void rule__StringType__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1127:1: ( rule__StringType__Group_2_4__0__Impl rule__StringType__Group_2_4__1 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1128:2: rule__StringType__Group_2_4__0__Impl rule__StringType__Group_2_4__1
            {
            pushFollow(FOLLOW_rule__StringType__Group_2_4__0__Impl_in_rule__StringType__Group_2_4__02209);
            rule__StringType__Group_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringType__Group_2_4__1_in_rule__StringType__Group_2_4__02212);
            rule__StringType__Group_2_4__1();

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
    // $ANTLR end "rule__StringType__Group_2_4__0"


    // $ANTLR start "rule__StringType__Group_2_4__0__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1135:1: rule__StringType__Group_2_4__0__Impl : ( ',' ) ;
    public final void rule__StringType__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1139:1: ( ( ',' ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1140:1: ( ',' )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1140:1: ( ',' )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1141:1: ','
            {
             before(grammarAccess.getStringTypeAccess().getCommaKeyword_2_4_0()); 
            match(input,19,FOLLOW_19_in_rule__StringType__Group_2_4__0__Impl2240); 
             after(grammarAccess.getStringTypeAccess().getCommaKeyword_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_2_4__0__Impl"


    // $ANTLR start "rule__StringType__Group_2_4__1"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1154:1: rule__StringType__Group_2_4__1 : rule__StringType__Group_2_4__1__Impl rule__StringType__Group_2_4__2 ;
    public final void rule__StringType__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1158:1: ( rule__StringType__Group_2_4__1__Impl rule__StringType__Group_2_4__2 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1159:2: rule__StringType__Group_2_4__1__Impl rule__StringType__Group_2_4__2
            {
            pushFollow(FOLLOW_rule__StringType__Group_2_4__1__Impl_in_rule__StringType__Group_2_4__12271);
            rule__StringType__Group_2_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringType__Group_2_4__2_in_rule__StringType__Group_2_4__12274);
            rule__StringType__Group_2_4__2();

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
    // $ANTLR end "rule__StringType__Group_2_4__1"


    // $ANTLR start "rule__StringType__Group_2_4__1__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1166:1: rule__StringType__Group_2_4__1__Impl : ( 'default-value' ) ;
    public final void rule__StringType__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1170:1: ( ( 'default-value' ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1171:1: ( 'default-value' )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1171:1: ( 'default-value' )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1172:1: 'default-value'
            {
             before(grammarAccess.getStringTypeAccess().getDefaultValueKeyword_2_4_1()); 
            match(input,20,FOLLOW_20_in_rule__StringType__Group_2_4__1__Impl2302); 
             after(grammarAccess.getStringTypeAccess().getDefaultValueKeyword_2_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_2_4__1__Impl"


    // $ANTLR start "rule__StringType__Group_2_4__2"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1185:1: rule__StringType__Group_2_4__2 : rule__StringType__Group_2_4__2__Impl rule__StringType__Group_2_4__3 ;
    public final void rule__StringType__Group_2_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1189:1: ( rule__StringType__Group_2_4__2__Impl rule__StringType__Group_2_4__3 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1190:2: rule__StringType__Group_2_4__2__Impl rule__StringType__Group_2_4__3
            {
            pushFollow(FOLLOW_rule__StringType__Group_2_4__2__Impl_in_rule__StringType__Group_2_4__22333);
            rule__StringType__Group_2_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringType__Group_2_4__3_in_rule__StringType__Group_2_4__22336);
            rule__StringType__Group_2_4__3();

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
    // $ANTLR end "rule__StringType__Group_2_4__2"


    // $ANTLR start "rule__StringType__Group_2_4__2__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1197:1: rule__StringType__Group_2_4__2__Impl : ( '=' ) ;
    public final void rule__StringType__Group_2_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1201:1: ( ( '=' ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1202:1: ( '=' )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1202:1: ( '=' )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1203:1: '='
            {
             before(grammarAccess.getStringTypeAccess().getEqualsSignKeyword_2_4_2()); 
            match(input,17,FOLLOW_17_in_rule__StringType__Group_2_4__2__Impl2364); 
             after(grammarAccess.getStringTypeAccess().getEqualsSignKeyword_2_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_2_4__2__Impl"


    // $ANTLR start "rule__StringType__Group_2_4__3"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1216:1: rule__StringType__Group_2_4__3 : rule__StringType__Group_2_4__3__Impl ;
    public final void rule__StringType__Group_2_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1220:1: ( rule__StringType__Group_2_4__3__Impl )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1221:2: rule__StringType__Group_2_4__3__Impl
            {
            pushFollow(FOLLOW_rule__StringType__Group_2_4__3__Impl_in_rule__StringType__Group_2_4__32395);
            rule__StringType__Group_2_4__3__Impl();

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
    // $ANTLR end "rule__StringType__Group_2_4__3"


    // $ANTLR start "rule__StringType__Group_2_4__3__Impl"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1227:1: rule__StringType__Group_2_4__3__Impl : ( ( rule__StringType__DefaultValueAssignment_2_4_3 ) ) ;
    public final void rule__StringType__Group_2_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1231:1: ( ( ( rule__StringType__DefaultValueAssignment_2_4_3 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1232:1: ( ( rule__StringType__DefaultValueAssignment_2_4_3 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1232:1: ( ( rule__StringType__DefaultValueAssignment_2_4_3 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1233:1: ( rule__StringType__DefaultValueAssignment_2_4_3 )
            {
             before(grammarAccess.getStringTypeAccess().getDefaultValueAssignment_2_4_3()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1234:1: ( rule__StringType__DefaultValueAssignment_2_4_3 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1234:2: rule__StringType__DefaultValueAssignment_2_4_3
            {
            pushFollow(FOLLOW_rule__StringType__DefaultValueAssignment_2_4_3_in_rule__StringType__Group_2_4__3__Impl2422);
            rule__StringType__DefaultValueAssignment_2_4_3();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getDefaultValueAssignment_2_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_2_4__3__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group__0"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1252:1: rule__NamespaceDeclaration__Group__0 : rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1 ;
    public final void rule__NamespaceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1256:1: ( rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1257:2: rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__0__Impl_in_rule__NamespaceDeclaration__Group__02460);
            rule__NamespaceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__1_in_rule__NamespaceDeclaration__Group__02463);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1264:1: rule__NamespaceDeclaration__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__NamespaceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1268:1: ( ( 'namespace' ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1269:1: ( 'namespace' )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1269:1: ( 'namespace' )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1270:1: 'namespace'
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__NamespaceDeclaration__Group__0__Impl2491); 
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1283:1: rule__NamespaceDeclaration__Group__1 : rule__NamespaceDeclaration__Group__1__Impl ;
    public final void rule__NamespaceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1287:1: ( rule__NamespaceDeclaration__Group__1__Impl )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1288:2: rule__NamespaceDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__1__Impl_in_rule__NamespaceDeclaration__Group__12522);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1294:1: rule__NamespaceDeclaration__Group__1__Impl : ( ( rule__NamespaceDeclaration__NameAssignment_1 ) ) ;
    public final void rule__NamespaceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1298:1: ( ( ( rule__NamespaceDeclaration__NameAssignment_1 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1299:1: ( ( rule__NamespaceDeclaration__NameAssignment_1 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1299:1: ( ( rule__NamespaceDeclaration__NameAssignment_1 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1300:1: ( rule__NamespaceDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNameAssignment_1()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1301:1: ( rule__NamespaceDeclaration__NameAssignment_1 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1301:2: rule__NamespaceDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__NameAssignment_1_in_rule__NamespaceDeclaration__Group__1__Impl2549);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1315:1: rule__ImportDeclaration__Group__0 : rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1 ;
    public final void rule__ImportDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1319:1: ( rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1320:2: rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ImportDeclaration__Group__0__Impl_in_rule__ImportDeclaration__Group__02583);
            rule__ImportDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportDeclaration__Group__1_in_rule__ImportDeclaration__Group__02586);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1327:1: rule__ImportDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ImportDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1331:1: ( ( () ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1332:1: ( () )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1332:1: ( () )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1333:1: ()
            {
             before(grammarAccess.getImportDeclarationAccess().getImportDeclarationAction_0()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1334:1: ()
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1336:1: 
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1346:1: rule__ImportDeclaration__Group__1 : rule__ImportDeclaration__Group__1__Impl ;
    public final void rule__ImportDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1350:1: ( rule__ImportDeclaration__Group__1__Impl )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1351:2: rule__ImportDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportDeclaration__Group__1__Impl_in_rule__ImportDeclaration__Group__12644);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1357:1: rule__ImportDeclaration__Group__1__Impl : ( ( rule__ImportDeclaration__ImportsAssignment_1 )* ) ;
    public final void rule__ImportDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1361:1: ( ( ( rule__ImportDeclaration__ImportsAssignment_1 )* ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1362:1: ( ( rule__ImportDeclaration__ImportsAssignment_1 )* )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1362:1: ( ( rule__ImportDeclaration__ImportsAssignment_1 )* )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1363:1: ( rule__ImportDeclaration__ImportsAssignment_1 )*
            {
             before(grammarAccess.getImportDeclarationAccess().getImportsAssignment_1()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1364:1: ( rule__ImportDeclaration__ImportsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1364:2: rule__ImportDeclaration__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ImportDeclaration__ImportsAssignment_1_in_rule__ImportDeclaration__Group__1__Impl2671);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1378:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1382:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1383:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02706);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02709);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1390:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1394:1: ( ( 'import' ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1395:1: ( 'import' )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1395:1: ( 'import' )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1396:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Import__Group__0__Impl2737); 
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1409:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1413:1: ( rule__Import__Group__1__Impl )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1414:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12768);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1420:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1424:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1425:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1425:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1426:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1427:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1427:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2795);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1441:1: rule__QualifedName__Group__0 : rule__QualifedName__Group__0__Impl rule__QualifedName__Group__1 ;
    public final void rule__QualifedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1445:1: ( rule__QualifedName__Group__0__Impl rule__QualifedName__Group__1 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1446:2: rule__QualifedName__Group__0__Impl rule__QualifedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifedName__Group__0__Impl_in_rule__QualifedName__Group__02829);
            rule__QualifedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifedName__Group__1_in_rule__QualifedName__Group__02832);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1453:1: rule__QualifedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1457:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1458:1: ( RULE_ID )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1458:1: ( RULE_ID )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1459:1: RULE_ID
            {
             before(grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifedName__Group__0__Impl2859); 
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1470:1: rule__QualifedName__Group__1 : rule__QualifedName__Group__1__Impl ;
    public final void rule__QualifedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1474:1: ( rule__QualifedName__Group__1__Impl )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1475:2: rule__QualifedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifedName__Group__1__Impl_in_rule__QualifedName__Group__12888);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1481:1: rule__QualifedName__Group__1__Impl : ( ( rule__QualifedName__Group_1__0 )* ) ;
    public final void rule__QualifedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1485:1: ( ( ( rule__QualifedName__Group_1__0 )* ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1486:1: ( ( rule__QualifedName__Group_1__0 )* )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1486:1: ( ( rule__QualifedName__Group_1__0 )* )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1487:1: ( rule__QualifedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifedNameAccess().getGroup_1()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1488:1: ( rule__QualifedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1488:2: rule__QualifedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifedName__Group_1__0_in_rule__QualifedName__Group__1__Impl2915);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1502:1: rule__QualifedName__Group_1__0 : rule__QualifedName__Group_1__0__Impl rule__QualifedName__Group_1__1 ;
    public final void rule__QualifedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1506:1: ( rule__QualifedName__Group_1__0__Impl rule__QualifedName__Group_1__1 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1507:2: rule__QualifedName__Group_1__0__Impl rule__QualifedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifedName__Group_1__0__Impl_in_rule__QualifedName__Group_1__02950);
            rule__QualifedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifedName__Group_1__1_in_rule__QualifedName__Group_1__02953);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1514:1: rule__QualifedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1518:1: ( ( '.' ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1519:1: ( '.' )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1519:1: ( '.' )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1520:1: '.'
            {
             before(grammarAccess.getQualifedNameAccess().getFullStopKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__QualifedName__Group_1__0__Impl2981); 
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1533:1: rule__QualifedName__Group_1__1 : rule__QualifedName__Group_1__1__Impl ;
    public final void rule__QualifedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1537:1: ( rule__QualifedName__Group_1__1__Impl )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1538:2: rule__QualifedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifedName__Group_1__1__Impl_in_rule__QualifedName__Group_1__13012);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1544:1: rule__QualifedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1548:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1549:1: ( RULE_ID )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1549:1: ( RULE_ID )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1550:1: RULE_ID
            {
             before(grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifedName__Group_1__1__Impl3039); 
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1565:1: rule__QualifedNameWithWildcard__Group__0 : rule__QualifedNameWithWildcard__Group__0__Impl rule__QualifedNameWithWildcard__Group__1 ;
    public final void rule__QualifedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1569:1: ( rule__QualifedNameWithWildcard__Group__0__Impl rule__QualifedNameWithWildcard__Group__1 )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1570:2: rule__QualifedNameWithWildcard__Group__0__Impl rule__QualifedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifedNameWithWildcard__Group__0__Impl_in_rule__QualifedNameWithWildcard__Group__03072);
            rule__QualifedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifedNameWithWildcard__Group__1_in_rule__QualifedNameWithWildcard__Group__03075);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1577:1: rule__QualifedNameWithWildcard__Group__0__Impl : ( ruleQualifedName ) ;
    public final void rule__QualifedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1581:1: ( ( ruleQualifedName ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1582:1: ( ruleQualifedName )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1582:1: ( ruleQualifedName )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1583:1: ruleQualifedName
            {
             before(grammarAccess.getQualifedNameWithWildcardAccess().getQualifedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifedName_in_rule__QualifedNameWithWildcard__Group__0__Impl3102);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1594:1: rule__QualifedNameWithWildcard__Group__1 : rule__QualifedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1598:1: ( rule__QualifedNameWithWildcard__Group__1__Impl )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1599:2: rule__QualifedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifedNameWithWildcard__Group__1__Impl_in_rule__QualifedNameWithWildcard__Group__13131);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1605:1: rule__QualifedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1609:1: ( ( ( '.*' )? ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1610:1: ( ( '.*' )? )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1610:1: ( ( '.*' )? )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1611:1: ( '.*' )?
            {
             before(grammarAccess.getQualifedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1612:1: ( '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1613:2: '.*'
                    {
                    match(input,24,FOLLOW_24_in_rule__QualifedNameWithWildcard__Group__1__Impl3160); 

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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1629:1: rule__NamespaceDefinition__NamespaceDeclarationAssignment_0 : ( ruleNamespaceDeclaration ) ;
    public final void rule__NamespaceDefinition__NamespaceDeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1633:1: ( ( ruleNamespaceDeclaration ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1634:1: ( ruleNamespaceDeclaration )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1634:1: ( ruleNamespaceDeclaration )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1635:1: ruleNamespaceDeclaration
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getNamespaceDeclarationNamespaceDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNamespaceDeclaration_in_rule__NamespaceDefinition__NamespaceDeclarationAssignment_03202);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1644:1: rule__NamespaceDefinition__ImportDeclarationAssignment_1 : ( ruleImportDeclaration ) ;
    public final void rule__NamespaceDefinition__ImportDeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1648:1: ( ( ruleImportDeclaration ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1649:1: ( ruleImportDeclaration )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1649:1: ( ruleImportDeclaration )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1650:1: ruleImportDeclaration
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getImportDeclarationImportDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImportDeclaration_in_rule__NamespaceDefinition__ImportDeclarationAssignment_13233);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1659:1: rule__NamespaceDefinition__ArtifactAssignment_2 : ( ruleEntity ) ;
    public final void rule__NamespaceDefinition__ArtifactAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1663:1: ( ( ruleEntity ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1664:1: ( ruleEntity )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1664:1: ( ruleEntity )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1665:1: ruleEntity
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getArtifactEntityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__NamespaceDefinition__ArtifactAssignment_23264);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getNamespaceDefinitionAccess().getArtifactEntityParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1674:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1678:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1679:1: ( RULE_ID )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1679:1: ( RULE_ID )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1680:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_23295); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__AttributesAssignment_4"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1689:1: rule__Entity__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1693:1: ( ( ruleAttribute ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1694:1: ( ruleAttribute )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1694:1: ( ruleAttribute )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1695:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_43326);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_4"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1704:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1708:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1709:1: ( RULE_ID )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1709:1: ( RULE_ID )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1710:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_03357); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1719:1: rule__Attribute__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1723:1: ( ( ruleDataType ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1724:1: ( ruleDataType )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1724:1: ( ruleDataType )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1725:1: ruleDataType
            {
             before(grammarAccess.getAttributeAccess().getTypeDataTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__Attribute__TypeAssignment_23388);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeDataTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__EntityReference__EntityAssignment_1"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1734:1: rule__EntityReference__EntityAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EntityReference__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1738:1: ( ( ( RULE_ID ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1739:1: ( ( RULE_ID ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1739:1: ( ( RULE_ID ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1740:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityReferenceAccess().getEntityEntityCrossReference_1_0()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1741:1: ( RULE_ID )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1742:1: RULE_ID
            {
             before(grammarAccess.getEntityReferenceAccess().getEntityEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityReference__EntityAssignment_13423); 
             after(grammarAccess.getEntityReferenceAccess().getEntityEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEntityReferenceAccess().getEntityEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__EntityAssignment_1"


    // $ANTLR start "rule__StringType__NameAssignment_1"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1753:1: rule__StringType__NameAssignment_1 : ( ( 'string' ) ) ;
    public final void rule__StringType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1757:1: ( ( ( 'string' ) ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1758:1: ( ( 'string' ) )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1758:1: ( ( 'string' ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1759:1: ( 'string' )
            {
             before(grammarAccess.getStringTypeAccess().getNameStringKeyword_1_0()); 
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1760:1: ( 'string' )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1761:1: 'string'
            {
             before(grammarAccess.getStringTypeAccess().getNameStringKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__StringType__NameAssignment_13463); 
             after(grammarAccess.getStringTypeAccess().getNameStringKeyword_1_0()); 

            }

             after(grammarAccess.getStringTypeAccess().getNameStringKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__NameAssignment_1"


    // $ANTLR start "rule__StringType__LengthAssignment_2_3"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1776:1: rule__StringType__LengthAssignment_2_3 : ( RULE_INT ) ;
    public final void rule__StringType__LengthAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1780:1: ( ( RULE_INT ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1781:1: ( RULE_INT )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1781:1: ( RULE_INT )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1782:1: RULE_INT
            {
             before(grammarAccess.getStringTypeAccess().getLengthINTTerminalRuleCall_2_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StringType__LengthAssignment_2_33502); 
             after(grammarAccess.getStringTypeAccess().getLengthINTTerminalRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__LengthAssignment_2_3"


    // $ANTLR start "rule__StringType__DefaultValueAssignment_2_4_3"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1791:1: rule__StringType__DefaultValueAssignment_2_4_3 : ( RULE_STRING ) ;
    public final void rule__StringType__DefaultValueAssignment_2_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1795:1: ( ( RULE_STRING ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1796:1: ( RULE_STRING )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1796:1: ( RULE_STRING )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1797:1: RULE_STRING
            {
             before(grammarAccess.getStringTypeAccess().getDefaultValueSTRINGTerminalRuleCall_2_4_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringType__DefaultValueAssignment_2_4_33533); 
             after(grammarAccess.getStringTypeAccess().getDefaultValueSTRINGTerminalRuleCall_2_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__DefaultValueAssignment_2_4_3"


    // $ANTLR start "rule__NamespaceDeclaration__NameAssignment_1"
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1806:1: rule__NamespaceDeclaration__NameAssignment_1 : ( ruleQualifedName ) ;
    public final void rule__NamespaceDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1810:1: ( ( ruleQualifedName ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1811:1: ( ruleQualifedName )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1811:1: ( ruleQualifedName )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1812:1: ruleQualifedName
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNameQualifedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifedName_in_rule__NamespaceDeclaration__NameAssignment_13564);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1821:1: rule__ImportDeclaration__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__ImportDeclaration__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1825:1: ( ( ruleImport ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1826:1: ( ruleImport )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1826:1: ( ruleImport )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1827:1: ruleImport
            {
             before(grammarAccess.getImportDeclarationAccess().getImportsImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__ImportDeclaration__ImportsAssignment_13595);
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
    // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1836:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1840:1: ( ( ruleQualifedNameWithWildcard ) )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1841:1: ( ruleQualifedNameWithWildcard )
            {
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1841:1: ( ruleQualifedNameWithWildcard )
            // ../org.neclipse.xtext.entitydsl.ui/src-gen/org/neclipse/xtext/entitydsl/ui/contentassist/antlr/internal/InternalEntityDsl.g:1842:1: ruleQualifedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_13626);
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
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Alternatives_in_ruleDataType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityReference_in_entryRuleEntityReference301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityReference308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__0_in_ruleEntityReference334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__0_in_ruleStringType394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclaration_in_entryRuleNamespaceDeclaration421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceDeclaration428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__0_in_ruleNamespaceDeclaration454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclaration488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__Group__0_in_ruleImportDeclaration514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedName_in_entryRuleQualifedName601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifedName608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group__0_in_ruleQualifedName634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedNameWithWildcard_in_entryRuleQualifedNameWithWildcard661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifedNameWithWildcard668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedNameWithWildcard__Group__0_in_ruleQualifedNameWithWildcard694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__DataType__Alternatives732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityReference_in_rule__DataType__Alternatives749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__0__Impl_in_rule__NamespaceDefinition__Group__0779 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__1_in_rule__NamespaceDefinition__Group__0782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__NamespaceDeclarationAssignment_0_in_rule__NamespaceDefinition__Group__0__Impl809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__1__Impl_in_rule__NamespaceDefinition__Group__1839 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__2_in_rule__NamespaceDefinition__Group__1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__ImportDeclarationAssignment_1_in_rule__NamespaceDefinition__Group__1__Impl869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__2__Impl_in_rule__NamespaceDefinition__Group__2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__ArtifactAssignment_2_in_rule__NamespaceDefinition__Group__2__Impl926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0962 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Entity__Group__1__Impl1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21085 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31145 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Entity__Group__3__Impl1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41207 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_4_in_rule__Entity__Group__4__Impl1237 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Entity__Group__5__Impl1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01339 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11399 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Attribute__Group__1__Impl1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__0__Impl_in_rule__EntityReference__Group__01524 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__1_in_rule__EntityReference__Group__01527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__1__Impl_in_rule__EntityReference__Group__11585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__EntityAssignment_1_in_rule__EntityReference__Group__1__Impl1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__0__Impl_in_rule__StringType__Group__01646 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__01649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__1__Impl_in_rule__StringType__Group__11707 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__StringType__Group__2_in_rule__StringType__Group__11710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__NameAssignment_1_in_rule__StringType__Group__1__Impl1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__2__Impl_in_rule__StringType__Group__21767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group_2__0_in_rule__StringType__Group__2__Impl1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group_2__0__Impl_in_rule__StringType__Group_2__01831 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__StringType__Group_2__1_in_rule__StringType__Group_2__01834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__StringType__Group_2__0__Impl1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group_2__1__Impl_in_rule__StringType__Group_2__11893 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__StringType__Group_2__2_in_rule__StringType__Group_2__11896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__StringType__Group_2__1__Impl1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group_2__2__Impl_in_rule__StringType__Group_2__21955 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringType__Group_2__3_in_rule__StringType__Group_2__21958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__StringType__Group_2__2__Impl1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group_2__3__Impl_in_rule__StringType__Group_2__32017 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__StringType__Group_2__4_in_rule__StringType__Group_2__32020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__LengthAssignment_2_3_in_rule__StringType__Group_2__3__Impl2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group_2__4__Impl_in_rule__StringType__Group_2__42077 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__StringType__Group_2__5_in_rule__StringType__Group_2__42080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group_2_4__0_in_rule__StringType__Group_2__4__Impl2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group_2__5__Impl_in_rule__StringType__Group_2__52138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StringType__Group_2__5__Impl2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group_2_4__0__Impl_in_rule__StringType__Group_2_4__02209 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__StringType__Group_2_4__1_in_rule__StringType__Group_2_4__02212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StringType__Group_2_4__0__Impl2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group_2_4__1__Impl_in_rule__StringType__Group_2_4__12271 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__StringType__Group_2_4__2_in_rule__StringType__Group_2_4__12274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__StringType__Group_2_4__1__Impl2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group_2_4__2__Impl_in_rule__StringType__Group_2_4__22333 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringType__Group_2_4__3_in_rule__StringType__Group_2_4__22336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__StringType__Group_2_4__2__Impl2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group_2_4__3__Impl_in_rule__StringType__Group_2_4__32395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__DefaultValueAssignment_2_4_3_in_rule__StringType__Group_2_4__3__Impl2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__0__Impl_in_rule__NamespaceDeclaration__Group__02460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__1_in_rule__NamespaceDeclaration__Group__02463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__NamespaceDeclaration__Group__0__Impl2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__1__Impl_in_rule__NamespaceDeclaration__Group__12522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__NameAssignment_1_in_rule__NamespaceDeclaration__Group__1__Impl2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__Group__0__Impl_in_rule__ImportDeclaration__Group__02583 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__Group__1_in_rule__ImportDeclaration__Group__02586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__Group__1__Impl_in_rule__ImportDeclaration__Group__12644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__ImportsAssignment_1_in_rule__ImportDeclaration__Group__1__Impl2671 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02706 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Import__Group__0__Impl2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group__0__Impl_in_rule__QualifedName__Group__02829 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__QualifedName__Group__1_in_rule__QualifedName__Group__02832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifedName__Group__0__Impl2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group__1__Impl_in_rule__QualifedName__Group__12888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group_1__0_in_rule__QualifedName__Group__1__Impl2915 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group_1__0__Impl_in_rule__QualifedName__Group_1__02950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifedName__Group_1__1_in_rule__QualifedName__Group_1__02953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__QualifedName__Group_1__0__Impl2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group_1__1__Impl_in_rule__QualifedName__Group_1__13012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifedName__Group_1__1__Impl3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedNameWithWildcard__Group__0__Impl_in_rule__QualifedNameWithWildcard__Group__03072 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__QualifedNameWithWildcard__Group__1_in_rule__QualifedNameWithWildcard__Group__03075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedName_in_rule__QualifedNameWithWildcard__Group__0__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedNameWithWildcard__Group__1__Impl_in_rule__QualifedNameWithWildcard__Group__13131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__QualifedNameWithWildcard__Group__1__Impl3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclaration_in_rule__NamespaceDefinition__NamespaceDeclarationAssignment_03202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_rule__NamespaceDefinition__ImportDeclarationAssignment_13233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__NamespaceDefinition__ArtifactAssignment_23264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_23295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_43326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_03357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Attribute__TypeAssignment_23388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityReference__EntityAssignment_13423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__StringType__NameAssignment_13463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StringType__LengthAssignment_2_33502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringType__DefaultValueAssignment_2_4_33533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedName_in_rule__NamespaceDeclaration__NameAssignment_13564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__ImportDeclaration__ImportsAssignment_13595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_13626 = new BitSet(new long[]{0x0000000000000002L});

}