package com.gd.sales.category.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.gd.sales.category.model.dto.response.CategoryDTO;
import com.gd.sales.category.model.entity.Category;

/**
 * Mapper de MapStruct para convertir entidades {@link Category}
 * a objetos de transferencia de datos ({@link CategoryDTO}).
 *
 * @author Luis Monterroso
 * @version 1.0
 * @since 2025-08-02
 */
@Mapper(componentModel = "spring")
public interface CategoryMapper {
    /**
     * Convierte una lista de entidades {@link Category} en una lista de DTOs
     * {@link CategoryDTO}.
     *
     * @param categories lista de entidades de categoría
     * @return lista de objetos {@link CategoryDTO} para respuestas
     */
    public List<CategoryDTO> fromEntitiesToResponseDtos(List<Category> categories);
}
