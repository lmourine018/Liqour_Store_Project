package com.liquor_store.transaction.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "transaction_detail")
public class TransactionDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Transaction_Detail_ID")
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "Transaction_ID")
    private int salesTransactionId;
//
//    @ManyToOne
//    @JoinColumn(name = "Product_ID")
    private int productId;

    @Column(name = "Quantity")
    private int quantity;

    @Column(name = "Subtotal")
    private double subtotal;
}
