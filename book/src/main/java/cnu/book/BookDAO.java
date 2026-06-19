package cnu.book;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class BookDAO {

    private static final SessionFactory factory =
            new Configuration().configure().buildSessionFactory();

    public void saveBook(Book book) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(book);

        tx.commit();
        session.close();
    }

    public List<Book> getAllBooks() {
        Session session = factory.openSession();

        List<Book> list =
                session.createQuery("From Book", Book.class).list();

        session.close();
        return list;
    }

    public Book getBook(int id) {
        Session session = factory.openSession();

        Book bk = session.get(Book.class, id);

        session.close();
        return bk;
    }

    public void updateBook(Book book) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.merge(book);

        tx.commit();
        session.close();
    }

    public void deleteBook(int id) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Book bk = session.get(Book.class, id);

        if (bk != null) {
            session.remove(bk);
        }

        tx.commit();
        session.close();
    }
}