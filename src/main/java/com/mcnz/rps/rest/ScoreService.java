package com.mcnz.rps.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ScoreService {
	
	static Score score = new Score();
	
	@GetMapping("/score")
	public Score getScore() {
		return score;
	}
	
	@GetMapping("/increasewins")
	public Score increaseWins() {
		score.wins++;
		return score;
	}
	
	@GetMapping("/increaseties")
	public Score increaseTies() {
		score.ties++;
		return score;
	}
	
	@GetMapping("/increaselosses")
	public Score increaseLosses() {
		score.losses++;
		return score;
	}

}
