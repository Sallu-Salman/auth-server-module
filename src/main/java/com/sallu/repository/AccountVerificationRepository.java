package com.sallu.repository;

import com.sallu.entity.AccountVerification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountVerificationRepository extends JpaRepository<AccountVerification, String> {
}
