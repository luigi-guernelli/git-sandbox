import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Abito } from '../models/abito.model';

@Injectable({ providedIn: 'root' })
export class AbitoService {
  private apiUrl = 'http://localhost:8080/api/abiti';

  constructor(private http: HttpClient) {}

  getAll(): Observable<Abito[]> {
    return this.http.get<Abito[]>(this.apiUrl);
  }

  getByTipo(tipo: string): Observable<Abito[]> {
    return this.http.get<Abito[]>(`${this.apiUrl}/tipo/${tipo}`);
  }

  getById(id: number): Observable<Abito> {
    return this.http.get<Abito>(`${this.apiUrl}/${id}`);
  }

  create(abito: Abito): Observable<Abito> {
    return this.http.post<Abito>(this.apiUrl, abito);
  }

  update(id: number, abito: Abito): Observable<Abito> {
    return this.http.put<Abito>(`${this.apiUrl}/${id}`, abito);
  }

  delete(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }

  getAbitiByTipo(tipo: string): Observable<Abito[]> {
  return this.http.get<Abito[]>(`${this.apiUrl}/tipo/${tipo}`);
}

}
