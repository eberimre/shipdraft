import {ContactDataModel} from "./contact-data-model";

export interface PersonDataModel {

  id: number;
  name: string;
  yearOfBirth: number;
  gender: string;
  contactData: ContactDataModel;
  isParticipate: boolean;
}

