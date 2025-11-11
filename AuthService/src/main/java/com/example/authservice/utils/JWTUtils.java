package com.example.authservice.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;

@Service
public class JWTUtils {
    private String SECRET_KEY="this-is-secret-key-so-do-not-reveal";
    private SecretKey key;

    @PostConstruct
    public void Init(){
        key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes(StandardCharsets.UTF_8));
    }

    public String generateToken(String userName,int expirationTime){

        return Jwts.builder().subject(userName).issuedAt(new Date()).expiration(new Date(System.currentTimeMillis()+expirationTime*60*1000L)).signWith(key).compact();
    }

    public String extractUserName(String token) {
        return Jwts.parser().verifyWith(key).build().parseSignedClaims(token).getPayload().getSubject();
    }

    public boolean isTokenValid(String token) {
        try {
            Jwts.parser()
                    .verifyWith(key)
                    .build()
                    .parseSignedClaims(token);

            return true;
        } catch (Exception e) {
            return false;

        }
    }
}
