package org.example.criteria;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class TestTdit {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        TditStudent t1 = new TditStudent();
        t1.setId(1);
        t1.setName("Dinesh");
        t1.setCourse("Java");

        TditStudent t2 = new TditStudent();
        t2.setId(2);
        t2.setName("Amit");
        t2.setCourse("Python");

        TditStudent t3 = new TditStudent();
        t3.setId(3);
        t3.setName("Rahul");
        t3.setCourse("Spring");

        TditStudent t4 = new TditStudent();
        t4.setId(4);
        t4.setName("Suresh");
        t4.setCourse("Hibernate");

        TditStudent t5 = new TditStudent();
        t5.setId(5);
        t5.setName("Rohit");
        t5.setCourse("Java");

        TditStudent t6 = new TditStudent();
        t6.setId(6);
        t6.setName("Kiran");
        t6.setCourse("Python");

        TditStudent t7 = new TditStudent();
        t7.setId(7);
        t7.setName("Anil");
        t7.setCourse("Spring Boot");

        TditStudent t8 = new TditStudent();
        t8.setId(8);
        t8.setName("Pankaj");
        t8.setCourse("Hibernate");

        TditStudent t9 = new TditStudent();
        t9.setId(9);
        t9.setName("Vikas");
        t9.setCourse("Java");

        TditStudent t10 = new TditStudent();
        t10.setId(10);
        t10.setName("Sachin");
        t10.setCourse("Angular");

        TditStudent t11 = new TditStudent();
        t11.setId(11);
        t11.setName("Nikhil");
        t11.setCourse("React");

        TditStudent t12 = new TditStudent();
        t12.setId(12);
        t12.setName("Pravin");
        t12.setCourse("Java");

        TditStudent t13 = new TditStudent();
        t13.setId(13);
        t13.setName("Akash");
        t13.setCourse("Python");

        TditStudent t14 = new TditStudent();
        t14.setId(14);
        t14.setName("Swapnil");
        t14.setCourse("Spring");

        TditStudent t15 = new TditStudent();
        t15.setId(15);
        t15.setName("Ramesh");
        t15.setCourse("Hibernate");

        TditStudent t16 = new TditStudent();
        t16.setId(16);
        t16.setName("Mahesh");
        t16.setCourse("Java");

        TditStudent t17 = new TditStudent();
        t17.setId(17);
        t17.setName("Ganesh");
        t17.setCourse("MySQL");

        TditStudent t18 = new TditStudent();
        t18.setId(18);
        t18.setName("Shubham");
        t18.setCourse("Spring Boot");

        TditStudent t19 = new TditStudent();
        t19.setId(19);
        t19.setName("Yogesh");
        t19.setCourse("React");

        TditStudent t20 = new TditStudent();
        t20.setId(20);
        t20.setName("Nilesh");
        t20.setCourse("Angular");

        TditStudent t21 = new TditStudent();
        t21.setId(21);
        t21.setName("Omkar");
        t21.setCourse("Java");

        TditStudent t22 = new TditStudent();
        t22.setId(22);
        t22.setName("Sanket");
        t22.setCourse("Python");

        TditStudent t23 = new TditStudent();
        t23.setId(23);
        t23.setName("Tejas");
        t23.setCourse("Spring");

        TditStudent t24 = new TditStudent();
        t24.setId(24);
        t24.setName("Pratik");
        t24.setCourse("Hibernate");

        TditStudent t25 = new TditStudent();
        t25.setId(25);
        t25.setName("Harsh");
        t25.setCourse("Java");

        TditStudent t26 = new TditStudent();
        t26.setId(26);
        t26.setName("Aditya");
        t26.setCourse("React");

        TditStudent t27 = new TditStudent();
        t27.setId(27);
        t27.setName("Siddharth");
        t27.setCourse("Angular");

        TditStudent t28 = new TditStudent();
        t28.setId(28);
        t28.setName("Mayur");
        t28.setCourse("Spring Boot");

        TditStudent t29 = new TditStudent();
        t29.setId(29);
        t29.setName("Abhishek");
        t29.setCourse("MySQL");

        TditStudent t30 = new TditStudent();
        t30.setId(30);
        t30.setName("Suraj");
        t30.setCourse("Java");

        TditStudent t31 = new TditStudent();
        t31.setId(31);
        t31.setName("Ruturaj");
        t31.setCourse("Python");

        TditStudent t32 = new TditStudent();
        t32.setId(32);
        t32.setName("Atharva");
        t32.setCourse("Spring");

        TditStudent t33 = new TditStudent();
        t33.setId(33);
        t33.setName("Manish");
        t33.setCourse("Hibernate");

        TditStudent t34 = new TditStudent();
        t34.setId(34);
        t34.setName("Kunal");
        t34.setCourse("Java");

        TditStudent t35 = new TditStudent();
        t35.setId(35);
        t35.setName("Deepak");
        t35.setCourse("React");

        TditStudent t36 = new TditStudent();
        t36.setId(36);
        t36.setName("Sagar");
        t36.setCourse("Angular");

        TditStudent t37 = new TditStudent();
        t37.setId(37);
        t37.setName("Raj");
        t37.setCourse("Spring Boot");

        TditStudent t38 = new TditStudent();
        t38.setId(38);
        t38.setName("Aakash");
        t38.setCourse("MySQL");

        TditStudent t39 = new TditStudent();
        t39.setId(39);
        t39.setName("Bhushan");
        t39.setCourse("Java");

        TditStudent t40 = new TditStudent();
        t40.setId(40);
        t40.setName("Vivek");
        t40.setCourse("Python");

        TditStudent t41 = new TditStudent();
        t41.setId(41);
        t41.setName("Sameer");
        t41.setCourse("Spring");

        TditStudent t42 = new TditStudent();
        t42.setId(42);
        t42.setName("Irfan");
        t42.setCourse("Hibernate");

        TditStudent t43 = new TditStudent();
        t43.setId(43);
        t43.setName("Naveen");
        t43.setCourse("Java");

        TditStudent t44 = new TditStudent();
        t44.setId(44);
        t44.setName("Arjun");
        t44.setCourse("React");

        TditStudent t45 = new TditStudent();
        t45.setId(45);
        t45.setName("Kartik");
        t45.setCourse("Angular");

        TditStudent t46 = new TditStudent();
        t46.setId(46);
        t46.setName("Piyush");
        t46.setCourse("Spring Boot");

        TditStudent t47 = new TditStudent();
        t47.setId(47);
        t47.setName("Ravi");
        t47.setCourse("MySQL");

        TditStudent t48 = new TditStudent();
        t48.setId(48);
        t48.setName("Sunil");
        t48.setCourse("Java");

        TditStudent t49 = new TditStudent();
        t49.setId(49);
        t49.setName("Gaurav");
        t49.setCourse("Python");

        TditStudent t50 = new TditStudent();
        t50.setId(50);
        t50.setName("Lokesh");
        t50.setCourse("Spring");


// save all students
//        session.save(t1);
//        session.save(t2);
//        session.save(t3);
//        session.save(t4);
//        session.save(t5);
//        session.save(t6);
//        session.save(t7);
//        session.save(t8);
//        session.save(t9);
//        session.save(t10);
//        session.save(t11);
//        session.save(t12);
//        session.save(t13);
//        session.save(t14);
//        session.save(t15);
//        session.save(t16);
//        session.save(t17);
//        session.save(t18);
//        session.save(t19);
//        session.save(t20);
//        session.save(t21);
//        session.save(t22);
//        session.save(t23);
//        session.save(t24);
//        session.save(t25);
//        session.save(t26);
//        session.save(t27);
//        session.save(t28);
//        session.save(t29);
//        session.save(t30);
//        session.save(t31);
//        session.save(t32);
//        session.save(t33);
//        session.save(t34);
//        session.save(t35);
//        session.save(t36);
//        session.save(t37);
//        session.save(t38);
//        session.save(t39);
//        session.save(t40);
//        session.save(t41);
//        session.save(t42);
//        session.save(t43);
//        session.save(t44);
//        session.save(t45);
//        session.save(t46);
//        session.save(t47);
//        session.save(t48);
//        session.save(t49);
//        session.save(t50);


        // Using Criteria...

       Criteria c= session.createCriteria(TditStudent.class);

       //get Object which course is java...
//        c.add(Restrictions.eq("course","Java"));

        // it will return which id is greater than 20....
//        c.add(Restrictions.gt("id",20));

        //it will return which id is less than 10...
//        c.add(Restrictions.lt("id",10));
//
//        c.add(Restrictions.eq("id",2)).list();

        //Delete t1 Obejct....
//        session.delete(t1);

        session.saveOrUpdate(t1);
        List<TditStudent> list=c.list();

        for(TditStudent student:list){
            System.out.println(student);
        }


        transaction.commit();
        session.close();


    }
}
