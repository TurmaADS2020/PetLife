package com.petlife;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.petlife.config.PetLifeApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(PetLifeApiProperty.class)
public class PetlifeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetlifeApiApplication.class, args);
	}

}
