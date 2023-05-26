package com.google.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.google.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
