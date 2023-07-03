package com.goaltrackr.goalsms.models.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoalRequest {
    private String name;
    private String description;
    private String category;
    private Timestamp deadline;
}
