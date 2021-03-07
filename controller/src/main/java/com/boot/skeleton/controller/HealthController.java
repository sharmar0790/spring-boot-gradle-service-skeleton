package com.boot.skeleton.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.boot.skeleton.constants.ApplicationConstants.API_EP;
import static com.boot.skeleton.constants.ApplicationConstants.HEALTH_EP;

@RestController
@RequestMapping(API_EP)
public class HealthController {

    @GetMapping(HEALTH_EP)
    public String checkHealthStatus() {
        return "{\"controller" + " :" + "UP\"}";
    }
}
