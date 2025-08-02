package com.gd.sales.category.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gd.sales.category.mapper.CategoryMapper;
import com.gd.sales.category.model.dto.response.CategoryDTO;
import com.gd.sales.category.model.entity.Category;
import com.gd.sales.category.service.CategoryService;

import lombok.AllArgsConstructor;

/**
 * Controlador REST para gestionar operaciones relacionadas con las categorías.
 * 
 * @author Luis Monterroso
 * @version 1.0
 * @since 2025-08-02
 */
@RestController
@RequestMapping("/api/v1/categories")
@AllArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;

    /**
     * Obtiene todas las categorías que tuvieron al menos una venta registrada en el
     * año 2019
     * y las devuelve como una lista de DTOs.
     *
     * @return lista de {@link CategoryDTO} representando categorías con ventas en
     *         2019
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CategoryDTO> getCategoriesWithSalesIn2019() {
        List<Category> categories = categoryService.getCategoriesWithSalesIn2019();
        return categoryMapper.fromEntitiesToResponseDtos(categories);
    }
}
