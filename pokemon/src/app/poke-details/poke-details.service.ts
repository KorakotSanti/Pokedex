import { HttpClient } from '@angular/common/http';
import { Injectable } from "@angular/core";
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable()
export class PokeDetailsService {

    constructor(private http:HttpClient) {}

    getPokemonDetails(pokeId:string): Observable<any>{
        const URI = environment.PokemonAPI+"/getPokemon/"+pokeId;
        return this.http.get<any>(URI);
    }
}