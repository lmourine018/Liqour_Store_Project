package com.liquor_store.store.controlller;

import com.liquor_store.store.controlller.assembler.StoreAssembler;
import com.liquor_store.store.controlller.dto.StoreDto;
import com.liquor_store.store.service.StoreService;
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
@RequestMapping("api/v1/store")
@RequiredArgsConstructor
public class StoreController {
    private final StoreService storeService;
    private final StoreAssembler storeAssembler;
    @PostMapping
    public StoreDto createStore(@RequestBody StoreDto storeDto){
        return storeAssembler.toStoreDto(storeService.createStore(storeDto));
    }
    @GetMapping("/{id}")
    public  StoreDto get(@PathVariable Integer id){
        return storeAssembler.toStoreDto(storeService.get(id));
    }
    @PutMapping("/{id}")
    public  StoreDto update(@RequestBody StoreDto storeDto){
        return storeAssembler.toStoreDto(storeService.update(storeDto));
    }
    @DeleteMapping("/{id}")
    public void deleteStore(@PathVariable Integer id){
        storeService.delete(id);
    }
}
