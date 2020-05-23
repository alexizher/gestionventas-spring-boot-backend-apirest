package com.gestionventas.springboot.backend.apirest.models.services;

import com.gestionventas.springboot.backend.apirest.models.entity.Usuario;

/**
 * @author Sandra
 * @author Alexis
 * @author Miguel
 */ 

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);

}
