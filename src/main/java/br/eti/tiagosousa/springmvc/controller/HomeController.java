package br.eti.tiagosousa.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping(value = "/")
	public ModelAndView exibirHome(){
		return new ModelAndView("Home");
	}
}