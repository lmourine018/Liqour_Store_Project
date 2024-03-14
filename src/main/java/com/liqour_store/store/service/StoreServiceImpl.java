package com.liqour_store.store.service;

import com.liqour_store.store.controlller.assembler.StoreAssembler;
import com.liqour_store.store.controlller.dto.StoreDto;
import com.liqour_store.store.entity.Store;
import com.liqour_store.store.repository.StoreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor

public class StoreServiceImpl implements StoreService{
    private final StoreAssembler storeAssembler;
    private final StoreRepository storeRepository;
    @Override
    public Store createStore(StoreDto storeDto) {
        Store store = new Store();
        return Optional.of(store)
                .map(entity -> storeAssembler.toStore(storeDto))
                .map(storeRepository::save)
                .orElseThrow(()->new RuntimeException("Store not created"));
    }

    @Override
    public Store get(Integer id) {
        Store store = Optional.of(id)
                .flatMap(storeRepository::findById)
                .orElseThrow(() -> new RuntimeException("Store of" + id  + " not found"));
        return  store;
    }

    @Override
    public Store update(StoreDto storeDto) {
        Store store =get(storeDto.getId());
        return  Optional.of(store)
                .map(entity -> storeAssembler.toStore(storeDto))
                .map(storeRepository::save)
                .orElseThrow(()-> new RuntimeException("store not updated"));
    }

    @Override
    public void delete(Integer id) {
Optional.of(id)
        .flatMap(storeRepository::findById)
        .map(store -> {
            storeRepository.delete(store);
            return store;
        })
        .orElseThrow(() ->new RuntimeException("store of id" + id + "not found"));
    }
}
