package com.sec21.test.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.sec21.Application;
import com.sec21.model.Player;
import com.sec21.service.PlayerService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@ActiveProfiles("dev")
public class PlayerServiceTest {
	
	@Autowired
	PlayerService playerService;
	
	@Test
	public void testFindByName(){
		List<Player> players = playerService.findByName("deivide");
		Assert.assertEquals(players.get(0).getName(), "dpossamai");
	}

}
