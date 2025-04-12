package com.manjush.protfolio_backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

    @Column(name = "duration_start")
    private LocalDate durationStart;

    @Column(name = "duration_end")
    private LocalDate durationEnd;

    @Column(length = 2000)
    private String details;
}
