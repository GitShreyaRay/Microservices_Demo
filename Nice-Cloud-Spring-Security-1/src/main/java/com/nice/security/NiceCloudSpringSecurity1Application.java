package com.nice.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.nice.securityconfig.SpringRoleBasedConfig;

@EnableWebMvc
@ComponentScan("com.nice.*")
@Import({SpringRoleBasedConfig.class})
@SpringBootApplication
public class NiceCloudSpringSecurity1Application {

	public static void main(String[] args) {
		SpringApplication.run(NiceCloudSpringSecurity1Application.class, args);
	}

}
