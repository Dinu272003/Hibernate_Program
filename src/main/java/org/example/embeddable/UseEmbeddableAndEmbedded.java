package org.example.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UseEmbeddableAndEmbedded {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        // Student--1
        Student student1=new Student();
        student1.setId(1);
        student1.setName("Dinesh");
        student1.setLastName("Shrirame");

        // Student--2
        Student student2=new Student();
        student2.setId(2);
        student2.setName("Avi");
        student2.setLastName("Shrirame");


        // First Student...
        Address address1=new Address();
        address1.setVillageName("pachpimpli");
        address1.setSubDist("Biloli");
        address1.setDist("Nanded");
        address1.setState("MH");

        // Addrss--2
        Address address2=new Address();
        address2.setVillageName("Degloor");
        address2.setSubDist("Degloor");
        address2.setDist("Nanded");
        address2.setState("MH");

        // Set address
        student1.setAddress(address1);
        student2.setAddress(address2);

        // use get Method when this object is not present in db then throw NullPointerException...
       Student student= session.get(Student.class,2);
//        System.out.println(student.getName()+"::"+student.getLastName());
//        System.out.println("-----------------------------------------");
//        //Use session load method when object is not present in db then throw ObjectNotFoundException
//       Student s1= session.load(Student.class,2);
//        System.out.println(s1.getName());

        // update and delete Operatio..
        Student s1= session.get(Student.class,2);
        if(s1.getLastName().equals("Patil")){
            // Update Data..
            s1.setName("Danny");
            // id data is present then it will be delete...
//          session.delete(student2);
            System.out.println("Sucessfully Deleted...");
        }

//        session.save(student1);
//        session.persist(student2);
        transaction.commit();
    }
}
