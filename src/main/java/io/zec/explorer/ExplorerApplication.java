package io.zec.explorer;

import jdk.jfr.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@SpringBootApplication
public class ExplorerApplication {

	private static final Logger log = LogManager.getLogger(ExplorerApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ExplorerApplication.class);
		app.run(args);

	}



}
