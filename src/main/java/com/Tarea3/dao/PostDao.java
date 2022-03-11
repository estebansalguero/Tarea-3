package com.Tarea3.dao;

import com.Tarea3.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostDao extends CrudRepository<Post, Long>{
    
}
