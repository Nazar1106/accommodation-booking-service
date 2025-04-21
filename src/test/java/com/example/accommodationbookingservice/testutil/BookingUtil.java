package com.example.accommodationbookingservice.testutil;

import com.example.accommodationbookingservice.dto.bookingdto.BookingDto;
import com.example.accommodationbookingservice.dto.bookingdto.BookingRequestDto;
import com.example.accommodationbookingservice.entity.booking.Booking;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class BookingUtil {

    public static Booking getPendingBooking() {
        Booking booking = new Booking();
        booking.setId(1L);
        booking.setAccommodation(AccommodationUtil.getAccommodation());
        booking.setUser(UserUtil.getUser());
        booking.setDeleted(false);
        booking.setCheckInDate(LocalDate.of(2025, Month.SEPTEMBER, 11));
        booking.setCheckOutDate(LocalDate.of(2025, Month.SEPTEMBER, 15));
        booking.setBookingCreatedAt(LocalDateTime.of(2025, Month.JUNE, 11,2,10));
        booking.setStatus(BookingStatusUtil.getBookingStatusPending());
        return booking;
    }

    public static Booking getCanceledBooking() {
        Booking booking = new Booking();
        booking.setId(1L);
        booking.setAccommodation(AccommodationUtil.getAccommodation());
        booking.setUser(UserUtil.getUser());
        booking.setDeleted(false);
        booking.setCheckInDate(LocalDate.of(2025, Month.SEPTEMBER, 11));
        booking.setCheckOutDate(LocalDate.of(2025, Month.SEPTEMBER, 15));
        booking.setBookingCreatedAt(LocalDateTime.of(2025, Month.JUNE, 11,2,10));
        booking.setStatus(BookingStatusUtil.getBookingStatusCanceled());
        return booking;
    }

    public static BookingDto getBookingDto() {
        BookingDto bookingDto = new BookingDto();
        bookingDto.setId(1L);
        bookingDto.setCreateAt(LocalDateTime.of(2025, Month.JUNE, 11,2,10));
        bookingDto.setCheckInDate(LocalDate.of(2025, Month.SEPTEMBER, 11));
        bookingDto.setCheckOutDate(LocalDate.of(2025, Month.SEPTEMBER, 15));
        bookingDto.setAccommodation(AccommodationUtil.getAccommodationDto());
        bookingDto.setStatus(BookingStatusUtil.getBookingStatusDto());
        bookingDto.setUser(UserUtil.getUserResponseDto());
        return bookingDto;
    }

    public static BookingDto getBookingDtoCanceledStatus() {
        BookingDto bookingDto = new BookingDto();
        bookingDto.setId(1L);
        bookingDto.setCreateAt(LocalDateTime.of(2025, Month.JUNE, 11,2,10));
        bookingDto.setCheckInDate(LocalDate.of(2025, Month.SEPTEMBER, 11));
        bookingDto.setCheckOutDate(LocalDate.of(2025, Month.SEPTEMBER, 15));
        bookingDto.setAccommodation(AccommodationUtil.getAccommodationDto());
        bookingDto.setStatus(BookingStatusUtil.getBookingStatusCanceledDto());
        bookingDto.setUser(UserUtil.getUserResponseDto());
        return bookingDto;
    }

    public static BookingRequestDto getBookingRequestDto() {
        BookingRequestDto bookingRequestDto = new BookingRequestDto();
        bookingRequestDto.setAccommodationId(1L);
        bookingRequestDto.setCheckInDate(LocalDate.of(2025, Month.SEPTEMBER, 11));
        bookingRequestDto.setCheckOutDate(LocalDate.of(2025, Month.SEPTEMBER, 15));
        return bookingRequestDto;
    }

    public static List<Booking> getBookingList() {
        return List.of(getPendingBooking());
    }

    public static List<BookingDto> getBookingListDto() {
        return List.of(getBookingDto());
    }

}
