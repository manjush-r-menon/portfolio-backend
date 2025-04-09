package com.manjush.protfolio_backend.repository;

import com.manjush.protfolio_backend.model.Capability;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CapabilityRepository extends JpaRepository<Capability, UUID> {
}
