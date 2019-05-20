package com.github.ming.exception;


import feign.Response;

/**
 * FeignException处理
 *
 * @author zhangming
 * @version 1.0
 * @date 2019/5/17 5:00 PM
 */
public class MyFeignException extends RuntimeException{
    private final String methodKey;
    private Response response;


    public MyFeignException(String methodKey, Response response) {
        this.methodKey = methodKey;
        this.response = response;
    }


    public Response getResponse() {
        return response;
    }

    public String getMethodKey() {
        return methodKey;
    }
}
