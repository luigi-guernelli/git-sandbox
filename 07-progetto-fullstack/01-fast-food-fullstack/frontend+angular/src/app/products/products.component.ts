// src/app/products/products.component.ts
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ProdottoService, Prodotto } from '../../app/service/prodotto.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html'
})
export class ProductsComponent implements OnInit {
  prodotti: Prodotto[] = [];
  categoria!: string;

  constructor(private route: ActivatedRoute, private service: ProdottoService) { }

  ngOnInit(): void {
    this.categoria = this.route.snapshot.params['categoria'];
    this.service.getProdottiByCategoria(this.categoria).subscribe(data => {
      this.prodotti = data;
    });
  }
}
