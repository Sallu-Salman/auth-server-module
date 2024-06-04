package com.sallu.repository;

import com.sallu.entity.OauthToken;
import com.sallu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Repository
public interface OauthTokenRepository extends JpaRepository<OauthToken, String> {
    OauthToken findByRefreshToken(String refreshToken);

    void deleteByUser(User user);
//    @Transactional
//    @Modifying
//    @Query("DELETE FROM OauthToken t WHERE t.expirationTime < ?1")
//    void deleteExpiredTokens(LocalDateTime currentTime);
}
