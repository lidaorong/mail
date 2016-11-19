package com.daorong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rong on 2016/11/19.
 */
@RestController
@SpringBootApplication
public class MailApplication {

    @RequestMapping(value = "/")
    String home(){
        return "东京食种";
    }

    public static void main(String arg[]){
        SpringApplication.run(MailApplication.class,arg);
    }
}
