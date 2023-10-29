package org.example.vebinarcrud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public HelloBean helloBean() {
        return new HelloBean("Привет, мир!"); // Создание и инициализация бина
    }
}
