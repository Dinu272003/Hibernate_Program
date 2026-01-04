package org.example.embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Transient;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Address {
    private String villageName;
    @Transient
    private String subDist;
    @Transient
    private  String dist;
    @Transient
    private String state;
}
