package com.example.springproject.daos;

import com.example.springproject.models.User;
import org.springframework.data.repository.CrudRepository;
//this should be interface not a class
public interface UserRepository extends CrudRepository<User,Integer> {
}
