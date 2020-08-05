package com.zking.mapper;

import com.zking.model.Permission;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer yhPermissionId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer yhPermissionId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}