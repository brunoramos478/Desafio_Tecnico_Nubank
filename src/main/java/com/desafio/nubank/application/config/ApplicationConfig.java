package com.desafio.nubank.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Configuration
public class ApplicationConfig {

    @Bean(name = "enableThread")
    public Executor virtualThread() {
        return Executors.newVirtualThreadPerTaskExecutor();
    }
}
