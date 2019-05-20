package com.github.ming.servicecommon.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 类作用描述
 *
 * @author zhangming
 * @version 1.0
 * @date 2019/5/17 3:36 PM
 */
@Data
public class User {
    private String id;
    private String userName;
    private Integer sex;
    private Date birthday;
}
