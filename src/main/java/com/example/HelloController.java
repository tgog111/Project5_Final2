package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String home(){
        System.out.println("home ~~~");
        return "index";
    }

    @RequestMapping("classlist")
    public String classList(Model model){
        model.addAttribute("title", "2학년 교과목 리스트");
        List<String> list = new ArrayList<String>();
        list.add("실프1");
        list.add("컴비");
        model.addAttribute("classList", list);

        return "list";


    }



}
