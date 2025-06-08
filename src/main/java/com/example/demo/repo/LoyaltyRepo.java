package com.example.demo.repo;


import com.example.demo.model.Loyalty;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoyaltyRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Loyalty findById(Integer id) {
        String sql = "SELECT id, name, points FROM loyalty where id = ?";

        return jdbcTemplate.queryForObject(
                sql,
                new BeanPropertyRowMapper<>(Loyalty.class),
                id
        );
    }
}
