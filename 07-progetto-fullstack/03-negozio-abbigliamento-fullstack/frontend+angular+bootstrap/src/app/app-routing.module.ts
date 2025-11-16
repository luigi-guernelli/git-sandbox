import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CategorieComponent } from './components/categorie/categorie.component';
import { AbitiListComponent } from './components/abiti-list/abiti-list.component';

const routes: Routes = [
  { path: '', component: CategorieComponent },
  { path: 'abiti/:tipo', component: AbitiListComponent },
  { path: '**', redirectTo: '' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
