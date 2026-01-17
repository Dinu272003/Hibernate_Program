package org.example.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

public class HibernateOperation {

    static void addStudent(){
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Scanner sc = new Scanner(System.in);

        DeiemsStudent s1 = new DeiemsStudent();
        System.out.println("Enter Id::");
        int id = sc.nextInt();
        s1.setId(id);
        System.out.println("Enter First Name::");
        String fName = sc.next();
        s1.setFirstName(fName);
        System.out.println("Enter Last Name::");
        String lName = sc.next();
        s1.setLastName(lName);
        System.out.println("Enter Address::");
        String address = sc.next();
        s1.setAddress(address);

        session.save(s1);
        System.out.println("sucessfully Inserted...");
        transaction.commit();

    }
    static void show(){
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id::");
        int id=sc.nextInt();
        DeiemsStudent studentTest=session.get(DeiemsStudent.class,id);
        System.out.println(studentTest);

        transaction.commit();
    }
    static  void delete(){
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id::");
        int id=sc.nextInt();
        DeiemsStudent studentTest=session.get(DeiemsStudent.class,id);
        session.delete(studentTest);
        System.out.println("SucessFully Deleted..");
        transaction.commit();
    }
    static void updateData(){
        Scanner sc=new Scanner(System.in);
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<DeiemsStudent> list =
                session.createQuery("from DeiemsStudent", DeiemsStudent.class)
                        .list();

        for (DeiemsStudent s : list) {
            System.out.println(
                    s.getId() + " " +
                            s.getFirstName() + " " +
                            s.getLastName() + " " +
                            s.getAddress()
            );
        }
        System.out.println("Enter Address::");
        String address=sc.next();
        Query query = session.createQuery(
                "update DeiemsStudent set address = :addr where firstName = :name"
        );

        query.setParameter("addr", address);
        query.setParameter("name", "Danny");

        int rows = query.executeUpdate();

        transaction.commit();
        session.close();

        System.out.println("Rows updated: " + rows);

    }

    static void showAllData(){
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<DeiemsStudent> list =
                session.createQuery("from DeiemsStudent", DeiemsStudent.class)
                        .list();

        for (DeiemsStudent s : list) {
            System.out.println(
                    s.getId() + " " +
                            s.getFirstName() + " " +
                            s.getLastName() + " " +
                            s.getAddress()
            );
        }
    }

}



