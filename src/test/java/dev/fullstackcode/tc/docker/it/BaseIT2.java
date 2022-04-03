package dev.fullstackcode.tc.docker.it;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ContextConfiguration(initializers = BaseIT2.TestEnvInitializer.class)
@Testcontainers
@DirtiesContext
public  class BaseIT2 {

	@Container
	public static MySQLContainer<?> mySqlDB = new MySQLContainer<>
			("mysql:5.7.37")
			.withDatabaseName("eis")
			.withUsername("admin")
			.withPassword("admin");


	static class TestEnvInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

		@Override
		public void initialize(ConfigurableApplicationContext applicationContext) {
			TestPropertyValues values = TestPropertyValues.of(
					"spring.datasource.url=" + mySqlDB.getJdbcUrl(),
					"spring.datasource.password=" + mySqlDB.getPassword(),
					"spring.datasource.username=" + mySqlDB.getUsername()
			);
			values.applyTo(applicationContext);

		}

	}
	
	@Autowired
	protected TestRestTemplate testRestTemplate ;

}