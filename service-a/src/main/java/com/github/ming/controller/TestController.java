package com.github.ming.controller;

import com.github.ming.servicecommon.pojo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 类作用描述
 *
 * @author zhangming
 * @version 1.0
 * @date 2019/5/17 2:08 PM
 */
@RestController
@RequestMapping("test")
public class TestController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,我的端口:"+port;
    }

    @RequestMapping("/user")
    public User getUser(String id){
        User user = new User();
        user.setBirthday(new Date());
        user.setId("2");
        user.setSex(1);
        user.setUserName("章明");
        return user;
    }
}
