import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CouponApp1Component } from './coupon-app1.component';

describe('CouponApp1Component', () => {
  let component: CouponApp1Component;
  let fixture: ComponentFixture<CouponApp1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CouponApp1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CouponApp1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
