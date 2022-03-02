package com.marcoscouto.openfeign.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// @Component (configured on application.yml)
public class CustomInterceptor implements RequestInterceptor {

    Logger logger = LoggerFactory.getLogger(CustomInterceptor.class);

    @Override
    public void apply(RequestTemplate requestTemplate) {
        logger.info("[INTERCEPTOR] passing here");
    }

}
