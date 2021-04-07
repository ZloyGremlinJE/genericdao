package com.example.genericdao.genericdao.dao;

import com.example.genericdao.genericdao.model.User;

import java.util.List;

public interface UserDAO {
    User findOne(long id);

    List<User> findAll();

    void create(User entity);

    User update(User entity);

    void delete(User entity);

    void deleteById(long entityId);
}
