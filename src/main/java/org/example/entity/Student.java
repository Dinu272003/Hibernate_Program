package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.OneToMany.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.Scanner;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    int studentId;
    String studentName;
    String address;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

//        System.out.println("Enter Student id::");
//        int id=sc.nextInt();
        // Student--1
        Student s1=new Student();
        s1.setStudentId(1);
        s1.setStudentName("Dinesh");
        s1.setAddress("Nanded");

        //Student--2

        Student s2 = new Student();
        s2.setStudentId(2);
        s2.setStudentName("Avi");
        s2.setAddress("Pune");

        Student s3 = new Student();
        s3.setStudentId(3);
        s3.setStudentName("Pradeep");
        s3.setAddress("Mumbai");

        Student s4 = new Student();
        s4.setStudentId(4);
        s4.setStudentName("Pravin");
        s4.setAddress("Nagpur");

        Student s5 = new Student();
        s5.setStudentId(5);
        s5.setStudentName("Nilu");
        s5.setAddress("Aurangabad");

        Student s6 = new Student();
        s6.setStudentId(6);
        s6.setStudentName("Eknath");
        s6.setAddress("Nashik");

        Student s7 = new Student();
        s7.setStudentId(7);
        s7.setStudentName("Akash");
        s7.setAddress("Kolhapur");

        Student s8 = new Student();
        s8.setStudentId(8);
        s8.setStudentName("Raja");
        s8.setAddress("Satara");

        Student s9 = new Student();
        s9.setStudentId(9);
        s9.setStudentName("Banti");
        s9.setAddress("Solapur");

        Student s10 = new Student();
        s10.setStudentId(10);
        s10.setStudentName("Ankit");
        s10.setAddress("Latur");

        Student s11 = new Student();
        s11.setStudentId(11);
        s11.setStudentName("Manish");
        s11.setAddress("Jalgaon");

        Student s12 = new Student();
        s12.setStudentId(12);
        s12.setStudentName("Sandeep");
        s12.setAddress("Dhule");

        Student s13 = new Student();
        s13.setStudentId(13);
        s13.setStudentName("Nitin");
        s13.setAddress("Beed");

        Student s14 = new Student();
        s14.setStudentId(14);
        s14.setStudentName("Swapnil");
        s14.setAddress("Parbhani");

        Student s15 = new Student();
        s15.setStudentId(15);
        s15.setStudentName("Ganesh");
        s15.setAddress("Hingoli");

        Student s16 = new Student();
        s16.setStudentId(16);
        s16.setStudentName("Yogesh");
        s16.setAddress("Wardha");

        Student s17 = new Student();
        s17.setStudentId(17);
        s17.setStudentName("Kartik");
        s17.setAddress("Amravati");

        Student s18 = new Student();
        s18.setStudentId(18);
        s18.setStudentName("Mahesh");
        s18.setAddress("Buldhana");

        Student s19 = new Student();
        s19.setStudentId(19);
        s19.setStudentName("Shubham");
        s19.setAddress("Osmanabad");

        Student s20 = new Student();
        s20.setStudentId(20);
        s20.setStudentName("Tejas");
        s20.setAddress("Akola");


    // Pagination Query...
//        Query q=session.createQuery(" from Student");
//        q.setFirstResult(10);
//        q.setMaxResults(5);
//        List<Student> s=q.getResultList();
//        for (Student print:s){
//            System.out.println(print.getStudentId()+"::"+print.getStudentName()+"::"+print.getAddress());
//        }


        // Using Where..
        Query q=session.createSQLQuery("select *from Student where studentid>10");
        List<Object[]> s=q.list();
        for(Object[] student:s){
            System.out.println(student[0]+"::"+student[1]+"::"+student[2]);
        }

//        String q="Select * from Student ";
//        NativeQuery query= (NativeQuery) session.createSQLQuery(q);
//List<Object[]> list=query.list();
//for (Object[] student:list){
//
//    System.out.println(student[0]+"::"+student[2]);
//        }


//        session.save(s1);
//        session.save(s2);
//        session.save(s3);
//        session.save(s4);
//        session.save(s5);
//        session.save(s6);
//        session.save(s7);
//        session.save(s8);
//        session.save(s9);
//        session.save(s10);
//        session.save(s11);
//        session.save(s12);
//        session.save(s13);
//        session.save(s14);
//        session.save(s15);
//        session.save(s16);
//        session.save(s17);
//        session.save(s18);
//        session.save(s19);
//        session.save(s20);


    session.close();
    transaction.commit();


//        String query="select from Student";
//       List<Student> s= (List<Student>) session.createQuery(query);

//        String query="Select * from Student where studentName=Dinesh";
//       Student s= (Student) session.createQuery(query);
//        Student load1=session.load(Student.class,101);
//        System.out.println(s.getStudentId()+"::"+s.getStudentName());

//        System.out.println("---------------------------------------");
//        Student s=session.get(Student.class,id);
//        System.out.println("Student id::"+s.getStudentId());
//        System.out.println("Student Name:"+s.getStudentName());
//        System.out.println("Student Address::"+s.getAddress());




    }
}
