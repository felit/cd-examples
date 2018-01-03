package com.livedrof.unit.dao.impl;

import com.livedrof.unit.dao.IUserDao;
import com.livedrof.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao implements IUserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User insertUser(User user) {
        return null;
    }

    public void deleteUser(Integer userId) {

    }

    public User updateUser(User user) {
        return null;
    }

    public User getUser(Integer userId) {
        User user = new User();
        user.setUserId(1);
        user.setUsername("username");
        user.setNickname("nickname");
        user.setAge(33);
        return user;
    }

    public List<User> getUsers(List<Integer> userIds) {
        return null;
    }

    public List<User> getUsers(Integer[] userIds) {
        return null;
    }
}

