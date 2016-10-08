package com.sec21.test.controller;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import com.sec21.Application;
import com.sec21.controllers.PlayerController;
import com.sec21.model.Player;
import com.sec21.service.PlayerService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
//@WebMvcTest(PlayerController.class)
public class PlayerControllerTest {

	 @Autowired
	    private MockMvc mvc;

	    @MockBean
	    private PlayerService playerService;

	    @Test
	    public void testExample() throws Exception {
	        given(this.playerService.findByName("user1"))
	                .willReturn(new ArrayList<Player>());
	        this.mvc.perform(get("/searchPlayer").accept(MediaType.TEXT_PLAIN))
	                .andExpect(status().isOk()).andExpect(content().string("Honda Civic"));
	    }
}
