import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrezzoMedioComponent } from './prezzo-medio.component';

describe('PrezzoMedioComponent', () => {
  let component: PrezzoMedioComponent;
  let fixture: ComponentFixture<PrezzoMedioComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PrezzoMedioComponent]
    });
    fixture = TestBed.createComponent(PrezzoMedioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
