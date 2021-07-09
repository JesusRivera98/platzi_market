package com.platzi.market.persistence;

import com.platzi.market.domain.Purchase;
import com.platzi.market.persistence.crud.PurchaseCrudRepository;
import com.platzi.market.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PurchaseRepository implements com.platzi.market.domain.repository.PurchaseRepository {
    @Autowired
    private PurchaseCrudRepository purchaseCrudRepository;

    @Autowired
    private PurchaseMapper mapper;

    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases((List<com.platzi.market.persistence.entity.Purchase>) purchaseCrudRepository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return purchaseCrudRepository.findByIdClient(clientId)
                .map(purchases -> mapper.toPurchases(purchases));
    }

    @Override
    public Purchase save(Purchase purchase) {
        com.platzi.market.persistence.entity.Purchase purchaseE = mapper.toPurchaseE(purchase);
        purchaseE.getProducts().forEach(product -> product.setPurchase(purchaseE));

        return mapper.toPurchase(purchaseCrudRepository.save(purchaseE));
    }
}
