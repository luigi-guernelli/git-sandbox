import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AbitoService } from '../../services/abito.service';
import { Abito } from '../../models/abito.model';

@Component({
  selector: 'app-abiti-list',
  templateUrl: './abiti-list.component.html'
})
export class AbitiListComponent implements OnInit {

  abiti: Abito[] = [];
  tipo!: string;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private abitoService: AbitoService
  ) {}

  ngOnInit(): void {
    this.tipo = this.route.snapshot.paramMap.get('tipo')!;
    this.caricaAbiti();
  }

  caricaAbiti(): void {
    this.abitoService.getByTipo(this.tipo).subscribe({
      next: data => this.abiti = data,
      error: err => console.error('Errore HTTP:', err)
    });
  }

  nuovoAbito(): void {
    this.router.navigate(['/abiti/nuovo', this.tipo]);
  }

  modificaAbito(id: number): void {
    this.router.navigate(['/abiti/modifica', id]);
  }

  eliminaAbito(id: number): void {
    if (confirm('Sei sicuro di voler eliminare questo abito?')) {
      this.abitoService.delete(id).subscribe({
        next: () => {
          alert('Abito eliminato');
          this.caricaAbiti();
        },
        error: err => console.error('Errore eliminazione', err)
      });
    }
  }
}
