package com.liquor_store.store.service;

import com.liquor_store.store.controlller.dto.StoreDto;
import com.liquor_store.store.entity.Store;

public interface StoreService {
    Store createStore(StoreDto storeDto);
    Store get(Integer id);
    Store update(StoreDto storeDto);
    void delete(Integer id);
}
