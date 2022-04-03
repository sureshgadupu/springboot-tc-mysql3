package dev.fullstackcode.tc.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"dev.fullstackcode.tc.docker.entity"})
public class TestcontainersDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestcontainersDockerApplication.class, args);
	}

}
