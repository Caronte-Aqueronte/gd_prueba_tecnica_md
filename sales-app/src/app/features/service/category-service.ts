import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from '../../../environments/environment';
import { CategoryDTO } from '../model/category_dto';

@Injectable({
  providedIn: 'root',
})
export class CategoryService {
  private apiUrl = `${environment.apiUrl}/categories`;

  constructor(private http: HttpClient) {}

  public getCategoriesWithSalesIn2019(): Observable<CategoryDTO[]> {
    return this.http.get<any>(this.apiUrl);
  }
}
