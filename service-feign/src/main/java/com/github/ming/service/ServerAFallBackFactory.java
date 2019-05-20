package com.github.ming.service;

import com.github.ming.service.impl.FeignServerAImpl;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 类作用描述
 *
 * @author zhangming
 * @version 1.0
 * @date 2019/5/17 5:29 PM
 */
@Component
public class ServerAFallBackFactory implements FallbackFactory<FeignServerA> {

    private final FeignServerAImpl feignServerA;

    public ServerAFallBackFactory(FeignServerAImpl feignServerA){
        this.feignServerA = feignServerA;
    }

    @Override
    public FeignServerA create(Throwable throwable) {
        throwable.printStackTrace();
        return feignServerA;
    }

}
