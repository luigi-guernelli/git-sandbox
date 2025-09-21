import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html'
})
export class HomeComponent {
  categorie = [
    { nome: 'Automobili', tipo: 'AUTOMOBILE' },
    { nome: 'Motociclette', tipo: 'MOTOCICLETTA' },
    { nome: 'Furgoni', tipo: 'FURGONE' }
  ];

  constructor(private router: Router) { }

  vaiACategoria(tipo: string) {
    this.router.navigate(['/categoria', tipo]);
  }
}
