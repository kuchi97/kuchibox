package com.tis.testSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/test")
	public String push() {
		return "test";
	}
}
