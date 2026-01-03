package org.example.useValidation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDinesh {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Dinesh d1=new Dinesh();
        d1.setDineshId(1);
        d1.setAddress(null);
        d1.setBranch("CSE");

        session.save(d1);
        transaction.commit();

    }
}
