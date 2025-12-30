package org.example.manyToManyEmp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class HqlQuery {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        //  HQL query
        String hql = "FROM Emp where";

        // Create Query object
        Query<Emp> query = session.createQuery(hql, Emp.class);

        // Execute query
        List<Emp> list = query.list();

        // Print result
        for (Emp emp : list) {
            System.out.println(emp.getEmpName());
            System.out.println(emp.empId);
            System.out.println(emp.getProjects());
        }


//        Query<Emp> query = session.createQuery("FROM Emp", Emp.class);
//        List<Emp> list = query.getResultList();
//
//        if (list.isEmpty()) {
//            System.out.println("No records found!");
//        }
//
//        for (Emp emp : list) {
//            System.out.println(emp.getEmpName());
//        }


        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
