package com.example.apigateway.filter;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Component
public class RouteValidator {

    public static final List<String> noAuthEndPoints = Arrays.asList("/auth/register", "/auth/login","/eureka");
    public Predicate<ServerHttpRequest> isSecured = req -> noAuthEndPoints.stream().noneMatch(endPoint -> req.getURI().getPath().endsWith(endPoint));
}
