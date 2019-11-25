package com.itheime.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JinLu
 * @date 2019/11/25 08:58
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello,spring boot";
    }
}
