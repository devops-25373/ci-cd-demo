package com.example.demo.controller;


import com.example.demo.model.Loyalty;
import com.example.demo.service.LoyaltyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loyalty")
public class LoyaltyController {

    private final LoyaltyService service;
    public LoyaltyController(LoyaltyService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Loyalty getCandidateById(@PathVariable Integer id) {
        return service.getById(id);
    }

}
