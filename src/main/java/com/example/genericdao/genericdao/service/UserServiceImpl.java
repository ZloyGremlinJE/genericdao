package com.example.genericdao.genericdao.service;

import com.example.genericdao.genericdao.dao.UserDAO;
import com.example.genericdao.genericdao.dao._UserDAO;
import com.example.genericdao.genericdao.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User findOne(long id) {
        return userDAO.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public void create(User entity) {
        userDAO.save(entity);
    }

    @Override
    public User update(User entity) {
        return userDAO.update(entity);
    }

    @Override
    public void deleteById(long entityId) {
        userDAO.removeById(entityId);
    }
}
