package com.zking.service.impl;

import com.zking.mapper.UserMapper;
import com.zking.model.User;
import com.zking.service.IUserMapperService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserMapperServiceImpl implements IUserMapperService {
    private UserMapper um;
    @Override
    public int deleteByPrimaryKey(Integer yhUserUid) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Integer yhUserUid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }

    @Override
    public List<User> alluser() {
        return um.alluser();
    }
}
