import { Component, OnInit } from '@angular/core';
import { Injectable } from '@angular/core';
import { StoreServerService } from './storeserver.service';
import 'rxjs/add/operator/toPromise';
import { IStore } from './store';

@Component({
  selector: 'app-storeserver',
  templateUrl: './storeserver.component.html',
  styleUrls: ['./storeserver.component.css']
})
export class StoreserverComponent implements OnInit {

  constructor(private storeserverservice: StoreServerService) { }
  stores: IStore[] = [];
  errorMessage: string;

  ngOnInit(): void {
    this.storeserverservice.getStoreServers()
      .subscribe(stores => this.stores = stores);
    console.log(this.stores);
  }

  addStore(store: IStore): void {
    this.storeserverservice.addStore(store)
      .subscribe();
  }
}
