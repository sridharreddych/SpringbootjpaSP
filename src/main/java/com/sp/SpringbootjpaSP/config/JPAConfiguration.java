package com.sp.SpringbootjpaSP.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.sp.SpringbootjpaSP.services.ProductService;
import com.sp.SpringbootjpaSP.services.ProductServiceImpl;




@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = { "com.sp.SpringbootjpaSP.repositories" })
@ComponentScan("com.sp")
@PropertySource("classpath:application.properties")
public class JPAConfiguration {

	@Bean
	public ProductService productService() {
		return new ProductServiceImpl();
	}

}