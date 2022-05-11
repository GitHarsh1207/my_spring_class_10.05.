package com.harsh_vardhan.my_spring_class_105;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo_Controller_harsh {
    //method to print Hello in console
    @RequestMapping("/Hello_Harsh")
    public void Hello_harsh(){
        System.out.println("Hello Harsh This the first spring boot project");
    }

    @RequestMapping("/welcome_harsh")
    public String welcome(){

        return "Hello Harsh This the first spring boot project";
    }
    @RequestMapping("/Harsh_int")
    public int number(){
        return 1994;
    }
    @RequestMapping("/Harsh_addition")
    public int addition(){
        int a=3;
        int b=10;
        int sum;
        sum= a + b;
        return sum;

    }
}

