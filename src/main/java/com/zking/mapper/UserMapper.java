package com.zking.mapper;

import com.zking.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer yhUserUid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer yhUserUid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> alluser();
}