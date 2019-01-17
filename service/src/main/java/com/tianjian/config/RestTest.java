package com.tianjian.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tianjian on 2019/1/18.
 */
@RestController
@RequestMapping("/api")
public class RestTest {

    @GetMapping("/test")
    public String getInof() {
        return "haha";
    }
}
