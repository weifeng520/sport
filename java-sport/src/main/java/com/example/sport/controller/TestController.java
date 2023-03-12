package com.example.sport.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * test.
 *
 * @author wei
 * @date 2023/3/12 19:04
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String sayHello() {
        return "Hello World!!!";
    }
}
