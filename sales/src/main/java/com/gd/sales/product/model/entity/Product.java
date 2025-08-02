package com.gd.sales.product.model.entity;

import java.math.BigDecimal;
import java.util.List;

import com.gd.sales.category.model.entity.Category;
import com.gd.sales.sale.model.entity.Sale;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entidad que representa un producto.
 * 
 * @author Luis Monterroso
 * @version 1.0
 * @since 2025-08-02
 */
@Entity
@Table(name = "producto")
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "CodigoProducto", columnDefinition = "CHAR(36)", length = 36, nullable = false)
    private String productCode;

    @Column(name = "Nombre", length = 100, nullable = false)
    private String name;

    @Column(name = "Precio", precision = 10, scale = 2, nullable = false)
    private BigDecimal price;

    @ManyToOne(optional = false)
    @JoinColumn(name = "CodigoCategoria", nullable = false)
    private Category category;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private List<Sale> sales;

    public Product(String name, BigDecimal price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
