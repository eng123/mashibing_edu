package com.feng.yu.springboot.dao;

import com.feng.yu.springboot.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * description:
 * Create by fyu on 2020/11/15 19:17
 */
@Repository
public class UserDao {
    public List<User> findAll() {
        Map<Integer,User> map = new HashMap<>();
        map.put(1,new User("zhangsan",25));
        map.put(2,new User("ahua",22));
        return new ArrayList<User>(map.values());
    }
}
