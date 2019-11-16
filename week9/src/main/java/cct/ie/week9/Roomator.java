package cct.ie.week9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("cct.ie.*")
public class Roomator {

	public static void main(String[] args) {
		SpringApplication.run(Roomator.class, args);
	}

}
