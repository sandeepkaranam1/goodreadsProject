package com.goodreads.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FinalResponse {
	@JsonProperty("GoodreadsResponse")
	private GoodreadsResponse goodreadsResponse;

	public GoodreadsResponse getGoodreadsResponse() {
		return goodreadsResponse;
	}

	public void setGoodreadsResponse(GoodreadsResponse goodreadsResponse) {
		this.goodreadsResponse = goodreadsResponse;
	}

}
