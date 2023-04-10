package com.uts.invoice.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uts.invoice.models.Usuario;

@Controller
@RequestMapping("/app")
public class indexController {

	@GetMapping({"/index", "/", "", "/home"})
	public String index (Model model) {
		model.addAttribute("titulo","Spring Boot");
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		model.addAttribute("titulo", "Perfil Usuario");
		Usuario usuario = new Usuario();
		usuario.setNombre("Yesid");
		usuario.setApellido("Guerrero");
		usuario.setEmail("yesideduardoguerrero@hotmail.com");
		model.addAttribute("usuario", usuario);
		return "perfil";			
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		/*List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("John", "Doe", "jhon@correo.com"));
		usuarios.add(new Usuario("Jane", "Doe", "jane@correo.com"));
		usuarios.add(new Usuario("Tornado", "Roe", "roe@correo.com"));
		usuarios.add(new Usuario("Yesid", "Guerrero", "yesid@correo.com"));
		usuarios.add(new Usuario("Diana", "Tarazona", "dtarazona@correo.com"));
		usuarios.add(new Usuario("Diego", "Rangel", "diego@correo.com"));*/
		model.addAttribute("titulo","Listado de Usuarios");
		//model.addAttribute("usuarios", usuarios);
	    return "listar";
	}
	
	@ModelAttribute("usuarios")
		public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("John", "Doe", "jhon@correo.com"));
		usuarios.add(new Usuario("Jane", "Doe", "jane@correo.com"));
		usuarios.add(new Usuario("Tornado", "Roe", "roe@correo.com"));
		usuarios.add(new Usuario("Yesid", "Guerrero", "yesid@correo.com"));
		usuarios.add(new Usuario("Diana", "Tarazona", "dtarazona@correo.com"));
		usuarios.add(new Usuario("Diego", "Rangel", "diego@correo.com"));
		return usuarios;
		}
		
	
}
