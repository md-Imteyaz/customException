package com.Customexcp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/")
	public void message() throws CustomException {
		throw new CustomException();
	}

}
