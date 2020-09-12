import { Pokemon } from './pokemon';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class PokemonService {
    
    constructor(private httpClient:HttpClient){}

    getAllPokemon():Observable<any> {
        const URI = "./assets/data.json";
        return this.httpClient.get(URI);
    }
}