package ru.dobrokvashinevgeny.research.compilers.parser.services;

import org.junit.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Класс PrefixExprParserTest
 */
public class PrefixExprParserTest {
	private PrefixExprParser parser;
	private CharSequence charSequence;

	@Before
	public void setUp() {
		charSequence = mock(CharSequence.class);
		parser = new PrefixExprParser(charSequence);
	}

	@Test
	public void parseSuccess() throws Exception {
		when(charSequence.getNextChar()).thenReturn('a', '\n');

		parser.parse();
	}

	@Test
	public void parseSuccess2() throws Exception {
		when(charSequence.getNextChar()).thenReturn('+', 'a', 'a', '\n');

		parser.parse();
	}

	@Test
	public void parseSuccess3() throws Exception {
		when(charSequence.getNextChar()).thenReturn('-', 'a', 'a', '\n');

		parser.parse();
	}

	@Test
	public void parseSuccess4() throws Exception {
		when(charSequence.getNextChar()).thenReturn('+','-', 'a', 'a', 'a', '\n');

		parser.parse();
	}

	@Test(expected = ParseException.class)
	public void parseFail() throws Exception {
		when(charSequence.getNextChar()).thenReturn('*','a', 'a', '\n');

		parser.parse();
	}

	@Test(expected = ParseException.class)
	public void parseFail2() throws Exception {
		when(charSequence.getNextChar()).thenReturn('*','a', '\n');

		parser.parse();
	}

	@Test(expected = ParseException.class)
	public void parseFail3() throws Exception {
		when(charSequence.getNextChar()).thenReturn('-','a', '\n');

		parser.parse();
	}

	@Test(expected = ParseException.class)
	public void parseFail4() throws Exception {
		when(charSequence.getNextChar()).thenReturn('+','a', '\n');

		parser.parse();
	}
}