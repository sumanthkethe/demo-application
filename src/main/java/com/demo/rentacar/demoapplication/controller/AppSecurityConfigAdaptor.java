package com.demo.rentacar.demoapplication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@EnableOAuth2Sso
public class AppSecurityConfigAdaptor extends WebSecurityConfigurerAdapter{

	@Autowired
	private UserDetailsService userDetailsSerice;
	
	
	/*@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		List<UserDetails> users = new ArrayList<>();
		users.add(User.withDefaultPasswordEncoder().username("sumanth").password("12345678").roles("admin").build());
		return new InMemoryUserDetailsManager(users);
	}*/
	
	
	
	/*@Bean
	public AuthenticationProvider  totallyMyChoice() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsSerice);
		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		return provider;
	}*/
	
	
	
	/*@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
		.csrf().disable()
		.authorizeRequests().antMatchers("/login").permitAll()
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.loginPage("/login").permitAll()
		.and()
		.logout().invalidateHttpSession(true)
		.clearAuthentication(true)
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/logout-success").permitAll();
	}*/

	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
		.csrf().disable()
		.authorizeRequests().antMatchers("/login").permitAll()
		.anyRequest().authenticated();
	}


	
	
	
	

}
