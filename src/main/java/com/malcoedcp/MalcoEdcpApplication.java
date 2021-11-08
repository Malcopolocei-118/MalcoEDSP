package com.malcoedcp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.malcoedcp.*.*.*.mapper"})
public class MalcoEdcpApplication {

    public static void main(String[] args) {
        SpringApplication.run(MalcoEdcpApplication.class, args);
    }

}
