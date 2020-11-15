package com.helena128.springmvc.controller;

import com.helena128.springmvc.model.TestModel;
import com.helena128.springmvc.service.ApiService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class SpringMvcController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/mvc/test")
    public ResponseEntity<TestModel> getResponse() {
        var response = apiService.getApiResponse();
        log.debug("Response: {}", response);
        return ResponseEntity.ok(response);
    }
}
