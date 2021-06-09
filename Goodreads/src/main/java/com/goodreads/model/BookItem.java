package com.goodreads.model;

import com.goodreads.api.model.Book;

public class BookItem {
	String author;

	String title;

	String link;

	String imagelink;

	public BookItem(String author, String title, String link, String imagelink) {
		this.author = author;
		this.title = title;
		this.link = link;
		this.imagelink = imagelink;
	}

	public BookItem(Book book) {
		this.author = book.getAuthors().getAuthor().getName();
		this.title = book.getTitle();
		this.link = book.getUri();
		this.imagelink = book.getImage_url();
	}
	
	public BookItem() {}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getImagelink() {
		return imagelink;
	}

	public void setImagelink(String imagelink) {
		this.imagelink = imagelink;
	}

}
