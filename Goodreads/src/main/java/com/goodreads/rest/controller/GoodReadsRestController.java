package com.goodreads.rest.controller;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.goodreads.api.model.Book;
import com.goodreads.model.BookItem;
import com.goodreads.model.BookItems;
import com.goodreads.service.GoodReadsApiClient;

@RestController
public class GoodReadsRestController {

	
	@Autowired
	private GoodReadsApiClient goodReadsApiClient;

	@GetMapping("/searchBooks")
	public List<BookItem> getBooks(@RequestParam(name = "sortField", required = false) String sortBy)
			throws JsonMappingException, JsonProcessingException {
		List<Book> books = goodReadsApiClient.getBooksbyReviews();

		List<BookItem> result = new ArrayList<BookItem>();

		for (Book book : books) {
			result.add(new BookItem(book));
		}
		books.size();

		System.out.println("hi");

		System.out.println(books.size());

		if (sortBy == null || sortBy.equals("title")) {
			Collections.sort(result, new TitleComparator());
		} else if (sortBy.equals("author")) {
			Collections.sort(result, new AuthorNameComparator());
		}

		return result;
	}

	@GetMapping("/searchBooksForWeb")
	public BookItems getBooksForWeb(@RequestParam(name = "sortField", required = false) String sortBy)
			throws JsonMappingException, JsonProcessingException {
		BookItems bookItems = new BookItems();
		List<Book> books = goodReadsApiClient.getBooksbyReviews();

		List<BookItem> result = new ArrayList<BookItem>();

		for (Book book : books) {
			result.add(new BookItem(book));
		}
		
		

		bookItems.setSize(books.size());

		if (sortBy == null || sortBy.equals("title")) {
			Collections.sort(result, new TitleComparator());
		} else if (sortBy.equals("author")) {
			Collections.sort(result, new AuthorNameComparator());
		}
		bookItems.setBookItems(result);
		

		return bookItems;
	}

	class TitleComparator implements Comparator<BookItem> {

		@Override
		public int compare(BookItem o1, BookItem o2) {

			return o1.getTitle().compareTo(o2.getTitle());
		}

	}

	class AuthorNameComparator implements Comparator<BookItem> {

		@Override
		public int compare(BookItem o1, BookItem o2) {
			// TODO Auto-generated method stub
			return o1.getAuthor().compareTo(o2.getAuthor());
		}
	}

}
