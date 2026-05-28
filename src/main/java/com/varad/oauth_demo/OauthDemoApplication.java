package com.varad.oauth_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OauthDemoApplication {
    public static final Logger logger = LoggerFactory.getLogger(OauthDemoApplication.class);
	public static void main(String[] args) {

        SpringApplication.run(OauthDemoApplication.class, args);
        logger.info("OAuth Demo Application Started.");

	}

}
