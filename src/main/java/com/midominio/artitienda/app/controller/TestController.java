package com.midominio.artitienda.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.midominio.artitienda.app.dao.ArticuloRepository;
import com.midominio.artitienda.app.dao.TiendaRepository;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	ArticuloRepository articuloRepository;
	@Autowired
	TiendaRepository tiendaRepository;
	
	@GetMapping("/test1")
	public String test1(Model model) {
		model.addAttribute("numArticulos", articuloRepository.count());
		model.addAttribute("numTiendas", tiendaRepository.count());
			return "test/test1";
		
	}
		@GetMapping("/test2")
		public String test2(Model model) {
			articuloRepository.deleteAll();
			model.addAttribute("numArticulos", articuloRepository.count());
			model.addAttribute("numTiendas", tiendaRepository.count());
				return "test/test1";
		
		
	}
}
