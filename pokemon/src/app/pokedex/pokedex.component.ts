import { Component, OnInit } from '@angular/core';
import { Pokemon } from '../pokemon';
import { PokemonService } from './pokemon.service';

@Component({
  selector: 'app-pokedex',
  templateUrl: './pokedex.component.html',
  styleUrls: ['./pokedex.component.css']
})
export class PokedexComponent implements OnInit {

  errorMessage:string;
  pokemonList:Pokemon[];
  pokemonInfo:Pokemon;

  setPokemonInfo(p:Pokemon){
    this.pokemonInfo = p;
  }

  constructor(private pokemonService:PokemonService) { }

  ngOnInit(): void {
    this.pokemonService.getAllPokemon().subscribe(
      res=>this.pokemonList=res,
      err=>{this.errorMessage="THIS IS NOT DIGIMON"
            console.log("error");});
  }

}
