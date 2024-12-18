package com.example.book.web;

import com.example.book.dto.BookDTO;
import com.example.book.service.BookService;  // Import your BookService class
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.graphql.data.method.annotation.Argument;

import java.util.List;

@Controller
public class BookGraphQLController {

    @Autowired
    private BookService bookService;  // Inject BookService here

    // Mutation for saving a book
    @MutationMapping
    public BookDTO saveBook(@Argument BookDTO book) {
        return bookService.saveBook(book);
    }

    // Query for fetching books by title
    @QueryMapping
    public List<BookDTO> getBookByModel(@Argument String title) {
        return bookService.getBookByTitle(title);
    }
}
