package com.gd.sales.sale.model.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.gd.sales.product.model.entity.Product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entidad que representa una venta.
 *
 * @author Luis Monterroso
 * @version 1.0
 * @since 2025-08-02
 */
@Entity
@Table(name = "venta")
@Getter
@Setter
@NoArgsConstructor
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "CodigoVenta", length = 36, columnDefinition = "CHAR(36)", nullable = false)
    private String saleCode;

    @Column(name = "Fecha", nullable = false)
    private LocalDateTime date;

    @Column(name = "Cantidad", nullable = false)
    private int quantity;

    @Column(name = "PrecioUnitario", precision = 10, scale = 2, nullable = false)
    private BigDecimal unitPrice;

    @Column(name = "Total", precision = 12, scale = 2, nullable = false)
    private BigDecimal total;

    @ManyToOne(optional = false)
    @JoinColumn(name = "CodigoProducto", nullable = false)
    private Product product;

    public Sale(LocalDateTime date, int quantity, BigDecimal unitPrice, BigDecimal total, Product product) {
        this.date = date;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.total = total;
        this.product = product;
    }

}
