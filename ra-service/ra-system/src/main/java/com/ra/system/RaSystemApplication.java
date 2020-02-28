package com.ra.system;

import com.ra.system.annotation.EnableRaFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author yl
 * @Date 2020/2/28 0028 12:19
 */
@EnableEurekaClient
@EnableRaFeignClients
@SpringBootApplication
@MapperScan("com.ra.*.mapper")
public class RaSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(RaSystemApplication.class,args);
    }
}
