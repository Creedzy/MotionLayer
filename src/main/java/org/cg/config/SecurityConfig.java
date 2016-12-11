package org.cg.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        	.csrf().disable()
            .authorizeRequests()
                .antMatchers( "/home","/user","/login","/404","/500","/resources/**","/scripts/**","/styles/**","/bower_components/**","/apps/**").permitAll()
                .anyRequest().authenticated()
                .and()
            .logout()
                .permitAll();
            
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
            	.withUser("user")  // #1
            	.password("password")
            	.roles("USER")
            .and()
            	.withUser("admin") // #2
            	.password("password")
            	.roles("ADMIN","USER");
    }
}
