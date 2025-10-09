// src/app/prodotto.service.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Prodotto {
  id: number;
  nome: string;
  categoria: string;
  prezzo: number;
  immagine: string;
}

@Injectable({
  providedIn: 'root'
})
export class ProdottoService {

  private baseUrl = 'http://localhost:8080/api/prodotti';

  constructor(private http: HttpClient) { }

  getAllProdotti(): Observable<Prodotto[]> {
    return this.http.get<Prodotto[]>(this.baseUrl);
  }

  getProdottiByCategoria(categoria: string): Observable<Prodotto[]> {
    return this.http.get<Prodotto[]>(`${this.baseUrl}/categoria/${categoria}`);
  }

  getPrezzoMedio(): Observable<number> {
  return this.http.get<number>(`${this.baseUrl}/prezzo-medio`);
}

getProdottoMenoCaro(): Observable<Prodotto> {
  return this.http.get<Prodotto>(`${this.baseUrl}/meno-caro`);
}

getProdottoPiuCaro(): Observable<Prodotto> {
  return this.http.get<Prodotto>(`${this.baseUrl}/piu-caro`);
}
}
