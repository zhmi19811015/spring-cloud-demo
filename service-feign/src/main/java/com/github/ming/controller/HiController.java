package com.github.ming.controller;

import com.github.ming.service.FeignServerA;
import com.github.ming.servicecommon.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    FeignServerA feignServerA;

    @GetMapping(value = "/a/hi")
    public String getHi(@RequestParam String name) {
        return feignServerA.getHi( name );
    }

    @GetMapping(value = "/a/user")
    public User getUser(@RequestParam String id){
        return feignServerA.getUser(id);
    }
}
