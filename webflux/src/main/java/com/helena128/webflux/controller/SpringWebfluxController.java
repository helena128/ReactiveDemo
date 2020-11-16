package com.helena128.webflux.controller;

import com.helena128.webflux.model.TestModel;
import com.helena128.webflux.service.ExternalApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class SpringWebfluxController {

    @Autowired
    private ExternalApiService apiService;

    @GetMapping("/reactive/test")
    public Mono<TestModel> getApiResponse() {
        return apiService.getApiReponse();
    }
}
