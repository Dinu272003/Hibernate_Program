package org.example.oneToManyProgram;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bankId;
    private String bankName;
    private  long accountNumber;
    @ManyToOne
    private Person person;



}
