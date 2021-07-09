package com.platzi.market.persistence;

import com.platzi.market.domain.Product;
import com.platzi.market.persistence.crud.ProductCrudRepository;
import com.platzi.market.persistence.mapper.ProductMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository implements com.platzi.market.domain.repository.ProductRepository {
    private ProductCrudRepository productCrudRepository;
    private ProductMapper mapper;

    @Override
    public List<Product> getAll() {
        List<com.platzi.market.persistence.entity.Product> products = (List<com.platzi.market.persistence.entity.Product>) productCrudRepository.findAll();
        return mapper.toProducts(products);
    }

    @Override
    public Optional<List<Product>> getByCategory(int categoryId) {
        List<com.platzi.market.persistence.entity.Product> products = productCrudRepository.findByIdCategoryOrderByNameAsc(categoryId);
        return Optional.of(mapper.toProducts(products));
    }

    @Override
    public Optional<List<Product>> getScarceProducts(int quantity) {
        Optional<List<com.platzi.market.persistence.entity.Product>> products = productCrudRepository.findByStockQuantityLessThanAndState(quantity, true);
        return products.map(prods -> mapper.toProducts(prods));
    }

    @Override
    public Optional<Product> getProduct(int productId) {
        return productCrudRepository.findById(productId).map(productE -> mapper.toProduct(productE));
    }

    @Override
    public Product save(Product product) {
        com.platzi.market.persistence.entity.Product productE = mapper.toProductE(product);
        return mapper.toProduct(productCrudRepository.save(productE));
    }

    @Override
    public void delete(int productId) {
        productCrudRepository.deleteById(productId);
    }
}