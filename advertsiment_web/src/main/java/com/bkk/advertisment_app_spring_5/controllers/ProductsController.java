package com.bkk.advertisment_app_spring_5.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class ProductsController {



        @RequestMapping("/posts")
        public String index() {


            return "products/index";
        }

}
