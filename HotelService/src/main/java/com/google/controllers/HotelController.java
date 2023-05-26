package com.google.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.entities.HotelEntity;
import com.google.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	
	@Autowired
	HotelService hotelService;
	
	@PostMapping
	public ResponseEntity<HotelEntity> createHotel(@RequestBody HotelEntity hotel) {
		
		HotelEntity hotel1 = hotelService.createHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
	}
	
	
	@GetMapping("/{hotelId}")
	public ResponseEntity<HotelEntity> getHotel(@PathVariable Integer hotelId) {
		
		HotelEntity hotel = hotelService.getHotel(hotelId);
		return ResponseEntity.status(HttpStatus.OK).body(hotel);
	}
	
	@GetMapping
	public ResponseEntity<List<HotelEntity>> getAllHotels() {
		List<HotelEntity> hotels = hotelService.getAllHotels();
		return ResponseEntity.ok(hotels);
	}
}
