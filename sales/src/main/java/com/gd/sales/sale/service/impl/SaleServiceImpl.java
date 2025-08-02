package com.gd.sales.sale.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gd.sales.sale.model.entity.Sale;
import com.gd.sales.sale.repository.SaleRepository;
import com.gd.sales.sale.service.SaleService;

import lombok.RequiredArgsConstructor;

/**
 * Implementación del servicio {@link SaleService} que gestiona la lógica de
 * negocio relacionada con las ventas.
 *
 * @author Luis Monterroso
 * @version 1.0
 * @since 2025-08-02
 */
@Service
@RequiredArgsConstructor
public class SaleServiceImpl implements SaleService {

    private final SaleRepository saleRepository;

    /**
     * Obtiene todas las ventas filtradas por el ID de categoría.
     * <p>
     * Si el ID de la categoría es {@code null}, devuelve todas las ventas sin
     * aplicar filtro.
     * De lo contrario, retorna solo las ventas cuyos productos pertenecen a la
     * categoría especificada.
     *
     * @param categoryId el identificador de la categoría; puede ser {@code null}
     * @return una lista de objetos {@link Sale}, filtrados por categoría si se
     *         proporciona un ID
     */
    @Override
    public List<Sale> getSalesByCategory(String categoryId) {
        // devuelve toda la lista de ventas si el id de la categoria viene nulo
        if (categoryId == null) {
            return saleRepository.findAll();
        }
        // devuel las ventas por categoria si el id de la categoria no viene nulo
        return saleRepository.findAllByProduct_Category_CategoryCode(categoryId);
    }

}
