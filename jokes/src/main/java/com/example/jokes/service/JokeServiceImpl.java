package com.example.jokes.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService{

	private final ChuckNorrisQuotes myClass;
	
	
	// Normal Implementation
	/*
	 * @Autowired public JokeServiceImpl() { this.myClass = new ChuckNorrisQuotes();
	 * }
	 */
	
	
	// When we are using Bean Configuration to handle to class instance creation.

	public JokeServiceImpl(ChuckNorrisQuotes myClass) {
		this.myClass = myClass;
	}

	@Override
	public String getJoke() {
		return myClass.getRandomQuote();
	}


	
}
