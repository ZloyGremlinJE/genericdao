package com.example.genericdao.genericdao.service;

import com.example.genericdao.genericdao.model.User;

import java.util.List;

public interface UserService {
    User findOne(long id);

    List<User> findAll();

    void create(User entity);

    User update(User entity);

    void deleteById(long entityId);
}
