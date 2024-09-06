package com.alrawasabed.pdfrag;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportRuntimeHints;
import org.springframework.shell.command.annotation.CommandScan;

@SpringBootApplication
@CommandScan
@ImportRuntimeHints(HintsRegistrar.class)
public class PdfragApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdfragApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> System.out.println("hello ");
	}
}
