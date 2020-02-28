package com.ra.auth;

import com.ra.system.annotation.EnableRaFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yilei
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaClient
@EnableRaFeignClients
public class RaAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(RaAuthApplication.class, args);
    }
}
