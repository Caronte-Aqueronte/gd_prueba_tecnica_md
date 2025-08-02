package com.gd.sales.product.model.dto.response;

import java.math.BigDecimal;

import com.gd.sales.category.model.dto.response.CategoryDTO;

import lombok.Value;

/**
 * DTO que representa la información de un producto
 * expuesta en respuestas HTTP.
 *
 * @author Luis Monterroso
 * @version 1.0
 * @since 2025-08-02
 */
@Value
public class ProductDTO {
    String productCode;
    String name;
    BigDecimal price;
    CategoryDTO category;
}
