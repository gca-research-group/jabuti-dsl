/*
 * generated by Xtext 2.35.0
 */
package br.edu.unijui.gca.jabuti.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class JabutiAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("br/edu/unijui/gca/jabuti/parser/antlr/internal/InternalJabuti.tokens");
	}
}
