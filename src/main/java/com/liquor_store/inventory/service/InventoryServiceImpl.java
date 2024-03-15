package com.liquor_store.inventory.service;

import com.liquor_store.inventory.controller.assembler.InventoryAssembler;
import com.liquor_store.inventory.controller.dto.InventoryDto;
import com.liquor_store.inventory.entity.Inventory;
import com.liquor_store.inventory.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService{
    private  final InventoryAssembler inventoryAssembler;
    private final InventoryRepository inventoryRepository;
    @Override
    public Inventory createInventory(InventoryDto inventoryDto) {
        Inventory inventory = new Inventory();

        return Optional.of(inventory)
                .map(entity -> inventoryAssembler.toInventory(inventoryDto))
                .map(inventoryRepository::save)
                .orElseThrow(()-> new RuntimeException("inventory not created"));
    }

    @Override
    public Inventory get(Integer id) {
     return Optional.of(id)
                .flatMap(inventoryRepository::findById)
                .orElseThrow(() -> new RuntimeException("Inventory record of id" + id + "not found"));
    }

    @Override
    public Inventory Update(InventoryDto inventoryDto) {
        Inventory inventory =get(inventoryDto.getId());
        Optional.of(inventory)
                .map(entity -> inventoryAssembler.toInventory(inventoryDto))
                .map(inventoryRepository::save)
                .orElseThrow(()-> new RuntimeException("Inventory record not updated"));
        return inventory;
    }

    @Override
    public void delete(Integer id) {
        Optional.of(id)
                .flatMap(inventoryRepository::findById)
                .map(inventory -> {
                    inventoryRepository.delete(inventory);
                    return inventory;
                });
    }
}
