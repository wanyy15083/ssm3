package com.xhyan.base.service;

import com.xhyan.base.dao.UserDao;
import com.xhyan.base.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xhyan on 14-5-4.
 */
@Service
public class UserServiceImpl implements UserService
{
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(User user)
    {
        return userDao.insertUser(user);
    }
}
