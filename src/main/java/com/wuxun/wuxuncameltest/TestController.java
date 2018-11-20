package com.wuxun.wuxuncameltest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	Logger logger = LoggerFactory.getLogger(TestController.class);

	@Autowired
	testBean tb;

	@RequestMapping("/test")
	String test() throws Exception {
		return tb.getRestTemplate();
	}

}