package com.bkk.advertisment_app_spring_5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CategoriesController {
    @RequestMapping("/categories")
    public String index(){

        return "categories/index";


    }
}
