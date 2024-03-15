package com.example.demo.services;

import com.example.demo.models.Joe;
import com.example.demo.repositories.JoeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoeService {
    private final JoeRepository joeRepository;

    public JoeService(JoeRepository joeRepository) {
        this.joeRepository = joeRepository;
    }

    public void createJoe() {
        List<Joe> joes = joeRepository.findAll();
        if (joes.isEmpty()) {
            Joe newJoe = new Joe("Michael", 20);
            joeRepository.save(newJoe);
        }
    }

    public List<Joe> getJoes() {
        return joeRepository.findAll();
    }
}
