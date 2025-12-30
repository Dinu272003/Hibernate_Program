package org.example.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ansId;

    private String ans;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "ManyToManyMapping",joinColumns = @JoinColumn(name = "ansId"),inverseJoinColumns = @JoinColumn(name = "questionId"))
    private List<Question> questions;

}
