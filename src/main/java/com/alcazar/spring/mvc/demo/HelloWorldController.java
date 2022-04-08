package com.alcazar.spring.mvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {


    /**
     *
     * @return
     */
    @RequestMapping("/")
    public String showIndex(){
        System.out.println("Index!");
        return "index";
    }

    /**
     *
     * @return
     */
    @RequestMapping("/hello")
    public String showHelloWorld(){
        System.out.println("Show Hello World!");
        return "hello";
    }


    /**
     *
     */
    @RequestMapping("/processForm")
    public String processForm(){
        System.out.println("Processed form!");
        return "hello";
    }


}
