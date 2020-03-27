package com.bkk.advertisment_app_spring_5.services.map;


import com.bkk.advertisment_app_spring_5.model.Product;
import com.bkk.advertisment_app_spring_5.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class ProductMapService extends MapService<Product,Long> implements ProductService {
    @Override
    public Set<Product> findAll() {
        return super.findAll();
    }

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public Product save(Product object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Product object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
