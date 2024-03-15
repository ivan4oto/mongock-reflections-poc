package com.example.demo.migrations;

import com.example.demo.models.Joe;
import com.example.demo.repositories.JoeRepository;
import io.mongock.api.annotations.ChangeUnit;
import io.mongock.api.annotations.Execution;
import io.mongock.api.annotations.RollbackExecution;

import java.util.List;

@ChangeUnit(id="client-initializer", order = "001", author = "mongock")
public class JoeMigration {
    private final JoeRepository joeRepository;

    public JoeMigration(JoeRepository joeRepository) {
        this.joeRepository = joeRepository;
    }
    @Execution
    public void changeSet() {
        List<Joe> joes = joeRepository.findAll();
        for (Joe joe : joes) {
            if (!"Joe".equals(joe.getName())) {
                joe.setName("Joe");
                joeRepository.save(joe);
            }
        }
    }
    @RollbackExecution
    public void rollback() {
    }



}
