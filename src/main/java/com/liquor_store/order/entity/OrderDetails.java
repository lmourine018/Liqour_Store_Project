package com.liquor_store.order.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "order_detail")
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    @ManyToOne
//    @JoinColumn(name = "order_id")
    private int orderId;

//    @ManyToOne
//    @JoinColumn(name = "product_id")
    private int productId;

    private int quantity;
    private double unitPrice;
}
