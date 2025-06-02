package com.test.hplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.test.hplus.beans")  // Add this
@EnableJpaRepositories("com.test.hplus.repository") 
public class HplusappApplication {
	public static void main(String[] args) {
		SpringApplication.run(HplusappApplication.class, args);
	}
}