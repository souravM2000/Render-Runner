package com.desicart.AppRunner;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

public class service {

    @Scheduled(fixedDelay = 1000*60*5)
    void renderRunner() {
        RestTemplate restTemplate= new RestTemplate();
        restTemplate.getForEntity("https://ecommerce-backend-dev.onrender.com/user/api/auth/index",String.class);
        restTemplate.getForEntity("https://renderrunner123.onrender.com/index",String.class);
        restTemplate.getForEntity("https://desicart-gateway.onrender.com/actuator/info",String.class);
        restTemplate.getForEntity("https://desicart-gateway.onrender.com/actuator/info",String.class);
    }
}
