package com.manjush.protfolio_backend.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Capability {

    @Id
    @GeneratedValue
    private UUID id;

    private String title;

    @ElementCollection
    private List<String> skills;

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}

