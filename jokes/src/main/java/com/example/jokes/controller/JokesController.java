package com.example.jokes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jokes.service.JokeServiceImpl;

@Controller
public class JokesController {
	
	
	@RequestMapping("")
	public String viewJoke(Model model) {
		
		//model.addAttribute(model.);
		
		return "joke/chucknorris";
	}
}
