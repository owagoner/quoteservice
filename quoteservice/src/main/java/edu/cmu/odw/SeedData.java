package edu.cmu.odw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.cmu.odw.model.Quote;
import edu.cmu.odw.service.QuoteService;


@Configuration
public class SeedData {

    
    @Autowired
    private QuoteService quoteService;
    
    private static final Logger log = LoggerFactory.getLogger(SeedData.class);

    @Bean
    public SeedData getBean() {        

        Quote q1 = new Quote(
                "The world is a thing of utter inordinate complexity and richness " +
                "and strangeness that is absolutely awesome",
                "https://en.wikiquote.org/wiki/Douglas_Adams", 
                new Long(1));
        
        Quote q2 = new Quote(
                "As rain breaks through an ill-thatched house, passion will break through an unreflecting mind.", 
                "https://en.wikiquote.org/wiki/Gautama_Buddha", 
                new Long(2));
        
        Quote q3 = new Quote(
                "I think that only daring speculation can lead us further and not accumulation of facts.", 
                "https://en.wikiquote.org/wiki/Albert_Einstein", 
                new Long(3));
        Quote q4 = new Quote(
                "Look deep into nature, and then you will understand everything better.", 
                "https://www.brainyquotes.com/quotes/authors/a/albert_einstein.html", 
               new Long(3));
        
        Quote q5 = new Quote(
                "Try not to become a man of success, but rather try to become a man of value.", 
                "https://www.brainyquotes.com/quotes/authors/a/albert_einstein.html", 
                new Long(3));
        Quote q6 = new Quote(
               "Whoever is careless with the truth is mall matters cannot be trusted with important matters.", 
                "https://www.brainyquotes.com/quotes/authors/a/albert_einstein.html", 
                new Long(3));
        Quote q7 = new Quote(
                "I love deadlines. I like the whooshing sound they make as they fly by.", 
                "https://www.brainyquotes.com/quotes/authors/d/douglas_adams.html", 
                new Long(1));
        Quote q8 = new Quote(
                "To give a real service you must add something which cannot be bought or measured with money, and that is sincerity and integrity.", 
                "https://www.brainyquotes.com/quotes/authors/d/douglas_adams.html", 
                new Long(1));
        
        
        quoteService.save(q1);
        quoteService.save(q2);
        quoteService.save(q3);
        quoteService.save(q4);
        quoteService.save(q5);
        quoteService.save(q6);
        quoteService.save(q7);
        quoteService.save(q8);
        
        log.info("Quoates found with findAll():");
        log.info("-------------------------------");
        for (Quote m : quoteService.findAll()) {
            log.info(m.toString());
        }
        return new SeedData();
    }
}
