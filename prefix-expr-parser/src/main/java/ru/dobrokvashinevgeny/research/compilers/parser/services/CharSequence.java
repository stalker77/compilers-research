package ru.dobrokvashinevgeny.research.compilers.parser.services;

import java.io.IOException;

/**
 * Класс CharSequence
 */
public interface CharSequence {
	char getNextChar() throws IOException;
}