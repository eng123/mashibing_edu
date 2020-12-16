package com.feng.yu.springboot.dao;


import com.feng.yu.springboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * description:
 * Create by fyu on 2020/11/19 21:38
 */
public interface UserRepostory extends JpaRepository<User,Integer> {
    
}
