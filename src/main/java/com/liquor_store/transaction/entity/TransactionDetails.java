package com.liquor_store.transaction.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "transaction_detail")
public class TransactionDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @ManyToOne
//    @JoinColumn(name = "Transaction_ID")
    private Integer salesTransactionId;
//
//    @ManyToOne
//    @JoinColumn(name = "Product_ID")
    private Integer productId;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "subtotal")
    private double subtotal;
}
