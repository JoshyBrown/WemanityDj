import { Component, OnInit } from '@angular/core';
import { Utilisateur } from '../model/utilisateur';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  currentUser = new Utilisateur();

  constructor() { }

  ngOnInit() {
    console.log('home fonctionne');
    this.currentUser = JSON.parse(localStorage.getItem('currentUser'));
  }

}
