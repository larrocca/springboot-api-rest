package com.api.juan.service;

import java.util.List;

import com.api.juan.entity.Usuario;

public interface UsuarioService {
	public List<Usuario> mostrarUsuario();
	
	public Usuario buscarUsuario(Long id);
	
	public Usuario crearUsuario(Usuario usuario);
	
	public Usuario actualizarUsuario(Usuario usuario);
	
	public void borrarUsuario(Long id);
}
