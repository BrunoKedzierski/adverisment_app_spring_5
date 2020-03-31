package com.bkk.advertisment_app_spring_5.startup;


import com.bkk.advertisment_app_spring_5.model.Product;
import com.bkk.advertisment_app_spring_5.services.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements CommandLineRunner {
    private  ProductService productService;

    public DataInit(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {
        Product iWatch = new Product();
        iWatch.setName("Apple iWatch");
        iWatch.setPrice(300.99);
        iWatch.setQuantity(12);
        iWatch.setId(1l);

        productService.save(iWatch);
        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setPrice(1200.50);
        laptop.setQuantity(5);
        laptop.setId(2l);
        productService.save(laptop);

        Product iPod = new Product();
        iPod.setName("iPod");
        iPod.setPrice(200.20);
        iPod.setQuantity(2);
        iPod.setId(3l);



        productService.save(iPod);
        System.out.println();



    }
}
