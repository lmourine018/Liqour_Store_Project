package com.liquor_store.inventory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
        private Integer Quantity;
        private Integer ProductId;
        private Integer storeId;
        private ActionType action;
}
