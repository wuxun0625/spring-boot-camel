package com.wuxun.wuxuncameltest;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class testBean {

	private RestTemplate restTemplate;

	public testBean() {
		restTemplate = new RestTemplate();
	}

	public String getRestTemplate() {
		return restTemplate.toString();
	}

}
