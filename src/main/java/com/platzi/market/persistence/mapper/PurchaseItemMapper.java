package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.PurchaseItem;
import com.platzi.market.persistence.entity.ProductPurchases;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {

    @Mappings({
            @Mapping(source = "id.idProduct", target = "productId"),
            @Mapping(source = "quantity", target = "quantity"),
            @Mapping(source = "state", target = "active")
    })
    PurchaseItem toPurchaseItem(ProductPurchases producto);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "purchase", ignore = true),
            @Mapping(target = "product", ignore = true),
            @Mapping(target = "id.idPurchase", ignore = true)
    })
    ProductPurchases toProductPurchases(PurchaseItem item);
}
