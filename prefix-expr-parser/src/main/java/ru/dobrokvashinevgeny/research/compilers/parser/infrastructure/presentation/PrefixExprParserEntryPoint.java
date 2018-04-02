/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.compilers.parser.infrastructure.presentation;

import ru.dobrokvashinevgeny.research.compilers.parser.infrastructure.*;

/**
 * Класс PrefixExprParserEntryPoint
 */
public class PrefixExprParserEntryPoint {
	public static void main(String[] args) {
		PrefixExprParserApplication application = Applications.createApplication();

		application.run();
	}
}