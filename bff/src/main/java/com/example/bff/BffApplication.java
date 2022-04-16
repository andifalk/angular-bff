package com.example.bff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import redis.embedded.RedisServer;


@SpringBootApplication
public class BffApplication {

    public static void main(String[] args) {
        RedisServer redisServer = new RedisServer(6379);
        redisServer.start();
        SpringApplication.run(BffApplication.class, args);
    }

}
