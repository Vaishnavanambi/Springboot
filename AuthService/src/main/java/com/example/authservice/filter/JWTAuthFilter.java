package com.example.authservice.filter;

import com.example.authservice.utils.JWTUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class JWTAuthFilter extends OncePerRequestFilter {
    private final AuthenticationManager authenticationManager;
    private final JWTUtils jwtUtils;

    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull FilterChain filterChain) throws ServletException, IOException {
        try{
            if(!request.getRequestURI().endsWith("/login")){
                filterChain.doFilter(request,response);
                return;
            }
            String userName = request.getParameter("username");
            String password = request.getParameter("password");
            UsernamePasswordAuthenticationToken userDetail = new UsernamePasswordAuthenticationToken(userName,password);
            Authentication authentication = authenticationManager.authenticate(userDetail);
            if(authentication.isAuthenticated()){
                String token = jwtUtils.generateToken(userName,30);
                Map<String,String> map = new HashMap<>();
                map.put("Authorization", token);
                response.getWriter().write(new ObjectMapper().writeValueAsString(map));
            }

        }catch (Exception ex){

        }
    }
}
