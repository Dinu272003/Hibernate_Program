package org.example.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DannyDataBase {
    public static void main(String[] args) {

        Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        UseEmbedable embedable=new UseEmbedable();
        embedable.setCourse("Java");
       embedable.setDuration("2 Month");

        Danny d1=new Danny();
        d1.setId(1);
        d1.setName("Dinesh");
        d1.setAge(22);
        d1.setAdress("Nanded");
        d1.setEmbedable(embedable);

        try{
            session.save(d1);
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
