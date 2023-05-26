package com.google.services;

import java.util.List;

import com.google.entities.HotelEntity;

public interface HotelService {
	
	HotelEntity createHotel(HotelEntity hotel);
	
	List<HotelEntity> getAllHotels();
	
	HotelEntity getHotel(Integer hotelId);
}
