package com.example.genericdao.genericdao.service;

import com.example.genericdao.genericdao.dao.UserRepository;
import com.example.genericdao.genericdao.model.User;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl extends AbstractEntityServiceImpl<User>  implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }
}
