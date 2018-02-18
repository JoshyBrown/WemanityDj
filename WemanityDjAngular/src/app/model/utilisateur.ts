import {Loisir} from './loisir';

export class Utilisateur {
    nom: string;
    prenom: string;
    loisir: Loisir;

    constructor() {
        this.loisir = new Loisir();
    }

}
