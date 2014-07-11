package org.neclipse.xtext.entitydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.neclipse.xtext.entitydsl.services.EntityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntityDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Entity'", "'{'", "'}'", "':'", "'string'", "'('", "'length'", "'='", "','", "'default-value'", "')'", "'namespace'", "'import'", "'.'", "'.*'"
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
    public String getGrammarFileName() { return "../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g"; }



     	private EntityDslGrammarAccess grammarAccess;
     	
        public InternalEntityDslParser(TokenStream input, EntityDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "NamespaceDefinition";	
       	}
       	
       	@Override
       	protected EntityDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleNamespaceDefinition"
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:67:1: entryRuleNamespaceDefinition returns [EObject current=null] : iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF ;
    public final EObject entryRuleNamespaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceDefinition = null;


        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:68:2: (iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:69:2: iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF
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
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:76:1: ruleNamespaceDefinition returns [EObject current=null] : ( ( (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration ) ) ( (lv_importDeclaration_1_0= ruleImportDeclaration ) ) ( (lv_artifact_2_0= ruleEntity ) ) ) ;
    public final EObject ruleNamespaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_namespaceDeclaration_0_0 = null;

        EObject lv_importDeclaration_1_0 = null;

        EObject lv_artifact_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:79:28: ( ( ( (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration ) ) ( (lv_importDeclaration_1_0= ruleImportDeclaration ) ) ( (lv_artifact_2_0= ruleEntity ) ) ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:80:1: ( ( (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration ) ) ( (lv_importDeclaration_1_0= ruleImportDeclaration ) ) ( (lv_artifact_2_0= ruleEntity ) ) )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:80:1: ( ( (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration ) ) ( (lv_importDeclaration_1_0= ruleImportDeclaration ) ) ( (lv_artifact_2_0= ruleEntity ) ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:80:2: ( (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration ) ) ( (lv_importDeclaration_1_0= ruleImportDeclaration ) ) ( (lv_artifact_2_0= ruleEntity ) )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:80:2: ( (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:81:1: (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:81:1: (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:82:3: lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration
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

            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:98:2: ( (lv_importDeclaration_1_0= ruleImportDeclaration ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:99:1: (lv_importDeclaration_1_0= ruleImportDeclaration )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:99:1: (lv_importDeclaration_1_0= ruleImportDeclaration )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:100:3: lv_importDeclaration_1_0= ruleImportDeclaration
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

            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:116:2: ( (lv_artifact_2_0= ruleEntity ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:117:1: (lv_artifact_2_0= ruleEntity )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:117:1: (lv_artifact_2_0= ruleEntity )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:118:3: lv_artifact_2_0= ruleEntity
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceDefinitionAccess().getArtifactEntityParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEntity_in_ruleNamespaceDefinition173);
            lv_artifact_2_0=ruleEntity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"artifact",
                    		lv_artifact_2_0, 
                    		"Entity");
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


    // $ANTLR start "entryRuleEntity"
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:142:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:143:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:144:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity209);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity219); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:151:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:154:28: ( ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:155:1: ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:155:1: ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:155:2: () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}'
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:155:2: ()
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:156:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityAccess().getEntityAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleEntity265); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
                
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:165:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:166:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:166:1: (lv_name_2_0= RULE_ID )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:167:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity282); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleEntity299); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:187:1: ( (lv_attributes_4_0= ruleAttribute ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:188:1: (lv_attributes_4_0= ruleAttribute )
            	    {
            	    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:188:1: (lv_attributes_4_0= ruleAttribute )
            	    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:189:3: lv_attributes_4_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity320);
            	    lv_attributes_4_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_4_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleEntity333); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:217:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:218:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:219:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute369);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute379); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:226:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:229:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:230:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:230:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:230:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:230:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:231:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:231:1: (lv_name_0_0= RULE_ID )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:232:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute421); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleAttribute438); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
                
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:252:1: ( (lv_type_2_0= ruleDataType ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:253:1: (lv_type_2_0= ruleDataType )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:253:1: (lv_type_2_0= ruleDataType )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:254:3: lv_type_2_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeDataTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleAttribute459);
            lv_type_2_0=ruleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"DataType");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDataType"
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:278:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:279:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:280:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType495);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType505); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:287:1: ruleDataType returns [EObject current=null] : (this_StringType_0= ruleStringType | this_EntityReference_1= ruleEntityReference ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_StringType_0 = null;

        EObject this_EntityReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:290:28: ( (this_StringType_0= ruleStringType | this_EntityReference_1= ruleEntityReference ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:291:1: (this_StringType_0= ruleStringType | this_EntityReference_1= ruleEntityReference )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:291:1: (this_StringType_0= ruleStringType | this_EntityReference_1= ruleEntityReference )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:292:5: this_StringType_0= ruleStringType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getStringTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_ruleDataType552);
                    this_StringType_0=ruleStringType();

                    state._fsp--;

                     
                            current = this_StringType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:302:5: this_EntityReference_1= ruleEntityReference
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getEntityReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntityReference_in_ruleDataType579);
                    this_EntityReference_1=ruleEntityReference();

                    state._fsp--;

                     
                            current = this_EntityReference_1; 
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntityReference"
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:318:1: entryRuleEntityReference returns [EObject current=null] : iv_ruleEntityReference= ruleEntityReference EOF ;
    public final EObject entryRuleEntityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityReference = null;


        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:319:2: (iv_ruleEntityReference= ruleEntityReference EOF )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:320:2: iv_ruleEntityReference= ruleEntityReference EOF
            {
             newCompositeNode(grammarAccess.getEntityReferenceRule()); 
            pushFollow(FOLLOW_ruleEntityReference_in_entryRuleEntityReference614);
            iv_ruleEntityReference=ruleEntityReference();

            state._fsp--;

             current =iv_ruleEntityReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityReference624); 

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
    // $ANTLR end "entryRuleEntityReference"


    // $ANTLR start "ruleEntityReference"
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:327:1: ruleEntityReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEntityReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:330:28: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:331:1: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:331:1: ( () ( (otherlv_1= RULE_ID ) ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:331:2: () ( (otherlv_1= RULE_ID ) )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:331:2: ()
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:332:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityReferenceAccess().getEntityReferenceAction_0(),
                        current);
                

            }

            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:337:2: ( (otherlv_1= RULE_ID ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:338:1: (otherlv_1= RULE_ID )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:338:1: (otherlv_1= RULE_ID )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:339:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityReferenceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityReference678); 

            		newLeafNode(otherlv_1, grammarAccess.getEntityReferenceAccess().getEntityEntityCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleEntityReference"


    // $ANTLR start "entryRuleStringType"
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:358:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:359:2: (iv_ruleStringType= ruleStringType EOF )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:360:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType714);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType724); 

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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:367:1: ruleStringType returns [EObject current=null] : ( () ( (lv_name_1_0= 'string' ) ) (otherlv_2= '(' otherlv_3= 'length' otherlv_4= '=' ( (lv_length_5_0= RULE_INT ) ) (otherlv_6= ',' otherlv_7= 'default-value' otherlv_8= '=' ( (lv_defaultValue_9_0= RULE_STRING ) ) )? otherlv_10= ')' )? ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_length_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_defaultValue_9_0=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:370:28: ( ( () ( (lv_name_1_0= 'string' ) ) (otherlv_2= '(' otherlv_3= 'length' otherlv_4= '=' ( (lv_length_5_0= RULE_INT ) ) (otherlv_6= ',' otherlv_7= 'default-value' otherlv_8= '=' ( (lv_defaultValue_9_0= RULE_STRING ) ) )? otherlv_10= ')' )? ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:371:1: ( () ( (lv_name_1_0= 'string' ) ) (otherlv_2= '(' otherlv_3= 'length' otherlv_4= '=' ( (lv_length_5_0= RULE_INT ) ) (otherlv_6= ',' otherlv_7= 'default-value' otherlv_8= '=' ( (lv_defaultValue_9_0= RULE_STRING ) ) )? otherlv_10= ')' )? )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:371:1: ( () ( (lv_name_1_0= 'string' ) ) (otherlv_2= '(' otherlv_3= 'length' otherlv_4= '=' ( (lv_length_5_0= RULE_INT ) ) (otherlv_6= ',' otherlv_7= 'default-value' otherlv_8= '=' ( (lv_defaultValue_9_0= RULE_STRING ) ) )? otherlv_10= ')' )? )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:371:2: () ( (lv_name_1_0= 'string' ) ) (otherlv_2= '(' otherlv_3= 'length' otherlv_4= '=' ( (lv_length_5_0= RULE_INT ) ) (otherlv_6= ',' otherlv_7= 'default-value' otherlv_8= '=' ( (lv_defaultValue_9_0= RULE_STRING ) ) )? otherlv_10= ')' )?
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:371:2: ()
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:372:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
                        current);
                

            }

            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:377:2: ( (lv_name_1_0= 'string' ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:378:1: (lv_name_1_0= 'string' )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:378:1: (lv_name_1_0= 'string' )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:379:3: lv_name_1_0= 'string'
            {
            lv_name_1_0=(Token)match(input,15,FOLLOW_15_in_ruleStringType776); 

                    newLeafNode(lv_name_1_0, grammarAccess.getStringTypeAccess().getNameStringKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "string");
            	    

            }


            }

            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:392:2: (otherlv_2= '(' otherlv_3= 'length' otherlv_4= '=' ( (lv_length_5_0= RULE_INT ) ) (otherlv_6= ',' otherlv_7= 'default-value' otherlv_8= '=' ( (lv_defaultValue_9_0= RULE_STRING ) ) )? otherlv_10= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:392:4: otherlv_2= '(' otherlv_3= 'length' otherlv_4= '=' ( (lv_length_5_0= RULE_INT ) ) (otherlv_6= ',' otherlv_7= 'default-value' otherlv_8= '=' ( (lv_defaultValue_9_0= RULE_STRING ) ) )? otherlv_10= ')'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleStringType802); 

                        	newLeafNode(otherlv_2, grammarAccess.getStringTypeAccess().getLeftParenthesisKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleStringType814); 

                        	newLeafNode(otherlv_3, grammarAccess.getStringTypeAccess().getLengthKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleStringType826); 

                        	newLeafNode(otherlv_4, grammarAccess.getStringTypeAccess().getEqualsSignKeyword_2_2());
                        
                    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:404:1: ( (lv_length_5_0= RULE_INT ) )
                    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:405:1: (lv_length_5_0= RULE_INT )
                    {
                    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:405:1: (lv_length_5_0= RULE_INT )
                    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:406:3: lv_length_5_0= RULE_INT
                    {
                    lv_length_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringType843); 

                    			newLeafNode(lv_length_5_0, grammarAccess.getStringTypeAccess().getLengthINTTerminalRuleCall_2_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"length",
                            		lv_length_5_0, 
                            		"INT");
                    	    

                    }


                    }

                    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:422:2: (otherlv_6= ',' otherlv_7= 'default-value' otherlv_8= '=' ( (lv_defaultValue_9_0= RULE_STRING ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==19) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:422:4: otherlv_6= ',' otherlv_7= 'default-value' otherlv_8= '=' ( (lv_defaultValue_9_0= RULE_STRING ) )
                            {
                            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleStringType861); 

                                	newLeafNode(otherlv_6, grammarAccess.getStringTypeAccess().getCommaKeyword_2_4_0());
                                
                            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleStringType873); 

                                	newLeafNode(otherlv_7, grammarAccess.getStringTypeAccess().getDefaultValueKeyword_2_4_1());
                                
                            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleStringType885); 

                                	newLeafNode(otherlv_8, grammarAccess.getStringTypeAccess().getEqualsSignKeyword_2_4_2());
                                
                            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:434:1: ( (lv_defaultValue_9_0= RULE_STRING ) )
                            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:435:1: (lv_defaultValue_9_0= RULE_STRING )
                            {
                            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:435:1: (lv_defaultValue_9_0= RULE_STRING )
                            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:436:3: lv_defaultValue_9_0= RULE_STRING
                            {
                            lv_defaultValue_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringType902); 

                            			newLeafNode(lv_defaultValue_9_0, grammarAccess.getStringTypeAccess().getDefaultValueSTRINGTerminalRuleCall_2_4_3_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getStringTypeRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"defaultValue",
                                    		lv_defaultValue_9_0, 
                                    		"STRING");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleStringType921); 

                        	newLeafNode(otherlv_10, grammarAccess.getStringTypeAccess().getRightParenthesisKeyword_2_5());
                        

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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleNamespaceDeclaration"
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:464:1: entryRuleNamespaceDeclaration returns [EObject current=null] : iv_ruleNamespaceDeclaration= ruleNamespaceDeclaration EOF ;
    public final EObject entryRuleNamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceDeclaration = null;


        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:465:2: (iv_ruleNamespaceDeclaration= ruleNamespaceDeclaration EOF )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:466:2: iv_ruleNamespaceDeclaration= ruleNamespaceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getNamespaceDeclarationRule()); 
            pushFollow(FOLLOW_ruleNamespaceDeclaration_in_entryRuleNamespaceDeclaration959);
            iv_ruleNamespaceDeclaration=ruleNamespaceDeclaration();

            state._fsp--;

             current =iv_ruleNamespaceDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceDeclaration969); 

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
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:473:1: ruleNamespaceDeclaration returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) ) ;
    public final EObject ruleNamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:476:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:477:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:477:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:477:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleNamespaceDeclaration1006); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0());
                
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:481:1: ( (lv_name_1_0= ruleQualifedName ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:482:1: (lv_name_1_0= ruleQualifedName )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:482:1: (lv_name_1_0= ruleQualifedName )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:483:3: lv_name_1_0= ruleQualifedName
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getNameQualifedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifedName_in_ruleNamespaceDeclaration1027);
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
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:507:1: entryRuleImportDeclaration returns [EObject current=null] : iv_ruleImportDeclaration= ruleImportDeclaration EOF ;
    public final EObject entryRuleImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDeclaration = null;


        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:508:2: (iv_ruleImportDeclaration= ruleImportDeclaration EOF )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:509:2: iv_ruleImportDeclaration= ruleImportDeclaration EOF
            {
             newCompositeNode(grammarAccess.getImportDeclarationRule()); 
            pushFollow(FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration1063);
            iv_ruleImportDeclaration=ruleImportDeclaration();

            state._fsp--;

             current =iv_ruleImportDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDeclaration1073); 

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
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:516:1: ruleImportDeclaration returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ) ;
    public final EObject ruleImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:519:28: ( ( () ( (lv_imports_1_0= ruleImport ) )* ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:520:1: ( () ( (lv_imports_1_0= ruleImport ) )* )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:520:1: ( () ( (lv_imports_1_0= ruleImport ) )* )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:520:2: () ( (lv_imports_1_0= ruleImport ) )*
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:520:2: ()
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:521:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImportDeclarationAccess().getImportDeclarationAction_0(),
                        current);
                

            }

            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:526:2: ( (lv_imports_1_0= ruleImport ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:527:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:527:1: (lv_imports_1_0= ruleImport )
            	    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:528:3: lv_imports_1_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImportDeclarationAccess().getImportsImportParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleImportDeclaration1128);
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
            	    break loop5;
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
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:552:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:553:2: (iv_ruleImport= ruleImport EOF )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:554:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport1165);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport1175); 

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
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:561:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:564:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) ) ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:565:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) ) )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:565:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:565:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleImport1212); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:569:1: ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:570:1: (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:570:1: (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:571:3: lv_importedNamespace_1_0= ruleQualifedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifedNameWithWildcard_in_ruleImport1233);
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
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:595:1: entryRuleQualifedName returns [String current=null] : iv_ruleQualifedName= ruleQualifedName EOF ;
    public final String entryRuleQualifedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifedName = null;


        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:596:2: (iv_ruleQualifedName= ruleQualifedName EOF )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:597:2: iv_ruleQualifedName= ruleQualifedName EOF
            {
             newCompositeNode(grammarAccess.getQualifedNameRule()); 
            pushFollow(FOLLOW_ruleQualifedName_in_entryRuleQualifedName1270);
            iv_ruleQualifedName=ruleQualifedName();

            state._fsp--;

             current =iv_ruleQualifedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifedName1281); 

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
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:604:1: ruleQualifedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:607:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:608:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:608:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:608:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifedName1321); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:615:1: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:616:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,24,FOLLOW_24_in_ruleQualifedName1340); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifedName1355); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:636:1: entryRuleQualifedNameWithWildcard returns [String current=null] : iv_ruleQualifedNameWithWildcard= ruleQualifedNameWithWildcard EOF ;
    public final String entryRuleQualifedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifedNameWithWildcard = null;


        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:637:2: (iv_ruleQualifedNameWithWildcard= ruleQualifedNameWithWildcard EOF )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:638:2: iv_ruleQualifedNameWithWildcard= ruleQualifedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifedNameWithWildcard_in_entryRuleQualifedNameWithWildcard1403);
            iv_ruleQualifedNameWithWildcard=ruleQualifedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifedNameWithWildcard1414); 

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
    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:645:1: ruleQualifedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifedName_0= ruleQualifedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:648:28: ( (this_QualifedName_0= ruleQualifedName (kw= '.*' )? ) )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:649:1: (this_QualifedName_0= ruleQualifedName (kw= '.*' )? )
            {
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:649:1: (this_QualifedName_0= ruleQualifedName (kw= '.*' )? )
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:650:5: this_QualifedName_0= ruleQualifedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifedNameWithWildcardAccess().getQualifedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifedName_in_ruleQualifedNameWithWildcard1461);
            this_QualifedName_0=ruleQualifedName();

            state._fsp--;


            		current.merge(this_QualifedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:660:1: (kw= '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.neclipse.xtext.entitydsl/src-gen/org/neclipse/xtext/entitydsl/parser/antlr/internal/InternalEntityDsl.g:661:2: kw= '.*'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleQualifedNameWithWildcard1480); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleNamespaceDefinition_in_entryRuleNamespaceDefinition75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceDefinition85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclaration_in_ruleNamespaceDefinition131 = new BitSet(new long[]{0x0000000000800800L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_ruleNamespaceDefinition152 = new BitSet(new long[]{0x0000000000800800L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleNamespaceDefinition173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEntity265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity282 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity299 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity320 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleEntity333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute421 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAttribute438 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleAttribute459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleDataType552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityReference_in_ruleDataType579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityReference_in_entryRuleEntityReference614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityReference624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityReference678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStringType776 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleStringType802 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStringType814 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStringType826 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringType843 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_19_in_ruleStringType861 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStringType873 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStringType885 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringType902 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStringType921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclaration_in_entryRuleNamespaceDeclaration959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceDeclaration969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleNamespaceDeclaration1006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifedName_in_ruleNamespaceDeclaration1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration1063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclaration1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleImportDeclaration1128 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport1165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleImport1212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifedNameWithWildcard_in_ruleImport1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedName_in_entryRuleQualifedName1270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifedName1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifedName1321 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleQualifedName1340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifedName1355 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleQualifedNameWithWildcard_in_entryRuleQualifedNameWithWildcard1403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifedNameWithWildcard1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedName_in_ruleQualifedNameWithWildcard1461 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleQualifedNameWithWildcard1480 = new BitSet(new long[]{0x0000000000000002L});

}