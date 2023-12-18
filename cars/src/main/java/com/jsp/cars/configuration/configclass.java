package com.jsp.cars.configuration;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.jsp")
public class configclass {
	@Bean(name = "entityManager")
	@Scope("prototype")
	
	public EntityManager entityManager()
	{
		return Persistence.createEntityManagerFactory("prajwalk").createEntityManager();
		
	}

}
