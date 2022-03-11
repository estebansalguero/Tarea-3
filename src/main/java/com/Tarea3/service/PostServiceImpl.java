package com.Tarea3.service;

import com.Tarea3.dao.PostDao;
import com.Tarea3.domain.Post;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PostServiceImpl implements PostService{
    
    @Autowired
    private PostDao postDao;

    @Override
    @Transactional(readOnly = true)
    public List<Post> getPost() {
        return (List<Post>) postDao.findAll();
    }

    @Override
    @Transactional
    public void save(Post post) {
        postDao.save(post);
    }

    @Override
    public void delete(Post post) {
        postDao.delete(post);
    }

    @Override 
    @Transactional (readOnly = true)
    public Post getPost(Post post) {
        return postDao.findById(post.getIdPub()).orElse(null);
    }
    
}
