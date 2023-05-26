package com.google.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.google.entities.RatingEntity;

@Repository
public interface RatingRepository extends JpaRepository<RatingEntity, Integer> {

	List<RatingEntity> findByUserId(Integer userId);
	
	List<RatingEntity> findByHotelId(Integer hotelId);
	
//	Optional<RatingEntity> findAllByUserId();

}
