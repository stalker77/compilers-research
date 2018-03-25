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

	public PrefixExprParserApplication(CharSequence charSequence) {
		this.charSequence = charSequence;
	}

	public PrefixExprParser createParser() {
		return new PrefixExprParser(charSequence);
	}
}