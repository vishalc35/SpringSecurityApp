package com.amazon.springsecurityapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {


        User.UserBuilder users = User.withDefaultPasswordEncoder();
                auth.inMemoryAuthentication()
                        .withUser(users.username("john").password("test123").roles("EMPLOYEE"))
                        .withUser(users.username("Mary").password("test123").roles("MANAGER"))
                        .withUser(users.username("Leo").password("test123").roles("EMPLOYEE"));
    }
}
