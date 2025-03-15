package com.test5.test5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test5Application {
	int x=10;
	String name="mike"
	boolean status=true;
	float value=12.312;
	double value1=123.12331231;
	char ch='x';
	public static void main(String[] args) {
		SpringApplication.run(Test5Application.class, args);
	}

}
