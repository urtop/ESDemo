package com.example.esdemo;

import com.example.esdemo.entities.Author;
import com.example.esdemo.entities.Book;
import com.example.esdemo.repositories.book.SampleBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.UUID;

@Component
public class TestService {

    @Resource
    private SampleBookRepository bookRepository;

    public void test() {
        String id = String.valueOf(UUID.randomUUID());
        Book book = new Book();
        book.setId(id);
        book.setName("xyz");
        book.setVersion(111);
        book.setPrice(1L);
        Author author = new Author();
        author.setId("1");
        author.setName("ABC");
        bookRepository.save(book);
    }

    public Book getInfo(String name) {

        Page<Book> books = bookRepository.findByName(name,new PageRequest(0,10));
       return books.get().findFirst().get();
    }
}
