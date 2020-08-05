package com.zking.mapper;

import com.zking.model.Stafftype;

public interface StafftypeMapper {
    int deleteByPrimaryKey(Integer yhStafftypeId);

    int insert(Stafftype record);

    int insertSelective(Stafftype record);

    Stafftype selectByPrimaryKey(Integer yhStafftypeId);

    int updateByPrimaryKeySelective(Stafftype record);

    int updateByPrimaryKey(Stafftype record);
}