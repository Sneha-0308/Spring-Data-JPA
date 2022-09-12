package com.example.springproject.Service;

import com.example.springproject.daos.UserDao;
import com.example.springproject.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public Iterable<User> getAll(){
        return userDao.findAll();
    }
}
