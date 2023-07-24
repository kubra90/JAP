package com.example.hibexample.data;

import com.example.hibexample.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    //abstact methods for customized queries
    //exact match mathod
    //naming convention is very important
    List<Product> findByProductName(String name);

    //fuzzy match, naming convention is very important in Java, ProductName is exact same column name in our table
    //Containing must be. Hibernate is checking findBy+ column name + Containing
    List<Product> findByProductNameContaining(String name);
}
