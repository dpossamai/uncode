package com.sec21.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sec21.model.Team;
import com.sec21.service.TeamService;

@RestController
public class TeamController {

	@Autowired
	private TeamService teamService;
	
	@RequestMapping("/searchTeam")
	public ResponseEntity<?> searchTeam(@RequestParam(value="name",required=false)String name) {
		ResponseEntity<List<Team>> reponse = new ResponseEntity<List<Team>>(teamService.searchTeam(name), HttpStatus.OK);
		return reponse;
	}
}
