package com.bkk.advertisment_app_spring_5.services.map;

import com.bkk.advertisment_app_spring_5.model.Post;
import com.bkk.advertisment_app_spring_5.services.PostService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PostMapService extends MapService<Post,Long> implements PostService {
    @Override
    public Set<Post> findAll() {
        return super.findAll();
    }

    @Override
    public Post findById(Long id) {
        return null;
    }

    @Override
    public Post save(Post object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Post object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
