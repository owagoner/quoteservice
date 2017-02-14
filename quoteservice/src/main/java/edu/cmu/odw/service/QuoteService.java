package edu.cmu.odw.service;

import org.springframework.data.repository.CrudRepository;
import edu.cmu.odw.model.Quote;


public interface QuoteService extends CrudRepository<Quote, Long>, QuoteServiceCustom {

}
