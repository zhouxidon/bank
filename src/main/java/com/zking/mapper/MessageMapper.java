package com.zking.mapper;

import com.zking.model.Message;

public interface MessageMapper {
    int deleteByPrimaryKey(Integer yhMessageId);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer yhMessageId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}