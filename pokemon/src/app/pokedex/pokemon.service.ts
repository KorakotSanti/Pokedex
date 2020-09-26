import { Pokemon } from '../pokemon';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable()
export class PokemonService {
    
    constructor(private httpClient:HttpClient){}

    getAllPokemon():Observable<any> {
        const URI = environment.PokemonAPI + '/getAllPokemons';
        return this.httpClient.get<any>(URI);
    }
}