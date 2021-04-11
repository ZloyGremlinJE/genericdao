package com.example.genericdao.genericdao.dao;

import com.example.genericdao.genericdao.model.User;
import com.example.genericdao.genericdao.model.organization.AbstractOrganization;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl extends AbstractEntityDAOImpl<User> implements UserDAO {
    public UserDAOImpl() {
        super();
        setClazz(User.class);
    }
}
