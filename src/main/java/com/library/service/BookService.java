package com.library.service;

import com.library.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class BookService {

    private final List<Book> books = new ArrayList<>();
    private final AtomicInteger idGenerator = new AtomicInteger(1);

    public BookService() {
        books.add(new Book(
            idGenerator.getAndIncrement(),
            "Java Programming",
            "James Gosling",
            "Programming"
        ));

        books.add(new Book(
            idGenerator.getAndIncrement(),
            "Spring Boot Basics",
            "Craig Walls",
            "Technology"
        ));

        books.add(new Book(
            idGenerator.getAndIncrement(),
            "Clean Code",
            "Robert C. Martin",
            "Software Engineering"
        ));
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    public void addBook(Book book) {
        book.setId(idGenerator.getAndIncrement());
        books.add(book);
    }

    public boolean deleteBook(int id) {
        return books.removeIf(book -> book.getId() == id);
    }
}