package com.sec21.service;

import java.util.List;

import com.sec21.model.Player;

public interface PlayerService {
	List<Player> findByName(String name);
	
	List<Player> searchPlayer(String name);
}
