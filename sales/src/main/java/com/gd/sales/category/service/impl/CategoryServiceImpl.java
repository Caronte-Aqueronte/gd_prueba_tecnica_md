package com.gd.sales.category.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gd.sales.category.model.entity.Category;
import com.gd.sales.category.repository.CategoryRepository;
import com.gd.sales.category.service.CategoryService;

import lombok.RequiredArgsConstructor;

/**
 * Implementación del servicio {@link CategoryService} que gestiona operaciones
 * relacionadas con las categorías.
 *
 * @author Luis Monterroso
 * @version 1.0
 * @since 2025-08-02
 */
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    /**
     * Recupera todas las categorías únicas que tienen al menos una venta registrada
     * en el año 2019.
     * 
     * @return una lista de entidades {@link Category} con ventas registradas en
     *         2019
     */
    @Override
    public List<Category> getCategoriesWithSalesIn2019() {
        return categoryRepository.findDistinctCategoriesWithSalesIn2019();
    }
}
