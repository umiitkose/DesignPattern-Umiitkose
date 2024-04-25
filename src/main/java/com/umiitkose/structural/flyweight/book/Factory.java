package com.umiitkose.structural.flyweight.book;

public interface Factory {
	Character createCharacter(char c, boolean upperCase);

	Line createLine(int numberOfCharacters);
	
	Page createPage(int no, int numberOfLines);

	Book createBook(String name, int numberOfPages);
}
