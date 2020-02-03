package com.sp.SpringbootjpaSP;

import java.math.BigDecimal;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;

import com.sp.SpringbootjpaSP.config.JPAConfiguration;
import com.sp.SpringbootjpaSP.entities.Product;
import com.sp.SpringbootjpaSP.services.ProductService;

@SpringBootApplication
public class Demo {

	public static void main(String[] args) {
        SpringApplication.run(Demo.class, args);
    }

    @Bean
    public ApplicationRunner init() {
    	System.out.println("inside init method");
        return args -> {
        	try {
    			AbstractApplicationContext context = new AnnotationConfigApplicationContext(JPAConfiguration.class);
    			ProductService productService = context.getBean(ProductService.class);
    			System.out.println("Find product have price between 4 and 8");
    			for (Product product : productService.findAllBetweenStoredProcedure(BigDecimal.valueOf(4), BigDecimal.valueOf(8))) {
    				System.out.println("Id: " + product.getId());
    				System.out.println("Name: " + product.getName());
    				System.out.println("Price: " + product.getPrice());
    				System.out.println("========================");
    			}
    			//context.close();
    		} catch (Exception e) {
    			System.out.println(e.getMessage());
    		}
        };
    }
	
	

}