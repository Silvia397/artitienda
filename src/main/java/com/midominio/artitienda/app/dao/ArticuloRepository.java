package com.midominio.artitienda.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.midominio.artitienda.app.entity.Articulo;

public interface ArticuloRepository extends CrudRepository<Articulo, Long>{
	

}
