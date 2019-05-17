package com.huanshare.dubboProvider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages ={
        "com.huanshare.dubboBaseInterface",
        "com.huanshare.dubboProvider"} )
@EnableDubboConfiguration
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }

}
