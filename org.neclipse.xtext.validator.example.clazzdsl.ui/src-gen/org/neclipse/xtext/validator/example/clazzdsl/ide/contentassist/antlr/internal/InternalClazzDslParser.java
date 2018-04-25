package org.neclipse.xtext.validator.example.clazzdsl.ide.contentassist.antlr.internal;

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
public class InternalClazzDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'import'", "'.'", "'.*'", "'class'", "'{'", "'}'", "'deprecated'"
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

    	public void setGrammarAccess(ClazzDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleNamespace"
    // InternalClazzDsl.g:57:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalClazzDsl.g:58:1: ( ruleNamespace EOF )
            // InternalClazzDsl.g:59:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
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
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalClazzDsl.g:66:1: ruleNamespace : ( ( rule__Namespace__Group__0 ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:70:2: ( ( ( rule__Namespace__Group__0 ) ) )
            // InternalClazzDsl.g:71:2: ( ( rule__Namespace__Group__0 ) )
            {
            // InternalClazzDsl.g:71:2: ( ( rule__Namespace__Group__0 ) )
            // InternalClazzDsl.g:72:3: ( rule__Namespace__Group__0 )
            {
             before(grammarAccess.getNamespaceAccess().getGroup()); 
            // InternalClazzDsl.g:73:3: ( rule__Namespace__Group__0 )
            // InternalClazzDsl.g:73:4: rule__Namespace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getGroup()); 

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
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleImport"
    // InternalClazzDsl.g:82:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalClazzDsl.g:83:1: ( ruleImport EOF )
            // InternalClazzDsl.g:84:1: ruleImport EOF
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
    // InternalClazzDsl.g:91:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:95:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalClazzDsl.g:96:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalClazzDsl.g:96:2: ( ( rule__Import__Group__0 ) )
            // InternalClazzDsl.g:97:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalClazzDsl.g:98:3: ( rule__Import__Group__0 )
            // InternalClazzDsl.g:98:4: rule__Import__Group__0
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


    // $ANTLR start "entryRuleQName"
    // InternalClazzDsl.g:107:1: entryRuleQName : ruleQName EOF ;
    public final void entryRuleQName() throws RecognitionException {
        try {
            // InternalClazzDsl.g:108:1: ( ruleQName EOF )
            // InternalClazzDsl.g:109:1: ruleQName EOF
            {
             before(grammarAccess.getQNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getQNameRule()); 
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
    // $ANTLR end "entryRuleQName"


    // $ANTLR start "ruleQName"
    // InternalClazzDsl.g:116:1: ruleQName : ( ( rule__QName__Group__0 ) ) ;
    public final void ruleQName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:120:2: ( ( ( rule__QName__Group__0 ) ) )
            // InternalClazzDsl.g:121:2: ( ( rule__QName__Group__0 ) )
            {
            // InternalClazzDsl.g:121:2: ( ( rule__QName__Group__0 ) )
            // InternalClazzDsl.g:122:3: ( rule__QName__Group__0 )
            {
             before(grammarAccess.getQNameAccess().getGroup()); 
            // InternalClazzDsl.g:123:3: ( rule__QName__Group__0 )
            // InternalClazzDsl.g:123:4: rule__QName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQName"


    // $ANTLR start "entryRuleQNameWithWildcard"
    // InternalClazzDsl.g:132:1: entryRuleQNameWithWildcard : ruleQNameWithWildcard EOF ;
    public final void entryRuleQNameWithWildcard() throws RecognitionException {
        try {
            // InternalClazzDsl.g:133:1: ( ruleQNameWithWildcard EOF )
            // InternalClazzDsl.g:134:1: ruleQNameWithWildcard EOF
            {
             before(grammarAccess.getQNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQNameWithWildcardRule()); 
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
    // $ANTLR end "entryRuleQNameWithWildcard"


    // $ANTLR start "ruleQNameWithWildcard"
    // InternalClazzDsl.g:141:1: ruleQNameWithWildcard : ( ( rule__QNameWithWildcard__Group__0 ) ) ;
    public final void ruleQNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:145:2: ( ( ( rule__QNameWithWildcard__Group__0 ) ) )
            // InternalClazzDsl.g:146:2: ( ( rule__QNameWithWildcard__Group__0 ) )
            {
            // InternalClazzDsl.g:146:2: ( ( rule__QNameWithWildcard__Group__0 ) )
            // InternalClazzDsl.g:147:3: ( rule__QNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQNameWithWildcardAccess().getGroup()); 
            // InternalClazzDsl.g:148:3: ( rule__QNameWithWildcard__Group__0 )
            // InternalClazzDsl.g:148:4: rule__QNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQNameWithWildcardAccess().getGroup()); 

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
    // $ANTLR end "ruleQNameWithWildcard"


    // $ANTLR start "entryRuleClazz"
    // InternalClazzDsl.g:157:1: entryRuleClazz : ruleClazz EOF ;
    public final void entryRuleClazz() throws RecognitionException {
        try {
            // InternalClazzDsl.g:158:1: ( ruleClazz EOF )
            // InternalClazzDsl.g:159:1: ruleClazz EOF
            {
             before(grammarAccess.getClazzRule()); 
            pushFollow(FOLLOW_1);
            ruleClazz();

            state._fsp--;

             after(grammarAccess.getClazzRule()); 
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
    // $ANTLR end "entryRuleClazz"


    // $ANTLR start "ruleClazz"
    // InternalClazzDsl.g:166:1: ruleClazz : ( ( rule__Clazz__Group__0 ) ) ;
    public final void ruleClazz() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:170:2: ( ( ( rule__Clazz__Group__0 ) ) )
            // InternalClazzDsl.g:171:2: ( ( rule__Clazz__Group__0 ) )
            {
            // InternalClazzDsl.g:171:2: ( ( rule__Clazz__Group__0 ) )
            // InternalClazzDsl.g:172:3: ( rule__Clazz__Group__0 )
            {
             before(grammarAccess.getClazzAccess().getGroup()); 
            // InternalClazzDsl.g:173:3: ( rule__Clazz__Group__0 )
            // InternalClazzDsl.g:173:4: rule__Clazz__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Clazz__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClazzAccess().getGroup()); 

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
    // $ANTLR end "ruleClazz"


    // $ANTLR start "rule__Namespace__Group__0"
    // InternalClazzDsl.g:181:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:185:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // InternalClazzDsl.g:186:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__1();

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
    // $ANTLR end "rule__Namespace__Group__0"


    // $ANTLR start "rule__Namespace__Group__0__Impl"
    // InternalClazzDsl.g:193:1: rule__Namespace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:197:1: ( ( 'namespace' ) )
            // InternalClazzDsl.g:198:1: ( 'namespace' )
            {
            // InternalClazzDsl.g:198:1: ( 'namespace' )
            // InternalClazzDsl.g:199:2: 'namespace'
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 

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
    // $ANTLR end "rule__Namespace__Group__0__Impl"


    // $ANTLR start "rule__Namespace__Group__1"
    // InternalClazzDsl.g:208:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl rule__Namespace__Group__2 ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:212:1: ( rule__Namespace__Group__1__Impl rule__Namespace__Group__2 )
            // InternalClazzDsl.g:213:2: rule__Namespace__Group__1__Impl rule__Namespace__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Namespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__2();

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
    // $ANTLR end "rule__Namespace__Group__1"


    // $ANTLR start "rule__Namespace__Group__1__Impl"
    // InternalClazzDsl.g:220:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__NameAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:224:1: ( ( ( rule__Namespace__NameAssignment_1 ) ) )
            // InternalClazzDsl.g:225:1: ( ( rule__Namespace__NameAssignment_1 ) )
            {
            // InternalClazzDsl.g:225:1: ( ( rule__Namespace__NameAssignment_1 ) )
            // InternalClazzDsl.g:226:2: ( rule__Namespace__NameAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getNameAssignment_1()); 
            // InternalClazzDsl.g:227:2: ( rule__Namespace__NameAssignment_1 )
            // InternalClazzDsl.g:227:3: rule__Namespace__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Namespace__Group__1__Impl"


    // $ANTLR start "rule__Namespace__Group__2"
    // InternalClazzDsl.g:235:1: rule__Namespace__Group__2 : rule__Namespace__Group__2__Impl rule__Namespace__Group__3 ;
    public final void rule__Namespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:239:1: ( rule__Namespace__Group__2__Impl rule__Namespace__Group__3 )
            // InternalClazzDsl.g:240:2: rule__Namespace__Group__2__Impl rule__Namespace__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Namespace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__3();

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
    // $ANTLR end "rule__Namespace__Group__2"


    // $ANTLR start "rule__Namespace__Group__2__Impl"
    // InternalClazzDsl.g:247:1: rule__Namespace__Group__2__Impl : ( ( rule__Namespace__ImportsAssignment_2 )* ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:251:1: ( ( ( rule__Namespace__ImportsAssignment_2 )* ) )
            // InternalClazzDsl.g:252:1: ( ( rule__Namespace__ImportsAssignment_2 )* )
            {
            // InternalClazzDsl.g:252:1: ( ( rule__Namespace__ImportsAssignment_2 )* )
            // InternalClazzDsl.g:253:2: ( rule__Namespace__ImportsAssignment_2 )*
            {
             before(grammarAccess.getNamespaceAccess().getImportsAssignment_2()); 
            // InternalClazzDsl.g:254:2: ( rule__Namespace__ImportsAssignment_2 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalClazzDsl.g:254:3: rule__Namespace__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Namespace__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getNamespaceAccess().getImportsAssignment_2()); 

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
    // $ANTLR end "rule__Namespace__Group__2__Impl"


    // $ANTLR start "rule__Namespace__Group__3"
    // InternalClazzDsl.g:262:1: rule__Namespace__Group__3 : rule__Namespace__Group__3__Impl ;
    public final void rule__Namespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:266:1: ( rule__Namespace__Group__3__Impl )
            // InternalClazzDsl.g:267:2: rule__Namespace__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Group__3__Impl();

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
    // $ANTLR end "rule__Namespace__Group__3"


    // $ANTLR start "rule__Namespace__Group__3__Impl"
    // InternalClazzDsl.g:273:1: rule__Namespace__Group__3__Impl : ( ( rule__Namespace__ClazzAssignment_3 ) ) ;
    public final void rule__Namespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:277:1: ( ( ( rule__Namespace__ClazzAssignment_3 ) ) )
            // InternalClazzDsl.g:278:1: ( ( rule__Namespace__ClazzAssignment_3 ) )
            {
            // InternalClazzDsl.g:278:1: ( ( rule__Namespace__ClazzAssignment_3 ) )
            // InternalClazzDsl.g:279:2: ( rule__Namespace__ClazzAssignment_3 )
            {
             before(grammarAccess.getNamespaceAccess().getClazzAssignment_3()); 
            // InternalClazzDsl.g:280:2: ( rule__Namespace__ClazzAssignment_3 )
            // InternalClazzDsl.g:280:3: rule__Namespace__ClazzAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__ClazzAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getClazzAssignment_3()); 

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
    // $ANTLR end "rule__Namespace__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalClazzDsl.g:289:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:293:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalClazzDsl.g:294:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalClazzDsl.g:301:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:305:1: ( ( 'import' ) )
            // InternalClazzDsl.g:306:1: ( 'import' )
            {
            // InternalClazzDsl.g:306:1: ( 'import' )
            // InternalClazzDsl.g:307:2: 'import'
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
    // InternalClazzDsl.g:316:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:320:1: ( rule__Import__Group__1__Impl )
            // InternalClazzDsl.g:321:2: rule__Import__Group__1__Impl
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
    // InternalClazzDsl.g:327:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:331:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalClazzDsl.g:332:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalClazzDsl.g:332:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalClazzDsl.g:333:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalClazzDsl.g:334:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalClazzDsl.g:334:3: rule__Import__ImportedNamespaceAssignment_1
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


    // $ANTLR start "rule__QName__Group__0"
    // InternalClazzDsl.g:343:1: rule__QName__Group__0 : rule__QName__Group__0__Impl rule__QName__Group__1 ;
    public final void rule__QName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:347:1: ( rule__QName__Group__0__Impl rule__QName__Group__1 )
            // InternalClazzDsl.g:348:2: rule__QName__Group__0__Impl rule__QName__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__QName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QName__Group__1();

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
    // $ANTLR end "rule__QName__Group__0"


    // $ANTLR start "rule__QName__Group__0__Impl"
    // InternalClazzDsl.g:355:1: rule__QName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:359:1: ( ( RULE_ID ) )
            // InternalClazzDsl.g:360:1: ( RULE_ID )
            {
            // InternalClazzDsl.g:360:1: ( RULE_ID )
            // InternalClazzDsl.g:361:2: RULE_ID
            {
             before(grammarAccess.getQNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QName__Group__0__Impl"


    // $ANTLR start "rule__QName__Group__1"
    // InternalClazzDsl.g:370:1: rule__QName__Group__1 : rule__QName__Group__1__Impl ;
    public final void rule__QName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:374:1: ( rule__QName__Group__1__Impl )
            // InternalClazzDsl.g:375:2: rule__QName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QName__Group__1__Impl();

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
    // $ANTLR end "rule__QName__Group__1"


    // $ANTLR start "rule__QName__Group__1__Impl"
    // InternalClazzDsl.g:381:1: rule__QName__Group__1__Impl : ( ( rule__QName__Group_1__0 )* ) ;
    public final void rule__QName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:385:1: ( ( ( rule__QName__Group_1__0 )* ) )
            // InternalClazzDsl.g:386:1: ( ( rule__QName__Group_1__0 )* )
            {
            // InternalClazzDsl.g:386:1: ( ( rule__QName__Group_1__0 )* )
            // InternalClazzDsl.g:387:2: ( rule__QName__Group_1__0 )*
            {
             before(grammarAccess.getQNameAccess().getGroup_1()); 
            // InternalClazzDsl.g:388:2: ( rule__QName__Group_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalClazzDsl.g:388:3: rule__QName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__QName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getQNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QName__Group__1__Impl"


    // $ANTLR start "rule__QName__Group_1__0"
    // InternalClazzDsl.g:397:1: rule__QName__Group_1__0 : rule__QName__Group_1__0__Impl rule__QName__Group_1__1 ;
    public final void rule__QName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:401:1: ( rule__QName__Group_1__0__Impl rule__QName__Group_1__1 )
            // InternalClazzDsl.g:402:2: rule__QName__Group_1__0__Impl rule__QName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QName__Group_1__1();

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
    // $ANTLR end "rule__QName__Group_1__0"


    // $ANTLR start "rule__QName__Group_1__0__Impl"
    // InternalClazzDsl.g:409:1: rule__QName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:413:1: ( ( '.' ) )
            // InternalClazzDsl.g:414:1: ( '.' )
            {
            // InternalClazzDsl.g:414:1: ( '.' )
            // InternalClazzDsl.g:415:2: '.'
            {
             before(grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QName__Group_1__0__Impl"


    // $ANTLR start "rule__QName__Group_1__1"
    // InternalClazzDsl.g:424:1: rule__QName__Group_1__1 : rule__QName__Group_1__1__Impl ;
    public final void rule__QName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:428:1: ( rule__QName__Group_1__1__Impl )
            // InternalClazzDsl.g:429:2: rule__QName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QName__Group_1__1"


    // $ANTLR start "rule__QName__Group_1__1__Impl"
    // InternalClazzDsl.g:435:1: rule__QName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:439:1: ( ( RULE_ID ) )
            // InternalClazzDsl.g:440:1: ( RULE_ID )
            {
            // InternalClazzDsl.g:440:1: ( RULE_ID )
            // InternalClazzDsl.g:441:2: RULE_ID
            {
             before(grammarAccess.getQNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QName__Group_1__1__Impl"


    // $ANTLR start "rule__QNameWithWildcard__Group__0"
    // InternalClazzDsl.g:451:1: rule__QNameWithWildcard__Group__0 : rule__QNameWithWildcard__Group__0__Impl rule__QNameWithWildcard__Group__1 ;
    public final void rule__QNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:455:1: ( rule__QNameWithWildcard__Group__0__Impl rule__QNameWithWildcard__Group__1 )
            // InternalClazzDsl.g:456:2: rule__QNameWithWildcard__Group__0__Impl rule__QNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__QNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QNameWithWildcard__Group__0"


    // $ANTLR start "rule__QNameWithWildcard__Group__0__Impl"
    // InternalClazzDsl.g:463:1: rule__QNameWithWildcard__Group__0__Impl : ( ruleQName ) ;
    public final void rule__QNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:467:1: ( ( ruleQName ) )
            // InternalClazzDsl.g:468:1: ( ruleQName )
            {
            // InternalClazzDsl.g:468:1: ( ruleQName )
            // InternalClazzDsl.g:469:2: ruleQName
            {
             before(grammarAccess.getQNameWithWildcardAccess().getQNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getQNameWithWildcardAccess().getQNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__QNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QNameWithWildcard__Group__1"
    // InternalClazzDsl.g:478:1: rule__QNameWithWildcard__Group__1 : rule__QNameWithWildcard__Group__1__Impl ;
    public final void rule__QNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:482:1: ( rule__QNameWithWildcard__Group__1__Impl )
            // InternalClazzDsl.g:483:2: rule__QNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QNameWithWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__QNameWithWildcard__Group__1"


    // $ANTLR start "rule__QNameWithWildcard__Group__1__Impl"
    // InternalClazzDsl.g:489:1: rule__QNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:493:1: ( ( ( '.*' )? ) )
            // InternalClazzDsl.g:494:1: ( ( '.*' )? )
            {
            // InternalClazzDsl.g:494:1: ( ( '.*' )? )
            // InternalClazzDsl.g:495:2: ( '.*' )?
            {
             before(grammarAccess.getQNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalClazzDsl.g:496:2: ( '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalClazzDsl.g:496:3: '.*'
                    {
                    match(input,14,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__QNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__Clazz__Group__0"
    // InternalClazzDsl.g:505:1: rule__Clazz__Group__0 : rule__Clazz__Group__0__Impl rule__Clazz__Group__1 ;
    public final void rule__Clazz__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:509:1: ( rule__Clazz__Group__0__Impl rule__Clazz__Group__1 )
            // InternalClazzDsl.g:510:2: rule__Clazz__Group__0__Impl rule__Clazz__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Clazz__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clazz__Group__1();

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
    // $ANTLR end "rule__Clazz__Group__0"


    // $ANTLR start "rule__Clazz__Group__0__Impl"
    // InternalClazzDsl.g:517:1: rule__Clazz__Group__0__Impl : ( ( rule__Clazz__DeprecatedAssignment_0 )? ) ;
    public final void rule__Clazz__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:521:1: ( ( ( rule__Clazz__DeprecatedAssignment_0 )? ) )
            // InternalClazzDsl.g:522:1: ( ( rule__Clazz__DeprecatedAssignment_0 )? )
            {
            // InternalClazzDsl.g:522:1: ( ( rule__Clazz__DeprecatedAssignment_0 )? )
            // InternalClazzDsl.g:523:2: ( rule__Clazz__DeprecatedAssignment_0 )?
            {
             before(grammarAccess.getClazzAccess().getDeprecatedAssignment_0()); 
            // InternalClazzDsl.g:524:2: ( rule__Clazz__DeprecatedAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalClazzDsl.g:524:3: rule__Clazz__DeprecatedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Clazz__DeprecatedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClazzAccess().getDeprecatedAssignment_0()); 

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
    // $ANTLR end "rule__Clazz__Group__0__Impl"


    // $ANTLR start "rule__Clazz__Group__1"
    // InternalClazzDsl.g:532:1: rule__Clazz__Group__1 : rule__Clazz__Group__1__Impl rule__Clazz__Group__2 ;
    public final void rule__Clazz__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:536:1: ( rule__Clazz__Group__1__Impl rule__Clazz__Group__2 )
            // InternalClazzDsl.g:537:2: rule__Clazz__Group__1__Impl rule__Clazz__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Clazz__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clazz__Group__2();

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
    // $ANTLR end "rule__Clazz__Group__1"


    // $ANTLR start "rule__Clazz__Group__1__Impl"
    // InternalClazzDsl.g:544:1: rule__Clazz__Group__1__Impl : ( 'class' ) ;
    public final void rule__Clazz__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:548:1: ( ( 'class' ) )
            // InternalClazzDsl.g:549:1: ( 'class' )
            {
            // InternalClazzDsl.g:549:1: ( 'class' )
            // InternalClazzDsl.g:550:2: 'class'
            {
             before(grammarAccess.getClazzAccess().getClassKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClazzAccess().getClassKeyword_1()); 

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
    // $ANTLR end "rule__Clazz__Group__1__Impl"


    // $ANTLR start "rule__Clazz__Group__2"
    // InternalClazzDsl.g:559:1: rule__Clazz__Group__2 : rule__Clazz__Group__2__Impl rule__Clazz__Group__3 ;
    public final void rule__Clazz__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:563:1: ( rule__Clazz__Group__2__Impl rule__Clazz__Group__3 )
            // InternalClazzDsl.g:564:2: rule__Clazz__Group__2__Impl rule__Clazz__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Clazz__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clazz__Group__3();

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
    // $ANTLR end "rule__Clazz__Group__2"


    // $ANTLR start "rule__Clazz__Group__2__Impl"
    // InternalClazzDsl.g:571:1: rule__Clazz__Group__2__Impl : ( ( rule__Clazz__NameAssignment_2 ) ) ;
    public final void rule__Clazz__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:575:1: ( ( ( rule__Clazz__NameAssignment_2 ) ) )
            // InternalClazzDsl.g:576:1: ( ( rule__Clazz__NameAssignment_2 ) )
            {
            // InternalClazzDsl.g:576:1: ( ( rule__Clazz__NameAssignment_2 ) )
            // InternalClazzDsl.g:577:2: ( rule__Clazz__NameAssignment_2 )
            {
             before(grammarAccess.getClazzAccess().getNameAssignment_2()); 
            // InternalClazzDsl.g:578:2: ( rule__Clazz__NameAssignment_2 )
            // InternalClazzDsl.g:578:3: rule__Clazz__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Clazz__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClazzAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Clazz__Group__2__Impl"


    // $ANTLR start "rule__Clazz__Group__3"
    // InternalClazzDsl.g:586:1: rule__Clazz__Group__3 : rule__Clazz__Group__3__Impl rule__Clazz__Group__4 ;
    public final void rule__Clazz__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:590:1: ( rule__Clazz__Group__3__Impl rule__Clazz__Group__4 )
            // InternalClazzDsl.g:591:2: rule__Clazz__Group__3__Impl rule__Clazz__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Clazz__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clazz__Group__4();

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
    // $ANTLR end "rule__Clazz__Group__3"


    // $ANTLR start "rule__Clazz__Group__3__Impl"
    // InternalClazzDsl.g:598:1: rule__Clazz__Group__3__Impl : ( '{' ) ;
    public final void rule__Clazz__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:602:1: ( ( '{' ) )
            // InternalClazzDsl.g:603:1: ( '{' )
            {
            // InternalClazzDsl.g:603:1: ( '{' )
            // InternalClazzDsl.g:604:2: '{'
            {
             before(grammarAccess.getClazzAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClazzAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Clazz__Group__3__Impl"


    // $ANTLR start "rule__Clazz__Group__4"
    // InternalClazzDsl.g:613:1: rule__Clazz__Group__4 : rule__Clazz__Group__4__Impl ;
    public final void rule__Clazz__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:617:1: ( rule__Clazz__Group__4__Impl )
            // InternalClazzDsl.g:618:2: rule__Clazz__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clazz__Group__4__Impl();

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
    // $ANTLR end "rule__Clazz__Group__4"


    // $ANTLR start "rule__Clazz__Group__4__Impl"
    // InternalClazzDsl.g:624:1: rule__Clazz__Group__4__Impl : ( '}' ) ;
    public final void rule__Clazz__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:628:1: ( ( '}' ) )
            // InternalClazzDsl.g:629:1: ( '}' )
            {
            // InternalClazzDsl.g:629:1: ( '}' )
            // InternalClazzDsl.g:630:2: '}'
            {
             before(grammarAccess.getClazzAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClazzAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Clazz__Group__4__Impl"


    // $ANTLR start "rule__Namespace__NameAssignment_1"
    // InternalClazzDsl.g:640:1: rule__Namespace__NameAssignment_1 : ( ruleQName ) ;
    public final void rule__Namespace__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:644:1: ( ( ruleQName ) )
            // InternalClazzDsl.g:645:2: ( ruleQName )
            {
            // InternalClazzDsl.g:645:2: ( ruleQName )
            // InternalClazzDsl.g:646:3: ruleQName
            {
             before(grammarAccess.getNamespaceAccess().getNameQNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getNameQNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Namespace__NameAssignment_1"


    // $ANTLR start "rule__Namespace__ImportsAssignment_2"
    // InternalClazzDsl.g:655:1: rule__Namespace__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Namespace__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:659:1: ( ( ruleImport ) )
            // InternalClazzDsl.g:660:2: ( ruleImport )
            {
            // InternalClazzDsl.g:660:2: ( ruleImport )
            // InternalClazzDsl.g:661:3: ruleImport
            {
             before(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Namespace__ImportsAssignment_2"


    // $ANTLR start "rule__Namespace__ClazzAssignment_3"
    // InternalClazzDsl.g:670:1: rule__Namespace__ClazzAssignment_3 : ( ruleClazz ) ;
    public final void rule__Namespace__ClazzAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:674:1: ( ( ruleClazz ) )
            // InternalClazzDsl.g:675:2: ( ruleClazz )
            {
            // InternalClazzDsl.g:675:2: ( ruleClazz )
            // InternalClazzDsl.g:676:3: ruleClazz
            {
             before(grammarAccess.getNamespaceAccess().getClazzClazzParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleClazz();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getClazzClazzParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Namespace__ClazzAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalClazzDsl.g:685:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:689:1: ( ( ruleQNameWithWildcard ) )
            // InternalClazzDsl.g:690:2: ( ruleQNameWithWildcard )
            {
            // InternalClazzDsl.g:690:2: ( ruleQNameWithWildcard )
            // InternalClazzDsl.g:691:3: ruleQNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQNameWithWildcardParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__Clazz__DeprecatedAssignment_0"
    // InternalClazzDsl.g:700:1: rule__Clazz__DeprecatedAssignment_0 : ( ( 'deprecated' ) ) ;
    public final void rule__Clazz__DeprecatedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:704:1: ( ( ( 'deprecated' ) ) )
            // InternalClazzDsl.g:705:2: ( ( 'deprecated' ) )
            {
            // InternalClazzDsl.g:705:2: ( ( 'deprecated' ) )
            // InternalClazzDsl.g:706:3: ( 'deprecated' )
            {
             before(grammarAccess.getClazzAccess().getDeprecatedDeprecatedKeyword_0_0()); 
            // InternalClazzDsl.g:707:3: ( 'deprecated' )
            // InternalClazzDsl.g:708:4: 'deprecated'
            {
             before(grammarAccess.getClazzAccess().getDeprecatedDeprecatedKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClazzAccess().getDeprecatedDeprecatedKeyword_0_0()); 

            }

             after(grammarAccess.getClazzAccess().getDeprecatedDeprecatedKeyword_0_0()); 

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
    // $ANTLR end "rule__Clazz__DeprecatedAssignment_0"


    // $ANTLR start "rule__Clazz__NameAssignment_2"
    // InternalClazzDsl.g:719:1: rule__Clazz__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Clazz__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClazzDsl.g:723:1: ( ( RULE_ID ) )
            // InternalClazzDsl.g:724:2: ( RULE_ID )
            {
            // InternalClazzDsl.g:724:2: ( RULE_ID )
            // InternalClazzDsl.g:725:3: RULE_ID
            {
             before(grammarAccess.getClazzAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClazzAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Clazz__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000049000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});

}