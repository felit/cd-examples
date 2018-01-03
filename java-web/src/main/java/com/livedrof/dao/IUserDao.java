package com.livedrof.dao;

import com.livedrof.dto.User;

import java.util.List;

public interface IUserDao {
    User insertUser(User user);

    void deleteUser(Integer userId);

    User updateUser(User user);

    User getUser(Integer userId);

    List<User> getUsers(List<Integer> userIds);

    List<User> getUsers(Integer[] userIds);

}
