package com.liquor_store.inventory.controller.assembler;

import com.liquor_store.inventory.controller.dto.InventoryDto;
import com.liquor_store.inventory.entity.Inventory;
import org.springframework.stereotype.Component;

@Component
public class InventoryAssembler {
    public InventoryDto toInventoryDto(Inventory from){
        InventoryDto to = new InventoryDto()
                .setId(from.getId())
                .setAction(from.getAction())
                .setProductId(from.getProductId())
                .setQuantity(from.getQuantity())
                .setStoreId(from.getStoreId());
        return to;
    }
    public Inventory toInventory(InventoryDto from){
        Inventory to = new Inventory()
                .setAction(from.getAction())
                .setProductId(from.getProductId())
                .setId(from.getId())
                .setStoreId(from.getStoreId())
                .setQuantity(from.getQuantity());
        return  to;
    }
}
