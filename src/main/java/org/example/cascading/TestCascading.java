package org.example.cascading;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class TestCascading {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

       Dist d1=new Dist();
       d1.setDistId(101);
       d1.setDistName("Nanded");
       d1.setPopulation(2000);

       Dist d2=new Dist();
       d2.setDistId(102);
       d2.setDistName("Latur");
       d2.setPopulation(200000);

//       Dist d3=new Dist();
//       d3.setDistId(103);
//       d3.setDistName("Parbhani");
//        d3.setPopulation(100000);

        //Nanded-Dist---1
        SubDist subDist1=new SubDist();
        subDist1.setSubDistId(201);
        subDist1.setName("Biloli");
        subDist1.setPopulation(1000);
        subDist1.setDists(d1);

        //Nanded-Dist---2
        SubDist subDist2=new SubDist();
        subDist2.setSubDistId(202);
        subDist2.setName("Naigaon");
        subDist2.setPopulation(2000);
        subDist2.setDists(d1);

        //Nanded-Dist---1
        SubDist subDist3=new SubDist();
        subDist3.setSubDistId(203);
        subDist3.setName("Degloor");
        subDist3.setPopulation(3000);
        subDist3.setDists(d1);

        // Nanded Dist--Sub List
        List<SubDist> nandedSub=new ArrayList<>();
        nandedSub.add(subDist1);
        nandedSub.add(subDist2);
        nandedSub.add(subDist3);

        d1.setSubDists(nandedSub);
        session.save(d1);


        //Parbhani-Dist---1
        SubDist subDist4=new SubDist();
        subDist4.setSubDistId(301);
        subDist4.setName("Selu");
        subDist4.setPopulation(1000);
        subDist4.setDists(d2);

        //Par-Dist---2
        SubDist subDist5=new SubDist();
        subDist5.setSubDistId(302);
        subDist5.setName("pathri");
        subDist5.setPopulation(111000);
        subDist5.setDists(d2);


        //par-Dist---3
        SubDist subDist6=new SubDist();
        subDist6.setSubDistId(303);
        subDist6.setName("Gangakher");
        subDist6.setPopulation(1000);
        subDist6.setDists(d2);

        //Par Dist--Sub list
        List<SubDist> parbahniSub=new ArrayList<>();
        parbahniSub.add(subDist4);
        parbahniSub.add(subDist5);
        parbahniSub.add(subDist6);

        d2.setSubDists(parbahniSub);

        session.save(d2);
        transaction.commit();

    }
}
