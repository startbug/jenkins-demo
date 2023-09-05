package com.ggs.fisrt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author starbug
 * @Description
 * @Datetime 2023/9/5 16:26
 */
@RestController
@RequestMapping("/second")
public class SecondController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/getPort")
    public String getPort() {
        return "项目端口号2222:" + port;
    }

}
