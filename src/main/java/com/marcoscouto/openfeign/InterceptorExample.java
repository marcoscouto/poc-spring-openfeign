package com.marcoscouto.openfeign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

// @Component (configured on application.yml)
public class InterceptorExample implements RequestInterceptor {

    Logger logger = LoggerFactory.getLogger(InterceptorExample.class);
    private Integer counter = 0;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        logger.info("[INTERCEPTOR] passing here {}", counter++);
    }

}
