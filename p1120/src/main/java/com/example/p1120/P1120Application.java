package com.example.p1120;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan // WebFilter, listener 객체등록
@SpringBootApplication // spring bean(controller, Mapper, Service, Component, autowire 객체들을 등록)
public class P1120Application {

	public static void main(String[] args) {
		SpringApplication.run(P1120Application.class, args);
	}
}
