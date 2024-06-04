package com.sallu.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class OauthToken {
    @Id
    private String accessToken;

    private String refreshToken;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDateTime expirationTime;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(LocalDateTime expirationTime) {
        this.expirationTime = expirationTime;
    }
}
