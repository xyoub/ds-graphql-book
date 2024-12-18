package com.example.book.service;

import com.example.book.dao.repositories.Bookrepository;
import com.example.book.dto.BookDTO;
import com.example.book.mapper.BookMapper;
import com.example.book.dao.entities.book;  // Assurez-vous que l'import correct est ici
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookManager implements BookService {

    @Autowired
    private Bookrepository bookrepository;

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<BookDTO> getBookByTitle(String title) {
        List<book> books = bookrepository.findByTitle(title);
        List<BookDTO> booksDTO = new ArrayList<>();
        for (com.example.book.dao.entities.book book : books) {  // Remplacez aussi ici
            booksDTO.add(bookMapper.fromBookToBookDTO(book));
        }
        return booksDTO;
    }

    @Override
    public BookDTO saveBook(BookDTO bookDTO) {
        book book = bookMapper.fromBookDTOToBook(bookDTO);  // Utilisez la bonne classe Book

        com.example.book.dao.entities.book savedBook = bookrepository.save(book);
        return bookMapper.fromBookToBookDTO(savedBook);
    }
}
