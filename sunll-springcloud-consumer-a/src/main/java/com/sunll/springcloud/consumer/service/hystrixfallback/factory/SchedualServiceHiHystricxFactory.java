package com.sunll.springcloud.consumer.service.hystrixfallback.factory;


import com.sunll.springcloud.consumer.service.SchedualServiceHi;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator
 * on 2017/11/24
 */
@Component
public class SchedualServiceHiHystricxFactory implements FallbackFactory<SchedualServiceHi> {

    private static final Logger LOGGER = LoggerFactory.getLogger(SchedualServiceHiHystricxFactory.class);

    @Override
    public SchedualServiceHi create(Throwable throwable) {
        return new SchedualServiceHi() {
            @Override
            public String sayHiFromClientOne(String name) {
                //日志最好放在各个fallback方法中，而不是直接房子create方法中。
                //否则在引用启动的时候，就会打印该日志
                SchedualServiceHiHystricxFactory.LOGGER.info("fallback;reason was:", throwable);
                return "sorry "+name;
            }
        };
    }
}
