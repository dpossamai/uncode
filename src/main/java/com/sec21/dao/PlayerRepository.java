package com.sec21.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sec21.model.Player;


public interface PlayerRepository extends CrudRepository<Player, Integer>{

	 List<Player> findByName(String name);
}
