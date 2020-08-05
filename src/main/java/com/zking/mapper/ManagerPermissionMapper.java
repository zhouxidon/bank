package com.zking.mapper;

import com.zking.model.ManagerPermission;

public interface ManagerPermissionMapper {
    int deleteByPrimaryKey(Integer yhManagerPermissionId);

    int insert(ManagerPermission record);

    int insertSelective(ManagerPermission record);

    ManagerPermission selectByPrimaryKey(Integer yhManagerPermissionId);

    int updateByPrimaryKeySelective(ManagerPermission record);

    int updateByPrimaryKey(ManagerPermission record);
}