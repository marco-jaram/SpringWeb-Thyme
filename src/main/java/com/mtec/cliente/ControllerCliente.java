package com.mtec.cliente;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControllerCliente {
	@GetMapping("/")
	public String cliente(Model model) {
		var persona = new Persona();
		persona.setNombre("Marco");
		persona.setApellido("Jaramillo");
		persona.setEmail("marco@gmail.com");
		persona.setTelefono("6643332883");
		
		model.addAttribute("persona", persona);
		return "index";

	}

}
