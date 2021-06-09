package com.goodreads.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GoodreadsResponse {
	private Reviews reviews;
	@JsonProperty("Request")
	private Request request;
	private Shelf shelf;

	public Reviews getReviews() {
		return reviews;
	}

	public void setReviews(Reviews reviews) {
		this.reviews = reviews;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public Shelf getShelf() {
		return shelf;
	}

	public void setShelf(Shelf shelf) {
		this.shelf = shelf;
	}

}
