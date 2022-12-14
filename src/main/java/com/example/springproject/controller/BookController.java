package com.example.springproject.controller;

import com.example.springproject.Service.BookService;
import com.example.springproject.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> list=bookService.getAllBook();
        if(list.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") int id){
    Book book= bookService.getBookById(id);
    if(book==null)
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    return ResponseEntity.of(Optional.of(book));
    }

    @PostMapping("/books")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        Book b=null;
        try{
            b=bookService.addBook(book);
            return ResponseEntity.of(Optional.of(b));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/books/{bookid}")  //ResponseEntity<void> we can use instead of question mark
    public ResponseEntity<?> deleteBook(@PathVariable("bookid") int id){
        try{
            bookService.deleteBook(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/books/{id}")
    public ResponseEntity<Book> updateBook(@RequestBody Book book,@PathVariable("id") int id){
        try{
            bookService.updateBook(book,id);
            return ResponseEntity.ok().body(book);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
