package com.wuxun.wuxuncameltest;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class mainClass {

	public static void main(String[] args) throws Exception {
		CamelContext camelCtx = new DefaultCamelContext();
		camelCtx.addRoutes(new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				// noop表示等待、无操作11
				from("file:F:/temp/folder1?noop=true").to("file:F:/temp/folder2");
			}
		});

		camelCtx.start();
		Thread.sleep(10000);
		camelCtx.stop();
	}

}
