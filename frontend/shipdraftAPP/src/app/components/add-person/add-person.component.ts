import { Component } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {PersonService} from "../../services/person.service";
import {RegistrationDataModel} from "../../models/registration-data-model";

@Component({
  selector: 'app-add-person',
  templateUrl: './add-person.component.html',
  styleUrls: ['./add-person.component.css']
})
export class AddPersonComponent {

  registrationForm: FormGroup;

  constructor(private formBuilder: FormBuilder,
              private personService: PersonService) {
    this.registrationForm = this.formBuilder.group({
      name: ['', Validators.required],
      yearOfBirth: ['', [Validators.required, Validators.minLength(4)]],
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
      complete: () => {console.log('Account has been registered.')}
    })
  }

}
