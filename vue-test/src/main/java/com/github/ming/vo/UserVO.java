package com.github.ming.vo;

import lombok.Data;

import java.util.Date;

@Data
public class UserVO {
    private String name;
    private int sex;
    private int age;
    private Date birth;
    private String addr;
}
