package com.google.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.entities.RatingEntity;
import com.google.exceptions.ResourceNotFoundException;
import com.google.repository.RatingRepository;
import com.google.services.RatingService;

@Service
public class RatingServiceImpl implements RatingService {
	
	@Autowired
	RatingRepository ratingRepo;

	@Override
	public RatingEntity createRating(RatingEntity rating) {
		return ratingRepo.save(rating);
	}

	@Override
	public List<RatingEntity> getAllRatings() {
		return ratingRepo.findAll();
	}

	@Override
	public List<RatingEntity> getAllRatingsByUserId(Integer userId) {
		List<RatingEntity> ratings = ratingRepo.findByUserId(userId);
		return ratings;
	}

	@Override
	public List<RatingEntity> getAllRatingsByHotelId(Integer userId) {
		List<RatingEntity> ratings = ratingRepo.findByHotelId(userId);
		return ratings;
	}

	@Override
	public RatingEntity getRating(Integer ratingId) {
		// TODO Auto-generated method stub
		return ratingRepo.findById(ratingId).orElseThrow(() -> new ResourceNotFoundException("Rating is not available for given id!!"));
	}

}
