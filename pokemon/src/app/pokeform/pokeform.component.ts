import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators} from '@Angular/forms';

@Component({
  selector: 'app-pokeform',
  templateUrl: './pokeform.component.html',
  styleUrls: ['./pokeform.component.css']
})
export class PokeformComponent implements OnInit {

  pokeForm:FormGroup;

  constructor(private fb:FormBuilder) { }

  ngOnInit(): void {
    this.pokeForm = this.fb.group({
      pokeId:['',[Validators.required, Validators.maxLength(4)]],
      pokeName: ['', [Validators.required]],
      pokeImg: ['', [Validators.required]],
      pokeType: ['', [Validators.required]]
    });
  } 

}
