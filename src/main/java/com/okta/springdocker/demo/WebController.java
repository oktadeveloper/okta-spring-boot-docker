package com.okta.springdocker.demo;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @RequestMapping("/")
    public String home(@AuthenticationPrincipal JwtAuthenticationToken jwtAuthenticationToken) {
        return "Welcome " + jwtAuthenticationToken.getName() + "!";
    }

    @RequestMapping("/info")
    public String info(@AuthenticationPrincipal JwtAuthenticationToken jwtAuthenticationToken) {
        return jwtAuthenticationToken.toString();
    }

}
