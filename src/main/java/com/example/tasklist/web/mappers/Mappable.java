package com.example.tasklist.web.mappers;

public interface Mappable <E, D>{

    E toEntity(D dto);
    D toDto(E entity);
}
