package com.example.resource.api;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ApiRestController {

    @GetMapping("get-message")
    public Mono<String> getMessage(@AuthenticationPrincipal Jwt jwt) {
        return Mono.just("Hello to [" + jwt.getSubject() + "] from Resource Server");
    }

    @PostMapping("post-message")
    public Mono<String> postMessage(@RequestBody Message message, @AuthenticationPrincipal Jwt jwt) {
        return Mono.just(message.getMsg() + " to [" + jwt.getSubject() + "] from Resource Server");
    }
}
