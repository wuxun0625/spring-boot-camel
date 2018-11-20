package com.wuxun.wuxuncameltest;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CamelController {
	Logger logger = LoggerFactory.getLogger(CamelController.class);

	@RequestMapping("/testCamel")
	void testCamel() throws Exception {
		CamelContext camelCtx = new DefaultCamelContext();
		camelCtx.addRoutes(new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				// noop表示等待、无操作
				from("file:F:/temp/folder1?noop=true").to("file:F:/temp/folder2");
			}
		});

		camelCtx.start();
	}

}