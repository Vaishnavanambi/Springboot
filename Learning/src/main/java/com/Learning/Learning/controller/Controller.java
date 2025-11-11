package com.Learning.Learning.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("/get")
    public ResponseEntity<String> getMethod () {
        return new ResponseEntity<>("GET in Learning", HttpStatus.OK);
    }
}
