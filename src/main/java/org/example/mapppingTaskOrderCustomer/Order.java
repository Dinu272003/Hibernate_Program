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
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;

    @Column(name = "order_name")
//    @NotBlank(message = "Please Enter Order Name..")

    private String orderName;

    @Column(name = "order_amount")
    private double orderAmmount;

    @Column(name = "order_date")
    private String orderDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")   // Foreign Key
    private Customer customer;

}
