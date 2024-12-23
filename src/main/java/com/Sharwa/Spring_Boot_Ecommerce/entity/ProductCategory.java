package com.Sharwa.Spring_Boot_Ecommerce.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;


@Entity
@Data
@Table(name = "product_category")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "products"})
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String categoryName ;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
    private Set<Product> products ;
}
