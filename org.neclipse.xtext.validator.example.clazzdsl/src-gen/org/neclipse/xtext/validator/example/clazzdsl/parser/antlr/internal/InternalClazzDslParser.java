package org.neclipse.xtext.validator.example.clazzdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.neclipse.xtext.validator.example.clazzdsl.services.ClazzDslGrammarAccess;



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
public class InternalClazzDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'import'", "'.'", "'.*'", "'deprecated'", "'class'", "'{'", "'}'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalClazzDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalClazzDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalClazzDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalClazzDsl.g"; }



     	private ClazzDslGrammarAccess grammarAccess;

        public InternalClazzDslParser(TokenStream input, ClazzDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Namespace";
       	}

       	@Override
       	protected ClazzDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNamespace"
    // InternalClazzDsl.g:68:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalClazzDsl.g:68:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalClazzDsl.g:69:2: iv_ruleNamespace= ruleNamespace EOF
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
    // InternalClazzDsl.g:75:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_clazz_3_0= ruleClazz ) ) ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_clazz_3_0 = null;



        	enterRule();

        try {
            // InternalClazzDsl.g:81:2: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_clazz_3_0= ruleClazz ) ) ) )
            // InternalClazzDsl.g:82:2: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_clazz_3_0= ruleClazz ) ) )
            {
            // InternalClazzDsl.g:82:2: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_clazz_3_0= ruleClazz ) ) )
            // InternalClazzDsl.g:83:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_clazz_3_0= ruleClazz ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
            		
            // InternalClazzDsl.g:87:3: ( (lv_name_1_0= ruleQName ) )
            // InternalClazzDsl.g:88:4: (lv_name_1_0= ruleQName )
            {
            // InternalClazzDsl.g:88:4: (lv_name_1_0= ruleQName )
            // InternalClazzDsl.g:89:5: lv_name_1_0= ruleQName
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
            						"org.neclipse.xtext.validator.example.clazzdsl.ClazzDsl.QName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalClazzDsl.g:106:3: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalClazzDsl.g:107:4: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalClazzDsl.g:107:4: (lv_imports_2_0= ruleImport )
            	    // InternalClazzDsl.g:108:5: lv_imports_2_0= ruleImport
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
            	    						"org.neclipse.xtext.validator.example.clazzdsl.ClazzDsl.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalClazzDsl.g:125:3: ( (lv_clazz_3_0= ruleClazz ) )
            // InternalClazzDsl.g:126:4: (lv_clazz_3_0= ruleClazz )
            {
            // InternalClazzDsl.g:126:4: (lv_clazz_3_0= ruleClazz )
            // InternalClazzDsl.g:127:5: lv_clazz_3_0= ruleClazz
            {

            					newCompositeNode(grammarAccess.getNamespaceAccess().getClazzClazzParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_clazz_3_0=ruleClazz();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamespaceRule());
            					}
            					set(
            						current,
            						"clazz",
            						lv_clazz_3_0,
            						"org.neclipse.xtext.validator.example.clazzdsl.ClazzDsl.Clazz");
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
    // InternalClazzDsl.g:148:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalClazzDsl.g:148:47: (iv_ruleImport= ruleImport EOF )
            // InternalClazzDsl.g:149:2: iv_ruleImport= ruleImport EOF
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
    // InternalClazzDsl.g:155:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalClazzDsl.g:161:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) ) ) )
            // InternalClazzDsl.g:162:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) ) )
            {
            // InternalClazzDsl.g:162:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) ) )
            // InternalClazzDsl.g:163:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalClazzDsl.g:167:3: ( (lv_importedNamespace_1_0= ruleQNameWithWildcard ) )
            // InternalClazzDsl.g:168:4: (lv_importedNamespace_1_0= ruleQNameWithWildcard )
            {
            // InternalClazzDsl.g:168:4: (lv_importedNamespace_1_0= ruleQNameWithWildcard )
            // InternalClazzDsl.g:169:5: lv_importedNamespace_1_0= ruleQNameWithWildcard
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
            						"org.neclipse.xtext.validator.example.clazzdsl.ClazzDsl.QNameWithWildcard");
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
    // InternalClazzDsl.g:190:1: entryRuleQName returns [String current=null] : iv_ruleQName= ruleQName EOF ;
    public final String entryRuleQName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQName = null;


        try {
            // InternalClazzDsl.g:190:45: (iv_ruleQName= ruleQName EOF )
            // InternalClazzDsl.g:191:2: iv_ruleQName= ruleQName EOF
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
    // InternalClazzDsl.g:197:1: ruleQName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalClazzDsl.g:203:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalClazzDsl.g:204:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalClazzDsl.g:204:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalClazzDsl.g:205:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalClazzDsl.g:212:3: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalClazzDsl.g:213:4: kw= '.' this_ID_2= RULE_ID
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
    // InternalClazzDsl.g:230:1: entryRuleQNameWithWildcard returns [String current=null] : iv_ruleQNameWithWildcard= ruleQNameWithWildcard EOF ;
    public final String entryRuleQNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQNameWithWildcard = null;


        try {
            // InternalClazzDsl.g:230:57: (iv_ruleQNameWithWildcard= ruleQNameWithWildcard EOF )
            // InternalClazzDsl.g:231:2: iv_ruleQNameWithWildcard= ruleQNameWithWildcard EOF
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
    // InternalClazzDsl.g:237:1: ruleQNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QName_0= ruleQName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QName_0 = null;



        	enterRule();

        try {
            // InternalClazzDsl.g:243:2: ( (this_QName_0= ruleQName (kw= '.*' )? ) )
            // InternalClazzDsl.g:244:2: (this_QName_0= ruleQName (kw= '.*' )? )
            {
            // InternalClazzDsl.g:244:2: (this_QName_0= ruleQName (kw= '.*' )? )
            // InternalClazzDsl.g:245:3: this_QName_0= ruleQName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQNameWithWildcardAccess().getQNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_QName_0=ruleQName();

            state._fsp--;


            			current.merge(this_QName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalClazzDsl.g:255:3: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalClazzDsl.g:256:4: kw= '.*'
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


    // $ANTLR start "entryRuleClazz"
    // InternalClazzDsl.g:266:1: entryRuleClazz returns [EObject current=null] : iv_ruleClazz= ruleClazz EOF ;
    public final EObject entryRuleClazz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClazz = null;


        try {
            // InternalClazzDsl.g:266:46: (iv_ruleClazz= ruleClazz EOF )
            // InternalClazzDsl.g:267:2: iv_ruleClazz= ruleClazz EOF
            {
             newCompositeNode(grammarAccess.getClazzRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClazz=ruleClazz();

            state._fsp--;

             current =iv_ruleClazz; 
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
    // $ANTLR end "entryRuleClazz"


    // $ANTLR start "ruleClazz"
    // InternalClazzDsl.g:273:1: ruleClazz returns [EObject current=null] : ( ( (lv_deprecated_0_0= 'deprecated' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleClazz() throws RecognitionException {
        EObject current = null;

        Token lv_deprecated_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalClazzDsl.g:279:2: ( ( ( (lv_deprecated_0_0= 'deprecated' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // InternalClazzDsl.g:280:2: ( ( (lv_deprecated_0_0= 'deprecated' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalClazzDsl.g:280:2: ( ( (lv_deprecated_0_0= 'deprecated' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            // InternalClazzDsl.g:281:3: ( (lv_deprecated_0_0= 'deprecated' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}'
            {
            // InternalClazzDsl.g:281:3: ( (lv_deprecated_0_0= 'deprecated' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalClazzDsl.g:282:4: (lv_deprecated_0_0= 'deprecated' )
                    {
                    // InternalClazzDsl.g:282:4: (lv_deprecated_0_0= 'deprecated' )
                    // InternalClazzDsl.g:283:5: lv_deprecated_0_0= 'deprecated'
                    {
                    lv_deprecated_0_0=(Token)match(input,15,FOLLOW_7); 

                    					newLeafNode(lv_deprecated_0_0, grammarAccess.getClazzAccess().getDeprecatedDeprecatedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClazzRule());
                    					}
                    					setWithLastConsumed(current, "deprecated", true, "deprecated");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClazzAccess().getClassKeyword_1());
            		
            // InternalClazzDsl.g:299:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalClazzDsl.g:300:4: (lv_name_2_0= RULE_ID )
            {
            // InternalClazzDsl.g:300:4: (lv_name_2_0= RULE_ID )
            // InternalClazzDsl.g:301:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getClazzAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClazzRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getClazzAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getClazzAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleClazz"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000019000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});

}