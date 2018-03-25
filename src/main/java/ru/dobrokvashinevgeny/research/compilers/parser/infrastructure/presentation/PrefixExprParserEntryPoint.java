/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.compilers.parser.infrastructure.presentation;

import ru.dobrokvashinevgeny.research.compilers.parser.infrastructure.PrefixExprParserApplication;
import ru.dobrokvashinevgeny.research.compilers.parser.services.*;
import ru.dobrokvashinevgeny.research.compilers.parser.services.CharSequence;

import java.io.IOException;

/**
 * Класс PrefixExprParserEntryPoint
 */
public class PrefixExprParserEntryPoint {
	public static void main(String[] args) throws ParseException {
		PrefixExprParserApplication application = new PrefixExprParserApplication(getCharSequence());

		PrefixExprParser parser = application.createParser();

		System.out.println("Enter prefix expression(must contain only: +, -, a):");
		parser.parse();
	}

	private static CharSequence getCharSequence() {
		return new CharSequence() {
			@Override
			public char getNextChar() throws IOException {
				return (char)System.in.read();
			}
		};
	}
}