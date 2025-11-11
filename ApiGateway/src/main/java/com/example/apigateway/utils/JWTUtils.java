package com.example.apigateway.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;

/**
 * Utils class to validate the token with secret key
 * @author nambisv
 * @since 11 Nov 2025
 */
@Component
public class JWTUtils {
    private String SECRET_KEY="this-is-secret-key-so-do-not-reveal";
    private SecretKey key;

    @PostConstruct
    public void Init(){
        key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes(StandardCharsets.UTF_8));
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
