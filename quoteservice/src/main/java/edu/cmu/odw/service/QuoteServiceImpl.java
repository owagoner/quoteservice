package edu.cmu.odw.service;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import edu.cmu.odw.model.Quote;


public class QuoteServiceImpl implements QuoteServiceCustom {

    Random random = new Random();
    
    @Autowired
    private QuoteService quoteService;
    
    @Override
    public Quote randomQuote() {
        ArrayList<Quote> quotes = new ArrayList<Quote>();
        
        for (Quote q: this.quoteService.findAll() ) {
            quotes.add(q);
        }
        Quote q = quotes.get(random.nextInt(quotes.size()));
        return q;
    }
    
    @Override
    public ArrayList<Quote> authorQuotes(long id){
    	ArrayList<Quote> quotes = new ArrayList<Quote>();
    	Iterable<Quote> allQuotes = quoteService.findAll();
    	
    	for(Quote q: allQuotes){
    		if(q.getAuthorId().longValue() == id){
    			quotes.add(q);
    		}
    	}
    	
    	return quotes;
    }

}
