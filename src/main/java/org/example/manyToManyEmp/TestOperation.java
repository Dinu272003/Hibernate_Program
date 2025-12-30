//package org.example.manyToManyEmp;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class TestOperation {
//    public static void main(String[] args) {
//        Configuration cfg=new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//
//        SessionFactory sessionFactory= cfg.buildSessionFactory();
//        Session session=sessionFactory.openSession();
//
//        Transaction transaction=session.beginTransaction();
//
//        // Emp-1
//        Emp emp1=new Emp();
//        emp1.setEmpId(101);
//        emp1.setEmpName("Dinesh");
//
//        // Emp--2
//        Emp emp2=new Emp();
//        emp2.setEmpId(102);
//        emp2.setEmpName("Avi");
//
//        // Emp--3
//        Emp emp3=new Emp();
//        emp3.setEmpId(103);
//        emp3.setEmpName("Danny");
//
//
//        Project project1=new Project();
//        project1.setProjectId(201);
//        project1.setProjectName("Libarary Management");
//
//        Project project2=new Project();
//        project2.setProjectId(301);
//        project2.setProjectName("ChatGpt");
//
//        Project project3=new Project();
//        project3.setProjectId(401);
//        project3.setProjectName("Bank System");
//
//        List<Project> list=new ArrayList<>();
//        list.add(project1);
//        list.add(project2);
//        list.add(project3);
//
//        emp1.setProjects(list);
//        emp2.setProjects(list);
//        emp3.setProjects(list);
//
//        session.save(emp1);
//        session.save(emp2);
//        session.save(emp3);
//        session.save(project1);
//        session.save(project2);
//        session.save(project3);
//
////         Fetch Data From Data base...
////        Emp emp=session.get(Emp.class, 101);
////
////        System.out.println("Emp Name::"+emp.getEmpName());
////
////        for (Project project:emp.getProjects()){
////            System.out.println("Project Id::"+project.getProjectId());
////            System.out.println("Project Name::"+project.getProjectName());
////            System.out.println("Project Emp::"+project.getEmps().size());
////            System.out.println("---------------------------------------");
////        }
//        // Fetch ALL Employees with Projects
////        List<Emp> empList = session.createQuery(
////                "select distinct e from Emp e join fetch e.projects",
////                Emp.class
////        ).list();
////
////        for (Emp emp : empList) {
////
////            System.out.println("Emp Id   :: " + emp.getEmpId());
////            System.out.println("Emp Name :: " + emp.getEmpName());
////            System.out.println("Projects :: ");
////
////            for (Project project : emp.getProjects()) {
////                System.out.println("   Project Id   :: " + project.getProjectId());
////                System.out.println("   Project Name :: " + project.getProjectName());
////            }
////
////            System.out.println("=======================================");
//        transaction.commit();
//
//    }
//}
//
