package com.gd.sales.category.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gd.sales.category.model.entity.Category;

/**
 * Repositorio JPA para la entidad {@link Category}.
 *
 * @author Luis Monterroso
 * @version 1.0
 * @since 2025-08-02
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {

    /**
     * Recupera todas las categorías distintas que tienen al menos una venta
     * registrada en el año 2019.
     *
     * Se utiliza {@code DISTINCT} para evitar categorías duplicadas en el
     * resultado.
     * 
     * @return una lista de entidades {@link Category} que tuvieron ventas en el año
     *         2019.
     */
    @Query("""
                SELECT DISTINCT c
                FROM Category c
                JOIN c.products p
                JOIN p.sales v
                WHERE YEAR(v.date) = 2019
            """)
    public List<Category> findDistinctCategoriesWithSalesIn2019();

}
