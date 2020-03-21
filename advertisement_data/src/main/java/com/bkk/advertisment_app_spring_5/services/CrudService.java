package com.bkk.advertisment_app_spring_5.services;

import java.util.Set;

public interface CrudService<T,ID> {
    Set<T>findAll();

    Set<T>findById(ID id);

    T save(T object);
    void delete(T object);
    void deleteById(ID id);

}
