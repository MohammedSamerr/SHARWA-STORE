package com.Sharwa.Spring_Boot_Ecommerce.dao;

import com.Sharwa.Spring_Boot_Ecommerce.entity.Product;
import com.Sharwa.Spring_Boot_Ecommerce.entity.ProductCategory;
import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;
import java.util.Date;

@Projection(name = "productProjection", types = { Product.class })
public interface ProductProjection {
    String getSku();

    String getName();

    String getDescription();

    BigDecimal getUnitPrice();

    String getImageUrl();

    boolean isActive();

    int getUnitsInStock();

    Date getDateCreated();

    Date getLastUpdated();



}
