package com.example.jokes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jokes.service.JokeService;

@Controller
public class JokesController {
	
	private JokeService jokeService;
	
	@Autowired
	public JokesController(JokeService jokeService) {
		this.jokeService = jokeService;
	}



	@RequestMapping({"/",""})
	public String viewJoke(Model model) {
		
		model.addAttribute("joke",jokeService.getJoke());
		
		return "joke/chucknorris";
	}
}
