/*
* generated by Xtext
*/
package org.neclipse.xtend.training.smallJava.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SmallJavaDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/neclipse/xtend/training/smallJava/parser/antlr/internal/InternalSmallJavaDsl.tokens");
	}
}