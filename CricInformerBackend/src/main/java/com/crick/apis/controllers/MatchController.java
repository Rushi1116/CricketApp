package com.crick.apis.controllers;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crick.apis.entities.Match;
import com.crick.apis.services.MatchService;

@RestController
@RequestMapping("/match")
public class MatchController {

	private MatchService matchService;
	
	public MatchController(MatchService matchService) {
		this.matchService = matchService;
	}
	
	//get live matches from web
	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatches(){
		return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
	}
	
	//Get all matches from database
	@GetMapping
	public ResponseEntity<List<Match>> getAllMatches(){
		return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
	}
	
	@GetMapping("/point-table")
	public ResponseEntity<?> getPointTable(){
		return new ResponseEntity<>(this.matchService.getPointTable(), HttpStatus.OK);
	}
}
