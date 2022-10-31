package com.example.springproject.Service;

import com.example.springproject.models.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Service
@Component  //you can also use component instead of Service
public class BookService {
    public static List<Book> list=new ArrayList<>();

    static{
        list.add(new Book(12,"cvdsvfsgd","fvdsjh"));
        list.add(new Book(54,"retg","rfwser"));
        list.add(new Book(34,"juyy","hfht"));
    }

    public List<Book> getAllBook(){
        return list;

    }

    public Book getBookById(int id){
        Book book=null;
        book=list.stream().filter(e->e.getId()==id).findFirst().get();
        return book;
    }
}
