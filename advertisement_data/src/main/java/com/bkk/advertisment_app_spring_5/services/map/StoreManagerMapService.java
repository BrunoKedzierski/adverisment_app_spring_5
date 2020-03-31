package com.bkk.advertisment_app_spring_5.services.map;

import com.bkk.advertisment_app_spring_5.model.StoreManager;
import com.bkk.advertisment_app_spring_5.services.StoreManagerService;

import java.util.Set;

public class StoreManagerMapService extends MapService<StoreManager,Long> implements StoreManagerService {


    @Override
    public Set<StoreManager> findAll() {
        return super.findAll();
    }

    @Override
    public StoreManager findById(Long id) {
        return super.findById(id);
    }

    @Override
    public StoreManager save(StoreManager object) {
        return   super.save(object.getId(),object);
    }

    @Override
    public void delete(StoreManager object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
