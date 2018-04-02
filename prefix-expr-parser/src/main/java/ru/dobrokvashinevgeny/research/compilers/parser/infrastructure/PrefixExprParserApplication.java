/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.compilers.parser.infrastructure;

import ru.dobrokvashinevgeny.research.compilers.parser.services.CharSequence;
import ru.dobrokvashinevgeny.research.compilers.parser.services.*;

/**
 * Класс PrefixExprParserApplication
 */
public class PrefixExprParserApplication {
	private final CharSequence charSequence;
	private final DisplayService displayService;

	public PrefixExprParserApplication(CharSequence charSequence, DisplayService displayService) {
		this.charSequence = charSequence;
		this.displayService = displayService;
	}

	public void run() {
		PrefixExprParser parser = this.createParser();

		displayService.showString("Enter expression appropriate to grammar [S -> + S S | - S S | a]:");

		try {
			parser.parse();
		} catch (ParseException e) {
			displayService.showString(e.toString());
		}
	}

	private PrefixExprParser createParser() {
		return new PrefixExprParser(charSequence);
	}
}