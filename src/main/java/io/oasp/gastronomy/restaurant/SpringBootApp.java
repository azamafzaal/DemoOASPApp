package io.oasp.gastronomy.restaurant;

import java.lang.invoke.MethodHandles;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootApp {

	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	public static void main(String[] args) {
		LOG.info("Spring Boot Application is starting...");
		SpringApplication.run(SpringBootApp.class, args);
	}

	@Bean
	public Mapper mapper() {
		return new DozerBeanMapper();
	}
}
