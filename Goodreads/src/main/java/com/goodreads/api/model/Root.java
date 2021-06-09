package com.goodreads.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {
	@JsonProperty("GoodreadsResponse")
	private GoodreadsResponse goodreadsResponse;

	public GoodreadsResponse getGoodreadsResponse() {
		return goodreadsResponse;
	}

	public void setGoodreadsResponse(GoodreadsResponse goodreadsResponse) {
		this.goodreadsResponse = goodreadsResponse;
	}

}
