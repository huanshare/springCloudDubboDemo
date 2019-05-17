package com.huanshare.dubboConsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.huanshare.dubboBaseInterface.api.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello/")
public class HelloController {
    @Reference
    private HelloService helloService;

    @GetMapping("sayHello")
    public String sayHello() {
        return helloService.sayHello("哈哈");
    }

    @GetMapping("goodbye/{name}")
    public String sayGoodbye(@PathVariable String name){
        return helloService.sayGoodbye(name);
    }
}
