package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductCrudRepository;
import com.platzi.market.persistence.entity.Product;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll(){
        return (List<Product>) productCrudRepository.findAll();
    }

    public List<Product> getByCategory(int idCategory){
        return productCrudRepository.findByIdCategoryOrderByNameAsc(idCategory);
    }

    public Optional<List<Product>> getScarce(int quantity){
        return productCrudRepository.findByStockQuantityLessThanAndState(quantity, true);
    }

    public Optional<Product> getProduct(int idProducto) {
        return productCrudRepository.findById(idProducto);
    }

    public Product save(Product product) {
        return productCrudRepository.save(product);
    }

    public void delete(int idProduct) {
        productCrudRepository.deleteById(idProduct);
    }
}
