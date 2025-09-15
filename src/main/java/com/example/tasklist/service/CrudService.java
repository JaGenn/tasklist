package com.example.tasklist.service;

public interface CrudService<T, ID> {

    T getById(ID id);

    T update(T entity);

    void delete(ID id);
}
