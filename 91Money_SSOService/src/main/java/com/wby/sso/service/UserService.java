package com.wby.sso.service;

import com.wby.core.vo.R;
import com.wby.domain.user.User;

import java.util.List;

public interface UserService {
    R save(User user);

    List<User> queryAll();

    User queryByName(String name);
}
