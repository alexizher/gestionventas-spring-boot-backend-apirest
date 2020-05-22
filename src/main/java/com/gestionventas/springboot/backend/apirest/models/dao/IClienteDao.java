package com.gestionventas.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gestionventas.springboot.backend.apirest.models.entity.Cliente;
import com.gestionventas.springboot.backend.apirest.models.entity.Region;


/**
 * @author Sandra
 * @author Alexis
 * @author Miguel
 */
public interface IClienteDao extends JpaRepository<Cliente, Long>{
    
	@Query("from Region") // para pessonalizar nustras consultas en JPA
	public List<Region> findAllRegiones();
}
