package com.exquisApp.dataingester.handler;

import com.exquisApp.dataingester.models.SecurityReview;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class EventHandler {

    Logger logger = LoggerFactory.getLogger(EventHandler.class);

    @Bean
    public Function<SecurityReview, SecurityReview> processor() {
        return securityReview -> {
            // This is supposed to pick csv file in S3 and map to SecurityReview before sending to security-review-destination
            logger.info(" Receive event of type [{}], event [{}] ", SecurityReview.class, securityReview);
            return securityReview;
        };
    }


}
