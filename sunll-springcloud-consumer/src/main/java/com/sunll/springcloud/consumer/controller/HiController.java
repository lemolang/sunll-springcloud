package com.sunll.springcloud.consumer.controller;

import com.sunll.springcloud.consumer.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator
 * on 2017/11/23
 */
@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        System.out.println(name);
        return schedualServiceHi.sayHiFromClientOne(name);
    }

}
