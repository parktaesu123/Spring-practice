package com.example.demo.domain.auth.domain;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;
import org.springframework.data.redis.core.index.Indexed;

@RedisHash
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)

public class RefreshToken {
    @Id
    private String id;

    @Indexed
    private String accountId;

    @Indexed
    private String token;

    @TimeToLive
    private Long timeToLive;
}
