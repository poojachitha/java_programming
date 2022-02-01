package com.dxc;

import java.sql.SQLException;
import java.util.List;

import com.dao.BooksDao;
import com.dxc.model.Book;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        findAllBooks();
    }

    static void findAllBooks() {
        BooksDao dao = new BooksDao();
        try {
            List<Book> books = dao.findAll();
            if (books.size() == 0) {
                System.out.println("No books found");
                return;
            }
            books.forEach(bk -> System.out.println(bk));
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }

    static void createBooks() {
        Book animalFarm = new Book(1, "Animal Farm", "George Orwell", "123-456-78902-124");
        Book dune = new Book("Dune", "Frank Herbert", "123-456-78901-123");
        Book theHobbit = new Book("The Hobbit", "J.R.R. Tolkien", "987-654-32110-098");
        Book theLordOfTheRings = new Book("The Lord of the Rings", "J.R.R. Tolkien", "456-234-98076-890");
        Book theSilmarillion = new Book("The Silmarillion", "J.R.R. Tolkien", "123-567-12344-890");

        List<Book> books = List.of(animalFarm, dune, theHobbit, theLordOfTheRings, theSilmarillion);
        BooksDao bookDao = new BooksDao();

        books.forEach(bk -> {
            try {
                int rows = bookDao.save(bk);
                System.out.println("Rows affected: " + rows);
            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        });
    }
}
