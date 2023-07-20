package com.example.hibexample.controller;

import com.example.hibexample.data.ProductRepository;
import com.example.hibexample.model.Product;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class AppController {


    //TODO: Inject repositories

    private ProductRepository prodRepo;
    


    @GetMapping("/products")
    public List<Product> getAllProducts() {

        //TODO: Call the right repository method

        return  null;
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable long id) {

        //TODO: Call the right repository method

        return null;
    }

    @GetMapping("/product")
    public List<Product> findProducts(@RequestParam String q) {

        //TODO: Call the right repository method
        return null;
    }

    @GetMapping("/product-fuzzy")
    public List<Product> fuzzySearch(@RequestParam String q) {

        //TODO: Call the right repository method
        return null;
    }

    /*
    * Body:
    {
        "productId" : 2,
        "price" : 21000,
        "productName" : "Honda Civic"
     }
    * */
    @PutMapping("/update-product/{id}")
    public void updateProduct(@RequestBody Product product, @PathVariable long id) {

        //TODO: Call the right repository method
    }

    /*
    * Body:
    {
        "price" : 27000,
        "productName" : "Honda Accord"
     }
    * */
    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product) {
        //TODO: Call the right repository method

        return null;
    }

    @PostMapping("associate/{projId}/{empId}")
    public void associate(@PathVariable long projId, @PathVariable long empId) {

        //TODO: Call the right repository method

    }
}
