package edu.cmu.odw.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import edu.cmu.odw.model.Quote;
import edu.cmu.odw.service.QuoteService;


@RestController
public class QuoteController {

	@Autowired
	private QuoteService quoteService;	
	
	@RequestMapping("/api/quote/random")
	public Quote random() {
		Quote q = quoteService.randomQuote(); 		
		return q;
	}

	@RequestMapping(value = "/api/quote/author/{id}")
	public ArrayList<Quote> author(@PathVariable("id") int id) {
		return quoteService.authorQuotes(id);
	}

	@RequestMapping(value = "/api/quote")
	public Iterable<Quote> allQuotes() {
		return quoteService.findAll();
	}
	
	@RequestMapping(value = "/api/quote", method = RequestMethod.POST)
	public void saveQuote(@RequestBody Quote quote) {
		System.out.println(quote);
		System.out.println("Saving quote");
		quoteService.save(quote);
	}

	public Quote fallback() {
		Quote q = new Quote();
		q.setText("The superior man is modest in his speech, but exceeds in his actions.");
		return q;
	}
}
