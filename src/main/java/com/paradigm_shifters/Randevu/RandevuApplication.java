package com.paradigm_shifters.Randevu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class RandevuApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(RandevuApplication.class, args);
	}

	// Pass a simple path for the view controller to handle GET requests. Requires the lombok dependency
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("hello_world01");
	}
}
