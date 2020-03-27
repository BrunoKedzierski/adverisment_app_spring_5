package com.bkk.advertisment_app_spring_5.services.map;


import com.bkk.advertisment_app_spring_5.model.Store;
import com.bkk.advertisment_app_spring_5.services.StoreService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StoreMapService extends MapService<Store,Long> implements StoreService {
    @Override
    public Set<Store> findAll() {
        return super.findAll();
    }

    @Override
    public Store findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Store save(Store object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Store object) {
            super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
