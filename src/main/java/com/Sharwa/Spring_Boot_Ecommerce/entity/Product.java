package com.Sharwa.Spring_Boot_Ecommerce.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Table(name = "product")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "category"})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "sku")
    private String sku ;

    @Column(name = "name")
    private String name ;

    @Column(name = "description")
    private String description ;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "image_url")
    private String imageUrl ;

    @Column(name = "units_in_stock")
    private int unitsInStock;

    @Column(name = "active")
    private boolean active;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "last_updated")
    @CreationTimestamp
    private Date lastUpdated;

    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private ProductCategory category;
}
