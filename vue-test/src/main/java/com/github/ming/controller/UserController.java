package com.github.ming.controller;

import com.github.ming.vo.UserInputVO;
import com.github.ming.vo.UserVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping(value = "/listPage")
    public Map<String,Object> listPage(UserInputVO params){
        List<UserVO> list = new ArrayList<UserVO>();
        UserVO userVO = new UserVO();
        userVO.setAddr("测试地址1");
        userVO.setAge(23);
        userVO.setBirth(new Date());
        userVO.setName("张三");
        userVO.setSex(1);
        list.add(userVO);

        userVO = new UserVO();
        userVO.setAddr("测试地址1");
        userVO.setAge(23);
        userVO.setBirth(new Date());
        userVO.setName("李四");
        userVO.setSex(0);
        list.add(userVO);

        Map<String,Object> map = new HashMap<>();
        map.put("total",2);
        map.put("users",list);
        return map;
    }
}
