package com.example.genericdao.genericdao.service;

import com.example.genericdao.genericdao.dao.GenericDao;
import com.example.genericdao.genericdao.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class UserServiceImpl implements UserService{

   public GenericDao<User> dao;

    @Autowired
    public void setDao(GenericDao<User> daoToSet) {
        dao = daoToSet;
        dao.setClazz(User.class);
    }
@Override
public User retrieveByName(String name) {
    return null;
}

}
