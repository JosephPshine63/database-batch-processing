package dev.pioruocco.app;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableBatchProcessing
@ComponentScan({"dev.pioruocco.config", "dev.pioruocco.listener",
	"dev.pioruocco.reader", "dev.pioruocco.processor",
	"dev.pioruocco.writer", "dev.pioruocco.listener"})
public class SpringBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchApplication.class, args);
	}

}
