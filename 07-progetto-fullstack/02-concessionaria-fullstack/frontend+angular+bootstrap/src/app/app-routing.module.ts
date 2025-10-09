import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { ListaVeicoliComponent } from './components/lista-veicoli/lista-veicoli.component';
import { PrezzoMedioComponent } from './components/prezzo-medio/prezzo-medio.component';
import { MenoCaroComponent } from './components/meno-caro/meno-caro.component';
import { PrezzoMedioMarcaComponent } from './components/prezzo-medio-marca/prezzo-medio-marca.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'categoria/:tipo', component: ListaVeicoliComponent },
  { path: 'prezzo-medio', component: PrezzoMedioComponent },
  { path: 'prezzo-medio-marca', component: PrezzoMedioMarcaComponent },
  { path: 'meno-caro', component: MenoCaroComponent },
  { path: '**', redirectTo: '' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
