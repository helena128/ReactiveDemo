package com.helena128.springmvc.service;

import com.helena128.springmvc.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static java.util.Optional.ofNullable;

@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${external.api.url}")
    private String apiUrl;

    @Override
    public TestModel getApiResponse() {
        return ofNullable(restTemplate.getForEntity(apiUrl, TestModel.class))
                .map(ResponseEntity::getBody)
                .orElse(null);
    }
}
