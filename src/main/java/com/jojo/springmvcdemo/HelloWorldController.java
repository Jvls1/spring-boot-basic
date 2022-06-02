package com.jojo.springmvcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping
public class HelloWorldController {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcDemoApplication.class, args);
    }
//    need a controller method to show the initial HTML form
    @GetMapping("/showForm")
    public String showForm() {
        return "helloworld-form.html";
    }
//    need a controller method to process the HTML form

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld.html";
    }

    @RequestMapping("/processFormTwo")
    public String lestShoutDude(HttpServletRequest request, Model model) {
        System.out.println(request.getParameter("studentName"));
        return "helloworld.html";
    }

}
