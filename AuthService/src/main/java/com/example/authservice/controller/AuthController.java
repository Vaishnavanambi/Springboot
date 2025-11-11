package com.example.authservice.controller;

import com.example.authservice.services.AuthService;
import com.example.authservice.transferobject.UserDetail;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@Valid @RequestBody UserDetail userDetail) {
        try {
            authService.saveUser(userDetail);
            return new ResponseEntity<>("User Details saved successfully", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/get")
    public ResponseEntity<String> get(){
        return new ResponseEntity<>("Get",HttpStatus.OK);
    }
}
