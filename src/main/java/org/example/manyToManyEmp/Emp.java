package org.example.manyToManyEmp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    @Id
    int empId;
    String empName;
    @ManyToMany
//    @JoinTable( name = "emp_project",
//            joinColumns = @JoinColumn(name = "emp_id"),
//            inverseJoinColumns = @JoinColumn(name = "project_id"))

    private List<Project> projects;


}
