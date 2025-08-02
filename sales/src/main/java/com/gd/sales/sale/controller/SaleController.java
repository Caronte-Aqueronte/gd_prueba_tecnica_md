package com.gd.sales.sale.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gd.sales.sale.mapper.SaleMapper;
import com.gd.sales.sale.model.dto.response.SaleDTO;
import com.gd.sales.sale.model.entity.Sale;
import com.gd.sales.sale.service.SaleService;

import lombok.AllArgsConstructor;

/**
 * Controlador REST para la gestión de ventas.
 * Proporciona endpoints para consultar información relacionada a ventas.
 *
 * @author Luis Monterroso
 * @version 1.0
 * @since 2025-08-02
 */
@RestController
@RequestMapping("/api/v1/sales")
@AllArgsConstructor
public class SaleController {

    private final SaleService saleService;
    private final SaleMapper saleMapper;

    /**
     * Obtiene las ventas filtradas por categoría.
     * Si no se proporciona un ID de categoría, devuelve todas las ventas.
     *
     * @param categoryId (opcional) ID de la categoría por la cual se filtrarán las
     *                   ventas
     * @return lista de DTOs de ventas {@link SaleDTO} correspondientes al filtro
     *         aplicado
     */
    @GetMapping("/by-category")
    @ResponseStatus(HttpStatus.OK)
    public List<SaleDTO> getSalesByCategory(
            @RequestParam(required = false) String categoryId) {
        List<Sale> categories = saleService.getSalesByCategory(categoryId);
        return saleMapper.fromEntitiesToResponseDtos(categories);
    }
}
