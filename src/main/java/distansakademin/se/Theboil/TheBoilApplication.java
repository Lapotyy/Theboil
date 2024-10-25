package distansakademin.se.Theboil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("distansakademin.se.Theboil") // Adjust if necessary
@EnableJpaRepositories("distansakademin.se.Theboil")
public class TheBoilApplication {
	public static void main(String[] args) {
		SpringApplication.run(TheBoilApplication.class, args);
	}
}
