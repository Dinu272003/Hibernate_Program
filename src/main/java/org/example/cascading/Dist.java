package org.example.cascading;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
class Dist{
    @Id
    int distId;
    String distName;
    long population;
    @OneToMany(cascade = CascadeType.ALL)
    List<SubDist> subDists;

}

