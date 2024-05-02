package com.example.texiwithme.global.security.jwt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@AllArgsConstructor
@ConfigurationProperties(prefix = "jwt")
public class JwtProperties {

    private final String prefix;
    private final String header;
    private final String secret;
    private final Long accessExpiration;
    private final Long refreshExpiration;
}