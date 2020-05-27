package com.gestionventas.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gestionventas.springboot.backend.apirest.models.entity.Cliente;
import com.gestionventas.springboot.backend.apirest.models.entity.Factura;
import com.gestionventas.springboot.backend.apirest.models.entity.Producto;
import com.gestionventas.springboot.backend.apirest.models.entity.Region;

/**
 * @author Sandra
 * @author Alexis
 * @author Miguel
 */

// con esta clase administramos y manejamos los diferentes accesos a los Dao
public interface IClienteService {

	public List<Cliente> findAll(); // retorna el cliente guardado

	public Page<Cliente> findAll(Pageable pageable); // Recibe el objeto paginable

	public Cliente save(Cliente cliente); // retorna el cliente guardado

	public Cliente findById(Long id); // retorna el cliente por id

	public void delete(Long id); // elimina el cliente por id

	public List<Region> findAllRegiones();

	public Factura findFacturaById(Long id);

	public Factura saveFactura(Factura factura);

	public void deleteFacturaById(Long id);
	
	public List<Producto> findProductoByNombre(String term);

}