package com.example.book.service;

import com.example.book.dto.BookDTO;

import java.util.List;

public interface BookService {

    List<BookDTO> getBookByTitle(String title);

    BookDTO saveBook (BookDTO bookDTO);

}
