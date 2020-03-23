package com.bkk.advertisment_app_spring_5.services.map;

import com.bkk.advertisment_app_spring_5.model.User;
import com.bkk.advertisment_app_spring_5.services.CrudService;

import java.util.Set;

public class UserMapService extends MapService<User,Long> implements CrudService<User,Long> {

    @Override
    public Set<User> findAll() {
        return super.findAll();
    }

    @Override
    public User findById(Long id) {
        return super.findById(id);
    }

    @Override
    public User save(User object) {
      return   super.save(object.getId(),object);
    }

    @Override
    public void delete(User object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
