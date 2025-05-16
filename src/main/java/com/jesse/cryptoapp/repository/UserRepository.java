package com.jesse.cryptoapp.repository;

import com.jesse.cryptoapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
