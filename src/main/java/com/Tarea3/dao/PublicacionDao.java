package com.Tarea3.dao;

import com.Tarea3.domain.Publicacion;
import org.springframework.data.repository.CrudRepository;

public interface PublicacionDao extends CrudRepository<Publicacion, Long>{
    
}
