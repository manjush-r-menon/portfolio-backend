package com.manjush.protfolio_backend.controller;

import com.manjush.protfolio_backend.model.Capability;
import com.manjush.protfolio_backend.model.User;
import com.manjush.protfolio_backend.service.CapabilityService;
import com.manjush.protfolio_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/capabilities")
public class CapabilityController {
    @Autowired
    private CapabilityService capabilityService;

    @GetMapping
    public List<Capability> getAllCapabilities() {
        return capabilityService.getAllCapabilities();
    }
}
