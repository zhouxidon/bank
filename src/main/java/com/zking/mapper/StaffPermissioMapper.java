package com.zking.mapper;

import com.zking.model.StaffPermissio;

public interface StaffPermissioMapper {
    int deleteByPrimaryKey(Integer yhStaffPermissioId);

    int insert(StaffPermissio record);

    int insertSelective(StaffPermissio record);

    StaffPermissio selectByPrimaryKey(Integer yhStaffPermissioId);

    int updateByPrimaryKeySelective(StaffPermissio record);

    int updateByPrimaryKey(StaffPermissio record);
}