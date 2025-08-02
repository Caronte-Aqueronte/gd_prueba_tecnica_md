/**
 * DTO de respuesta para la entidad Category.
 */
export class CategoryDTO {
   categoryCode: string;
   name: string;

  constructor(categoryCode: string, name: string) {
    this.categoryCode = categoryCode;
    this.name = name;
  }

}
