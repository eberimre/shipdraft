import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AddPersonComponent} from "./components/add-person/add-person.component";
import {PeopleListComponent} from "./components/people-list/people-list.component";
import {ParticipantListComponent} from "./components/participant-list/participant-list.component";

const routes: Routes = [
  {path: 'add-person', component : AddPersonComponent},
  {path: 'list-people', component : PeopleListComponent},
  {path: 'list-participants', component : ParticipantListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
