package com.goaltrackr.goalsms.services.impl;

import com.goaltrackr.goalsms.models.Goal;
import com.goaltrackr.goalsms.services.GoalsService;

import java.util.List;
import java.util.UUID;

public class GoalServiceImpl implements GoalsService<Goal> {

    @Override
    public void create(Goal goal) {

    }

    @Override
    public Goal update(Goal entity) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public Goal findById(UUID id) {
        return null;
    }

    @Override
    public List<Goal> findAll() {
        return null;
    }
}
