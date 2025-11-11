package com.example.microservice1.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="LEARNING")
public interface FeignClientInterface {
    @GetMapping("/api/v1/learning/api/get")
    ResponseEntity<String> getMethod ();
}
