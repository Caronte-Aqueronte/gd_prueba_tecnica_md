-- consulta que obtiene  el nombre de la categoría del producto de la última venta realizada según la fecha

SELECT c.Nombre  -- solo selecciona el nombre de la categoria

FROM Venta v  

-- une la tabla Producto, empareja por el codigo del producto vendido
INNER JOIN Producto p ON v.CodigoProducto = p.CodigoProducto

-- une la tabla Categoria, empareja por el codigo de categoria del producto
INNER JOIN Categoria c ON p.CodigoCategoria = c.CodigoCategoria

-- ordena descendente por fecha
ORDER BY v.Fecha DESC

-- limita el resultado a solo 1 fila, osea, la venta mas reciente
LIMIT 1;