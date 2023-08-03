import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {ParticipantDataModel} from "../models/participant-data-model";
import {ParticipantFormDataModel} from "../models/participant-form-data-model";
import {AccommodationTypeOptionModel} from "../models/accommodation-type-option-model";
import {PositionTypeOptionModel} from "../models/position-type-option-model";
import {BoatTypeOptionModel} from "../models/boat-type-option-model";

const BASE_URL = 'http://localhost:8080/api/participant';

@Injectable({
  providedIn: 'root'
})
export class ParticipantService {

  constructor(private Http: HttpClient) {
  }

  getAllParticipants(): Observable<ParticipantDataModel[]> {
    return this.Http.get<ParticipantDataModel[]>(BASE_URL);
  }

  loadParticipantData(id: number): Observable<ParticipantDataModel> {
    return this.Http.get<ParticipantDataModel>(BASE_URL + '/' + id);
  }

  updateParticipantData(data: Observable<ParticipantDataModel>) {
    return this.Http.put<ParticipantDataModel>(BASE_URL, data);
  }

  loadParticipantFormData(): Observable <ParticipantFormDataModel> {
    return this.Http.get<ParticipantFormDataModel>(BASE_URL + '/' + 'formData');
  }

  loadParticipantFormAccommodationData(): Observable<Array<AccommodationTypeOptionModel>> {
    return this.Http.get<Array<AccommodationTypeOptionModel>>(BASE_URL + '/' + 'formData/accommodation');
  }
  loadParticipantFormBoatData(): Observable <Array<BoatTypeOptionModel>> {
    return this.Http.get<Array<BoatTypeOptionModel>>(BASE_URL + '/' + 'formData/boat');
  }
  loadParticipantFormPositionData(): Observable<Array<PositionTypeOptionModel>> {
    return this.Http.get<Array<PositionTypeOptionModel>>(BASE_URL + '/' + 'formData/position');
  }
}
