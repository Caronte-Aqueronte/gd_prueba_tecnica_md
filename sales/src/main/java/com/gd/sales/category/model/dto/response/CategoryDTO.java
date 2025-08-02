package com.gd.sales.category.model.dto.response;

import lombok.Value;

/**
 * DTO de respuesta para la entidad {@code Category}.
 *
 * <p>
 * Representa los datos necesarios para exponer una categoría al cliente.
 * Incluye el código único de la categoría y su nombre.
 * </p>
 *
 *
 * @author Luis Monterroso
 * @version 1.0
 * @since 2025-08-02
 */
@Value
public class CategoryDTO {

    String categoryCode;
    String name;
}
