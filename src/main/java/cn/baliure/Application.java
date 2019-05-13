package cn.baliure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("cn.baliure.persistence.mybatis")
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	

}
