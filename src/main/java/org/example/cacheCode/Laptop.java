package org.example.cacheCode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
class Laptop{
    @Id
    int laptopId;
    String laptopName;
    String laptopColour;
}