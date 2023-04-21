import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CareerComponentComponent } from './career-component.component';

describe('CareerComponentComponent', () => {
  let component: CareerComponentComponent;
  let fixture: ComponentFixture<CareerComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CareerComponentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CareerComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
