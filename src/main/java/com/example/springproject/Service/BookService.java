package com.example.springproject.Service;

import com.example.springproject.daos.BookDao;
import com.example.springproject.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//@Service
@Component  //you can also use component instead of Service
public class BookService {
    /***public static List<Book> list=new ArrayList<>();

    static{
        list.add(new Book(12,"cvdsvfsgd","fvdsjh"));
        list.add(new Book(54,"retg","rfwser"));
        list.add(new Book(34,"juyy","hfht"));
    }**/
    @Autowired
    private BookDao bookDao;
//    get all books method
    public List<Book> getAllBook(){
        List<Book> list=(List<Book>) bookDao.findAll();
        return list;

    }

//    get book by id
    public Book getBookById(int id){
        Book book=null;
        try {
//            book = list.stream().filter(e -> e.getId() == id).findFirst().get();
            book=bookDao.findById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return book;
    }

//    save the book
    public Book addBook(Book b){
//        list.add(b);

        Book result=bookDao.save(b);
        return result;
    }


//    delete book
    public void deleteBook(int id){
//        list=list.stream().filter(book->{
//            if(book.getId()!=id){
//                return true;
//            }
//            else{
//                return false;
//            }
//        }).collect(Collectors.toList());

        //OR
//        list=list.stream().filter(book->book.getId()!=

//        OR
        bookDao.deleteById(id);
    }

//    update book
    public void updateBook(Book book,int id){
//        list=list.stream().map(b->{
//            if(b.getId()==id){
//                b.setTitle(book.getTitle());
//                b.setAuthor(book.getAuthor());
//            }
//            return b;
//        }).collect(Collectors.toList());

//        OR
        book.setId(id);
        bookDao.save(book);

    }
}
