package com.example.genericdao.genericdao.service;

import com.example.genericdao.genericdao.dao.UserDAO;
import com.example.genericdao.genericdao.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    UserDAO dao;


    @Override
    public User findOne(long id) {
        return dao.findOne(id);
    }

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }

    @Override
    public void create(User entity) {
          dao.create(entity);
    }

    @Override
    public User update(User entity) {
        return dao.update(entity);
    }

    @Override
    public void delete(User entity) {
         dao.delete(entity);
    }

    @Override
    public void deleteById(long entityId) {
          dao.deleteById(entityId);
    }
}
