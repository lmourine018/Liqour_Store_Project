package com.liquor_store.inventory.service;

import com.liquor_store.inventory.controller.dto.InventoryDto;
import com.liquor_store.inventory.entity.Inventory;

public interface InventoryService {
    Inventory createInventory(InventoryDto inventoryDto);
    Inventory get(Integer id);
     Inventory Update(InventoryDto inventoryDto);
     void delete(Integer id);

}
