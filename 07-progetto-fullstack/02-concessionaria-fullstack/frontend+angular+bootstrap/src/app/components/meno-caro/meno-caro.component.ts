import { Component, OnInit } from '@angular/core';
import { VeicoloService, Veicolo } from '../../services/veicolo.service';

@Component({
  selector: 'app-meno-caro',
  templateUrl: './meno-caro.component.html'
})
export class MenoCaroComponent implements OnInit {
  veicolo: Veicolo | null = null;
  loading = true;

  constructor(private veicoloService: VeicoloService) {}

  ngOnInit(): void {
    this.veicoloService.menoCaro().subscribe(res => {
      this.veicolo = res;
      this.loading = false;
    }, () => this.loading = false);
  }
}
