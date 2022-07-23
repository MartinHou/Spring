package com.martin.controller;

import com.martin.domain.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String saveBook(@RequestBody Book book){
        System.out.println("book saved "+ book);
        return "{'module':'book save success'}";
    }

    @GetMapping
    public List<Book> getAll(){
        List<Book> bookList = new ArrayList<>();

        Book book1 = new Book();
        book1.setName("C++");
        book1.setType("CS");
        book1.setDescription("good book");
        bookList.add(book1);

        Book book2 = new Book();
        book2.setName("Linear Algebra");
        book2.setType("Math");
        book2.setDescription("interesting book");
        bookList.add(book2);

        return bookList;
    }
}
