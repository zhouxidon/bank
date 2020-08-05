package com.zking.mapper;

import com.zking.model.Staff;

public interface StaffMapper {
    int deleteByPrimaryKey(Integer yhStaffId);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Integer yhStaffId);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}