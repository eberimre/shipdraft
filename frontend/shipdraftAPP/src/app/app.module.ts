import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { PeopleListComponent } from './components/people-list/people-list.component';
import { AddPersonComponent } from './components/add-person/add-person.component';
import {HttpClientModule} from "@angular/common/http";
import {ReactiveFormsModule} from "@angular/forms";
import { ParticipantListComponent } from './components/participant-list/participant-list.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    PeopleListComponent,
    AddPersonComponent,
    ParticipantListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
