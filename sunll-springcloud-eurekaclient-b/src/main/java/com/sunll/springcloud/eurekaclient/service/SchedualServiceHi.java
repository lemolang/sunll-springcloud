package com.sunll.springcloud.eurekaclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator
 * on 2017/11/23
 */
@RestController
public class SchedualServiceHi {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

}
