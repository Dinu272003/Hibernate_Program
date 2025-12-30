package org.example.cascading;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
class SubDist{
    @Id
    int subDistId;
    String name;
    long population;
    @ManyToOne(cascade = CascadeType.ALL)
    Dist dists;

}
