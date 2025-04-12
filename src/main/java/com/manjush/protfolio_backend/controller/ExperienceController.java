package com.manjush.protfolio_backend.controller;

import com.manjush.protfolio_backend.model.Experience;
import com.manjush.protfolio_backend.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/experiences")
public class ExperienceController {

    @Autowired
    private ExperienceService experienceService;

    @GetMapping
    public List<Experience> getAllUsers() {
        return experienceService.getAllExperiences();
    }
}
