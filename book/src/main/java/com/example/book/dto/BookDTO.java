package com.example.book.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
    private String title;
    private String publisher;
    private LocalDate datePublication;
    private Double price;
    private String resume;
}
