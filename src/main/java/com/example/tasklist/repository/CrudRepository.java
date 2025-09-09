package com.example.tasklist.repository;

import java.util.Optional;

public interface CrudRepository<T, ID> {

    Optional<T> findById(ID id);

    void create(T entity);

    void update(T entity);

    void delete(ID id);
}
