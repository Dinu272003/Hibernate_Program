package org.example.oneToManyProgram;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class TestOneToMany{
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory= cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Person person=new Person();
        person.setName("Dinesh");
        person.setPersonId(101);

        Person person1=new Person();
        person1.setName("Avi");
        person1.setPersonId(102);

        // Bank---1
        Bank bank1=new Bank();
        bank1.setBankId(1);
        bank1.setBankName("SBI");
        bank1.setAccountNumber(1234);
        bank1.setPerson(person);
        bank1.setPerson(person1);


        // Bank--2
        Bank bank2=new Bank();
        bank2.setBankId(2);
        bank2.setBankName("MGM");
        bank2.setAccountNumber(1212);
        bank2.setPerson(person);
        bank2.setPerson(person1);


        // Bank List....
        List<Bank> list=new ArrayList<>();
        list.add(bank1);
        list.add(bank2);

        // One Person can have Multiple Bank Account...
        person.setBank(list);
        person1.setBank(list);


//        session.save(person);
//        session.save(person1);
//        session.save(bank1);
//        session.save(bank2);

        Person person2=session.get(Person.class,1);
        System.out.println("Person Name::"+person2.getName());

        for(Bank bank: person.getBank()){
            System.out.println("Bank Id::"+bank.getBankId());
            System.out.println("Bank Name::"+bank.getBankName());
            System.out.println("Account Number::"+bank.getAccountNumber());

        }
        transaction.commit();


    }
}
