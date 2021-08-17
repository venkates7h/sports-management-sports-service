package com.sports.items.controller;

import java.util.List;
import java.util.Optional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreakerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sports.items.entity.Sports;
import com.sports.items.service.SportsService;

import lombok.extern.slf4j.Slf4j;
@CrossOrigin
@RestController
@RequestMapping("/sports")
@Slf4j
public class SportsItemsController {

	@Autowired
	private SportsService sportsService;
	private static final Logger logger= Logger.getLogger(SportsItemsController.class);

	@PostMapping("/")
	public Sports saveNewSports(@RequestBody Sports sportName) {
		 logger.info("saving a sport name"+sportName);
		Sports sports = sportsService.save(sportName);
		if(sports.getSportId()!=null) {
			logger.info("saved a sport name"+sportName);
		}else
			logger.info("save method failed to save"+sportName);
		
		return sports;
	}
	@GetMapping("/{id}")
	public Sports getSportNameById(@PathVariable("id") Long sportId) {
		Sports sports= null;//sportsService.getSportNameById(sportId);
		if(sports==null)
			logger.error(sportId+"-Not found in the system!!");
		 return sports;
	}

	@GetMapping("/available")
	public List<Sports> getAvailableSports(){
		logger.info("find all available sports method");
		return sportsService.getAvailableSports();
		
	}
}
;