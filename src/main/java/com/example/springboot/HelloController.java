package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @GetMapping("/data")
    public MyClass data() {
    	return new MyClass();
    }
    
    @GetMapping("/book")
    public Book book() {
    	return new Book("Moby", "Dick", "1234");
    }

}
