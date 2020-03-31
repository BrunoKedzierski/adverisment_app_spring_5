package com.bkk.advertisment_app_spring_5.services.map;

import com.bkk.advertisment_app_spring_5.model.Category;
import com.bkk.advertisment_app_spring_5.services.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CategoryMapService extends MapService<Category,Long> implements CategoryService {

    @Override
    public Set<Category> findAll() {
        return super.findAll();
    }

    @Override
    public Category findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Category save(Category object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Category object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
