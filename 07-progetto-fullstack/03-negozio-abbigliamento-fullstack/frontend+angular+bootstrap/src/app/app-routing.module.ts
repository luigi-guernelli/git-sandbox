import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CategorieComponent } from './components/categorie/categorie.component';
import { AbitiListComponent } from './components/abiti-list/abiti-list.component';
import { AbitoFormComponent } from './components/abito-form/abito-form.component';

const routes: Routes = [
  { path: '', component: CategorieComponent },                               // home categorie
  { path: 'abiti/:tipo', component: AbitiListComponent },                   // lista abiti per tipo
  { path: 'abiti/nuovo/:tipo', component: AbitoFormComponent },            // crea nuovo abito per tipo
  { path: 'abiti/modifica/:id', component: AbitoFormComponent },           // modifica abito
  { path: '**', redirectTo: '' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
