package org.example.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
    public static void main(String[] args) {
        Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();

//        Emp emp=session.get(Emp.class,3);
//        System.out.println(emp.getFirstName()+"::"+emp.getLastName());

//        Emp emp1=session.load(Emp.class,3);
//        System.out.println(emp1.getFirstName()+":"+emp1.getId()+":" +emp1.getSalary() );


    }

}
