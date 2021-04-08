package com.example.genericdao.genericdao.dao;

import com.example.genericdao.genericdao.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl extends AbstractJpaDAO<User> implements UserDAO {
    public UserDAOImpl() {
        super();
        setClazz(User.class);
    }
}
