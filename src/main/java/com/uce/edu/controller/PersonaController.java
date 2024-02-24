package com.uce.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.repository.modelo.Persona;
import com.uce.edu.service.IPersonaService;

@Controller
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	private IPersonaService iPersonaService;

	// GET Para buscar una lista
	@GetMapping("/buscarTodos")
	public String buscarTodos(Model modelo) {
		List<Persona> lista = this.iPersonaService.buscarTodos();
		modelo.addAttribute("personas", lista);
		return "vistaListaPersonas";
	}

	// Path
	// GET Para buscar
	@GetMapping("/buscar")
	public String buscarPorCedula(String cedula) {

		return "";
	}

	// PUT para actualizar
	@PutMapping("/actualizar")
	public String actualizar() {
		return "";
	}

	// DELETE para borrar
	@DeleteMapping("/borrar")
	public String borrar() {
		return "";
	}

	// POST Para guardar
	@PostMapping("/guardar")
	public String guardar() {
		return "";
	}
}
