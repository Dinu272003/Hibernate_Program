package org.example.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class TestOneToMany {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();


        Question q1=new Question();
        Answer answer=new Answer();

//        q1.setQuestionId(102);
        q1.setQuestionName("Name ?");

        Answer answer1=new Answer();
//        answer1.setAnsId(202);
        answer1.setAns("Dinesh");

//        Answer answer2=new Answer();
//        answer2.setAnsId(202);
//        answer2.setAns("Dinu");
//
//        List<Answer> list=new ArrayList<>();
//        list.add(answer1);
//        list.add(answer2);

//        q1.setAnswer(list);

    Question q2=new Question();
//    q2.setQuestionId(103);
    q2.setQuestionName("From ?");

    List<Question> list=new ArrayList<>();
    list.add(q1);
    list.add(q2);

    answer1.setQuestions(list);


    Question q3=new Question();
//    q3.setQuestionId(210);
    q3.setQuestionName("Branch");


    Question q4=new Question();
//    q4.setQuestionId(211);
    q4.setQuestionName("From");


    Answer answer2=new Answer();
    answer2.setAnsId(200);
    answer2.setAns("CSE");

    List<Answer> list1=new ArrayList<>();
    list1.add(answer1);
    list1.add(answer2);

    q3.setAnswer(list1);
    q4.setAnswer(list1);

    session.save(answer1);
    session.save(answer2);
        // Ans--1
//        session.save(answer1);

//        session.save(q)
        transaction.commit();
    }
}
