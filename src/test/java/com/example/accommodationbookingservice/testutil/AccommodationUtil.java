package com.example.accommodationbookingservice.testutil;

import com.example.accommodationbookingservice.dto.accommodation.AccommodationDto;
import com.example.accommodationbookingservice.dto.accommodation.AccommodationRequestDto;
import com.example.accommodationbookingservice.dto.accommodation.AmenityTypeDto;
import com.example.accommodationbookingservice.dto.address.AddressDto;
import com.example.accommodationbookingservice.dto.address.AddressRequestDto;
import com.example.accommodationbookingservice.entity.accommodation.Accommodation;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class AccommodationUtil {

    public static AccommodationRequestDto createSampleAccommodationRequestDto() {
        AccommodationRequestDto dto = new AccommodationRequestDto();
        dto.setTypeId(1L);
        AddressRequestDto addressDto = new AddressRequestDto();
        addressDto.setCountry("Ukraine");
        addressDto.setState("Lviv Oblast");
        addressDto.setCity("Lviv");
        addressDto.setStreet("Shevchenka Street");
        addressDto.setHouseNumber("12A");
        addressDto.setApartmentNumber("7");
        addressDto.setFloor("3");
        addressDto.setZipCode("79000");

        dto.setAddressDto(addressDto);
        dto.setSizeType("Studio");

        Set<Long> amenityTypeIds = new HashSet<>();
        amenityTypeIds.add(1L);
        amenityTypeIds.add(2L);
        dto.setAmenityTypeIds(amenityTypeIds);

        dto.setDailyRate(BigDecimal.valueOf(80.00));
        dto.setAvailability(5);

        return dto;
    }

    public static AccommodationDto getAccommodationDto() {
        AccommodationDto accommodationDto = new AccommodationDto();
        accommodationDto.setId(1L);
        accommodationDto.setDailyRate(BigDecimal.valueOf(155, 2));
        accommodationDto.setSizeType("Test size");
        AddressDto addressDto = new AddressDto();
        addressDto.setCity("Test City");
        addressDto.setFloor("Test floor");
        addressDto.setCountry("Test country");
        addressDto.setState("Test state");
        addressDto.setStreet("Test street");
        addressDto.setApartmentNumber("Test number");
        addressDto.setHouseNumber("Test apartment number");
        addressDto.setZipCode("Test zipcode");
        accommodationDto.setAddress(addressDto);

        accommodationDto.setType(AccommodationTypeUtil.getAccommodationTypeDto());

        AmenityTypeDto amenityTypeDto = new AmenityTypeDto();
        amenityTypeDto.setId(1L);
        amenityTypeDto.setName("DISHWASHER");
        AmenityTypeDto amenityTypeDto2 = new AmenityTypeDto();
        amenityTypeDto2.setId(2L);
        amenityTypeDto.setName("SAFE");

        accommodationDto.setAmenities(Set.of(amenityTypeDto, amenityTypeDto2));

        return accommodationDto;
    }

    public static Accommodation getAccommodation() {
        Accommodation accommodation = new Accommodation();
        accommodation.setId(1L);
        accommodation.setSize("Test size");
        accommodation.setDailyRate(BigDecimal.valueOf(155, 2));
        accommodation.setDeleted(false);
        accommodation.setAvailability(5);

        accommodation.setType(AccommodationTypeUtil.getAccommodationType());

        accommodation.setAddress(AddressUtil.getAddress());

        accommodation.setAmenities(Set.of(AmenityTypeUtil.getAmenityType()));

        return accommodation;
    }
}
