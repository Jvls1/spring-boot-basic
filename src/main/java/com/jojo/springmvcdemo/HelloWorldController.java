package com.jojo.springmvcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

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
    public String processFormTwo(HttpServletRequest request, Model model) {
        String studentName = request.getParameter("studentName").toUpperCase();
        model.addAttribute("name", studentName);
        return "helloworld.html";
    }

    @RequestMapping("/processFormThree")
    public String processFormThree(@RequestParam("studentName") String studentName, Model model) {
        studentName = studentName.toUpperCase();
        model.addAttribute("name", studentName);
        return "helloworld.html";
    }

}
