package com.wykett.redditclone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StartApplication implements CommandLineRunner {
	
	public static ConfigurableApplicationContext context;

    private static final Logger logger = LoggerFactory.getLogger(StartApplication.class);

    public static void main(String[] args) {
    	context = SpringApplication.run(StartApplication.class, args);
    }

    @Override
    public void run(String... args) {
    	logger.info("StartApplication...");
    }
    
}
