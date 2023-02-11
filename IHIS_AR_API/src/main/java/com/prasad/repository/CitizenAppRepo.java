package com.prasad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prasad.entity.CitizenAppEntity;

public interface CitizenAppRepo extends JpaRepository<CitizenAppEntity, Integer>{

}
