package com.gestionventas.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gestionventas.springboot.backend.apirest.models.entity.Cliente;
import com.gestionventas.springboot.backend.apirest.models.entity.Region;

/**
 * @author Sandra
 * @author Alexis
 * @author Miguel
 */

public interface IClienteService {
    
    public List<Cliente> findAll(); //retorna el cliente guardado
    
    public Page<Cliente> findAll(Pageable pageable); //Recibe el objeto paginable
    
    public Cliente save(Cliente cliente); //retorna el cliente guardado
    
    public Cliente findById(Long id); //retorna el cliente por id

    public void delete(Long id); //elimina el cliente por id
    
    public List<Region> findAllRegiones();
    
}