package com.example.springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringprojectApplication.class, args);





//        ******************************TESTING PURPOSE***************************
//       ApplicationContext context= SpringApplication.run(SpringprojectApplication.class, args);
//        UserDao userRepository=context.getBean(UserDao.class);
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

//        ******************************CUSTOM QUERY***************************
//        List<User> users=userRepository.findByName("name8"); //findByName() is custom finder method
//        System.out.println(users);
//
//
//        List<User> userList=userRepository.findByNameAndCity("user1","city1");
//        System.out.println(userList);
//
//        List<User> userList1=userRepository.findByNameStartingWith("user");
//        System.out.println(userList1);





//        ***************************CUSTOM QUERY USING @Query ANNOTATION AND USING JPQL OR NATIVE QUERY
//        List<User> userList=userRepository.getAllUser();
//        System.out.println(userList);

//        List<User> list=userRepository.getUserByName("user2");
//        System.out.println(list);

//          List<User> list=userRepository.getUserByNameAnAndCity("user2","city2");
//          System.out.println(list);

//        USING SQL QUERY
//        List<User> list=userRepository.getAll();
//        System.out.println(list);

    }

}

