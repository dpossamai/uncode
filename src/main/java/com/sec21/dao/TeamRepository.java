package com.sec21.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sec21.model.Team;

public interface TeamRepository extends JpaRepository<Team, Integer>{

	 @Query("SELECT t FROM Team t WHERE t.name LIKE %?1%")
	 List<Team> searchTeam(String name);
}
