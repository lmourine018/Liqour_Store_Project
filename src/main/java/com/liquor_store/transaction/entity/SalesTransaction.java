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
    private Integer id;

//    @ManyToOne
//    @JoinColumn(name = "Store_ID")
    private Integer storeId;
//
//    @ManyToOne
//    @JoinColumn(name = "Employee_ID")
    private Integer employeeId;

    @Column(name = "date")
    private Date date;

    @Column(name = "total")
    private Double total;
}
