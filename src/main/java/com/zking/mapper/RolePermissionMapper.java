package com.zking.mapper;

import com.zking.model.RolePermission;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(Integer yhRolePermissionId);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    RolePermission selectByPrimaryKey(Integer yhRolePermissionId);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}