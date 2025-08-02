import { CategoryDTO } from './category_dto';

/**
 * DTO que representa la información de un producto
 * expuesta en respuestas HTTP.
 */
export class ProductDTO {
  productCode: string;
  name: string;
  price: number;
  category: CategoryDTO;

  constructor(
    productCode: string,
    name: string,
    price: number,
    category: CategoryDTO
  ) {
    this.productCode = productCode;
    this.name = name;
    this.price = price;
    this.category = category;
  }
}
