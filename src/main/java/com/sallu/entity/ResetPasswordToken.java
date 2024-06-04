package com.sallu.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class ResetPasswordToken {
    @Id
    private String token;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private LocalDateTime expirationTime;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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
