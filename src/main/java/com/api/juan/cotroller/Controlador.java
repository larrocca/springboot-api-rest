package com.api.juan.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.juan.entity.Usuario;
import com.api.juan.service.UsuarioService;

@RestController
@RequestMapping("api")
public class Controlador {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/usuarios")
	public List<Usuario> mostrarUsuarios(){
		return usuarioService.mostrarUsuario();
	} 
	
	@GetMapping("/usuario/{id}")
	public Usuario usuarioPorId(@PathVariable Long id) {
		return usuarioService.buscarUsuario(id);
	}
	
	@PostMapping("/crear")
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		return usuarioService.crearUsuario(usuario);
	}
	
	@PutMapping("/actualizar")
	public Usuario actualizar(@RequestBody Usuario usuario) {
		return usuarioService.actualizarUsuario(usuario);
	}
	
	@DeleteMapping("/borrar/{id}")
	public void borrarUsuario(@PathVariable Long id) {
		usuarioService.borrarUsuario(id);
	} 
}
