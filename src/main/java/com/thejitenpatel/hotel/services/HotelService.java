package com.thejitenpatel.hotel.services;

import com.thejitenpatel.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {

    Hotel create(Hotel hotel);

    List<Hotel> getAllHotels();

    Hotel get(String id);
}
