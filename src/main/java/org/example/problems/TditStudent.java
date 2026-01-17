package org.example.problems;


import javax.persistence.Embeddable;

@Embeddable
public class TditStudent {
    int id;
    String firstName;
    String lastName;
    String course;

    @Override
    public String toString() {
        return "TditStudent{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
