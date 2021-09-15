package com.spring.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.inMemoryAuthentication()
				.withUser("rish").password("rish12").roles("USER");
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}
	@Override
    protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
		.antMatchers("/admin")
		.hasRole("admin")
		.antMatchers("/user")
		.hasRole("user")
		.antMatchers("/")
		.permitAll()
		.and()
		.formLogin();
        http.cors().and().csrf().disable();
    }
}