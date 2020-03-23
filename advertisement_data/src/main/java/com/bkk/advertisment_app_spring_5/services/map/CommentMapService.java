package com.bkk.advertisment_app_spring_5.services.map;

import com.bkk.advertisment_app_spring_5.model.Comment;
import com.bkk.advertisment_app_spring_5.services.CrudService;

import java.util.Set;

public class CommentMapService extends MapService<Comment,Long> implements CrudService<Comment,Long> {
    @Override
    public Set<Comment> findAll() {
        return super.findAll();
    }

    @Override
    public Comment findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Comment save(Comment object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Comment object) {
            super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
