package com.huanshare.dubboProvider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.huanshare.dubboBaseInterface.api.HelloService;
import org.springframework.stereotype.Component;

@Service(interfaceClass = HelloService.class)
@Component
public class DefaultHelloService implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello "+name+" !";
    }

    @Override
    public String sayGoodbye(String name) {
        return "Goodbye "+name+" !";
    }
}
