package com.bkk.advertisment_app_spring_5.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class PostsController {



        @RequestMapping("/postss")
        public String index() {

            return "posts/index";
        }

}
