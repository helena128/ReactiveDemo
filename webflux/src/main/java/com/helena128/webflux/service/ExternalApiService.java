package com.helena128.webflux.service;

import com.helena128.webflux.model.TestModel;
import reactor.core.publisher.Mono;

public interface ExternalApiService {

    Mono<TestModel> getApiReponse();
}
