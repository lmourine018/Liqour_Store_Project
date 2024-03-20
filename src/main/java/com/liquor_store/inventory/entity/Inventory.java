package com.liquor_store.inventory.entity;

import com.liquor_store.products.entity.Product;
import com.liquor_store.store.entity.Store;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;

@Entity
@Table(name = "inventory_tb")
@Accessors(chain = true)
@Data
public class Inventory {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;
        @Column(name = "quantity")
        private Integer Quantity;
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "product_id", referencedColumnName = "id")
        private Product product;
        @ManyToOne(fetch = FetchType.LAZY,optional = false)
        @JoinColumn(name = "store_id", nullable = false)
        private Store store;
        @Enumerated(EnumType.STRING)
        private ActionType action;
}
