import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { VeicoloService, Veicolo } from '../../services/veicolo.service';

@Component({
  selector: 'app-lista-veicoli',
  templateUrl: './lista-veicoli.component.html'
})
export class ListaVeicoliComponent implements OnInit {
  veicoli: Veicolo[] = [];
  tipo: string = '';
  filtroMarca: string = '';

  constructor(
    private route: ActivatedRoute,
    private veicoloService: VeicoloService
  ) {}

  ngOnInit(): void {
    // subscribe ai param per aggiornare la lista quando cambia :tipo
    this.route.paramMap.subscribe(params => {
      this.tipo = params.get('tipo') || '';
      if (this.tipo) {
        this.veicoloService.getByTipo(this.tipo).subscribe(data => this.veicoli = data);
      } else {
        this.veicoloService.getAll().subscribe(data => this.veicoli = data);
      }
    });
  }

  // filtro su marca, modello e codice di immatricolazione
  get veicoliFiltrati() {
    const term = this.filtroMarca.trim().toLowerCase();
    if (!term) return this.veicoli;
    return this.veicoli.filter(v =>
      (v.marca || '').toLowerCase().includes(term) ||
      (v.modello || '').toLowerCase().includes(term) ||
      (v.codiceImmatricolazione || '').toLowerCase().includes(term)
    );
  }

  deleteVeicolo(id: number | undefined) {
    if (!id) return;
    this.veicoloService.deleteById(id).subscribe(() => {
      this.veicoli = this.veicoli.filter(v => v.id !== id);
    });
    
  }
}
