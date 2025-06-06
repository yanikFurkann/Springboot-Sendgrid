package com.furkanyanik.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import com.sendgrid.SendGrid;




@Configuration
public class SendgridConfig {

    @Bean
    public SendGrid sendGrid(@Value("${spring.sendgrid.api-key}") String apiKey) {
        return new SendGrid(apiKey);
    }

	
}




