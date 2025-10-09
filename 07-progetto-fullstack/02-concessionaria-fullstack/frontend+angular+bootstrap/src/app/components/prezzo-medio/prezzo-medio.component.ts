import { Component, OnInit } from '@angular/core';
import { VeicoloService } from '../../services/veicolo.service';

@Component({
  selector: 'app-prezzo-medio',
  templateUrl: './prezzo-medio.component.html'
})
export class PrezzoMedioComponent implements OnInit {
  prezzoMedio: number | null = null;
  loading = true;

  constructor(private veicoloService: VeicoloService) {}

  ngOnInit(): void {
    this.veicoloService.prezzoMedio().subscribe(res => {
      this.prezzoMedio = res;
      this.loading = false;
    }, () => this.loading = false);
  }
}
