package com.sunll.springcloud.consumer.service;

import com.sunll.springcloud.consumer.service.hystrixfallback.factory.SchedualServiceHiHystricxFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator
 * on 2017/11/23
 */

@FeignClient(value = "eurekaclient-a",fallbackFactory = SchedualServiceHiHystricxFactory.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}

