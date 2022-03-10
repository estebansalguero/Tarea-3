package com.Tarea3.service;

import com.Tarea3.dao.PublicacionDao;
import com.Tarea3.domain.Publicacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PublicacionServiceImpl implements PublicacionService{

    @Autowired
    private PublicacionDao publicacionDao;
        
    @Override
    @Transactional (readOnly = true)
    public List<Publicacion> getPublicacion() {
        return (List<Publicacion>) publicacionDao.findAll();
        
    }

    @Override
    @Transactional
    public void save(Publicacion Publicacion) {
        publicacionDao.save(Publicacion);
    }

    @Override
    @Transactional
    public void delete(Publicacion Publicacion) {
        publicacionDao.delete(Publicacion);
    }

    @Override
    @Transactional (readOnly = true)
    public Publicacion getPublicacion(Publicacion Publicacion) {
        return publicacionDao.findById(Publicacion.getIdPub()).orElse(null);
    }
    
}
