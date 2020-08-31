package com.stereotype.val.annons;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/stereotype/val/annons/book.properties")
public class Book {
	@Value("${isbn}")
	private String isbn;
	@Value("${title}")
	private String title;
	@Value("${author}")
	private String author;

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + "]";
	}

}
