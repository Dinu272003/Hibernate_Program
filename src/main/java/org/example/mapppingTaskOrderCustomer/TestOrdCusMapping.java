package org.example.mapppingTaskOrderCustomer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class TestOrdCusMapping {

        public static void main(String[] args) {

            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");

            SessionFactory sessionFactory = cfg.buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();

            // Customer 1
            Customer c1 = new Customer();
            c1.setCustomer_Id(101);
            c1.setCustomerName("Dinesh");
            c1.setAddress("Nanded");

            // Customer 2
            Customer c2 = new Customer();
            c2.setCustomer_Id(102);
            c2.setCustomerName("Manish");
            c2.setAddress("Pune");

            // Order 1
            Order order1 = new Order();
            order1.setOrderName("Watch");
            order1.setOrderAmmount(4000);
            order1.setOrderDate("1 Jan 2026");
            order1.setCustomer(c1);   //  LINK

            // Order 2
            Order order2 = new Order();
            order2.setOrderId(302);
            order2.setOrderName("");
            order2.setOrderAmmount(45000);
            order2.setOrderDate("1 Jan 2026");
            order2.setCustomer(c1);   // LINK


            List<Order> orders = new ArrayList<>();
            orders.add(order1);
            orders.add(order2);

            c1.setOrders(orders);     // ONE TIME
            c2.setOrders(orders);

            // Save only customer (cascade will save orders)
//            session.save(c1);
//            session.save(c2);

            transaction.commit();
            session.close();
            sessionFactory.close();
        }
    }
