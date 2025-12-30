package org.example;


import org.example.entity.Danny;
import org.example.entity.DannyDataBase;
import org.example.manyToManyEmp.Emp;
import org.example.oneToOne.Answer;
import org.example.oneToOne.Question;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class App 
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {

        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory= cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        //Anwer..1
        Answer ans1 =new Answer();
        ans1.setAnsId(1);
        ans1.setAns("Dinesh");

        // Question
        Question question1=new Question();
        question1.setQuestionId(1);
        question1.setQuestion("Name::");
        question1.setAnsId(ans1);

        Answer ans2 =new Answer();
        ans2.setAnsId(2);
        ans2.setAns("Nanded");

        // Question
        Question question2=new Question();
        question2.setQuestionId(2);
        question2.setQuestion("From::");
        question2.setAnsId(ans2);


        Answer ans3 =new Answer();
        ans3.setAnsId(3);
        ans3.setAns("CSE");

        // Question
        Question question3=new Question();
        question3.setQuestionId(3);
        question3.setQuestion("Branch::");
        question3.setAnsId(ans3);


        session.save(question1);
        session.save(question2);
        session.save(question3);

        transaction.commit();

//        Scanner sc=new Scanner(System.in);
//        System.out.println( "Enter Student Name:::" );
//        int id=sc.nextInt();
//        Emp emp1 = new Emp();
//        emp1.setFirstName(null);
//        emp1.setLastName("Shrirame");
//        emp1.setDept("MCS");
//        emp1.setAge(23);
//        emp1.setAddress("NARSI");
//        emp1.setSalary(120000);
//        emp1.setMobileNumber(9834381544L);
//
//        // For Danny Class...
//        Configuration cfg=new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//
//        SessionFactory sessionFactory=cfg.buildSessionFactory();
//        Session session=sessionFactory.openSession();
//        Transaction transaction=session.beginTransaction();
//
//        Danny d1=new Danny();
//        d1.setId(1);
//        d1.setName("Danny");
//        d1.setAge(23);
//        d1.setAdress("Nanded");
////         insert Data in Data base...
//        try {
//            session.save(emp1);
////            session.save(d1);
//            transaction.commit();
//
//            logger.info("Employee Successfully inserted");
//        } catch (Exception e) {
//            logger.info("due to some issue employee not inserted");
//            e.printStackTrace();
//        }
//
//        // select use...
////        try {
////               Emp emp= session.get(Emp.class,id);
////
////            System.out.println("First Name:"+emp.getFirstName());
////            System.out.println("First Name:"+emp.getLastName());
////            System.out.println("First Name:"+emp.getAddress());
////            System.out.println("First Name:"+emp.getDept());
////            System.out.println("First Name:"+emp.getAge());
//            System.out.println("First Name:"+emp.getMobileNumber());
//            System.out.println("First Name:"+emp.getId());
//            System.out.println("First Name:"+emp.getSalary());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        // ------------ delete ----------------------

//        try {
//            Emp emp=session.get(Emp.class,id);
//            session.delete(emp);
//            transaction.commit();
//            System.out.println("Sucessfully Data Deleted....");
//
//        } catch (Exception e) {
//            System.out.println("Due to some issue in Delete Operation...");
//            e.printStackTrace();
//        }


    }
}
