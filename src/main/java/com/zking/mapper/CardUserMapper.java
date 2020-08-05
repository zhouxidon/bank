package com.zking.mapper;

import com.zking.model.CardUser;

public interface CardUserMapper {
    int deleteByPrimaryKey(Integer yhCardUserId);

    int insert(CardUser record);

    int insertSelective(CardUser record);

    CardUser selectByPrimaryKey(Integer yhCardUserId);

    int updateByPrimaryKeySelective(CardUser record);

    int updateByPrimaryKey(CardUser record);
}