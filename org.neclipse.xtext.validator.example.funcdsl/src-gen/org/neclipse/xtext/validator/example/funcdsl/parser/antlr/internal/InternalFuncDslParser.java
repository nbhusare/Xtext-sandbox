package org.neclipse.xtext.validator.example.funcdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.neclipse.xtext.validator.example.funcdsl.services.FuncDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/*******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
@SuppressWarnings("all")
public class InternalFuncDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'import'", "'.'", "'.*'", "'func'", "'('", "','", "')'", "'{'", "'}'", "'String'", "'boolean'", "'int'", "'long'", "'double'"
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


        public InternalFuncDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFuncDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFuncDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFuncDsl.g"; }



     	private FuncDslGrammarAccess grammarAccess;

        public InternalFuncDslParser(TokenStream input, FuncDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Namespace";
       	}

       	@Override
       	protected FuncDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNamespace"
    // InternalFuncDsl.g:68:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalFuncDsl.g:68:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalFuncDsl.g:69:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFuncDsl.g:75:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_func_3_0= ruleFunc ) ) ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_func_3_0 = null;



        	enterRule();

        try {
            // InternalFuncDsl.g:81:2: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_func_3_0= ruleFunc ) ) ) )
            // InternalFuncDsl.g:82:2: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_func_3_0= ruleFunc ) ) )
            {
            // InternalFuncDsl.g:82:2: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_func_3_0= ruleFunc ) ) )
            // InternalFuncDsl.g:83:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_func_3_0= ruleFunc ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
            		
            // InternalFuncDsl.g:87:3: ( (lv_name_1_0= ruleQName ) )
            // InternalFuncDsl.g:88:4: (lv_name_1_0= ruleQName )
            {
            // InternalFuncDsl.g:88:4: (lv_name_1_0= ruleQName )
            // InternalFuncDsl.g:89:5: lv_name_1_0= ruleQName
            {

            					newCompositeNode(grammarAccess.getNamespaceAccess().getNameQNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamespaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.neclipse.xtext.validator.example.funcdsl.FuncDsl.QName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFuncDsl.g:106:3: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFuncDsl.g:107:4: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalFuncDsl.g:107:4: (lv_imports_2_0= ruleImport )
            	    // InternalFuncDsl.g:108:5: lv_imports_2_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_2_0,
            	    						"org.neclipse.xtext.validator.example.funcdsl.FuncDsl.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalFuncDsl.g:125:3: ( (lv_func_3_0= ruleFunc ) )
            // InternalFuncDsl.g:126:4: (lv_func_3_0= ruleFunc )
            {
            // InternalFuncDsl.g:126:4: (lv_func_3_0= ruleFunc )
            // InternalFuncDsl.g:127:5: lv_func_3_0= ruleFunc
            {

            					newCompositeNode(grammarAccess.getNamespaceAccess().getFuncFuncParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_func_3_0=ruleFunc();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamespaceRule());
            					}
            					set(
            						current,
            						"func",
            						lv_func_3_0,
            						"org.neclipse.xtext.validator.example.funcdsl.FuncDsl.Func");
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
    // InternalFuncDsl.g:148:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalFuncDsl.g:148:47: (iv_ruleImport= ruleImport EOF )
            // InternalFuncDsl.g:149:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFuncDsl.g:155:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalFuncDsl.g:161:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) ) ) )
            // InternalFuncDsl.g:162:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) ) )
            {
            // InternalFuncDsl.g:162:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) ) )
            // InternalFuncDsl.g:163:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalFuncDsl.g:167:3: ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) )
            // InternalFuncDsl.g:168:4: (lv_importedNamespace_1_0= ruleQNameWithWildcard )
            {
            // InternalFuncDsl.g:168:4: (lv_importedNamespace_1_0= ruleQNameWithWildcard )
            // InternalFuncDsl.g:169:5: lv_importedNamespace_1_0= ruleQNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.neclipse.xtext.validator.example.funcdsl.FuncDsl.QNameWithWildcard");
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
    // InternalFuncDsl.g:190:1: entryRuleQName returns [String current=null] : iv_ruleQName= ruleQName EOF ;
    public final String entryRuleQName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQName = null;


        try {
            // InternalFuncDsl.g:190:45: (iv_ruleQName= ruleQName EOF )
            // InternalFuncDsl.g:191:2: iv_ruleQName= ruleQName EOF
            {
             newCompositeNode(grammarAccess.getQNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQName=ruleQName();

            state._fsp--;

             current =iv_ruleQName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFuncDsl.g:197:1: ruleQName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalFuncDsl.g:203:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalFuncDsl.g:204:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalFuncDsl.g:204:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalFuncDsl.g:205:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalFuncDsl.g:212:3: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFuncDsl.g:213:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_5); 

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
    // InternalFuncDsl.g:230:1: entryRuleQNameWithWildcard returns [String current=null] : iv_ruleQNameWithWildcard= ruleQNameWithWildcard EOF ;
    public final String entryRuleQNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQNameWithWildcard = null;


        try {
            // InternalFuncDsl.g:230:57: (iv_ruleQNameWithWildcard= ruleQNameWithWildcard EOF )
            // InternalFuncDsl.g:231:2: iv_ruleQNameWithWildcard= ruleQNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQNameWithWildcard=ruleQNameWithWildcard();

            state._fsp--;

             current =iv_ruleQNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFuncDsl.g:237:1: ruleQNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QName_0= ruleQName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QName_0 = null;



        	enterRule();

        try {
            // InternalFuncDsl.g:243:2: ( (this_QName_0= ruleQName (kw= '.*' )? ) )
            // InternalFuncDsl.g:244:2: (this_QName_0= ruleQName (kw= '.*' )? )
            {
            // InternalFuncDsl.g:244:2: (this_QName_0= ruleQName (kw= '.*' )? )
            // InternalFuncDsl.g:245:3: this_QName_0= ruleQName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQNameWithWildcardAccess().getQNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_QName_0=ruleQName();

            state._fsp--;


            			current.merge(this_QName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalFuncDsl.g:255:3: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalFuncDsl.g:256:4: kw= '.*'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFunc"
    // InternalFuncDsl.g:266:1: entryRuleFunc returns [EObject current=null] : iv_ruleFunc= ruleFunc EOF ;
    public final EObject entryRuleFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunc = null;


        try {
            // InternalFuncDsl.g:266:45: (iv_ruleFunc= ruleFunc EOF )
            // InternalFuncDsl.g:267:2: iv_ruleFunc= ruleFunc EOF
            {
             newCompositeNode(grammarAccess.getFuncRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunc=ruleFunc();

            state._fsp--;

             current =iv_ruleFunc; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunc"


    // $ANTLR start "ruleFunc"
    // InternalFuncDsl.g:273:1: ruleFunc returns [EObject current=null] : (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* otherlv_6= ')' otherlv_7= '{' otherlv_8= '}' ) ;
    public final EObject ruleFunc() throws RecognitionException {
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
            // InternalFuncDsl.g:279:2: ( (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* otherlv_6= ')' otherlv_7= '{' otherlv_8= '}' ) )
            // InternalFuncDsl.g:280:2: (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* otherlv_6= ')' otherlv_7= '{' otherlv_8= '}' )
            {
            // InternalFuncDsl.g:280:2: (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* otherlv_6= ')' otherlv_7= '{' otherlv_8= '}' )
            // InternalFuncDsl.g:281:3: otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* otherlv_6= ')' otherlv_7= '{' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncAccess().getFuncKeyword_0());
            		
            // InternalFuncDsl.g:285:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFuncDsl.g:286:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFuncDsl.g:286:4: (lv_name_1_0= RULE_ID )
            // InternalFuncDsl.g:287:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFuncAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getFuncAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFuncDsl.g:307:3: ( (lv_params_3_0= ruleParam ) )
            // InternalFuncDsl.g:308:4: (lv_params_3_0= ruleParam )
            {
            // InternalFuncDsl.g:308:4: (lv_params_3_0= ruleParam )
            // InternalFuncDsl.g:309:5: lv_params_3_0= ruleParam
            {

            					newCompositeNode(grammarAccess.getFuncAccess().getParamsParamParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_params_3_0=ruleParam();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncRule());
            					}
            					add(
            						current,
            						"params",
            						lv_params_3_0,
            						"org.neclipse.xtext.validator.example.funcdsl.FuncDsl.Param");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFuncDsl.g:326:3: (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFuncDsl.g:327:4: otherlv_4= ',' ( (lv_params_5_0= ruleParam ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_8); 

            	    				newLeafNode(otherlv_4, grammarAccess.getFuncAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalFuncDsl.g:331:4: ( (lv_params_5_0= ruleParam ) )
            	    // InternalFuncDsl.g:332:5: (lv_params_5_0= ruleParam )
            	    {
            	    // InternalFuncDsl.g:332:5: (lv_params_5_0= ruleParam )
            	    // InternalFuncDsl.g:333:6: lv_params_5_0= ruleParam
            	    {

            	    						newCompositeNode(grammarAccess.getFuncAccess().getParamsParamParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_params_5_0=ruleParam();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFuncRule());
            	    						}
            	    						add(
            	    							current,
            	    							"params",
            	    							lv_params_5_0,
            	    							"org.neclipse.xtext.validator.example.funcdsl.FuncDsl.Param");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getFuncAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getFuncAccess().getLeftCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFuncAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleFunc"


    // $ANTLR start "entryRuleParam"
    // InternalFuncDsl.g:367:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalFuncDsl.g:367:46: (iv_ruleParam= ruleParam EOF )
            // InternalFuncDsl.g:368:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFuncDsl.g:374:1: ruleParam returns [EObject current=null] : ( ( (lv_dataType_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_dataType_0_0 = null;



        	enterRule();

        try {
            // InternalFuncDsl.g:380:2: ( ( ( (lv_dataType_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFuncDsl.g:381:2: ( ( (lv_dataType_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFuncDsl.g:381:2: ( ( (lv_dataType_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFuncDsl.g:382:3: ( (lv_dataType_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFuncDsl.g:382:3: ( (lv_dataType_0_0= ruleDataType ) )
            // InternalFuncDsl.g:383:4: (lv_dataType_0_0= ruleDataType )
            {
            // InternalFuncDsl.g:383:4: (lv_dataType_0_0= ruleDataType )
            // InternalFuncDsl.g:384:5: lv_dataType_0_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getParamAccess().getDataTypeDataTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_dataType_0_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamRule());
            					}
            					set(
            						current,
            						"dataType",
            						lv_dataType_0_0,
            						"org.neclipse.xtext.validator.example.funcdsl.FuncDsl.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFuncDsl.g:401:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFuncDsl.g:402:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFuncDsl.g:402:4: (lv_name_1_0= RULE_ID )
            // InternalFuncDsl.g:403:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // InternalFuncDsl.g:423:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalFuncDsl.g:423:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalFuncDsl.g:424:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFuncDsl.g:430:1: ruleDataType returns [EObject current=null] : ( ( () ruleBasicType ) | this_ClassType_2= ruleClassType ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_ClassType_2 = null;



        	enterRule();

        try {
            // InternalFuncDsl.g:436:2: ( ( ( () ruleBasicType ) | this_ClassType_2= ruleClassType ) )
            // InternalFuncDsl.g:437:2: ( ( () ruleBasicType ) | this_ClassType_2= ruleClassType )
            {
            // InternalFuncDsl.g:437:2: ( ( () ruleBasicType ) | this_ClassType_2= ruleClassType )
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
                    // InternalFuncDsl.g:438:3: ( () ruleBasicType )
                    {
                    // InternalFuncDsl.g:438:3: ( () ruleBasicType )
                    // InternalFuncDsl.g:439:4: () ruleBasicType
                    {
                    // InternalFuncDsl.g:439:4: ()
                    // InternalFuncDsl.g:440:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getDataTypeAction_0_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getDataTypeAccess().getBasicTypeParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleBasicType();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFuncDsl.g:455:3: this_ClassType_2= ruleClassType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getClassTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
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
    // InternalFuncDsl.g:467:1: entryRuleBasicType returns [String current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final String entryRuleBasicType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicType = null;


        try {
            // InternalFuncDsl.g:467:49: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalFuncDsl.g:468:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFuncDsl.g:474:1: ruleBasicType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'boolean' | kw= 'int' | kw= 'long' | kw= 'double' ) ;
    public final AntlrDatatypeRuleToken ruleBasicType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalFuncDsl.g:480:2: ( (kw= 'String' | kw= 'boolean' | kw= 'int' | kw= 'long' | kw= 'double' ) )
            // InternalFuncDsl.g:481:2: (kw= 'String' | kw= 'boolean' | kw= 'int' | kw= 'long' | kw= 'double' )
            {
            // InternalFuncDsl.g:481:2: (kw= 'String' | kw= 'boolean' | kw= 'int' | kw= 'long' | kw= 'double' )
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
                    // InternalFuncDsl.g:482:3: kw= 'String'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFuncDsl.g:488:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getBooleanKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalFuncDsl.g:494:3: kw= 'int'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getIntKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalFuncDsl.g:500:3: kw= 'long'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getLongKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalFuncDsl.g:506:3: kw= 'double'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

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
    // InternalFuncDsl.g:515:1: entryRuleClassType returns [EObject current=null] : iv_ruleClassType= ruleClassType EOF ;
    public final EObject entryRuleClassType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassType = null;


        try {
            // InternalFuncDsl.g:515:50: (iv_ruleClassType= ruleClassType EOF )
            // InternalFuncDsl.g:516:2: iv_ruleClassType= ruleClassType EOF
            {
             newCompositeNode(grammarAccess.getClassTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassType=ruleClassType();

            state._fsp--;

             current =iv_ruleClassType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFuncDsl.g:522:1: ruleClassType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleClassType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalFuncDsl.g:528:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalFuncDsl.g:529:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalFuncDsl.g:529:2: ( (otherlv_0= RULE_ID ) )
            // InternalFuncDsl.g:530:3: (otherlv_0= RULE_ID )
            {
            // InternalFuncDsl.g:530:3: (otherlv_0= RULE_ID )
            // InternalFuncDsl.g:531:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getClassTypeRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getClassTypeAccess().getTypeClazzCrossReference_0());
            			

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003E00010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});

}