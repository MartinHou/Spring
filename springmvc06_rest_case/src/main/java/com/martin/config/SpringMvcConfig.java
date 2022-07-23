package com.martin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.martin.controller","com.martin.config"})   //第二个用于扫SpringMvcSupport
@EnableWebMvc
public class SpringMvcConfig {
}
