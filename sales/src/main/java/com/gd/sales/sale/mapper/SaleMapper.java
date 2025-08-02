package com.gd.sales.sale.mapper;

import java.util.List;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.gd.sales.common.util.GuatemalaDateTimeFormatter;
import com.gd.sales.sale.model.dto.response.SaleDTO;
import com.gd.sales.sale.model.entity.Sale;

/**
 * Mapper responsable de convertir entidades {@link Sale} a objetos
 * de transferencia de datos {@link SaleDTO}.
 *
 * @author Luis Monterroso
 * @version 1.0
 * @since 2025-08-02
 */
@Mapper(componentModel = "spring")
public abstract class SaleMapper {
    
    /**
     * Convierte una entidad {@link Sale} a su representación {@link SaleDTO}.
     *
     * @param sale la entidad de venta a convertir
     * @return DTO correspondiente a la venta
     */
    public abstract SaleDTO fromEntityToResponseDto(Sale sale);

    /**
     * Convierte una lista de entidades {@link Sale} a una lista de {@link SaleDTO}.
     *
     * @param sale lista de entidades de venta
     * @return lista de DTOs de ventas
     */
    public abstract List<SaleDTO> fromEntitiesToResponseDtos(List<Sale> sale);

    /**
     * Formatea la fecha de la venta al estilo guatemalteco luego del mapeo
     * automático.
     * Se invoca automáticamente por MapStruct después de convertir la entidad.
     *
     * @param dto  el DTO resultante que se está construyendo
     * @param sale la entidad original de venta
     */
    @AfterMapping
    protected void setDate(@MappingTarget SaleDTO dto, Sale sale) {
        // instancia un formateador
        GuatemalaDateTimeFormatter formatter = new GuatemalaDateTimeFormatter();
        // le da un formato a la fecha
        dto.setDate(formatter.format(sale.getDate()));
    }
}
