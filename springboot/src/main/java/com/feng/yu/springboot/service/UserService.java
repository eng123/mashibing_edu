package com.feng.yu.springboot.service;

import com.feng.yu.springboot.dao.UserRepostory;
import com.feng.yu.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

/**
 * description:
 * Create by fyu on 2020/11/15 19:14
 */
@Service
public class UserService {

    @Autowired
    //UserDao userDao;
    UserRepostory userRepo;
    
    public List findAll() {
        //return userDao.findAll();
        return userRepo.findAll();
    }

    public Optional<User> selectById(Integer id) {
        return userRepo.findById(id);
    }

    public void add() {
        //User user = new User(3,"yufeng",32);
        int random = new Random().nextInt(100);
        User user = new User("yufeng",random);
        userRepo.save(user);
    }

    public void delet(int random) {
        userRepo.deleteById(random);
    }

    public void deletAll() {
        userRepo.deleteAll();
    }
}
