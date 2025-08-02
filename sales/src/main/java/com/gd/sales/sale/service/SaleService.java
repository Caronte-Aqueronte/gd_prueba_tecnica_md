package com.gd.sales.sale.service;

import java.util.List;

import com.gd.sales.sale.model.entity.Sale;

/**
 * Servicio para manejar operaciones relacionadas con las ventas.
 *
 * @author Luis Monterroso
 * @version 1.0
 * @since 2025-08-02
 */
public interface SaleService {
    /**
     * Obtiene todas las ventas filtradas por el ID de categoría.
     * 
     * @param categoryId el identificador de la categoría; puede ser {@code null}
     * @return una lista de objetos {@link Sale}, filtrados por categoría si se
     *         proporciona un ID
     */
    public List<Sale> getSalesByCategory(String categoryId);
}
