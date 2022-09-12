package com.example.springproject.daos;

import com.example.springproject.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#appendix.query.method.predicate
//this should be interface not a class
public interface UserDao extends CrudRepository<User,Integer> {
//    just add custom finder method because it is interface no need to define the method
//    TODO: you should provide proper method name based on its function. refer above document to give method name
//    **********************CUSTOM FINDER METHODS***********************************8
    public List<User> findByName(String name);

    public List<User> findByNameAndCity(String name,String city);

    public List<User> findByNameStartingWith(String prefix);



//    custom query by using JPQl (it is kind of hibernate query)
    @Query("select u from User u") //By using JPQL query
    public List<User> getAllUser();

    @Query("select u from User u where u.name= :n")// dont give the space between : and n
    public List<User> getUserByName(@Param("n") String name);

    @Query("select u from User u where u.name=:n and u.city=:c")
    public List<User> getUserByNameAnAndCity(@Param("n") String name,@Param("c") String city);

    //    custom query by using Native or sql query
    @Query(value="select * from User",nativeQuery = true)
    public List<User> getAll();
}
