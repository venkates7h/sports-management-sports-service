package com.sports.items.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sports.items.entity.Sports;

@Repository
public interface SportsItemsRepositoryService extends JpaRepository<Sports, Long>{

	//Sports findSportNameById(Long sportId);

	//Sports findSportById(Long sportId);

}
