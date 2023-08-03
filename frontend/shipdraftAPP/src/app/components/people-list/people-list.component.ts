import {Component, NgIterable} from '@angular/core';
import {PersonDataModel} from "../../models/person-data-model";
import {PersonService} from "../../services/person.service";
import {Router} from "@angular/router";
import {ParticipantService} from "../../services/participant.service";
import {ParticipantDataModel} from "../../models/participant-data-model";

@Component({
  selector: 'app-people',
  templateUrl: './people-list.component.html',
  styleUrls: ['./people-list.component.css']
})
export class PeopleListComponent {

  peopleData!: PersonDataModel[];
  personData!: ParticipantDataModel;

// TODO: isParticipate megjelenése ikonnal
  constructor(private personService: PersonService,
              private participantService: ParticipantService,
              private router: Router) {
    this.personService.getAllPeople().subscribe({
      next: (data) => this.peopleData = data,
      error: (err) => console.log(err),
      complete: () => console.log(this.peopleData)
    })
  }

  ngOnInit() {
    this.fetchPeople();
  }

  fetchPeople() {
    this.personService.getAllPeople().subscribe((peopleData: PersonDataModel[]) => {
      this.peopleData = peopleData;
    });
  };

  deletePerson(id: number) {
    this.personService.deletePerson(id).subscribe(
      (response: PersonDataModel[]) => {
        this.peopleData = response;
        this.fetchPeople()
      },
      error => console.warn(error),
    );
  }

  // editParticipantData(id: number) {
  //   this.participantService.editParticipantData(id).subscribe({
  //     next: (personData) => {
  //       this.personData = personData;
  //     },
  //     error: (err) => console.log(err),
  //     complete: () => console.log(this.personData)
  //   })
  // }

  switchToEditParticipantData(id: number) {
    localStorage.setItem('id', String(id))
    this.router.navigate(['edit-participant-data']);
  }

}
