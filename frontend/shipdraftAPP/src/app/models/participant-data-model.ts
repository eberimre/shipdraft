import {AttendanceDataModel} from "./attendance-data-model";
import {PersonDataModel} from "./person-data-model";

export interface ParticipantDataModel {
  id: number;
  person: PersonDataModel;
  attendance: AttendanceDataModel;
  boatType: string;
  position: string;
  questions: string;
  remarks: string;
  accommodationType: string;

}
