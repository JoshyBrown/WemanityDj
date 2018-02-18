import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

import { Utilisateur } from '../model/utilisateur';
import * as CONST from '../constants';

@Injectable()
export class HomeService {

  private utilisateur_url: string = CONST.REST_HOST + '/utilisateurs';

  constructor(private http: HttpClient) { }

  getUtilisateurs(): Observable<Utilisateur[]>{
    return this.http.get<Utilisateur[]>(this.utilisateur_url);
  }

  addUtilisateur(utilisateur): Observable<Utilisateur>{
    return this.http.post<Utilisateur>(this.utilisateur_url, utilisateur);
  }

  updateUtilisateur(utilisateur): Observable<Utilisateur>{
    return this.http.put<Utilisateur>(this.utilisateur_url, utilisateur);
  }

  deleteUtilisateur(id): Observable<any>{
    return this.http.delete(this.utilisateur_url + '/' + id);
  }

}
