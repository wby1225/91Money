package com.wby.sso.provider;


import com.wby.core.utils.ExecuteUtils;
import com.wby.core.vo.R;
import com.wby.domain.user.User;
import com.wby.mapper.user.UserMapper;
import com.wby.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProvider implements UserService {
    @Autowired
    UserMapper mapper;

    @Override
    public R save(User user) {
        return ExecuteUtils.getR(mapper.insert(user),"新增用户");
    }

    @Override
    public List<User> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public User queryByName(String name) {
        return mapper.queryByName(name);
    }
}
