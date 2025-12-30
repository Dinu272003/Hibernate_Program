package org.example.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestManyToMany {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory= cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();


        transaction.commit();
    }
}
