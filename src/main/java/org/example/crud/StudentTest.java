package org.example.crud;

import org.example.crud.HibernateOperation;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        do {
            System.out.println("Enter Choice:: \n" +
                    "1.Add Student \n" +
                    "2. Show Data Using Id \n" +
                    "3. Delete Data Using Id \n" +
                    "4. Update Data \n" +
                    "5. Show All DB Data");
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                    HibernateOperation.addStudent();
                    break;
                case 2:
                    HibernateOperation.show();
                    break;
                case 3:
                    HibernateOperation.delete();
                    break;
                case 4:
                    HibernateOperation.updateData();
                    break;
                case 5:
                    HibernateOperation.showAllData();
                    break;
                default:
                    System.out.println("Please Enter Valid Option...");
            }
            System.out.println("----------------------------------");
        }while (true);


    }
}
