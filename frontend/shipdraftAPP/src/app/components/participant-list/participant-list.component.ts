import { Component } from '@angular/core';
import {ParticipantDataModel} from "../../models/participant-data-model";
import {ParticipantService} from "../../services/participant.service";
import {Time} from "@angular/common";

@Component({
  selector: 'app-participant-list',
  templateUrl: './participant-list.component.html',
  styleUrls: ['./participant-list.component.css']
})
export class ParticipantListComponent {
  participantData!: ParticipantDataModel[];

  constructor(private participantService: ParticipantService) {
    this.participantService.getAllParticipants().subscribe({
      next: data => {
        this.participantData = data;
      },
      error: err => console.log(err),
      complete: () => {}
    })
  }

  formatDate(data: string) {
    return new Date(data).toLocaleDateString();
  }

}
