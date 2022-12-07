package cn.gov.zcy.a;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@EnableDubbo
@SpringBootApplication
public class ProviderSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderSpringbootApplication.class,args);
    }

}
