package com.example.p1120;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class UserController {
	@GetMapping("/user/home")
	public String home() {
		log.debug("/user/home 요청내용");
		return "user/home";
	}
}
