import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PokeDetailsComponent } from './poke-details/poke-details.component';
import { PokedexComponent } from './pokedex/pokedex.component';
import { PokeformComponent } from './pokeform/pokeform.component';


const routes:Routes = [
    {path: 'pokedex', component:PokedexComponent},
    {path: 'pokemonDetail/:pokeId', component:PokeDetailsComponent},
    {path: 'pokeForm', component:PokeformComponent},
    {path: '**', redirectTo:'/pokedex',  pathMatch: 'full'}
]

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }