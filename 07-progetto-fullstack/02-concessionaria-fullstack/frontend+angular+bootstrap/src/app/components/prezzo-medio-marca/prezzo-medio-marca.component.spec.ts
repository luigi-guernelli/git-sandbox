import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrezzoMedioMarcaComponent } from './prezzo-medio-marca.component';

describe('PrezzoMedioMarcaComponent', () => {
  let component: PrezzoMedioMarcaComponent;
  let fixture: ComponentFixture<PrezzoMedioMarcaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PrezzoMedioMarcaComponent]
    });
    fixture = TestBed.createComponent(PrezzoMedioMarcaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
