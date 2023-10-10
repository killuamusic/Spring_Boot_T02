package com.webapi.test2.controller;

import com.webapi.test2.model.usertest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class testController {

    @GetMapping("/gogo")
    String showHomePage() {
        return "wel";
    }

    @GetMapping("/register")
    String showForm(ModelMap model) {
        usertest user = new usertest();
        model.addAttribute("userfo", user);

        List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
        model.addAttribute("listProfession", listProfession);

//        System.out.println("GetMapping register");

        return "register_form";
    }

    @PostMapping("/register")
    String submitForm(@ModelAttribute("userfo") usertest usera) {
//        System.out.println("PostMapping register");
        System.out.println(usera);

        return "register_success";
    }
//    @PostMapping("/register")
//    String submitForm(@RequestParam String name,String email,String password) {
//        System.out.println("PostMapping register");
//        System.out.println(name);
//
//        return "register_success";
//    }
}
