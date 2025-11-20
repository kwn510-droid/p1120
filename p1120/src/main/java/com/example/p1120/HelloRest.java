package com.example.p1120;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {
	@GetMapping("/rest/nameList")
	public List<String> hello() {
		List<String> nameList = new ArrayList<>();
		nameList.add("루피");
		nameList.add("조로");
		nameList.add("나미");
		return nameList; //json 문자열로 반환
	}
}
