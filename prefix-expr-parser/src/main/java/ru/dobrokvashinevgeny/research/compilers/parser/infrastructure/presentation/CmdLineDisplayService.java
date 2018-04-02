/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.compilers.parser.infrastructure.presentation;

import ru.dobrokvashinevgeny.research.compilers.parser.services.DisplayService;

/**
 * Класс CmdLineDisplayService
 */
public class CmdLineDisplayService implements DisplayService {
	@Override
	public void showString(String stringToShow) {
		System.out.println(stringToShow);
	}
}