package com.advanced_java_examples.friendbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//it will try to load all thr required configurations
//sets up th basic stuff reuired for starting a web basedapplication
public class FriendbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(FriendbookApplication.class, args);
	}

}
