package edu.cmu.odw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quote {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String text;
    private String source;
    private Long authorId;

    public Quote() {}

    public Quote(String text, String source, Long authorId) {
        this.text = text;
        this.source = source;
        this.authorId = authorId;
    }
    
    @Override
    public String toString() {
        return String.format("Quote[id=%d, text='%s', by author id='%d']", this.id, this.text, this.authorId);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Long getId() {
        return id;
    }

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}
    
    
}
