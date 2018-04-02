/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.compilers.parser.infrastructure;

import ru.dobrokvashinevgeny.research.compilers.parser.infrastructure.presentation.*;

/**
 * Класс Applications
 */
public class Applications {
	public static PrefixExprParserApplication createApplication() {
		return new PrefixExprParserApplication(new CmdLineCharSequence(), new CmdLineDisplayService());
	}
}