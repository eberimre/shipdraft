import { Component } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {PersonService} from "../../services/person.service";
import {RegistrationDataModel} from "../../models/registration-data-model";
import {Router} from "@angular/router";

@Component({
  selector: 'app-add-person',
  templateUrl: './add-person.component.html',
  styleUrls: ['./add-person.component.css']
})
export class AddPersonComponent {

  registrationForm: FormGroup;
  recentYear: number = new Date().getFullYear();


  constructor(private formBuilder: FormBuilder,
              private personService: PersonService,
              private router: Router) {
    this.registrationForm = this.formBuilder.group({
      name: ['', Validators.required],
      yearOfBirth: ['', [Validators.required, Validators.min(1920), Validators.max(this.recentYear)]],
      gender: ['', [Validators.required]],
    });
  }

  register() {
    const data: RegistrationDataModel = {...this.registrationForm.value};
    this.personService.registerPerson(data).subscribe({
      next: value => {
        this.registrationForm.reset();
        localStorage.setItem('auth', 'true');
      },
      error: error => {
        console.log(error);
        // validationHandler(error, this.registrationForm)
      },
      complete: () => {console.log('Account has been registered.');
      this.router.navigate(['list-people'])}
    })
  }

}
