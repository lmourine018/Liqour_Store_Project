package com.liqour_store.store.service;

import com.liqour_store.store.controlller.dto.StoreDto;
import com.liqour_store.store.entity.Store;

public interface StoreService {
    Store createStore(StoreDto storeDto);
    Store get(Integer id);
    Store update(StoreDto storeDto);
    void delete(Integer id);
}
