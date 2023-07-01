package com.goaltrackr.goalsms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Table(name = "Users", schema = "db_goals_service")
public class User {
    private UUID id;
    private String name;
    private String email;
    private String password;
}
