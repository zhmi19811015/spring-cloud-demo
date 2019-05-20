package com.github.ming.service;

import com.github.ming.config.FeignFallBackConfig;
import com.github.ming.servicecommon.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FeignClient（“服务名”），来指定调用哪个服务。比如在代码中调用了service-hi服务的“/hi”接口
 *
 * @author zhangming
 * @version 1.0
 * @date 2019/5/17 5:26 PM
 */
//@FeignClient(name = "service-a", configuration = FeignFallBackConfig.class,fallback = FeignServerAImpl.class)
@FeignClient(name = "service-a", configuration = FeignFallBackConfig.class,fallbackFactory = ServerAFallBackFactory.class)
public interface FeignServerA {
    @RequestMapping(value = "/test/hi",method = RequestMethod.GET)
    String getHi(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/test/user",method = RequestMethod.GET)
    User getUser(@RequestParam(value = "id") String id);
}
