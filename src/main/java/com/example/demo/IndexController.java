package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller 
public class IndexController {
	
	//Es el controlador de la fiesta.
	//Le vas a pasar la vista que quieres recibir.
	//Vamos a usar el tema de los models.
	@GetMapping({"/index", "/", "/home"})
	public String index(Model model) {
		return "index";
	}
	@GetMapping({"/catalogo", "/catalog"})
	public String Catalogo(Model model){
		return "catalogo";
	}
	@GetMapping({"/about"})
	public String About(Model model) {
		return "about";
	}
	@GetMapping({"/Bot", "/bot"})
	public String Bot(Model model){
		return "index";
	}
	
	}
	
}

