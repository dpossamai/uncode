package com.sec21.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec21.dao.PlayerRepository;
import com.sec21.model.Player;
import com.sec21.service.PlayerService;

@Service
@Transactional
public class PlayerServiceImpl implements PlayerService{

	@Autowired
	private PlayerRepository playerRepository;
	
	@Override
	public List<Player> findByName(String name) {
		return playerRepository.findByName(name);
	}

	@Override
	public List<Player> searchPlayer(String name) {
		return playerRepository.searchPlayer(name);
	}
	
}
