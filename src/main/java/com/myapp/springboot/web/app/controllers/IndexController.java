package com.myapp.springboot.web.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myapp.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@GetMapping({"/index", "/", "/home"})
	//tambien se puede usar model con addAtribute y enviar un string del
	//la vista a llamar 
	public ModelAndView index(ModelAndView model) {
		model.addObject("titulo", "Hello Word");
		model.addObject("saludo", "Heyy...!! vengo de Spring");
		
		model.setViewName("index");
		
		return model;
	}
	
	
	@GetMapping("/perfil")
	public ModelAndView perfil(ModelAndView mv) {
		Usuario usuario = new Usuario();
		
		usuario.setName("Cristobal");
		usuario.setApellido("Flores");
		usuario.setEmail("cristobal@correo.com");
		
		mv.addObject("usuario", usuario);
		mv.addObject("saludo", "Perfil de usuario: ".concat(usuario.getName()));
		mv.addObject("titulo", "perfil");
		
		mv.setViewName("usuario");
		
		return mv;
	}
	
	@GetMapping("/listar")
	public ModelAndView listar(ModelAndView mvl) {
		List<Usuario> usuarios = Arrays.asList(
				new Usuario("Cristobal", "Ramirez","cristobal@correo.com"),
				new Usuario("Joe", "Perl","joe@correo.com"),
				new Usuario("Doe", "Ramses","doe@correo.com"));
		
		mvl.addObject("titulo", "Listado de Usuarios");
		mvl.addObject("saludo", "Datos Encontrados");
		mvl.addObject("usuarios", usuarios);
		
		mvl.setViewName("listado");
		
		return mvl;
	}
	
	//este model se utiliza para pasar datos a la vista 
	//considerando que estaren en cualquier vista de /app
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = Arrays.asList(
				new Usuario("Cristobal", "Ramirez","cristobal@correo.com"),
				new Usuario("Joe", "Perl","joe@correo.com"),
				new Usuario("Doe", "Ramses","doe@correo.com"));
		return usuarios;
	}

}