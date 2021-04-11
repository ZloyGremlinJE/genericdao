package com.example.genericdao.genericdao.dao;

import com.example.genericdao.genericdao.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class _UserDAOImpl extends _AbstractJpaDAO<User> implements _UserDAO {
    public _UserDAOImpl() {
        super();
        setClazz(User.class);
    }
}
