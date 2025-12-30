package org.example.oneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Answer {
        @Id
        @Column(name = "Answer_Id")
       private  int  ansId;
        @Column(name = "Answer")
       private  String ans;

}
