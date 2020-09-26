import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { PokedexComponent } from './pokedex/pokedex.component';
import { PokeDetailsComponent } from './poke-details/poke-details.component';
import { PokemonService } from './pokedex/pokemon.service';
import { PokeformComponent } from './pokeform/pokeform.component';
import { AppRoutingModule } from './app-router.module';
import { PokeDetailsService } from './poke-details/poke-details.service';

@NgModule({
  declarations: [
    AppComponent,
    PokedexComponent,
    PokeDetailsComponent,
    PokeformComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    AppRoutingModule
  ],
  providers: [PokemonService,
              PokeDetailsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
