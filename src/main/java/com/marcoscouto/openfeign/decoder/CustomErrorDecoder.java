package com.marcoscouto.openfeign.decoder;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomErrorDecoder implements ErrorDecoder {

    Logger logger = LoggerFactory.getLogger(CustomErrorDecoder.class);

    @Override
    public Exception decode(String s, Response response) {
        logger.warn("[ERROR DECODER] decode http error {}", response.status());
        return new RuntimeException(response.reason());
    }

}
