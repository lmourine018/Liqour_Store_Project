package com.liquor_store.transaction.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "sales_transaction")
public class SalesTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Transaction_ID")
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "Store_ID")
    private int storeId;
//
//    @ManyToOne
//    @JoinColumn(name = "Employee_ID")
    private int employeeId;

    @Column(name = "Date")
    private Date date;

    @Column(name = "Total")
    private Double total;
}
