package com.embraces.hive;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

// 指定spring要扫描的包路径
@ComponentScan(basePackages = {"com.embraces.hive"})
@EnableAutoConfiguration
//指定mybatis要扫描的包路径
@MapperScan(basePackages={"com.embraces.hive.mapper"})
public class SparkMain {

	public static void main(String[] args) {
		SpringApplication.run(SparkMain.class, args);
	}
	
}
