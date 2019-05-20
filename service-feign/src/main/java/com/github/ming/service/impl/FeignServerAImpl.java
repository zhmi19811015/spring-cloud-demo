package com.github.ming.service.impl;

import com.github.ming.service.FeignServerA;
import com.github.ming.servicecommon.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 类作用描述
 *
 * @author zhangming
 * @version 1.0
 * @date 2019/5/17 5:30 PM
 */
@Slf4j
@Component
public class FeignServerAImpl implements FeignServerA{
    @Override
    public String getHi(String name) {
        log.error("sayHiFromClientOne:"+name);
        return "sorry "+name;
    }

    @Override
    public User getUser(String id) {
        log.error("getUser:"+id);
        User user = new User();
        user.setId("0");
        return user;
    }
}
