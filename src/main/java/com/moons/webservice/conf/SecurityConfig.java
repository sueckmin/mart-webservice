package com.moons.webservice.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        /*
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/**").hasRole("USER")
                .and()
                .formLogin()
                .loginPage("/member")
                .loginProcessingUrl("/member")
                .defaultSuccessUrl("/")
                .permitAll()
                .and()
                .logout()
                .permitAll()
                .and()
                .sessionManagement()
                .maximumSessions(1)
                .expiredUrl("/member")
                .maxSessionsPreventsLogin(false);
                */
    }
}
