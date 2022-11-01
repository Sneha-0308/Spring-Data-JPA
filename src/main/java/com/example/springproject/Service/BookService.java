package com.example.springproject.Service;

import com.example.springproject.models.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//@Service
@Component  //you can also use component instead of Service
public class BookService {
    public static List<Book> list=new ArrayList<>();

    static{
        list.add(new Book(12,"cvdsvfsgd","fvdsjh"));
        list.add(new Book(54,"retg","rfwser"));
        list.add(new Book(34,"juyy","hfht"));
    }

//    get all books method
    public List<Book> getAllBook(){
        return list;

    }

//    get book by id
    public Book getBookById(int id){
        Book book=null;
        book=list.stream().filter(e->e.getId()==id).findFirst().get();
        return book;
    }

//    save the book
    public Book addBook(Book b){
        list.add(b);
        return b;
    }


//    delete book
    public void deleteBook(int id){
        list=list.stream().filter(book->{
            if(book.getId()!=id){
                return true;
            }
            else{
                return false;
            }
        }).collect(Collectors.toList());
//        list=list.stream().filter(book->book.getId()!=id).collect(Collectors.toList());
    }

//    update book
    public void updateBook(Book book,int id){
        list=list.stream().map(b->{
            if(b.getId()==id){
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
            }
            return b;
        }).collect(Collectors.toList());

    }
}
