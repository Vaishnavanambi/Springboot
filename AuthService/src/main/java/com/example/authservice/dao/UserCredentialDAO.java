package com.example.authservice.dao;

import com.example.authservice.po.UserCredentialPO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserCredentialDAO extends JpaRepository<UserCredentialPO, Long> {
    Optional<UserCredentialPO> findByUserName(String username);
}
