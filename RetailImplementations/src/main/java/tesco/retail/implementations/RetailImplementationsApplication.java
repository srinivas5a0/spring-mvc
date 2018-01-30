package tesco.retail.implementations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("tesco.retail.implementations")
public class RetailImplementationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailImplementationsApplication.class, args);
	}
}
