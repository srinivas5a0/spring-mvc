import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { IStore } from './store';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/do';
import { Promise } from 'q';


@Injectable()
export class StoreServerService {
  constructor(private http: HttpClient) {
  }
  private _options = { headers: new HttpHeaders({ 'Content-Type': 'application/json' }) };
   // private headers = new Headers({ 'Content-Type': 'application/json' });
  getStoreServers(): Observable<IStore[]> {
    return this.http.get<IStore[]>('/api/v1/stores/')
      .do(data => console.log(JSON.stringify(data)))
      .catch(this.handleError);
  }

  private handleError(err: HttpErrorResponse) {
    console.log(err.message);
    return Observable.throw(err.message);
  }

  addStore (store: IStore): Observable<IStore> {
    return this.http.post<IStore>('/api/v1/stores/', store, httpOptions);
  }
}

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};
