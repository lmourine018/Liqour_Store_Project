package com.liqour_store.store.controlller.assembler;

import com.liqour_store.store.controlller.dto.StoreDto;
import com.liqour_store.store.entity.Store;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class StoreAssembler {

    public StoreDto toStoreDto(Store from){
        StoreDto to = new StoreDto()
                .setId(from.getId())
                .setStore_name(from.getStore_name())
                .setAddress(from.getAddress())
                .setPhone(from.getPhone())
                .setEmail(from.getEmail())
                .setCity_name(from.getCity_name());

   return to;

    }
    public Store toStore(StoreDto from){
        Store to = new Store()
                .setId(from.getId())
                .setStore_name(from.getStore_name())
                .setPhone(from.getPhone())
                .setEmail(from.getEmail())
                .setCity_name(from.getCity_name())
                .setAddress(from.getAddress());
        return  to;
    }
}
