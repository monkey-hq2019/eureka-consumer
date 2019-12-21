package com.example.eurekaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    //引用RestTemplate
    @Autowired
    RestTemplate template;

    @RequestMapping("/callSayHello")
    public String callSayHello(){
        return template.getForObject("http://eureka-client-service/eureka-client/sayHello",String.class);
    }
}
