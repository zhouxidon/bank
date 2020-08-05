package com.zking.mapper;

import com.zking.model.Manager;

public interface ManagerMapper {
    int deleteByPrimaryKey(Integer yhManagerId);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(Integer yhManagerId);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}