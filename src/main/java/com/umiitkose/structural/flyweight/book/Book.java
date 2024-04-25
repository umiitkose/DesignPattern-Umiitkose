package com.umiitkose.structural.flyweight.book;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String bookName;
	private List<Page> pages;
	private static Character endOfPage = new Character(12);

	public Book(String bookName, int numberOfPages) {
		this.bookName = bookName;
		pages = new ArrayList<>(numberOfPages);
	}

	public void add(Page page) {
		pages.add(page);
	}

	public List<Page> getPages() {
		return pages;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Page page : pages) {
			sb.append(page.toString());
			sb.append(endOfPage.toString());
		}
		return sb.toString();
	}
}
