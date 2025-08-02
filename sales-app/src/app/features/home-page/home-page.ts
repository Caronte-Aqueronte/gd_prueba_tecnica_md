import { Component, OnInit } from '@angular/core';
import { SaleDTO } from '../model/sale_dto';
import { CategoryDTO } from '../model/category_dto';
import { CategoryService } from '../service/category-service';
import { SaleService } from '../service/sale-service';

@Component({
  selector: 'app-home-page',
  standalone: false,
  templateUrl: './home-page.html',
  styleUrl: './home-page.scss',
})
export class HomePage implements OnInit {
  sales!: SaleDTO[];
  categories!: CategoryDTO[];
  selectedValue: string | null = null;

  constructor(
    private categoryService: CategoryService,
    private saleService: SaleService
  ) {}

  ngOnInit(): void {
    this.getCategoriesWithSalesIn2019();
  }

  public getCategoriesWithSalesIn2019(): void {
    this.categoryService.getCategoriesWithSalesIn2019().subscribe({
      next: (categories: CategoryDTO[]) => {
        this.categories = categories;
      },
      error: (err) => {
        console.error('Error al obtener ventas:', err);
        this.categories = [];
      },
    });
  }

  onSelectedCategory(categoryId: string | null): void {
    this.selectedValue = categoryId;

    if (!categoryId) {
      this.sales = [];
      return;
    }

    this.saleService.getSalesByCategory(categoryId).subscribe({
      next: (sales) => {
        this.sales = sales;
      },
      error: (err) => {
        console.error('Error al obtener ventas:', err);
        this.sales = [];
      },
    });
  }
}
