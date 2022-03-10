package com.Tarea3.service;

import com.Tarea3.domain.Publicacion;
import java.util.List;

public interface PublicacionService {
    
    public List<Publicacion> getPublicacion();
    
    public void save(Publicacion Publicacion);
    public void delete (Publicacion Publicacion);
    public Publicacion getPublicacion(Publicacion Publicacion);
    
}
