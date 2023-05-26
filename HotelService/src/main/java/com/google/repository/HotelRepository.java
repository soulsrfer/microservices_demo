package com.google.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.google.entities.HotelEntity;

@Repository
public interface HotelRepository extends JpaRepository<HotelEntity, Integer>{

}
