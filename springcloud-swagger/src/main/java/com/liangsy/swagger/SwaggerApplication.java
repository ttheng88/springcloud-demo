package com.liangsy.swagger;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liangsy
 * @desc 访问 http://127.0.0.1:7400/swagger-ui.html
 * @date 2020/10/26
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2Doc
public class SwaggerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SwaggerApplication.class, args);
    }

}
