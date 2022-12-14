package com.example.cloducommands1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudController {

    @Value("${WEBSITE_INSTANCE_ID:default}")
    private String instanceId;


    @Value("${WEBSITE_HOSTNAME:somehosr}")
    private String host;

    @GetMapping("/")
    public String getHello(){
        return "hello world Current Prod" + instanceId + host;
    }
}
