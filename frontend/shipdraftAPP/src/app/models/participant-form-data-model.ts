import {AccommodationTypeOptionModel} from "./accommodation-type-option-model";
import {BoatTypeOptionModel} from "./boat-type-option-model";
import {PositionTypeOptionModel} from "./position-type-option-model";

export interface ParticipantFormDataModel{

  accommodationTypeOptions: Array<AccommodationTypeOptionModel>;
  boatTypeOptions: Array<BoatTypeOptionModel>;
  positionTypeOptions: Array<PositionTypeOptionModel>;
}
