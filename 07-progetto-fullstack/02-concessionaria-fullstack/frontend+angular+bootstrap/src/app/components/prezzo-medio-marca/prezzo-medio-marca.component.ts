import { Component } from '@angular/core';
import { VeicoloService } from '../../services/veicolo.service';

@Component({
  selector: 'app-prezzo-medio-marca',
  templateUrl: './prezzo-medio-marca.component.html'
})
export class PrezzoMedioMarcaComponent {
  marca: string = '';
  prezzoMedio: number | null = null;
  loading = false;

  constructor(private veicoloService: VeicoloService) {}

  calcolaPrezzoMedio() {
    if (!this.marca.trim()) return;
    this.loading = true;
    this.veicoloService.prezzoMedioPerMarca(this.marca).subscribe(
      res => { this.prezzoMedio = res; this.loading = false; },
      err => { this.prezzoMedio = null; this.loading = false; }
    );
  }
}
