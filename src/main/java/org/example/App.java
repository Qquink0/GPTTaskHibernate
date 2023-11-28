package org.example;

import org.example.bookDAO.BookDAO;
import org.example.model.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        BookDAO bookDAO = new BookDAO();

        Book book1 = new Book();
        book1.setTitle("To Kill a Mockingbird");
        book1.setAuthor("Harper Lee");
        book1.setAge(1960);

        bookDAO.saveBook(book1);

        Book book2 = new Book();
        book2.setTitle("1984");
        book2.setAuthor("George Orwell");
        book2.setAge(1949);

        bookDAO.saveBook(book2);
    }
}
