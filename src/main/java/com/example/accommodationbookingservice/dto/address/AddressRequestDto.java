package com.example.accommodationbookingservice.dto.address;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AddressRequestDto {
    @NotNull
    private String country;
    @NotNull
    private String state;
    @NotNull
    private String city;
    @NotNull
    private String street;
    @NotNull
    private String houseNumber;
    private String apartmentNumber;
    @NotNull
    private String floor;
    @NotNull
    private String zipCode;
}
