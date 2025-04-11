package com.manjush.protfolio_backend.service;
import com.manjush.protfolio_backend.model.Experience;
import com.manjush.protfolio_backend.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {
    @Autowired
    private ExperienceRepository experienceRepository;

    public List<Experience> getAllExperience() {
        return experienceRepository.findAll();
    }
}
