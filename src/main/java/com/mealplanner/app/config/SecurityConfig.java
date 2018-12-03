package com.mealplanner.app.config;

import com.mealplanner.app.service.MongoUserDetailsService;
//import com.mealplanner.app.service.UserDetailsImpl;
//import com.mealplanner.app.service.UserService;
//import com.mealplanner.app.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

@EnableGlobalMethodSecurity(securedEnabled = true)
@Configuration
//@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Value("${user.username}")
    private String username;

    @Value("${user.password}")
    private String password;

    @Autowired
    private MongoUserDetailsService mongoUserDetailsService;

    @Override
    public void configure(AuthenticationManagerBuilder authBuilder) throws Exception {

        authBuilder
                .inMemoryAuthentication()
                .withUser(username)
                .password(password)
                .roles("ADMIN");

        authBuilder
                .userDetailsService(mongoUserDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/registration").permitAll()
                .antMatchers("/", "/index").authenticated()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .successHandler(new SimpleUrlAuthenticationSuccessHandler())
                .and()
                .logout()
                .permitAll();
    }
//
//    @Bean
//    @Override
//    public UserDetailsService userDetailsService() {
//        UserDetails user =
//                User.withDefaultPasswordEncoder()
//                        .username(username)
//                        .password(password)
//                        .roles("USER")
//                        .build();
//
//        return new InMemoryUserDetailsManager(user);
//    }

//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }


}