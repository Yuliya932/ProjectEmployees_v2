package ru.maslova.ProjectEmployees_v2.config;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

public class MvcConfig {
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("index");
    }
}
