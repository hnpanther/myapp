package com.hnp.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {


    @GetMapping("hello")
    public String helloWorld() {
        return "hello world! - edited2";
    }

    @GetMapping("hello2")
    public String helloWorld2() {
        return "hello world! - edited23333";
    }
}
