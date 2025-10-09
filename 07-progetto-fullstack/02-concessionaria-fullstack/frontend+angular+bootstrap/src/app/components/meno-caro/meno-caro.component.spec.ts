import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MenoCaroComponent } from './meno-caro.component';

describe('MenoCaroComponent', () => {
  let component: MenoCaroComponent;
  let fixture: ComponentFixture<MenoCaroComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MenoCaroComponent]
    });
    fixture = TestBed.createComponent(MenoCaroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
