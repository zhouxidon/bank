package com.zking.mapper;

import com.zking.model.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer yhUserRoleId);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer yhUserRoleId);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}