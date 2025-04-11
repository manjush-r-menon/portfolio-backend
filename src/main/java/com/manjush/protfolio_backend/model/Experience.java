package com.manjush.protfolio_backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@Entity
public class Experience {

    @Id
    @GeneratedValue
    private UUID id;

    @Enumerated(EnumType.STRING)
    private ExperienceType type;

    private String title;
    private String institute;
    private String duration;

    @Column(length = 2000)
    private String details;

}

