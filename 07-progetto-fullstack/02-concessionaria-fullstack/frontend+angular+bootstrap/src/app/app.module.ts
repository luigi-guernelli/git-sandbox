import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HomeComponent } from './components/home/home.component';
import { CategorieComponent } from './components/categorie/categorie.component';
import { ListaVeicoliComponent } from './components/lista-veicoli/lista-veicoli.component';
import { FooterComponent } from './components/footer/footer.component';
import { FormsModule } from '@angular/forms';
import { PrezzoMedioComponent } from './components/prezzo-medio/prezzo-medio.component';
import { MenoCaroComponent } from './components/meno-caro/meno-caro.component';
import { PrezzoMedioMarcaComponent } from './components/prezzo-medio-marca/prezzo-medio-marca.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    CategorieComponent,
    ListaVeicoliComponent,
    FooterComponent,
    PrezzoMedioComponent,
    MenoCaroComponent,
    PrezzoMedioMarcaComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    HttpClientModule,
    FormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
