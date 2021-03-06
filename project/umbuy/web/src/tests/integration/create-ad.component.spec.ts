import { async, ComponentFixture, TestBed, tick, fakeAsync } from '@angular/core/testing';

import { CreateAdComponent } from '../../app/business/components/create-ad.component';
import { Observable } from 'rxjs';
import { By } from '@angular/platform-browser';
import 'rxjs/add/observable/from';
import 'rxjs/add/observable/empty';
import 'rxjs/add/observable/throw';
import { Advertisement } from '../../app/data_model/advertisement';
import { User } from '../../app/data_model/user';
import { HttpClient } from '@angular/common/http';
import { HttpHandler } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { Router } from '@angular/router';
import { AdvertisementService } from '../../app/business/services/advertisement.service';
import { RouterTestingModule } from '@angular/router/testing';
import { debug } from 'util';
import { AuthService } from '../../app/business/services/auth.service';
import { Location } from '@angular/common';

// fake router
class RouterStub {
  navigate(params){
  }
}

describe('CreateAdComponent Integration Tests', () => {
  let component: CreateAdComponent;
  let fixture: ComponentFixture<CreateAdComponent>;
  let router: Router;
  let advertisementService: AdvertisementService;
  let authService: AuthService;
  let newAd;
  let location: Location;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [RouterModule, FormsModule, RouterTestingModule],
      declarations: [ CreateAdComponent ],
      providers: [AdvertisementService, AuthService, Location, User, Advertisement, HttpClient, HttpHandler,
        { provide: Router, useClass: RouterStub}
      ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateAdComponent);
    advertisementService = TestBed.get(AdvertisementService);
    router = TestBed.get(Router);
    authService = TestBed.get(AuthService);
    location = TestBed.get(Location);
    component = fixture.componentInstance;

    newAd = { 
      userId: 'auth0|5a8cfd24f5c8213cb27d5ec2', 
      title: 'test', 
      description: 'test', 
      price: 23.14,
      imageUrl: 'https://s3.amazonaws.com/kyleteam6best/default.jpg',
      category: ' test'
    };
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
  
  it('should redirect the user back to the home page after validating advertisement', () => {
    let spy = spyOn(location, 'back');

    component.backToHomePage();

    expect(spy).toHaveBeenCalled();
    
  });

  it('should create the ad and return from the server', () => {
    // arrange
    let spy = spyOn(advertisementService, 'createAd').and.returnValue( Observable.from([newAd]));

    // act
    component.createAd();

    // assert
    expect(component.res).toBe(newAd);
  });
  
  it('should set the message property if server returns an error when adding a new advertisement', () => {
    let error = 'error from the server'
    // arrange
    let spy = spyOn(advertisementService, 'createAd').and.returnValue( Observable.throw(error)); 

    // act
    component.createAd();

    // assert
    expect(component.error).toBe(error);
  });
  
});
