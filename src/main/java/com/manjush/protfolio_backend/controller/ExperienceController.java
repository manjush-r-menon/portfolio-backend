package com.manjush.protfolio_backend.controller;

import com.manjush.protfolio_backend.model.Experience;
import com.manjush.protfolio_backend.model.User;
import com.manjush.protfolio_backend.service.ExperienceService;
import com.manjush.protfolio_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/experience")
public class ExperienceController {
    @Autowired
    private ExperienceService experienceService;

    @GetMapping
    public List<Experience> getAllUsers() {
        return experienceService.getAllExperience();
    }
}
