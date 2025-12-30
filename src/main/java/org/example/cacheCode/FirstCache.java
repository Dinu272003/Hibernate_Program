package org.example.cacheCode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FirstCache {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction =session.beginTransaction();

        Laptop l1=new Laptop();
        l1.setLaptopId(1);
        l1.setLaptopName("HP");
        l1.setLaptopColour("Black");

//        session.save(l1);

        // get Data from Db 1 Time...
        Laptop s1=session.get(Laptop.class,1);
//        System.out.println(s1.getLaptopId()+"::"+s1.getLaptopName()+"::"+s1.getLaptopColour());
        System.out.println(s1);


        // get Data From db 2 Time then it will return from Cache Memory..
        System.out.println("-----------------------------------");
       Laptop s2= session.get(Laptop.class,1);
//        System.out.println(s2.getLaptopId()+"::"+s2.getLaptopName()+"::"+s2.getLaptopColour());
        System.out.println(s2);



        //it will check this object is present in chache or not...
        System.out.println(session.contains(s2));
        transaction.commit();
        session.close();

    }
}
