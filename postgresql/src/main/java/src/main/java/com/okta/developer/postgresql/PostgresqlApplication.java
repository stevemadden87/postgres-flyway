package src.main.java.com.okta.developer.postgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication(scanBasePackages = {  "src.main.java.com.okta.developer.postgresql" })
@Component
public class PostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgresqlApplication.class, args);
	}

}
