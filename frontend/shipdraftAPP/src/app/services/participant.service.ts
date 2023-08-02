import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {PersonDataModel} from "../models/person-data-model";
import {ParticipantDataModel} from "../models/participant-data-model";

const BASE_URL = 'http://localhost:8080/api/participant';

@Injectable({
  providedIn: 'root'
})
export class ParticipantService {

  constructor(private Http: HttpClient) { }

  getAllParticipants(): Observable<ParticipantDataModel[]> {
    return this.Http.get<ParticipantDataModel[]>(BASE_URL);
  }

}
