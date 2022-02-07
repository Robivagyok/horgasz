package hu.Auto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoApplication {

	public static void main(String[] args) {
		System.err.println("A program elindul...");
		SpringApplication.run(AutoApplication.class, args);
		System.err.println("A program véget ért.");
	}

}
