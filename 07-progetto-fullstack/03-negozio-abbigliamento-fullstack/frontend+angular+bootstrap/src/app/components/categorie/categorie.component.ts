import { Component } from '@angular/core';

@Component({
  selector: 'app-categorie',
  templateUrl: './categorie.component.html'
})
export class CategorieComponent {
  categorie = [
    { code: 'PANTALONE', label: 'Pantaloni' },
    { code: 'CAMICIA', label: 'Camicie' },
    { code: 'MAGLIONE', label: 'Maglioni' },
    { code: 'GIACCA', label: 'Giacche' }

  ];
}
