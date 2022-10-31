package com.example.springproject.controller;

import com.example.springproject.Service.BookService;
import com.example.springproject.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
/**when you use restcontroller as n=annotation then no need to mention the responsebody annotation**/
@RestController
public class BookController {

    //METHOD-1
/**If you are using the @Controller then you need to specify the @ResponseBody but if you use the @RestContoller annotation then no need to specify the @ResponseBody***/
//    @RequestMapping(value ="/books" ,method= RequestMethod.GET)
//    @ResponseBody
    /**you should mention this above annotation so that it gives the response as mentioned below as response body**/
//    public String getBooks(){
//        return "this is testing book first";
//
//    }

//METHOD - 2
//    @GetMapping("/books")
//    public String getBooks(){
//        return "this is testing book first";
//
//    }

    //METHOD - 3
//    @GetMapping("/books")
//    public Book getBooks(){
//        Book book=new Book();
//        book.setId(234);
//        book.setTitle("Java complete reference");
//        book.setAuthor("XYZ");
//        return book;
//    }


    //METHOD - 4
    @Autowired
    BookService bookService;   //Could not autowire. No beans of 'BookService' type found. this error occurs when you have not annotated the service class as @Service
    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return this.bookService.getAllBook();

    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id){
    return bookService.getBookById(id);

    }
}
