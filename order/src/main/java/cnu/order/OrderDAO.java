package cnu.order;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class OrderDAO {

    private static final SessionFactory factory =
            new Configuration().configure().buildSessionFactory();

    public void saveOrder(Order order) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(order);

        tx.commit();
        session.close();
    }

    public List<Order> getAllOrders() {
        Session session = factory.openSession();

        List<Order> list =
                session.createQuery("From Order", Order.class).list();

        session.close();
        return list;
    }

    public Order getOrder(int id) {
        Session session = factory.openSession();

        Order ord = session.get(Order.class, id);

        session.close();
        return ord;
    }

    public void updateOrder(Order order) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.merge(order);

        tx.commit();
        session.close();
    }

    public void deleteOrder(int id) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Order ord = session.get(Order.class, id);

        if (ord != null) {
            session.remove(ord);
        }

        tx.commit();
        session.close();
    }
}