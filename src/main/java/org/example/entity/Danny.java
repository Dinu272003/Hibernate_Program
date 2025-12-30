package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Danny {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String name;
    private int age;
    private String adress;
    @Transient
    private String branch;

    private UseEmbedable embedable;

}
