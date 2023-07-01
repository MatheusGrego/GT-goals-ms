package com.goaltrackr.goalsms.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Tasks", schema = "db_goals_service")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "task_name")
    private String name;
    @Column(name = "task_category")
    private String category;
    @Column(name = "task_status")
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "goal_id")
    private Goal goal;
}

