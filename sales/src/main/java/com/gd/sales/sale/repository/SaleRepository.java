package com.gd.sales.sale.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gd.sales.sale.model.entity.Sale;

/**
 * Repositorio JPA para la entidad {@link Sale}.
 *
 * @author Luis Monterroso
 * @version 1.0
 * @since 2025-08-02
 */
public interface SaleRepository extends JpaRepository<Sale, String> {

    /**
     * Busca todas las ventas cuyos productos pertenecen a una categoría específica.
     *
     * @param categoryId el identificador único de la categoría
     * @return una lista de ventas asociadas a productos de la categoría indicada
     */
    public List<Sale> findAllByProduct_Category_CategoryCode(String categoryid);
}
