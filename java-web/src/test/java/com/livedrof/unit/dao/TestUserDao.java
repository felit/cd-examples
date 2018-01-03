package com.livedrof.unit.dao;

import com.livedrof.unit.dao.impl.UserDao;
import com.livedrof.dto.User;
import org.junit.Assert;
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
        Assert.assertEquals(1, user.getUserId());
        Assert.assertNotNull(user.getUsername());
        Assert.assertNotNull(user.getNickname());
        Assert.assertNotEquals(user.getAge(), 0);
    }
}
