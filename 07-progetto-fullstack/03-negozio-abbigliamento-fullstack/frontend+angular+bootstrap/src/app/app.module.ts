import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CategorieComponent } from './components/categorie/categorie.component';
import { AbitiListComponent } from './components/abiti-list/abiti-list.component';
import { AbitoFormComponent } from './components/abito-form/abito-form.component';

@NgModule({
  declarations: [
    AppComponent,
    CategorieComponent,
    AbitiListComponent,
    AbitoFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
