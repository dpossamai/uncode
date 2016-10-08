package com.sec21.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec21.dao.TeamRepository;
import com.sec21.model.Team;
import com.sec21.service.TeamService;

@Service
@Transactional
public class TeamServiceImpl implements TeamService{

	@Autowired
	private TeamRepository teamRepository;
	
	@Override
	public List<Team> searchTeam(String name) {
		return teamRepository.searchTeam(name);
	}

}
