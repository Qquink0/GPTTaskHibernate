package org.example.bookDAO;

import org.example.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BookDAO {

    private SessionFactory factory;

    public BookDAO() {
        factory = new Configuration().addAnnotatedClass(Book.class).buildSessionFactory();
    }

    public void saveBook(Book book) {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            session.persist(book);
            session.getTransaction().commit();
        }
    }
}
