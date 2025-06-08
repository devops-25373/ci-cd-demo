package com.example.demo.service;


import com.example.demo.model.Loyalty;
import com.example.demo.repo.LoyaltyRepo;
import org.springframework.stereotype.Service;

@Service
public class LoyaltyService {

    private final LoyaltyRepo repository;

    public LoyaltyService(LoyaltyRepo repository) {
        this.repository = repository;
    }

    public Loyalty getById(Integer id) {
        return repository.findById(id);
    }
}
