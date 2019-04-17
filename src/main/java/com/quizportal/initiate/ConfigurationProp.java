package com.quizportal.initiate;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages= {"com.quizportal.controller"})
@EntityScan(basePackages = "com.quizportal.domain")
//@EnableJpaRepositories(basePackages= {"com.quizportal.repository"})
public class ConfigurationProp {

}
