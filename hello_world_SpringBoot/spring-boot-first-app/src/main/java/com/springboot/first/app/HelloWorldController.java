package com.springboot.first.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController // instead of the above two, we can use this annotation
public class HelloWorldController {

    // GET HTTP method
    // http://localhost:8080/hello-world


    @GetMapping("/hello-world") // in order to serve this method as a rest api we have to annotate with this annotation
    public String helloWorld() {
        return "Hello World!";
    }


}
