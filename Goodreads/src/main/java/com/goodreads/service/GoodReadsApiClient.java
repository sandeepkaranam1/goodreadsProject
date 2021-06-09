package com.goodreads.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.goodreads.api.model.Book;
import com.goodreads.api.model.FinalResponse;
import com.goodreads.api.model.Review;

@Component
@Service
@PropertySource("classpath:application.properties")
public class GoodReadsApiClient {

	@Value("${id}")
	String id;
	
	@Value("${key}")
	String key;
	
	@Value("${v}")
	String v;
	
	@Value("${shelf}")
	String shelf;
	
	@Value("${per_page}")
	String per_page;
	
	public List<Book> getBooksbyReviews() throws JsonMappingException, JsonProcessingException {
		List<Book> result = new ArrayList<Book>();

		final String uri = "https://www.goodreads.com/review/list";
		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(uri);
		builder.queryParam("id", id);
		builder.queryParam("key", key);
		builder.queryParam("v", v);
		builder.queryParam("shelf", shelf);
		builder.queryParam("per_page", per_page);

		HttpEntity<String> entity = new HttpEntity<String>(headers);

		ResponseEntity<String> response = restTemplate.exchange(builder.build().toString(), HttpMethod.GET, entity,
				String.class);

//		System.out.println(response.getBody());
		JSONObject json = XML.toJSONObject(response.getBody().toString());
		String jsonString = json.toString(4);

		ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		FinalResponse finalResponse = mapper.readValue(jsonString, FinalResponse.class);

		List<Review> reviews = finalResponse.getGoodreadsResponse().getReviews().getReview();

		List<Book> books = new ArrayList<Book>();

		for (Review review : reviews) {
			books.add(review.getBook());
		}
		
		return books;
	}

	public static void main(String[] args) {
//		getBooksbyReviews("", "", "", "", "");
	}

}
