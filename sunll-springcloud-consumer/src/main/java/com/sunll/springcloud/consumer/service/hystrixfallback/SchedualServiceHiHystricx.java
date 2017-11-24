package com.sunll.springcloud.consumer.service.hystrixfallback;

import com.sunll.springcloud.consumer.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator
 * on 2017/11/24
 */
@Component
public class SchedualServiceHiHystricx implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }

}
