package edu.cmu.odw.service;

import java.util.ArrayList;

import edu.cmu.odw.model.Quote;


public interface QuoteServiceCustom {
    public Quote randomQuote();
    public ArrayList<Quote> authorQuotes(long id);
}
