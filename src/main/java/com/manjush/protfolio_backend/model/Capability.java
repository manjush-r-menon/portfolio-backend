package com.manjush.protfolio_backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@Entity
public class Capability {

    @Id
    @GeneratedValue
    private UUID id;

    private String skillIntro;

    @ElementCollection
    private List<String> skills;

}

