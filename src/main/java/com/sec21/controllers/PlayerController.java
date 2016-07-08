package com.sec21.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sec21.dao.PlayerRepository;
import com.sec21.model.Player;

@RestController
public class PlayerController {

	@Autowired
	private PlayerRepository playerRepository;
	
	@RequestMapping("/searchPlayer")
	public ResponseEntity<?> user(@RequestParam(value="name",required=false)String name) {
		ResponseEntity<List<Player>> reponse = new ResponseEntity<List<Player>>(playerRepository.findByName(name), HttpStatus.OK);
		return reponse;
	}
}
