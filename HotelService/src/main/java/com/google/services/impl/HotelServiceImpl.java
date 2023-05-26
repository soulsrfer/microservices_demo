package com.google.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.entities.HotelEntity;
import com.google.exceptions.ResourceNotFoundException;
import com.google.repository.HotelRepository;
import com.google.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	HotelRepository hotelRepo;

	@Override
	public HotelEntity createHotel(HotelEntity hotel) {
		return hotelRepo.save(hotel);
	}

	@Override
	public List<HotelEntity> getAllHotels() {
		return hotelRepo.findAll();
	}

	@Override
	public HotelEntity getHotel(Integer hotelId) {
		return hotelRepo.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id not found!!"));
	}

}
