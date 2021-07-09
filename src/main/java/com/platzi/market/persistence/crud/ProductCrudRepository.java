package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {
    List<Product> getByCategory(int idCategory);
}
