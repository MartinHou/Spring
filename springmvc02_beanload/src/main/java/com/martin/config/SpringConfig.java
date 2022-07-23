package com.martin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan({"com.martin.dao","com.martin.service"})
public class SpringConfig {
}
