package org.neclipse.xtext.validator.example.funcdsl.ide.contentassist.antlr.internal;

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
public class InternalFuncDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'boolean'", "'int'", "'long'", "'double'", "'namespace'", "'import'", "'.'", "'.*'", "'func'", "'('", "')'", "'{'", "'}'", "','"
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

    	public void setGrammarAccess(FuncDslGrammarAccess grammarAccess) {
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
    // InternalFuncDsl.g:57:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalFuncDsl.g:58:1: ( ruleNamespace EOF )
            // InternalFuncDsl.g:59:1: ruleNamespace EOF
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
    // InternalFuncDsl.g:66:1: ruleNamespace : ( ( rule__Namespace__Group__0 ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:70:2: ( ( ( rule__Namespace__Group__0 ) ) )
            // InternalFuncDsl.g:71:2: ( ( rule__Namespace__Group__0 ) )
            {
            // InternalFuncDsl.g:71:2: ( ( rule__Namespace__Group__0 ) )
            // InternalFuncDsl.g:72:3: ( rule__Namespace__Group__0 )
            {
             before(grammarAccess.getNamespaceAccess().getGroup()); 
            // InternalFuncDsl.g:73:3: ( rule__Namespace__Group__0 )
            // InternalFuncDsl.g:73:4: rule__Namespace__Group__0
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
    // InternalFuncDsl.g:82:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalFuncDsl.g:83:1: ( ruleImport EOF )
            // InternalFuncDsl.g:84:1: ruleImport EOF
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
    // InternalFuncDsl.g:91:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:95:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalFuncDsl.g:96:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalFuncDsl.g:96:2: ( ( rule__Import__Group__0 ) )
            // InternalFuncDsl.g:97:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalFuncDsl.g:98:3: ( rule__Import__Group__0 )
            // InternalFuncDsl.g:98:4: rule__Import__Group__0
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
    // InternalFuncDsl.g:107:1: entryRuleQName : ruleQName EOF ;
    public final void entryRuleQName() throws RecognitionException {
        try {
            // InternalFuncDsl.g:108:1: ( ruleQName EOF )
            // InternalFuncDsl.g:109:1: ruleQName EOF
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
    // InternalFuncDsl.g:116:1: ruleQName : ( ( rule__QName__Group__0 ) ) ;
    public final void ruleQName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:120:2: ( ( ( rule__QName__Group__0 ) ) )
            // InternalFuncDsl.g:121:2: ( ( rule__QName__Group__0 ) )
            {
            // InternalFuncDsl.g:121:2: ( ( rule__QName__Group__0 ) )
            // InternalFuncDsl.g:122:3: ( rule__QName__Group__0 )
            {
             before(grammarAccess.getQNameAccess().getGroup()); 
            // InternalFuncDsl.g:123:3: ( rule__QName__Group__0 )
            // InternalFuncDsl.g:123:4: rule__QName__Group__0
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
    // InternalFuncDsl.g:132:1: entryRuleQNameWithWildcard : ruleQNameWithWildcard EOF ;
    public final void entryRuleQNameWithWildcard() throws RecognitionException {
        try {
            // InternalFuncDsl.g:133:1: ( ruleQNameWithWildcard EOF )
            // InternalFuncDsl.g:134:1: ruleQNameWithWildcard EOF
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
    // InternalFuncDsl.g:141:1: ruleQNameWithWildcard : ( ( rule__QNameWithWildcard__Group__0 ) ) ;
    public final void ruleQNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:145:2: ( ( ( rule__QNameWithWildcard__Group__0 ) ) )
            // InternalFuncDsl.g:146:2: ( ( rule__QNameWithWildcard__Group__0 ) )
            {
            // InternalFuncDsl.g:146:2: ( ( rule__QNameWithWildcard__Group__0 ) )
            // InternalFuncDsl.g:147:3: ( rule__QNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQNameWithWildcardAccess().getGroup()); 
            // InternalFuncDsl.g:148:3: ( rule__QNameWithWildcard__Group__0 )
            // InternalFuncDsl.g:148:4: rule__QNameWithWildcard__Group__0
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


    // $ANTLR start "entryRuleFunc"
    // InternalFuncDsl.g:157:1: entryRuleFunc : ruleFunc EOF ;
    public final void entryRuleFunc() throws RecognitionException {
        try {
            // InternalFuncDsl.g:158:1: ( ruleFunc EOF )
            // InternalFuncDsl.g:159:1: ruleFunc EOF
            {
             before(grammarAccess.getFuncRule()); 
            pushFollow(FOLLOW_1);
            ruleFunc();

            state._fsp--;

             after(grammarAccess.getFuncRule()); 
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
    // $ANTLR end "entryRuleFunc"


    // $ANTLR start "ruleFunc"
    // InternalFuncDsl.g:166:1: ruleFunc : ( ( rule__Func__Group__0 ) ) ;
    public final void ruleFunc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:170:2: ( ( ( rule__Func__Group__0 ) ) )
            // InternalFuncDsl.g:171:2: ( ( rule__Func__Group__0 ) )
            {
            // InternalFuncDsl.g:171:2: ( ( rule__Func__Group__0 ) )
            // InternalFuncDsl.g:172:3: ( rule__Func__Group__0 )
            {
             before(grammarAccess.getFuncAccess().getGroup()); 
            // InternalFuncDsl.g:173:3: ( rule__Func__Group__0 )
            // InternalFuncDsl.g:173:4: rule__Func__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Func__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuncAccess().getGroup()); 

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
    // $ANTLR end "ruleFunc"


    // $ANTLR start "entryRuleParam"
    // InternalFuncDsl.g:182:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // InternalFuncDsl.g:183:1: ( ruleParam EOF )
            // InternalFuncDsl.g:184:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalFuncDsl.g:191:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:195:2: ( ( ( rule__Param__Group__0 ) ) )
            // InternalFuncDsl.g:196:2: ( ( rule__Param__Group__0 ) )
            {
            // InternalFuncDsl.g:196:2: ( ( rule__Param__Group__0 ) )
            // InternalFuncDsl.g:197:3: ( rule__Param__Group__0 )
            {
             before(grammarAccess.getParamAccess().getGroup()); 
            // InternalFuncDsl.g:198:3: ( rule__Param__Group__0 )
            // InternalFuncDsl.g:198:4: rule__Param__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getGroup()); 

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleDataType"
    // InternalFuncDsl.g:207:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalFuncDsl.g:208:1: ( ruleDataType EOF )
            // InternalFuncDsl.g:209:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalFuncDsl.g:216:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:220:2: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalFuncDsl.g:221:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalFuncDsl.g:221:2: ( ( rule__DataType__Alternatives ) )
            // InternalFuncDsl.g:222:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalFuncDsl.g:223:3: ( rule__DataType__Alternatives )
            // InternalFuncDsl.g:223:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleBasicType"
    // InternalFuncDsl.g:232:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalFuncDsl.g:233:1: ( ruleBasicType EOF )
            // InternalFuncDsl.g:234:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalFuncDsl.g:241:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:245:2: ( ( ( rule__BasicType__Alternatives ) ) )
            // InternalFuncDsl.g:246:2: ( ( rule__BasicType__Alternatives ) )
            {
            // InternalFuncDsl.g:246:2: ( ( rule__BasicType__Alternatives ) )
            // InternalFuncDsl.g:247:3: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // InternalFuncDsl.g:248:3: ( rule__BasicType__Alternatives )
            // InternalFuncDsl.g:248:4: rule__BasicType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleClassType"
    // InternalFuncDsl.g:257:1: entryRuleClassType : ruleClassType EOF ;
    public final void entryRuleClassType() throws RecognitionException {
        try {
            // InternalFuncDsl.g:258:1: ( ruleClassType EOF )
            // InternalFuncDsl.g:259:1: ruleClassType EOF
            {
             before(grammarAccess.getClassTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleClassType();

            state._fsp--;

             after(grammarAccess.getClassTypeRule()); 
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
    // $ANTLR end "entryRuleClassType"


    // $ANTLR start "ruleClassType"
    // InternalFuncDsl.g:266:1: ruleClassType : ( ( rule__ClassType__TypeAssignment ) ) ;
    public final void ruleClassType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:270:2: ( ( ( rule__ClassType__TypeAssignment ) ) )
            // InternalFuncDsl.g:271:2: ( ( rule__ClassType__TypeAssignment ) )
            {
            // InternalFuncDsl.g:271:2: ( ( rule__ClassType__TypeAssignment ) )
            // InternalFuncDsl.g:272:3: ( rule__ClassType__TypeAssignment )
            {
             before(grammarAccess.getClassTypeAccess().getTypeAssignment()); 
            // InternalFuncDsl.g:273:3: ( rule__ClassType__TypeAssignment )
            // InternalFuncDsl.g:273:4: rule__ClassType__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ClassType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getClassTypeAccess().getTypeAssignment()); 

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
    // $ANTLR end "ruleClassType"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalFuncDsl.g:281:1: rule__DataType__Alternatives : ( ( ( rule__DataType__Group_0__0 ) ) | ( ruleClassType ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:285:1: ( ( ( rule__DataType__Group_0__0 ) ) | ( ruleClassType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=15)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFuncDsl.g:286:2: ( ( rule__DataType__Group_0__0 ) )
                    {
                    // InternalFuncDsl.g:286:2: ( ( rule__DataType__Group_0__0 ) )
                    // InternalFuncDsl.g:287:3: ( rule__DataType__Group_0__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_0()); 
                    // InternalFuncDsl.g:288:3: ( rule__DataType__Group_0__0 )
                    // InternalFuncDsl.g:288:4: rule__DataType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFuncDsl.g:292:2: ( ruleClassType )
                    {
                    // InternalFuncDsl.g:292:2: ( ruleClassType )
                    // InternalFuncDsl.g:293:3: ruleClassType
                    {
                     before(grammarAccess.getDataTypeAccess().getClassTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClassType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getClassTypeParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__BasicType__Alternatives"
    // InternalFuncDsl.g:302:1: rule__BasicType__Alternatives : ( ( 'String' ) | ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'double' ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:306:1: ( ( 'String' ) | ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'double' ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalFuncDsl.g:307:2: ( 'String' )
                    {
                    // InternalFuncDsl.g:307:2: ( 'String' )
                    // InternalFuncDsl.g:308:3: 'String'
                    {
                     before(grammarAccess.getBasicTypeAccess().getStringKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFuncDsl.g:313:2: ( 'boolean' )
                    {
                    // InternalFuncDsl.g:313:2: ( 'boolean' )
                    // InternalFuncDsl.g:314:3: 'boolean'
                    {
                     before(grammarAccess.getBasicTypeAccess().getBooleanKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getBooleanKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFuncDsl.g:319:2: ( 'int' )
                    {
                    // InternalFuncDsl.g:319:2: ( 'int' )
                    // InternalFuncDsl.g:320:3: 'int'
                    {
                     before(grammarAccess.getBasicTypeAccess().getIntKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getIntKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFuncDsl.g:325:2: ( 'long' )
                    {
                    // InternalFuncDsl.g:325:2: ( 'long' )
                    // InternalFuncDsl.g:326:3: 'long'
                    {
                     before(grammarAccess.getBasicTypeAccess().getLongKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getLongKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFuncDsl.g:331:2: ( 'double' )
                    {
                    // InternalFuncDsl.g:331:2: ( 'double' )
                    // InternalFuncDsl.g:332:3: 'double'
                    {
                     before(grammarAccess.getBasicTypeAccess().getDoubleKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getDoubleKeyword_4()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__BasicType__Alternatives"


    // $ANTLR start "rule__Namespace__Group__0"
    // InternalFuncDsl.g:341:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:345:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // InternalFuncDsl.g:346:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
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
    // InternalFuncDsl.g:353:1: rule__Namespace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:357:1: ( ( 'namespace' ) )
            // InternalFuncDsl.g:358:1: ( 'namespace' )
            {
            // InternalFuncDsl.g:358:1: ( 'namespace' )
            // InternalFuncDsl.g:359:2: 'namespace'
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalFuncDsl.g:368:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl rule__Namespace__Group__2 ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:372:1: ( rule__Namespace__Group__1__Impl rule__Namespace__Group__2 )
            // InternalFuncDsl.g:373:2: rule__Namespace__Group__1__Impl rule__Namespace__Group__2
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
    // InternalFuncDsl.g:380:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__NameAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:384:1: ( ( ( rule__Namespace__NameAssignment_1 ) ) )
            // InternalFuncDsl.g:385:1: ( ( rule__Namespace__NameAssignment_1 ) )
            {
            // InternalFuncDsl.g:385:1: ( ( rule__Namespace__NameAssignment_1 ) )
            // InternalFuncDsl.g:386:2: ( rule__Namespace__NameAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getNameAssignment_1()); 
            // InternalFuncDsl.g:387:2: ( rule__Namespace__NameAssignment_1 )
            // InternalFuncDsl.g:387:3: rule__Namespace__NameAssignment_1
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
    // InternalFuncDsl.g:395:1: rule__Namespace__Group__2 : rule__Namespace__Group__2__Impl rule__Namespace__Group__3 ;
    public final void rule__Namespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:399:1: ( rule__Namespace__Group__2__Impl rule__Namespace__Group__3 )
            // InternalFuncDsl.g:400:2: rule__Namespace__Group__2__Impl rule__Namespace__Group__3
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
    // InternalFuncDsl.g:407:1: rule__Namespace__Group__2__Impl : ( ( rule__Namespace__ImportsAssignment_2 )* ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:411:1: ( ( ( rule__Namespace__ImportsAssignment_2 )* ) )
            // InternalFuncDsl.g:412:1: ( ( rule__Namespace__ImportsAssignment_2 )* )
            {
            // InternalFuncDsl.g:412:1: ( ( rule__Namespace__ImportsAssignment_2 )* )
            // InternalFuncDsl.g:413:2: ( rule__Namespace__ImportsAssignment_2 )*
            {
             before(grammarAccess.getNamespaceAccess().getImportsAssignment_2()); 
            // InternalFuncDsl.g:414:2: ( rule__Namespace__ImportsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFuncDsl.g:414:3: rule__Namespace__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Namespace__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalFuncDsl.g:422:1: rule__Namespace__Group__3 : rule__Namespace__Group__3__Impl ;
    public final void rule__Namespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:426:1: ( rule__Namespace__Group__3__Impl )
            // InternalFuncDsl.g:427:2: rule__Namespace__Group__3__Impl
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
    // InternalFuncDsl.g:433:1: rule__Namespace__Group__3__Impl : ( ( rule__Namespace__FuncAssignment_3 ) ) ;
    public final void rule__Namespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:437:1: ( ( ( rule__Namespace__FuncAssignment_3 ) ) )
            // InternalFuncDsl.g:438:1: ( ( rule__Namespace__FuncAssignment_3 ) )
            {
            // InternalFuncDsl.g:438:1: ( ( rule__Namespace__FuncAssignment_3 ) )
            // InternalFuncDsl.g:439:2: ( rule__Namespace__FuncAssignment_3 )
            {
             before(grammarAccess.getNamespaceAccess().getFuncAssignment_3()); 
            // InternalFuncDsl.g:440:2: ( rule__Namespace__FuncAssignment_3 )
            // InternalFuncDsl.g:440:3: rule__Namespace__FuncAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__FuncAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getFuncAssignment_3()); 

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
    // InternalFuncDsl.g:449:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:453:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalFuncDsl.g:454:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalFuncDsl.g:461:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:465:1: ( ( 'import' ) )
            // InternalFuncDsl.g:466:1: ( 'import' )
            {
            // InternalFuncDsl.g:466:1: ( 'import' )
            // InternalFuncDsl.g:467:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalFuncDsl.g:476:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:480:1: ( rule__Import__Group__1__Impl )
            // InternalFuncDsl.g:481:2: rule__Import__Group__1__Impl
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
    // InternalFuncDsl.g:487:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:491:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalFuncDsl.g:492:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalFuncDsl.g:492:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalFuncDsl.g:493:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalFuncDsl.g:494:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalFuncDsl.g:494:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalFuncDsl.g:503:1: rule__QName__Group__0 : rule__QName__Group__0__Impl rule__QName__Group__1 ;
    public final void rule__QName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:507:1: ( rule__QName__Group__0__Impl rule__QName__Group__1 )
            // InternalFuncDsl.g:508:2: rule__QName__Group__0__Impl rule__QName__Group__1
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
    // InternalFuncDsl.g:515:1: rule__QName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:519:1: ( ( RULE_ID ) )
            // InternalFuncDsl.g:520:1: ( RULE_ID )
            {
            // InternalFuncDsl.g:520:1: ( RULE_ID )
            // InternalFuncDsl.g:521:2: RULE_ID
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
    // InternalFuncDsl.g:530:1: rule__QName__Group__1 : rule__QName__Group__1__Impl ;
    public final void rule__QName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:534:1: ( rule__QName__Group__1__Impl )
            // InternalFuncDsl.g:535:2: rule__QName__Group__1__Impl
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
    // InternalFuncDsl.g:541:1: rule__QName__Group__1__Impl : ( ( rule__QName__Group_1__0 )* ) ;
    public final void rule__QName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:545:1: ( ( ( rule__QName__Group_1__0 )* ) )
            // InternalFuncDsl.g:546:1: ( ( rule__QName__Group_1__0 )* )
            {
            // InternalFuncDsl.g:546:1: ( ( rule__QName__Group_1__0 )* )
            // InternalFuncDsl.g:547:2: ( rule__QName__Group_1__0 )*
            {
             before(grammarAccess.getQNameAccess().getGroup_1()); 
            // InternalFuncDsl.g:548:2: ( rule__QName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFuncDsl.g:548:3: rule__QName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__QName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalFuncDsl.g:557:1: rule__QName__Group_1__0 : rule__QName__Group_1__0__Impl rule__QName__Group_1__1 ;
    public final void rule__QName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:561:1: ( rule__QName__Group_1__0__Impl rule__QName__Group_1__1 )
            // InternalFuncDsl.g:562:2: rule__QName__Group_1__0__Impl rule__QName__Group_1__1
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
    // InternalFuncDsl.g:569:1: rule__QName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:573:1: ( ( '.' ) )
            // InternalFuncDsl.g:574:1: ( '.' )
            {
            // InternalFuncDsl.g:574:1: ( '.' )
            // InternalFuncDsl.g:575:2: '.'
            {
             before(grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalFuncDsl.g:584:1: rule__QName__Group_1__1 : rule__QName__Group_1__1__Impl ;
    public final void rule__QName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:588:1: ( rule__QName__Group_1__1__Impl )
            // InternalFuncDsl.g:589:2: rule__QName__Group_1__1__Impl
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
    // InternalFuncDsl.g:595:1: rule__QName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:599:1: ( ( RULE_ID ) )
            // InternalFuncDsl.g:600:1: ( RULE_ID )
            {
            // InternalFuncDsl.g:600:1: ( RULE_ID )
            // InternalFuncDsl.g:601:2: RULE_ID
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
    // InternalFuncDsl.g:611:1: rule__QNameWithWildcard__Group__0 : rule__QNameWithWildcard__Group__0__Impl rule__QNameWithWildcard__Group__1 ;
    public final void rule__QNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:615:1: ( rule__QNameWithWildcard__Group__0__Impl rule__QNameWithWildcard__Group__1 )
            // InternalFuncDsl.g:616:2: rule__QNameWithWildcard__Group__0__Impl rule__QNameWithWildcard__Group__1
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
    // InternalFuncDsl.g:623:1: rule__QNameWithWildcard__Group__0__Impl : ( ruleQName ) ;
    public final void rule__QNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:627:1: ( ( ruleQName ) )
            // InternalFuncDsl.g:628:1: ( ruleQName )
            {
            // InternalFuncDsl.g:628:1: ( ruleQName )
            // InternalFuncDsl.g:629:2: ruleQName
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
    // InternalFuncDsl.g:638:1: rule__QNameWithWildcard__Group__1 : rule__QNameWithWildcard__Group__1__Impl ;
    public final void rule__QNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:642:1: ( rule__QNameWithWildcard__Group__1__Impl )
            // InternalFuncDsl.g:643:2: rule__QNameWithWildcard__Group__1__Impl
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
    // InternalFuncDsl.g:649:1: rule__QNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:653:1: ( ( ( '.*' )? ) )
            // InternalFuncDsl.g:654:1: ( ( '.*' )? )
            {
            // InternalFuncDsl.g:654:1: ( ( '.*' )? )
            // InternalFuncDsl.g:655:2: ( '.*' )?
            {
             before(grammarAccess.getQNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalFuncDsl.g:656:2: ( '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFuncDsl.g:656:3: '.*'
                    {
                    match(input,19,FOLLOW_2); 

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


    // $ANTLR start "rule__Func__Group__0"
    // InternalFuncDsl.g:665:1: rule__Func__Group__0 : rule__Func__Group__0__Impl rule__Func__Group__1 ;
    public final void rule__Func__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:669:1: ( rule__Func__Group__0__Impl rule__Func__Group__1 )
            // InternalFuncDsl.g:670:2: rule__Func__Group__0__Impl rule__Func__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Func__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Func__Group__1();

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
    // $ANTLR end "rule__Func__Group__0"


    // $ANTLR start "rule__Func__Group__0__Impl"
    // InternalFuncDsl.g:677:1: rule__Func__Group__0__Impl : ( 'func' ) ;
    public final void rule__Func__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:681:1: ( ( 'func' ) )
            // InternalFuncDsl.g:682:1: ( 'func' )
            {
            // InternalFuncDsl.g:682:1: ( 'func' )
            // InternalFuncDsl.g:683:2: 'func'
            {
             before(grammarAccess.getFuncAccess().getFuncKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFuncAccess().getFuncKeyword_0()); 

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
    // $ANTLR end "rule__Func__Group__0__Impl"


    // $ANTLR start "rule__Func__Group__1"
    // InternalFuncDsl.g:692:1: rule__Func__Group__1 : rule__Func__Group__1__Impl rule__Func__Group__2 ;
    public final void rule__Func__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:696:1: ( rule__Func__Group__1__Impl rule__Func__Group__2 )
            // InternalFuncDsl.g:697:2: rule__Func__Group__1__Impl rule__Func__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Func__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Func__Group__2();

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
    // $ANTLR end "rule__Func__Group__1"


    // $ANTLR start "rule__Func__Group__1__Impl"
    // InternalFuncDsl.g:704:1: rule__Func__Group__1__Impl : ( ( rule__Func__NameAssignment_1 ) ) ;
    public final void rule__Func__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:708:1: ( ( ( rule__Func__NameAssignment_1 ) ) )
            // InternalFuncDsl.g:709:1: ( ( rule__Func__NameAssignment_1 ) )
            {
            // InternalFuncDsl.g:709:1: ( ( rule__Func__NameAssignment_1 ) )
            // InternalFuncDsl.g:710:2: ( rule__Func__NameAssignment_1 )
            {
             before(grammarAccess.getFuncAccess().getNameAssignment_1()); 
            // InternalFuncDsl.g:711:2: ( rule__Func__NameAssignment_1 )
            // InternalFuncDsl.g:711:3: rule__Func__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Func__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFuncAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Func__Group__1__Impl"


    // $ANTLR start "rule__Func__Group__2"
    // InternalFuncDsl.g:719:1: rule__Func__Group__2 : rule__Func__Group__2__Impl rule__Func__Group__3 ;
    public final void rule__Func__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:723:1: ( rule__Func__Group__2__Impl rule__Func__Group__3 )
            // InternalFuncDsl.g:724:2: rule__Func__Group__2__Impl rule__Func__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Func__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Func__Group__3();

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
    // $ANTLR end "rule__Func__Group__2"


    // $ANTLR start "rule__Func__Group__2__Impl"
    // InternalFuncDsl.g:731:1: rule__Func__Group__2__Impl : ( '(' ) ;
    public final void rule__Func__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:735:1: ( ( '(' ) )
            // InternalFuncDsl.g:736:1: ( '(' )
            {
            // InternalFuncDsl.g:736:1: ( '(' )
            // InternalFuncDsl.g:737:2: '('
            {
             before(grammarAccess.getFuncAccess().getLeftParenthesisKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFuncAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Func__Group__2__Impl"


    // $ANTLR start "rule__Func__Group__3"
    // InternalFuncDsl.g:746:1: rule__Func__Group__3 : rule__Func__Group__3__Impl rule__Func__Group__4 ;
    public final void rule__Func__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:750:1: ( rule__Func__Group__3__Impl rule__Func__Group__4 )
            // InternalFuncDsl.g:751:2: rule__Func__Group__3__Impl rule__Func__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Func__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Func__Group__4();

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
    // $ANTLR end "rule__Func__Group__3"


    // $ANTLR start "rule__Func__Group__3__Impl"
    // InternalFuncDsl.g:758:1: rule__Func__Group__3__Impl : ( ( rule__Func__ParamsAssignment_3 ) ) ;
    public final void rule__Func__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:762:1: ( ( ( rule__Func__ParamsAssignment_3 ) ) )
            // InternalFuncDsl.g:763:1: ( ( rule__Func__ParamsAssignment_3 ) )
            {
            // InternalFuncDsl.g:763:1: ( ( rule__Func__ParamsAssignment_3 ) )
            // InternalFuncDsl.g:764:2: ( rule__Func__ParamsAssignment_3 )
            {
             before(grammarAccess.getFuncAccess().getParamsAssignment_3()); 
            // InternalFuncDsl.g:765:2: ( rule__Func__ParamsAssignment_3 )
            // InternalFuncDsl.g:765:3: rule__Func__ParamsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Func__ParamsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFuncAccess().getParamsAssignment_3()); 

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
    // $ANTLR end "rule__Func__Group__3__Impl"


    // $ANTLR start "rule__Func__Group__4"
    // InternalFuncDsl.g:773:1: rule__Func__Group__4 : rule__Func__Group__4__Impl rule__Func__Group__5 ;
    public final void rule__Func__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:777:1: ( rule__Func__Group__4__Impl rule__Func__Group__5 )
            // InternalFuncDsl.g:778:2: rule__Func__Group__4__Impl rule__Func__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Func__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Func__Group__5();

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
    // $ANTLR end "rule__Func__Group__4"


    // $ANTLR start "rule__Func__Group__4__Impl"
    // InternalFuncDsl.g:785:1: rule__Func__Group__4__Impl : ( ( rule__Func__Group_4__0 )* ) ;
    public final void rule__Func__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:789:1: ( ( ( rule__Func__Group_4__0 )* ) )
            // InternalFuncDsl.g:790:1: ( ( rule__Func__Group_4__0 )* )
            {
            // InternalFuncDsl.g:790:1: ( ( rule__Func__Group_4__0 )* )
            // InternalFuncDsl.g:791:2: ( rule__Func__Group_4__0 )*
            {
             before(grammarAccess.getFuncAccess().getGroup_4()); 
            // InternalFuncDsl.g:792:2: ( rule__Func__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFuncDsl.g:792:3: rule__Func__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Func__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFuncAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Func__Group__4__Impl"


    // $ANTLR start "rule__Func__Group__5"
    // InternalFuncDsl.g:800:1: rule__Func__Group__5 : rule__Func__Group__5__Impl rule__Func__Group__6 ;
    public final void rule__Func__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:804:1: ( rule__Func__Group__5__Impl rule__Func__Group__6 )
            // InternalFuncDsl.g:805:2: rule__Func__Group__5__Impl rule__Func__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Func__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Func__Group__6();

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
    // $ANTLR end "rule__Func__Group__5"


    // $ANTLR start "rule__Func__Group__5__Impl"
    // InternalFuncDsl.g:812:1: rule__Func__Group__5__Impl : ( ')' ) ;
    public final void rule__Func__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:816:1: ( ( ')' ) )
            // InternalFuncDsl.g:817:1: ( ')' )
            {
            // InternalFuncDsl.g:817:1: ( ')' )
            // InternalFuncDsl.g:818:2: ')'
            {
             before(grammarAccess.getFuncAccess().getRightParenthesisKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFuncAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Func__Group__5__Impl"


    // $ANTLR start "rule__Func__Group__6"
    // InternalFuncDsl.g:827:1: rule__Func__Group__6 : rule__Func__Group__6__Impl rule__Func__Group__7 ;
    public final void rule__Func__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:831:1: ( rule__Func__Group__6__Impl rule__Func__Group__7 )
            // InternalFuncDsl.g:832:2: rule__Func__Group__6__Impl rule__Func__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Func__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Func__Group__7();

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
    // $ANTLR end "rule__Func__Group__6"


    // $ANTLR start "rule__Func__Group__6__Impl"
    // InternalFuncDsl.g:839:1: rule__Func__Group__6__Impl : ( '{' ) ;
    public final void rule__Func__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:843:1: ( ( '{' ) )
            // InternalFuncDsl.g:844:1: ( '{' )
            {
            // InternalFuncDsl.g:844:1: ( '{' )
            // InternalFuncDsl.g:845:2: '{'
            {
             before(grammarAccess.getFuncAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFuncAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Func__Group__6__Impl"


    // $ANTLR start "rule__Func__Group__7"
    // InternalFuncDsl.g:854:1: rule__Func__Group__7 : rule__Func__Group__7__Impl ;
    public final void rule__Func__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:858:1: ( rule__Func__Group__7__Impl )
            // InternalFuncDsl.g:859:2: rule__Func__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Func__Group__7__Impl();

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
    // $ANTLR end "rule__Func__Group__7"


    // $ANTLR start "rule__Func__Group__7__Impl"
    // InternalFuncDsl.g:865:1: rule__Func__Group__7__Impl : ( '}' ) ;
    public final void rule__Func__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:869:1: ( ( '}' ) )
            // InternalFuncDsl.g:870:1: ( '}' )
            {
            // InternalFuncDsl.g:870:1: ( '}' )
            // InternalFuncDsl.g:871:2: '}'
            {
             before(grammarAccess.getFuncAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFuncAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Func__Group__7__Impl"


    // $ANTLR start "rule__Func__Group_4__0"
    // InternalFuncDsl.g:881:1: rule__Func__Group_4__0 : rule__Func__Group_4__0__Impl rule__Func__Group_4__1 ;
    public final void rule__Func__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:885:1: ( rule__Func__Group_4__0__Impl rule__Func__Group_4__1 )
            // InternalFuncDsl.g:886:2: rule__Func__Group_4__0__Impl rule__Func__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Func__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Func__Group_4__1();

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
    // $ANTLR end "rule__Func__Group_4__0"


    // $ANTLR start "rule__Func__Group_4__0__Impl"
    // InternalFuncDsl.g:893:1: rule__Func__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Func__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:897:1: ( ( ',' ) )
            // InternalFuncDsl.g:898:1: ( ',' )
            {
            // InternalFuncDsl.g:898:1: ( ',' )
            // InternalFuncDsl.g:899:2: ','
            {
             before(grammarAccess.getFuncAccess().getCommaKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFuncAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Func__Group_4__0__Impl"


    // $ANTLR start "rule__Func__Group_4__1"
    // InternalFuncDsl.g:908:1: rule__Func__Group_4__1 : rule__Func__Group_4__1__Impl ;
    public final void rule__Func__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:912:1: ( rule__Func__Group_4__1__Impl )
            // InternalFuncDsl.g:913:2: rule__Func__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Func__Group_4__1__Impl();

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
    // $ANTLR end "rule__Func__Group_4__1"


    // $ANTLR start "rule__Func__Group_4__1__Impl"
    // InternalFuncDsl.g:919:1: rule__Func__Group_4__1__Impl : ( ( rule__Func__ParamsAssignment_4_1 ) ) ;
    public final void rule__Func__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:923:1: ( ( ( rule__Func__ParamsAssignment_4_1 ) ) )
            // InternalFuncDsl.g:924:1: ( ( rule__Func__ParamsAssignment_4_1 ) )
            {
            // InternalFuncDsl.g:924:1: ( ( rule__Func__ParamsAssignment_4_1 ) )
            // InternalFuncDsl.g:925:2: ( rule__Func__ParamsAssignment_4_1 )
            {
             before(grammarAccess.getFuncAccess().getParamsAssignment_4_1()); 
            // InternalFuncDsl.g:926:2: ( rule__Func__ParamsAssignment_4_1 )
            // InternalFuncDsl.g:926:3: rule__Func__ParamsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Func__ParamsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFuncAccess().getParamsAssignment_4_1()); 

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
    // $ANTLR end "rule__Func__Group_4__1__Impl"


    // $ANTLR start "rule__Param__Group__0"
    // InternalFuncDsl.g:935:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:939:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // InternalFuncDsl.g:940:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Param__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Param__Group__1();

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
    // $ANTLR end "rule__Param__Group__0"


    // $ANTLR start "rule__Param__Group__0__Impl"
    // InternalFuncDsl.g:947:1: rule__Param__Group__0__Impl : ( ( rule__Param__DataTypeAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:951:1: ( ( ( rule__Param__DataTypeAssignment_0 ) ) )
            // InternalFuncDsl.g:952:1: ( ( rule__Param__DataTypeAssignment_0 ) )
            {
            // InternalFuncDsl.g:952:1: ( ( rule__Param__DataTypeAssignment_0 ) )
            // InternalFuncDsl.g:953:2: ( rule__Param__DataTypeAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getDataTypeAssignment_0()); 
            // InternalFuncDsl.g:954:2: ( rule__Param__DataTypeAssignment_0 )
            // InternalFuncDsl.g:954:3: rule__Param__DataTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Param__DataTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getDataTypeAssignment_0()); 

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
    // $ANTLR end "rule__Param__Group__0__Impl"


    // $ANTLR start "rule__Param__Group__1"
    // InternalFuncDsl.g:962:1: rule__Param__Group__1 : rule__Param__Group__1__Impl ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:966:1: ( rule__Param__Group__1__Impl )
            // InternalFuncDsl.g:967:2: rule__Param__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__1__Impl();

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
    // $ANTLR end "rule__Param__Group__1"


    // $ANTLR start "rule__Param__Group__1__Impl"
    // InternalFuncDsl.g:973:1: rule__Param__Group__1__Impl : ( ( rule__Param__NameAssignment_1 ) ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:977:1: ( ( ( rule__Param__NameAssignment_1 ) ) )
            // InternalFuncDsl.g:978:1: ( ( rule__Param__NameAssignment_1 ) )
            {
            // InternalFuncDsl.g:978:1: ( ( rule__Param__NameAssignment_1 ) )
            // InternalFuncDsl.g:979:2: ( rule__Param__NameAssignment_1 )
            {
             before(grammarAccess.getParamAccess().getNameAssignment_1()); 
            // InternalFuncDsl.g:980:2: ( rule__Param__NameAssignment_1 )
            // InternalFuncDsl.g:980:3: rule__Param__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Param__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Param__Group__1__Impl"


    // $ANTLR start "rule__DataType__Group_0__0"
    // InternalFuncDsl.g:989:1: rule__DataType__Group_0__0 : rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1 ;
    public final void rule__DataType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:993:1: ( rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1 )
            // InternalFuncDsl.g:994:2: rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__DataType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_0__1();

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
    // $ANTLR end "rule__DataType__Group_0__0"


    // $ANTLR start "rule__DataType__Group_0__0__Impl"
    // InternalFuncDsl.g:1001:1: rule__DataType__Group_0__0__Impl : ( () ) ;
    public final void rule__DataType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:1005:1: ( ( () ) )
            // InternalFuncDsl.g:1006:1: ( () )
            {
            // InternalFuncDsl.g:1006:1: ( () )
            // InternalFuncDsl.g:1007:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_0_0()); 
            // InternalFuncDsl.g:1008:2: ()
            // InternalFuncDsl.g:1008:3: 
            {
            }

             after(grammarAccess.getDataTypeAccess().getDataTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0__0__Impl"


    // $ANTLR start "rule__DataType__Group_0__1"
    // InternalFuncDsl.g:1016:1: rule__DataType__Group_0__1 : rule__DataType__Group_0__1__Impl ;
    public final void rule__DataType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:1020:1: ( rule__DataType__Group_0__1__Impl )
            // InternalFuncDsl.g:1021:2: rule__DataType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_0__1__Impl();

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
    // $ANTLR end "rule__DataType__Group_0__1"


    // $ANTLR start "rule__DataType__Group_0__1__Impl"
    // InternalFuncDsl.g:1027:1: rule__DataType__Group_0__1__Impl : ( ruleBasicType ) ;
    public final void rule__DataType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:1031:1: ( ( ruleBasicType ) )
            // InternalFuncDsl.g:1032:1: ( ruleBasicType )
            {
            // InternalFuncDsl.g:1032:1: ( ruleBasicType )
            // InternalFuncDsl.g:1033:2: ruleBasicType
            {
             before(grammarAccess.getDataTypeAccess().getBasicTypeParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getBasicTypeParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__DataType__Group_0__1__Impl"


    // $ANTLR start "rule__Namespace__NameAssignment_1"
    // InternalFuncDsl.g:1043:1: rule__Namespace__NameAssignment_1 : ( ruleQName ) ;
    public final void rule__Namespace__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:1047:1: ( ( ruleQName ) )
            // InternalFuncDsl.g:1048:2: ( ruleQName )
            {
            // InternalFuncDsl.g:1048:2: ( ruleQName )
            // InternalFuncDsl.g:1049:3: ruleQName
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
    // InternalFuncDsl.g:1058:1: rule__Namespace__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Namespace__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:1062:1: ( ( ruleImport ) )
            // InternalFuncDsl.g:1063:2: ( ruleImport )
            {
            // InternalFuncDsl.g:1063:2: ( ruleImport )
            // InternalFuncDsl.g:1064:3: ruleImport
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


    // $ANTLR start "rule__Namespace__FuncAssignment_3"
    // InternalFuncDsl.g:1073:1: rule__Namespace__FuncAssignment_3 : ( ruleFunc ) ;
    public final void rule__Namespace__FuncAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:1077:1: ( ( ruleFunc ) )
            // InternalFuncDsl.g:1078:2: ( ruleFunc )
            {
            // InternalFuncDsl.g:1078:2: ( ruleFunc )
            // InternalFuncDsl.g:1079:3: ruleFunc
            {
             before(grammarAccess.getNamespaceAccess().getFuncFuncParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFunc();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getFuncFuncParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Namespace__FuncAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalFuncDsl.g:1088:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:1092:1: ( ( ruleQNameWithWildcard ) )
            // InternalFuncDsl.g:1093:2: ( ruleQNameWithWildcard )
            {
            // InternalFuncDsl.g:1093:2: ( ruleQNameWithWildcard )
            // InternalFuncDsl.g:1094:3: ruleQNameWithWildcard
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


    // $ANTLR start "rule__Func__NameAssignment_1"
    // InternalFuncDsl.g:1103:1: rule__Func__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Func__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:1107:1: ( ( RULE_ID ) )
            // InternalFuncDsl.g:1108:2: ( RULE_ID )
            {
            // InternalFuncDsl.g:1108:2: ( RULE_ID )
            // InternalFuncDsl.g:1109:3: RULE_ID
            {
             before(grammarAccess.getFuncAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFuncAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Func__NameAssignment_1"


    // $ANTLR start "rule__Func__ParamsAssignment_3"
    // InternalFuncDsl.g:1118:1: rule__Func__ParamsAssignment_3 : ( ruleParam ) ;
    public final void rule__Func__ParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:1122:1: ( ( ruleParam ) )
            // InternalFuncDsl.g:1123:2: ( ruleParam )
            {
            // InternalFuncDsl.g:1123:2: ( ruleParam )
            // InternalFuncDsl.g:1124:3: ruleParam
            {
             before(grammarAccess.getFuncAccess().getParamsParamParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getFuncAccess().getParamsParamParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Func__ParamsAssignment_3"


    // $ANTLR start "rule__Func__ParamsAssignment_4_1"
    // InternalFuncDsl.g:1133:1: rule__Func__ParamsAssignment_4_1 : ( ruleParam ) ;
    public final void rule__Func__ParamsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:1137:1: ( ( ruleParam ) )
            // InternalFuncDsl.g:1138:2: ( ruleParam )
            {
            // InternalFuncDsl.g:1138:2: ( ruleParam )
            // InternalFuncDsl.g:1139:3: ruleParam
            {
             before(grammarAccess.getFuncAccess().getParamsParamParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getFuncAccess().getParamsParamParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Func__ParamsAssignment_4_1"


    // $ANTLR start "rule__Param__DataTypeAssignment_0"
    // InternalFuncDsl.g:1148:1: rule__Param__DataTypeAssignment_0 : ( ruleDataType ) ;
    public final void rule__Param__DataTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:1152:1: ( ( ruleDataType ) )
            // InternalFuncDsl.g:1153:2: ( ruleDataType )
            {
            // InternalFuncDsl.g:1153:2: ( ruleDataType )
            // InternalFuncDsl.g:1154:3: ruleDataType
            {
             before(grammarAccess.getParamAccess().getDataTypeDataTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getParamAccess().getDataTypeDataTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Param__DataTypeAssignment_0"


    // $ANTLR start "rule__Param__NameAssignment_1"
    // InternalFuncDsl.g:1163:1: rule__Param__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:1167:1: ( ( RULE_ID ) )
            // InternalFuncDsl.g:1168:2: ( RULE_ID )
            {
            // InternalFuncDsl.g:1168:2: ( RULE_ID )
            // InternalFuncDsl.g:1169:3: RULE_ID
            {
             before(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Param__NameAssignment_1"


    // $ANTLR start "rule__ClassType__TypeAssignment"
    // InternalFuncDsl.g:1178:1: rule__ClassType__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ClassType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuncDsl.g:1182:1: ( ( ( RULE_ID ) ) )
            // InternalFuncDsl.g:1183:2: ( ( RULE_ID ) )
            {
            // InternalFuncDsl.g:1183:2: ( ( RULE_ID ) )
            // InternalFuncDsl.g:1184:3: ( RULE_ID )
            {
             before(grammarAccess.getClassTypeAccess().getTypeClazzCrossReference_0()); 
            // InternalFuncDsl.g:1185:3: ( RULE_ID )
            // InternalFuncDsl.g:1186:4: RULE_ID
            {
             before(grammarAccess.getClassTypeAccess().getTypeClazzIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassTypeAccess().getTypeClazzIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getClassTypeAccess().getTypeClazzCrossReference_0()); 

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
    // $ANTLR end "rule__ClassType__TypeAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000F810L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000000F800L});

}