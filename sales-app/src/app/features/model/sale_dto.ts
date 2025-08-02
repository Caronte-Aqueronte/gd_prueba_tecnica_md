import { ProductDTO } from './product_dto';

export class SaleDTO {
  saleCode: string;
  date: string;
  quantity: number;
  unitPrice: number;
  total: number;
  product: ProductDTO;

  constructor(
    saleCode: string,
    date: string,
    quantity: number,
    unitPrice: number,
    total: number,
    product: ProductDTO
  ) {
    this.saleCode = saleCode;
    this.date = date;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
    this.total = total;
    this.product = product;
  }
}
