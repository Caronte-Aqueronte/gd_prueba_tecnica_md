package com.gd.sales.common.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Utilidad para formatear fechas en formato legible para Guatemala.
 *
 * @author Luis Monterroso
 * @version 1.0
 * @since 2025-08-02
 */
public class GuatemalaDateTimeFormatter {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(
            "dd/MM/yyyy hh:mm a");

    /**
     * Formatea un {@link LocalDateTime} en formato corto con AM/PM.
     *
     * @param dateTime fecha y hora a formatear
     * @return fecha formateada como cadena
     */
    public String format(LocalDateTime dateTime) {
        return dateTime.format(FORMATTER);
    }
}
