package com.example.microservice1.controller;

import com.example.microservice1.interfaces.FeignClientInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class Controller {
    private final FeignClientInterface feignClientInterface;

    @GetMapping("/get")
    public ResponseEntity<String> getMethod(){
        return new ResponseEntity<>(feignClientInterface.getMethod().getBody(), HttpStatus.OK);
    }
}
