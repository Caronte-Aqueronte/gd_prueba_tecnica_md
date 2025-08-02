package com.gd.sales.category.service;

import java.util.List;

import com.gd.sales.category.model.entity.Category;

/**
 * Servicio que define las operaciones relacionadas con las categorías.
 *
 * @author Luis Monterroso
 * @version 1.0
 * @since 2025-08-02
 */
public interface CategoryService {

    /**
     * Recupera todas las categorías únicas que tienen al menos una venta registrada
     * en el año 2019.
     * 
     * @return una lista de entidades {@link Category} con ventas registradas en
     *         2019
     */
    public List<Category> getCategoriesWithSalesIn2019();
}
