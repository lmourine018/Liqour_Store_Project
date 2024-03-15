package com.liqour_store.inventory.service;

import com.liqour_store.inventory.controller.dto.InventoryDto;
import com.liqour_store.inventory.entity.Inventory;

public interface InventoryService {
    Inventory createInventory(InventoryDto inventoryDto);
    Inventory get(Integer id);
     Inventory Update(InventoryDto inventoryDto);
     void delete(Integer id);

}
