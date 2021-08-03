package com.sports.items.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports.items.entity.Sports;
import com.sports.items.repository.SportsItemsRepositoryService;

@Service
public class SportsService {
	
	@Autowired
	private SportsItemsRepositoryService sportsItemsRepositoryService;

	public Sports save(Sports sportName) {
		return sportsItemsRepositoryService.save(sportName);
	}

	public Optional<Sports> getSportNameById(Long sportId) {
		return sportsItemsRepositoryService.findById(sportId);
	}

}
