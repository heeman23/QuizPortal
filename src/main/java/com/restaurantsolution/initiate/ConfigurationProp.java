package com.restaurantsolution.initiate;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan(basePackages= {"com.restaurantsolution.controller"})
@EntityScan(basePackages = "com.restaurantsolution.domain")
//@EnableJpaRepositories(basePackages= {"com.quizportal.repository"})
public class ConfigurationProp {
	
	
	
	@Bean
	public ViewResolver getViewResolver() {
	InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	resolver.setPrefix("/WEB-INF/jsp/");
	resolver.setSuffix(".jsp");
	resolver.setViewClass(JstlView.class);
		
		
		return resolver;
	}

}
