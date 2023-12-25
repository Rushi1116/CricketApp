package com.crick.apis.services;

import java.util.List;

import com.crick.apis.entities.Match;

public interface MatchService {
	//get all matches
	List<Match> getAllMatches();
	
	//get live matches
	List<Match> getLiveMatches();
	
	//get CWC2023 point table
	List<List<String>> getPointTable();
	
	
	
}
