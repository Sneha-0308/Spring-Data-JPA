package com.example.springproject;

import com.example.springproject.daos.UserRepository;
import com.example.springproject.models.User;
import org.hibernate.dialect.MySQL55Dialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringprojectApplication {

    public static void main(String[] args) {
       ApplicationContext context= SpringApplication.run(SpringprojectApplication.class, args);
        UserRepository userRepository=context.getBean(UserRepository.class);
//        User user=new User();
//        user.setName("Sneha");
//        user.setCity("Hubli");
//        user.setStatus("Spring JPA Project");
//       User user1= userRepository.save(user);
//        System.out.println(user1);
//        *****************************CRUD OPERATION************************************
//        1]SAVING SINGLE ENTITY
//        User user1=new User("Sneha","city1","Java programmer");
//        User user2=new User("user2","city2","C programmer");
//        User result1=userRepository.save(user1);
//        System.out.println("User details are saved as"+result1);
//        System.out.println("Done!!");



//        2]SAVING LIST OF ENTITIES
//        User user1=new User("user1","city1","Java programmer");
//        User user2=new User("user2","city2","C programmer");
//        ArrayList<User> list=new ArrayList<>();
//        list.add(user1);
//        list.add(user2);
//        Iterable<User> result=userRepository.saveAll(list);
//        System.out.println("DONE");
//        System.out.println(result);

//        3]DELETE ALL ENTITY
//        userRepository.deleteAll();

//        4]UPDATE THE ENTITY
//        Optional<User> optional=userRepository.findById(8);
//        User user=optional.get();
//        user.setName("name8");
//        user.setCity("city8");
//        user.setStatus("html programmer");
//        userRepository.save(user);
//        System.out.println("Done");

//        5]GET ALL LIST OF ENTITY
//        Iterable<User> list=userRepository.findAll();
//        System.out.println(list);

//        6]DELETE SINGLE ENTITY
//        userRepository.deleteById(11);
        List<User> users=userRepository.findByName("name8"); //findByName() is custom finder method
        System.out.println(users);


        List<User> userList=userRepository.findByNameAndCity("user1","city1");
        System.out.println(userList);

        List<User> userList1=userRepository.findByNameStartingWith("user");
        System.out.println(userList1);
    }

}

