package com.bkk.advertisment_app_spring_5.services.map;

import com.bkk.advertisment_app_spring_5.model.Manufacturer;
import com.bkk.advertisment_app_spring_5.services.ManufacturerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ManufacturerMapService extends MapService<Manufacturer,Long> implements ManufacturerService {

    @Override
    public Set<Manufacturer> findAll() {
        return super.findAll();
    }

    @Override
    public Manufacturer findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Manufacturer save(Manufacturer object) {
      return   super.save(object.getId(),object);
    }

    @Override
    public void delete(Manufacturer object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
