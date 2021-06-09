package com.goodreads.model;

import java.util.List;

public class BookItems {
	int size;

	List<BookItem> bookItems;

	public BookItems() {
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<BookItem> getBookItems() {
		return bookItems;
	}

	public void setBookItems(List<BookItem> bookItems) {
		this.bookItems = bookItems;
	}

}
