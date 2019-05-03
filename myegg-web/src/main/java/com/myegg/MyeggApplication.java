package com.myegg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.myegg.*")
@MapperScan(basePackages = "com.myegg.dao.mapper")
public class MyeggApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyeggApplication.class, args);
	}
}
