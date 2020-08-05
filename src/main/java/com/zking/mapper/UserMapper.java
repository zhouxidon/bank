package com.zking.mapper;

import com.zking.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer yhUserUid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer yhUserUid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}