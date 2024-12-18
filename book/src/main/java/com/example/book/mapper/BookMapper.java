package com.example.book.mapper;

import com.example.book.dao.entities.book;
import com.example.book.dto.BookDTO;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public BookDTO fromBookToBookDTO(book book) {
        return modelMapper.map(book, BookDTO.class);
    }

    public book fromBookDTOToBook(BookDTO bookDTO) {
        return modelMapper.map(bookDTO, book.class);
    }
}