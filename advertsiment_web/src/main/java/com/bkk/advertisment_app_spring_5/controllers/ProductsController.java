package com.bkk.advertisment_app_spring_5.controllers;

import com.bkk.advertisment_app_spring_5.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ProductsController {
        private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/posts")
        public String index(Model model) {

            model.addAttribute("products", productService.findAll());
            return "products/index";
        }

}
