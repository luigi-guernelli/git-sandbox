import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Veicolo {
  id: number;
  modello: string;
  marca: string;
  codiceImmatricolazione: string;
  dataImmatricolazione: string;
  prezzo: number;
  tipo: string;
}

@Injectable({
  providedIn: 'root'
})
export class VeicoloService {

  private apiUrl = 'http://localhost:8080/api/veicoli';

  constructor(private http: HttpClient) { }

  getAll(): Observable<Veicolo[]> {
    return this.http.get<Veicolo[]>(this.apiUrl);
  }

  getByTipo(tipo: string): Observable<Veicolo[]> {
    return this.http.get<Veicolo[]>(`${this.apiUrl}/tipo/${tipo}`);
  }

  getByMarca(marca: string): Observable<Veicolo[]> {
    return this.http.get<Veicolo[]>(`${this.apiUrl}/marca/${marca}`);
  }

  getById(id: number): Observable<Veicolo> {
    return this.http.get<Veicolo>(`${this.apiUrl}/${id}`);
  }

  deleteById(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }

  prezzoMedio(): Observable<number> {
    return this.http.get<number>(`${this.apiUrl}/prezzo-medio`);
  }

  menoCaro(): Observable<Veicolo> {
    return this.http.get<Veicolo>(`${this.apiUrl}/meno-caro`);
  }

  prezzoMedioMarca(marca: string): Observable<number> {
    return this.http.get<number>(`${this.apiUrl}/prezzo-medio/${marca}`);
  }

  // Prezzo medio per marca
prezzoMedioPerMarca(marca: string) {
  return this.http.get<number>(`${this.apiUrl}/prezzo-medio/marca/${marca}`);
}
}