package org.example.xml_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestBook {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();

        Transaction transaction=session.beginTransaction();

        Classes c1=new Classes();
        c1.setClassesId(1);
        c1.setClassesName("TDIT");
        c1.setDuration("2 Month");

        Classes c2=new Classes();
        c2.setClassesId(2);
        c2.setClassesName("Giri");
        c2.setDuration("3 Month");


        Classes c3=new Classes();
        c3.setClassesId(3);
        c3.setClassesName("Giri");
        c3.setDuration("3 Month");

        session.save(c3);
        session.save(c2);
        session.save(c1);
        transaction.commit();
    }
}
