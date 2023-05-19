package org.pr7.rickandmortyapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RickAndMortyApiApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "3001");
		SpringApplication.run(RickAndMortyApiApplication.class, args);
	}

}
