package org.nb.xtext.example.hyperlink.entitydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
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
public class InternalEntityDslParser extends AbstractInternalContentAssistParser {
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



    // $ANTLR start "entryRuleEntityFile"
    // InternalEntityDsl.g:57:1: entryRuleEntityFile : ruleEntityFile EOF ;
    public final void entryRuleEntityFile() throws RecognitionException {
        try {
            // InternalEntityDsl.g:58:1: ( ruleEntityFile EOF )
            // InternalEntityDsl.g:59:1: ruleEntityFile EOF
            {
             before(grammarAccess.getEntityFileRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityFile();

            state._fsp--;

             after(grammarAccess.getEntityFileRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityFile"


    // $ANTLR start "ruleEntityFile"
    // InternalEntityDsl.g:66:1: ruleEntityFile : ( ( rule__EntityFile__Group__0 ) ) ;
    public final void ruleEntityFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:70:2: ( ( ( rule__EntityFile__Group__0 ) ) )
            // InternalEntityDsl.g:71:2: ( ( rule__EntityFile__Group__0 ) )
            {
            // InternalEntityDsl.g:71:2: ( ( rule__EntityFile__Group__0 ) )
            // InternalEntityDsl.g:72:3: ( rule__EntityFile__Group__0 )
            {
             before(grammarAccess.getEntityFileAccess().getGroup()); 
            // InternalEntityDsl.g:73:3: ( rule__EntityFile__Group__0 )
            // InternalEntityDsl.g:73:4: rule__EntityFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityFileAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityFile"


    // $ANTLR start "entryRuleImport"
    // InternalEntityDsl.g:82:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalEntityDsl.g:83:1: ( ruleImport EOF )
            // InternalEntityDsl.g:84:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEntityDsl.g:91:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:95:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalEntityDsl.g:96:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalEntityDsl.g:96:2: ( ( rule__Import__Group__0 ) )
            // InternalEntityDsl.g:97:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalEntityDsl.g:98:3: ( rule__Import__Group__0 )
            // InternalEntityDsl.g:98:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEntityDsl.g:107:1: entryRuleQualifedName : ruleQualifedName EOF ;
    public final void entryRuleQualifedName() throws RecognitionException {
        try {
            // InternalEntityDsl.g:108:1: ( ruleQualifedName EOF )
            // InternalEntityDsl.g:109:1: ruleQualifedName EOF
            {
             before(grammarAccess.getQualifedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifedName();

            state._fsp--;

             after(grammarAccess.getQualifedNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEntityDsl.g:116:1: ruleQualifedName : ( ( rule__QualifedName__Group__0 ) ) ;
    public final void ruleQualifedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:120:2: ( ( ( rule__QualifedName__Group__0 ) ) )
            // InternalEntityDsl.g:121:2: ( ( rule__QualifedName__Group__0 ) )
            {
            // InternalEntityDsl.g:121:2: ( ( rule__QualifedName__Group__0 ) )
            // InternalEntityDsl.g:122:3: ( rule__QualifedName__Group__0 )
            {
             before(grammarAccess.getQualifedNameAccess().getGroup()); 
            // InternalEntityDsl.g:123:3: ( rule__QualifedName__Group__0 )
            // InternalEntityDsl.g:123:4: rule__QualifedName__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleEntity"
    // InternalEntityDsl.g:132:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalEntityDsl.g:133:1: ( ruleEntity EOF )
            // InternalEntityDsl.g:134:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEntityDsl.g:141:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:145:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalEntityDsl.g:146:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalEntityDsl.g:146:2: ( ( rule__Entity__Group__0 ) )
            // InternalEntityDsl.g:147:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalEntityDsl.g:148:3: ( rule__Entity__Group__0 )
            // InternalEntityDsl.g:148:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__EntityFile__Group__0"
    // InternalEntityDsl.g:156:1: rule__EntityFile__Group__0 : rule__EntityFile__Group__0__Impl rule__EntityFile__Group__1 ;
    public final void rule__EntityFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:160:1: ( rule__EntityFile__Group__0__Impl rule__EntityFile__Group__1 )
            // InternalEntityDsl.g:161:2: rule__EntityFile__Group__0__Impl rule__EntityFile__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EntityFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityFile__Group__1();

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
    // $ANTLR end "rule__EntityFile__Group__0"


    // $ANTLR start "rule__EntityFile__Group__0__Impl"
    // InternalEntityDsl.g:168:1: rule__EntityFile__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__EntityFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:172:1: ( ( 'namespace' ) )
            // InternalEntityDsl.g:173:1: ( 'namespace' )
            {
            // InternalEntityDsl.g:173:1: ( 'namespace' )
            // InternalEntityDsl.g:174:2: 'namespace'
            {
             before(grammarAccess.getEntityFileAccess().getNamespaceKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEntityFileAccess().getNamespaceKeyword_0()); 

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
    // $ANTLR end "rule__EntityFile__Group__0__Impl"


    // $ANTLR start "rule__EntityFile__Group__1"
    // InternalEntityDsl.g:183:1: rule__EntityFile__Group__1 : rule__EntityFile__Group__1__Impl rule__EntityFile__Group__2 ;
    public final void rule__EntityFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:187:1: ( rule__EntityFile__Group__1__Impl rule__EntityFile__Group__2 )
            // InternalEntityDsl.g:188:2: rule__EntityFile__Group__1__Impl rule__EntityFile__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__EntityFile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityFile__Group__2();

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
    // $ANTLR end "rule__EntityFile__Group__1"


    // $ANTLR start "rule__EntityFile__Group__1__Impl"
    // InternalEntityDsl.g:195:1: rule__EntityFile__Group__1__Impl : ( ( rule__EntityFile__NameAssignment_1 ) ) ;
    public final void rule__EntityFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:199:1: ( ( ( rule__EntityFile__NameAssignment_1 ) ) )
            // InternalEntityDsl.g:200:1: ( ( rule__EntityFile__NameAssignment_1 ) )
            {
            // InternalEntityDsl.g:200:1: ( ( rule__EntityFile__NameAssignment_1 ) )
            // InternalEntityDsl.g:201:2: ( rule__EntityFile__NameAssignment_1 )
            {
             before(grammarAccess.getEntityFileAccess().getNameAssignment_1()); 
            // InternalEntityDsl.g:202:2: ( rule__EntityFile__NameAssignment_1 )
            // InternalEntityDsl.g:202:3: rule__EntityFile__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EntityFile__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityFileAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__EntityFile__Group__1__Impl"


    // $ANTLR start "rule__EntityFile__Group__2"
    // InternalEntityDsl.g:210:1: rule__EntityFile__Group__2 : rule__EntityFile__Group__2__Impl rule__EntityFile__Group__3 ;
    public final void rule__EntityFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:214:1: ( rule__EntityFile__Group__2__Impl rule__EntityFile__Group__3 )
            // InternalEntityDsl.g:215:2: rule__EntityFile__Group__2__Impl rule__EntityFile__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__EntityFile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityFile__Group__3();

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
    // $ANTLR end "rule__EntityFile__Group__2"


    // $ANTLR start "rule__EntityFile__Group__2__Impl"
    // InternalEntityDsl.g:222:1: rule__EntityFile__Group__2__Impl : ( ( rule__EntityFile__ImportsAssignment_2 )* ) ;
    public final void rule__EntityFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:226:1: ( ( ( rule__EntityFile__ImportsAssignment_2 )* ) )
            // InternalEntityDsl.g:227:1: ( ( rule__EntityFile__ImportsAssignment_2 )* )
            {
            // InternalEntityDsl.g:227:1: ( ( rule__EntityFile__ImportsAssignment_2 )* )
            // InternalEntityDsl.g:228:2: ( rule__EntityFile__ImportsAssignment_2 )*
            {
             before(grammarAccess.getEntityFileAccess().getImportsAssignment_2()); 
            // InternalEntityDsl.g:229:2: ( rule__EntityFile__ImportsAssignment_2 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEntityDsl.g:229:3: rule__EntityFile__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__EntityFile__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getEntityFileAccess().getImportsAssignment_2()); 

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
    // $ANTLR end "rule__EntityFile__Group__2__Impl"


    // $ANTLR start "rule__EntityFile__Group__3"
    // InternalEntityDsl.g:237:1: rule__EntityFile__Group__3 : rule__EntityFile__Group__3__Impl ;
    public final void rule__EntityFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:241:1: ( rule__EntityFile__Group__3__Impl )
            // InternalEntityDsl.g:242:2: rule__EntityFile__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityFile__Group__3__Impl();

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
    // $ANTLR end "rule__EntityFile__Group__3"


    // $ANTLR start "rule__EntityFile__Group__3__Impl"
    // InternalEntityDsl.g:248:1: rule__EntityFile__Group__3__Impl : ( ( rule__EntityFile__EntityAssignment_3 ) ) ;
    public final void rule__EntityFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:252:1: ( ( ( rule__EntityFile__EntityAssignment_3 ) ) )
            // InternalEntityDsl.g:253:1: ( ( rule__EntityFile__EntityAssignment_3 ) )
            {
            // InternalEntityDsl.g:253:1: ( ( rule__EntityFile__EntityAssignment_3 ) )
            // InternalEntityDsl.g:254:2: ( rule__EntityFile__EntityAssignment_3 )
            {
             before(grammarAccess.getEntityFileAccess().getEntityAssignment_3()); 
            // InternalEntityDsl.g:255:2: ( rule__EntityFile__EntityAssignment_3 )
            // InternalEntityDsl.g:255:3: rule__EntityFile__EntityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EntityFile__EntityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityFileAccess().getEntityAssignment_3()); 

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
    // $ANTLR end "rule__EntityFile__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalEntityDsl.g:264:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:268:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalEntityDsl.g:269:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEntityDsl.g:276:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:280:1: ( ( 'import' ) )
            // InternalEntityDsl.g:281:1: ( 'import' )
            {
            // InternalEntityDsl.g:281:1: ( 'import' )
            // InternalEntityDsl.g:282:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalEntityDsl.g:291:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:295:1: ( rule__Import__Group__1__Impl )
            // InternalEntityDsl.g:296:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEntityDsl.g:302:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:306:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalEntityDsl.g:307:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalEntityDsl.g:307:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalEntityDsl.g:308:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalEntityDsl.g:309:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalEntityDsl.g:309:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalEntityDsl.g:318:1: rule__QualifedName__Group__0 : rule__QualifedName__Group__0__Impl rule__QualifedName__Group__1 ;
    public final void rule__QualifedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:322:1: ( rule__QualifedName__Group__0__Impl rule__QualifedName__Group__1 )
            // InternalEntityDsl.g:323:2: rule__QualifedName__Group__0__Impl rule__QualifedName__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEntityDsl.g:330:1: rule__QualifedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:334:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:335:1: ( RULE_ID )
            {
            // InternalEntityDsl.g:335:1: ( RULE_ID )
            // InternalEntityDsl.g:336:2: RULE_ID
            {
             before(grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalEntityDsl.g:345:1: rule__QualifedName__Group__1 : rule__QualifedName__Group__1__Impl ;
    public final void rule__QualifedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:349:1: ( rule__QualifedName__Group__1__Impl )
            // InternalEntityDsl.g:350:2: rule__QualifedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEntityDsl.g:356:1: rule__QualifedName__Group__1__Impl : ( ( rule__QualifedName__Group_1__0 )* ) ;
    public final void rule__QualifedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:360:1: ( ( ( rule__QualifedName__Group_1__0 )* ) )
            // InternalEntityDsl.g:361:1: ( ( rule__QualifedName__Group_1__0 )* )
            {
            // InternalEntityDsl.g:361:1: ( ( rule__QualifedName__Group_1__0 )* )
            // InternalEntityDsl.g:362:2: ( rule__QualifedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifedNameAccess().getGroup_1()); 
            // InternalEntityDsl.g:363:2: ( rule__QualifedName__Group_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEntityDsl.g:363:3: rule__QualifedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__QualifedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalEntityDsl.g:372:1: rule__QualifedName__Group_1__0 : rule__QualifedName__Group_1__0__Impl rule__QualifedName__Group_1__1 ;
    public final void rule__QualifedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:376:1: ( rule__QualifedName__Group_1__0__Impl rule__QualifedName__Group_1__1 )
            // InternalEntityDsl.g:377:2: rule__QualifedName__Group_1__0__Impl rule__QualifedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEntityDsl.g:384:1: rule__QualifedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:388:1: ( ( '.' ) )
            // InternalEntityDsl.g:389:1: ( '.' )
            {
            // InternalEntityDsl.g:389:1: ( '.' )
            // InternalEntityDsl.g:390:2: '.'
            {
             before(grammarAccess.getQualifedNameAccess().getFullStopKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalEntityDsl.g:399:1: rule__QualifedName__Group_1__1 : rule__QualifedName__Group_1__1__Impl ;
    public final void rule__QualifedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:403:1: ( rule__QualifedName__Group_1__1__Impl )
            // InternalEntityDsl.g:404:2: rule__QualifedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEntityDsl.g:410:1: rule__QualifedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:414:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:415:1: ( RULE_ID )
            {
            // InternalEntityDsl.g:415:1: ( RULE_ID )
            // InternalEntityDsl.g:416:2: RULE_ID
            {
             before(grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__Entity__Group__0"
    // InternalEntityDsl.g:426:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:430:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalEntityDsl.g:431:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEntityDsl.g:438:1: rule__Entity__Group__0__Impl : ( 'model' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:442:1: ( ( 'model' ) )
            // InternalEntityDsl.g:443:1: ( 'model' )
            {
            // InternalEntityDsl.g:443:1: ( 'model' )
            // InternalEntityDsl.g:444:2: 'model'
            {
             before(grammarAccess.getEntityAccess().getModelKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getModelKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalEntityDsl.g:453:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:457:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalEntityDsl.g:458:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEntityDsl.g:465:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:469:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalEntityDsl.g:470:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalEntityDsl.g:470:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalEntityDsl.g:471:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalEntityDsl.g:472:2: ( rule__Entity__NameAssignment_1 )
            // InternalEntityDsl.g:472:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // InternalEntityDsl.g:480:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:484:1: ( rule__Entity__Group__2__Impl )
            // InternalEntityDsl.g:485:2: rule__Entity__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__2__Impl();

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
    // InternalEntityDsl.g:491:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:495:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalEntityDsl.g:496:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalEntityDsl.g:496:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalEntityDsl.g:497:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalEntityDsl.g:498:2: ( rule__Entity__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEntityDsl.g:498:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

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


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalEntityDsl.g:507:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:511:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalEntityDsl.g:512:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

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
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalEntityDsl.g:519:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:523:1: ( ( 'extends' ) )
            // InternalEntityDsl.g:524:1: ( 'extends' )
            {
            // InternalEntityDsl.g:524:1: ( 'extends' )
            // InternalEntityDsl.g:525:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

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
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalEntityDsl.g:534:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:538:1: ( rule__Entity__Group_2__1__Impl )
            // InternalEntityDsl.g:539:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalEntityDsl.g:545:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__ParentAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:549:1: ( ( ( rule__Entity__ParentAssignment_2_1 ) ) )
            // InternalEntityDsl.g:550:1: ( ( rule__Entity__ParentAssignment_2_1 ) )
            {
            // InternalEntityDsl.g:550:1: ( ( rule__Entity__ParentAssignment_2_1 ) )
            // InternalEntityDsl.g:551:2: ( rule__Entity__ParentAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getParentAssignment_2_1()); 
            // InternalEntityDsl.g:552:2: ( rule__Entity__ParentAssignment_2_1 )
            // InternalEntityDsl.g:552:3: rule__Entity__ParentAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__ParentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getParentAssignment_2_1()); 

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
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__EntityFile__NameAssignment_1"
    // InternalEntityDsl.g:561:1: rule__EntityFile__NameAssignment_1 : ( ruleQualifedName ) ;
    public final void rule__EntityFile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:565:1: ( ( ruleQualifedName ) )
            // InternalEntityDsl.g:566:2: ( ruleQualifedName )
            {
            // InternalEntityDsl.g:566:2: ( ruleQualifedName )
            // InternalEntityDsl.g:567:3: ruleQualifedName
            {
             before(grammarAccess.getEntityFileAccess().getNameQualifedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifedName();

            state._fsp--;

             after(grammarAccess.getEntityFileAccess().getNameQualifedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EntityFile__NameAssignment_1"


    // $ANTLR start "rule__EntityFile__ImportsAssignment_2"
    // InternalEntityDsl.g:576:1: rule__EntityFile__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__EntityFile__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:580:1: ( ( ruleImport ) )
            // InternalEntityDsl.g:581:2: ( ruleImport )
            {
            // InternalEntityDsl.g:581:2: ( ruleImport )
            // InternalEntityDsl.g:582:3: ruleImport
            {
             before(grammarAccess.getEntityFileAccess().getImportsImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getEntityFileAccess().getImportsImportParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__EntityFile__ImportsAssignment_2"


    // $ANTLR start "rule__EntityFile__EntityAssignment_3"
    // InternalEntityDsl.g:591:1: rule__EntityFile__EntityAssignment_3 : ( ruleEntity ) ;
    public final void rule__EntityFile__EntityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:595:1: ( ( ruleEntity ) )
            // InternalEntityDsl.g:596:2: ( ruleEntity )
            {
            // InternalEntityDsl.g:596:2: ( ruleEntity )
            // InternalEntityDsl.g:597:3: ruleEntity
            {
             before(grammarAccess.getEntityFileAccess().getEntityEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityFileAccess().getEntityEntityParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__EntityFile__EntityAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalEntityDsl.g:606:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifedName ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:610:1: ( ( ruleQualifedName ) )
            // InternalEntityDsl.g:611:2: ( ruleQualifedName )
            {
            // InternalEntityDsl.g:611:2: ( ruleQualifedName )
            // InternalEntityDsl.g:612:3: ruleQualifedName
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifedName();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifedNameParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalEntityDsl.g:621:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:625:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:626:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:626:2: ( RULE_ID )
            // InternalEntityDsl.g:627:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__ParentAssignment_2_1"
    // InternalEntityDsl.g:636:1: rule__Entity__ParentAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__ParentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:640:1: ( ( ( RULE_ID ) ) )
            // InternalEntityDsl.g:641:2: ( ( RULE_ID ) )
            {
            // InternalEntityDsl.g:641:2: ( ( RULE_ID ) )
            // InternalEntityDsl.g:642:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getParentEntityCrossReference_2_1_0()); 
            // InternalEntityDsl.g:643:3: ( RULE_ID )
            // InternalEntityDsl.g:644:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getParentEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getParentEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getParentEntityCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Entity__ParentAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});

}