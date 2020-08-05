package com.zking.mapper;

import com.zking.model.Card;

public interface CardMapper {
    int deleteByPrimaryKey(Integer yhCardId);

    int insert(Card record);

    int insertSelective(Card record);

    Card selectByPrimaryKey(Integer yhCardId);

    int updateByPrimaryKeySelective(Card record);

    int updateByPrimaryKey(Card record);
}