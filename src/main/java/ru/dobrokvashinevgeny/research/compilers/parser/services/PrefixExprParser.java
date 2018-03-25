/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.compilers.parser.services;

import java.io.IOException;

/**
 * Класс PrefixExprParser
 */
public class PrefixExprParser {
	private final CharSequence charSequence;
	private char lookahead;

	public PrefixExprParser(CharSequence charSequence) {
		this.charSequence = charSequence;
	}

	public void parse() throws ParseException {
		lookahead = nextTerminal();
		S();
	}

	private void S() throws ParseException {
		switch(lookahead) {
			case '+':
				match('+');
				S(); S();
				break;
			case '-':
				match('-');
				S(); S();
				break;
			case 'a':
				match('a');
				break;
			default:
				throw new ParseException("Syntax error");
		}
	}

	private void match(char terminal) throws ParseException {
		if (lookahead == terminal) {
			lookahead = nextTerminal();
		} else {
			throw new ParseException("Syntax error");
		}
	}

	private char nextTerminal() throws ParseException {
		try {
			return charSequence.getNextChar();
		} catch (IOException e) {
			throw new ParseException(e);
		}
	}
}