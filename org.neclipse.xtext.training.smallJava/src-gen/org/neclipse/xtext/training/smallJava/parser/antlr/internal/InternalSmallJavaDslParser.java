package org.neclipse.xtext.training.smallJava.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.neclipse.xtext.training.smallJava.services.SmallJavaDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallJavaDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'import'", "'.'", "'.*'", "'class'", "'extends'", "'{'", "'}'", "'[]'", "'String'", "'boolean'", "'int'", "'long'", "'double'"
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
    public String getGrammarFileName() { return "../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g"; }



     	private SmallJavaDslGrammarAccess grammarAccess;
     	
        public InternalSmallJavaDslParser(TokenStream input, SmallJavaDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Namespace";	
       	}
       	
       	@Override
       	protected SmallJavaDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleNamespace"
    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:67:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:68:2: (iv_ruleNamespace= ruleNamespace EOF )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:69:2: iv_ruleNamespace= ruleNamespace EOF
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
    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:76:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_class_3_0= ruleSmallClass ) ) ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_class_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:79:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_class_3_0= ruleSmallClass ) ) ) )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:80:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_class_3_0= ruleSmallClass ) ) )
            {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:80:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_class_3_0= ruleSmallClass ) ) )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:80:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_class_3_0= ruleSmallClass ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleNamespace122); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
                
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:84:1: ( (lv_name_1_0= ruleQName ) )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:85:1: (lv_name_1_0= ruleQName )
            {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:85:1: (lv_name_1_0= ruleQName )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:86:3: lv_name_1_0= ruleQName
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

            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:102:2: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:103:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:103:1: (lv_imports_2_0= ruleImport )
            	    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:104:3: lv_imports_2_0= ruleImport
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

            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:120:3: ( (lv_class_3_0= ruleSmallClass ) )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:121:1: (lv_class_3_0= ruleSmallClass )
            {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:121:1: (lv_class_3_0= ruleSmallClass )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:122:3: lv_class_3_0= ruleSmallClass
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceAccess().getClassSmallClassParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSmallClass_in_ruleNamespace186);
            lv_class_3_0=ruleSmallClass();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	        }
                   		set(
                   			current, 
                   			"class",
                    		lv_class_3_0, 
                    		"SmallClass");
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
    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:146:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:147:2: (iv_ruleImport= ruleImport EOF )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:148:2: iv_ruleImport= ruleImport EOF
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
    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:155:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:158:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) ) ) )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:159:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) ) )
            {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:159:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) ) )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:159:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport269); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:163:1: ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:164:1: (lv_importedNamespace_1_0= ruleQNameWithWildcard )
            {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:164:1: (lv_importedNamespace_1_0= ruleQNameWithWildcard )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:165:3: lv_importedNamespace_1_0= ruleQNameWithWildcard
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
    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:189:1: entryRuleQName returns [String current=null] : iv_ruleQName= ruleQName EOF ;
    public final String entryRuleQName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQName = null;


        try {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:190:2: (iv_ruleQName= ruleQName EOF )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:191:2: iv_ruleQName= ruleQName EOF
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
    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:198:1: ruleQName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:201:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:202:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:202:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:202:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQName378); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:209:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:210:2: kw= '.' this_ID_2= RULE_ID
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
    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:230:1: entryRuleQNameWithWildcard returns [String current=null] : iv_ruleQNameWithWildcard= ruleQNameWithWildcard EOF ;
    public final String entryRuleQNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQNameWithWildcard = null;


        try {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:231:2: (iv_ruleQNameWithWildcard= ruleQNameWithWildcard EOF )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:232:2: iv_ruleQNameWithWildcard= ruleQNameWithWildcard EOF
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
    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:239:1: ruleQNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QName_0= ruleQName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QName_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:242:28: ( (this_QName_0= ruleQName (kw= '.*' )? ) )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:243:1: (this_QName_0= ruleQName (kw= '.*' )? )
            {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:243:1: (this_QName_0= ruleQName (kw= '.*' )? )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:244:5: this_QName_0= ruleQName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQNameWithWildcardAccess().getQNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQName_in_ruleQNameWithWildcard518);
            this_QName_0=ruleQName();

            state._fsp--;


            		current.merge(this_QName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:254:1: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:255:2: kw= '.*'
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


    // $ANTLR start "entryRuleSmallClass"
    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:268:1: entryRuleSmallClass returns [EObject current=null] : iv_ruleSmallClass= ruleSmallClass EOF ;
    public final EObject entryRuleSmallClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmallClass = null;


        try {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:269:2: (iv_ruleSmallClass= ruleSmallClass EOF )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:270:2: iv_ruleSmallClass= ruleSmallClass EOF
            {
             newCompositeNode(grammarAccess.getSmallClassRule()); 
            pushFollow(FOLLOW_ruleSmallClass_in_entryRuleSmallClass579);
            iv_ruleSmallClass=ruleSmallClass();

            state._fsp--;

             current =iv_ruleSmallClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallClass589); 

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
    // $ANTLR end "entryRuleSmallClass"


    // $ANTLR start "ruleSmallClass"
    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:277:1: ruleSmallClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) ;
    public final EObject ruleSmallClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:280:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:281:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:281:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:281:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSmallClass626); 

                	newLeafNode(otherlv_0, grammarAccess.getSmallClassAccess().getClassKeyword_0());
                
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:285:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:286:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:286:1: (lv_name_1_0= RULE_ID )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:287:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmallClass643); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSmallClassAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSmallClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:303:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:303:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSmallClass661); 

                        	newLeafNode(otherlv_2, grammarAccess.getSmallClassAccess().getExtendsKeyword_2_0());
                        
                    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:307:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:308:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:308:1: (otherlv_3= RULE_ID )
                    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:309:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSmallClassRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmallClass681); 

                    		newLeafNode(otherlv_3, grammarAccess.getSmallClassAccess().getSuperClassSmallClassCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSmallClass695); 

                	newLeafNode(otherlv_4, grammarAccess.getSmallClassAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:324:1: ( (lv_attributes_5_0= ruleAttribute ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=20 && LA5_0<=24)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:325:1: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:325:1: (lv_attributes_5_0= ruleAttribute )
            	    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:326:3: lv_attributes_5_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSmallClassAccess().getAttributesAttributeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleSmallClass716);
            	    lv_attributes_5_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSmallClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_5_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleSmallClass729); 

                	newLeafNode(otherlv_6, grammarAccess.getSmallClassAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleSmallClass"


    // $ANTLR start "entryRuleAttribute"
    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:354:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:355:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:356:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute765);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute775); 

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
    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:363:1: ruleAttribute returns [EObject current=null] : ( ( (lv_datatype_0_0= ruleDataType ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_array_1_0=null;
        Token lv_name_2_0=null;
        EObject lv_datatype_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:366:28: ( ( ( (lv_datatype_0_0= ruleDataType ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:367:1: ( ( (lv_datatype_0_0= ruleDataType ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:367:1: ( ( (lv_datatype_0_0= ruleDataType ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:367:2: ( (lv_datatype_0_0= ruleDataType ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:367:2: ( (lv_datatype_0_0= ruleDataType ) )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:368:1: (lv_datatype_0_0= ruleDataType )
            {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:368:1: (lv_datatype_0_0= ruleDataType )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:369:3: lv_datatype_0_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getDatatypeDataTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleAttribute821);
            lv_datatype_0_0=ruleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"datatype",
                    		lv_datatype_0_0, 
                    		"DataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:385:2: ( (lv_array_1_0= '[]' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:386:1: (lv_array_1_0= '[]' )
                    {
                    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:386:1: (lv_array_1_0= '[]' )
                    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:387:3: lv_array_1_0= '[]'
                    {
                    lv_array_1_0=(Token)match(input,19,FOLLOW_19_in_ruleAttribute839); 

                            newLeafNode(lv_array_1_0, grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "array", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:400:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:401:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:401:1: (lv_name_2_0= RULE_ID )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:402:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute870); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDataType"
    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:426:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:427:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:428:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType911);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType921); 

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
    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:435:1: ruleDataType returns [EObject current=null] : ( ( () ruleBasicType ) | this_ClassType_2= ruleClassType ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_ClassType_2 = null;


         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:438:28: ( ( ( () ruleBasicType ) | this_ClassType_2= ruleClassType ) )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:439:1: ( ( () ruleBasicType ) | this_ClassType_2= ruleClassType )
            {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:439:1: ( ( () ruleBasicType ) | this_ClassType_2= ruleClassType )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=20 && LA7_0<=24)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:439:2: ( () ruleBasicType )
                    {
                    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:439:2: ( () ruleBasicType )
                    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:439:3: () ruleBasicType
                    {
                    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:439:3: ()
                    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:440:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDataTypeAccess().getDataTypeAction_0_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getBasicTypeParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleBasicType_in_ruleDataType972);
                    ruleBasicType();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:455:5: this_ClassType_2= ruleClassType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getClassTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleClassType_in_ruleDataType1000);
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
    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:471:1: entryRuleBasicType returns [String current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final String entryRuleBasicType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicType = null;


        try {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:472:2: (iv_ruleBasicType= ruleBasicType EOF )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:473:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType1036);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType1047); 

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
    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:480:1: ruleBasicType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'boolean' | kw= 'int' | kw= 'long' | kw= 'double' ) ;
    public final AntlrDatatypeRuleToken ruleBasicType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:483:28: ( (kw= 'String' | kw= 'boolean' | kw= 'int' | kw= 'long' | kw= 'double' ) )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:484:1: (kw= 'String' | kw= 'boolean' | kw= 'int' | kw= 'long' | kw= 'double' )
            {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:484:1: (kw= 'String' | kw= 'boolean' | kw= 'int' | kw= 'long' | kw= 'double' )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            case 24:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:485:2: kw= 'String'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleBasicType1085); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getStringKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:492:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleBasicType1104); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getBooleanKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:499:2: kw= 'int'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleBasicType1123); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getIntKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:506:2: kw= 'long'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleBasicType1142); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getLongKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:513:2: kw= 'double'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleBasicType1161); 

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
    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:526:1: entryRuleClassType returns [EObject current=null] : iv_ruleClassType= ruleClassType EOF ;
    public final EObject entryRuleClassType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassType = null;


        try {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:527:2: (iv_ruleClassType= ruleClassType EOF )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:528:2: iv_ruleClassType= ruleClassType EOF
            {
             newCompositeNode(grammarAccess.getClassTypeRule()); 
            pushFollow(FOLLOW_ruleClassType_in_entryRuleClassType1201);
            iv_ruleClassType=ruleClassType();

            state._fsp--;

             current =iv_ruleClassType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassType1211); 

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
    // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:535:1: ruleClassType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleClassType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:538:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:539:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:539:1: ( (otherlv_0= RULE_ID ) )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:540:1: (otherlv_0= RULE_ID )
            {
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:540:1: (otherlv_0= RULE_ID )
            // ../org.neclipse.xtext.training.smallJava/src-gen/org/neclipse/xtext/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:541:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getClassTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassType1255); 

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
    public static final BitSet FOLLOW_ruleSmallClass_in_ruleNamespace186 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleSmallClass_in_entryRuleSmallClass579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallClass589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSmallClass626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmallClass643 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleSmallClass661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmallClass681 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSmallClass695 = new BitSet(new long[]{0x0000000001F40010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleSmallClass716 = new BitSet(new long[]{0x0000000001F40010L});
    public static final BitSet FOLLOW_18_in_ruleSmallClass729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleAttribute821 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleAttribute839 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleDataType972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassType_in_ruleDataType1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType1036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBasicType1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBasicType1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBasicType1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleBasicType1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBasicType1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassType_in_entryRuleClassType1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassType1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassType1255 = new BitSet(new long[]{0x0000000000000002L});

}