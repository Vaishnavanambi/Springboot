package com.example.authservice.filter;

import com.example.authservice.dao.UserCredentialDAO;
import com.example.authservice.utils.JWTUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

@RequiredArgsConstructor
public class JWTAuthenticationProvider implements AuthenticationProvider {
    private final UserCredentialDAO userCredentialDAO;
    private final JWTUtils jwtUtils;
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String token = ((JWTAuthenticationToken)authentication).getCredentials();
        if(!jwtUtils.isTokenValid(token)){
            throw new BadCredentialsException("Invalid token");
        }
        String userName = jwtUtils.extractUserName(token);
        UserDetails userDetails = userCredentialDAO.findByUserName(userName).get();
        return new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return JWTAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
