package com.gd.sales.sale.model.dto.response;

import java.math.BigDecimal;

import com.gd.sales.product.model.dto.response.ProductDTO;

import lombok.Getter;
import lombok.Setter;

/**
 * DTO que representa una venta realizada.
 *
 * @author Luis Monterroso
 * @version 1.0
 * @since 2025-08-02
 */
@Getter
@Setter
public class SaleDTO {
    private String saleCode;
    private String date;
    private int quantity;
    private BigDecimal unitPrice;
    private BigDecimal total;
    private ProductDTO product;
}
