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
import org.springframework.web.bind.annotation.RestController;

import com.google.entities.RatingEntity;
import com.google.services.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	
	@Autowired
	RatingService ratingService;
	
	@PostMapping
	public ResponseEntity<RatingEntity> saveRating(@RequestBody RatingEntity rating) {
		
		RatingEntity rating1 = ratingService.createRating(rating);
		
		return ResponseEntity.status(HttpStatus.OK).body(rating1);
	}
	
	
	@GetMapping
	public ResponseEntity<List<RatingEntity>> getAllRatings() {
		
		List<RatingEntity> ratings = ratingService.getAllRatings();
		return ResponseEntity.status(HttpStatus.OK).body(ratings);
	} 
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<List<RatingEntity>> getRatingsByUserId(@PathVariable Integer userId) {
		System.out.println(userId);
		List<RatingEntity> ratings = ratingService.getAllRatingsByUserId(userId);
		return ResponseEntity.status(HttpStatus.OK).body(ratings);
	}
	
	@GetMapping("/hotel/{hotelId}")
	public ResponseEntity<List<RatingEntity>> getRatingsByHotelId(@PathVariable Integer hotelId) {
		
		List<RatingEntity> ratings = ratingService.getAllRatingsByUserId(hotelId);
		return ResponseEntity.status(HttpStatus.OK).body(ratings);
	}
	
	@GetMapping("/{ratingId}")
	public ResponseEntity<RatingEntity> getRatingById(@PathVariable Integer ratingId) {
		
		RatingEntity rating = ratingService.getRating(ratingId);
		return ResponseEntity.status(HttpStatus.OK).body(rating);
	}
	
	
}
