package com.api.juan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.juan.entity.Usuario;
import com.api.juan.repository.UsuarioDao;

@Service
public class UsuarioServiceImp implements UsuarioService {

	@Autowired
	private UsuarioDao usuarioDao;
	
	@Override
	public List<Usuario> mostrarUsuario() {
		// TODO Auto-generated method stub
		return usuarioDao.findAll();
	}

	@Override
	public Usuario buscarUsuario(Long id) {
		// TODO Auto-generated method stub
		return usuarioDao.findById(id).get();
	}

	@Override
	public Usuario crearUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioDao.save(usuario);
	}

	@Override
	public Usuario actualizarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioDao.save(usuario);
	}

	@Override
	public void borrarUsuario(Long id) {
		usuarioDao.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	
}
