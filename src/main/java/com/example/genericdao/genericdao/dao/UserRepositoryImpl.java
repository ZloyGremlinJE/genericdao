package com.example.genericdao.genericdao.dao;

import com.example.genericdao.genericdao.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl extends AbstractEntityRepositoryImpl<User> implements UserRepository {

}
