package org.example.oneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    @Id
    @Column(name = "Question_Id")
    private int questionId;

    @Column(name = "Question")
    private String question;

    @OneToOne
    Answer ansId;

}
