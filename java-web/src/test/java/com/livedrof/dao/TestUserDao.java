package com.livedrof.dao;

import com.livedrof.dao.impl.UserDao;
import com.livedrof.dto.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-application.xml"})
public class TestUserDao {

    @Autowired
    UserDao userDao;

    @Test
    public void testGetUser() throws Exception {
        User user = userDao.getUser(1);
        System.out.println(user);
    }
}
