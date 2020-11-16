package com.helena128.webflux.service;

import com.helena128.webflux.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ExternalApiServiceImpl implements ExternalApiService {

    @Autowired
    private WebClient webClient;

    @Override
    public Mono<TestModel> getApiReponse() {
        return webClient.get()
                .uri("/external/")
                .retrieve()
                .bodyToMono(TestModel.class);
    }
}
