package com.goodreads.web.controller;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.goodreads.model.BookItem;
import com.goodreads.model.BookItems;

@Controller
@RequestMapping("/")
public class GoodReadDemo {

	private RestTemplate template = new RestTemplate();

	public String gotoHomepage() {
		return "goodreads";
	}

	@GetMapping("/search")
	public String getBooks(Model model) throws JsonMappingException, JsonProcessingException {

		HttpEntity<String> entity = new HttpEntity<String>(new HttpHeaders());
//		ResponseEntity<String> response = template.exchange("http://localhost:8080/searchBooksForWeb", HttpMethod.GET,
//				entity, String.class);
		
		Client client = ClientBuilder.newClient();
		
		String response=client
        .target("http://localhost:8080/searchBooksForWeb")
        .request(MediaType.APPLICATION_JSON)
        .get(String.class);
		
		BookItems books=new ObjectMapper().readValue(response, BookItems.class);
		
		System.out.println(" ============="+response);
		
		model.addAttribute("books", books.getBookItems());

		return "goodreads_results.html";
	}

}
