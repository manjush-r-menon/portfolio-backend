package com.manjush.protfolio_backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private UUID id;

    private String firstname;
    private String lastname;
    private String tagline;

    @Column(length = 1000)
    private String introduction;

    @Column(length = 2000)
    private String description;

    private String profileImageUrl;
    private String resumeUrl;

}

