package com.example.book;

import com.example.book.dto.BookDTO;
import com.example.book.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class BookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }
    @Bean
    CommandLineRunner start(BookService bookService){
        return args -> {
            List<BookDTO> booksDTO = List.of(
                    BookDTO.builder()
                            .title("Book1")
                            .publisher("Publisher1")
                            .datePublication(LocalDate.of(2020, 5, 15))
                            .price(19.99)
                            .resume("Résumé du livre 1")
                            .build(),
                    BookDTO.builder()
                            .title("Book2")
                            .publisher("Publisher2")
                            .datePublication(LocalDate.of(2021, 8, 20))
                            .price(25.50)
                            .resume("Résumé du livre 2")
                            .build(),
                    BookDTO.builder()
                            .title("Book3")
                            .publisher("Publisher3")
                            .datePublication(LocalDate.of(2019, 11, 3))
                            .price(18.75)
                            .resume("Résumé du livre 3")
                            .build(),
                    BookDTO.builder()
                            .title("Book4")
                            .publisher("Publisher4")
                            .datePublication(LocalDate.of(2022, 1, 25))
                            .price(22.99)
                            .resume("Résumé du livre 4")
                            .build()
            );


        };
    }

}

