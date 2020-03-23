package com.bkk.advertisment_app_spring_5.services.map;

import com.bkk.advertisment_app_spring_5.model.Category;
import com.bkk.advertisment_app_spring_5.services.CrudService;

import java.util.Set;

public class CategoryMapService extends MapService<Category,Long> implements CrudService<Category,Long> {

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
