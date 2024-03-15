package com.example.demo;

import com.example.demo.services.JoeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartupRunner implements CommandLineRunner {

    private final JoeService joeService;

    public AppStartupRunner(JoeService joeService) {
        this.joeService = joeService;
    }

    @Override
    public void run(String...args) throws Exception {
        joeService.createJoe();
    }
}
