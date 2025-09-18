// src/app/categories/categories.component.ts
import { Component, OnInit } from '@angular/core';
import { ProdottoService, Prodotto } from '../../app/service/prodotto.service';

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html'
})
export class CategoriesComponent implements OnInit {
  categorie: string[] = [];

  constructor(private service: ProdottoService ) { }

  filtraPrezzoMedio() {
  // qui puoi navigare o mostrare un alert
  this.service.getPrezzoMedio().subscribe(valore => {
    alert(`Calcolo del prezzo medio dei prodotti: € ${valore.toFixed(2)}`);
  });
} 

filtraProdottoMenoCaro() {
  this.service.getProdottoMenoCaro().subscribe(prodotto => {
    alert(`Mostra il prodotto meno caro: ${prodotto.nome} - € ${prodotto.prezzo}`);
  });
} 

filtraProdottoPiuCaro() {
  this.service.getProdottoPiuCaro().subscribe(prodotto => {
     alert(`Mostra il prodotto più caro: ${prodotto.nome} - € ${prodotto.prezzo}`);
  });

}

  ngOnInit(): void {
    this.service.getAllProdotti().subscribe(prodotti => {
      this.categorie = [...new Set(prodotti.map(p => p.categoria))]; // categorie uniche
    });
    

  }
}
