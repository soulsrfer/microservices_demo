package com.google.services;

import java.util.List;

import com.google.entities.RatingEntity;

public interface RatingService {
	
	// create Rating
	RatingEntity createRating(RatingEntity rating);
	
	//get All Ratings
	List<RatingEntity> getAllRatings();
	
	
	//get All Available ratings of user by user id.
	List<RatingEntity> getAllRatingsByUserId(Integer userId);
	
	
	//get All Available ratings of hotel by hotel id.
	List<RatingEntity> getAllRatingsByHotelId(Integer userId);

	
	//get Rating by id
	RatingEntity getRating(Integer ratingId);
	
}
