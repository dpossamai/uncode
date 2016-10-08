package com.sec21.service;

import java.util.List;

import com.sec21.model.Team;

public interface TeamService {

	List<Team> searchTeam(String name);
}
