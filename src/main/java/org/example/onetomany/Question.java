package org.example.onetomany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int questionId;
    @Column(name = "Question")
    String questionName;
    @ManyToMany(mappedBy = "questions")
    private List<Answer> answer;

}
