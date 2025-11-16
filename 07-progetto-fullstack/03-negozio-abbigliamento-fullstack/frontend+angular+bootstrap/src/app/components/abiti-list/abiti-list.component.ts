import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { AbitoService } from '../../services/abito.service';
import { Abito } from '../../models/abito.model';

@Component({
  selector: 'app-abiti-list',
  templateUrl: './abiti-list.component.html'
})
export class AbitiListComponent implements OnInit {
  abiti: Abito[] = [];
  tipo: string = '';

  constructor(private route: ActivatedRoute, private abitoService: AbitoService) {}

ngOnInit(): void {
  const tipo = this.route.snapshot.paramMap.get('tipo');
  if (tipo) {
    this.abitoService.getAbitiByTipo(tipo).subscribe({
      next: data => {
        this.abiti = data;
        console.log('Dati ricevuti:', data); // 👈 utile per debug
      },
      error: err => console.error('Errore HTTP:', err)
    });
  }
}
}
