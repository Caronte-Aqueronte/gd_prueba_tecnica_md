import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from '../../../environments/environment';
import { Observable } from 'rxjs';
import { SaleDTO } from '../model/sale_dto';

@Injectable({
  providedIn: 'root',
})
export class SaleService {
  private apiUrl = `${environment.apiUrl}/sales`;

  constructor(private http: HttpClient) {}

  public getSalesByCategory(categoryId: string): Observable<SaleDTO[]> {
    const params = new HttpParams().set('categoryId', categoryId);
    return this.http.get<SaleDTO[]>(`${this.apiUrl}/by-category`, { params });
  }
}
