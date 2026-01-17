package org.example.problems;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Class {
    private int classId;
    private String className;
    private String address;
    @Embedded
    @OneToMany
    private List<TditStudent> tditStudent;

    @Override
    public String toString() {
        return "Class{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", address='" + address + '\'' +
                ", tditStudent=" + tditStudent +
                '}';
    }
}
