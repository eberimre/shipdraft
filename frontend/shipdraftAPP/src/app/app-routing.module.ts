import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AddPersonComponent} from "./components/add-person/add-person.component";
import {PeopleListComponent} from "./components/people-list/people-list.component";
import {ParticipantListComponent} from "./components/participant-list/participant-list.component";
import {ParticipantDataComponent} from "./components/participant-data/participant-data.component";
import {ContactDataFormComponent} from "./components/contact-data-form/contact-data-form.component";

const routes: Routes = [
  {path: 'add-person', component : AddPersonComponent},
  {path: 'list-people', component : PeopleListComponent},
  {path: 'list-participants', component : ParticipantListComponent},
  {path: 'edit-participant-data', component : ParticipantDataComponent},
  {path: 'contact-data-form', component : ContactDataFormComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
