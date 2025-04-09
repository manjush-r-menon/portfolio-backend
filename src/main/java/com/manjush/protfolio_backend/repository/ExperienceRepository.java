package com.manjush.protfolio_backend.repository;

import com.manjush.protfolio_backend.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExperienceRepository extends JpaRepository<Experience, UUID> {
}