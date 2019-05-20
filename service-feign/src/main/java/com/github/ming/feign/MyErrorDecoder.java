package com.github.ming.feign;

import com.github.ming.exception.MyFeignException;
import feign.Response;
import feign.codec.ErrorDecoder;

/**
 * 类作用描述
 *
 * @author zhangming
 * @version 1.0
 * @date 2019/5/17 4:58 PM
 */
public class MyErrorDecoder implements ErrorDecoder{

    @Override
    public Exception decode(String methodKey, Response response) {
        return new MyFeignException(methodKey,response);
    }
}
