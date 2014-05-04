package com.xhyan.base.dao;

import com.xhyan.base.model.User;

/**
 * Created by xhyan on 14-5-4.
 */
public interface UserDao
{
    /**
     * 添加新用户
     * @param user
     * @return
     */
    public int insertUser(User user);
}
