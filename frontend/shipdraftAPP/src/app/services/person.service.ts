import {Injectable, NgIterable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {PersonDataModel} from "../models/person-data-model";
import {RegistrationDataModel} from "../models/registration-data-model";

const BASE_URL = 'http://localhost:8080/api/person';

@Injectable({
  providedIn: 'root'
})
export class PersonService {

  constructor(private Http: HttpClient) { }
    getAllPeople(): Observable<PersonDataModel[]> {
        return this.Http.get<PersonDataModel[]>(BASE_URL);
    }

    registerPerson(person: RegistrationDataModel): Observable<any> {
        return this.Http.post(BASE_URL, person);
    }

  deletePerson(id: number): Observable<any> {
    return this.Http.delete(BASE_URL+ '/' + id);
  }

  editPersonData(id: number):Observable<PersonDataModel> {
    return this.Http.get<PersonDataModel>(BASE_URL+ '/' + id);
  }
}
