package com.martin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.martin.controller","com.martin.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
