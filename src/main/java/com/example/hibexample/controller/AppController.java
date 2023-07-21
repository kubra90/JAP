package com.example.hibexample.controller;

import com.example.hibexample.data.ProductRepository;
import com.example.hibexample.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class AppController {


    //TODO: Inject repositories

    @Autowired
    private ProductRepository prodRepo;



    @GetMapping("/products")
    public List<Product> getAllProducts() {

        //TODO: Call the right repository method
        return prodRepo.findAll();
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable long id) {

        //TODO: Call the right repository method
        // findByid return Optional object, it is like null checker!
        Optional<Product> product= prodRepo.findById(id);
        if(product.isPresent()){
            return product.get();
        }
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
        //first of all, we're going to check the object with specific variable exist.
       Optional<Product> productOpt = prodRepo.findById(id);

       if(productOpt.isPresent()){
           prodRepo.save(product);

       }
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
