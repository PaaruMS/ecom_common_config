package com.ecom.commonSrevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class CommonSreviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonSreviceApplication.class, args);
	}

}
