package com.myapp.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/params")
public class ParamsController {
	
	@GetMapping("/index")
	public ModelAndView index(@RequestParam(name="texto", defaultValue="No hay parametros") String texto, ModelAndView mv) {
		
		mv.setViewName("params/index");
		
		return mv;
	}

	@GetMapping("/string")
	public ModelAndView params(@RequestParam(name="texto", defaultValue="No hay parametros") String texto, ModelAndView mv) {
		
		mv.addObject("result", "Parametro enviado: " + texto);
		mv.addObject("titulo", "Params");
		mv.setViewName("params/ver");
		
		return mv;
	}
}
