package com.example.genericdao.genericdao.service;

import com.example.genericdao.genericdao.dao.UserDAO;
import com.example.genericdao.genericdao.model.User;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl extends AbstractEntityServiceImpl<User>  implements UserService {

    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        super(userDAO);
        this.userDAO = userDAO;
    }
}
