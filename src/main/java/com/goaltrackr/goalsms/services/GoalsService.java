package com.goaltrackr.goalsms.services;

import java.util.List;
import java.util.UUID;

public interface GoalsService<T> {
    void create(T entity);
    T update(T entity);
    void delete(UUID id);
    T findById(UUID id);
    List<T> findAll();
}
