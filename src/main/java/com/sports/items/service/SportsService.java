package com.sports.items.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
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

	//public Sports getSportNameById(Long sportId) {
		//Sports sports = sportsItemsRepositoryService.findSportNameById(sportId);
		//return sports;
	//}

	public List<Sports> findAllSports() throws Exception{
		
		List<Sports> sportsList = new ArrayList<Sports>();
		try {
			sportsList = sportsItemsRepositoryService.findAll();
			if(!sportsList.isEmpty()|| sportsList!=null) {
				
			}
		}catch(Exception e){
			
		}
		
		return sportsList;
	}

	public List<Sports> getAvailableSports() {
		List<Sports> availableSportsList= sportsItemsRepositoryService.findAll();
		if(!availableSportsList.isEmpty()) {
			return availableSportsList;
		}else 
			return null;
	}
}
