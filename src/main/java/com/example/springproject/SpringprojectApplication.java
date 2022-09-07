package com.example.springproject;

import com.example.springproject.daos.UserRepository;
import com.example.springproject.models.User;
import org.hibernate.dialect.MySQL55Dialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringprojectApplication {

    public static void main(String[] args) {
       ApplicationContext context= SpringApplication.run(SpringprojectApplication.class, args);
        UserRepository userRepository=context.getBean(UserRepository.class);
        User user=new User();
        user.setName("Sneha");
        user.setCity("Hubli");
        user.setStatus("Spring JPA Project");
       User user1= userRepository.save(user);
        System.out.println(user1);
    }

}

