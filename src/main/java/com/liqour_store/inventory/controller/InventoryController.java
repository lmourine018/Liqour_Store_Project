package com.liqour_store.inventory.controller;

import com.liqour_store.inventory.controller.assembler.InventoryAssembler;
import com.liqour_store.inventory.controller.dto.InventoryDto;
import com.liqour_store.inventory.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/inventory")
public class InventoryController {
private  final InventoryService inventoryService;
private final InventoryAssembler inventoryAssembler;


@PostMapping
public InventoryDto createInventory(@RequestBody InventoryDto inventoryDto){
    return inventoryAssembler.toInventoryDto(inventoryService.createInventory(inventoryDto));
}
@GetMapping("/{id}")
public  InventoryDto getInventory(@PathVariable Integer id){
    return inventoryAssembler.toInventoryDto(inventoryService.get(id));
}
@PutMapping("/{id}")
public  InventoryDto update(@RequestBody InventoryDto inventoryDto){
    return inventoryAssembler.toInventoryDto(inventoryService.Update(inventoryDto));
}
@DeleteMapping("/{id}")
public void delete(@PathVariable Integer id){
    inventoryService.delete(id);
}



}
