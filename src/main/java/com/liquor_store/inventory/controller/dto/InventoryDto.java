package com.liquor_store.inventory.controller.dto;

import com.liquor_store.inventory.entity.ActionType;
import com.liquor_store.products.entity.Product;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class InventoryDto  {
        private Integer id;
        private Integer Quantity;
        private Integer product_id;
        private Integer store_id;
        private ActionType action;
}
