package net.atos.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * @author A707592
 *
 */
@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = {"net.atos"})
@ComponentScan(basePackages = {"net.atos"})
@EntityScan(basePackages = {"net.atos"})
public class PharmacieApplication {

	public static void main(String[] args) {
		SpringApplication.run(PharmacieApplication.class, args);
	}

}
