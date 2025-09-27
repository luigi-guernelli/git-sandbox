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
  nessunVeicolo: boolean = false;

  constructor(private veicoloService: VeicoloService) {}

  calcolaPrezzoMedio() {
    if (!this.marca.trim()) return;
    this.loading = true;
    this.nessunVeicolo = false;

    this.veicoloService.prezzoMedioPerMarca(this.marca).subscribe(
      res => {
        if (res === 0) {         // se la media è zero, significa che non ci sono veicoli
          this.nessunVeicolo = true;
          this.prezzoMedio = null;
        } else {
          this.prezzoMedio = res;
        }
        this.loading = false;
      },
      err => {                  // gestisce eventuali errori di API
        this.prezzoMedio = null;
        this.nessunVeicolo = true;
        this.loading = false;
      }
    );
  }
}