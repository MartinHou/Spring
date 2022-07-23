package com.martin.config;

import org.springframework.context .annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.martin")
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {
}
