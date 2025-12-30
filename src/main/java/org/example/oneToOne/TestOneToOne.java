package org.example.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneToOne {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory= cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        // Answer...1
//        Answer ans1=new Answer();
//        ans1.setAnsId(101);
//        ans1.setAns("Dinesh");
//        session.save(ans1);
//
//        //Question...1
//        Question q1=new Question();
//        q1.setQuestionId(201);
//        q1.setQuestion("What is your name ?");
//        q1.setAnsId(ans1);
//        session.save(q1);
//
//
//        //Answer...2
//        Answer ans2=new Answer();
//        ans2.setAnsId(102);
//        ans2.setAns("Nanded");
//        session.save(ans2);
//
//        //Question...
//        Question q2=new Question();
//        q2.setQuestionId(202);
//        q2.setQuestion("Where are u From ?");
//        q2.setAnsId(ans2);
//        session.save(q2);
////
////        //Answer...3
//        Question q3=new Question();
//
//        Answer ans3=new Answer();
//        ans3.setAnsId(103);
//        ans3.setAns("CSE");
//
//        session.save(ans3);
//
//        //Question...
//        q3.setQuestionId(203);
//        q3.setQuestion("what is ur Branch ?");
//        q3.setAnsId(ans3);
//        session.save(q3);


        transaction.commit();

        Question question=session.get(Question.class,201);
        System.out.println(question.getQuestion());
        System.out.println(question.getAnsId().getAns());

        System.out.println("------------------------");
       Question question1= session.get(Question.class,202);
        System.out.println(question1.getQuestion());
        System.out.println(question1.getAnsId().getAns());

        System.out.println("------------------------");

        Question question2=session.get(Question.class,203);
        System.out.println(question2.getQuestion());
        System.out.println(question2.getAnsId().getAns());




    }
}
