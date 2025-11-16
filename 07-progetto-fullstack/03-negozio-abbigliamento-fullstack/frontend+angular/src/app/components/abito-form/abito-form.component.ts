import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { AbitoService } from '../../services/abito.service';
import { Abito } from '../../models/abito.model';

@Component({
  selector: 'app-abito-form',
  templateUrl: './abito-form.component.html'
})
export class AbitoFormComponent implements OnInit {

  abitoForm!: FormGroup;
  isEdit = false;
  idAbito?: number;
  tipoSelezionato?: string;

  constructor(
    private fb: FormBuilder,
    private route: ActivatedRoute,
    private router: Router,
    private abitoService: AbitoService
  ) {}

  ngOnInit(): void {
    // Se abbiamo :id → modalità modifica
    const idParam = this.route.snapshot.paramMap.get('id');
    const tipoParam = this.route.snapshot.paramMap.get('tipo');

    this.isEdit = !!idParam;
    if (idParam) {
      this.idAbito = +idParam;
    }
    if (tipoParam) {
      this.tipoSelezionato = tipoParam;
    }

    this.initForm();
    this.abitoForm.get('tipo')?.valueChanges.subscribe(val => {
      this.gestisciCampiPerTipo(val);
    });

    if (this.isEdit && this.idAbito) {
      this.abitoService.getById(this.idAbito).subscribe({
        next: (abito) => {
          this.abitoForm.patchValue(abito);
          this.gestisciCampiPerTipo(abito.tipo);
        },
        error: (err) => console.error('Errore caricando abito', err)
      });
    } else if (this.tipoSelezionato) {
      // nuova creazione con tipo preimpostato
      this.abitoForm.patchValue({ tipo: this.tipoSelezionato });
      this.gestisciCampiPerTipo(this.tipoSelezionato);
    }
  }

  gestisciCampiPerTipo(tipo: string): void {
    // CAMICIA
    if (tipo === 'CAMICIA') {
      this.abitoForm.get('lunghezzaManica')?.enable();
      this.abitoForm.get('fit')?.disable();
      this.abitoForm.get('materiale')?.enable();
    }

    // PANTALONE
    else if (tipo === 'PANTALONE') {
      this.abitoForm.get('lunghezzaManica')?.disable();
      this.abitoForm.get('fit')?.enable();
      this.abitoForm.get('materiale')?.enable();
    }

    // MAGLIONE
    else if (tipo === 'MAGLIONE') {
      this.abitoForm.get('lunghezzaManica')?.disable();
      this.abitoForm.get('fit')?.disable();
      this.abitoForm.get('materiale')?.enable();
    }

      // GIACCA
    else if (tipo === 'GIACCA') {
      this.abitoForm.get('lunghezzaManica')?.disable();
      this.abitoForm.get('fit')?.disable();
      this.abitoForm.get('materiale')?.enable();
    }

    // ALTRI TIPI
    else {
      this.abitoForm.get('lunghezzaManica')?.disable();
      this.abitoForm.get('fit')?.disable();
      this.abitoForm.get('materiale')?.disable();
    }
  }

  initForm(): void {
    this.abitoForm = this.fb.group({
      tipo: ['', Validators.required],
      marca: ['', Validators.required],
      taglia: ['', Validators.required],
      prezzo: [0, [Validators.required, Validators.min(0)]],
      lunghezzaManica: [''],
      materiale: [''],
      fit: ['']
    });
  }

  onSubmit(): void {
    if (this.abitoForm.invalid) {
      this.abitoForm.markAllAsTouched();
      return;
    }

    const abito: Abito = this.abitoForm.value;

    if (this.isEdit && this.idAbito) {
      this.abitoService.update(this.idAbito, abito).subscribe({
        next: () => {
          alert('Abito aggiornato con successo');
          this.router.navigate(['/abiti', abito.tipo]);
        },
        error: err => console.error('Errore update', err)
      });
    } else {
      this.abitoService.create(abito).subscribe({
        next: () => {
          alert('Abito creato con successo');
          this.router.navigate(['/abiti', abito.tipo]);
        },
        error: err => console.error('Errore create', err)
      });
    }
  }

  annulla(): void {
    if (this.tipoSelezionato) {
      this.router.navigate(['/abiti', this.tipoSelezionato]);
    } else {
      this.router.navigate(['/']);
    }
  }
}