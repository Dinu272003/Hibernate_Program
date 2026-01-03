package org.example.manytomany;


import javax.persistence.*;
import java.util.List;
@Entity
public class Student {
    @Id
//    @NotBlank(message = "Please Enter Student Id..")
    private Long id;
    private String studentName;
    @ManyToMany
    @JoinTable(name = "student_Course", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "courseid"))
    List<Course> courses;
}
