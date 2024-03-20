package com.liquor_store.inventory.controller.assembler;

import com.liquor_store.inventory.controller.dto.InventoryDto;
import com.liquor_store.inventory.entity.Inventory;
import com.liquor_store.products.entity.Product;
import com.liquor_store.store.entity.Store;
import org.springframework.stereotype.Component;

@Component
public class InventoryAssembler {
    public InventoryDto toInventoryDto(Inventory from){
        InventoryDto to = new InventoryDto()
                .setId(from.getId())
                .setAction(from.getAction())
                .setQuantity(from.getQuantity());

        if(from.getProduct() != null){
            to.setId(from.getProduct().getId());}

        if (from.getStore() != null){
        to.setId(from.getStore().getId());
}

        return to;
    }
    public Inventory toInventory(InventoryDto from){
        Inventory to = new Inventory()
                .setAction(from.getAction())
                .setId(from.getId())
                .setQuantity(from.getQuantity());

        if (from.getProduct_id() != null) {
            Product product = new Product();
            product.setId(from.getId());
            to.setProduct(product);
        }

        if (from.getStore_id() != null){
            Store store = new Store();
            store.setId(from.getId());
            to.setStore(store);
        }
        return  to;
    }
}
