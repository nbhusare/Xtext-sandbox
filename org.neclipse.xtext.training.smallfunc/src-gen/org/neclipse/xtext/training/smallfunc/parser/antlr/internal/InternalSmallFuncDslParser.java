package org.neclipse.xtext.training.smallfunc.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.neclipse.xtext.training.smallfunc.services.SmallFuncDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallFuncDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'import'", "'.'", "'.*'", "'def'", "'('", "','", "')'", "'{'", "'}'", "'String'", "'boolean'", "'int'", "'long'", "'double'"
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
    public String getGrammarFileName() { return "../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g"; }



     	private SmallFuncDslGrammarAccess grammarAccess;
     	
        public InternalSmallFuncDslParser(TokenStream input, SmallFuncDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Namespace";	
       	}
       	
       	@Override
       	protected SmallFuncDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleNamespace"
    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:67:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:68:2: (iv_ruleNamespace= ruleNamespace EOF )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:69:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace75);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace85); 

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
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:76:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_function_3_0= ruleSmallFunction ) ) ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_function_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:79:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_function_3_0= ruleSmallFunction ) ) ) )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:80:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_function_3_0= ruleSmallFunction ) ) )
            {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:80:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_function_3_0= ruleSmallFunction ) ) )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:80:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_function_3_0= ruleSmallFunction ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleNamespace122); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
                
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:84:1: ( (lv_name_1_0= ruleQName ) )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:85:1: (lv_name_1_0= ruleQName )
            {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:85:1: (lv_name_1_0= ruleQName )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:86:3: lv_name_1_0= ruleQName
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceAccess().getNameQNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQName_in_ruleNamespace143);
            lv_name_1_0=ruleQName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:102:2: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:103:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:103:1: (lv_imports_2_0= ruleImport )
            	    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:104:3: lv_imports_2_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleNamespace164);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_2_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:120:3: ( (lv_function_3_0= ruleSmallFunction ) )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:121:1: (lv_function_3_0= ruleSmallFunction )
            {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:121:1: (lv_function_3_0= ruleSmallFunction )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:122:3: lv_function_3_0= ruleSmallFunction
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceAccess().getFunctionSmallFunctionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSmallFunction_in_ruleNamespace186);
            lv_function_3_0=ruleSmallFunction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	        }
                   		set(
                   			current, 
                   			"function",
                    		lv_function_3_0, 
                    		"SmallFunction");
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
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleImport"
    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:146:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:147:2: (iv_ruleImport= ruleImport EOF )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:148:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport222);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport232); 

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
    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:155:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:158:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) ) ) )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:159:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) ) )
            {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:159:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) ) )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:159:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport269); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:163:1: ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:164:1: (lv_importedNamespace_1_0= ruleQNameWithWildcard )
            {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:164:1: (lv_importedNamespace_1_0= ruleQNameWithWildcard )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:165:3: lv_importedNamespace_1_0= ruleQNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQNameWithWildcard_in_ruleImport290);
            lv_importedNamespace_1_0=ruleQNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QNameWithWildcard");
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


    // $ANTLR start "entryRuleQName"
    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:189:1: entryRuleQName returns [String current=null] : iv_ruleQName= ruleQName EOF ;
    public final String entryRuleQName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQName = null;


        try {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:190:2: (iv_ruleQName= ruleQName EOF )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:191:2: iv_ruleQName= ruleQName EOF
            {
             newCompositeNode(grammarAccess.getQNameRule()); 
            pushFollow(FOLLOW_ruleQName_in_entryRuleQName327);
            iv_ruleQName=ruleQName();

            state._fsp--;

             current =iv_ruleQName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQName338); 

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
    // $ANTLR end "entryRuleQName"


    // $ANTLR start "ruleQName"
    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:198:1: ruleQName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:201:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:202:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:202:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:202:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQName378); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:209:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:210:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleQName397); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQName412); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleQName"


    // $ANTLR start "entryRuleQNameWithWildcard"
    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:230:1: entryRuleQNameWithWildcard returns [String current=null] : iv_ruleQNameWithWildcard= ruleQNameWithWildcard EOF ;
    public final String entryRuleQNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQNameWithWildcard = null;


        try {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:231:2: (iv_ruleQNameWithWildcard= ruleQNameWithWildcard EOF )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:232:2: iv_ruleQNameWithWildcard= ruleQNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQNameWithWildcard_in_entryRuleQNameWithWildcard460);
            iv_ruleQNameWithWildcard=ruleQNameWithWildcard();

            state._fsp--;

             current =iv_ruleQNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQNameWithWildcard471); 

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
    // $ANTLR end "entryRuleQNameWithWildcard"


    // $ANTLR start "ruleQNameWithWildcard"
    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:239:1: ruleQNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QName_0= ruleQName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QName_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:242:28: ( (this_QName_0= ruleQName (kw= '.*' )? ) )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:243:1: (this_QName_0= ruleQName (kw= '.*' )? )
            {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:243:1: (this_QName_0= ruleQName (kw= '.*' )? )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:244:5: this_QName_0= ruleQName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQNameWithWildcardAccess().getQNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQName_in_ruleQNameWithWildcard518);
            this_QName_0=ruleQName();

            state._fsp--;


            		current.merge(this_QName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:254:1: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:255:2: kw= '.*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQNameWithWildcard537); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

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
    // $ANTLR end "ruleQNameWithWildcard"


    // $ANTLR start "entryRuleSmallFunction"
    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:268:1: entryRuleSmallFunction returns [EObject current=null] : iv_ruleSmallFunction= ruleSmallFunction EOF ;
    public final EObject entryRuleSmallFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmallFunction = null;


        try {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:269:2: (iv_ruleSmallFunction= ruleSmallFunction EOF )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:270:2: iv_ruleSmallFunction= ruleSmallFunction EOF
            {
             newCompositeNode(grammarAccess.getSmallFunctionRule()); 
            pushFollow(FOLLOW_ruleSmallFunction_in_entryRuleSmallFunction579);
            iv_ruleSmallFunction=ruleSmallFunction();

            state._fsp--;

             current =iv_ruleSmallFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallFunction589); 

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
    // $ANTLR end "entryRuleSmallFunction"


    // $ANTLR start "ruleSmallFunction"
    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:277:1: ruleSmallFunction returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* otherlv_6= ')' otherlv_7= '{' otherlv_8= '}' ) ;
    public final EObject ruleSmallFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:280:28: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* otherlv_6= ')' otherlv_7= '{' otherlv_8= '}' ) )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:281:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* otherlv_6= ')' otherlv_7= '{' otherlv_8= '}' )
            {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:281:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* otherlv_6= ')' otherlv_7= '{' otherlv_8= '}' )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:281:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* otherlv_6= ')' otherlv_7= '{' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSmallFunction626); 

                	newLeafNode(otherlv_0, grammarAccess.getSmallFunctionAccess().getDefKeyword_0());
                
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:285:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:286:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:286:1: (lv_name_1_0= RULE_ID )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:287:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmallFunction643); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSmallFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSmallFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSmallFunction660); 

                	newLeafNode(otherlv_2, grammarAccess.getSmallFunctionAccess().getLeftParenthesisKeyword_2());
                
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:307:1: ( (lv_params_3_0= ruleParam ) )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:308:1: (lv_params_3_0= ruleParam )
            {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:308:1: (lv_params_3_0= ruleParam )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:309:3: lv_params_3_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getSmallFunctionAccess().getParamsParamParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleSmallFunction681);
            lv_params_3_0=ruleParam();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSmallFunctionRule());
            	        }
                   		add(
                   			current, 
                   			"params",
                    		lv_params_3_0, 
                    		"Param");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:325:2: (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:325:4: otherlv_4= ',' ( (lv_params_5_0= ruleParam ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSmallFunction694); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSmallFunctionAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:329:1: ( (lv_params_5_0= ruleParam ) )
            	    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:330:1: (lv_params_5_0= ruleParam )
            	    {
            	    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:330:1: (lv_params_5_0= ruleParam )
            	    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:331:3: lv_params_5_0= ruleParam
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSmallFunctionAccess().getParamsParamParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParam_in_ruleSmallFunction715);
            	    lv_params_5_0=ruleParam();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSmallFunctionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"params",
            	            		lv_params_5_0, 
            	            		"Param");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleSmallFunction729); 

                	newLeafNode(otherlv_6, grammarAccess.getSmallFunctionAccess().getRightParenthesisKeyword_5());
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleSmallFunction741); 

                	newLeafNode(otherlv_7, grammarAccess.getSmallFunctionAccess().getLeftCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleSmallFunction753); 

                	newLeafNode(otherlv_8, grammarAccess.getSmallFunctionAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleSmallFunction"


    // $ANTLR start "entryRuleParam"
    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:367:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:368:2: (iv_ruleParam= ruleParam EOF )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:369:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam789);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam799); 

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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:376:1: ruleParam returns [EObject current=null] : ( ( (lv_dataType_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_dataType_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:379:28: ( ( ( (lv_dataType_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:380:1: ( ( (lv_dataType_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:380:1: ( ( (lv_dataType_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:380:2: ( (lv_dataType_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:380:2: ( (lv_dataType_0_0= ruleDataType ) )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:381:1: (lv_dataType_0_0= ruleDataType )
            {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:381:1: (lv_dataType_0_0= ruleDataType )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:382:3: lv_dataType_0_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getParamAccess().getDataTypeDataTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleParam845);
            lv_dataType_0_0=ruleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParamRule());
            	        }
                   		set(
                   			current, 
                   			"dataType",
                    		lv_dataType_0_0, 
                    		"DataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:398:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:399:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:399:1: (lv_name_1_0= RULE_ID )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:400:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParam862); 

            			newLeafNode(lv_name_1_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParamRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleDataType"
    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:424:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:425:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:426:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType903);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType913); 

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
    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:433:1: ruleDataType returns [EObject current=null] : ( ( () ruleBasicType ) | this_ClassType_2= ruleClassType ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_ClassType_2 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:436:28: ( ( ( () ruleBasicType ) | this_ClassType_2= ruleClassType ) )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:437:1: ( ( () ruleBasicType ) | this_ClassType_2= ruleClassType )
            {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:437:1: ( ( () ruleBasicType ) | this_ClassType_2= ruleClassType )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=21 && LA5_0<=25)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:437:2: ( () ruleBasicType )
                    {
                    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:437:2: ( () ruleBasicType )
                    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:437:3: () ruleBasicType
                    {
                    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:437:3: ()
                    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:438:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDataTypeAccess().getDataTypeAction_0_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getBasicTypeParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleBasicType_in_ruleDataType964);
                    ruleBasicType();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:453:5: this_ClassType_2= ruleClassType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getClassTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleClassType_in_ruleDataType992);
                    this_ClassType_2=ruleClassType();

                    state._fsp--;

                     
                            current = this_ClassType_2; 
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


    // $ANTLR start "entryRuleBasicType"
    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:469:1: entryRuleBasicType returns [String current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final String entryRuleBasicType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicType = null;


        try {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:470:2: (iv_ruleBasicType= ruleBasicType EOF )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:471:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType1028);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType1039); 

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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:478:1: ruleBasicType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'boolean' | kw= 'int' | kw= 'long' | kw= 'double' ) ;
    public final AntlrDatatypeRuleToken ruleBasicType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:481:28: ( (kw= 'String' | kw= 'boolean' | kw= 'int' | kw= 'long' | kw= 'double' ) )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:482:1: (kw= 'String' | kw= 'boolean' | kw= 'int' | kw= 'long' | kw= 'double' )
            {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:482:1: (kw= 'String' | kw= 'boolean' | kw= 'int' | kw= 'long' | kw= 'double' )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            case 24:
                {
                alt6=4;
                }
                break;
            case 25:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:483:2: kw= 'String'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleBasicType1077); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getStringKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:490:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleBasicType1096); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getBooleanKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:497:2: kw= 'int'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleBasicType1115); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getIntKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:504:2: kw= 'long'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleBasicType1134); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getLongKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:511:2: kw= 'double'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleBasicType1153); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getDoubleKeyword_4()); 
                        

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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleClassType"
    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:524:1: entryRuleClassType returns [EObject current=null] : iv_ruleClassType= ruleClassType EOF ;
    public final EObject entryRuleClassType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassType = null;


        try {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:525:2: (iv_ruleClassType= ruleClassType EOF )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:526:2: iv_ruleClassType= ruleClassType EOF
            {
             newCompositeNode(grammarAccess.getClassTypeRule()); 
            pushFollow(FOLLOW_ruleClassType_in_entryRuleClassType1193);
            iv_ruleClassType=ruleClassType();

            state._fsp--;

             current =iv_ruleClassType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassType1203); 

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
    // $ANTLR end "entryRuleClassType"


    // $ANTLR start "ruleClassType"
    // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:533:1: ruleClassType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleClassType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:536:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:537:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:537:1: ( (otherlv_0= RULE_ID ) )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:538:1: (otherlv_0= RULE_ID )
            {
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:538:1: (otherlv_0= RULE_ID )
            // ../org.neclipse.xtext.training.smallfunc/src-gen/org/neclipse/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.g:539:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getClassTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassType1247); 

            		newLeafNode(otherlv_0, grammarAccess.getClassTypeAccess().getTypeSmallClassCrossReference_0()); 
            	

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
    // $ANTLR end "ruleClassType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleNamespace122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQName_in_ruleNamespace143 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_ruleImport_in_ruleNamespace164 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_ruleSmallFunction_in_ruleNamespace186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQNameWithWildcard_in_ruleImport290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_entryRuleQName327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQName338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQName378 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQName397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQName412 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleQNameWithWildcard_in_entryRuleQNameWithWildcard460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQNameWithWildcard471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleQNameWithWildcard518 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQNameWithWildcard537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallFunction_in_entryRuleSmallFunction579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallFunction589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSmallFunction626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmallFunction643 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSmallFunction660 = new BitSet(new long[]{0x0000000003E00010L});
    public static final BitSet FOLLOW_ruleParam_in_ruleSmallFunction681 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleSmallFunction694 = new BitSet(new long[]{0x0000000003E00010L});
    public static final BitSet FOLLOW_ruleParam_in_ruleSmallFunction715 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleSmallFunction729 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSmallFunction741 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSmallFunction753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleParam845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParam862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleDataType964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassType_in_ruleDataType992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBasicType1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBasicType1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleBasicType1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBasicType1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBasicType1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassType_in_entryRuleClassType1193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassType1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassType1247 = new BitSet(new long[]{0x0000000000000002L});

}