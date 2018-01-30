import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StoreserverComponent } from './storeserver.component';

describe('StoreserverComponent', () => {
  let component: StoreserverComponent;
  let fixture: ComponentFixture<StoreserverComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StoreserverComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StoreserverComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
