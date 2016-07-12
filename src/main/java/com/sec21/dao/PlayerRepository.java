package com.sec21.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sec21.model.Player;


public interface PlayerRepository extends JpaRepository<Player, Integer>{

	 List<Player> findByName(String name);
	 
	 @Query("SELECT p FROM Player p WHERE p.name LIKE %?1%")
	 List<Player> searchPlayer(String name);
}
