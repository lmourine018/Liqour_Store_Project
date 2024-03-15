package com.liqour_store.inventory.controller.dto;

import com.liqour_store.inventory.entity.ActionType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class InventoryDto  {
        private Integer id;
        private Integer Quantity;
        private Integer ProductId;
        private Integer storeId;
        private ActionType action;
}
