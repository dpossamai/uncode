package com.sec21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sec21.config.SecurityConfiguration;
import com.sec21.controllers.HomeController;
import com.sec21.controllers.PlayerController;
import com.sec21.controllers.TeamController;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass, HomeController.class,PlayerController.class, TeamController.class, SecurityConfiguration.class);
    }

    private static Class<Application> applicationClass = Application.class;
}
