package org.example.mapppingTaskOrderCustomer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @Column(name = "customer_id")
    private int customer_Id;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "customer",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Order> orders;
}
