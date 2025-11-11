package com.example.authservice.filter;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class JWTAuthenticationToken extends AbstractAuthenticationToken {
    private String token;
    public JWTAuthenticationToken(String jwt) {
        super(null);
        token=jwt;
        super.setAuthenticated(false);
    }

    @Override
    public String getCredentials() {
        return this.token;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }
}
