package com.thejitenpatel.hotel.repositories;

import com.thejitenpatel.hotel.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {
}
