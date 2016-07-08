package com.sec21.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;

import com.sec21.filters.CsrfHeaderFilter;

@Configuration
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		 http.httpBasic()
		 .and().authorizeRequests()
		 .antMatchers("/","/home.html","/index.html", "/login.html","/user").permitAll().anyRequest().anonymous()
		 .and()
		 .authorizeRequests()
		 .antMatchers("/profile.html").access("hasRole('ROLE_USER')").anyRequest().permitAll().anyRequest().authenticated().and()
		 .addFilterAfter(new CsrfHeaderFilter(),	
		 CsrfFilter.class).csrf().csrfTokenRepository(csrfTokenRepository()).and()
		 .logout();
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		  auth.inMemoryAuthentication().withUser("user").password("123").roles("USER");
		  auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery("SELECT NM_USERNAME, NM_PASSWORD, ENABLED FROM uncode.users WHERE NM_USERNAME=?")
		  .authoritiesByUsernameQuery("SELECT NM_USERNAME, NM_ROLE FROM uncode.user_roles WHERE NM_USERNAME=?");
	}

	private CsrfTokenRepository csrfTokenRepository() {
		HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
		repository.setHeaderName("X-XSRF-TOKEN");
		return repository;
	}
}
