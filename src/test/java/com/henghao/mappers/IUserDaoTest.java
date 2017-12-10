package com.henghao.mappers;

import com.henghao.BaseTestCase;
import com.henghao.domain.entity.user.UserPOJO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class IUserDaoTest extends BaseTestCase {

    @Autowired
    private IUserDao userDao;

    @Test
    public void selectByPrimaryKey() throws Exception {
        UserPOJO user = userDao.selectByPrimaryKey("HZ8bb0c95caaecd4015caf6b39ad3243");
        System.out.println(user);
    }



}