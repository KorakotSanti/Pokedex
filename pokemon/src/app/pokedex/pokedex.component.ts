import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
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

  constructor(private pokemonService:PokemonService,
              private router:Router) { }

  ngOnInit(): void {
    this.pokemonService.getAllPokemon().subscribe(
      res=>this.pokemonList=res,
      err=>{this.errorMessage="THIS IS NOT DIGIMON"
            console.log("error");});
  }

  setPokemonInfo(p:Pokemon){
    this.router.navigateByUrl('/pokemonDetail/'+p.pokeId);
  }
}
