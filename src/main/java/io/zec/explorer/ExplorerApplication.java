package io.zec.explorer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ExplorerApplication {

	private static final Logger log = LogManager.getLogger(ExplorerApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ExplorerApplication.class);
		app.run(args);

	}



}
