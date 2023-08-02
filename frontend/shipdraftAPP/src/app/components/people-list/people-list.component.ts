import {Component, NgIterable} from '@angular/core';
import {PersonDataModel} from "../../models/person-data-model";
import {PersonService} from "../../services/person.service";

@Component({
  selector: 'app-people',
  templateUrl: './people-list.component.html',
  styleUrls: ['./people-list.component.css']
})
export class PeopleListComponent {

  personData!: PersonDataModel[];
// TODO: isParticipate megjelenése ikonnal
  constructor(private personService: PersonService) {
    this.personService.getAllPeople().subscribe({
      next: (data) => this.personData = data,
      error: (err) => console.log(err),
      complete: () => console.log(this.personData)
    })
  }

}
