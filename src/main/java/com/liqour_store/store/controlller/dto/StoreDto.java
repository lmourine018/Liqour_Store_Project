package com.liqour_store.store.controlller.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class StoreDto {
    private Integer id;
    private String store_name;
    private String city_name;
    private String address;
    private String phone;
    private String email;
}
