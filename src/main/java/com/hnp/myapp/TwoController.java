package com.hnp.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoController {


    @GetMapping("bye")
    public String methd() {
        return "bye!!!!!";
    }
}
