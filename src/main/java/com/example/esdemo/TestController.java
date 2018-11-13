package com.example.esdemo;

import com.example.esdemo.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping("/save")
    public String Save() {
        testService.test();
        return "Done!";
    }

    @GetMapping("/query")
    public String Query() {
        Book book = testService.getInfo("xyz");
        return String.valueOf(book.getPrice());
    }
}
