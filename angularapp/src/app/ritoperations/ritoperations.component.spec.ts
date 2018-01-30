import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RitoperationsComponent } from './ritoperations.component';

describe('RitoperationsComponent', () => {
  let component: RitoperationsComponent;
  let fixture: ComponentFixture<RitoperationsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RitoperationsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RitoperationsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
