package com.example.jokes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService{

	private final ChuckNorrisQuotes myClass;
	
	@Autowired
	public JokeServiceImpl() {
		this.myClass = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return myClass.getRandomQuote();
	}

	
}
