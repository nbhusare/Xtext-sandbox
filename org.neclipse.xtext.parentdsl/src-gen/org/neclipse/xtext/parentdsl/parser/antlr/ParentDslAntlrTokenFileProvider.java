/*
* generated by Xtext
*/
package org.neclipse.xtext.parentdsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ParentDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/neclipse/xtext/parentdsl/parser/antlr/internal/InternalParentDsl.tokens");
	}
}
