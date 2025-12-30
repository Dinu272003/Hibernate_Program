package org.example.manytomany;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@Entity
public class Course {
    @Id
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "courses")
    List<Student> students;
}
