package com.liquor_store.store.controlller.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class StoreDto {
    private Integer id;
    @Column(name = "store_name")
    private String store_name;
    @Column(name = "city_name")
    private String city_name;
    @Column(name = "address")
    private String address;
    @Email(message = "invalid email format")
    private String email;
    @Pattern(regexp = "^[0-9]{10}$", message = "Invalid phone number format")
    private String phone;

}
