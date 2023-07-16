package com.charan.SpringApp.repository;

import com.charan.SpringApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
