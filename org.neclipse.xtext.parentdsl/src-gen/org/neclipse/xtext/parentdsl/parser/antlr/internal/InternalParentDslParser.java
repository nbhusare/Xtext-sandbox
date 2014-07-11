package org.neclipse.xtext.parentdsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.neclipse.xtext.parentdsl.services.ParentDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalParentDslParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g"; }



     	private ParentDslGrammarAccess grammarAccess;
     	
        public InternalParentDslParser(TokenStream input, ParentDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "NamespaceDefinition";	
       	}
       	
       	@Override
       	protected ParentDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleNamespaceDefinition"
    // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:67:1: entryRuleNamespaceDefinition returns [EObject current=null] : iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF ;
    public final EObject entryRuleNamespaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceDefinition = null;


        try {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:68:2: (iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:69:2: iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF
            {
             newCompositeNode(grammarAccess.getNamespaceDefinitionRule()); 
            pushFollow(FOLLOW_ruleNamespaceDefinition_in_entryRuleNamespaceDefinition75);
            iv_ruleNamespaceDefinition=ruleNamespaceDefinition();

            state._fsp--;

             current =iv_ruleNamespaceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceDefinition85); 

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
    // $ANTLR end "entryRuleNamespaceDefinition"


    // $ANTLR start "ruleNamespaceDefinition"
    // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:76:1: ruleNamespaceDefinition returns [EObject current=null] : ( ( (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration ) ) ( (lv_importDeclaration_1_0= ruleImportDeclaration ) ) ( (lv_artifact_2_0= ruleArtifact ) ) ) ;
    public final EObject ruleNamespaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_namespaceDeclaration_0_0 = null;

        EObject lv_importDeclaration_1_0 = null;

        EObject lv_artifact_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:79:28: ( ( ( (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration ) ) ( (lv_importDeclaration_1_0= ruleImportDeclaration ) ) ( (lv_artifact_2_0= ruleArtifact ) ) ) )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:80:1: ( ( (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration ) ) ( (lv_importDeclaration_1_0= ruleImportDeclaration ) ) ( (lv_artifact_2_0= ruleArtifact ) ) )
            {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:80:1: ( ( (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration ) ) ( (lv_importDeclaration_1_0= ruleImportDeclaration ) ) ( (lv_artifact_2_0= ruleArtifact ) ) )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:80:2: ( (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration ) ) ( (lv_importDeclaration_1_0= ruleImportDeclaration ) ) ( (lv_artifact_2_0= ruleArtifact ) )
            {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:80:2: ( (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration ) )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:81:1: (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration )
            {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:81:1: (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:82:3: lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceDefinitionAccess().getNamespaceDeclarationNamespaceDeclarationParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNamespaceDeclaration_in_ruleNamespaceDefinition131);
            lv_namespaceDeclaration_0_0=ruleNamespaceDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"namespaceDeclaration",
                    		lv_namespaceDeclaration_0_0, 
                    		"NamespaceDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:98:2: ( (lv_importDeclaration_1_0= ruleImportDeclaration ) )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:99:1: (lv_importDeclaration_1_0= ruleImportDeclaration )
            {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:99:1: (lv_importDeclaration_1_0= ruleImportDeclaration )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:100:3: lv_importDeclaration_1_0= ruleImportDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceDefinitionAccess().getImportDeclarationImportDeclarationParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleImportDeclaration_in_ruleNamespaceDefinition152);
            lv_importDeclaration_1_0=ruleImportDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"importDeclaration",
                    		lv_importDeclaration_1_0, 
                    		"ImportDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:116:2: ( (lv_artifact_2_0= ruleArtifact ) )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:117:1: (lv_artifact_2_0= ruleArtifact )
            {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:117:1: (lv_artifact_2_0= ruleArtifact )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:118:3: lv_artifact_2_0= ruleArtifact
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceDefinitionAccess().getArtifactArtifactParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleArtifact_in_ruleNamespaceDefinition173);
            lv_artifact_2_0=ruleArtifact();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"artifact",
                    		lv_artifact_2_0, 
                    		"Artifact");
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
    // $ANTLR end "ruleNamespaceDefinition"


    // $ANTLR start "entryRuleNamespaceDeclaration"
    // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:142:1: entryRuleNamespaceDeclaration returns [EObject current=null] : iv_ruleNamespaceDeclaration= ruleNamespaceDeclaration EOF ;
    public final EObject entryRuleNamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceDeclaration = null;


        try {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:143:2: (iv_ruleNamespaceDeclaration= ruleNamespaceDeclaration EOF )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:144:2: iv_ruleNamespaceDeclaration= ruleNamespaceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getNamespaceDeclarationRule()); 
            pushFollow(FOLLOW_ruleNamespaceDeclaration_in_entryRuleNamespaceDeclaration209);
            iv_ruleNamespaceDeclaration=ruleNamespaceDeclaration();

            state._fsp--;

             current =iv_ruleNamespaceDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceDeclaration219); 

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
    // $ANTLR end "entryRuleNamespaceDeclaration"


    // $ANTLR start "ruleNamespaceDeclaration"
    // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:151:1: ruleNamespaceDeclaration returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) ) ;
    public final EObject ruleNamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:154:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) ) )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:155:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) )
            {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:155:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:155:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleNamespaceDeclaration256); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0());
                
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:159:1: ( (lv_name_1_0= ruleQualifedName ) )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:160:1: (lv_name_1_0= ruleQualifedName )
            {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:160:1: (lv_name_1_0= ruleQualifedName )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:161:3: lv_name_1_0= ruleQualifedName
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getNameQualifedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifedName_in_ruleNamespaceDeclaration277);
            lv_name_1_0=ruleQualifedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifedName");
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
    // $ANTLR end "ruleNamespaceDeclaration"


    // $ANTLR start "entryRuleImportDeclaration"
    // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:185:1: entryRuleImportDeclaration returns [EObject current=null] : iv_ruleImportDeclaration= ruleImportDeclaration EOF ;
    public final EObject entryRuleImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDeclaration = null;


        try {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:186:2: (iv_ruleImportDeclaration= ruleImportDeclaration EOF )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:187:2: iv_ruleImportDeclaration= ruleImportDeclaration EOF
            {
             newCompositeNode(grammarAccess.getImportDeclarationRule()); 
            pushFollow(FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration313);
            iv_ruleImportDeclaration=ruleImportDeclaration();

            state._fsp--;

             current =iv_ruleImportDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDeclaration323); 

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
    // $ANTLR end "entryRuleImportDeclaration"


    // $ANTLR start "ruleImportDeclaration"
    // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:194:1: ruleImportDeclaration returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ) ;
    public final EObject ruleImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:197:28: ( ( () ( (lv_imports_1_0= ruleImport ) )* ) )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:198:1: ( () ( (lv_imports_1_0= ruleImport ) )* )
            {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:198:1: ( () ( (lv_imports_1_0= ruleImport ) )* )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:198:2: () ( (lv_imports_1_0= ruleImport ) )*
            {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:198:2: ()
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:199:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImportDeclarationAccess().getImportDeclarationAction_0(),
                        current);
                

            }

            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:204:2: ( (lv_imports_1_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:205:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:205:1: (lv_imports_1_0= ruleImport )
            	    // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:206:3: lv_imports_1_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImportDeclarationAccess().getImportsImportParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleImportDeclaration378);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImportDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_1_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleImportDeclaration"


    // $ANTLR start "entryRuleImport"
    // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:230:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:231:2: (iv_ruleImport= ruleImport EOF )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:232:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport415);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport425); 

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
    // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:239:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:242:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) ) ) )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:243:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) ) )
            {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:243:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) ) )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:243:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport462); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:247:1: ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:248:1: (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard )
            {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:248:1: (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:249:3: lv_importedNamespace_1_0= ruleQualifedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifedNameWithWildcard_in_ruleImport483);
            lv_importedNamespace_1_0=ruleQualifedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifedNameWithWildcard");
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


    // $ANTLR start "entryRuleQualifedName"
    // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:273:1: entryRuleQualifedName returns [String current=null] : iv_ruleQualifedName= ruleQualifedName EOF ;
    public final String entryRuleQualifedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifedName = null;


        try {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:274:2: (iv_ruleQualifedName= ruleQualifedName EOF )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:275:2: iv_ruleQualifedName= ruleQualifedName EOF
            {
             newCompositeNode(grammarAccess.getQualifedNameRule()); 
            pushFollow(FOLLOW_ruleQualifedName_in_entryRuleQualifedName520);
            iv_ruleQualifedName=ruleQualifedName();

            state._fsp--;

             current =iv_ruleQualifedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifedName531); 

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
    // $ANTLR end "entryRuleQualifedName"


    // $ANTLR start "ruleQualifedName"
    // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:282:1: ruleQualifedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:285:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:286:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:286:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:286:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifedName571); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:293:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:294:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifedName590); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifedName605); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleQualifedName"


    // $ANTLR start "entryRuleQualifedNameWithWildcard"
    // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:314:1: entryRuleQualifedNameWithWildcard returns [String current=null] : iv_ruleQualifedNameWithWildcard= ruleQualifedNameWithWildcard EOF ;
    public final String entryRuleQualifedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifedNameWithWildcard = null;


        try {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:315:2: (iv_ruleQualifedNameWithWildcard= ruleQualifedNameWithWildcard EOF )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:316:2: iv_ruleQualifedNameWithWildcard= ruleQualifedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifedNameWithWildcard_in_entryRuleQualifedNameWithWildcard653);
            iv_ruleQualifedNameWithWildcard=ruleQualifedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifedNameWithWildcard664); 

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
    // $ANTLR end "entryRuleQualifedNameWithWildcard"


    // $ANTLR start "ruleQualifedNameWithWildcard"
    // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:323:1: ruleQualifedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifedName_0= ruleQualifedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:326:28: ( (this_QualifedName_0= ruleQualifedName (kw= '.*' )? ) )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:327:1: (this_QualifedName_0= ruleQualifedName (kw= '.*' )? )
            {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:327:1: (this_QualifedName_0= ruleQualifedName (kw= '.*' )? )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:328:5: this_QualifedName_0= ruleQualifedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifedNameWithWildcardAccess().getQualifedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifedName_in_ruleQualifedNameWithWildcard711);
            this_QualifedName_0=ruleQualifedName();

            state._fsp--;


            		current.merge(this_QualifedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:338:1: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:339:2: kw= '.*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifedNameWithWildcard730); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

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
    // $ANTLR end "ruleQualifedNameWithWildcard"


    // $ANTLR start "entryRuleArtifact"
    // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:352:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:353:2: (iv_ruleArtifact= ruleArtifact EOF )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:354:2: iv_ruleArtifact= ruleArtifact EOF
            {
             newCompositeNode(grammarAccess.getArtifactRule()); 
            pushFollow(FOLLOW_ruleArtifact_in_entryRuleArtifact772);
            iv_ruleArtifact=ruleArtifact();

            state._fsp--;

             current =iv_ruleArtifact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtifact782); 

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
    // $ANTLR end "entryRuleArtifact"


    // $ANTLR start "ruleArtifact"
    // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:361:1: ruleArtifact returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:364:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:365:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:365:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:366:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:366:1: (lv_name_0_0= RULE_ID )
            // ../org.neclipse.xtext.parentdsl/src-gen/org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.g:367:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArtifact823); 

            			newLeafNode(lv_name_0_0, grammarAccess.getArtifactAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArtifactRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleArtifact"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleNamespaceDefinition_in_entryRuleNamespaceDefinition75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceDefinition85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclaration_in_ruleNamespaceDefinition131 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_ruleNamespaceDefinition152 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleArtifact_in_ruleNamespaceDefinition173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclaration_in_entryRuleNamespaceDeclaration209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceDeclaration219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleNamespaceDeclaration256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifedName_in_ruleNamespaceDeclaration277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclaration323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleImportDeclaration378 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifedNameWithWildcard_in_ruleImport483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedName_in_entryRuleQualifedName520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifedName531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifedName571 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifedName590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifedName605 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleQualifedNameWithWildcard_in_entryRuleQualifedNameWithWildcard653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifedNameWithWildcard664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedName_in_ruleQualifedNameWithWildcard711 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifedNameWithWildcard730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtifact_in_entryRuleArtifact772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtifact782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArtifact823 = new BitSet(new long[]{0x0000000000000002L});

}