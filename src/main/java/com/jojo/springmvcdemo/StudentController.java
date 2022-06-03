package com.jojo.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/showForm")
    public String showForm(Model model){

        Student theStudent = new Student();

        model.addAttribute("student", theStudent);

        return "student-form.html";
    }
}
