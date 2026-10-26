package com.library;

import com.library.model.Book;
import com.library.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    private BookService bookService;

    @BeforeEach
    void setUp() {
        bookService = new BookService();
    }

    @Test
    void testGetAllBooks() {
        assertEquals(3, bookService.getAllBooks().size());
    }

    @Test
    void testAddBook() {
        Book book = new Book(
            0,
            "Python Basics",
            "Guido van Rossum",
            "Programming"
        );

        bookService.addBook(book);

        assertEquals(4, bookService.getAllBooks().size());
        assertEquals(
            "Python Basics",
            bookService.getAllBooks().get(3).getTitle()
        );
    }

    @Test
    void testDeleteBook() {
        boolean deleted = bookService.deleteBook(1);

        assertTrue(deleted);
        assertEquals(2, bookService.getAllBooks().size());
    }
}