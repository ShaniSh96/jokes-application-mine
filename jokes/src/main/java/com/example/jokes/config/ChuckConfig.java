package com.example.jokes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;


// Using annotaions

// after commenting the annotations we will see, XML based configurations
//@Configuration
public class ChuckConfig {
	
	//@Bean
	public ChuckNorrisQuotes ChuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}

	
	
}
