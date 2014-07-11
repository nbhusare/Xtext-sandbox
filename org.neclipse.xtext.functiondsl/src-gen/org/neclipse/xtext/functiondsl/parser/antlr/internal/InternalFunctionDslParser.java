package org.neclipse.xtext.functiondsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.neclipse.xtext.functiondsl.services.FunctionDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFunctionDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "'('", "','", "')'", "'{'", "'}'", "'var'", "'='", "'.'", "'[]'", "':'", "'namespace'", "'import'", "'.*'"
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
    public String getGrammarFileName() { return "../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g"; }



     	private FunctionDslGrammarAccess grammarAccess;
     	
        public InternalFunctionDslParser(TokenStream input, FunctionDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "NamespaceDefinition";	
       	}
       	
       	@Override
       	protected FunctionDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleNamespaceDefinition"
    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:67:1: entryRuleNamespaceDefinition returns [EObject current=null] : iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF ;
    public final EObject entryRuleNamespaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceDefinition = null;


        try {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:68:2: (iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:69:2: iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF
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
    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:76:1: ruleNamespaceDefinition returns [EObject current=null] : ( ( (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration ) ) ( (lv_importDeclaration_1_0= ruleImportDeclaration ) ) ( (lv_artifact_2_0= ruleFunction ) ) ) ;
    public final EObject ruleNamespaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_namespaceDeclaration_0_0 = null;

        EObject lv_importDeclaration_1_0 = null;

        EObject lv_artifact_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:79:28: ( ( ( (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration ) ) ( (lv_importDeclaration_1_0= ruleImportDeclaration ) ) ( (lv_artifact_2_0= ruleFunction ) ) ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:80:1: ( ( (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration ) ) ( (lv_importDeclaration_1_0= ruleImportDeclaration ) ) ( (lv_artifact_2_0= ruleFunction ) ) )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:80:1: ( ( (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration ) ) ( (lv_importDeclaration_1_0= ruleImportDeclaration ) ) ( (lv_artifact_2_0= ruleFunction ) ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:80:2: ( (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration ) ) ( (lv_importDeclaration_1_0= ruleImportDeclaration ) ) ( (lv_artifact_2_0= ruleFunction ) )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:80:2: ( (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:81:1: (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:81:1: (lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:82:3: lv_namespaceDeclaration_0_0= ruleNamespaceDeclaration
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

            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:98:2: ( (lv_importDeclaration_1_0= ruleImportDeclaration ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:99:1: (lv_importDeclaration_1_0= ruleImportDeclaration )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:99:1: (lv_importDeclaration_1_0= ruleImportDeclaration )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:100:3: lv_importDeclaration_1_0= ruleImportDeclaration
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

            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:116:2: ( (lv_artifact_2_0= ruleFunction ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:117:1: (lv_artifact_2_0= ruleFunction )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:117:1: (lv_artifact_2_0= ruleFunction )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:118:3: lv_artifact_2_0= ruleFunction
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceDefinitionAccess().getArtifactFunctionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFunction_in_ruleNamespaceDefinition173);
            lv_artifact_2_0=ruleFunction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"artifact",
                    		lv_artifact_2_0, 
                    		"Function");
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


    // $ANTLR start "entryRuleFunction"
    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:142:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:143:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:144:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction209);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction219); 

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:151:1: ruleFunction returns [EObject current=null] : ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_variableDeclaration_9_0= ruleVariableDeclaration ) ) otherlv_10= '}' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_variableDeclaration_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:154:28: ( ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_variableDeclaration_9_0= ruleVariableDeclaration ) ) otherlv_10= '}' ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:155:1: ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_variableDeclaration_9_0= ruleVariableDeclaration ) ) otherlv_10= '}' )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:155:1: ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_variableDeclaration_9_0= ruleVariableDeclaration ) ) otherlv_10= '}' )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:155:2: () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_variableDeclaration_9_0= ruleVariableDeclaration ) ) otherlv_10= '}'
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:155:2: ()
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:156:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFunctionAccess().getFunctionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleFunction265); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getFunctionKeyword_1());
                
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:165:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:166:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:166:1: (lv_name_2_0= RULE_ID )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:167:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction282); 

            			newLeafNode(lv_name_2_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleFunction299); 

                	newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3());
                
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:187:1: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:187:2: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:187:2: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:188:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:188:1: (lv_parameters_4_0= ruleParameter )
                    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:189:3: lv_parameters_4_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleFunction321);
                    lv_parameters_4_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_4_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:205:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:205:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleFunction334); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:209:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:210:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:210:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:211:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleFunction355);
                    	    lv_parameters_6_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_6_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleFunction371); 

                	newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_5());
                
            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleFunction383); 

                	newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:235:1: ( (lv_variableDeclaration_9_0= ruleVariableDeclaration ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:236:1: (lv_variableDeclaration_9_0= ruleVariableDeclaration )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:236:1: (lv_variableDeclaration_9_0= ruleVariableDeclaration )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:237:3: lv_variableDeclaration_9_0= ruleVariableDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getFunctionAccess().getVariableDeclarationVariableDeclarationParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleFunction404);
            lv_variableDeclaration_9_0=ruleVariableDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionRule());
            	        }
                   		set(
                   			current, 
                   			"variableDeclaration",
                    		lv_variableDeclaration_9_0, 
                    		"VariableDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleFunction416); 

                	newLeafNode(otherlv_10, grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:265:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:266:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:267:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration452);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration462); 

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:274:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_entityAttribute_3_0= ruleEntityAttribute ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_entityAttribute_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:277:28: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_entityAttribute_3_0= ruleEntityAttribute ) ) ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:278:1: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_entityAttribute_3_0= ruleEntityAttribute ) ) )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:278:1: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_entityAttribute_3_0= ruleEntityAttribute ) ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:278:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_entityAttribute_3_0= ruleEntityAttribute ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleVariableDeclaration499); 

                	newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
                
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:282:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:283:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:283:1: (lv_name_1_0= RULE_ID )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:284:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration516); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleVariableDeclaration533); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
                
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:304:1: ( (lv_entityAttribute_3_0= ruleEntityAttribute ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:305:1: (lv_entityAttribute_3_0= ruleEntityAttribute )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:305:1: (lv_entityAttribute_3_0= ruleEntityAttribute )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:306:3: lv_entityAttribute_3_0= ruleEntityAttribute
            {
             
            	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getEntityAttributeEntityAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEntityAttribute_in_ruleVariableDeclaration554);
            lv_entityAttribute_3_0=ruleEntityAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"entityAttribute",
                    		lv_entityAttribute_3_0, 
                    		"EntityAttribute");
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleEntityAttribute"
    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:330:1: entryRuleEntityAttribute returns [EObject current=null] : iv_ruleEntityAttribute= ruleEntityAttribute EOF ;
    public final EObject entryRuleEntityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityAttribute = null;


        try {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:331:2: (iv_ruleEntityAttribute= ruleEntityAttribute EOF )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:332:2: iv_ruleEntityAttribute= ruleEntityAttribute EOF
            {
             newCompositeNode(grammarAccess.getEntityAttributeRule()); 
            pushFollow(FOLLOW_ruleEntityAttribute_in_entryRuleEntityAttribute590);
            iv_ruleEntityAttribute=ruleEntityAttribute();

            state._fsp--;

             current =iv_ruleEntityAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityAttribute600); 

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
    // $ANTLR end "entryRuleEntityAttribute"


    // $ANTLR start "ruleEntityAttribute"
    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:339:1: ruleEntityAttribute returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( () otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )* ) ;
    public final EObject ruleEntityAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:342:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( () otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )* ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:343:1: ( () ( (otherlv_1= RULE_ID ) ) ( () otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )* )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:343:1: ( () ( (otherlv_1= RULE_ID ) ) ( () otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )* )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:343:2: () ( (otherlv_1= RULE_ID ) ) ( () otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )*
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:343:2: ()
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:344:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityAttributeAccess().getEntityAttributeAction_0(),
                        current);
                

            }

            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:349:2: ( (otherlv_1= RULE_ID ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:350:1: (otherlv_1= RULE_ID )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:350:1: (otherlv_1= RULE_ID )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:351:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityAttributeRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityAttribute654); 

            		newLeafNode(otherlv_1, grammarAccess.getEntityAttributeAccess().getEntityReferenceParameterCrossReference_1_0()); 
            	

            }


            }

            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:362:2: ( () otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:362:3: () otherlv_3= '.' ( (otherlv_4= RULE_ID ) )
            	    {
            	    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:362:3: ()
            	    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:363:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEntityAttributeAccess().getEntityAttributeRefAction_2_0(),
            	                current);
            	        

            	    }

            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleEntityAttribute676); 

            	        	newLeafNode(otherlv_3, grammarAccess.getEntityAttributeAccess().getFullStopKeyword_2_1());
            	        
            	    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:372:1: ( (otherlv_4= RULE_ID ) )
            	    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:373:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:373:1: (otherlv_4= RULE_ID )
            	    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:374:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEntityAttributeRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityAttribute696); 

            	    		newLeafNode(otherlv_4, grammarAccess.getEntityAttributeAccess().getAttributeAttributeCrossReference_2_2_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleEntityAttribute"


    // $ANTLR start "entryRuleParameter"
    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:393:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:394:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:395:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter734);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter744); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:402:1: ruleParameter returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_array_2_0= '[]' ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_array_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:405:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_array_2_0= '[]' ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:406:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_array_2_0= '[]' ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:406:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_array_2_0= '[]' ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:406:2: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_array_2_0= '[]' ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:406:2: ()
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:407:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterAccess().getParameterAction_0(),
                        current);
                

            }

            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:412:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:413:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:413:1: (lv_name_1_0= RULE_ID )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:414:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter795); 

            			newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:430:2: ( (lv_array_2_0= '[]' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:431:1: (lv_array_2_0= '[]' )
                    {
                    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:431:1: (lv_array_2_0= '[]' )
                    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:432:3: lv_array_2_0= '[]'
                    {
                    lv_array_2_0=(Token)match(input,20,FOLLOW_20_in_ruleParameter818); 

                            newLeafNode(lv_array_2_0, grammarAccess.getParameterAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(current, "array", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleParameter844); 

                	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getColonKeyword_3());
                
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:449:1: ( (otherlv_4= RULE_ID ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:450:1: (otherlv_4= RULE_ID )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:450:1: (otherlv_4= RULE_ID )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:451:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter864); 

            		newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getDataTypeEntityCrossReference_4_0()); 
            	

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleNamespaceDeclaration"
    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:470:1: entryRuleNamespaceDeclaration returns [EObject current=null] : iv_ruleNamespaceDeclaration= ruleNamespaceDeclaration EOF ;
    public final EObject entryRuleNamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceDeclaration = null;


        try {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:471:2: (iv_ruleNamespaceDeclaration= ruleNamespaceDeclaration EOF )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:472:2: iv_ruleNamespaceDeclaration= ruleNamespaceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getNamespaceDeclarationRule()); 
            pushFollow(FOLLOW_ruleNamespaceDeclaration_in_entryRuleNamespaceDeclaration900);
            iv_ruleNamespaceDeclaration=ruleNamespaceDeclaration();

            state._fsp--;

             current =iv_ruleNamespaceDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceDeclaration910); 

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
    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:479:1: ruleNamespaceDeclaration returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) ) ;
    public final EObject ruleNamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:482:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:483:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:483:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:483:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleNamespaceDeclaration947); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0());
                
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:487:1: ( (lv_name_1_0= ruleQualifedName ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:488:1: (lv_name_1_0= ruleQualifedName )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:488:1: (lv_name_1_0= ruleQualifedName )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:489:3: lv_name_1_0= ruleQualifedName
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getNameQualifedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifedName_in_ruleNamespaceDeclaration968);
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
    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:513:1: entryRuleImportDeclaration returns [EObject current=null] : iv_ruleImportDeclaration= ruleImportDeclaration EOF ;
    public final EObject entryRuleImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDeclaration = null;


        try {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:514:2: (iv_ruleImportDeclaration= ruleImportDeclaration EOF )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:515:2: iv_ruleImportDeclaration= ruleImportDeclaration EOF
            {
             newCompositeNode(grammarAccess.getImportDeclarationRule()); 
            pushFollow(FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration1004);
            iv_ruleImportDeclaration=ruleImportDeclaration();

            state._fsp--;

             current =iv_ruleImportDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDeclaration1014); 

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
    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:522:1: ruleImportDeclaration returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ) ;
    public final EObject ruleImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:525:28: ( ( () ( (lv_imports_1_0= ruleImport ) )* ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:526:1: ( () ( (lv_imports_1_0= ruleImport ) )* )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:526:1: ( () ( (lv_imports_1_0= ruleImport ) )* )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:526:2: () ( (lv_imports_1_0= ruleImport ) )*
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:526:2: ()
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:527:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImportDeclarationAccess().getImportDeclarationAction_0(),
                        current);
                

            }

            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:532:2: ( (lv_imports_1_0= ruleImport ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:533:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:533:1: (lv_imports_1_0= ruleImport )
            	    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:534:3: lv_imports_1_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImportDeclarationAccess().getImportsImportParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleImportDeclaration1069);
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
    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:558:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:559:2: (iv_ruleImport= ruleImport EOF )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:560:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport1106);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport1116); 

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
    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:567:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:570:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) ) ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:571:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) ) )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:571:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:571:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleImport1153); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:575:1: ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:576:1: (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:576:1: (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:577:3: lv_importedNamespace_1_0= ruleQualifedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifedNameWithWildcard_in_ruleImport1174);
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
    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:601:1: entryRuleQualifedName returns [String current=null] : iv_ruleQualifedName= ruleQualifedName EOF ;
    public final String entryRuleQualifedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifedName = null;


        try {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:602:2: (iv_ruleQualifedName= ruleQualifedName EOF )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:603:2: iv_ruleQualifedName= ruleQualifedName EOF
            {
             newCompositeNode(grammarAccess.getQualifedNameRule()); 
            pushFollow(FOLLOW_ruleQualifedName_in_entryRuleQualifedName1211);
            iv_ruleQualifedName=ruleQualifedName();

            state._fsp--;

             current =iv_ruleQualifedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifedName1222); 

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
    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:610:1: ruleQualifedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:613:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:614:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:614:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:614:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifedName1262); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:621:1: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:622:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleQualifedName1281); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifedName1296); 

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
    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:642:1: entryRuleQualifedNameWithWildcard returns [String current=null] : iv_ruleQualifedNameWithWildcard= ruleQualifedNameWithWildcard EOF ;
    public final String entryRuleQualifedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifedNameWithWildcard = null;


        try {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:643:2: (iv_ruleQualifedNameWithWildcard= ruleQualifedNameWithWildcard EOF )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:644:2: iv_ruleQualifedNameWithWildcard= ruleQualifedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifedNameWithWildcard_in_entryRuleQualifedNameWithWildcard1344);
            iv_ruleQualifedNameWithWildcard=ruleQualifedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifedNameWithWildcard1355); 

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
    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:651:1: ruleQualifedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifedName_0= ruleQualifedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:654:28: ( (this_QualifedName_0= ruleQualifedName (kw= '.*' )? ) )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:655:1: (this_QualifedName_0= ruleQualifedName (kw= '.*' )? )
            {
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:655:1: (this_QualifedName_0= ruleQualifedName (kw= '.*' )? )
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:656:5: this_QualifedName_0= ruleQualifedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifedNameWithWildcardAccess().getQualifedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifedName_in_ruleQualifedNameWithWildcard1402);
            this_QualifedName_0=ruleQualifedName();

            state._fsp--;


            		current.merge(this_QualifedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:666:1: (kw= '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.neclipse.xtext.functiondsl/src-gen/org/neclipse/xtext/functiondsl/parser/antlr/internal/InternalFunctionDsl.g:667:2: kw= '.*'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleQualifedNameWithWildcard1421); 

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
    public static final BitSet FOLLOW_ruleFunction_in_ruleNamespaceDefinition173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleFunction265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction282 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunction299 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunction321 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleFunction334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunction355 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleFunction371 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunction383 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFunction404 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunction416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleVariableDeclaration499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration516 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDeclaration533 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEntityAttribute_in_ruleVariableDeclaration554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityAttribute_in_entryRuleEntityAttribute590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityAttribute600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityAttribute654 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleEntityAttribute676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityAttribute696 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter795 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleParameter818 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleParameter844 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclaration_in_entryRuleNamespaceDeclaration900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceDeclaration910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleNamespaceDeclaration947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifedName_in_ruleNamespaceDeclaration968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration1004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclaration1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleImportDeclaration1069 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport1106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleImport1153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifedNameWithWildcard_in_ruleImport1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedName_in_entryRuleQualifedName1211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifedName1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifedName1262 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleQualifedName1281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifedName1296 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleQualifedNameWithWildcard_in_entryRuleQualifedNameWithWildcard1344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifedNameWithWildcard1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedName_in_ruleQualifedNameWithWildcard1402 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleQualifedNameWithWildcard1421 = new BitSet(new long[]{0x0000000000000002L});

}