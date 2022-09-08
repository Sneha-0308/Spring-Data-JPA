package com.example.springproject.daos;

import com.example.springproject.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#appendix.query.method.predicate
//this should be interface not a class
public interface UserRepository extends CrudRepository<User,Integer> {
//    just add custom finder method because it is interface no need to define the method
//    TODO: you should provide proper method name based on its function. refer above document to give method name
//    **********************CUSTOM FINDER METHODS***********************************8
    public List<User> findByName(String name);

    public List<User> findByNameAndCity(String name,String city);

    public List<User> findByNameStartingWith(String prefix);
}
