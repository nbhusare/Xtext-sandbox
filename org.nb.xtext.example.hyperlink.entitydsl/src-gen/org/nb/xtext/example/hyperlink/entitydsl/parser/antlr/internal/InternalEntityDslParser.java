package org.nb.xtext.example.hyperlink.entitydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.nb.xtext.example.hyperlink.entitydsl.services.EntityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/*******************************************************************************
 * Copyright (C) 2017 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
@SuppressWarnings("all")
public class InternalEntityDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'import'", "'.'", "'model'", "'extends'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalEntityDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEntityDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEntityDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEntityDsl.g"; }



     	private EntityDslGrammarAccess grammarAccess;

        public InternalEntityDslParser(TokenStream input, EntityDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EntityFile";
       	}

       	@Override
       	protected EntityDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEntityFile"
    // InternalEntityDsl.g:68:1: entryRuleEntityFile returns [EObject current=null] : iv_ruleEntityFile= ruleEntityFile EOF ;
    public final EObject entryRuleEntityFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityFile = null;


        try {
            // InternalEntityDsl.g:68:51: (iv_ruleEntityFile= ruleEntityFile EOF )
            // InternalEntityDsl.g:69:2: iv_ruleEntityFile= ruleEntityFile EOF
            {
             newCompositeNode(grammarAccess.getEntityFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityFile=ruleEntityFile();

            state._fsp--;

             current =iv_ruleEntityFile; 
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
    // $ANTLR end "entryRuleEntityFile"


    // $ANTLR start "ruleEntityFile"
    // InternalEntityDsl.g:75:1: ruleEntityFile returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_entity_3_0= ruleEntity ) ) ) ;
    public final EObject ruleEntityFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_entity_3_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:81:2: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_entity_3_0= ruleEntity ) ) ) )
            // InternalEntityDsl.g:82:2: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_entity_3_0= ruleEntity ) ) )
            {
            // InternalEntityDsl.g:82:2: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_entity_3_0= ruleEntity ) ) )
            // InternalEntityDsl.g:83:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_entity_3_0= ruleEntity ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityFileAccess().getNamespaceKeyword_0());
            		
            // InternalEntityDsl.g:87:3: ( (lv_name_1_0= ruleQualifedName ) )
            // InternalEntityDsl.g:88:4: (lv_name_1_0= ruleQualifedName )
            {
            // InternalEntityDsl.g:88:4: (lv_name_1_0= ruleQualifedName )
            // InternalEntityDsl.g:89:5: lv_name_1_0= ruleQualifedName
            {

            					newCompositeNode(grammarAccess.getEntityFileAccess().getNameQualifedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityFileRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.nb.xtext.example.hyperlink.entitydsl.EntityDsl.QualifedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEntityDsl.g:106:3: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEntityDsl.g:107:4: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalEntityDsl.g:107:4: (lv_imports_2_0= ruleImport )
            	    // InternalEntityDsl.g:108:5: lv_imports_2_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getEntityFileAccess().getImportsImportParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityFileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_2_0,
            	    						"org.nb.xtext.example.hyperlink.entitydsl.EntityDsl.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalEntityDsl.g:125:3: ( (lv_entity_3_0= ruleEntity ) )
            // InternalEntityDsl.g:126:4: (lv_entity_3_0= ruleEntity )
            {
            // InternalEntityDsl.g:126:4: (lv_entity_3_0= ruleEntity )
            // InternalEntityDsl.g:127:5: lv_entity_3_0= ruleEntity
            {

            					newCompositeNode(grammarAccess.getEntityFileAccess().getEntityEntityParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_entity_3_0=ruleEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityFileRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_3_0,
            						"org.nb.xtext.example.hyperlink.entitydsl.EntityDsl.Entity");
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
    // $ANTLR end "ruleEntityFile"


    // $ANTLR start "entryRuleImport"
    // InternalEntityDsl.g:148:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalEntityDsl.g:148:47: (iv_ruleImport= ruleImport EOF )
            // InternalEntityDsl.g:149:2: iv_ruleImport= ruleImport EOF
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
    // InternalEntityDsl.g:155:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedName ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:161:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedName ) ) ) )
            // InternalEntityDsl.g:162:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedName ) ) )
            {
            // InternalEntityDsl.g:162:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedName ) ) )
            // InternalEntityDsl.g:163:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedName ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalEntityDsl.g:167:3: ( (lv_importedNamespace_1_0= ruleQualifedName ) )
            // InternalEntityDsl.g:168:4: (lv_importedNamespace_1_0= ruleQualifedName )
            {
            // InternalEntityDsl.g:168:4: (lv_importedNamespace_1_0= ruleQualifedName )
            // InternalEntityDsl.g:169:5: lv_importedNamespace_1_0= ruleQualifedName
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.nb.xtext.example.hyperlink.entitydsl.EntityDsl.QualifedName");
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
    // InternalEntityDsl.g:190:1: entryRuleQualifedName returns [String current=null] : iv_ruleQualifedName= ruleQualifedName EOF ;
    public final String entryRuleQualifedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifedName = null;


        try {
            // InternalEntityDsl.g:190:52: (iv_ruleQualifedName= ruleQualifedName EOF )
            // InternalEntityDsl.g:191:2: iv_ruleQualifedName= ruleQualifedName EOF
            {
             newCompositeNode(grammarAccess.getQualifedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifedName=ruleQualifedName();

            state._fsp--;

             current =iv_ruleQualifedName.getText(); 
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
    // $ANTLR end "entryRuleQualifedName"


    // $ANTLR start "ruleQualifedName"
    // InternalEntityDsl.g:197:1: ruleQualifedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:203:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalEntityDsl.g:204:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalEntityDsl.g:204:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalEntityDsl.g:205:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalEntityDsl.g:212:3: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEntityDsl.g:213:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_5); 

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


    // $ANTLR start "entryRuleEntity"
    // InternalEntityDsl.g:230:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalEntityDsl.g:230:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalEntityDsl.g:231:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalEntityDsl.g:237:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:243:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalEntityDsl.g:244:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalEntityDsl.g:244:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? )
            // InternalEntityDsl.g:245:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getModelKeyword_0());
            		
            // InternalEntityDsl.g:249:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEntityDsl.g:250:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEntityDsl.g:250:4: (lv_name_1_0= RULE_ID )
            // InternalEntityDsl.g:251:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEntityDsl.g:267:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEntityDsl.g:268:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                    			
                    // InternalEntityDsl.g:272:4: ( (otherlv_3= RULE_ID ) )
                    // InternalEntityDsl.g:273:5: (otherlv_3= RULE_ID )
                    {
                    // InternalEntityDsl.g:273:5: (otherlv_3= RULE_ID )
                    // InternalEntityDsl.g:274:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getParentEntityCrossReference_2_1_0());
                    					

                    }


                    }


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
    // $ANTLR end "ruleEntity"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});

}