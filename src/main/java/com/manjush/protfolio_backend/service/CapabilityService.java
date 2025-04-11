package com.manjush.protfolio_backend.service;

import com.manjush.protfolio_backend.model.Capability;
import com.manjush.protfolio_backend.repository.CapabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapabilityService {

    @Autowired
    private CapabilityRepository capabilityRepository;

    public List<Capability> getAllCapabilities() {
        return capabilityRepository.findAll();
    }
}
