package com.platzi.market.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product_purchases")
public class ProductPurchases {
    @EmbeddedId
    private ProductPurchasesPK id;

    private Integer quantity;
    private Double total;
    private Boolean state;

    public ProductPurchasesPK getId() {
        return id;
    }

    public void setId(ProductPurchasesPK id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
