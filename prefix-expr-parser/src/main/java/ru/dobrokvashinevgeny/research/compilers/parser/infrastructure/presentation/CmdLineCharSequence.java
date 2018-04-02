/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.compilers.parser.infrastructure.presentation;

import ru.dobrokvashinevgeny.research.compilers.parser.services.CharSequence;

import java.io.IOException;

/**
 * Класс CmdLineCharSequence
 */
public class CmdLineCharSequence implements CharSequence{
	@Override
	public char getNextChar() throws IOException {
		return (char)System.in.read();
	}
}