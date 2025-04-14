package com.example.accommodationbookingservice.repository;

import com.example.accommodationbookingservice.entity.booking.Booking;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    @Query("SELECT COUNT(b) FROM Booking b "
            + "WHERE b.accommodation.id = :accommodationId "
            + "AND NOT b.status.name = 'CANCELED' "
            + "AND NOT b.status.name = 'EXPIRED' "
            + "AND ("
            + "(:checkInDate BETWEEN b.checkInDate AND b.checkOutDate "
            + "OR :checkOutDate BETWEEN b.checkInDate AND b.checkOutDate) "
            + "OR (b.checkInDate BETWEEN :checkInDate AND :checkOutDate "
            + "OR b.checkOutDate BETWEEN :checkInDate AND :checkOutDate))")
    Long isDatesAvailableForAccommodation(@Param("accommodationId") Long accommodationId,
                                          @Param("checkInDate") LocalDate checkInDate,
                                          @Param("checkOutDate") LocalDate checkOutDate);

    List<Booking> findAllByUser_Email(String email, Pageable pageable);

    List<Booking> findByUserId(Long id);
}
