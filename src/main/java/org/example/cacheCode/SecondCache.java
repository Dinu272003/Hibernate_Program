package org.example.cacheCode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SecondCache {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");


        SessionFactory sf = cfg.buildSessionFactory();
        Session session=sf.openSession();
        //  SESSION 1 → DB HIT
        Session session1 = sf.openSession();
        Transaction tx1 = session1.beginTransaction();

        Mobile m1 = new Mobile();
        m1.setMobileId(1);
        m1.setMobileName("Realme");
        m1.setMobileColour("Black");

//      session1.save(m1);
        tx1.commit();

        // fetch (DB hit)
        Mobile mob1 = session1.get(Mobile.class, 1);
        System.out.println("Session1: " + mob1.getMobileName());

        session1.close();

        System.out.println("--------------------------------");

//         SESSION 2 → CACHE HIT (NO DB)
        Session session2 = sf.openSession();

        Mobile mob2 = session2.get(Mobile.class, 1);
        System.out.println("Session2: " + mob2.getMobileName());

        session2.close();
        sf.close();

    }
}
