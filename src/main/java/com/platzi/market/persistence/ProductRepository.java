package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductCrudRepository;
import com.platzi.market.persistence.entity.Product;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public class ProductRepository {
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll(){
        return (List<Product>) productCrudRepository.findAll();
    }

    public List<Product> getByCategory(int idCategory){
        return productCrudRepository.findByIdCategoryOrderByNameAsc(idCategory);
    }

    public List<Product> getScarce(int quantity){
        return productCrudRepository.findByStockQuantityLessThanAndState(quantity);

    }
}
