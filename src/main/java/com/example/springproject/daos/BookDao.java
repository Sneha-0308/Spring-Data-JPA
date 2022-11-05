package com.example.springproject.daos;

import com.example.springproject.models.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookDao extends CrudRepository<Book,Integer> {
    public Book findById(int id);
}
