package com.zking.mapper;

import com.zking.model.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer yhRoleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer yhRoleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}